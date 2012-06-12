package dados;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DBLocalizacao extends DML {

    
    ConectaBD conectaDB;
    ResultSet resultSet = null;
    
    private static final String tabela = "localizacao";
    
    public DBLocalizacao(){
    
        conectaDB = new ConectaBD();
    }
   
    
    @Override
    public void select(String coluna,String parametro){	
        
          String tabela = this.tabela;
                try{
                        
			resultSet = conectaDB.getStatement().executeQuery("SELECT "+coluna+" FROM "+tabela+" "+parametro );
                        
		}catch(SQLException sqlException){
			
			System.out.printf("\nExceção SQL %s\n ", sqlException.getMessage());
		}
      }
    
    
    
    @Override
    public int totalResultados(ResultSet resultSetParametro){
            
         int contador = 1;
            
         try{
                while ( resultSetParametro.next() ){

                    contador++;
                }

                resultSetParametro.beforeFirst();

                return contador - 1;
                
        }catch(SQLException sqlException){
               
               JOptionPane.showMessageDialog(null, "Exceção SQL  "+ sqlException.getMessage());    
	       //System.out.printf("\nExceção SQL %s\n ", sqlException.getMessage());
	}
         return 0;
         
      }
	
    
    @Override
    public void insert(String colunas, String valores){
		
           String tabela = this.tabela;
		try{  
                        String query = "INSERT INTO "+tabela+"("+colunas+") VALUES ("+valores+")";
			
                        if( conectaDB.getStatement().executeUpdate(query) == 0 ){
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
        

        
    @Override
    public void update(String colunasValores, int idParametro){
		
                String tabela = this.tabela;
                PreparedStatement pstmt = null;
		
		try{
                        
			String query = "UPDATE "+tabela+" SET "+colunasValores+" WHERE idlocalizacao = "+idParametro+"";
                        
                        if( conectaDB.getStatement().executeUpdate(query) == 0 ){
			
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
 
       
         
    @Override
    public void delete(int id){
            
                String tabela = this.tabela;
            
		try{
			int retornoQuery = conectaDB.getStatement().executeUpdate("DELETE FROM "+tabela+" WHERE idlocalizacao = "+ id +"" );
			
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
	
	
    @Override
    public void closedConnection(){
		
                try{
		
                        conectaDB.getConnection().close();
			
                        if( conectaDB.getConnection().isClosed() )
			    System.out.println("Conexão fechada com sucesso");
			else
			    System.err.println("Ocorreram problemas ao tentar fechar a conexão");

		}catch(Exception exception){
                    
                    System.err.println("Ocorreram problemas ao tentar fechar a conexão, "+exception);
		}
     }
    
    
    @Override
     public ResultSet getResultSet(){
            
            return this.resultSet;
     }
    
    
    
    
}
