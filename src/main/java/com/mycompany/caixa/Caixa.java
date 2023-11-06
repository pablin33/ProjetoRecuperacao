package com.mycompany.caixa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Caixa {

    public static final String url = "jdbc:mysql://localhost:3306/caixa_supermercado";
    public static final String user = "root";
    public static final String pass = "";
    
    public static Connection createConnection() throws SQLException{
        Connection con = DriverManager.getConnection(url,user,pass);
        return con;
    }

    public static void main(String[] args) throws SQLException {
        Connection con = createConnection();
        if(con!=null){
            con.close();
            JOptionPane.showMessageDialog(null, "sucesso");
        }
    }
}
