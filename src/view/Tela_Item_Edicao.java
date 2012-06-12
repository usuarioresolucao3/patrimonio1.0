/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Tela_Item_Edicao.java
 *
 * Created on 18/05/2012, 10:49:23
 */
package view;

import dados.ConectaBD;
import dados.DBCampus;
import dados.DBCategoria;
import dados.DBItem;
import dados.DBLocalizacao;
import dados.DBResponsavel;
import dados.DBStatus;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Campus;
import model.Categoria;
import model.Item;
import model.Localizacao;
import model.Responsavel;
import model.Status;

/**
 *
 * @author Ricardo
 */
public class Tela_Item_Edicao extends javax.swing.JPanel {

    
    ArrayList<Integer> idsItensSelecionados = new ArrayList<Integer>();
    
    //POO
    ArrayList<Item> itensSelecionados = new ArrayList<Item>();
    
    
    public Tela_Item_Edicao() {
        
        
        initComponents();
        
        preencheTodosComboBox();
        
        preeecheTabelaEditaItensLote();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoDescricao = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        campoValor = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListaItensEditar = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        botaoAlterarItensLote = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxLocalizacao = new javax.swing.JComboBox();
        ComboBoxCampus = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        ComboBoxStatus = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        ComboBoxCategoria = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        ComboBoxResponsavel = new javax.swing.JComboBox();

        setAutoscrolls(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setAutoscrolls(true);
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 257));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setText("Tela Edição em Lote de Itens");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Valor:");

        campoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMarcaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Novos dados");

        TabelaListaItensEditar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REGISTRO", "DESCRIÇÃO", "MARCA", "VALOR", "FORNECEDOR", "CATEGORIA", "RESPONSÁVEL", "LOCALIZAÇÃO", "STATUS", "CAMPUS", "Nº NF", "DATA NF", "EMPENHO", "LICITAÇÃO"
            }
        ));
        jScrollPane1.setViewportView(TabelaListaItensEditar);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setText("Dados selecionados");

        botaoAlterarItensLote.setText("Alterar Itens em Lote");
        botaoAlterarItensLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarItensLoteActionPerformed(evt);
            }
        });

        jLabel7.setText("Localização:");

        jLabel8.setText("Campus:");

        ComboBoxLocalizacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBoxCampus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Status:");

        ComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Categoria:");

        ComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Responsável:");

        ComboBoxResponsavel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(48, 48, 48)
                        .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ComboBoxLocalizacao, javax.swing.GroupLayout.Alignment.LEADING, 0, 173, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(ComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 998, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(889, 889, 889))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoAlterarItensLote, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(838, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(campoValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(26, 26, 26)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoAlterarItensLote)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void campoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMarcaActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_campoMarcaActionPerformed

private void botaoAlterarItensLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarItensLoteActionPerformed

    
        //ArrayList<Integer> idsSelecionados = this.getIdsItensSelecionados();
    
        //itensSelecionados
        
        try{
            
             
             Item item = new Item();
             
             for( int i = 0; i < itensSelecionados.size(); i++){
                  
                 //System.out.println(itensSelecionados.get( i ).getCodigoRP());
                 
                 
                 itensSelecionados.get( i ).setDescricao( campoDescricao.getText().toString());
                 itensSelecionados.get(i).setMarca(campoMarca.getText().toString());
                 itensSelecionados.get(i).setValor( Integer.parseInt( campoValor.getText().toString() )  );
                 //numero nota fiscal
                 // data nota fiscal
                 // empenho
                 // licitção
                 //fornecedor
                 
                 //localização
                 Localizacao localizacao = new Localizacao();
                 localizacao.setId( obtemIndexSelecLocalizacao() );
                 itensSelecionados.get(i).setLocalizacao( localizacao );

                 
                 //campus
                 Campus campus = new Campus();
                 campus.setId( obtemIndexSelecCampus() );
                 itensSelecionados.get(i).setCampus( campus );
                 //status
                 Status status = new Status();
                 status.setId(obtemIndexSelecStatus());
                 itensSelecionados.get(i).setStatus(status);
                 //categoria
                 Categoria categoria = new Categoria();
                 categoria.setIdCategoria(obtemIndexSelecCategoria());
                 itensSelecionados.get(i).setCategoria(categoria);
                 //responsável
                 Responsavel responsavel = new Responsavel();
                 responsavel.setSiape(obtemIndexSelecResponsavel());
                 itensSelecionados.get(i).setResponsavel(responsavel);
                 
                 
                 item.editarItem( itensSelecionados.get( i ) );
                 
             
             }

             
             
             campoDescricao.setText("");
             campoMarca.setText("");
             campoValor.setText("");

             JOptionPane.showMessageDialog(null, "Edição realizada com Sucesso!");
             
             //this.preeecheTabelaEditaItensLote();

      
             
        }catch(Exception erro){
        
            JOptionPane.showMessageDialog(null, "Erro, não foi possível atualizar os dados, erro: "+erro);
            
        }
        
    
    
    
}//GEN-LAST:event_botaoAlterarItensLoteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxCampus;
    private javax.swing.JComboBox ComboBoxCategoria;
    private javax.swing.JComboBox ComboBoxLocalizacao;
    private javax.swing.JComboBox ComboBoxResponsavel;
    private javax.swing.JComboBox ComboBoxStatus;
    private javax.swing.JTable TabelaListaItensEditar;
    private javax.swing.JButton botaoAlterarItensLote;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoValor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables


    public void preeecheTabelaEditaItensLote(){

        //System.out.println("TOTAL ITENS SELECIONADOS: "+itensSelecionados.size());
        //System.out.println("ITENS SELECIONADOS: ");
        //for(int i =0 ; i < itensSelecionados.size(); i++){
        
         //   System.out.println("CODIGO REGISTRO PATRIMONIAL"+itensSelecionados.get(i).getCodigoRP());
        
        //}
        
        //desabilita a possibilidade de seleção de nenhuma linha desta tabela
        TabelaListaItensEditar.setRowSelectionAllowed(false);
        
        
        //pré define configurações de tamanho das celulas da tabela
        TabelaListaItensEditar.getColumnModel().getColumn(0).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(1).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(2).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(3).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(4).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(5).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(6).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(7).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(8).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(9).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(10).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(11).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(12).setPreferredWidth(20);
        TabelaListaItensEditar.getColumnModel().getColumn(13).setPreferredWidth(20);
        
        
        
        DefaultTableModel modelo = (DefaultTableModel)TabelaListaItensEditar.getModel();
        modelo.setNumRows(0);//neste ponto ele limpa tudo que tem dentro da tabela e mais abaixo ele preenche novamente a mesma
        
      
              
             //apresentação da tabela na interface gráfica
            //REGISTRO, DESCRIÇÃO, MARCA, VALOR, FORNECEDOR, CATEGORIA, RESPONSÁVEL, LOCALIZAÇÃO, STATUS, CAMPUS, Nº NF, DATA NF, EMPENHO, LICITAÇÃO
            // 0      ,    1     ,   2  ,   3  ,     4     ,     5    ,      6     ,       7    ,    8  ,    9  ,   10 ,    11  ,   12   ,    13
             
             
             for( int i = 0; i < itensSelecionados.size(); i++){
                 
            
                     modelo.addRow(new Object[]{ 
                       
                    itensSelecionados.get( i ).getCodigoRP(),            itensSelecionados.get(i).getDescricao(), 
                    itensSelecionados.get(i).getMarca(),                 itensSelecionados.get(i).getValor(),
                    itensSelecionados.get(i).getFornecedor().getCnpj(),  itensSelecionados.get(i).getCategoria().getIdCategoria(),
                    itensSelecionados.get(i).getResonsavel().getSiape(), itensSelecionados.get(i).getLocalizacao().getId(), 
                    itensSelecionados.get(i).getStatus().getId(),        itensSelecionados.get(i).getCampus().getId(),
                    itensSelecionados.get(i).getNumeroNF(),              itensSelecionados.get(i).getDataEmissaoNF(),
                    itensSelecionados.get(i).getNumeroEmpenho(),         itensSelecionados.get(i).getLicitacao()
                         
                    });     
             }

        
    }
    
    
    public void preencheComboBoxLocalizacao(){
        
        ComboBoxLocalizacao.removeAllItems();
       try{
          DBLocalizacao dbLocalizacao = new DBLocalizacao();

           dbLocalizacao.select("*" ,"order by idlocalizacao asc");

           ComboBoxLocalizacao.addItem("");

           while( dbLocalizacao.getResultSet().next() ){

                ComboBoxLocalizacao.addItem( dbLocalizacao.getResultSet().getString("idlocalizacao").toString()+" | Prédio: "+dbLocalizacao.getResultSet().getString("predio").toString()+" | Sala: "+dbLocalizacao.getResultSet().getString("sala").toString());
           } 
                    
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao listar dados, erro: "+erro);
            
        }
    }

    public void preencheComboBoxCampus(){
        
       ComboBoxCampus.removeAllItems();
       try{
           DBCampus dbCampus = new DBCampus();

           dbCampus.select("*"," order by id asc");

           
           ComboBoxCampus.addItem("");

           while( dbCampus.getResultSet().next() ){

                ComboBoxCampus.addItem( dbCampus.getResultSet().getString("id").toString()+" | "+dbCampus.getResultSet().getString("campus").toString());
           } 
                    
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao listar dados, erro: "+erro);
            
        }
    }
    
    
     public void preencheComboBoxStatus(){
         
       ComboBoxStatus.removeAllItems();  
       try{
           DBStatus dbStatus = new DBStatus();

           dbStatus.select("*", " order by idstatus asc");

           

           
           ComboBoxStatus.addItem("");

           while( dbStatus.getResultSet().next() ){

                ComboBoxStatus.addItem( dbStatus.getResultSet().getString("idstatus").toString()+" | "+dbStatus.getResultSet().getString("status").toString());
           } 
                    
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao listar dados, erro: "+erro);
            
        }
    }
    
    public void preencheComboBoxCategoria(){

       ComboBoxCategoria.removeAllItems();
       try{
           DBCategoria dbCategoria = new DBCategoria();

           dbCategoria.select("*", " order by idcategoria asc");

           

           
           ComboBoxCategoria.addItem("");

           while( dbCategoria.getResultSet().next() ){

                ComboBoxCategoria.addItem( dbCategoria.getResultSet().getString("idcategoria").toString()+" | "+dbCategoria.getResultSet().getString("nome").toString());
           } 
                    
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao listar dados, erro: "+erro);
            
        }
    } 
    
    
    
    public void preencheComboBoxResponsavel(){

       ComboBoxResponsavel.removeAllItems();
       try{
           
           DBResponsavel dbResponsavel = new DBResponsavel();

           dbResponsavel.select("*", " order by siape asc");

           

           
           ComboBoxResponsavel.addItem("");

           while( dbResponsavel.getResultSet().next() ){

                ComboBoxResponsavel.addItem( dbResponsavel.getResultSet().getString("siape").toString()+" | Nome: "+dbResponsavel.getResultSet().getString("nome").toString());
           } 
                    
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao listar dados, erro: "+erro);
            
        }
    } 
     
    public void preencheTodosComboBox(){
    
        
        preencheComboBoxLocalizacao();
        preencheComboBoxCampus();
        preencheComboBoxStatus();
        preencheComboBoxCategoria();
        preencheComboBoxResponsavel();
    
    }
    
    
    public int obtemIndexSelecLocalizacao(){
       
      
       try{
           DBLocalizacao dbLocalizacao = new DBLocalizacao();
           dbLocalizacao.select("*", " order by idlocalizacao asc");
           
           int idBD = 0;
           int cont = 1; 
           while( dbLocalizacao.getResultSet().next() ){

               if( cont == ComboBoxLocalizacao.getSelectedIndex()  ){
               
                   idBD = dbLocalizacao.getResultSet().getInt("idlocalizacao");
               }
               cont++;
           } 
           
           //System.out.println( "LOCALIZAÇÃO DB: "+idBD);
           return idBD;
           
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao obter dados, erro: "+erro);
        }    
        
       return 0;
    }
    
    public int obtemIndexSelecCampus(){
        
       try{
           DBCampus dbCampus = new DBCampus();
           dbCampus.select("*", "order by id asc");

           int idBD = 0;
           int cont = 1; 
           while( dbCampus.getResultSet().next() ){

               if( cont == ComboBoxCampus.getSelectedIndex()  ){
               
                   idBD = dbCampus.getResultSet().getInt("id");
               }
               cont++;
           }
           
           //System.out.println( "CAMPUS DB: "+idBD);
           return idBD;
           
           
           
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao obter dados, erro: "+erro);
        }    
       
        return 0;
    }
    
    
    public int obtemIndexSelecStatus(){
        
       try{
           DBStatus dbStatus = new DBStatus();
           dbStatus.select("*", " order by idstatus asc");

           int idBD = 0;
           int cont = 1; 
           while( dbStatus.getResultSet().next() ){

               if( cont == ComboBoxStatus.getSelectedIndex()  ){
               
                   idBD = dbStatus.getResultSet().getInt("idstatus");
               }
               cont++;
           }
           
           //System.out.println( "STATUS DB: "+idBD);
           return idBD;
           
           
           
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao obter dados, erro: "+erro);
        }    
       
        return 0;
    }

    public int obtemIndexSelecCategoria(){
        
       try{
           DBCategoria dbCategoria = new DBCategoria();
           dbCategoria.select("*", " order by idcategoria asc");

           int idBD = 0;
           int cont = 1; 
           while( dbCategoria.getResultSet().next() ){

               if( cont == ComboBoxCategoria.getSelectedIndex()  ){
               
                   idBD = dbCategoria.getResultSet().getInt("idcategoria");
               }
               cont++;
           }
           
           //System.out.println( "CATEGORIA DB: "+idBD);
           return idBD;
           
           
           
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao obter dados, erro: "+erro);
        }    
       
        return 0;
    }

    
    public int obtemIndexSelecResponsavel(){
        
       try{
           DBResponsavel dbResponsavel = new DBResponsavel();
           dbResponsavel.select("*", " order by siape asc");

           int idBD = 0;
           int cont = 1; 
           while( dbResponsavel.getResultSet().next() ){

               if( cont == ComboBoxResponsavel.getSelectedIndex()  ){
               
                   idBD = dbResponsavel.getResultSet().getInt("siape");
               }
               cont++;
           }
           
           //System.out.println( "CATEGORIA DB: "+idBD);
           return idBD;
           
           
           
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao obter dados, erro: "+erro);
        }    
       
        return 0;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public ArrayList<Integer> getIdsItensSelecionados() {
        return idsItensSelecionados;
    }

    public void setIdsItensSelecionados(ArrayList<Integer> idsItensSelecionados) {
        this.idsItensSelecionados = idsItensSelecionados;
    }

    /**
     * @return the itensSelecionados
     */
    public ArrayList<Item> getItensSelecionados() {
        return itensSelecionados;
    }

    /**
     * @param itensSelecionados the itensSelecionados to set
     */
    public void setItensSelecionados(ArrayList<Item> itensSelecionados) {
       
        this.itensSelecionados = itensSelecionados;
    }


    
    
    
    
    


}
