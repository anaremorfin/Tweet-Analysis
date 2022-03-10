package PF;

import java.awt.Color;

import javax.swing.JFrame;

public class Frame extends JFrame
{
	public Frame() 
	{
		//título de ventana
		super("Análisis Twitter");
		//setSize(700,550);
		//setLocation(300,300);
		//location top-left hand   size(pixeles)
		setBounds(0,0,700,550);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//Agregar panel
		Panel1 p1 = new Panel1();
		this.add(p1);
	}
}
