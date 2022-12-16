/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.frame.View;


import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CriaBotoes {

    private final JFrame jf;
    private final List<JLabel> lista;

    public static void main(String[] args) {
        EventQueue.invokeLater(CriaBotoes::new);
    }

    public CriaBotoes() {
        jf = new JFrame("Teste");
        jf.setBounds(10, 10, 700, 700);
        jf.setLayout(null);

        JButton bt = new JButton("Novo label");
        jf.add(bt);
        bt.setBounds(10, 10, 100, 30);

        lista = new ArrayList<>();

        bt.addActionListener(e -> adicionarLabel());
        jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        jf.setVisible(true);
    }

    public void adicionarLabel() {
        int n = lista.size() + 1;
        String name = "cor " + n;
        JLabel label = new JLabel(name);
        jf.add(label);
        label.setBounds(10, n * 20 + 20, 150, 20);
        lista.add(label);
    }
}