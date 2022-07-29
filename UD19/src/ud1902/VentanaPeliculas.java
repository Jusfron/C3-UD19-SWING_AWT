package ud1902;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPeliculas extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldTitulo;


	/**
	 * Create the frame.
	 */
	public VentanaPeliculas() {
		setTitle("Peliculas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEscribeTitulo = new JLabel("Escribe el titulo de una pelicula");
		lblEscribeTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEscribeTitulo.setBounds(31, 34, 181, 28);
		contentPane.add(lblEscribeTitulo);
		
		textFieldTitulo = new JTextField();
		textFieldTitulo.setBounds(31, 89, 152, 19);
		contentPane.add(textFieldTitulo);
		textFieldTitulo.setColumns(10);
		
		JLabel lblPeliculas = new JLabel("Peliculas");
		lblPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPeliculas.setBounds(256, 42, 45, 13);
		contentPane.add(lblPeliculas);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(238, 88, 161, 28);
		contentPane.add(comboBox);
		
		JButton btnAnadir = new JButton("Añadir");
		btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox.addItem(textFieldTitulo.getText());
				textFieldTitulo.setText("");
			}
		});
		btnAnadir.setBounds(42, 139, 85, 21);
		contentPane.add(btnAnadir);
	}
}
