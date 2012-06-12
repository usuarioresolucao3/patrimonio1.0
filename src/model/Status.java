/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class Status {
 
        private int id;
    
	private Item item;
	 
	private ConfiguracaoSistema configuracaoSistema;

        
       public Status(){} 
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
     * @return the item
     */
    public Item getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(Item item) {
        this.item = item;
    }

    /**
     * @return the configuracaoSistema
     */
    public ConfiguracaoSistema getConfiguracaoSistema() {
        return configuracaoSistema;
    }

    /**
     * @param configuracaoSistema the configuracaoSistema to set
     */
    public void setConfiguracaoSistema(ConfiguracaoSistema configuracaoSistema) {
        this.configuracaoSistema = configuracaoSistema;
    }
	 
    
    public boolean inserirItem() {
        
        return true;
    }
    
    public boolean editarItem(Status status) {
    
        return true;
    }
    
    public ArrayList<Status> listarItens() { 
    
        return null;
    }
    
    public boolean deletarItem(Status status) {
        
        return true;
    }
	 
    
    
    
}
 
