
package view;

import dados.ConectaBD;
import dados.DBCampus;
import dados.DBCategoria;
import dados.DBFornecedor;
import dados.DBItem;
import dados.DBLocalizacao;
import dados.DBResponsavel;
import dados.DBStatus;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Campus;
import model.Categoria;
import model.Fornecedor;
import model.Item;
import model.Localizacao;
import model.Responsavel;


/**
 *
 * @author Ricardo
 */
public class Tela_Item_Lista extends javax.swing.JPanel {

     private ArrayList<Item> itens = new ArrayList<Item>();
    
    
    
    public Tela_Item_Lista() {
        initComponents();
   
        
        preeecherTabelaListaItens("");
        
        preencheTodosComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaListaItens = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        botaoFiltrarItensLote = new javax.swing.JButton();
        ComboBoxCampus = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ComboBoxFornecedor = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        ComboBoxCategoria = new javax.swing.JComboBox();
        ComboBoxResponsavel = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ComboBoxStatus = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        ComboBoxLocalizacao = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ComboBoxOrdenar = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();

        setAutoscrolls(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(840, 257));

        TabelaListaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "REGISTRO", "DESCRIÇÃO", "MARCA", "VALOR", "FORNECEDOR", "CATEGORIA", "RESPONSÁVEL", "LOCAL", "STATUS", "CAMPUS", "Nº NF", "DATA NF", "EMPENHO", "LICITAÇÃO"
            }
        ));
        TabelaListaItens.setAutoscrolls(false);
        jScrollPane1.setViewportView(TabelaListaItens);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoFiltrarItensLote.setText("Filtrar");
        botaoFiltrarItensLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFiltrarItensLoteActionPerformed(evt);
            }
        });

        ComboBoxCampus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Campus");

        jLabel4.setText("Fornecedor");

        ComboBoxFornecedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel5.setText("Categoria");

        ComboBoxCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ComboBoxResponsavel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Responsável");

        jLabel7.setText("Nº Registro Patrimonial:");

        jLabel8.setText("Status");

        ComboBoxStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("De:");

        jLabel10.setText("Até:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Valor:");

        ComboBoxLocalizacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Nº Empenho:");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel13.setText("Nº Licitação:");

        jLabel14.setText("Localização:");

        ComboBoxOrdenar.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "","Campus Asc", "Campus Desc",
            "Fornecedor Asc",
            "Fornecedor Desc",
            "Categoria Asc", "Categoria Desc",
            "Responsável Asc", "Responsável Desc",
            "Status Asc", "Status Desc",
            "Nº Reg.Patrimonial Asc", "Nº Reg.Patrimonial Desc",
            "Valor Asc", "Valor Desc",
            "Nº Empenho Asc", "Nº Empenho Desc",
            "Nº Licitação Asc", "Nº Licitação Desc",
            "Localização Asc", "Localização Desc"
        }));

        jLabel15.setText("Ordenar por:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(ComboBoxLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxResponsavel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(7, 7, 7)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(165, 165, 165))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ComboBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(botaoFiltrarItensLote, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(244, 244, 244)))
                        .addGap(449, 449, 449))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBoxCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(26, 26, 26))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ComboBoxStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBoxLocalizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoFiltrarItensLote))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Tela Lista Item");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1022, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

private void botaoFiltrarItensLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFiltrarItensLoteActionPerformed

    
    
    //System.out.println( montaConsultaFiltroItens() );
    
    //System.out.println( obtemIndexSelecOrdenar() );
   
    
    //this.preeecherTabelaListaItens(montaConsultaFiltroItens());
    
}//GEN-LAST:event_botaoFiltrarItensLoteActionPerformed

private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField2ActionPerformed

private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBoxCampus;
    private javax.swing.JComboBox ComboBoxCategoria;
    private javax.swing.JComboBox ComboBoxFornecedor;
    private javax.swing.JComboBox ComboBoxLocalizacao;
    private javax.swing.JComboBox ComboBoxOrdenar;
    private javax.swing.JComboBox ComboBoxResponsavel;
    private javax.swing.JComboBox ComboBoxStatus;
    public javax.swing.JTable TabelaListaItens;
    private javax.swing.JButton botaoFiltrarItensLote;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables


    
  public void preeecherTabelaListaItens(String consultaAvancada){
  
      
        TabelaListaItens.getColumnModel().getColumn(0).setPreferredWidth(4);
        TabelaListaItens.getColumnModel().getColumn(1).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(2).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(3).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(4).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(5).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(6).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(7).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(8).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(9).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(10).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(11).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(12).setPreferredWidth(10);
        TabelaListaItens.getColumnModel().getColumn(13).setPreferredWidth(10);
        
        DefaultTableModel modelo22 = (DefaultTableModel)TabelaListaItens.getModel();
        modelo22.setNumRows(0);//neste ponto ele limpa tudo que tem dentro da tabela e mais abaixo ele preenche novamente a mesma
        
        
        Item item = new Item();
        
        
        if(consultaAvancada.isEmpty()){
            
            itens = item.listarItens();
        }else{
        
            itens = item.listarItens(consultaAvancada);
        }
        

        
        try{
            
             
             
             //apresentação da tabela na interface gráfica
            //REGISTRO, DESCRIÇÃO, MARCA, VALOR, FORNECEDOR, CATEGORIA, RESPONSÁVEL, LOCALIZAÇÃO, STATUS, CAMPUS, Nº NF, DATA NF, EMPENHO, LICITAÇÃO
            // 0      ,    1     ,   2  ,   3  ,     4     ,     5    ,      6     ,       7    ,    8  ,    9  ,   10 ,    11  ,   12   ,    13
                 
                 

                  Fornecedor fornecedor = new Fornecedor();
                  
                  Fornecedor fornecedor2 = new Fornecedor();
                  
                  fornecedor2 = fornecedor.getFornecedor( 123 );

                  System.out.println( "NOME FORNECEDOR: "+fornecedor2.getNome());

              for( int i = 0; i < getItens().size() ; i++ ){
                    
                   //dbFornecedor.selectUnico( getItens().get(i).getFornecedor().getCnpj() );
                  
                  
                  
                   modelo22.addRow(new Object[]{ 
/*                        
                    getItens().get( i ).getCodigoRP(),            getItens().get(i).getDescricao(), 
                    getItens().get(i).getMarca(),                 getItens().get(i).getValor(),
                    getItens().get(i).getFornecedor().getCnpj(),  getItens().get(i).getCategoria().getIdCategoria(),
                    getItens().get(i).getResonsavel().getSiape(), getItens().get(i).getLocalizacao().getId(), 
                    getItens().get(i).getStatus().getId(),        getItens().get(i).getCampus().getId(),
                    getItens().get(i).getNumeroNF(),              getItens().get(i).getDataEmissaoNF(),
                    getItens().get(i).getNumeroEmpenho(),         getItens().get(i).getLicitacao()
*/                        
                    getItens().get( i ).getCodigoRP(),            getItens().get(i).getDescricao(), 
                    getItens().get(i).getMarca(),                 getItens().get(i).getValor(),
                    getItens().get(i).getFornecedor().getCnpj(),  getItens().get(i).getCategoria().getIdCategoria(),
                    getItens().get(i).getResonsavel().getSiape(), getItens().get(i).getLocalizacao().getId(), 
                    getItens().get(i).getStatus().getId(),        getItens().get(i).getCampus().getId(),
                    getItens().get(i).getNumeroNF(),              getItens().get(i).getDataEmissaoNF(),
                    getItens().get(i).getNumeroEmpenho(),         getItens().get(i).getLicitacao()
                       
                        
                   });
                       
                }

             
        }catch(Exception erro){
        
           // JOptionPane.showMessageDialog(null, "Erro ao listar dados na tabela, erro: "+erro);
            
        }
    }

    public ArrayList<Item> getItens() {
        return itens;
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
        
           // JOptionPane.showMessageDialog(null, "Erro ao listar dados, erro: "+erro);
            
        }
    }
    
    
     public void preencheComboBoxStatus(){
         
       ComboBoxStatus.removeAllItems();  
       try{
           DBStatus dbStatus = new DBStatus();

           dbStatus.select("*", " order by idstatus asc");

           

           
           ComboBoxStatus.addItem("");

           while( dbStatus.getResultSet().next() ){

                ComboBoxStatus.addItem( dbStatus.getResultSet().getString("idstatus").toString()+" | Status: "+dbStatus.getResultSet().getString("status").toString());
           } 
                    
        }catch(Exception erro){
        
            //JOptionPane.showMessageDialog(null, "Erro ao listar dados, erro: "+erro);
            
        }
    }
    
    public void preencheComboBoxCategoria(){
        
        
           ComboBoxCategoria.removeAllItems();
       
           Categoria categoria = new Categoria();
           
           
           ArrayList<Categoria> categorias = new ArrayList<Categoria>();
           
           categorias = categoria.listarCategorias();
           
           ComboBoxCategoria.addItem("");

           for( int i = 0; i < categorias.size(); i++ ){

                ComboBoxCategoria.addItem( categorias.get(i).getIdCategoria() +" | Nome: "+categorias.get(i).getNome());
           }
        
        

    } 
    
    
    
    public void preencheComboBoxResponsavel(){

           ComboBoxResponsavel.removeAllItems();
       
           Responsavel responsavel = new Responsavel();
           
           
           ArrayList<Responsavel> responsaveis = new ArrayList<Responsavel>();
           
           responsaveis = responsavel.listarResponsaveis();
           
           ComboBoxResponsavel.addItem("");

           for( int i = 0; i < responsaveis.size(); i++ ){

                ComboBoxResponsavel.addItem( responsaveis.get(i).getSiape() +" | Nome: "+responsaveis.get(i).getNome());
           }
       
    } 
    
      public void preencheComboBoxFornecedor(){

           ComboBoxFornecedor.removeAllItems();
       
           Fornecedor fornecedor = new Fornecedor();
           
           
           ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
           
           fornecedores = fornecedor.listarFornecedor();
           
           ComboBoxFornecedor.addItem("");

           for( int i = 0; i < fornecedores.size(); i++ ){

                ComboBoxFornecedor.addItem( fornecedores.get(i).getCnpj() +" | Nome: "+fornecedores.get(i).getNome());
           }
         
        
    } 
     
    public void preencheTodosComboBox(){
    
        
        preencheComboBoxLocalizacao();
        preencheComboBoxCampus();
        preencheComboBoxStatus();
        preencheComboBoxCategoria();
        preencheComboBoxResponsavel();
        preencheComboBoxFornecedor();
    
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
    
    public int obtemIndexSelecFornecedor(){
       
      
       try{
           DBFornecedor dbFornecedor = new DBFornecedor();
           dbFornecedor.select("*", " order by cnpj asc");
           
           int idBD = 0;
           int cont = 1; 
           while( dbFornecedor.getResultSet().next() ){

               if( cont == ComboBoxFornecedor.getSelectedIndex()  ){
               
                   idBD = dbFornecedor.getResultSet().getInt("cnpj");
               }
               cont++;
           } 
           
           //System.out.println( "LOCALIZAÇÃO DB: "+idBD);
           return idBD;
           
        }catch(Exception erro){
        
           // JOptionPane.showMessageDialog(null, "Erro ao obter dados, erro: "+erro);
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
        
           // JOptionPane.showMessageDialog(null, "Erro ao obter dados, erro: "+erro);
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
        
          //  JOptionPane.showMessageDialog(null, "Erro ao obter dados, erro: "+erro);
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
        
           // JOptionPane.showMessageDialog(null, "Erro ao obter dados, erro: "+erro);
        }    
       
        return 0;
    }
       
    public int obtemIndexSelecOrdenar(){

        
           int retorno = 0;
           
           int cont = 0; 
           for(int i = 0; i < ComboBoxOrdenar.getItemCount(); i++){
               

               
               if( cont == ComboBoxOrdenar.getSelectedIndex()  ){
        
                    retorno = i;
               }
               cont++;
           }

        
/*        
          String retorno = null;
           
           int cont = 0; 
           for(int i = 0; i < ComboBoxOrdenar.getItemCount(); i++){
               

               
               if( cont == ComboBoxOrdenar.getSelectedIndex()  ){
        
                    retorno = ComboBoxOrdenar.getItemAt(i).toString();
               }
               cont++;
           }
*/           
        return retorno;
    }   
     
    public String montaConsultaFiltroItens(){
    
        String retornoFinal = "";
        String orderBy = "";
        String where = " WHERE ";
        
        
        
        //if(obtemIndexSelecCampus() != 0){
            where += " campus = "+obtemIndexSelecCampus();
        //}
        
        
        //if(obtemIndexSelecLocalizacao() != 0){
            where += " and localizacao_idlocalizacao = "+obtemIndexSelecLocalizacao();
        //}
        
        //if(obtemIndexSelecLocalizacao() != 0){
            where += " and localizacao_idlocalizacao = "+obtemIndexSelecLocalizacao();
        //}
            
        where += " and fornecedor_cnpj = "+obtemIndexSelecFornecedor();    
        
        where += " and categoria_idcategoria = "+obtemIndexSelecCategoria();    

        where += " and responsavel_siape = "+obtemIndexSelecResponsavel();    
        
        where += " and status_idstatus = "+obtemIndexSelecStatus();    
        
       int valComboOrdenar = obtemIndexSelecOrdenar();
       
       switch (valComboOrdenar) {
            case 0:orderBy  = " ";break;
            
            case 1:orderBy  = " order by campus asc";break;
            case 2:orderBy  = " order by campus desc";break;
            case 3:orderBy  = " order by fornecedor_cnpj asc";break;
            case 4:orderBy  = " order by fornecedor_cnpj desc";break;
            case 5:orderBy  = " order by categoria_idcategoria asc";break;
            case 6:orderBy  = " order by categoria_idcategoria desc";break;
            case 7:orderBy  = " order by responsavel_siape asc";break;
            case 8:orderBy  = " order by responsavel_siape desc";break;
            case 9:orderBy  = " order by status_idstatus asc";break;
            case 10:orderBy  = " order by status_idstatus desc";break;
            case 11:orderBy = " order by registro_patrimonial asc";break;
            case 12:orderBy = " order by registro_patrimonial desc";break;
            case 13:orderBy = " order by valor asc";break;
            case 14:orderBy = " order by valor desc";break;
            case 15:orderBy = " order by empenho asc";break;
            case 16:orderBy = " order by empenho desc";break;
            case 17:orderBy = " order by licitacao asc";break;
            case 18:orderBy = " order by licitacao desc";break;
            case 19:orderBy = " order by localizacao asc";break;
            case 20:orderBy = " order by localizacao desc";break;
            
            default:orderBy = "";
                
         }
     
        //concatena a consulta
        retornoFinal = where + orderBy;
    
        return retornoFinal;
    }
    


}
