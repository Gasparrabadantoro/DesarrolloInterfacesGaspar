package main;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaCodigo {

	public static void main(String[] args) {
	
JFrame ventana=new JFrame("Mi primera ventana");
		
ventana.setSize(400,400);
ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel texto=new JLabel("Hola");

ventana.getContentPane().add(texto);

ventana.setVisible(true);
		
	}

}
