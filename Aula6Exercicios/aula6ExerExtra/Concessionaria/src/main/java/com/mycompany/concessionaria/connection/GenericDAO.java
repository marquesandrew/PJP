/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria.connection;

/**
 *
 * @author Marcos
 */
import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class GenericDAO<T> {

    private final Class<T> type;

    public GenericDAO(Class<T> type) {
        this.type = type;
    }

    public void insert(String tableName, T entity) throws SQLException {
        Field[] fields = type.getDeclaredFields();
        StringBuilder columns = new StringBuilder();
        StringBuilder placeholders = new StringBuilder();

        for (Field field : fields) {
            if (field.getName().equalsIgnoreCase("id")) {
                continue; // ignora campo id
            }
            columns.append(field.getName()).append(",");
            placeholders.append("?,");
        }

        columns.setLength(columns.length() - 1);
        placeholders.setLength(placeholders.length() - 1);

        String sql = "INSERT INTO " + tableName + " (" + columns + ") VALUES (" + placeholders + ")";

        try (Connection conn = PostgresConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            int index = 1;
            for (Field field : fields) {
                if (field.getName().equalsIgnoreCase("id")) {
                    continue;
                }
                field.setAccessible(true);
                stmt.setObject(index++, field.get(entity));
            }
            stmt.executeUpdate();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Erro ao acessar atributos: " + e.getMessage(), e);
        }
    }

    public void update(String tableName, T entity, int id) throws SQLException {
        Field[] fields = type.getDeclaredFields();
        StringBuilder sql = new StringBuilder("UPDATE " + tableName + " SET ");

        for (Field field : fields) {
            if (field.getName().equalsIgnoreCase("id")) {
                continue;
            }
            sql.append(field.getName()).append(" = ?, ");
        }

        sql.setLength(sql.length() - 2);
        sql.append(" WHERE id = ?");

        try (Connection conn = PostgresConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql.toString())) {
            int index = 1;
            for (Field field : fields) {
                if (field.getName().equalsIgnoreCase("id")) {
                    continue;
                }
                field.setAccessible(true);
                stmt.setObject(index++, field.get(entity));
            }
            stmt.setInt(index, id);
            stmt.executeUpdate();
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Erro ao acessar atributos: " + e.getMessage(), e);
        }
    }

    public void delete(String tableName, int id) throws SQLException {
        String sql = "DELETE FROM " + tableName + " WHERE id = ?";
        try (Connection conn = PostgresConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public List<T> selectAll(String tableName) throws SQLException {
        List<T> result = new ArrayList<>();
        String sql = "SELECT * FROM " + tableName;

        try (Connection conn = PostgresConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            ResultSetMetaData meta = rs.getMetaData();
            Field[] fields = type.getDeclaredFields();

            while (rs.next()) {
                T instance = type.getDeclaredConstructor().newInstance();
                for (int i = 1; i <= meta.getColumnCount(); i++) {
                    String column = meta.getColumnName(i);
                    Object value = rs.getObject(i);
                    for (Field field : fields) {
                        if (field.getName().equalsIgnoreCase(column)) {
                            field.setAccessible(true);
                            // Converte BigDecimal em double se necessário
                            if (field.getType() == double.class && value instanceof java.math.BigDecimal) {
                                field.set(instance, ((java.math.BigDecimal) value).doubleValue());
                            } else {
                                field.set(instance, value);
                            }
                        }
                    }
                }
                result.add(instance);
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar registros: " + e.getMessage(), e);
        }
        return result;
    }
}
