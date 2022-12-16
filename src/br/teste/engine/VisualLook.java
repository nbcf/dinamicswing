/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.engine;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author nil_b
 */
public class VisualLook {
    
      public void lookandfeel(JFrame nomeFrame, String dir_look)
           {
                try
                    {
                    UIManager.setLookAndFeel(dir_look);
                    SwingUtilities.updateComponentTreeUI(nomeFrame);
                    }
                    catch (Exception erro)
                    {
                    JOptionPane.showMessageDialog(null,erro);
                    }
            }
    
}
