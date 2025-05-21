/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.concessionaria;

import com.mycompany.concessionaria.config.PostgresConnection;
import static com.mycompany.concessionaria.config.PostgresConnection.getConnection;
import javax.swing.JOptionPane;
import com.mycompany.concessionaria.view.TelaLogin;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class Concessionaria {

    public static void main(String[] args) throws SQLException {
        /* TESTAR CONEXÃO BANCO DE DADOS*/
        try (Connection conn = getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("Conexão bem-sucedida!");
            } else {
                System.out.println("Falha na conexão.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        
        //Inicia Sistema
        new TelaLogin().setVisible(true);
    }
}
