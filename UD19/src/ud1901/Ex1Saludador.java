package ud1901;

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
		
		//config ventana
		setTitle("Saludador");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//creacion + config del JPanel
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		// etiqueta
		JLabel etiqueta = new JLabel("Escribe tu nombre: ");
		// colocar etiqueta
		etiqueta.setBounds(115, 0, 176, 41);
		// añadir etiqueta al panel
		contentPane.add(etiqueta);

		//input
		JTextField entradaNombre = new JTextField();
		entradaNombre.setBounds(46, 40, 340, 27);
		contentPane.add(entradaNombre);

		//boton 		
		JButton boton = new JButton("OK");
		boton.setBounds(151, 89, 117, 25);
		contentPane.add(boton);
		
		
		/*
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(113, 86, 117, 25);
		contentPane.add(btnNewButton);
		*/
	}
}
