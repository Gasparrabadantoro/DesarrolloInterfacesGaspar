package interfacesGraficas;

import java.awt.EventQueue;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.VentanaConMetodos;

public class Ventana extends JFrame {

	private JPanel panel;

	private void inicializarVentana() {
		setSize(300, 300);
		setVisible(true);
		panel = new JPanel();
		panel.setLayout(null);
		getContentPane().add(panel);
	}

	private void agregarBoton(String nombreBoton, int x, int y) {
		JButton botonBienvenido = new JButton(nombreBoton);
		botonBienvenido.setBounds(x, y, 100, 50);
		panel.add(botonBienvenido);
	}

	public static void main(String[] args) {
		VentanaConMetodos ventana = new VentanaConMetodos();
	}
}
