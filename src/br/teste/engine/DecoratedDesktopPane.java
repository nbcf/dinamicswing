/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.engine;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JInternalFrame;

/**
 *
 * @author nil_b
 */
public class DecoratedDesktopPane extends JInternalFrame{
    
public Image img;

        public DecoratedDesktopPane() {
            try {
                img = javax.imageio.ImageIO.read(new java.net.URL(getClass().getResource("image/proteinCoverat_1.png"), "img.png"));
            } catch (Exception ex) {
            }
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            if (img != null) {
                Dimension dimension = this.getSize();
                int x = (int)(dimension.getWidth() - img.getWidth(this)) / 2;
                int y = (int)(dimension.getHeight() - img.getHeight(this)) / 2;

                g.drawImage(img, x, y, img.getWidth(this), img.getHeight(this), this);
               
            } else {
                g.drawString("Imagem nao encontrada", 50, 50);
            }
        }
        
    }
