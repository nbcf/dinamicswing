/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.engine;

import java.awt.Dimension;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author nil_b
 */
public class CentralizarJInternalFrame {

    public void setPosicao(JInternalFrame janela) {
    Dimension d = janela.getDesktopPane().getSize();
     janela.setLocation((d.width - janela.getSize().width) / 2, (d.height - janela.getSize().height) / 2); 
     

}

}
