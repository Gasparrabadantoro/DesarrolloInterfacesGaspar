package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class VentanaBoton {

	public static void main(String[] args) {
		
		/*Version 1 */
		
//		JFrame ventana = new JFrame("Ventana con botón");
//		String nombre = "Gaspar";
//		ventana.setSize(400, 400);
//		ventana.setVisible(true);
//		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JButton boton = new JButton("Haz click aqui");
//		ventana.add(boton);
//
//		boton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//
//				String nombre = JOptionPane.showInputDialog(ventana, "Dime tu nombre", "Datos Personales",
//						JOptionPane.QUESTION_MESSAGE);
//
//			}
//
//		});

		/*Version 2 */
//		JFrame ventana2 = new JFrame("Nueva mentana");
//		JButton boton = new JButton("Pulsa aqui");
//		boton.setBounds(106, 56, 109, 36);
//		ventana2.setSize(300, 300);
//		ventana2.setVisible(true);
//		ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		ventana2.getContentPane().setLayout(null);
//		ventana2.getContentPane().add(boton);
//		boton.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String nombre = JOptionPane.showInputDialog(ventana2, "Dime tu nombre", "Datos Personales",
//						JOptionPane.QUESTION_MESSAGE);
//
//			}
//
//		});
		
			/*Version 3 */
		JFrame ventana3 = new JFrame("Ventana con botón");
		String nombre = "Gaspar";
		ventana3.setSize(400, 400);
		ventana3.setVisible(true);
		ventana3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton boton = new JButton("Bienvenidos, clike aqui");
		ventana3.add(boton);

		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String nombre = JOptionPane.showInputDialog(ventana3, "Dime tu nombre", "Datos Personales",
						JOptionPane.QUESTION_MESSAGE);

			}

		});

	}

}
