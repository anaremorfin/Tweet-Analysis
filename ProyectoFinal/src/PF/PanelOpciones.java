package PF;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.FileNotFoundException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelOpciones extends JPanel
{
	static JButton button;
	static JButton button2;
	static JButton button3;
	static JButton button4;
	
	public PanelOpciones() 
	{
		setLayout(new FlowLayout());
		setLayout(new GridLayout(2,2));
		setBackground(new Color(9,51,78));

		button = new JButton("Cargar Archivo");
		button.setHorizontalTextPosition(SwingConstants.CENTER);
		button.setVerticalTextPosition(SwingConstants.CENTER);
		button.setFont(new Font("Arial", Font.PLAIN, 15));
		button.setForeground(new Color(45,135,156));
		this.add(button);
		
		button2 = new JButton("Cargar Palabras");
		button2.setHorizontalTextPosition(SwingConstants.CENTER);
		button2.setVerticalTextPosition(SwingConstants.CENTER);
		button2.setFont(new Font("Arial", Font.PLAIN, 15));
		button2.setForeground(new Color(45,135,156));
		this.add(button2);
		
		button3 = new JButton("Graficar");
		button3.setHorizontalTextPosition(SwingConstants.CENTER);
		button3.setVerticalTextPosition(SwingConstants.CENTER);
		button3.setFont(new Font("Arial", Font.PLAIN, 15));
		button3.setForeground(new Color(45,135,156));
		this.add(button3);
		
		button4 = new JButton("Acerca de");
		button4.setHorizontalTextPosition(SwingConstants.CENTER);
		button4.setVerticalTextPosition(SwingConstants.CENTER);
		button4.setFont(new Font("Arial", Font.PLAIN, 15));
		button4.setForeground(new Color(45,135,156));
		this.add(button4);
	}
	
	/*public void AcercaDeWindow() throws FileNotFoundException 
	{
		// if() 
		JOptionPane.showMessageDialog(null,"Programa desarrollado por Ana Regina Morfín, David Emmanuel"
				+ "Pérez y Elian Rueda para identificar la incidencia de palabras específicas y analizar "
				+ "la respuesta de los usuario ante la vacuna "
				+ "Se lee el archivo .csv con los Tweets y otro con las palabras a buscar, se analiza y gráfica"
				+ "la información :)", "Éxito", JOptionPane.INFORMATION_MESSAGE );
				
				JOptionPane.setForeground(new Color(45,135,156));
	}*/
}
