package dados;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public abstract class DML {

    
    private Connection connection  = null; // gerencia a conexão
    Statement          statement = null;   // instrução de consulta
    ResultSet          resultSet = null;   // gerencia resultados
    
    
    ConectaBD conectaDB = new ConectaBD();
    
  
    public abstract void select(String coluna,String parametro);
 
        
    public abstract int totalResultados(ResultSet resultSetParametro);
	
       
    public abstract void insert(String colunas, String valores);	
        
 
    public abstract void update(String colunasValores, int idParametro);
 
        
    public abstract void delete(int id);
	
    
    public abstract ResultSet getResultSet();
     
	
    public abstract void closedConnection();
        
    
    
}
