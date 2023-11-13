package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VentanaVariosJPane extends JFrame{
	
	private JLabel etiquetaMensaje;
	
	private JPanel panel;

	private void inicializarVentana() {
		setSize(300, 300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	}
	
	public void ventanaVariosJPane(){
		
		setTitle("Ejemplo con Dos Contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panelBotones = new JPanel();
		
		etiquetaMensaje = new JLabel("Mensaje:");
		JPanel panelMensaje= new JPanel();
		
		for (int i = 0; i <= 3; i++) {
			JButton boton = new JButton ("Boton "+i);
			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String textoBoton = null;
					 textoBoton=((JButton) e.getSource()).getText()+" "+textoBoton;
				
				}
			});
			
			
		}
		
		
		
	}
	
	public static void main(String[] args) {
		VentanaVariosJPane ventana = new VentanaVariosJPane();
		ventana.inicializarVentana();
	}
}
