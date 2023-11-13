package nuevoProyectoContenedores;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ClaseContenedorEjericico3 extends JFrame {
	private JLabel etiquetaMensaje;
	private JLabel etiquetaBienvenidos;

	public ClaseContenedorEjericico3() {

		setTitle("Ejemplo con Dos Contenedores");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panelBotones = new JPanel();
		JPanel panelMensaje = new JPanel();
		JPanel bienVenidos = new JPanel();

		// Crearmos las etiquetas

		/* JLabel etiquetaMensaje = new JLabel("Mensaje:"); */
		etiquetaMensaje = new JLabel("Mensaje:");
		etiquetaBienvenidos = new JLabel("Bienvenidos:");

		/*
		 * Creamos un buble para los botoenes y el ActionListener asi como que al
		 * pulstar cambie el mensaje del boton
		 */

		for (int i = 1; i <= 3; i++) {
			JButton boton = new JButton("Boton " + i);

			// Le añadimos el listener, para cada boton

			boton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					// Extraemos el nombre del boton
					String textoBoton = ((JButton) e.getSource()).getText();
					/* etiquetaMensaje.setText("Has elegido el boton  " + textoBoton); */
					etiquetaBienvenidos.setText("Bienvenido :)  " + textoBoton + " Otra vez ");
					etiquetaMensaje.setText("Elegiste sabiamente la opcion " + textoBoton);
					/*Le damos caña a la ventana, no es necesario */
					
					// Declaramos
					JFrame ventanaNueva=new JFrame("Nueva ventana");
					// Ponemos el tamaño
					ventanaNueva.setSize(200, 200);
					// decimos que se cierre con una X
					ventanaNueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					// Añadimos el JLabel 
					ventanaNueva.add(new JLabel("has pulsado el botón "+textoBoton));
					// La ponemos visible. 
					ventanaNueva.setVisible(true);

				}
			});
			panelBotones.add(boton);
		}
		// añadimos el layout, en este caso, borderLayout en east, west, north, south y
		// center Y AÑADIMOS
		// TANTO LOS BOTONES COMO EL PANELMENSAJE, ASI COMO EL MENSAJE DEL BOTON
		// PULSADO, 1,2,3

		setLayout(new BorderLayout());
		add(bienVenidos, BorderLayout.NORTH);
		bienVenidos.add(etiquetaBienvenidos);
		add(panelBotones, BorderLayout.CENTER);
		add(panelMensaje, BorderLayout.SOUTH);
		panelMensaje.add(etiquetaMensaje);

		pack();// ajusta el tamaño de los elementos del jframe
		// setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// programa tareas que deben ejecutarse de manera segura, y evita concurrencia
		// que se ejecutan varias acciones al mismo tiempo e interfieran entre si

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new ClaseContenedorEjericico3();

			}
		});

	}
}
