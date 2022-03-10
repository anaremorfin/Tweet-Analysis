package PF;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Panel1 extends JPanel
{
	
	static JLabel image;
	
	public Panel1()
	{
		setBackground(new Color(9,51,78));
		setLayout(new GridLayout(4,1));
		PanelHeading p2 = new PanelHeading();
		this.add(p2);
		PanelOpciones p3 = new PanelOpciones();
		this.add(p3);
		
		ImageIcon foto = new ImageIcon("/Users/regina/Desktop/covid2.jpg");
		JLabel image = new JLabel(foto);
		image.setHorizontalTextPosition(SwingConstants.CENTER);
		image.setVerticalTextPosition(SwingConstants.CENTER);
		this.add(image);
	
	}

}
