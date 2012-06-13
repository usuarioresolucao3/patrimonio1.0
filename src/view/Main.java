/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Main.java
 *
 * Created on 18/05/2012, 10:48:21
 */
package view;

//Comentario Augusto
//Comentario  Ricardo

import dados.ConectaBD;
import dados.DBCampus;
import dados.DBItem;
import dados.DBUsuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.swing.JOptionPane;
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
public class Main extends javax.swing.JFrame {


    
    
    public ArrayList<Integer> idsItensSelecionados = new ArrayList<Integer>();
    
    
    public ArrayList<Integer> idsItensSelecEdicao = new ArrayList<Integer>();
    
    //esse vai ser para POO
    public ArrayList<Item> itensSelecEdicao = new ArrayList<Item>();
    public ArrayList<Item> itensSelecExclusao = new ArrayList<Item>();
    
    
    
    public ArrayList<Integer> idsItensSelecExclusao = new ArrayList<Integer>();
    
    
    public boolean sessao = false;
     
     
    
    public Main() {
        initComponents();
        
        painelTabulado.setVisible(false);
        
        panelDadosUsuarioLogado.setVisible(false);
        
        
        
        
        //insere os dados no bomboBox campus na Tela interna login
        setDadosComboBoxCampus();
      
        
            
            
        
        
/*        
        tela_Item_CadastroLote.setVisible(false);
        tela_Item_Edicao.setVisible(false);
        tela_Item_Lista.setVisible(true);
        aba_ITEM.revalidate();  
        corpo_CRUD_Item.revalidate();
*/        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        painelTabulado = new javax.swing.JTabbedPane();
        aba_ITEM = new javax.swing.JPanel();
        botao_Item_CadastroLote = new javax.swing.JButton();
        botao_Item_EdicaoLote = new javax.swing.JButton();
        botao_Item_ExclusaoLote = new javax.swing.JButton();
        botao_Item_Lista = new javax.swing.JButton();
        corpo_CRUD_Item = new javax.swing.JPanel();
        tela_Item_CadastroLote = new view.Tela_Item_CadastroLote();
        tela_Item_Edicao = new view.Tela_Item_Edicao();
        tela_Item_Lista = new view.Tela_Item_Lista();
        aba_FORNECEDOR = new javax.swing.JPanel();
        corpo_CRUD_Fornecedor = new javax.swing.JPanel();
        tela_Fornecedor_Cadastro = new view.Tela_Fornecedor_Cadastro();
        tela_Fornecedor_Edicao = new view.Tela_Fornecedor_Edicao();
        tela_Fornecedor_Lista = new view.Tela_Fornecedor_Lista();
        botao_Fornecedor_Lista = new javax.swing.JButton();
        botao_Fornecedor_Cadastro = new javax.swing.JButton();
        botao_Fornecedor_Edicao = new javax.swing.JButton();
        botao_Fornecedor_Exclusao = new javax.swing.JButton();
        aba_RESPONSAVEL = new javax.swing.JPanel();
        corpo_CRUD_Responsavel = new javax.swing.JPanel();
        tela_Responsavel_Cadastro = new view.Tela_Responsavel_Cadastro();
        tela_Responsavel_Edicao = new view.Tela_Responsavel_Edicao();
        tela_Responsavel_Lista = new view.Tela_Responsavel_Lista();
        botao_Responsavel_Lista = new javax.swing.JButton();
        botao_Responsavel_Cadastro = new javax.swing.JButton();
        botao_Responsavel_Edicao = new javax.swing.JButton();
        botao_Responsavel_Exclusao = new javax.swing.JButton();
        aba_USUARIO = new javax.swing.JPanel();
        corpo_CRUD_Usuario = new javax.swing.JPanel();
        tela_Usuario_Cadastro = new view.Tela_Usuario_Cadastro();
        tela_Usuario_Edicao = new view.Tela_Usuario_Edicao();
        tela_Usuario_Lista = new view.Tela_Usuario_Lista();
        botao_Usuario_Lista = new javax.swing.JButton();
        botao_Usuario_Cadastro = new javax.swing.JButton();
        botao_Usuario_Edicao = new javax.swing.JButton();
        botao_Usuario_Exclusao = new javax.swing.JButton();
        aba_LOCALIZACAO = new javax.swing.JPanel();
        corpo_CRUD_Localizacao = new javax.swing.JPanel();
        tela_Localizacao_Cadastro = new view.Tela_Localizacao_Cadastro();
        tela_Localizacao_Edicao = new view.Tela_Localizacao_Edicao();
        tela_Localizacao_Lista = new view.Tela_Localizacao_Lista();
        botao_Localizacao_Lista = new javax.swing.JButton();
        botao_Localizacao_Cadastro = new javax.swing.JButton();
        botao_Localizacao_Edicao = new javax.swing.JButton();
        botao_Localizacao_Exclusao = new javax.swing.JButton();
        aba_CONFIGURACAO = new javax.swing.JPanel();
        corpo_CRUD_Configuracao = new javax.swing.JPanel();
        subCorpo_FaixaCodigo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        subCorpo_CRUD_Categoria = new javax.swing.JPanel();
        botao_Categoria_Lista = new javax.swing.JButton();
        botao_Categoria_Cadastro = new javax.swing.JButton();
        botao_Categoria_Edicao = new javax.swing.JButton();
        botao_Categoria_Exclusao = new javax.swing.JButton();
        tela_Categoria_Cadastro = new view.Tela_Categoria_Cadastro();
        tela_Categoria_Edicao = new view.Tela_Categoria_Edicao();
        tela_Categoria_Lista = new view.Tela_Categoria_Lista();
        subCorpo_CRUD_Status = new javax.swing.JPanel();
        tela_Status_Cadastro = new view.Tela_Status_Cadastro();
        botao_Status_Lista = new javax.swing.JButton();
        botao_Status_Cadastro = new javax.swing.JButton();
        botao_Status_Edicao = new javax.swing.JButton();
        botao_Status_Exclusao = new javax.swing.JButton();
        tela_Status_Edicao = new view.Tela_Status_Edicao();
        tela_Status_Lista = new view.Tela_Status_Lista();
        subCorpo_CRUD_Campus = new javax.swing.JPanel();
        botao_Campus_Lista = new javax.swing.JButton();
        botao_Campus_Cadastro = new javax.swing.JButton();
        botao_Campus_Edicao = new javax.swing.JButton();
        botao_Campus_Exclusao = new javax.swing.JButton();
        tela_Campus_Cadastro = new view.Tela_Campus_Cadastro();
        tela_Campus_Edicao = new view.Tela_Campus_Edicao();
        tela_Campus_Lista = new view.Tela_Campus_Lista();
        botao_Configuracao_FaixaCodigo = new javax.swing.JButton();
        botao_Configuracao_Categoria = new javax.swing.JButton();
        botao_Configuracao_Status = new javax.swing.JButton();
        botao_Configuracao_Campus = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        corpo_TermoResponsabilidade = new javax.swing.JPanel();
        tela_Item_Lista1 = new view.Tela_Item_Lista();
        jButton2 = new javax.swing.JButton();
        painelLogin = new javax.swing.JPanel();
        botaoAcessarSistema = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        campo_Login_Usuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboBox_Login_Campus = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        campo_Login_Senha = new javax.swing.JPasswordField();
        panelDadosUsuarioLogado = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        labelUsuarioLogado = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SGPU - Sistema de Gerenciamento de Patrimônio da Unipampa");

        aba_ITEM.setAutoscrolls(true);
        aba_ITEM.setPreferredSize(new java.awt.Dimension(1198, 2100));

        botao_Item_CadastroLote.setText("Cadastro");
        botao_Item_CadastroLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Item_CadastroLoteActionPerformed(evt);
            }
        });

        botao_Item_EdicaoLote.setText("Edição");
        botao_Item_EdicaoLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Item_EdicaoLoteActionPerformed(evt);
            }
        });

        botao_Item_ExclusaoLote.setText("Exclusão");
        botao_Item_ExclusaoLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Item_ExclusaoLoteActionPerformed(evt);
            }
        });

        botao_Item_Lista.setText("Lista");
        botao_Item_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Item_ListaActionPerformed(evt);
            }
        });

        corpo_CRUD_Item.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        corpo_CRUD_Item.setAutoscrolls(true);
        corpo_CRUD_Item.setMinimumSize(new java.awt.Dimension(1000, 653));
        corpo_CRUD_Item.setPreferredSize(new java.awt.Dimension(1066, 653));
        corpo_CRUD_Item.add(tela_Item_CadastroLote);
        corpo_CRUD_Item.add(tela_Item_Edicao);
        corpo_CRUD_Item.add(tela_Item_Lista);

        javax.swing.GroupLayout aba_ITEMLayout = new javax.swing.GroupLayout(aba_ITEM);
        aba_ITEM.setLayout(aba_ITEMLayout);
        aba_ITEMLayout.setHorizontalGroup(
            aba_ITEMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_ITEMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_ITEMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botao_Item_ExclusaoLote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(botao_Item_EdicaoLote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(botao_Item_CadastroLote, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                    .addComponent(botao_Item_Lista, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(corpo_CRUD_Item, javax.swing.GroupLayout.DEFAULT_SIZE, 1062, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        aba_ITEMLayout.setVerticalGroup(
            aba_ITEMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_ITEMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_ITEMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corpo_CRUD_Item, javax.swing.GroupLayout.PREFERRED_SIZE, 1695, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aba_ITEMLayout.createSequentialGroup()
                        .addComponent(botao_Item_Lista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Item_CadastroLote)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Item_EdicaoLote)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Item_ExclusaoLote)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        painelTabulado.addTab("     ITEM     ", aba_ITEM);

        corpo_CRUD_Fornecedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout corpo_CRUD_FornecedorLayout = new javax.swing.GroupLayout(corpo_CRUD_Fornecedor);
        corpo_CRUD_Fornecedor.setLayout(corpo_CRUD_FornecedorLayout);
        corpo_CRUD_FornecedorLayout.setHorizontalGroup(
            corpo_CRUD_FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_FornecedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tela_Fornecedor_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(corpo_CRUD_FornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela_Fornecedor_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corpo_CRUD_FornecedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tela_Fornecedor_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        corpo_CRUD_FornecedorLayout.setVerticalGroup(
            corpo_CRUD_FornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_FornecedorLayout.createSequentialGroup()
                .addComponent(tela_Fornecedor_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Fornecedor_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Fornecedor_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botao_Fornecedor_Lista.setText("Lista");
        botao_Fornecedor_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Fornecedor_ListaActionPerformed(evt);
            }
        });

        botao_Fornecedor_Cadastro.setText("Cadastro");
        botao_Fornecedor_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Fornecedor_CadastroActionPerformed(evt);
            }
        });

        botao_Fornecedor_Edicao.setText("Edição");
        botao_Fornecedor_Edicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Fornecedor_EdicaoActionPerformed(evt);
            }
        });

        botao_Fornecedor_Exclusao.setText("Exclusão");

        javax.swing.GroupLayout aba_FORNECEDORLayout = new javax.swing.GroupLayout(aba_FORNECEDOR);
        aba_FORNECEDOR.setLayout(aba_FORNECEDORLayout);
        aba_FORNECEDORLayout.setHorizontalGroup(
            aba_FORNECEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aba_FORNECEDORLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_FORNECEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_Fornecedor_Exclusao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Fornecedor_Edicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Fornecedor_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Fornecedor_Lista, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(corpo_CRUD_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        aba_FORNECEDORLayout.setVerticalGroup(
            aba_FORNECEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_FORNECEDORLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_FORNECEDORLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corpo_CRUD_Fornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aba_FORNECEDORLayout.createSequentialGroup()
                        .addComponent(botao_Fornecedor_Lista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Fornecedor_Cadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Fornecedor_Edicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Fornecedor_Exclusao)))
                .addContainerGap(598, Short.MAX_VALUE))
        );

        painelTabulado.addTab("FORNECEDOR", aba_FORNECEDOR);

        corpo_CRUD_Responsavel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        corpo_CRUD_Responsavel.setPreferredSize(new java.awt.Dimension(1066, 321));

        javax.swing.GroupLayout corpo_CRUD_ResponsavelLayout = new javax.swing.GroupLayout(corpo_CRUD_Responsavel);
        corpo_CRUD_Responsavel.setLayout(corpo_CRUD_ResponsavelLayout);
        corpo_CRUD_ResponsavelLayout.setHorizontalGroup(
            corpo_CRUD_ResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_ResponsavelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(corpo_CRUD_ResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tela_Responsavel_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela_Responsavel_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corpo_CRUD_ResponsavelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tela_Responsavel_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        corpo_CRUD_ResponsavelLayout.setVerticalGroup(
            corpo_CRUD_ResponsavelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_ResponsavelLayout.createSequentialGroup()
                .addComponent(tela_Responsavel_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Responsavel_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Responsavel_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botao_Responsavel_Lista.setText("Lista");
        botao_Responsavel_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Responsavel_ListaActionPerformed(evt);
            }
        });

        botao_Responsavel_Cadastro.setText("Cadastro");
        botao_Responsavel_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Responsavel_CadastroActionPerformed(evt);
            }
        });

        botao_Responsavel_Edicao.setText("Edição");
        botao_Responsavel_Edicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Responsavel_EdicaoActionPerformed(evt);
            }
        });

        botao_Responsavel_Exclusao.setText("Exclusão");

        javax.swing.GroupLayout aba_RESPONSAVELLayout = new javax.swing.GroupLayout(aba_RESPONSAVEL);
        aba_RESPONSAVEL.setLayout(aba_RESPONSAVELLayout);
        aba_RESPONSAVELLayout.setHorizontalGroup(
            aba_RESPONSAVELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_RESPONSAVELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_RESPONSAVELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botao_Responsavel_Exclusao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Responsavel_Edicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Responsavel_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Responsavel_Lista, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(corpo_CRUD_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        aba_RESPONSAVELLayout.setVerticalGroup(
            aba_RESPONSAVELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_RESPONSAVELLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_RESPONSAVELLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corpo_CRUD_Responsavel, javax.swing.GroupLayout.PREFERRED_SIZE, 1194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aba_RESPONSAVELLayout.createSequentialGroup()
                        .addComponent(botao_Responsavel_Lista)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Responsavel_Cadastro)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Responsavel_Edicao)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Responsavel_Exclusao)))
                .addContainerGap(537, Short.MAX_VALUE))
        );

        painelTabulado.addTab("RESPONSÁVEL", aba_RESPONSAVEL);

        corpo_CRUD_Usuario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        corpo_CRUD_Usuario.setPreferredSize(new java.awt.Dimension(1066, 248));

        javax.swing.GroupLayout corpo_CRUD_UsuarioLayout = new javax.swing.GroupLayout(corpo_CRUD_Usuario);
        corpo_CRUD_Usuario.setLayout(corpo_CRUD_UsuarioLayout);
        corpo_CRUD_UsuarioLayout.setHorizontalGroup(
            corpo_CRUD_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_UsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela_Usuario_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corpo_CRUD_UsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tela_Usuario_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(corpo_CRUD_UsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela_Usuario_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        corpo_CRUD_UsuarioLayout.setVerticalGroup(
            corpo_CRUD_UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_UsuarioLayout.createSequentialGroup()
                .addComponent(tela_Usuario_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Usuario_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Usuario_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        botao_Usuario_Lista.setText("Lista");
        botao_Usuario_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Usuario_ListaActionPerformed(evt);
            }
        });

        botao_Usuario_Cadastro.setText("Cadastro");
        botao_Usuario_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Usuario_CadastroActionPerformed(evt);
            }
        });

        botao_Usuario_Edicao.setText("Edição");
        botao_Usuario_Edicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Usuario_EdicaoActionPerformed(evt);
            }
        });

        botao_Usuario_Exclusao.setText("Exclusão");

        javax.swing.GroupLayout aba_USUARIOLayout = new javax.swing.GroupLayout(aba_USUARIO);
        aba_USUARIO.setLayout(aba_USUARIOLayout);
        aba_USUARIOLayout.setHorizontalGroup(
            aba_USUARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aba_USUARIOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_USUARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_Usuario_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(botao_Usuario_Lista, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(botao_Usuario_Edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(botao_Usuario_Exclusao, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(corpo_CRUD_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        aba_USUARIOLayout.setVerticalGroup(
            aba_USUARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_USUARIOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_USUARIOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corpo_CRUD_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 1029, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aba_USUARIOLayout.createSequentialGroup()
                        .addComponent(botao_Usuario_Lista)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Usuario_Cadastro)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Usuario_Edicao)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Usuario_Exclusao)))
                .addContainerGap(702, Short.MAX_VALUE))
        );

        painelTabulado.addTab("USUÁRIO", aba_USUARIO);

        corpo_CRUD_Localizacao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        corpo_CRUD_Localizacao.setPreferredSize(new java.awt.Dimension(1066, 104));

        javax.swing.GroupLayout corpo_CRUD_LocalizacaoLayout = new javax.swing.GroupLayout(corpo_CRUD_Localizacao);
        corpo_CRUD_Localizacao.setLayout(corpo_CRUD_LocalizacaoLayout);
        corpo_CRUD_LocalizacaoLayout.setHorizontalGroup(
            corpo_CRUD_LocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_LocalizacaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela_Localizacao_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corpo_CRUD_LocalizacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tela_Localizacao_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corpo_CRUD_LocalizacaoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tela_Localizacao_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        corpo_CRUD_LocalizacaoLayout.setVerticalGroup(
            corpo_CRUD_LocalizacaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_LocalizacaoLayout.createSequentialGroup()
                .addComponent(tela_Localizacao_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Localizacao_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Localizacao_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botao_Localizacao_Lista.setText("Lista");
        botao_Localizacao_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Localizacao_ListaActionPerformed(evt);
            }
        });

        botao_Localizacao_Cadastro.setText("Cadastro");
        botao_Localizacao_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Localizacao_CadastroActionPerformed(evt);
            }
        });

        botao_Localizacao_Edicao.setText("Edição");
        botao_Localizacao_Edicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Localizacao_EdicaoActionPerformed(evt);
            }
        });

        botao_Localizacao_Exclusao.setText("Exclusão");

        javax.swing.GroupLayout aba_LOCALIZACAOLayout = new javax.swing.GroupLayout(aba_LOCALIZACAO);
        aba_LOCALIZACAO.setLayout(aba_LOCALIZACAOLayout);
        aba_LOCALIZACAOLayout.setHorizontalGroup(
            aba_LOCALIZACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aba_LOCALIZACAOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_LOCALIZACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_Localizacao_Cadastro, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(botao_Localizacao_Lista, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(botao_Localizacao_Edicao, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(botao_Localizacao_Exclusao, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(corpo_CRUD_Localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        aba_LOCALIZACAOLayout.setVerticalGroup(
            aba_LOCALIZACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_LOCALIZACAOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_LOCALIZACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corpo_CRUD_Localizacao, javax.swing.GroupLayout.PREFERRED_SIZE, 1093, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aba_LOCALIZACAOLayout.createSequentialGroup()
                        .addComponent(botao_Localizacao_Lista)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Localizacao_Cadastro)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Localizacao_Edicao)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Localizacao_Exclusao)))
                .addContainerGap(638, Short.MAX_VALUE))
        );

        painelTabulado.addTab("LOCALIZAÇÃO", aba_LOCALIZACAO);

        corpo_CRUD_Configuracao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        corpo_CRUD_Configuracao.setPreferredSize(new java.awt.Dimension(1066, 104));

        subCorpo_FaixaCodigo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel7.setText("Faixa de Códigos Reg. Patrimonial");

        jLabel1.setText("De:");

        jLabel8.setText("Até:");

        jButton1.setText("Alterar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel9.setText("Faixa Atual:");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("500000");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("100000");

        jLabel12.setText("De:");

        jLabel13.setText("Até:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                        .addGap(43, 43, 43))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(178, 178, 178)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addContainerGap())
        );

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel14.setText("Alterar Faixa Atual:");

        javax.swing.GroupLayout subCorpo_FaixaCodigoLayout = new javax.swing.GroupLayout(subCorpo_FaixaCodigo);
        subCorpo_FaixaCodigo.setLayout(subCorpo_FaixaCodigoLayout);
        subCorpo_FaixaCodigoLayout.setHorizontalGroup(
            subCorpo_FaixaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subCorpo_FaixaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(subCorpo_FaixaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subCorpo_FaixaCodigoLayout.createSequentialGroup()
                        .addGroup(subCorpo_FaixaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(subCorpo_FaixaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 1008, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        subCorpo_FaixaCodigoLayout.setVerticalGroup(
            subCorpo_FaixaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subCorpo_FaixaCodigoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(subCorpo_FaixaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(subCorpo_FaixaCodigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        subCorpo_CRUD_Categoria.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botao_Categoria_Lista.setText("Lista");
        botao_Categoria_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Categoria_ListaActionPerformed(evt);
            }
        });

        botao_Categoria_Cadastro.setText("Cadastro");
        botao_Categoria_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Categoria_CadastroActionPerformed(evt);
            }
        });

        botao_Categoria_Edicao.setText("Edição");
        botao_Categoria_Edicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Categoria_EdicaoActionPerformed(evt);
            }
        });

        botao_Categoria_Exclusao.setText("Exclusão");

        javax.swing.GroupLayout subCorpo_CRUD_CategoriaLayout = new javax.swing.GroupLayout(subCorpo_CRUD_Categoria);
        subCorpo_CRUD_Categoria.setLayout(subCorpo_CRUD_CategoriaLayout);
        subCorpo_CRUD_CategoriaLayout.setHorizontalGroup(
            subCorpo_CRUD_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subCorpo_CRUD_CategoriaLayout.createSequentialGroup()
                .addGroup(subCorpo_CRUD_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tela_Categoria_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela_Categoria_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela_Categoria_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(subCorpo_CRUD_CategoriaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botao_Categoria_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_Categoria_Cadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Categoria_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Categoria_Exclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        subCorpo_CRUD_CategoriaLayout.setVerticalGroup(
            subCorpo_CRUD_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subCorpo_CRUD_CategoriaLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(subCorpo_CRUD_CategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_Categoria_Lista)
                    .addComponent(botao_Categoria_Cadastro)
                    .addComponent(botao_Categoria_Edicao)
                    .addComponent(botao_Categoria_Exclusao))
                .addGap(18, 18, 18)
                .addComponent(tela_Categoria_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Categoria_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Categoria_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subCorpo_CRUD_Status.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botao_Status_Lista.setText("Lista");
        botao_Status_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Status_ListaActionPerformed(evt);
            }
        });

        botao_Status_Cadastro.setText("Cadastro");
        botao_Status_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Status_CadastroActionPerformed(evt);
            }
        });

        botao_Status_Edicao.setText("Edição");
        botao_Status_Edicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Status_EdicaoActionPerformed(evt);
            }
        });

        botao_Status_Exclusao.setText("Exclusão");

        javax.swing.GroupLayout subCorpo_CRUD_StatusLayout = new javax.swing.GroupLayout(subCorpo_CRUD_Status);
        subCorpo_CRUD_Status.setLayout(subCorpo_CRUD_StatusLayout);
        subCorpo_CRUD_StatusLayout.setHorizontalGroup(
            subCorpo_CRUD_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subCorpo_CRUD_StatusLayout.createSequentialGroup()
                .addGroup(subCorpo_CRUD_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subCorpo_CRUD_StatusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botao_Status_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_Status_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_Status_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Status_Exclusao, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tela_Status_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela_Status_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela_Status_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        subCorpo_CRUD_StatusLayout.setVerticalGroup(
            subCorpo_CRUD_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subCorpo_CRUD_StatusLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(subCorpo_CRUD_StatusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_Status_Lista)
                    .addComponent(botao_Status_Cadastro)
                    .addComponent(botao_Status_Edicao)
                    .addComponent(botao_Status_Exclusao))
                .addGap(18, 18, 18)
                .addComponent(tela_Status_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Status_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Status_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        subCorpo_CRUD_Campus.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botao_Campus_Lista.setText("Lista");
        botao_Campus_Lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Campus_ListaActionPerformed(evt);
            }
        });

        botao_Campus_Cadastro.setText("Cadastro");
        botao_Campus_Cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Campus_CadastroActionPerformed(evt);
            }
        });

        botao_Campus_Edicao.setText("Edição");
        botao_Campus_Edicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Campus_EdicaoActionPerformed(evt);
            }
        });

        botao_Campus_Exclusao.setText("Exclusão");

        javax.swing.GroupLayout subCorpo_CRUD_CampusLayout = new javax.swing.GroupLayout(subCorpo_CRUD_Campus);
        subCorpo_CRUD_Campus.setLayout(subCorpo_CRUD_CampusLayout);
        subCorpo_CRUD_CampusLayout.setHorizontalGroup(
            subCorpo_CRUD_CampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subCorpo_CRUD_CampusLayout.createSequentialGroup()
                .addGroup(subCorpo_CRUD_CampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subCorpo_CRUD_CampusLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botao_Campus_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_Campus_Cadastro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botao_Campus_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botao_Campus_Exclusao))
                    .addComponent(tela_Campus_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela_Campus_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tela_Campus_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        subCorpo_CRUD_CampusLayout.setVerticalGroup(
            subCorpo_CRUD_CampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subCorpo_CRUD_CampusLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(subCorpo_CRUD_CampusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_Campus_Lista)
                    .addComponent(botao_Campus_Cadastro)
                    .addComponent(botao_Campus_Edicao)
                    .addComponent(botao_Campus_Exclusao))
                .addGap(18, 18, 18)
                .addComponent(tela_Campus_Cadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Campus_Edicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tela_Campus_Lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout corpo_CRUD_ConfiguracaoLayout = new javax.swing.GroupLayout(corpo_CRUD_Configuracao);
        corpo_CRUD_Configuracao.setLayout(corpo_CRUD_ConfiguracaoLayout);
        corpo_CRUD_ConfiguracaoLayout.setHorizontalGroup(
            corpo_CRUD_ConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corpo_CRUD_ConfiguracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(corpo_CRUD_ConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(subCorpo_CRUD_Campus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subCorpo_CRUD_Status, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subCorpo_CRUD_Categoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subCorpo_FaixaCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        corpo_CRUD_ConfiguracaoLayout.setVerticalGroup(
            corpo_CRUD_ConfiguracaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_CRUD_ConfiguracaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(subCorpo_FaixaCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subCorpo_CRUD_Categoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(subCorpo_CRUD_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subCorpo_CRUD_Campus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botao_Configuracao_FaixaCodigo.setText("Faixa Código");
        botao_Configuracao_FaixaCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Configuracao_FaixaCodigoActionPerformed(evt);
            }
        });

        botao_Configuracao_Categoria.setText("CATEGORIA");
        botao_Configuracao_Categoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Configuracao_CategoriaActionPerformed(evt);
            }
        });

        botao_Configuracao_Status.setText("STATUS");
        botao_Configuracao_Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Configuracao_StatusActionPerformed(evt);
            }
        });

        botao_Configuracao_Campus.setText("CAMPUS");
        botao_Configuracao_Campus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_Configuracao_CampusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aba_CONFIGURACAOLayout = new javax.swing.GroupLayout(aba_CONFIGURACAO);
        aba_CONFIGURACAO.setLayout(aba_CONFIGURACAOLayout);
        aba_CONFIGURACAOLayout.setHorizontalGroup(
            aba_CONFIGURACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aba_CONFIGURACAOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_CONFIGURACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botao_Configuracao_FaixaCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(botao_Configuracao_Categoria, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(botao_Configuracao_Status, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(botao_Configuracao_Campus, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(corpo_CRUD_Configuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        aba_CONFIGURACAOLayout.setVerticalGroup(
            aba_CONFIGURACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aba_CONFIGURACAOLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(aba_CONFIGURACAOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(corpo_CRUD_Configuracao, javax.swing.GroupLayout.PREFERRED_SIZE, 2822, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(aba_CONFIGURACAOLayout.createSequentialGroup()
                        .addComponent(botao_Configuracao_FaixaCodigo)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Configuracao_Categoria)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Configuracao_Status)
                        .addGap(18, 18, 18)
                        .addComponent(botao_Configuracao_Campus)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painelTabulado.addTab("CONFIGURAÇÃO", aba_CONFIGURACAO);

        corpo_TermoResponsabilidade.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        corpo_TermoResponsabilidade.setPreferredSize(new java.awt.Dimension(1066, 104));

        jButton2.setText("Gerar Termo Responsabilidade");

        javax.swing.GroupLayout corpo_TermoResponsabilidadeLayout = new javax.swing.GroupLayout(corpo_TermoResponsabilidade);
        corpo_TermoResponsabilidade.setLayout(corpo_TermoResponsabilidadeLayout);
        corpo_TermoResponsabilidadeLayout.setHorizontalGroup(
            corpo_TermoResponsabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(corpo_TermoResponsabilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(corpo_TermoResponsabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tela_Item_Lista1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        corpo_TermoResponsabilidadeLayout.setVerticalGroup(
            corpo_TermoResponsabilidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, corpo_TermoResponsabilidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tela_Item_Lista1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(corpo_TermoResponsabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(corpo_TermoResponsabilidade, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1068, Short.MAX_VALUE))
        );

        painelTabulado.addTab("TERMO RESPONSABILIDADE", jPanel1);

        painelLogin.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        botaoAcessarSistema.setText("Acessar Sistema");
        botaoAcessarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAcessarSistemaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel2.setText("Tela Login");

        campo_Login_Usuario.setText("admin");
        campo_Login_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_Login_UsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Usuário:");

        jLabel4.setText("Senha:");

        comboBox_Login_Campus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox_Login_CampusActionPerformed(evt);
            }
        });

        jLabel5.setText("Campus:");

        jPasswordField1.setText("jPasswordField1");

        campo_Login_Senha.setText("admin");

        javax.swing.GroupLayout painelLoginLayout = new javax.swing.GroupLayout(painelLogin);
        painelLogin.setLayout(painelLoginLayout);
        painelLoginLayout.setHorizontalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_Login_Senha, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(comboBox_Login_Campus, 0, 147, Short.MAX_VALUE)
                            .addComponent(campo_Login_Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(botaoAcessarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelLoginLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2)))
                .addGap(590, 590, 590))
        );
        painelLoginLayout.setVerticalGroup(
            painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBox_Login_Campus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campo_Login_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_Login_Senha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(botaoAcessarSistema)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelDadosUsuarioLogado.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setText("Usuário logado:");

        labelUsuarioLogado.setText("aquiVaiUsuárioLogado");

        javax.swing.GroupLayout panelDadosUsuarioLogadoLayout = new javax.swing.GroupLayout(panelDadosUsuarioLogado);
        panelDadosUsuarioLogado.setLayout(panelDadosUsuarioLogadoLayout);
        panelDadosUsuarioLogadoLayout.setHorizontalGroup(
            panelDadosUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosUsuarioLogadoLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDadosUsuarioLogadoLayout.setVerticalGroup(
            panelDadosUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosUsuarioLogadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(labelUsuarioLogado))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelDadosUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(956, 956, 956))
                    .addComponent(painelTabulado, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelDadosUsuarioLogado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelTabulado, javax.swing.GroupLayout.PREFERRED_SIZE, 1770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-1256)/2, (screenSize.height-788)/2, 1256, 788);
    }// </editor-fold>//GEN-END:initComponents

 /*   
    public void setSessao(boolean sessao){
    
        
        

    
        if( sessao ){
                painelTabulado.setVisible(true);
        
                tela_Item_CadastroLote.setVisible(false);
                tela_Item_Lista.setVisible(false);
                tela_Item_Lista.setVisible(true);
                aba_ITEM.revalidate();  
                corpo_CRUD_Item.revalidate();

        }else{
        
            painelTabulado.setVisible(false);
        
        }
    }
 */
    
    
    //insere dados do usuário logado no sistema
    public void setLabelUsuarioLogado(){
        
        labelUsuarioLogado.setVisible(true);
        labelUsuarioLogado.setText( campo_Login_Usuario.getText().toString() );
    
    }
    
    
    //insere dados na comboBox campus que está na tela de login
    public void setDadosComboBoxCampus(){
       
       DBCampus dbCampus = new DBCampus();

        try {        
        dbCampus.select("*", "" );
        
        int totalResultados = dbCampus.totalResultados( dbCampus.getResultSet());
        
        //inicializa um array de strins de dados vindos do banco
        String[] dados =  new String[ totalResultados ];
        

                int i = 0;         
                while( dbCampus.getResultSet().next() ){
                    //flag = true;
                    //JOptionPane.showMessageDialog(null, " VALOR RETORNO CONSULTA: "+conectaDB.resultSet.getString("login")+" | "+conectaDB.resultSet.getString("senha"));    
                    
                    dados[i] = dbCampus.getResultSet().getString("campus").toString();
                    i++;        
               }
                
                //comboBox_Login_Campus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));    
                
                //insere os dados no comboBox
                comboBox_Login_Campus.setModel(new javax.swing.DefaultComboBoxModel( dados ));    
                
            } catch (SQLException ex) {

                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    
    
private void botao_Item_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Item_ListaActionPerformed

        //habilita o botão "excluir em lote"
        botao_Item_ExclusaoLote.setEnabled(true);
    
    
        tela_Item_Lista.preeecherTabelaListaItens("");
    
    
        tela_Item_CadastroLote.setVisible(false);
        tela_Item_Edicao.setVisible(false);
        tela_Item_Lista.setVisible(true);

        tela_Item_CadastroLote.revalidate();
        tela_Item_Edicao.revalidate();
        tela_Item_Lista.revalidate();
        aba_ITEM.revalidate();     
        corpo_CRUD_Item.revalidate();
}//GEN-LAST:event_botao_Item_ListaActionPerformed

private void botao_Item_EdicaoLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Item_EdicaoLoteActionPerformed

        //preeche todos as opções de comboBox para a edição
        tela_Item_Edicao.preencheTodosComboBox();
    
    
        //desabilita o botão "excluir em lote"
        botao_Item_ExclusaoLote.setEnabled(false);
        
    
        tela_Item_CadastroLote.setVisible(false);
        tela_Item_Edicao.setVisible(true);
        tela_Item_Lista.setVisible(false);

        tela_Item_CadastroLote.revalidate();
        tela_Item_Edicao.revalidate();
        tela_Item_Lista.revalidate();
        aba_ITEM.revalidate();     
        corpo_CRUD_Item.revalidate();
        
        
        
        //cria um array somente com as linhas da tabela que foram selecionadas
        int[]  retorno = this.tela_Item_Lista.TabelaListaItens.getSelectedRows();
        
        //zera este array de dados para a próxima        
        itensSelecEdicao = new ArrayList<Item>();
        
        
        //baseado em int[] retorno (que está logo acima) preenche o array com os dados 
        //somente das linhas selecionadas e somente da primeira coluna [?][0] que é 
        //onde está o registro patrimonial do BD, que de fato é a informação coletada
           
        for(int i = 0; i < this.tela_Item_Lista.getItens().size(); i++){
           
            
            for(int j = 0; j < retorno.length; j++){
                
                if(  i == retorno[j]){
                    
                     itensSelecEdicao.add( this.tela_Item_Lista.getItens().get(i) );

                }
            }        
            
        }
        

        
        //preenche o atributo da classe Tela_Item_Edicao cuja qual será apresentada com os dados selecionados
        tela_Item_Edicao.setItensSelecionados(itensSelecEdicao);
       
               
               
        //chama o método da classe que vai ser instanciada (Tela_Item_Lista)
        tela_Item_Edicao.preeecheTabelaEditaItensLote();

    
}//GEN-LAST:event_botao_Item_EdicaoLoteActionPerformed


private void botao_Item_ExclusaoLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Item_ExclusaoLoteActionPerformed

    
            
        //cria um array somente com as linhas da tabela que foram selecionadas
        int[]  retorno = this.tela_Item_Lista.TabelaListaItens.getSelectedRows();
        
        //zera este array de dados para a próxima
        itensSelecExclusao = new ArrayList<Item>();                
        
        //baseado em int[] retorno (que está logo acima) preenche o array com objetos
        //do tipo Item para serem excluidos do banco de dados
        
        //percorre todos os itens da tabela gráfica
        for(int i = 0; i < this.tela_Item_Lista.getItens().size(); i++){
           
            
            for(int j = 0; j < retorno.length; j++){
                
                if(  i == retorno[j]){
                    
                     itensSelecExclusao.add( this.tela_Item_Lista.getItens().get(i) );

                }
            }        
            
        }
        
        Item item = new Item();
        //faz a exclusão dos itens selecionados
        for(int x = 0; x < itensSelecExclusao.size(); x++){
         
         
             item.deletarItem( itensSelecExclusao.get( x ) );
        }
        
         
         //atualiza a tabela gráfica em tempo real
         tela_Item_Lista.preeecherTabelaListaItens("");
        
         JOptionPane.showMessageDialog(null, "Exclusão realizado com Sucesso!");     

    
}//GEN-LAST:event_botao_Item_ExclusaoLoteActionPerformed

private void botaoAcessarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAcessarSistemaActionPerformed

    
     DBUsuario dbUsuario = new DBUsuario();
             
     dbUsuario.select("*", " where login = '"+campo_Login_Usuario.getText().toString()+"' AND senha = '"+campo_Login_Senha.getText().toString()+"' limit 1" );
     boolean flag = false;
     try {
            
            while( dbUsuario.getResultSet().next() ){
                flag = true;
                /*JOptionPane.showMessageDialog(null, " VALOR RETORNO CONSULTA: "+conectaDB.resultSet.getString("login")+
                        " | "+conectaDB.resultSet.getString("senha")+" | "+comboBox_Login_Campus.getSelectedItem().toString());       
                */
           }
        } catch (SQLException ex) {
            
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    if( flag ){
        
        panelDadosUsuarioLogado.setVisible(true);
        //insere dados do usuário logado no sistema
        setLabelUsuarioLogado();
        painelTabulado.setVisible(true);
        
        
        
        
        //TELAS ITEM
            aba_ITEM.revalidate();  
            corpo_CRUD_Item.revalidate();
            tela_Item_CadastroLote.setVisible(false);
            tela_Item_Edicao.setVisible(false);
            tela_Item_Lista.setVisible(true);
        
        //TELAS FORNECEDOR
            aba_FORNECEDOR.revalidate();
            corpo_CRUD_Fornecedor.revalidate();
            tela_Fornecedor_Lista.setVisible(true);
            tela_Fornecedor_Edicao.setVisible(false);
            tela_Fornecedor_Cadastro.setVisible(false);
            
        //TELAS RESPONSÁVEL
            aba_RESPONSAVEL.revalidate();
            corpo_CRUD_Responsavel.revalidate();
            tela_Responsavel_Cadastro.setVisible(false);
            tela_Responsavel_Edicao.setVisible(false);
            tela_Responsavel_Lista.setVisible(true);
            
        //TELAS USUÁRIO
            aba_USUARIO.revalidate();
            corpo_CRUD_Usuario.revalidate();
            tela_Usuario_Cadastro.setVisible(false);
            tela_Usuario_Edicao.setVisible(false);
            tela_Usuario_Lista.setVisible(true);
            
       // TELAS LOCALIZAÇÃO
            aba_LOCALIZACAO.revalidate();
            corpo_CRUD_Localizacao.revalidate();
            tela_Localizacao_Cadastro.setVisible(false);
            tela_Localizacao_Edicao.setVisible(false);
            tela_Localizacao_Lista.setVisible(true);
            
       // CONFIGURAÇÕES          
            corpo_CRUD_Configuracao.revalidate();
            subCorpo_FaixaCodigo.setVisible(true);
            subCorpo_CRUD_Campus.setVisible(false);
            subCorpo_CRUD_Categoria.setVisible(false);
            subCorpo_CRUD_Status.setVisible(false);
            
            
            
            

        //JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!");               
    }else{
    
        JOptionPane.showMessageDialog(null, "Erro, os dados informados estão incorretos, tente mais tarde.");               
    }
    
    

    
    
}//GEN-LAST:event_botaoAcessarSistemaActionPerformed

private void comboBox_Login_CampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox_Login_CampusActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_comboBox_Login_CampusActionPerformed

private void campo_Login_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_Login_UsuarioActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_campo_Login_UsuarioActionPerformed

private void botao_Item_CadastroLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Item_CadastroLoteActionPerformed

        //preenche dados dos comboBoxs
        tela_Item_CadastroLote.preencheDadosFormulario();
        
        
        //esconde o formulário interno de cadastro de fornecedor
        //tela_Item_CadastroLote.panelCadInternoFornecedor.setVisible(false);
        
    
        tela_Item_CadastroLote.setVisible(true);
        tela_Item_Lista.setVisible(false);
        tela_Item_Edicao.setVisible(false);

        tela_Item_CadastroLote.revalidate();
        tela_Item_Lista.revalidate();
        tela_Item_Lista.revalidate();
        aba_ITEM.revalidate();    
        corpo_CRUD_Item.revalidate();
    
}//GEN-LAST:event_botao_Item_CadastroLoteActionPerformed

private void botao_Fornecedor_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Fornecedor_ListaActionPerformed


     aba_FORNECEDOR.revalidate();
     corpo_CRUD_Fornecedor.revalidate();
     tela_Fornecedor_Lista.setVisible(true);
     tela_Fornecedor_Edicao.setVisible(false);
     tela_Fornecedor_Cadastro.setVisible(false);

}//GEN-LAST:event_botao_Fornecedor_ListaActionPerformed

private void botao_Fornecedor_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Fornecedor_CadastroActionPerformed

     aba_FORNECEDOR.revalidate();
     corpo_CRUD_Fornecedor.revalidate();
     tela_Fornecedor_Lista.setVisible(false);
     tela_Fornecedor_Edicao.setVisible(false);
     tela_Fornecedor_Cadastro.setVisible(true);


}//GEN-LAST:event_botao_Fornecedor_CadastroActionPerformed

private void botao_Fornecedor_EdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Fornecedor_EdicaoActionPerformed

    
     aba_FORNECEDOR.revalidate();
     corpo_CRUD_Fornecedor.revalidate();
     tela_Fornecedor_Lista.setVisible(false);
     tela_Fornecedor_Edicao.setVisible(true);
     tela_Fornecedor_Cadastro.setVisible(false);

}//GEN-LAST:event_botao_Fornecedor_EdicaoActionPerformed

private void botao_Responsavel_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Responsavel_ListaActionPerformed

    
            aba_RESPONSAVEL.revalidate();
            corpo_CRUD_Responsavel.revalidate();
            tela_Responsavel_Cadastro.setVisible(false);
            tela_Responsavel_Edicao.setVisible(false);
            tela_Responsavel_Lista.setVisible(true);

    
}//GEN-LAST:event_botao_Responsavel_ListaActionPerformed

private void botao_Responsavel_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Responsavel_CadastroActionPerformed

            aba_RESPONSAVEL.revalidate();
            corpo_CRUD_Responsavel.revalidate();
            tela_Responsavel_Cadastro.setVisible(true);
            tela_Responsavel_Edicao.setVisible(false);
            tela_Responsavel_Lista.setVisible(false);

}//GEN-LAST:event_botao_Responsavel_CadastroActionPerformed

private void botao_Responsavel_EdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Responsavel_EdicaoActionPerformed

            aba_RESPONSAVEL.revalidate();
            corpo_CRUD_Responsavel.revalidate();
            tela_Responsavel_Cadastro.setVisible(false);
            tela_Responsavel_Edicao.setVisible(true);
            tela_Responsavel_Lista.setVisible(false);


}//GEN-LAST:event_botao_Responsavel_EdicaoActionPerformed

private void botao_Usuario_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Usuario_ListaActionPerformed

    
            aba_USUARIO.revalidate();
            corpo_CRUD_Usuario.revalidate();
            tela_Usuario_Cadastro.setVisible(false);
            tela_Usuario_Edicao.setVisible(false);
            tela_Usuario_Lista.setVisible(true);

    
}//GEN-LAST:event_botao_Usuario_ListaActionPerformed

private void botao_Usuario_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Usuario_CadastroActionPerformed

            aba_USUARIO.revalidate();
            corpo_CRUD_Usuario.revalidate();
            tela_Usuario_Cadastro.setVisible(true);
            tela_Usuario_Edicao.setVisible(false);
            tela_Usuario_Lista.setVisible(false);

    
}//GEN-LAST:event_botao_Usuario_CadastroActionPerformed

private void botao_Usuario_EdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Usuario_EdicaoActionPerformed

    
            aba_USUARIO.revalidate();
            corpo_CRUD_Usuario.revalidate();
            tela_Usuario_Cadastro.setVisible(false);
            tela_Usuario_Edicao.setVisible(true);
            tela_Usuario_Lista.setVisible(false);
}//GEN-LAST:event_botao_Usuario_EdicaoActionPerformed

private void botao_Localizacao_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Localizacao_ListaActionPerformed

            aba_LOCALIZACAO.revalidate();
            corpo_CRUD_Localizacao.revalidate();
            tela_Localizacao_Cadastro.setVisible(false);
            tela_Localizacao_Edicao.setVisible(false);
            tela_Localizacao_Lista.setVisible(true);
    
}//GEN-LAST:event_botao_Localizacao_ListaActionPerformed

private void botao_Localizacao_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Localizacao_CadastroActionPerformed

    
            aba_LOCALIZACAO.revalidate();
            corpo_CRUD_Localizacao.revalidate();
            tela_Localizacao_Cadastro.setVisible(true);
            tela_Localizacao_Edicao.setVisible(false);
            tela_Localizacao_Lista.setVisible(false);

    
}//GEN-LAST:event_botao_Localizacao_CadastroActionPerformed

private void botao_Localizacao_EdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Localizacao_EdicaoActionPerformed

    
            aba_LOCALIZACAO.revalidate();
            corpo_CRUD_Localizacao.revalidate();
            tela_Localizacao_Cadastro.setVisible(false);
            tela_Localizacao_Edicao.setVisible(true);
            tela_Localizacao_Lista.setVisible(false);

}//GEN-LAST:event_botao_Localizacao_EdicaoActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void botao_Configuracao_FaixaCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Configuracao_FaixaCodigoActionPerformed

    
            corpo_CRUD_Configuracao.revalidate();
            
            subCorpo_FaixaCodigo.setVisible(true);
            subCorpo_CRUD_Campus.setVisible(false);
            subCorpo_CRUD_Categoria.setVisible(false);
            subCorpo_CRUD_Status.setVisible(false);

    
}//GEN-LAST:event_botao_Configuracao_FaixaCodigoActionPerformed

private void botao_Configuracao_CategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Configuracao_CategoriaActionPerformed

    
            corpo_CRUD_Configuracao.revalidate();
            
            subCorpo_FaixaCodigo.setVisible(false);
            subCorpo_CRUD_Campus.setVisible(false);
            subCorpo_CRUD_Categoria.setVisible(true);
            subCorpo_CRUD_Status.setVisible(false);
            
            tela_Categoria_Cadastro.setVisible(false);
            tela_Categoria_Edicao.setVisible(false);
            tela_Categoria_Lista.setVisible(true);
            
            
            
    
}//GEN-LAST:event_botao_Configuracao_CategoriaActionPerformed

private void botao_Configuracao_StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Configuracao_StatusActionPerformed

    
    
            corpo_CRUD_Configuracao.revalidate();
            
            subCorpo_FaixaCodigo.setVisible(false);
            subCorpo_CRUD_Campus.setVisible(false);
            subCorpo_CRUD_Categoria.setVisible(false);
            subCorpo_CRUD_Status.setVisible(true);
            
            tela_Status_Cadastro.setVisible(false);
            tela_Status_Edicao.setVisible(false);
            tela_Status_Lista.setVisible(true);            
            
            
}//GEN-LAST:event_botao_Configuracao_StatusActionPerformed

private void botao_Configuracao_CampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Configuracao_CampusActionPerformed

    
            corpo_CRUD_Configuracao.revalidate();
            
            subCorpo_FaixaCodigo.setVisible(false);
            subCorpo_CRUD_Campus.setVisible(true);
            subCorpo_CRUD_Categoria.setVisible(false);
            subCorpo_CRUD_Status.setVisible(false);
            
            
            tela_Campus_Cadastro.setVisible(false);
            tela_Campus_Edicao.setVisible(false);
            tela_Campus_Lista.setVisible(true);
    
    
}//GEN-LAST:event_botao_Configuracao_CampusActionPerformed

private void botao_Categoria_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Categoria_ListaActionPerformed

    
            tela_Categoria_Cadastro.setVisible(false);
            tela_Categoria_Edicao.setVisible(false);
            tela_Categoria_Lista.setVisible(true);

    
}//GEN-LAST:event_botao_Categoria_ListaActionPerformed

private void botao_Categoria_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Categoria_CadastroActionPerformed

            tela_Categoria_Cadastro.setVisible(true);
            tela_Categoria_Edicao.setVisible(false);
            tela_Categoria_Lista.setVisible(false);
    
}//GEN-LAST:event_botao_Categoria_CadastroActionPerformed

private void botao_Categoria_EdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Categoria_EdicaoActionPerformed

            tela_Categoria_Cadastro.setVisible(false);
            tela_Categoria_Edicao.setVisible(true);
            tela_Categoria_Lista.setVisible(false);

    
}//GEN-LAST:event_botao_Categoria_EdicaoActionPerformed

private void botao_Status_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Status_ListaActionPerformed

    
            tela_Status_Cadastro.setVisible(false);
            tela_Status_Edicao.setVisible(false);
            tela_Status_Lista.setVisible(true);        
}//GEN-LAST:event_botao_Status_ListaActionPerformed

private void botao_Status_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Status_CadastroActionPerformed

            tela_Status_Cadastro.setVisible(true);
            tela_Status_Edicao.setVisible(false);
            tela_Status_Lista.setVisible(false);        
    
}//GEN-LAST:event_botao_Status_CadastroActionPerformed

private void botao_Status_EdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Status_EdicaoActionPerformed

            tela_Status_Cadastro.setVisible(false);
            tela_Status_Edicao.setVisible(true);
            tela_Status_Lista.setVisible(false);        
    
}//GEN-LAST:event_botao_Status_EdicaoActionPerformed

private void botao_Campus_ListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Campus_ListaActionPerformed

    
            tela_Campus_Cadastro.setVisible(false);
            tela_Campus_Edicao.setVisible(false);
            tela_Campus_Lista.setVisible(true);
            
}//GEN-LAST:event_botao_Campus_ListaActionPerformed

private void botao_Campus_CadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Campus_CadastroActionPerformed

            tela_Campus_Cadastro.setVisible(true);
            tela_Campus_Edicao.setVisible(false);
            tela_Campus_Lista.setVisible(false);
            
    
}//GEN-LAST:event_botao_Campus_CadastroActionPerformed

private void botao_Campus_EdicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_Campus_EdicaoActionPerformed

    
            tela_Campus_Cadastro.setVisible(false);
            tela_Campus_Edicao.setVisible(true);
            tela_Campus_Lista.setVisible(false);

    
    
}//GEN-LAST:event_botao_Campus_EdicaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aba_CONFIGURACAO;
    private javax.swing.JPanel aba_FORNECEDOR;
    private javax.swing.JPanel aba_ITEM;
    private javax.swing.JPanel aba_LOCALIZACAO;
    private javax.swing.JPanel aba_RESPONSAVEL;
    private javax.swing.JPanel aba_USUARIO;
    private javax.swing.JButton botaoAcessarSistema;
    private javax.swing.JButton botao_Campus_Cadastro;
    private javax.swing.JButton botao_Campus_Edicao;
    private javax.swing.JButton botao_Campus_Exclusao;
    private javax.swing.JButton botao_Campus_Lista;
    private javax.swing.JButton botao_Categoria_Cadastro;
    private javax.swing.JButton botao_Categoria_Edicao;
    private javax.swing.JButton botao_Categoria_Exclusao;
    private javax.swing.JButton botao_Categoria_Lista;
    private javax.swing.JButton botao_Configuracao_Campus;
    private javax.swing.JButton botao_Configuracao_Categoria;
    private javax.swing.JButton botao_Configuracao_FaixaCodigo;
    private javax.swing.JButton botao_Configuracao_Status;
    private javax.swing.JButton botao_Fornecedor_Cadastro;
    private javax.swing.JButton botao_Fornecedor_Edicao;
    private javax.swing.JButton botao_Fornecedor_Exclusao;
    private javax.swing.JButton botao_Fornecedor_Lista;
    private javax.swing.JButton botao_Item_CadastroLote;
    private javax.swing.JButton botao_Item_EdicaoLote;
    public javax.swing.JButton botao_Item_ExclusaoLote;
    private javax.swing.JButton botao_Item_Lista;
    private javax.swing.JButton botao_Localizacao_Cadastro;
    private javax.swing.JButton botao_Localizacao_Edicao;
    private javax.swing.JButton botao_Localizacao_Exclusao;
    private javax.swing.JButton botao_Localizacao_Lista;
    private javax.swing.JButton botao_Responsavel_Cadastro;
    private javax.swing.JButton botao_Responsavel_Edicao;
    private javax.swing.JButton botao_Responsavel_Exclusao;
    private javax.swing.JButton botao_Responsavel_Lista;
    private javax.swing.JButton botao_Status_Cadastro;
    private javax.swing.JButton botao_Status_Edicao;
    private javax.swing.JButton botao_Status_Exclusao;
    private javax.swing.JButton botao_Status_Lista;
    private javax.swing.JButton botao_Usuario_Cadastro;
    private javax.swing.JButton botao_Usuario_Edicao;
    private javax.swing.JButton botao_Usuario_Exclusao;
    private javax.swing.JButton botao_Usuario_Lista;
    private javax.swing.JPasswordField campo_Login_Senha;
    private javax.swing.JTextField campo_Login_Usuario;
    private javax.swing.JComboBox comboBox_Login_Campus;
    private javax.swing.JPanel corpo_CRUD_Configuracao;
    private javax.swing.JPanel corpo_CRUD_Fornecedor;
    private javax.swing.JPanel corpo_CRUD_Item;
    private javax.swing.JPanel corpo_CRUD_Localizacao;
    private javax.swing.JPanel corpo_CRUD_Responsavel;
    private javax.swing.JPanel corpo_CRUD_Usuario;
    private javax.swing.JPanel corpo_TermoResponsabilidade;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelUsuarioLogado;
    private javax.swing.JPanel painelLogin;
    private javax.swing.JTabbedPane painelTabulado;
    private javax.swing.JPanel panelDadosUsuarioLogado;
    private javax.swing.JPanel subCorpo_CRUD_Campus;
    private javax.swing.JPanel subCorpo_CRUD_Categoria;
    private javax.swing.JPanel subCorpo_CRUD_Status;
    private javax.swing.JPanel subCorpo_FaixaCodigo;
    private view.Tela_Campus_Cadastro tela_Campus_Cadastro;
    private view.Tela_Campus_Edicao tela_Campus_Edicao;
    private view.Tela_Campus_Lista tela_Campus_Lista;
    private view.Tela_Categoria_Cadastro tela_Categoria_Cadastro;
    private view.Tela_Categoria_Edicao tela_Categoria_Edicao;
    private view.Tela_Categoria_Lista tela_Categoria_Lista;
    private view.Tela_Fornecedor_Cadastro tela_Fornecedor_Cadastro;
    private view.Tela_Fornecedor_Edicao tela_Fornecedor_Edicao;
    private view.Tela_Fornecedor_Lista tela_Fornecedor_Lista;
    private view.Tela_Item_CadastroLote tela_Item_CadastroLote;
    private view.Tela_Item_Edicao tela_Item_Edicao;
    private view.Tela_Item_Lista tela_Item_Lista;
    private view.Tela_Item_Lista tela_Item_Lista1;
    private view.Tela_Localizacao_Cadastro tela_Localizacao_Cadastro;
    private view.Tela_Localizacao_Edicao tela_Localizacao_Edicao;
    private view.Tela_Localizacao_Lista tela_Localizacao_Lista;
    private view.Tela_Responsavel_Cadastro tela_Responsavel_Cadastro;
    private view.Tela_Responsavel_Edicao tela_Responsavel_Edicao;
    private view.Tela_Responsavel_Lista tela_Responsavel_Lista;
    private view.Tela_Status_Cadastro tela_Status_Cadastro;
    private view.Tela_Status_Edicao tela_Status_Edicao;
    private view.Tela_Status_Lista tela_Status_Lista;
    private view.Tela_Usuario_Cadastro tela_Usuario_Cadastro;
    private view.Tela_Usuario_Edicao tela_Usuario_Edicao;
    private view.Tela_Usuario_Lista tela_Usuario_Lista;
    // End of variables declaration//GEN-END:variables

    
    
    public ArrayList<Integer> getIdsItensSelecionados() {
        return idsItensSelecionados;
    }

    
    public void setIdsItensSelecionados(ArrayList<Integer> idsItensSelecionados) {
        this.idsItensSelecionados = idsItensSelecionados;
    }
    
    
    
}
