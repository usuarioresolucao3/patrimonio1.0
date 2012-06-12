/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

public class Campus {
 

    private int id;
    
    private Localizacao localizacao;
	 
    private ArrayList<Item> itens;
	 
    private ConfiguracaoSistema configuracaoSistema;
	 
    private ArrayList<Predio> predios;

        
    public Campus() {}

    /**
     * @return the localizacao
     */
    public Localizacao getLocalizacao() {
        return localizacao;
    }

    /**
     * @param localizacao the localizacao to set
     */
    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
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

    /**
     * @return the predios
     */
    public ArrayList<Predio> getPredios() {
        return predios;
    }

    /**
     * @param predios the predios to set
     */
    public void setPredios(ArrayList<Predio> predios) {
        this.predios = predios;
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
	 
   
	 
}
 
