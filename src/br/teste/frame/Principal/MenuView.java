/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.frame.Principal;

//import br.com.projcomercio.jinternalView.AberturaCaixaJInternalFrame;
//import br.com.projcomercio.jinternalView.CadastroLocaisPedidoJinternalFrame;

//import br.com.projcomercio.beans.CadastroCaixa;
import br.teste.beans.MovimentoView2;
import br.teste.engine.AjustaImagemTela;
import br.teste.engine.DimensionaTela;
import br.teste.engine.DimensionarFrame;
import br.teste.engine.ParametrosGraficos;
import br.teste.engine.VisualLook;
import br.teste.engine.statusJInternalFrame;
import br.teste.frame.imports.jInternal.CadastroClientesJInternalFrame;
import br.teste.frame.imports.jInternal.CadastroComandasJInternalFrame;
import br.teste.frame.imports.jInternal.CadastroCozinhasJInternalFrame;
import br.teste.frame.imports.jInternal.CadastroFuncionariosJInternalFrame;
import br.teste.frame.imports.jInternal.CadastroFuncoesJInternalFrame;
import br.teste.frame.imports.jInternal.CadastroLocaisJinternalFrame;
import br.teste.frame.imports.jInternal.CadastroMoviRestJInternalFrame;
import br.teste.frame.imports.jInternal.CadastroProdutosJinternalFrame;
import br.teste.frame.imports.jInternal.CadastroTipoProdutosJInternalFrame;
import br.teste.frame.imports.jInternal.CadastroTipounidadeJInternalFrame;


import br.teste.frame.View.MenuProdutos;
import br.teste.frame.View.MovimentoView1;
import br.teste.frame.View.PagarComandaView;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MenuView extends javax.swing.JFrame {

    statusJInternalFrame unicaEstancia;

    DimensionaTela  d = new DimensionaTela();
    ParametrosGraficos carregaParametrosTela = new ParametrosGraficos();
    AjustaImagemTela ajustaTela = new AjustaImagemTela();
    VisualLook look = new VisualLook();
    DimensionarFrame resolucaoAtual = new DimensionarFrame();
    private static JFrame frameMenuView;
    public int stMenu ;
    public Image img;
    
    
    public MenuView() {
          setIcone();
        initComponents();
//          if (!Beans.isDesignTime()) {
//            entityManager.getTransaction().begin();
//        }
        this.unicaEstancia = new statusJInternalFrame(jDesktopPane1);
         resolucaoAtual.setSize();
      // jLabel8.setSize(carregaParametrosTela.setSize().width, carregaParametrosTela.setSize().height);
       carregaParametrosTela.modBegins(this);

       look.lookandfeel(this, UIManager.getSystemLookAndFeelClassName());

//         if (!SystemTray.isSupported()) 
//        {
//       // System.out.println("SystemTray is not supported");
//        JOptionPane.showMessageDialog(null, "Componente Icone de bandeja, não é Suportado Nesta Versão, de Sistema Operacional", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
//       //return;
//        }
//        final PopupMenu popup = new PopupMenu();
//        final SystemTray tray = SystemTray.getSystemTray();
//            try 
//            {
//            InputStream inputStream= ClassLoader.getSystemClassLoader().getResourceAsStream("image/advanced.png");
//            //or getResourceAsStream("/images/Graph.png"); also returns inputstream
//            BufferedImage img = ImageIO.read(inputStream);
//            final TrayIcon trayIcon = new TrayIcon(img, "Sistema do LPBP", popup);
//            // Create a pop-up menu components
//            
//            MenuItem aboutItem = new MenuItem("Sobre");
//            MenuItem opt1 = new MenuItem("Maximizar Tela");
//            CheckboxMenuItem cb2 = new CheckboxMenuItem("Set tooltip");
//            java.awt.Menu displayMenu = new java.awt.Menu("Funções");
//            MenuItem errorItem = new MenuItem("Error");
//            MenuItem warningItem = new MenuItem("Warning");
//            MenuItem infoItem = new MenuItem("Info");
//            MenuItem noneItem = new MenuItem("None");
//            MenuItem exitItem = new MenuItem("Exit");
//            
//
//            //Add components to pop-up menu
//            popup.add(aboutItem);
//              popup.add(aboutItem).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                     String args[] = new String[1];
//                     args[0] = "Informações de Desenvolvimento e Propiedade";
//               //     SobreView.main(args);  
//                }
//            });
////            
//            popup.addSeparator();
//           popup.add(opt1);
//                popup.add(opt1).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
////                     String args[] = new String[1];
////                     args[0] = "Informações de Desenvolvimento e Propiedade";
////                    SobreView.main(args);  
//
//                carregaParametrosTela.mostraJanela(frameMenuView);
//                }
//            });
////            
//            popup.add(cb2);
//            
//            popup.addSeparator();
//            popup.add(displayMenu);
//            
//            displayMenu.add(errorItem);
//            displayMenu.add(warningItem);
//            displayMenu.add(infoItem);
//            displayMenu.add(noneItem);
//            popup.add(exitItem);
//            trayIcon.setPopupMenu(popup);
//            
//              popup.add(aboutItem).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });
//                popup.add(cb2).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });
//
//
//           displayMenu.add(exitItem).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });
//
//
//            displayMenu.add(errorItem).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });
//
//             displayMenu.add(warningItem).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });
//
//              displayMenu.add(infoItem).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });
//
//
//               displayMenu.add(noneItem).addActionListener(new ActionListener() {
//                @Override
//                public void actionPerformed(ActionEvent e) {
//                    JOptionPane.showMessageDialog(null, "Teste");
//                }
//            });
//      
//     try {
//            tray.add(trayIcon);
//            trayIcon.addActionListener(new ActionListener(){
//
//        public void actionPerformed(ActionEvent evt){
//
//      mostraJanela();
//    //jLabel8.setIcon(ajustaTela.ajustaTela("images/proteinCoverart.jpg",jLabel8));
//
//        }//end actionPerformed
//
//        });//end addActionListener
//
//        }
//     catch (AWTException e)
//        {
//            System.out.println("TrayIcon could not be added.");
//            JOptionPane.showMessageDialog(null, "TrayIcon não pode ser adicionado \nInforme ao Suporter", "Aviso do Sistema", JOptionPane.ERROR_MESSAGE);
//       //return;
//        }
//}catch (IOException e) {}
//    
//
//
//        }
//    
//    
//      private void mostraJanela()
//        {  
//            if(this.isVisible())
//            {
//
//        this.setVisible(false);
//
//        }else{
//
//        this.setVisible(true);
//
//        }
//       
   }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jMenu4 = new javax.swing.JMenu();
        jMenuItem23 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jToolBar2 = new javax.swing.JToolBar();
        newDetailButton = new javax.swing.JButton();
        locaisBotao = new javax.swing.JButton();
        refreshButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenu4.setText("jMenu4");

        jMenuItem23.setText("jMenuItem23");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 929, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 2.0;
        getContentPane().add(jDesktopPane1, gridBagConstraints);

        jPanel1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Operador Caixa:");
        jPanel1.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nildo Bueno");
        jPanel1.add(jLabel2);

        jLabel3.setText("         ");
        jPanel1.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Caixa:");
        jPanel1.add(jLabel4);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText(" 01");
        jPanel1.add(jLabel5);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel1, gridBagConstraints);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        newDetailButton.setText("Produtos");
        newDetailButton.setMaximumSize(new java.awt.Dimension(100, 50));
        newDetailButton.setMinimumSize(new java.awt.Dimension(100, 50));
        newDetailButton.setPreferredSize(new java.awt.Dimension(100, 50));
        newDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newDetailButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(newDetailButton);

        locaisBotao.setText("Locais");
        locaisBotao.setMaximumSize(new java.awt.Dimension(100, 50));
        locaisBotao.setMinimumSize(new java.awt.Dimension(100, 50));
        locaisBotao.setPreferredSize(new java.awt.Dimension(100, 50));
        locaisBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locaisBotaoActionPerformed(evt);
            }
        });
        jToolBar2.add(locaisBotao);

        refreshButton.setText("Clientes");
        refreshButton.setMaximumSize(new java.awt.Dimension(100, 50));
        refreshButton.setMinimumSize(new java.awt.Dimension(100, 50));
        refreshButton.setPreferredSize(new java.awt.Dimension(100, 50));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });
        jToolBar2.add(refreshButton);

        jButton4.setText("Total Vedas");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton4.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton4.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton4);

        jButton2.setText("Vendas Clientes");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton2.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);

        jButton3.setText("Venda Comanda");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton3.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton3);

        jButton1.setText("Caixa");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setMaximumSize(new java.awt.Dimension(100, 50));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 50));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 50));
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton1);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        jPanel3.add(jToolBar2, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        getContentPane().add(jPanel3, gridBagConstraints);

        jMenu1.setText("Sistema");

        jMenuItem5.setText("Cadastro Pc");
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Servidor");
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Impressoras");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setText("Banco de Dados");
        jMenu1.add(jMenuItem8);

        jMenuItem9.setText("Personalização");
        jMenu1.add(jMenuItem9);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Configurações Básicas");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Clientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setText("Funcionarios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem10.setText("Entregadores");
        jMenu2.add(jMenuItem10);

        jMenu5.setText("Avançado");

        jMenuItem20.setText("Tipo Produtos");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuItem21.setText("Tipo Unidade");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem21);

        jMenuItem11.setText("Cozinha");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem4.setText("Locais");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4);

        jMenuItem12.setText("Funções");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Comandas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuItem3.setText("Caixas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Estoque");

        jMenuItem14.setText("Produtos");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuItem16.setText("Pedido de Compra");
        jMenu3.add(jMenuItem16);

        jMenuBar1.add(jMenu3);

        jMenu6.setText("Financeiro");

        jMenuItem17.setText("jMenuItem17");
        jMenu6.add(jMenuItem17);

        jMenuItem18.setText("jMenuItem18");
        jMenu6.add(jMenuItem18);

        jMenuItem19.setText("jMenuItem19");
        jMenu6.add(jMenuItem19);

        jMenuItem15.setText("Alteração de Preços");
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Restaurante");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
unicaEstancia.callJInternalFrame(CadastroClientesJInternalFrame.getEstanciaCadastroClientesJInternalFrame());
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void locaisBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locaisBotaoActionPerformed
unicaEstancia.callJInternalFrame(CadastroLocaisJinternalFrame.getEstanciaCadastroLocaisJinternalFrame());
    }//GEN-LAST:event_locaisBotaoActionPerformed

    private void newDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newDetailButtonActionPerformed
// String args[] = new String[1];
//        args[0] = "Cadastro de Produtos";
//  CadastroProdutosView.main(args);

unicaEstancia.callJInternalFrame(CadastroProdutosJinternalFrame.getEstanciaCadastroProdutosJinternalFrame());
    }//GEN-LAST:event_newDetailButtonActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
    carregaParametrosTela.setSize(); 
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
    carregaParametrosTela.setSize(); 
    }//GEN-LAST:event_formWindowClosing

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
 carregaParametrosTela.setSize();         // TODO add your handling code here:
    }//GEN-LAST:event_formWindowStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String args[] = new String[1];
        args[0] = "Venda Nomeada";
        MovimentoView2.main(args);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
//unicaEstancia.callJInternalFrame(CadastroPessoasJInternalFrame.getEstanciaCadastroPessoasJInternalFrame());        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
      
unicaEstancia.callJInternalFrame(CadastroTipoProdutosJInternalFrame.getEstanciaCadastroTipoProdutosJInternalFrame()); 
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
//unicaEstancia.callJInternalFrame(CadastroProdutosJInternalFrame.getEstanciaCadastroProdutosJInternalFrame());
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String args[] = new String[1];
        args[0] = "Cadastro de Regiões";
       // args[1] = "Refrigerante";
        MenuProdutos.main(args);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
//        String args[] = new String[1];
//        args[0] = "Cadastro Tipos de Unidades";
//      //  args[1] = "Refrigerante";
//        CadastroTiposUnidadesView.main(args);
  unicaEstancia.callJInternalFrame(CadastroTipounidadeJInternalFrame.getEstanciaCadastroTipounidadeJInternalFrame());

    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
unicaEstancia.callJInternalFrame(CadastroFuncionariosJInternalFrame.getEstanciaCadastroFuncionariosJInternalFrame());      
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
//           String args[] = new String[1];
//        args[0] = "Cadastro de Funções";
//      //  args[1] = "Refrigerante";
//        CadastroFuncoesView.main(args);   
//        
//     
unicaEstancia.callJInternalFrame(CadastroFuncoesJInternalFrame.getEstanciaCadastroFuncoesJInternalFrame()); 
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
unicaEstancia.callJInternalFrame(CadastroComandasJInternalFrame.getEstanciaCadastroComandasJInternalFrame());
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
//  String args[] = new String[1];
//        args[0] = "Cadastro de Cozinha";
//      //  args[1] = "Refrigerante";
//        CadastroCozinhaView.main(args);  

unicaEstancia.callJInternalFrame(CadastroCozinhasJInternalFrame.getEstanciaCadastroCozinhasJInternalFrame());
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//caixas
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
unicaEstancia.callJInternalFrame(CadastroLocaisJinternalFrame.getEstanciaCadastroLocaisJinternalFrame());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String args[] = new String[1];
        args[0] = "Pagar Comanda Caixa";
      //  args[1] = "Refrigerante";
        PagarComandaView.main(args);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
unicaEstancia.callJInternalFrame(CadastroMoviRestJInternalFrame.getEstanciaCadastroMoviRestJInternalFrame()); 
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }
    private void setIcone() {

 setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/image/iconeMenu.png")));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton locaisBotao;
    private javax.swing.JButton newDetailButton;
    private javax.swing.JButton refreshButton;
    // End of variables declaration//GEN-END:variables
}
