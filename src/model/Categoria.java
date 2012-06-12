/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import dados.DBCategoria;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Categoria {
 
	private String nome;
	 
	private int idCategoria;
	 
	private ArrayList<Item> itens;
	 
	private ConfiguracaoSistema configuracaoSistema;
	 
	public Categoria() {}
	 
        
	public void inserirCategoria() {
	 
	}
	 
	public void editarCategoria(Categoria categoria) {
	 
	}
	 
	public boolean deletarCategoria(Categoria categoria) {
		return false;
	}
	 
	public ArrayList<Categoria> listarCategorias() {
		
            DBCategoria dbCategoria = new DBCategoria();
            
            ArrayList<Categoria> categorias = new ArrayList<Categoria>();
            
            dbCategoria.select("*", " order by nome asc");
            
            try {
                while( dbCategoria.getResultSet().next() ){
                       
                       
                       Categoria categoria = new Categoria();
                       categoria.setIdCategoria( Integer.parseInt( dbCategoria.getResultSet().getString("idcategoria") ) );
                       categoria.setNome(dbCategoria.getResultSet().getString("nome"));
                       
                       

                       //adiciona o item a lista de categorias do retorno
                       categorias.add( categoria );
                 }
                
            } catch (SQLException ex) {
                Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
            return categorias;
            
            
	}

        
	public void setNome(String nome) {
            
            this.nome = nome;
	}
	 
	public String getNome() {
            
	     return this.nome;
	}
	 
	public void setIdCategoria(int id) {
	 
            this.idCategoria = id;
	}
	 
	public int getIdCategoria() {
            
	     return this.idCategoria;
	}
	 
	public void setItem(Item item) {
	 
            this.itens.add( item );
	}
	 
        
        //esse método acho que está errado
	public Item getItem(String numeroRP) {
	
            return null;
	}
        
        
        
	 
}
 
