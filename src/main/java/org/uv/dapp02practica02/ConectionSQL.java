package org.uv.dapp02practica02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConectionSQL {
   
    private static ConectionSQL instance = null;
    private Connection con = null;

    private ConectionSQL() {
        try {
            String url = "jdbc:postgresql://localhost:5432/ejemplo";
            con = DriverManager.getConnection(url, "postgres", "postgres");
            System.out.println("Se Conecto....");
        } catch (SQLException ex) {
            Logger.getLogger(ConectionSQL.class.getName()).log(Level.SEVERE, "Error al conectar a la base de datos", ex);
        }
    }

    public static ConectionSQL getInstance() {
        if (instance == null) {
            instance = new ConectionSQL();
        }
        return instance;
    }
    
    public boolean execute(String sql) {
        try (Statement st = con.createStatement()) { 
            return st.execute(sql);
        } catch (SQLException ex) {
            Logger.getLogger(ConectionSQL.class.getName()).log(Level.SEVERE, "Error al ejecutar la consulta", ex);
            return false;
        }
    }

    public Connection getConnection() {
        return con;
    }
}
