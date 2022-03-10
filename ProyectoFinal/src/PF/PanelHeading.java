package PF;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelHeading extends JPanel
{	
	public PanelHeading() 
	{
		setLayout(new GridLayout(4,1));
		setBackground(new Color(9,51,78));
		
		JLabel titulo = new JLabel("Análisis de palabras en Twitter", SwingConstants.CENTER);
		titulo.setOpaque(true);
		titulo.setBackground(new Color(173,0,2));
		titulo.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		this.add(titulo);
			
		JLabel subtitulo = new JLabel("Incidencia de palabras relacionadas al COVID-19", SwingConstants.CENTER);
		subtitulo.setOpaque(true);
		subtitulo.setBackground(new Color(173,69,71));
		subtitulo.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		this.add(subtitulo);
		
		JLabel espacio = new JLabel("");
		subtitulo.setOpaque(true);
		this.add(espacio);
	}
}
