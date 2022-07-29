package ud1901;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

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
		contentPane.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		contentPane.setLayout(null);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		// etiqueta
		JLabel etiqueta = new JLabel("Escribe tu nombre: ");
		// colocar etiqueta
		etiqueta.setBounds(45, 27, 176, 41);
		// añadir etiqueta al panel
		contentPane.add(etiqueta);

		//input
		JTextField entradaNombre = new JTextField();
		entradaNombre.setBounds(45, 78, 340, 27);
		contentPane.add(entradaNombre);

		//boton 		
		JButton boton = new JButton("¡Saludar!");
		boton.setForeground(UIManager.getColor("List.selectionBackground"));
		boton.setBackground(UIManager.getColor("Label.foreground"));
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "¡Hola "+entradaNombre.getText()+"!");
			}
		});
		boton.setBounds(153, 172, 117, 25);
		contentPane.add(boton);
		
		
	}
}
