package ud1901;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
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
		contentPane.setLayout(null);
		// etiqueta
		JLabel etiqueta = new JLabel("Escribe tu nombre: ");
		// colocar etiqueta
		etiqueta.setBounds(115, 0, 176, 41);

		// añadir etiqueta al panel
		contentPane.add(etiqueta);

		// input
		JTextField entradaNombre = new JTextField();
		entradaNombre.setBounds(46, 40, 340, 27);
		contentPane.add(entradaNombre);

		//boton 
		
		JButton boton = new JButton("OK");
		boton.setBounds(151, 89, 117, 25);
		contentPane.add(boton);
		
		setContentPane(contentPane);
		/*
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(113, 86, 117, 25);
		contentPane.add(btnNewButton);
		*/
	}
}
