/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.frame.View;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Monitor extends JFrame
{
	private JTextField buffer;
	private JButton[] consumers;
	private JButton producer;
	
	public Monitor()
	{
		super("Monitor");
		
		//Inicia o Layout
		setLayout(new GridLayout());
		
	//cria o JTextField
		buffer = new JTextField("10 10 10 10 10 10 10 10");
		buffer.setColumns( 12 );
		add(buffer);
		
		//Cria os botoes
		consumers = new JButton[5];
		
		for( int i = 0; i < 5; i++)
		{
			consumers[i] = new JButton("Consumer" + i);
			add(consumers[i]);
			consumers[i].setSize( new Dimension( 150, 23 ) );
		}
		
		producer = new JButton("Producer");
		producer.setSize( new Dimension( 153, 23 ) );
		add( producer );
		
		//Configura o frame
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setSize( 800, 600 );
		setResizable( false );
		setVisible( true );
	}
	
	public static void main( String[] args )
	{
		Monitor monitor = new Monitor();
	}
}