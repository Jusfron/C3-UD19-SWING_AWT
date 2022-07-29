package ud1901;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Ex1Saludador extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Ex1Saludador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setTitle("Saludador");

		// etiqueta
		JLabel etiqueta = new JLabel("Escribe tu nombre: ");
		// colocar etiqueta
		etiqueta.setBounds(150, 150, 380, 250);

		// añadir etiqueta al panel
		contentPane.add(etiqueta);

		// input
		JTextField entradaNombre = new JTextField();
		entradaNombre.setBounds(120, 120, 50, 150);
		contentPane.add(entradaNombre);

		setContentPane(contentPane);
	}

	// input

	// boton
	// accion
	// resultado accion

}
