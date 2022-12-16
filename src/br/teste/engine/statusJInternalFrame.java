/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.engine;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

/**
 *
 * @author nil_b
 */
public class statusJInternalFrame {
    
    private static JDesktopPane jdesktopPane;
         static int openFrameCount = 0;
    static final int xOffset = 30, yOffset = 30;
    public statusJInternalFrame(JDesktopPane jdesktopPane)
    {
    statusJInternalFrame.jdesktopPane = jdesktopPane;
    
    }
    
    public void callJInternalFrame(JInternalFrame jInternalFrame)
    {
    if(jInternalFrame.isVisible())
    {
    jInternalFrame.toFront();
    jInternalFrame.requestFocus();
    }
    else if (jInternalFrame.isVisible() == false){
    jdesktopPane.add(jInternalFrame);
    jInternalFrame.setVisible(true);
   
  
    }
    
    }
}
