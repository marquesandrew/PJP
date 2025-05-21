/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.concessionaria;

import com.mycompany.concessionaria.config.PostgresConnection;
import java.sql.Connection;

/**
 *
 * @author Usuario
 */
public class TestaConexao {
    public static void main(String[] args) {
        try (Connection conn = PostgresConnection.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ Conexão estabelecida com sucesso!");
            } else {
                System.out.println("❌ Falha ao conectar.");
            }
        } catch (Exception e) {
            System.out.println("❌ Erro na conexão: " + e.getMessage());
        }
    }
}
