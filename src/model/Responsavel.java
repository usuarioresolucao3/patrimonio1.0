/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dados.DBResponsavel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Responsavel {
 
        private int id;
    
	private String nome;
        
        private String cargo;
	 
	private int siape;
	 
	private String telefone;
        
        private String email;
	 
	private ArrayList<Item> itens;
	
	 
	public Responsavel() {}

        
        
	private void inserirResponsavel(String cargo, String siape, String fone, String nome, String email) {
	 
	}
	 
	private boolean alterarResponsavel(Responsavel responsavel) {
		return false;
	}
	 
	private boolean deletarResaponsavel(Responsavel responsavel) {
		return false;
	}
	 
	public ArrayList<Responsavel> listarResponsaveis() {
		
            DBResponsavel dbResponsavel = new DBResponsavel();
            
            ArrayList<Responsavel> responsaveis = new ArrayList<Responsavel>();
            
            dbResponsavel.select("*", " order by nome asc");
            
            try {
                while( dbResponsavel.getResultSet().next() ){
                       
                       Responsavel responsavel = new Responsavel();
                       responsavel.setSiape( Integer.parseInt( dbResponsavel.getResultSet().getString("siape") ) );
                       responsavel.setEmail(dbResponsavel.getResultSet().getString("email"));
                       responsavel.setNome(dbResponsavel.getResultSet().getString("nome"));
                       responsavel.setCargo(dbResponsavel.getResultSet().getString("cargo"));
                       responsavel.setTelefone(dbResponsavel.getResultSet().getString("telefone"));
                       

                       //adiciona o item a lista de fornecedores do retorno
                       responsaveis.add( responsavel );
                 }
                
            } catch (SQLException ex) {
                Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
            return responsaveis;
            
            
	}

    

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the siape
     */
    public int getSiape() {
        return siape;
    }

    /**
     * @param siape the siape to set
     */
    public void setSiape(int siape) {
        this.siape = siape;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * @return the itens
     */
    public ArrayList<Item> getItens() {
        return itens;
    }

    /**
     * @param itens the itens to set
     */
    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
	 
}
 
