package nuevoProyectoContenedores;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class EjercicioComponentUIColor extends JFrame {

	public static void main(String[] args) {
		JFrame frame =new JFrame ("Boton Personalizado");
		
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JPanel panel =new JPanel();
	panel.setLayout(null);
	frame.getContentPane().add(panel);
	
	JButton button = new JButton("Boton Personalizado");
	button.setBackground(Color.cyan);
	button.setForeground(Color.red);
	
	//Establecer el tamaño y la ubicacion del boton 
	
	button.setBounds(50,50,200,30);
	
	frame.setLocation(600,300);
	frame.setSize(300,200);
	
	panel.add(button);
	frame.setVisible(true);
	
	
	
	

	}

}
