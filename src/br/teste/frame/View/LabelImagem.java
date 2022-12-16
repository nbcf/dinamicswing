/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.frame.View;

/**
 *
 * @author nil_b
 */
import javax.swing.*;
import java.awt.*;
public class LabelImagem extends JFrame{
JLabel imagem;
public LabelImagem(){
super("Uso da classe JLabel com Imagem");
Container tela = getContentPane();
ImageIcon icone = new ImageIcon("/image/coca.jpeg");
imagem = new JLabel(icone);
tela.add(imagem);
setSize(500, 460);
setVisible(true);
}
public static void main(String args[]){
LabelImagem app = new LabelImagem();
app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}