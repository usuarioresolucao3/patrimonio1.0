/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dados.DBFornecedor;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Fornecedor {
 
	private int cnpj;
	 
	private String nome;
	 
	private String telefone;
	 
	private String email;
	 
	private String representante;
	 
	private ArrayList itens;
	 
	private Item[] item;
	 
	public Fornecedor() {}
	 
	public int getCnpj() {
		
            return this.cnpj; 
	}
	 
	public void setCnpj(int cnpj) {
	 
            this.cnpj = cnpj;
	}
	 
	public String getNome() {
            
	    return this.nome;
	}
	 
	public void setNome(String nome) {
	 
            this.nome = nome;
	}
	 
	public String geTelefone() {
            
	    return this.telefone;
	}
	 
	public void setFone(String telefone) {
            
            this.telefone = telefone;
	}
	 
	public String getEmail() {
            
	    return this.email;
	}
	 
	public String setEmail(String email) {
            
	     return this.email;
	}
	 
	public String getRepresentante() {
	
            return this.representante;
	}
	 
	public void setRepresentante(String representante) {
		
            this.representante = representante;
	}
	 
	public void inserirFornecedor() {
	 
            
	}
	 
	public void editarFornecedor(Fornecedor fornecedor) {
	 
	}
	 
	public boolean deletarFornecedor(Fornecedor fornecedor) {
		return false;
	}
	 
	public ArrayList<Fornecedor> listarFornecedor() {
		
            DBFornecedor dbFornecedor = new DBFornecedor();
            
            ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
            
            dbFornecedor.select("*", " order by cnpj asc");
            
            try {
                while( dbFornecedor.getResultSet().next() ){
                       
                       Fornecedor fornecedor = new Fornecedor();
                       fornecedor.setCnpj( Integer.parseInt( dbFornecedor.getResultSet().getString("cnpj") ) );
                       fornecedor.setEmail(dbFornecedor.getResultSet().getString("email"));
                       fornecedor.setNome(dbFornecedor.getResultSet().getString("nome"));
                       fornecedor.setFone(dbFornecedor.getResultSet().getString("telefone"));
                       fornecedor.setRepresentante(dbFornecedor.getResultSet().getString("representante"));
                       

                       //adiciona o item a lista de fornecedores do retorno
                       fornecedores.add( fornecedor );
                 }
                
            } catch (SQLException ex) {
                Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
            return fornecedores;
            
            
	}
        
        public Fornecedor getFornecedor(int id){
        
            DBFornecedor dbFornecedor = new DBFornecedor();
            
            
            dbFornecedor.select("*", " WHERE cnpj = "+id);

            int totalResultado = dbFornecedor.totalResultados(dbFornecedor.getResultSet());
            
            System.out.println("TOTAL RESULTADOS: "+totalResultado);
            
            if(totalResultado == 1){
                
                Fornecedor fornecedor = new Fornecedor();
                try {
                    while( dbFornecedor.getResultSet().next() ){

                           fornecedor.setCnpj( Integer.parseInt( dbFornecedor.getResultSet().getString("cnpj") ) );
                           fornecedor.setEmail(dbFornecedor.getResultSet().getString("email"));
                           fornecedor.setNome(dbFornecedor.getResultSet().getString("nome"));
                           fornecedor.setFone(dbFornecedor.getResultSet().getString("telefone"));
                           fornecedor.setRepresentante(dbFornecedor.getResultSet().getString("representante"));
                     }

                } catch (SQLException ex) {
                    Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
                }
                 
                return fornecedor;
                
            }else{
            
                return null;
            }
        }
}
 
