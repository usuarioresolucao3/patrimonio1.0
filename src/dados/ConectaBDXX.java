/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;


//importa os demais diretórios


/**
 *
 * @author Ricardo
 */
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




public class ConectaBDXX {
	
      
    
       //CONFIGURAÇÕES SERVIDOR LOCAL
        private static final String bancoDados = "jdbc:mysql://localhost/resolucao3";
	private static final String usuario = "root";
	private static final String senha = "";
      

/*    
        //CONFIGURAÇÕES SERVIDOR TECLA
        private static final String bancoDados = "jdbc:mysql://mysql04.bighost.com.br/mvfesta_patrimonio";
	private static final String usuario = "mvfesta_patadmin";
	private static final String senha = "patadmin1020";
*/        
        
	Connection connection  = null;          // gerencia a conexão
	Statement statement = null;		// instrução de consulta
	public ResultSet resultSet = null;	// gerencia resultados
	
	PreparedStatement pstmt = null;
	
	public ConectaBDXX(){

		try {
			connection = DriverManager.getConnection(this.bancoDados, this.usuario, this.senha);
			statement = connection.createStatement();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	

        public void select(String coluna, String tabela, String parametro){	


            
            

                try{
                    
                        
			resultSet = statement.executeQuery("SELECT "+coluna+" FROM "+tabela+" "+parametro );
                        

                        
		}catch(SQLException sqlException){
			
			System.out.printf("\nExceção SQL %s\n ", sqlException.getMessage());
		}
                


	}
        
        
        public int totalResultados(ResultSet resultSetParametro) throws SQLException{
            
            int contador = 1;
            
            while ( resultSetParametro.next() ){
            
                contador++;
            }

            resultSetParametro.beforeFirst();

            return contador - 1;
        
        }
	
        
        
/*	
	//public void insert(String tabela, String colunas, String valores){
	public void insert(Usuario usuario){
		PreparedStatement pstmt = null;
		
		try{


			String query = "INSERT INTO usuarios VALUES (null, ?, ?)";
			pstmt = connection.prepareStatement(query);

			pstmt.setString(1, usuario.getUsuario());
			pstmt.setString(2, usuario.getSenha());
			
			if( pstmt.execute() ){
				//System.err.println("Erro, ocorreu algum problema ao tentar inserir dados!");
                                JOptionPane.showMessageDialog(null, "Erro, ocorreu algum problema ao tentar inserir dados!");
                        }else{
                                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
				//System.out.println("Dados do objeto inseridos com sucesso!");
                        }	
			
		}catch(SQLException sqlException){
                        JOptionPane.showMessageDialog(null, "Exceção SQL  "+ sqlException.getMessage());    
			//System.out.printf("\nExceção SQL %s\n ", sqlException.getMessage());
		}
	}
*/	
	public void insert(String tabela, String colunas, String valores){
		
		try{

                      
                        String query = "INSERT INTO "+tabela+"("+colunas+") VALUES ("+valores+")";
			
			if( statement.executeUpdate(query) == 0 ){
				//System.err.println("Erro, ocorreu algum problema ao tentar inserir dados!");
                                JOptionPane.showMessageDialog(null, "Erro, ocorreu algum problema ao tentar inserir dados!");
                        }else{
                                //JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
				//System.out.println("Dados do objeto inseridos com sucesso!");
                        }	
			
		}catch(SQLException sqlException){
                        JOptionPane.showMessageDialog(null, "Exceção SQL  "+ sqlException.getMessage());    
			//System.out.printf("\nExceção SQL %s\n ", sqlException.getMessage());
		}
	}
	
        
        

        public void update(String tabela, String colunasValores, int idParametro){
		
                PreparedStatement pstmt = null;
		
		try{
			
                        
			String query = "UPDATE "+tabela+" SET "+colunasValores+" WHERE registro_patrimonial = "+idParametro+"";
                        
                        if( statement.executeUpdate(query) == 0 ){
			
				//System.err.println("Erro, ocorreu algum problema ao tentar atualizar dados!");
                                JOptionPane.showMessageDialog(null, "Erro, ocorreu algum problema ao tentar atualizar dados!");
                        }else{
                                //JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
				//System.out.println("Dados do objeto atualizados com sucesso!");
                        }
		}catch(SQLException sqlException){
			
                        JOptionPane.showMessageDialog(null, "Exceção SQL  "+ sqlException.getMessage());
			//System.out.printf("\nExceção SQL %s\n ", sqlException.getMessage());
		}
	}
        
 /*       
	public void update(Usuario usuario, int idParametro){
		PreparedStatement pstmt = null;
		
		try{

			//String query = "UPDATE pessoa set nome = ?, sexo = ?, idade = ? WHERE 'id = 4'";
			String query = "UPDATE usuarios set usuario = ?, senha = ? WHERE id = "+idParametro+"";
			pstmt = connection.prepareStatement(query);

			pstmt.setString(1, usuario.getUsuario());
			pstmt.setString(2, usuario.getSenha());
			
			
			pstmt.executeUpdate();

			if( pstmt.executeUpdate() == 0){
				//System.err.println("Erro, ocorreu algum problema ao tentar atualizar dados!");
                                JOptionPane.showMessageDialog(null, "Erro, ocorreu algum problema ao tentar atualizar dados!");
                        }else{
                                JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
				//System.out.println("Dados do objeto atualizados com sucesso!");
                        }
		}catch(SQLException sqlException){
			
                        JOptionPane.showMessageDialog(null, "Exceção SQL  "+ sqlException.getMessage());
			//System.out.printf("\nExceção SQL %s\n ", sqlException.getMessage());
		}
	}
*/	
	public void delete(String tabela, int id){
		

		try{
			int retornoQuery = statement.executeUpdate("DELETE FROM "+tabela+" WHERE registro_patrimonial = "+ id +"" );
			
	        if(retornoQuery == 0) {  
	        	System.err.println("Exclusão não foi realizada");  
                        
                        JOptionPane.showMessageDialog(null, "Problema, Exclusão NÃO foi realizada");
	        } else {  
                    
                    //JOptionPane.showMessageDialog(null, "Exclusão realizada com Sucesso!");
	            //System.out.println("Exclusão realizada com Sucesso");  
	        }  
			
		}catch(SQLException sqlException){
			
			System.out.printf("\nExceção SQL %s\n ", sqlException.getMessage());
		}
	}
	
	
	public void closedConnection(){
		try{
			
			resultSet.close();
			statement.close();
			connection.close();
			
			if(connection.isClosed() && statement.isClosed() && connection.isClosed())
				System.out.println("Conexão fechada com sucesso");
			else
				System.err.println("Ocorreu problemas ao tentar fechar a conexão");

		}catch(Exception exception){
			exception.printStackTrace();
		}
	}
        
        public ResultSet getResultSet(){
        
            return this.resultSet;
        }

        
        
     /*   public void setResultSet(ResultSet resultSet){
        
            this.resultSet = resultSet;
        }
     */
        
/*	public void select(String coluna, String tabela, String parametro){	
		try{

			resultSet = statement.executeQuery("SELECT "+coluna+" FROM "+tabela+" "+parametro );
			
			ResultSetMetaData metaData = resultSet.getMetaData();
			int numberOfColuns = metaData.getColumnCount();
			
			for(int i = 1 ; i <= numberOfColuns; i++ ){
				//System.out.printf("%-8s\t",metaData.getColumnName(i));//mostra as colunas existentes na tabela			
			}
			
			System.out.println("\n");

			
			while(resultSet.next()){
				
				for(int i = 1 ; i <= numberOfColuns; i++){
					
					System.out.printf("%-8s \t",resultSet.getObject(i));
				}
				System.out.println();
			}
			
		}catch(SQLException sqlException){
			
			System.out.printf("\nExceção SQL %s\n ", sqlException.getMessage());
		}
	}
*/
        
        
	
}