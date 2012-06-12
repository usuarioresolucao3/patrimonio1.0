package dados;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.io.*;
import java.net.*;
import java.lang.*;
import javax.swing.JOptionPane;


public class ConectaBD {
	
      
    
       //CONFIGURAÇÕES SERVIDOR LOCAL
        private static final String bancoDados = "jdbc:mysql://localhost/resolucao3";
	private static final String usuario = "root";
	private static final String senha = "";
      

    
        //CONFIGURAÇÕES SERVIDOR TECLA
/*
        private static final String bancoDados = "jdbc:mysql://mysql04.bighost.com.br/mvfesta_patrimonio";
	private static final String usuario = "mvfesta_patadmin";
	private static final String senha = "patadmin1020";
*/        
        
	private Connection connection  = null;          // gerencia a conexão
	Statement statement = null;		// instrução de consulta
	ResultSet resultSet = null;	// gerencia resultados
        
	//PreparedStatement preparedStatement = null;
	
	public ConectaBD(){

		try {
			connection = DriverManager.getConnection(this.bancoDados, this.usuario, this.senha);
			statement = connection.createStatement();
                        
                        //preparedStatement = (PreparedStatement) connection.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

        public Connection getConnection() {
            return connection;
        }

        public void setConnection(Connection connection) {
            this.connection = connection;
        }
        
        
        public Statement getStatement(){
            
            return statement;
        }
        
        
        public ResultSet getResultSet(){
        
            return this.resultSet;
        }
        

        

 
	
}