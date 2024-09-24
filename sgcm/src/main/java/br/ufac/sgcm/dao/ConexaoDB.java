package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private String usuario = "root";
    private String senha = "root";
    private String url = "jdbc:mysql://localhost/sgcm";
    
    public Connection getConexao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, usuario, senha);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    
}
