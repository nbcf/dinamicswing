/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.frame.View;

import br.teste.beans.MovimentoDet;
import br.teste.beans.Produtos;
import br.teste.engine.dataClock;
import br.teste.frame.imports.jpanel.ImportClienteView;
import br.teste.frame.imports.jpanel.ImportEntregadorView;
import br.teste.frame.imports.jpanel.ImportVendedorView;
import br.teste.frame.jDialogs.ImportProdutosJDialog;

import java.awt.EventQueue;
import java.beans.Beans;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.RollbackException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author nil_b
 */
public class MovimentoView1 extends JPanel {
    private static double custoServico = 0.0;
    private static double valorCouver = 0.0;
    
    private static double armazenaTotalApagar = 0.0;
    
    private static JFrame frameMovimentoView1;
       dataClock mostra_data;
    public static MovimentoView1 vendanomeada;
    public static String armazenaHora;
    public MovimentoView1() {
        initComponents();
        if (!Beans.isDesignTime()) {
            entityManager.getTransaction().begin();
                mostra_data = new dataClock();

        mostra_data.le_data();
    
            
            mostra_data.le_hora();
              timer1.start();
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("restaurante?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        query = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT M FROM MovimentoCab M");
        list = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(query.getResultList());
        produtoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM LocalPedido l");
        localPedidoList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : produtoQuery.getResultList();
        jLabel13 = new javax.swing.JLabel();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jmi_pagarPedido = new javax.swing.JMenuItem();
        jmi_alterarComanda = new javax.swing.JMenuItem();
        jmi_alterarOrigem = new javax.swing.JMenuItem();
        jmi_obsPedido = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel48 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        funcionariosQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT f FROM Funcionarios f");
        funcionariosList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : funcionariosQuery.getResultList();
        localPedidoQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT l FROM LocalPedido l");
        localPedidoList1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : localPedidoQuery.getResultList();
        funcionariosListCellRenderer1 = new br.teste.renderer.FuncionariosListCellRenderer();
        locaisListCellRenderer1 = new br.teste.renderer.LocaisListCellRenderer();
        jfr_novoPedido = new javax.swing.JFrame();
        jButton22 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jtf_idCliente = new javax.swing.JTextField();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jtf_cep = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtf_zap = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jtf_tipoPessoa = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jtf_rzs_rg = new javax.swing.JTextField();
        jtf_valorEntrega = new javax.swing.JTextField();
        jtf_numeroComanda = new javax.swing.JTextField();
        jtf_nomeVendedor = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtf_logradouro = new javax.swing.JTextField();
        jtf_complemento = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jtf_genero = new javax.swing.JTextField();
        jtf_cnpj_cpf = new javax.swing.JTextField();
        jButton26 = new javax.swing.JButton();
        jtf_cidade = new javax.swing.JTextField();
        jtf_idVendedor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtf_nomeCliente = new javax.swing.JTextField();
        jtf_bairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jtf_uf = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jtf_nomeEntregador = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jfr_movimento = new javax.swing.JFrame();
        masterScrollPane = new javax.swing.JScrollPane();
        masterTable = new javax.swing.JTable();
        jFrame3 = new javax.swing.JFrame();
        jTextField1 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jtf_idCliente1 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jtf_logradouro1 = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jtf_tipoPessoa1 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jtf_cidade1 = new javax.swing.JTextField();
        jtf_nomeVendedor1 = new javax.swing.JTextField();
        jButton27 = new javax.swing.JButton();
        jtf_nomeEntregador1 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jtf_genero1 = new javax.swing.JTextField();
        jtf_numeroComanda1 = new javax.swing.JTextField();
        jtf_complemento1 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jtf_bairro1 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jtf_uf1 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jtf_valorEntrega1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jtf_rzs_rg1 = new javax.swing.JTextField();
        jLabel77 = new javax.swing.JLabel();
        jtf_idVendedor1 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jtf_nomeCliente1 = new javax.swing.JTextField();
        jtf_zap1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jtf_cep1 = new javax.swing.JTextField();
        jtf_cnpj_cpf1 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jfr_pagarMovimento = new javax.swing.JFrame();
        jLabel30 = new javax.swing.JLabel();
        jtf_valorTotalApagar1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jtf_dinheiro1 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jtf_pix1 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jtf_debito1 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jtf_credito1 = new javax.swing.JTextField();
        jcb_tipoPagamento = new javax.swing.JComboBox<>();
        jtf_troco1 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jcheck_couver = new javax.swing.JCheckBox();
        jcheck_TaxaServico = new javax.swing.JCheckBox();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jtf_codProduto = new javax.swing.JTextField();
        jtf_nomeProduto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtf_tipoProduto = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtf_quantidade = new javax.swing.JTextField();
        detailScrollPane = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        horaMovField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jtf_comandaDetalhe = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel52 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jtf_tipoMovimento = new javax.swing.JTextField();

        FormListener formListener = new FormListener();

        jLabel13.setText("jLabel13");

        jmi_pagarPedido.setText("Pagar Pedido");
        jmi_pagarPedido.addActionListener(formListener);
        jPopupMenu1.add(jmi_pagarPedido);

        jmi_alterarComanda.setText("Alterar Comanda");
        jmi_alterarComanda.addActionListener(formListener);
        jPopupMenu1.add(jmi_alterarComanda);

        jmi_alterarOrigem.setText("Alterar Origem do Pedido");
        jmi_alterarOrigem.addActionListener(formListener);
        jPopupMenu1.add(jmi_alterarOrigem);

        jmi_obsPedido.setText("Observações do Pedido");
        jPopupMenu1.add(jmi_obsPedido);
        jPopupMenu1.add(jSeparator1);

        jMenuItem3.setText("Fechar");
        jMenuItem3.addActionListener(formListener);
        jPopupMenu1.add(jMenuItem3);

        jLabel48.setText("jLabel48");

        jButton10.setText("jButton10");

        timer1.addTimerListener(formListener);

        funcionariosListCellRenderer1.setText("funcionariosListCellRenderer1");

        locaisListCellRenderer1.setText("locaisListCellRenderer1");

        jButton22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton22.setText("Confirmar");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton22, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton22.addActionListener(formListener);

        jButton24.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton24.setText("Cancelar");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton24, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idCliente}"), jtf_idCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtf_cep.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cep}"), jtf_cep, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_cep, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("CLIENTE:");

        jtf_zap.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.zap}"), jtf_zap, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_zap, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("COMPLEMENTO:");

        jLabel28.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel28.setText("COMANDA:");

        jtf_tipoPessoa.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tipoPessoa}"), jtf_tipoPessoa, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_tipoPessoa, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel73.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel73.setText("ENTREGA:");

        jLabel70.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel70.setText("CEP:");

        jtf_rzs_rg.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.rzsRg}"), jtf_rzs_rg, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_rzs_rg, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_valorEntrega.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.valorFrete}"), jtf_valorEntrega, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_valorEntrega, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_numeroComanda.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.numeroComanda}"), jtf_numeroComanda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_numeroComanda, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_nomeVendedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.vendedor}"), jtf_nomeVendedor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_nomeVendedor, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel21.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel21.setText("TIPO PESSOA:");

        jLabel74.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel74.setText("ZAP:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("CPF_CNPJ");

        jtf_logradouro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.logradouro}"), jtf_logradouro, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_logradouro, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_complemento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.complemento}"), jtf_complemento, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_complemento, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel71.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel71.setText("UF:");

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewmag.png"))); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton16, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton16.addActionListener(formListener);

        jtf_genero.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.genero}"), jtf_genero, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_genero, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_cnpj_cpf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cnpjCpf}"), jtf_cnpj_cpf, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_cnpj_cpf, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewmag.png"))); // NOI18N
        jButton26.addActionListener(formListener);

        jtf_cidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cidade}"), jtf_cidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_cidade, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_idVendedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idVendedor}"), jtf_idVendedor, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_idVendedor, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("BAIRRO:");

        jtf_nomeCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliente}"), jtf_nomeCliente, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_nomeCliente, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jtf_bairro.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.bairro}"), jtf_bairro, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_bairro, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("LOGRADOURO:");

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewmag.png"))); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jButton15, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jButton15.addActionListener(formListener);

        jtf_uf.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.uf}"), jtf_uf, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_uf, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel22.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel22.setText("GENERO:");

        jtf_nomeEntregador.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.entregador}"), jtf_nomeEntregador, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement != null}"), jtf_nomeEntregador, org.jdesktop.beansbinding.BeanProperty.create("enabled"));
        bindingGroup.addBinding(binding);

        jLabel15.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel15.setText("RZS_RG");

        jLabel39.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel39.setText("VALOR ENTREGA:");

        jLabel72.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel72.setText("VENDEDOR:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel7.setText("CIDADE:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_bairro)
                            .addComponent(jtf_complemento)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel15)
                            .addComponent(jLabel74))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_zap)
                            .addComponent(jtf_rzs_rg, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_logradouro)
                            .addComponent(jtf_cnpj_cpf)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_tipoPessoa)
                            .addComponent(jtf_genero, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel28))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_cidade)
                            .addComponent(jtf_numeroComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel70)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel72)
                            .addComponent(jLabel73))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_idVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nomeVendedor))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nomeEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel39)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_valorEntrega)))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton26, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_nomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel21)
                        .addComponent(jtf_tipoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_cnpj_cpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jtf_genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtf_rzs_rg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel74)
                    .addComponent(jtf_zap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtf_logradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtf_complemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtf_bairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel70)
                    .addComponent(jtf_cep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel71)
                    .addComponent(jtf_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jtf_numeroComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel72)
                        .addComponent(jtf_nomeVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_idVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel73)
                        .addComponent(jtf_nomeEntregador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_valorEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel39)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Novo Pedido", jPanel7);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Pedidos Anteriores", jPanel8);

        javax.swing.GroupLayout jfr_novoPedidoLayout = new javax.swing.GroupLayout(jfr_novoPedido.getContentPane());
        jfr_novoPedido.getContentPane().setLayout(jfr_novoPedidoLayout);
        jfr_novoPedidoLayout.setHorizontalGroup(
            jfr_novoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfr_novoPedidoLayout.createSequentialGroup()
                .addGroup(jfr_novoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jfr_novoPedidoLayout.createSequentialGroup()
                        .addGap(130, 517, Short.MAX_VALUE)
                        .addComponent(jtf_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton24)
                        .addGap(18, 18, 18)
                        .addComponent(jButton22))
                    .addGroup(jfr_novoPedidoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jfr_novoPedidoLayout.setVerticalGroup(
            jfr_novoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfr_novoPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addGap(18, 18, 18)
                .addGroup(jfr_novoPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton22)
                    .addComponent(jButton24)
                    .addComponent(jtf_idCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        masterTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, list, masterTable);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMovimentoCab}"));
        columnBinding.setColumnName("Id Movimento Cab");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagEstatusMovcab}"));
        columnBinding.setColumnName("Flag Estatus Movcab");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${movimento}"));
        columnBinding.setColumnName("Movimento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoMovimento}"));
        columnBinding.setColumnName("Tipo Movimento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataMovimento}"));
        columnBinding.setColumnName("Data Movimento");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaMovimento}"));
        columnBinding.setColumnName("Hora Movimento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaEnvio}"));
        columnBinding.setColumnName("Hora Envio");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${vendedor}"));
        columnBinding.setColumnName("Vendedor");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoPagto}"));
        columnBinding.setColumnName("Tipo Pagto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoAgregadorPgto}"));
        columnBinding.setColumnName("Tipo Agregador Pgto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caixa}"));
        columnBinding.setColumnName("Caixa");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagEntrega}"));
        columnBinding.setColumnName("Flag Entrega");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliente}"));
        columnBinding.setColumnName("Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLoja}"));
        columnBinding.setColumnName("Id Loja");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCaixa}"));
        columnBinding.setColumnName("Id Caixa");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idOperador}"));
        columnBinding.setColumnName("Id Operador");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idVendedor}"));
        columnBinding.setColumnName("Id Vendedor");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoLocal}"));
        columnBinding.setColumnName("Tipo Local");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalConsumo}"));
        columnBinding.setColumnName("Total Consumo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${taxaServico}"));
        columnBinding.setColumnName("Taxa Servico");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${taxaCouver}"));
        columnBinding.setColumnName("Taxa Couver");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${local}"));
        columnBinding.setColumnName("Local");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${loja}"));
        columnBinding.setColumnName("Loja");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${operador}"));
        columnBinding.setColumnName("Operador");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${recebidoDebito}"));
        columnBinding.setColumnName("Recebido Debito");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${recebidoDinheiro}"));
        columnBinding.setColumnName("Recebido Dinheiro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${recebidoCred}"));
        columnBinding.setColumnName("Recebido Cred");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${recebidoPix}"));
        columnBinding.setColumnName("Recebido Pix");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalMovimento}"));
        columnBinding.setColumnName("Total Movimento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalPago}"));
        columnBinding.setColumnName("Total Pago");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${troco}"));
        columnBinding.setColumnName("Troco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${valorFrete}"));
        columnBinding.setColumnName("Valor Frete");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${logradouro}"));
        columnBinding.setColumnName("Logradouro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${complemento}"));
        columnBinding.setColumnName("Complemento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairro}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cep}"));
        columnBinding.setColumnName("Cep");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidade}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${uf}"));
        columnBinding.setColumnName("Uf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${entregador}"));
        columnBinding.setColumnName("Entregador");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${recebedor}"));
        columnBinding.setColumnName("Recebedor");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataEntregue}"));
        columnBinding.setColumnName("Data Entregue");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaEntregue}"));
        columnBinding.setColumnName("Hora Entregue");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataEnvio}"));
        columnBinding.setColumnName("Data Envio");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bandeira}"));
        columnBinding.setColumnName("Bandeira");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroCartao}"));
        columnBinding.setColumnName("Numero Cartao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cartao}"));
        columnBinding.setColumnName("Cartao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliLogradouro}"));
        columnBinding.setColumnName("Cli Logradouro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliComplemento}"));
        columnBinding.setColumnName("Cli Complemento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliBairro}"));
        columnBinding.setColumnName("Cli Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCep}"));
        columnBinding.setColumnName("Cli Cep");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliCidade}"));
        columnBinding.setColumnName("Cli Cidade");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliUf}"));
        columnBinding.setColumnName("Cli Uf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cliTrocoPara}"));
        columnBinding.setColumnName("Cli Troco Para");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${zap}"));
        columnBinding.setColumnName("Zap");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${numeroComanda}"));
        columnBinding.setColumnName("Numero Comanda");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descProduto}"));
        columnBinding.setColumnName("Desc Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliente}"));
        columnBinding.setColumnName("Id Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rzsRg}"));
        columnBinding.setColumnName("Rzs Rg");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cnpjCpf}"));
        columnBinding.setColumnName("Cnpj Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${genero}"));
        columnBinding.setColumnName("Genero");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoPessoa}"));
        columnBinding.setColumnName("Tipo Pessoa");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${trocoParaEntrega}"));
        columnBinding.setColumnName("Troco Para Entrega");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        masterScrollPane.setViewportView(masterTable);
        if (masterTable.getColumnModel().getColumnCount() > 0) {
            masterTable.getColumnModel().getColumn(0).setResizable(false);
            masterTable.getColumnModel().getColumn(0).setPreferredWidth(70);
            masterTable.getColumnModel().getColumn(1).setResizable(false);
            masterTable.getColumnModel().getColumn(1).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(2).setResizable(false);
            masterTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            masterTable.getColumnModel().getColumn(3).setResizable(false);
            masterTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(4).setResizable(false);
            masterTable.getColumnModel().getColumn(4).setPreferredWidth(70);
            masterTable.getColumnModel().getColumn(5).setResizable(false);
            masterTable.getColumnModel().getColumn(5).setPreferredWidth(70);
            masterTable.getColumnModel().getColumn(6).setResizable(false);
            masterTable.getColumnModel().getColumn(7).setResizable(false);
            masterTable.getColumnModel().getColumn(7).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(8).setResizable(false);
            masterTable.getColumnModel().getColumn(8).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(9).setResizable(false);
            masterTable.getColumnModel().getColumn(9).setPreferredWidth(80);
            masterTable.getColumnModel().getColumn(10).setResizable(false);
            masterTable.getColumnModel().getColumn(11).setResizable(false);
            masterTable.getColumnModel().getColumn(12).setResizable(false);
            masterTable.getColumnModel().getColumn(13).setResizable(false);
            masterTable.getColumnModel().getColumn(14).setResizable(false);
            masterTable.getColumnModel().getColumn(15).setResizable(false);
            masterTable.getColumnModel().getColumn(16).setResizable(false);
            masterTable.getColumnModel().getColumn(17).setResizable(false);
            masterTable.getColumnModel().getColumn(18).setResizable(false);
            masterTable.getColumnModel().getColumn(19).setResizable(false);
            masterTable.getColumnModel().getColumn(20).setResizable(false);
            masterTable.getColumnModel().getColumn(21).setResizable(false);
            masterTable.getColumnModel().getColumn(22).setResizable(false);
            masterTable.getColumnModel().getColumn(23).setResizable(false);
            masterTable.getColumnModel().getColumn(24).setResizable(false);
            masterTable.getColumnModel().getColumn(25).setResizable(false);
            masterTable.getColumnModel().getColumn(26).setResizable(false);
            masterTable.getColumnModel().getColumn(27).setResizable(false);
            masterTable.getColumnModel().getColumn(28).setResizable(false);
            masterTable.getColumnModel().getColumn(29).setResizable(false);
            masterTable.getColumnModel().getColumn(30).setResizable(false);
            masterTable.getColumnModel().getColumn(31).setResizable(false);
            masterTable.getColumnModel().getColumn(32).setResizable(false);
            masterTable.getColumnModel().getColumn(33).setResizable(false);
            masterTable.getColumnModel().getColumn(34).setResizable(false);
            masterTable.getColumnModel().getColumn(35).setResizable(false);
            masterTable.getColumnModel().getColumn(36).setResizable(false);
            masterTable.getColumnModel().getColumn(37).setResizable(false);
            masterTable.getColumnModel().getColumn(38).setResizable(false);
            masterTable.getColumnModel().getColumn(39).setResizable(false);
            masterTable.getColumnModel().getColumn(40).setResizable(false);
            masterTable.getColumnModel().getColumn(41).setResizable(false);
            masterTable.getColumnModel().getColumn(42).setResizable(false);
            masterTable.getColumnModel().getColumn(43).setResizable(false);
            masterTable.getColumnModel().getColumn(44).setResizable(false);
            masterTable.getColumnModel().getColumn(45).setResizable(false);
            masterTable.getColumnModel().getColumn(46).setResizable(false);
            masterTable.getColumnModel().getColumn(47).setResizable(false);
            masterTable.getColumnModel().getColumn(48).setResizable(false);
            masterTable.getColumnModel().getColumn(49).setResizable(false);
            masterTable.getColumnModel().getColumn(50).setResizable(false);
            masterTable.getColumnModel().getColumn(51).setResizable(false);
            masterTable.getColumnModel().getColumn(52).setResizable(false);
            masterTable.getColumnModel().getColumn(53).setResizable(false);
            masterTable.getColumnModel().getColumn(54).setResizable(false);
            masterTable.getColumnModel().getColumn(55).setResizable(false);
            masterTable.getColumnModel().getColumn(56).setResizable(false);
        }

        javax.swing.GroupLayout jfr_movimentoLayout = new javax.swing.GroupLayout(jfr_movimento.getContentPane());
        jfr_movimento.getContentPane().setLayout(jfr_movimentoLayout);
        jfr_movimentoLayout.setHorizontalGroup(
            jfr_movimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 973, Short.MAX_VALUE)
            .addGroup(jfr_movimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(masterScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 973, Short.MAX_VALUE))
        );
        jfr_movimentoLayout.setVerticalGroup(
            jfr_movimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 455, Short.MAX_VALUE)
            .addGroup(jfr_movimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jfr_movimentoLayout.createSequentialGroup()
                    .addComponent(masterScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.setText("jTextField1");

        jButton25.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton25.setText("Cancelar");

        jButton23.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton23.setText("Confirmar");
        jButton23.addActionListener(formListener);

        jtf_logradouro1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel78.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel78.setText("ENTREGA:");

        jtf_tipoPessoa1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewmag.png"))); // NOI18N
        jButton18.addActionListener(formListener);

        jLabel40.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel40.setText("COMPLEMENTO:");

        jLabel45.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel45.setText("TIPO PESSOA:");

        jtf_cidade1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtf_nomeVendedor1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewmag.png"))); // NOI18N
        jButton27.addActionListener(formListener);

        jtf_nomeEntregador1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel41.setText("BAIRRO:");

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/viewmag.png"))); // NOI18N
        jButton17.addActionListener(formListener);

        jLabel79.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel79.setText("ZAP:");

        jLabel50.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel50.setText("COMANDA:");

        jLabel42.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel42.setText("CIDADE:");

        jLabel51.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel51.setText("VALOR ENTREGA:");

        jtf_genero1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtf_numeroComanda1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtf_complemento1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel75.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel75.setText("CEP:");

        jtf_bairro1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel43.setText("CPF_CNPJ");

        jLabel49.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel49.setText("GENERO:");

        jtf_uf1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel46.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel46.setText("CLIENTE:");

        jtf_valorEntrega1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel47.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel47.setText("LOGRADOURO:");

        jtf_rzs_rg1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel77.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel77.setText("VENDEDOR:");

        jtf_idVendedor1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel76.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel76.setText("UF:");

        jtf_nomeCliente1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtf_zap1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel44.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel44.setText("RZS_RG");

        jtf_cep1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jtf_cnpj_cpf1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_bairro1)
                            .addComponent(jtf_complemento1)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel77)
                            .addComponent(jLabel78))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_idVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nomeVendedor1))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nomeEntregador1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel51)
                                .addGap(18, 18, 18)
                                .addComponent(jtf_valorEntrega1))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel79))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_zap1)
                            .addComponent(jtf_rzs_rg1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtf_logradouro1)
                            .addComponent(jtf_cnpj_cpf1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtf_nomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel49))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_tipoPessoa1)
                            .addComponent(jtf_genero1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel50))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtf_cidade1)
                            .addComponent(jtf_numeroComanda1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel75)
                        .addGap(18, 18, 18)
                        .addComponent(jtf_cep1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtf_uf1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton27, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtf_nomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel45)
                        .addComponent(jtf_tipoPessoa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jtf_cnpj_cpf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jtf_genero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jtf_rzs_rg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jtf_zap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jtf_logradouro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jtf_complemento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jtf_bairro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jtf_cidade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75)
                    .addComponent(jtf_cep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel76)
                    .addComponent(jtf_uf1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(jtf_numeroComanda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel77)
                        .addComponent(jtf_nomeVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_idVendedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel78)
                        .addComponent(jtf_nomeEntregador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtf_valorEntrega1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel51)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jtf_idCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton25)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jFrame3Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278)
                .addGroup(jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton23)
                    .addComponent(jButton25)
                    .addComponent(jtf_idCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jLabel30.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel30.setText("Total");

        jtf_valorTotalApagar1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtf_valorTotalApagar1.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.totalConsumo}"), jtf_valorTotalApagar1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel31.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel31.setText("A Vista");

        jtf_dinheiro1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtf_dinheiro1.setEnabled(false);
        jtf_dinheiro1.addFocusListener(formListener);
        jtf_dinheiro1.addActionListener(formListener);

        jLabel32.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel32.setText("Pix");

        jtf_pix1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtf_pix1.setEnabled(false);

        jLabel33.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel33.setText("Debito");

        jtf_debito1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtf_debito1.setEnabled(false);

        jLabel34.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel34.setText("Credito:");

        jtf_credito1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtf_credito1.setEnabled(false);

        jcb_tipoPagamento.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcb_tipoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "A Vista", "Pix", "Debito", "Credito", "Composto" }));
        jcb_tipoPagamento.setEnabled(false);
        jcb_tipoPagamento.addActionListener(formListener);

        jtf_troco1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtf_troco1.setEnabled(false);

        jLabel35.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel35.setText("Troco:");

        jButton11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton11.setText("Confirmar");
        jButton11.addActionListener(formListener);

        jButton19.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton19.setText("Cancelar");

        jLabel36.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel36.setText("Tipo Pgto.:");

        jcheck_couver.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcheck_couver.setText("Couver");

        jcheck_TaxaServico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jcheck_TaxaServico.setText("Taxa de Serviço");

        jTextField5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.valorFrete}"), jTextField5, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.totalMovimento}"), jTextField6, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("Troco Para:");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("Valor Entrega:");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel14.setText("Entregador:");

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setRenderer(funcionariosListCellRenderer1);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, funcionariosList, jComboBox1);
        bindingGroup.addBinding(jComboBoxBinding);

        javax.swing.GroupLayout jfr_pagarMovimentoLayout = new javax.swing.GroupLayout(jfr_pagarMovimento.getContentPane());
        jfr_pagarMovimento.getContentPane().setLayout(jfr_pagarMovimentoLayout);
        jfr_pagarMovimentoLayout.setHorizontalGroup(
            jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfr_pagarMovimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jfr_pagarMovimentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton19)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11))
                    .addGroup(jfr_pagarMovimentoLayout.createSequentialGroup()
                        .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel30)
                            .addComponent(jLabel35)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12))
                        .addGap(24, 24, 24)
                        .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jfr_pagarMovimentoLayout.createSequentialGroup()
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                            .addComponent(jcb_tipoPagamento, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtf_valorTotalApagar1)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jfr_pagarMovimentoLayout.createSequentialGroup()
                                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcheck_TaxaServico)
                                    .addComponent(jtf_dinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcheck_couver)
                                    .addComponent(jtf_pix1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtf_debito1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jtf_troco1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(jtf_credito1, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jfr_pagarMovimentoLayout.setVerticalGroup(
            jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jfr_pagarMovimentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jtf_valorTotalApagar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jcheck_couver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcheck_TaxaServico)
                .addGap(18, 18, 18)
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel9)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcb_tipoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jtf_dinheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jtf_pix1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jtf_debito1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jtf_credito1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_troco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jfr_pagarMovimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton19))
                .addContainerGap())
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToolBar1.setBackground(new java.awt.Color(102, 102, 102));
        jToolBar1.setFloatable(false);
        jToolBar1.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.setRollover(true);

        jButton12.setBackground(new java.awt.Color(102, 102, 102));
        jButton12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Vender");
        jButton12.setFocusable(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setMaximumSize(new java.awt.Dimension(120, 50));
        jButton12.setMinimumSize(new java.awt.Dimension(120, 50));
        jButton12.setPreferredSize(new java.awt.Dimension(120, 50));
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton12.addActionListener(formListener);
        jToolBar1.add(jButton12);

        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Produto");
        jButton13.setFocusable(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setMaximumSize(new java.awt.Dimension(130, 50));
        jButton13.setMinimumSize(new java.awt.Dimension(130, 50));
        jButton13.setPreferredSize(new java.awt.Dimension(130, 50));
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton13.addActionListener(formListener);
        jToolBar1.add(jButton13);

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Pagar");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setMaximumSize(new java.awt.Dimension(120, 50));
        jButton5.setMinimumSize(new java.awt.Dimension(120, 50));
        jButton5.setPreferredSize(new java.awt.Dimension(120, 50));
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(formListener);
        jToolBar1.add(jButton5);

        jButton14.setBackground(new java.awt.Color(102, 102, 102));
        jButton14.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Movimentos");
        jButton14.setFocusable(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setMaximumSize(new java.awt.Dimension(120, 50));
        jButton14.setMinimumSize(new java.awt.Dimension(120, 50));
        jButton14.setPreferredSize(new java.awt.Dimension(120, 50));
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton14.addActionListener(formListener);
        jToolBar1.add(jButton14);

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.setLayout(new java.awt.GridBagLayout());
        jToolBar1.add(jPanel9);

        jLabel61.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("R$:");
        jToolBar1.add(jLabel61);

        jTextField10.setBackground(new java.awt.Color(102, 102, 102));
        jTextField10.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(255, 255, 255));
        jTextField10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField10.setMaximumSize(new java.awt.Dimension(180, 50));
        jTextField10.setMinimumSize(new java.awt.Dimension(180, 50));
        jTextField10.setName(""); // NOI18N
        jTextField10.setPreferredSize(new java.awt.Dimension(180, 50));

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.totalConsumo}"), jTextField10, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jToolBar1.add(jTextField10);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanel1.add(jToolBar1, gridBagConstraints);

        jTabbedPane1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel8.setText("Produto:");

        jtf_codProduto.addFocusListener(formListener);

        jtf_nomeProduto.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.produto}"), jtf_nomeProduto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel10.setText("Tipo Produto:");

        jtf_tipoProduto.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tipoProduto}"), jtf_tipoProduto, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel11.setText("Quantidade:");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.quantVenda}"), jtf_quantidade, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtf_quantidade.addFocusListener(formListener);

        detailTable.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        detailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        detailTable.setComponentPopupMenu(jPopupMenu1);
        detailTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        detailTable.getTableHeader().setResizingAllowed(false);
        detailTable.getTableHeader().setReorderingAllowed(false);

        org.jdesktop.beansbinding.ELProperty eLProperty = org.jdesktop.beansbinding.ELProperty.create("${selectedElement.movimentoDetCollection}");
        jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, eLProperty, detailTable);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMovimentoDet}"));
        columnBinding.setColumnName("Id Movimento Det");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${produto}"));
        columnBinding.setColumnName("Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoProduto}"));
        columnBinding.setColumnName("Tipo Produto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoQuant}"));
        columnBinding.setColumnName("Tipo Quant");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoUnd}"));
        columnBinding.setColumnName("Tipo Und");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${precoUnitario}"));
        columnBinding.setColumnName("Preco Unitario");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantVenda}"));
        columnBinding.setColumnName("Quant Venda");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalApagar}"));
        columnBinding.setColumnName("Total Apagar");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${acrescimo}"));
        columnBinding.setColumnName("Acrescimo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${caixa}"));
        columnBinding.setColumnName("Caixa");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${comanda}"));
        columnBinding.setColumnName("Comanda");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${couver}"));
        columnBinding.setColumnName("Couver");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cozinha}"));
        columnBinding.setColumnName("Cozinha");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataEntregue}"));
        columnBinding.setColumnName("Data Entregue");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataMovimento}"));
        columnBinding.setColumnName("Data Movimento");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataPedido}"));
        columnBinding.setColumnName("Data Pedido");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${decrescimo}"));
        columnBinding.setColumnName("Decrescimo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${descricaoProd}"));
        columnBinding.setColumnName("Descricao Prod");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${detalhePedido}"));
        columnBinding.setColumnName("Detalhe Pedido");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagEstatusMovidet}"));
        columnBinding.setColumnName("Flag Estatus Movidet");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${flagEstatusPedido}"));
        columnBinding.setColumnName("Flag Estatus Pedido");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaEntregue}"));
        columnBinding.setColumnName("Hora Entregue");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaPedido}"));
        columnBinding.setColumnName("Hora Pedido");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${horaProducao}"));
        columnBinding.setColumnName("Hora Producao");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCaixa}"));
        columnBinding.setColumnName("Id Caixa");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCliente}"));
        columnBinding.setColumnName("Id Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idCozinha}"));
        columnBinding.setColumnName("Id Cozinha");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idLoja}"));
        columnBinding.setColumnName("Id Loja");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMovimentoCab}"));
        columnBinding.setColumnName("Id Movimento Cab");
        columnBinding.setColumnClass(br.teste.beans.MovimentoCab.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idMovimentoGeral}"));
        columnBinding.setColumnName("Id Movimento Geral");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idOperador}"));
        columnBinding.setColumnName("Id Operador");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idProduto}"));
        columnBinding.setColumnName("Id Produto");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${idVendedor}"));
        columnBinding.setColumnName("Id Vendedor");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${localPedido}"));
        columnBinding.setColumnName("Local Pedido");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${loja}"));
        columnBinding.setColumnName("Loja");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${movimento}"));
        columnBinding.setColumnName("Movimento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nomeCliente}"));
        columnBinding.setColumnName("Nome Cliente");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${operador}"));
        columnBinding.setColumnName("Operador");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantAtual}"));
        columnBinding.setColumnName("Quant Atual");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantMin}"));
        columnBinding.setColumnName("Quant Min");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${quantUnd}"));
        columnBinding.setColumnName("Quant Und");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${recebCredito}"));
        columnBinding.setColumnName("Receb Credito");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${recebDebito}"));
        columnBinding.setColumnName("Receb Debito");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${recebDinheiro}"));
        columnBinding.setColumnName("Receb Dinheiro");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${recebPix}"));
        columnBinding.setColumnName("Receb Pix");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${servico}"));
        columnBinding.setColumnName("Servico");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${taxaCouver}"));
        columnBinding.setColumnName("Taxa Couver");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${taxaServico}"));
        columnBinding.setColumnName("Taxa Servico");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoAgregadorPgto}"));
        columnBinding.setColumnName("Tipo Agregador Pgto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoLocal}"));
        columnBinding.setColumnName("Tipo Local");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoMovimento}"));
        columnBinding.setColumnName("Tipo Movimento");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${tipoPagto}"));
        columnBinding.setColumnName("Tipo Pagto");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${totalPedido}"));
        columnBinding.setColumnName("Total Pedido");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${troco}"));
        columnBinding.setColumnName("Troco");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${vendedor}"));
        columnBinding.setColumnName("Vendedor");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${zap}"));
        columnBinding.setColumnName("Zap");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        detailScrollPane.setViewportView(detailTable);
        if (detailTable.getColumnModel().getColumnCount() > 0) {
            detailTable.getColumnModel().getColumn(0).setResizable(false);
            detailTable.getColumnModel().getColumn(1).setResizable(false);
            detailTable.getColumnModel().getColumn(2).setResizable(false);
            detailTable.getColumnModel().getColumn(3).setResizable(false);
            detailTable.getColumnModel().getColumn(4).setResizable(false);
            detailTable.getColumnModel().getColumn(5).setResizable(false);
            detailTable.getColumnModel().getColumn(6).setResizable(false);
            detailTable.getColumnModel().getColumn(7).setResizable(false);
        }

        horaMovField.setText("jTextField3");

        jButton1.setText("jButton1");
        jButton1.addActionListener(formListener);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jtf_nomeProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtf_tipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jtf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(horaMovField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(168, 168, 168))
            .addComponent(detailScrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtf_codProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtf_nomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jtf_tipoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jtf_quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horaMovField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(detailScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Movimento", jPanel2);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.descricaoProd}"), jTextArea1, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jScrollPane1.setViewportView(jTextArea1);

        jLabel25.setText("Quant Atual:");

        jTextField7.setText("jTextField7");

        jTextField8.setText("jTextField8");

        jLabel26.setText("Quant Min.:");

        jLabel27.setText("Quant Venda:");

        jTextField9.setText("jTextField9");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.comanda}"), jtf_comandaDetalhe, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.vendedor}"), jTextField31, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, detailTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.localPedido}"), jTextField35, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField7, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                    .addComponent(jTextField8)
                    .addComponent(jTextField9))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_comandaDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(386, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField31)
                            .addComponent(jTextField35, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_comandaDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26)
                            .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Detalhe Produto", jPanel3);

        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1185, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pedidos Anteriores", jPanel10);

        jLabel52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel52.setText("TELEFONE:");

        jTextField2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField2.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.zap}"), jTextField2, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel53.setText("NOME CLIENTE:");

        jTextField3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField3.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cliente}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setText("TIPO CLIENTE:");

        jTextField4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextField4.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tipoPessoa}"), jTextField4, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel29.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel29.setText("TIPO MOVIMENTO:");

        jtf_tipoMovimento.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtf_tipoMovimento.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, masterTable, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.tipoMovimento}"), jtf_tipoMovimento, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_tipoMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel53)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jtf_tipoMovimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1))
        );

        bindingGroup.bind();
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener, java.awt.event.FocusListener, org.netbeans.examples.lib.timerbean.TimerListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jButton12) {
                MovimentoView1.this.jButton12ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton13) {
                MovimentoView1.this.jButton13ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton5) {
                MovimentoView1.this.jButton5ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton14) {
                MovimentoView1.this.jButton14ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton1) {
                MovimentoView1.this.jButton1ActionPerformed(evt);
            }
            else if (evt.getSource() == jmi_pagarPedido) {
                MovimentoView1.this.jmi_pagarPedidoActionPerformed(evt);
            }
            else if (evt.getSource() == jmi_alterarComanda) {
                MovimentoView1.this.jmi_alterarComandaActionPerformed(evt);
            }
            else if (evt.getSource() == jmi_alterarOrigem) {
                MovimentoView1.this.jmi_alterarOrigemActionPerformed(evt);
            }
            else if (evt.getSource() == jMenuItem3) {
                MovimentoView1.this.jMenuItem3ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton22) {
                MovimentoView1.this.jButton22ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton16) {
                MovimentoView1.this.jButton16ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton26) {
                MovimentoView1.this.jButton26ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton15) {
                MovimentoView1.this.jButton15ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton23) {
                MovimentoView1.this.jButton23ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton18) {
                MovimentoView1.this.jButton18ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton27) {
                MovimentoView1.this.jButton27ActionPerformed(evt);
            }
            else if (evt.getSource() == jButton17) {
                MovimentoView1.this.jButton17ActionPerformed(evt);
            }
            else if (evt.getSource() == jtf_dinheiro1) {
                MovimentoView1.this.jtf_dinheiro1ActionPerformed(evt);
            }
            else if (evt.getSource() == jcb_tipoPagamento) {
                MovimentoView1.this.jcb_tipoPagamentoActionPerformed(evt);
            }
            else if (evt.getSource() == jButton11) {
                MovimentoView1.this.jButton11ActionPerformed(evt);
            }
        }

        public void focusGained(java.awt.event.FocusEvent evt) {
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if (evt.getSource() == jtf_codProduto) {
                MovimentoView1.this.jtf_codProdutoFocusLost(evt);
            }
            else if (evt.getSource() == jtf_quantidade) {
                MovimentoView1.this.jtf_quantidadeFocusLost(evt);
            }
            else if (evt.getSource() == jtf_dinheiro1) {
                MovimentoView1.this.jtf_dinheiro1FocusLost(evt);
            }
        }

        public void onTime(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == timer1) {
                MovimentoView1.this.timer1OnTime(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

                
    
    private List<Produtos> produtoList;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
 //   calljframe_receberAvista();
    }//GEN-LAST:event_jButton5ActionPerformed
   
    
//    
    public void pagar(){
    
    if(jcb_tipoPagamento.getSelectedItem().equals("A Vista"))
    {
    Double totalVista = 0.0;
    double valorTotal = Double.parseDouble(jtf_valorTotalApagar1.getText());
    totalVista = valorTotal;
    double dinheiro = Double.parseDouble(jtf_dinheiro1.getText());
    double sobraDinheiro = dinheiro - valorTotal;
    
    jtf_troco1.setText(String.valueOf(sobraDinheiro));
    jtf_valorTotalApagar1.setText(String.valueOf( sobraDinheiro - dinheiro + valorTotal));
    }
        
    }
//    
//    
//    public void calculoPagamentoAvista()
//    {
//
//       if( jtf_dinheiro1.getText().isEmpty()        || 
//           jtf_dinheiro1.getText().equals("0")      ||
//           jtf_dinheiro1.getText().equals("0.0")    ||
//           jtf_dinheiro1.getText().equals("00.00")  ||
//           jtf_dinheiro1.getText().equals(" "))
//        {
//
//   
//        }
//        else if(!jtf_dinheiro1.getText().isEmpty())
//        {
//                    Double totalVista = 0.0;
//                    double valorTotal = Double.parseDouble(jtf_valorTotalApagar1.getText());
//                    totalVista = valorTotal;
//                    double dinheiro = Double.parseDouble(jtf_dinheiro1.getText());
//                    double sobraDinheiro = dinheiro - valorTotal;
//    
//                    jtf_troco1.setText(String.valueOf(sobraDinheiro));
//                    jtf_valorTotalApagar1.setText(String.valueOf( sobraDinheiro - dinheiro + valorTotal));
//       }
//    }
//    
//    
//    
//      public void calculoPagamentoPix()
//    {
//          if( jtf_pix1.getText().isEmpty()        || 
//           jtf_pix1.getText().equals("0")      ||
//           jtf_pix1.getText().equals("0.0")    ||
//           jtf_pix1.getText().equals("00.00")  ||
//           jtf_pix1.getText().equals(" "))
//        {
//
//   
//        }
//        else if(!jtf_pix1.getText().isEmpty())
//        {
//                    Double totalVista = 0.0;
//                    double valorTotal = Double.parseDouble(jtf_valorTotalApagar1.getText());
//                    totalVista = valorTotal;
//                       double pix = Double.parseDouble(jtf_pix1.getText());
//                    double sobraPix = pix - valorTotal;
//                     jtf_troco1.setText(String.valueOf(sobraPix));
//                    jtf_valorTotalApagar1.setText(String.valueOf( sobraPix - pix + valorTotal));
//       }
//    } 
//      
//    public void calculoPagamentoDebito()
//    { 
//    double valorTotal = Double.parseDouble(jtf_valorTotalApagar1.getText());
//    double debito = Double.parseDouble(jtf_debito1.getText());
//    double sobraDebito = debito - valorTotal;
//    jtf_troco1.setText(String.valueOf(sobraDebito));
//    } 
//    
//    public void calculoPagamentoCredito()
//    {  
//    double valorTotal = Double.parseDouble(jtf_valorTotalApagar1.getText());
//    double credito = Double.parseDouble(jtf_credito1.getText());
//    double sobraCredito = credito - valorTotal;
//    jtf_troco1.setText(String.valueOf(sobraCredito)); 
//    } 
    
//     public void calculoPagamentoComposto()
//    {
//
//          if( jtf_dinheiro1.getText().isEmpty()    || 
//           jtf_dinheiro1.getText().equals("0")     ||
//           jtf_dinheiro1.getText().equals("0.0")   ||
//           jtf_dinheiro1.getText().equals("00.00") ||
//           jtf_dinheiro1.getText().equals(" ")     &&
//           jtf_credito1.getText().isEmpty()        || 
//           jtf_credito1.getText().equals("0")      ||
//           jtf_credito1.getText().equals("0.0")    ||
//           jtf_credito1.getText().equals("00.00")  ||
//           jtf_credito1.getText().equals(" ")      &&
//           jtf_pix1.getText().isEmpty()            || 
//           jtf_pix1.getText().equals("0")          ||
//           jtf_pix1.getText().equals("0.0")        ||
//           jtf_pix1.getText().equals("00.00")      ||
//           jtf_pix1.getText().equals(" ")          &&
//           jtf_debito1.getText().isEmpty()         || 
//           jtf_debito1.getText().equals("0")       ||
//           jtf_debito1.getText().equals("0.0")     ||
//           jtf_debito1.getText().equals("00.00")   ||
//           jtf_debito1.getText().equals(" "))
//        {
//
//   
//        }
//        else if(!jtf_pix1.getText().isEmpty()       &&
//                !jtf_debito1.getText().isEmpty()    &&
//                !jtf_credito1.getText().isEmpty()   &&
//                !jtf_pix1.getText().isEmpty())
//        {
//            
//                    Double totalVista = 0.0;
//                    double valorTotal = Double.parseDouble(jtf_valorTotalApagar1.getText());
//                    totalVista = valorTotal;
//                    
//                    double dinheiro =   Double.parseDouble(jtf_dinheiro1.getText());
//                    double credito  =   Double.parseDouble(jtf_credito1.getText());
//                    double debito   =   Double.parseDouble(jtf_debito1.getText());
//                    double pix      =   Double.parseDouble(jtf_pix1.getText());
//                    
//                    double somapgtos =  debito + credito + dinheiro + valorTotal + pix;
//                    
//                    
//                    double sobraCredito = somapgtos - valorTotal;
//                    
//                    jtf_troco1.setText(String.valueOf(sobraCredito));
//                    jtf_troco1.setText(String.valueOf(sobraDinheiro));
//                    jtf_valorTotalApagar1.setText(String.valueOf( sobraDinheiro - dinheiro + valorTotal));
//
//       }
//    } 
    
    
    private void jmi_pagarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_pagarPedidoActionPerformed
//calljFrame_pagarPorPedido();        
    }//GEN-LAST:event_jmi_pagarPedidoActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//jFrame_pagarPorPedido.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
// calljfr_movimento();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jmi_alterarOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_alterarOrigemActionPerformed
//calljfr_alterarOrigemPedido() ;       
    }//GEN-LAST:event_jmi_alterarOrigemActionPerformed

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
       mostra_data.le_hora();
       horaMovField.setText(mostra_data.hora);
    }//GEN-LAST:event_timer1OnTime

    private void jmi_alterarComandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmi_alterarComandaActionPerformed
//       alterarComandaJDialog at = new alterarComandaJDialog(null, true);
//       at.setVisible(true);
    }//GEN-LAST:event_jmi_alterarComandaActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
  venda();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jtf_quantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_quantidadeFocusLost
 //      Calc();
    }//GEN-LAST:event_jtf_quantidadeFocusLost

    private void jtf_codProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_codProdutoFocusLost
        // mostra_data.le_hora();
        produtoQuery = entityManager.createNamedQuery("Produtos.findByIdItens");
        produtoQuery.setParameter("idItens", Integer.parseInt(jtf_codProduto.getText()));
        produtoList = produtoQuery.getResultList();

        String nomeProduto      = produtoList.get(0).getProduto();
        String tipoProduto      = produtoList.get(0).getTipoProduto();
     //  String tipoQauntidade  = produtoList.get(0).getTipoQuant();
        String valorPrecoUnit   = produtoList.get(0).getValorFinal();
        String quantUnid        = produtoList.get(0).getQuantUnd();
        String desc             = produtoList.get(0).getDescriCadProd();

    //    System.out.println("ddf"+nomeProduto+tipoProduto+tipoQauntidade+valorPrecoUnit+quantUnid+desc);

        int index = masterTable.getSelectedRow();
        br.teste.beans.MovimentoCab M = list.get(masterTable.convertRowIndexToModel(index));
        Collection<br.teste.beans.MovimentoDet> ms = M.getMovimentoDetCollection();
        if (ms == null) {
            ms = new LinkedList<br.teste.beans.MovimentoDet>();
            M.setMovimentoDetCollection((List) ms);
        }
        br.teste.beans.MovimentoDet m = new br.teste.beans.MovimentoDet();
        entityManager.persist(m);
        m.setIdMovimentoCab(M);
        m.setProduto(nomeProduto);
        m.setTipoProduto(tipoProduto);
        m.setQuantVenda("1.0");
  //     m.setTipoQuant(tipoQauntidade);
        m.setPrecoUnitario(valorPrecoUnit);
        m.setQuantUnd(quantUnid);
        m.setDescricaoProd(desc);
        m.setFlagEstatusPedido("Aberto");

        m.setFlagEstatusMovidet("Aberto");
        m.setNomeCliente(M.getCliente());
        m.setComanda(M.getNumeroComanda());
        m.setZap(M.getZap());

        m.setVendedor(M.getVendedor());

        m.setDataMovimento(new Date());

        m.setDataPedido(new Date());
        m.setHoraPedido(horaMovField.getText());
        m.setLocalPedido("Venda Rapida");

        ms.add(m);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = ms.size() - 1;
        detailTable.setRowSelectionInterval(row, row);
       detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));
       Calc();
       salvarProdutoAdicionado();

    }//GEN-LAST:event_jtf_codProdutoFocusLost

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
  
      String args[] = new String[1];
      args[0] = "Importar Entregadores";
        ImportEntregadorView.main(args);

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
 
      String args[] = new String[1];
      args[0] = "Importar Clientes";
      ImportClienteView.main(args);
   
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
jfr_novoPedido.dispose();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
            String args[] = new String[1];
            args[0] = "Importar Vendedor";
            ImportVendedorView.main(args);
   
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
 
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed

    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed

    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
      adicionarProd();      
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jtf_dinheiro1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_dinheiro1FocusLost
 //     calculoPagamentoAvista();
    }//GEN-LAST:event_jtf_dinheiro1FocusLost

    private void jcb_tipoPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_tipoPagamentoActionPerformed
      
//        
//        int index = masterTable.getSelectedRow();
//        br.teste.beans.MovimentoCab M = list.get(masterTable.convertRowIndexToModel(index));
//        Collection<br.teste.beans.MovimentoDet> ms = M.getMovimentoDetCollection();
//        if (ms == null) {
//            ms = new LinkedList<br.teste.beans.MovimentoDet>();
//             M.setMovimentoDetCollection((List) ms);
//        if (jcb_tipoPagamento.getSelectedItem().equals("A Vista"))
//        {
//        
//        
//        
//            jtf_valorTotalApagar1.setText(M.getTotalMovimento());
//            jtf_pix1.setText("0.0");
//            jtf_debito1.setText("0.0");
//            jtf_credito1.setText("0.0");
//            jtf_dinheiro1.setText("0.0");
//            jtf_troco1.setText("0.0");
//            
//            jtf_pix1.setEnabled(false);
//            jtf_debito1.setEnabled(false);
//            jtf_credito1.setEnabled(false);
//            jtf_dinheiro1.setEnabled(true);
//            jtf_troco1.setEnabled(true);
//        }
//        else if(jcb_tipoPagamento.getSelectedItem().equals("Debito"))
//        {
//            
//            jtf_valorTotalApagar1.setText(M.getTotalMovimento());
//            jtf_pix1.setText("0.0");
//            jtf_debito1.setText("0.0");
//            jtf_credito1.setText("0.0");
//            jtf_dinheiro1.setText("0.0");
//            jtf_troco1.setText("0.0");
//            jtf_pix1.setEnabled(false);
//            jtf_debito1.setEnabled(true);
//            jtf_credito1.setEnabled(false);
//            jtf_dinheiro1.setEnabled(false);
//            jtf_troco1.setEnabled(false);
//        }
//        else if(jcb_tipoPagamento.getSelectedItem().equals("Pix"))
//        {
//            jtf_valorTotalApagar1.setText(M.getTotalMovimento());
//            
//            jtf_pix1.setText("0.0");
//            jtf_debito1.setText("0.0");
//            jtf_credito1.setText("0.0");
//            jtf_dinheiro1.setText("0.0");
//            jtf_troco1.setText("0.0");
//            jtf_pix1.setEnabled(true);
//            jtf_debito1.setEnabled(false);
//            jtf_credito1.setEnabled(false);
//            jtf_dinheiro1.setEnabled(false);
//            jtf_troco1.setEnabled(false);
//        }
//        else if(jcb_tipoPagamento.getSelectedItem().equals("Credito"))
//        {
//            
//            jtf_valorTotalApagar1.setText(M.getTotalMovimento());
//            jtf_pix1.setText("0.0");
//            jtf_debito1.setText("0.0");
//            jtf_credito1.setText("0.0");
//            jtf_dinheiro1.setText("0.0");
//            jtf_troco1.setText("0.0");
//            jtf_pix1.setEnabled(false);
//            jtf_debito1.setEnabled(false);
//            jtf_credito1.setEnabled(true);
//            jtf_dinheiro1.setEnabled(false);
//            jtf_troco1.setEnabled(false);
//        }
//        else if(jcb_tipoPagamento.getSelectedItem().equals("Composto"))
//        {
//            jtf_valorTotalApagar1.setText(M.getTotalMovimento());
//            jtf_pix1.setText("0.0");
//            jtf_debito1.setText("0.0");
//            jtf_credito1.setText("0.0");
//            jtf_dinheiro1.setText("0.0");
//            jtf_troco1.setText("0.0");
//            jtf_pix1.setEnabled(true);
//            jtf_debito1.setEnabled(true);
//            jtf_credito1.setEnabled(true);
//            jtf_dinheiro1.setEnabled(true);
//            jtf_troco1.setEnabled(true);
//        }
//        }
    }//GEN-LAST:event_jcb_tipoPagamentoActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

//        if(jcb_tipoPagamento.getSelectedItem().equals("A Vista")){
//
//            calculoPagamentoAvista();
//
//        }
//        else if(jcb_tipoPagamento.getSelectedItem().equals("Debito")){
//            calculoPagamentoDebito();
//        }
//        else if(jcb_tipoPagamento.getSelectedItem().equals("Pix")){
//            calculoPagamentoPix();
//            
//        }
//        else if(jcb_tipoPagamento.getSelectedItem().equals("Credito")){
//            calculoPagamentoCredito();
//        }
//        else if(jcb_tipoPagamento.getSelectedItem().equals("Composto")){
//         //   calculoPagamentoComposto();
//        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jtf_dinheiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_dinheiro1ActionPerformed
     // calculoPagamentoAvista();
    }//GEN-LAST:event_jtf_dinheiro1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int index = masterTable.getSelectedRow();
        br.teste.beans.MovimentoCab M = list.get(masterTable.convertRowIndexToModel(index));
        Collection<br.teste.beans.MovimentoDet> ms = M.getMovimentoDetCollection();
        if (ms == null) {
            ms = new LinkedList<br.teste.beans.MovimentoDet>();
            M.setMovimentoDetCollection((List) ms);
        }
        br.teste.beans.MovimentoDet m = new br.teste.beans.MovimentoDet();
        entityManager.persist(m);
        m.setIdMovimentoCab(M);
        ms.add(m);
        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = ms.size() - 1;
        detailTable.setRowSelectionInterval(row, row);
        detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
   
    
    public void adicionarProd()
        {
 
        int index = masterTable.getSelectedRow();
        br.teste.beans.MovimentoCab M = list.get(masterTable.convertRowIndexToModel(index));
        Collection<br.teste.beans.MovimentoDet> ms = M.getMovimentoDetCollection();
        if (ms == null) {
            ms = new LinkedList<br.teste.beans.MovimentoDet>();
             M.setMovimentoDetCollection((List) ms);
        }
        
          br.teste.beans.MovimentoDet m = new br.teste.beans.MovimentoDet();
          ImportProdutosJDialog ip = new ImportProdutosJDialog(null, true);
          ip.recebeObjeto(m);
          ip.setVisible(true);
 
        if(ip.isConfirmaImportProdutosJDialog() == true){

        entityManager.persist(m);
        m.setIdMovimentoCab(M);
        m.setQuantVenda("1.0");
        m.setFlagEstatusPedido("Aberto");

        ms.add(m);

        masterTable.clearSelection();
        masterTable.setRowSelectionInterval(index, index);
        int row = ms.size() - 1;
        detailTable.setRowSelectionInterval(row, row);
        detailTable.scrollRectToVisible(detailTable.getCellRect(row, 0, true));
        Calc();
        salvarProdutoAdicionado();
         
        }
        
        }  
        
    public void vendaIndentificada()  
    {
     br.teste.beans.MovimentoCab M = new br.teste.beans.MovimentoCab();
     jtf_codProduto.setEnabled(true);
     jtf_nomeProduto.setEnabled(true);
     jtf_nomeCliente.setEnabled(true);
     jtf_zap.setEnabled(true);
     entityManager.persist(M);

        M.setTipoMovimento("Venda");
        M.setNumeroComanda("000");
//        adicionarNumeroComanda();
        M.setValorFrete("00.00");
        M.setTaxaCouver("00.00");
        M.setTaxaServico("00.00");
        M.setRecebidoCred("00.00");
        M.setRecebidoDebito("00.00");
        M.setRecebidoPix("00.00");
        M.setTotalConsumo("00.00");
        M.setTotalMovimento("00.00");
        M.setTotalPago("00.00");
        M.setFlagEstatusMovcab("Aberto");
        M.setHoraMovimento(horaMovField.getText());
        M.setDataMovimento(new Date());
        list.add(M);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
        salvarAberturaSeta();
        setaVendaRapida();
    }


    public void calljframe_receberAvista()      
    { 
        
        jfr_pagarMovimento.setSize(469, 434);//[][]
        jfr_pagarMovimento.setLocationRelativeTo(null);
        jfr_pagarMovimento.pack();
        jfr_pagarMovimento.setResizable(false);
        jfr_pagarMovimento.setVisible(true);
//        pagarmovimento();
        

    }
   
        public void calljfr_movimento()      
    {   
        jfr_movimento.setSize(911, 371);//[][911, 371]
        jfr_movimento.setLocationRelativeTo(null);
        jfr_movimento.pack();
        jfr_movimento.setResizable(false);
        jfr_movimento.setVisible(true);
    }

       
       
         public void salvarProdutoAdicionado()
        {
               try {
                        entityManager.getTransaction().commit();
                        entityManager.getTransaction().begin();
                    } 
                        catch (RollbackException rex) 
                        {
                        rex.printStackTrace();
                        entityManager.getTransaction().begin();
                        List<br.teste.beans.MovimentoCab> merged = new ArrayList<br.teste.beans.MovimentoCab>(list.size());
                        for (br.teste.beans.MovimentoCab M : list) {
                            merged.add(entityManager.merge(M));
                        }
                        list.clear();
                        list.addAll(merged);
                  }
        }
//
//
       public void venderCliente()
        {
         jfr_novoPedido.setSize(687, 416);//
         jfr_novoPedido.setResizable(false);
         jfr_novoPedido.setLocationRelativeTo(null);
         jfr_novoPedido.pack();
         jfr_novoPedido.setVisible(true);
        }
//
//         
        public void salvarMovimento()
            {
            try
            {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
            } catch (RollbackException rex) {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<br.teste.beans.MovimentoCab> merged = new ArrayList<br.teste.beans.MovimentoCab>(list.size());
            for (br.teste.beans.MovimentoCab M : list) {
                
                merged.add(entityManager.merge(M));
            }
            list.clear();
            list.addAll(merged);
        }
    }
//
          public void atualizarList()
            {
            entityManager.getTransaction().rollback();
            entityManager.getTransaction().begin();
            java.util.Collection data = query.getResultList();
            for (Object entity : data) {
                entityManager.refresh(entity);
            }
            list.clear();
            list.addAll(data);
            }
   
//          
    public void salvarAberturaSeta()
    {
            try 
            {
            entityManager.getTransaction().commit();
            entityManager.getTransaction().begin();
            } catch (RollbackException rex) 
            {
            rex.printStackTrace();
            entityManager.getTransaction().begin();
            List<br.teste.beans.MovimentoCab> merged = new ArrayList<br.teste.beans.MovimentoCab>(list.size());
            for (br.teste.beans.MovimentoCab M : list) {
                merged.add(entityManager.merge(M));
            }
            list.clear();
            list.addAll(merged);
        }
            atualizarList();
            masterTable.setRowSelectionInterval(0, 0);
            masterTable.scrollRectToVisible(masterTable.getCellRect(0, 0, true));
    }
//    
//
    public void setaVendaRapida()
    {
    atualizarList();
    int tamanhoLista = masterTable.getRowCount();
    int ajusta = tamanhoLista -1;
    System.out.println(String.valueOf(tamanhoLista));
    masterTable.setRowSelectionInterval(ajusta, ajusta);
    masterTable.scrollRectToVisible(masterTable.getCellRect(0, tamanhoLista, true));
    }
//    
    public void seta()
    {
    atualizarList();
    masterTable.setRowSelectionInterval(0, 0);
    masterTable.scrollRectToVisible(masterTable.getCellRect(0, 0, true));
    }
//    
//  
//    
    public void venda(){
              br.teste.beans.MovimentoCab m = new br.teste.beans.MovimentoCab();
        entityManager.persist(m);
        
        list.add(m);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true)); 
        salvarAberturaSeta();
        setaVendaRapida();
        venderCliente();
        jtf_valorEntrega.setText("0.0");
    
    }
//    
    public void vendaRapida()
    {
     br.teste.beans.MovimentoCab M = new br.teste.beans.MovimentoCab();
     jtf_codProduto.setEnabled(true);
     jtf_nomeProduto.setEnabled(true);
     jtf_nomeCliente.setEnabled(true);
     jtf_zap.setEnabled(true);
     entityManager.persist(M);

        M.setTipoMovimento("Venda");
        M.setNumeroComanda("000");
        venderCliente();
        M.setValorFrete("00.00");
        M.setTaxaCouver("00.00");
        M.setTaxaServico("00.00");
        M.setRecebidoCred("00.00");
        M.setRecebidoDebito("00.00");
        M.setRecebidoPix("00.00");
        M.setTotalConsumo("00.00");
        M.setTotalMovimento("00.00");
        M.setTotalPago("00.00");
        M.setVendedor("Caixa");
        M.setFlagEstatusMovcab("Aberto");
        M.setHoraMovimento(horaMovField.getText());
        M.setDataMovimento(new Date());
        list.add(M);
        int row = list.size() - 1;
        masterTable.setRowSelectionInterval(row, row);
        masterTable.scrollRectToVisible(masterTable.getCellRect(row, 0, true));
       salvarAberturaSeta();
       setaVendaRapida();

    }

        public void Calc()
        {
        Double valorTotal = 0.0;
        Double totalGeral = 0.0;
        int index = masterTable.getSelectedRow();
        br.teste.beans.MovimentoCab M = list.get(masterTable.convertColumnIndexToModel(index));
        Collection< br.teste.beans.MovimentoDet> vs = M.getMovimentoDetCollection();
            for (MovimentoDet movDet : vs) 
            {
                if(movDet.getFlagEstatusPedido().equals("Aberto")){ 
                    if (movDet.getQuantVenda()== null || movDet.getQuantVenda().isEmpty() == true )
                         {
                         movDet.setQuantVenda("1.0");
                         System.out.println("entrou no hech");
                         }
                      Double qtVenda = Double.parseDouble(movDet.getQuantVenda());
                      Double vlUnit = Double.parseDouble(movDet.getPrecoUnitario());
                      Double totalProd = vlUnit * qtVenda ;
                      movDet.setTotalPedido(String.valueOf(totalProd));
                      valorTotal = valorTotal + totalProd;
                      
                      M.setTotalConsumo(String.valueOf(valorTotal));
                      
                      
                      
                      if(jcheck_TaxaServico.isSelected()== true)
                           {
                           custoServico = 3.50;
                           M.setTaxaCouver(String.valueOf(valorCouver));
                           }
                           else if(jcheck_TaxaServico.isSelected() == false)
                           { 
                           custoServico = 0.00;
                           }
                           if(jcheck_couver.isSelected()== true)
                           {
                           valorCouver = 5.0;
                           }
                            else if(jcheck_couver.isSelected() == false)
                           { 
                           valorCouver = 0.0;
                           }
                             
                             double valorFrete = Double.parseDouble(M.getValorFrete());
                             M.setTotalMovimento(String.valueOf(valorTotal + valorCouver + custoServico + valorFrete));  //  jcheck_couver
                             salvarMovimento();
                    }   
                }
           }
//        
        
    public void setJtf_bairro(String jtf_bairro) {
        this.jtf_bairro.setText(jtf_bairro);
    }

    public void setJtf_cep(String jtf_cep) {
        this.jtf_cep.setText(jtf_cep);
    }

    public void setJtf_cidade(String jtf_cidade) {
        this.jtf_cidade.setText(jtf_cidade);
    }

    public void setJtf_complemento(String jtf_complemento) {
        this.jtf_complemento.setText(jtf_complemento);
    }

    public void setJtf_logradouro(String jtf_logradouro) {
        this.jtf_logradouro.setText(jtf_logradouro);
    }

      public void setJtf_idCliente(Integer jtf_idCliente) {
        this.jtf_idCliente.setText(jtf_idCliente.toString());
    }
    
    public void setJtf_nomeCliente(String jtf_nomeCliente) {
        this.jtf_nomeCliente.setText(jtf_nomeCliente);
    }

    public void setJtf_valorEntrega(String jtf_valorEntrega) {
        this.jtf_valorEntrega.setText(jtf_valorEntrega);
    }

    public void setJtf_zap(String  jtf_zap) {
        this.jtf_zap.setText(jtf_zap);
    }

    public void setJtf_uf(String jtf_uf) {
        this.jtf_uf.setText(jtf_uf);
    }

    public void setJtf_cnpj_cpf(String jtf_cnpj_cpf) {
        this.jtf_cnpj_cpf.setText(jtf_cnpj_cpf);
    }

    public void setJtf_rzs_rg(String jtf_rzs_rg) {
        this.jtf_rzs_rg.setText(jtf_rzs_rg);
    }

    public void setJtf_tipoPessoa(String jtf_tipoPessoa) {
        this.jtf_tipoPessoa.setText(jtf_tipoPessoa);
    }

        public void setJtf_genero(String jtf_genero) {
        this.jtf_genero.setText(jtf_genero);
    }

    public void setJtf_idVendedor(Integer jtf_idVendedor) {
        this.jtf_idVendedor.setText(jtf_idVendedor.toString());
    }

    public void setJtf_nomeVendedor(String jtf_nomeVendedor) {
        this.jtf_nomeVendedor.setText(jtf_nomeVendedor);
    }


    public void setJtf_nomeEntregador(String jtf_nomeEntregador) {
        this.jtf_nomeEntregador.setText(jtf_nomeEntregador);
    }
  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane detailScrollPane;
    private javax.swing.JTable detailTable;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<br.teste.beans.Funcionarios> funcionariosList;
    private br.teste.renderer.FuncionariosListCellRenderer funcionariosListCellRenderer1;
    private javax.persistence.Query funcionariosQuery;
    private javax.swing.JTextField horaMovField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JComboBox<String> jcb_tipoPagamento;
    private javax.swing.JCheckBox jcheck_TaxaServico;
    private javax.swing.JCheckBox jcheck_couver;
    private javax.swing.JFrame jfr_movimento;
    private javax.swing.JFrame jfr_novoPedido;
    private javax.swing.JFrame jfr_pagarMovimento;
    private javax.swing.JMenuItem jmi_alterarComanda;
    private javax.swing.JMenuItem jmi_alterarOrigem;
    private javax.swing.JMenuItem jmi_obsPedido;
    private javax.swing.JMenuItem jmi_pagarPedido;
    private javax.swing.JTextField jtf_bairro;
    private javax.swing.JTextField jtf_bairro1;
    private javax.swing.JTextField jtf_cep;
    private javax.swing.JTextField jtf_cep1;
    private javax.swing.JTextField jtf_cidade;
    private javax.swing.JTextField jtf_cidade1;
    private javax.swing.JTextField jtf_cnpj_cpf;
    private javax.swing.JTextField jtf_cnpj_cpf1;
    private javax.swing.JTextField jtf_codProduto;
    private javax.swing.JTextField jtf_comandaDetalhe;
    private javax.swing.JTextField jtf_complemento;
    private javax.swing.JTextField jtf_complemento1;
    private javax.swing.JTextField jtf_credito1;
    private javax.swing.JTextField jtf_debito1;
    private javax.swing.JTextField jtf_dinheiro1;
    private javax.swing.JTextField jtf_genero;
    private javax.swing.JTextField jtf_genero1;
    private javax.swing.JTextField jtf_idCliente;
    private javax.swing.JTextField jtf_idCliente1;
    private javax.swing.JTextField jtf_idVendedor;
    private javax.swing.JTextField jtf_idVendedor1;
    private javax.swing.JTextField jtf_logradouro;
    private javax.swing.JTextField jtf_logradouro1;
    private javax.swing.JTextField jtf_nomeCliente;
    private javax.swing.JTextField jtf_nomeCliente1;
    private javax.swing.JTextField jtf_nomeEntregador;
    private javax.swing.JTextField jtf_nomeEntregador1;
    private javax.swing.JTextField jtf_nomeProduto;
    private javax.swing.JTextField jtf_nomeVendedor;
    private javax.swing.JTextField jtf_nomeVendedor1;
    private javax.swing.JTextField jtf_numeroComanda;
    private javax.swing.JTextField jtf_numeroComanda1;
    private javax.swing.JTextField jtf_pix1;
    private javax.swing.JTextField jtf_quantidade;
    private javax.swing.JTextField jtf_rzs_rg;
    private javax.swing.JTextField jtf_rzs_rg1;
    private javax.swing.JTextField jtf_tipoMovimento;
    private javax.swing.JTextField jtf_tipoPessoa;
    private javax.swing.JTextField jtf_tipoPessoa1;
    private javax.swing.JTextField jtf_tipoProduto;
    private javax.swing.JTextField jtf_troco1;
    private javax.swing.JTextField jtf_uf;
    private javax.swing.JTextField jtf_uf1;
    private javax.swing.JTextField jtf_valorEntrega;
    private javax.swing.JTextField jtf_valorEntrega1;
    private javax.swing.JTextField jtf_valorTotalApagar1;
    private javax.swing.JTextField jtf_zap;
    private javax.swing.JTextField jtf_zap1;
    private java.util.List<br.teste.beans.MovimentoCab> list;
    private br.teste.renderer.LocaisListCellRenderer locaisListCellRenderer1;
    private java.util.List<br.teste.beans.LocalPedido> localPedidoList;
    private java.util.List<br.teste.beans.LocalPedido> localPedidoList1;
    private javax.persistence.Query localPedidoQuery;
    private javax.swing.JScrollPane masterScrollPane;
    private javax.swing.JTable masterTable;
    private javax.persistence.Query produtoQuery;
    private javax.persistence.Query query;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                if(frameMovimentoView1 == null) 
                frameMovimentoView1 = new JFrame();
                vendanomeada = new MovimentoView1();
                frameMovimentoView1.setContentPane(vendanomeada);   
                frameMovimentoView1.setSize(1244, 575);//
                frameMovimentoView1.setResizable(false);
                frameMovimentoView1.setLocationRelativeTo(null);
                frameMovimentoView1.pack();
                frameMovimentoView1.setVisible(true);
                frameMovimentoView1.setTitle(args[0]); 
            }
        });
    }




}
