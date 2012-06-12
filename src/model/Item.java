
package model;

import dados.DBItem;
import java.sql.SQLException;
import java.util.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Item {
 
	private int numeroNF;
        
        private int dataEmissaoNF;
	 
	private int numeroEmpenho;
	 
	private String descricao;
	 
	private String marca;
	 
	private double valor;
	 
	private Fornecedor fornecedor;
	 
	private Localizacao localizacao;
	 
	private Responsavel responsavel;
	 
	private int codigoRP;
	 
	private Campus campus;
	 
	private int licitacao;
	 
	private Status status;
	 
	private Categoria categoria;
	 
	private Date dataRegistro;
	 
	private ConfiguracaoSistema configuracaoSistema;
	 

	public Item(){}
        
	public Item(int NF, String emp, String desc, String marca, double val, Fornecedor fornec, int local, int resp, int codRp, int camp, int licit, int status, int cat) {
		
	}
	 
	public boolean inserirItem() {
	 

             DBItem dbItem = new DBItem();




             dbItem.insert("registro_patrimonial, descricao, marca, valor, numNF, dataNF, empenho, licitacao "

                         + ", fornecedor_cnpj, localizacao_idlocalizacao, campus, status_idstatus, categoria_idcategoria, responsavel_siape",


                         "'"+ getCodigoRP() +"','"+getDescricao()+"'"

                         + ",'"+ getMarca()+"',"+ getValor() +""

                         + ",'"+ getNumeroNF() +"',"+ getDataEmissaoNF()+""

                         + ",'"+ getNumeroEmpenho() +"',"+ getLicitacao()+""

                         + ","+ getFornecedor().getCnpj() +","+ getLocalizacao().getId() +""

                         + ","+ getCampus().getId() +","+ getStatus().getId() +""

                         + ","+ getCategoria().getIdCategoria() +","+ getResonsavel().getSiape() +""

                        + "");


             //fecha a conexão com o banco
             dbItem.closedConnection();

             return true;



             //JOptionPane.showMessageDialog(null, "Cadastro realizado com Sucesso!");
            
            
	}
	 
	public boolean editarItem(Item item) {
            
             DBItem dbItem = new DBItem();
             
                 
                 dbItem.update("descricao ='"+item.getDescricao()+"'"
                         
                         + ",marca='"+item.getMarca()+"', valor="+ item.getValor() +""    
                         
                         + ",numNf='"+ item.getNumeroNF() +"',dataNF="+ item.getDataEmissaoNF()+""

                         + ",empenho='"+ item.getNumeroEmpenho() +"',licitacao="+ item.getLicitacao()+""

                         + ",fornecedor_cnpj="+ item.getFornecedor().getCnpj() +",localizacao_idlocalizacao="+ item.getLocalizacao().getId() +""

                         + ",campus="+ item.getCampus().getId() +",status_idstatus="+ item.getStatus().getId() +""

                         + ",categoria_idcategoria="+ item.getCategoria().getIdCategoria() +",responsavel_siape="+ item.getResonsavel().getSiape() +"",
                         
                         item.getCodigoRP()
                   );
                   dbItem.closedConnection(); 
                       
            
             return true;
	}
	 
	public ArrayList<Item> listarItens() {

            DBItem dbItem = new DBItem();
            
            ArrayList<Item> itens = new ArrayList<Item>();
            
            dbItem.select("*", " order by registro_patrimonial asc");
            
            try {
                while( dbItem.getResultSet().next() ){

                       Item item = new Item();
                       item.setCodigoRP(  Integer.parseInt( dbItem.getResultSet().getString("registro_patrimonial")) );
                       item.setDescricao( dbItem.getResultSet().getString("descricao") );
                       item.setMarca( dbItem.getResultSet().getString("marca") );
                       item.setValor( Double.parseDouble( dbItem.getResultSet().getString("valor") ) );
                       item.setNumeroNF( Integer.parseInt( dbItem.getResultSet().getString("numNF") ) );
                       item.setDataEmissaoNF( Integer.parseInt( dbItem.getResultSet().getString("dataNF") ) );
                       item.setNumeroEmpenho( Integer.parseInt( dbItem.getResultSet().getString("empenho") ) );
                       item.setLicitacao( Integer.parseInt( dbItem.getResultSet().getString("licitacao") ) );     
                       Fornecedor fornecedor = new Fornecedor();
                       fornecedor.setCnpj( Integer.parseInt( dbItem.getResultSet().getString("fornecedor_cnpj") ) );
                       item.setFornecedor( fornecedor );
                       Localizacao localizacao = new Localizacao();
                       localizacao.setId( Integer.parseInt( dbItem.getResultSet().getString("localizacao_idlocalizacao")) );
                       item.setLocalizacao( localizacao );
                       Campus campus = new Campus();
                       campus.setId( Integer.parseInt( dbItem.getResultSet().getString("campus")) );
                       item.setCampus( campus );
                       model.Status status = new model.Status();
                       status.setId( Integer.parseInt( dbItem.getResultSet().getString("status_idstatus"))  );
                       item.setStatus(status);
                       Categoria categoria = new Categoria();
                       categoria.setIdCategoria( Integer.parseInt( dbItem.getResultSet().getString("categoria_idcategoria"))  );
                       item.setCategoria( categoria );
                       Responsavel responsavel = new Responsavel();
                       responsavel.setSiape( Integer.parseInt( dbItem.getResultSet().getString("responsavel_siape")) );
                       item.setResponsavel( responsavel );

                       //adiciona o item a lista de itens do retorno
                       itens.add( item );
                }
            } catch (SQLException ex) {
                Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
            return itens;
		
	}
	
        
        //método utilizado para a filtragem avançada de itens
        public ArrayList<Item> listarItens(String parametros) {

            DBItem dbItem = new DBItem();
            
            ArrayList<Item> itens = new ArrayList<Item>();
            
            dbItem.select("*", parametros);
            
            try {
                while( dbItem.getResultSet().next() ){

                       Item item = new Item();
                       item.setCodigoRP(  Integer.parseInt( dbItem.getResultSet().getString("registro_patrimonial")) );
                       item.setDescricao( dbItem.getResultSet().getString("descricao") );
                       item.setMarca( dbItem.getResultSet().getString("marca") );
                       item.setValor( Double.parseDouble( dbItem.getResultSet().getString("valor") ) );
                       item.setNumeroNF( Integer.parseInt( dbItem.getResultSet().getString("numNF") ) );
                       item.setDataEmissaoNF( Integer.parseInt( dbItem.getResultSet().getString("dataNF") ) );
                       item.setNumeroEmpenho( Integer.parseInt( dbItem.getResultSet().getString("empenho") ) );
                       item.setLicitacao( Integer.parseInt( dbItem.getResultSet().getString("licitacao") ) );     
                       Fornecedor fornecedor = new Fornecedor();
                       fornecedor.setCnpj( Integer.parseInt( dbItem.getResultSet().getString("fornecedor_cnpj") ) );
                       item.setFornecedor( fornecedor );
                       Localizacao localizacao = new Localizacao();
                       localizacao.setId( Integer.parseInt( dbItem.getResultSet().getString("localizacao_idlocalizacao")) );
                       item.setLocalizacao( localizacao );
                       Campus campus = new Campus();
                       campus.setId( Integer.parseInt( dbItem.getResultSet().getString("campus")) );
                       item.setCampus( campus );
                       model.Status status = new model.Status();
                       status.setId( Integer.parseInt( dbItem.getResultSet().getString("status_idstatus"))  );
                       item.setStatus(status);
                       Categoria categoria = new Categoria();
                       categoria.setIdCategoria( Integer.parseInt( dbItem.getResultSet().getString("categoria_idcategoria"))  );
                       item.setCategoria( categoria );
                       Responsavel responsavel = new Responsavel();
                       responsavel.setSiape( Integer.parseInt( dbItem.getResultSet().getString("responsavel_siape")) );
                       item.setResponsavel( responsavel );

                       //adiciona o item a lista de itens do retorno
                       itens.add( item );
                }
            } catch (SQLException ex) {
                Logger.getLogger(Item.class.getName()).log(Level.SEVERE, null, ex);
            }
                 
            return itens;
		
	}
	 
        
	public boolean deletarItem(Item item) {
            
             DBItem dbItem = new DBItem();
             
                 
             dbItem.delete( item.getCodigoRP() );
                 
             dbItem.closedConnection(); 
  
            
	     return true;
             
	}
	 
	public void gerarTermo() {
	 
	}
	 
	public void gerarRelatorio() {
	 
	}
	 
	public void setNumeroNF(int numeroNF) {
	 
            this.numeroNF = numeroNF;
	}
	 
	public int getNumeroNF() {
            
	     return this.numeroNF;
	}
	 
	public void setNumeroEmpenho(int numEmp) {
	 
            this.numeroEmpenho = numEmp;
	}
	 
	public int getNumeroEmpenho() {
            
            return this.numeroEmpenho;
	}
	 
	public void setValor(double valor) {
	 
            this.valor = valor;
	}
	 
	public double getValor() {
            
	     return this.valor;
	}
	 
	public void setDescricao(String descricao) {
	 
            this.descricao = descricao;
	}
	 
	public String getDescricao() {

            return this.descricao;
	}
	 
	public void setMarca(String marca) {
	 
            this.marca = marca;
	}
	 
	public String getMarca() {

            return this.marca;
	}
	 
	public void setFornecedor(Fornecedor fornecedor) {
	 
            this.fornecedor = fornecedor;
	}
	 
	public Fornecedor getFornecedor() {
		
            return this.fornecedor;
	}
	 
	public void setLocalizacao(Localizacao local) {
	 
            this.localizacao = local;
	}
	 
	public Localizacao getLocalizacao() {
		
            return this.localizacao;
	}
	 
	public void setResponsavel(Responsavel respons) {
	 
            this.responsavel = respons;
	}
	 
	public Responsavel getResonsavel() {
		
            return this.responsavel;
	}
	 
	public void setCodigoRP(int codigo) {
	 
            this.codigoRP = codigo;
	}
	 
	public int getCodigoRP() {
            
		return this.codigoRP;
	}
	 
	public void setCampus(Campus campus) {
	 
            this.campus = campus;
	}
	 
	public Campus getCampus() {
            
		return this.campus;
	}
	 
	public void setLicitacao(int licitacao) {
	 
            this.licitacao = licitacao;
	}
	 
	public int getLicitacao() {
            
		return this.licitacao;
	}
	 
	public void setStatus(Status status) {
	 
            this.status = status;
	}
	 
	public Status getStatus() {
            
	    return this.status;
	}
	 
	public void setCategoria(Categoria categoria) {
	 
            this.categoria = categoria;
	}
	 
	public Categoria getCategoria() {
            
	     return this.categoria; 
	}
	 
	public void setDataRegistro(Date data) {
	 
	}
	 
	public Date getDataRegistro() {
		return null;
	}
	 
	private boolean verificarFornecedor(String cnpj) {
		return false;
	}

    /**
     * @return the dataEmissaoNF
     */
    public int getDataEmissaoNF() {
        return dataEmissaoNF;
    }

    /**
     * @param dataEmissaoNF the dataEmissaoNF to set
     */
    public void setDataEmissaoNF(int dataEmissaoNF) {
        this.dataEmissaoNF = dataEmissaoNF;
    }
	 
}
 
