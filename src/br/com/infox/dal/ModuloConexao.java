/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;

/**
 *
 * @author Dougla'z
 */
public class ModuloConexao {

    //estabelecer conexao com banco de dados    
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //chamar driver
        String driver = "com.mysql.jdbc.Driver";
        //infromacoes do banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //verificar erro
            //System.out.println(e);
            return null;
        }
    }

}
