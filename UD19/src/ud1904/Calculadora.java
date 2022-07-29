package ud1904;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldOper1;
	private JTextField textFieldOper2;
	private JTextField textFieldRes;


	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOper1 = new JLabel("Operando 1");
		lblOper1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOper1.setBounds(21, 37, 96, 19);
		contentPane.add(lblOper1);
		
		JLabel lblOper2 = new JLabel("Operando 2");
		lblOper2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblOper2.setBounds(141, 37, 96, 19);
		contentPane.add(lblOper2);
		
		JLabel lblRes = new JLabel("Resultado");
		lblRes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRes.setBounds(283, 37, 103, 18);
		contentPane.add(lblRes);
		
		JLabel lblHistorico = new JLabel("Histórico: ");
		lblHistorico.setBounds(92, 240, 255, 23);
		contentPane.add(lblHistorico);
		
		textFieldOper1 = new JTextField();
		textFieldOper1.setBounds(21, 60, 96, 19);
		contentPane.add(textFieldOper1);
		textFieldOper1.setColumns(10);
		
		textFieldOper2 = new JTextField();
		textFieldOper2.setBounds(141, 60, 96, 19);
		contentPane.add(textFieldOper2);
		textFieldOper2.setColumns(10);
		
		textFieldRes = new JTextField();
		textFieldRes.setBounds(283, 59, 128, 19);
		contentPane.add(textFieldRes);
		textFieldRes.setColumns(10);
		textFieldRes.setEditable(false);
		
		ActionListener actList = new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Double num1, num2, res = 0.0;
				num1 = Double.parseDouble(textFieldOper1.getText());
				num2 = Double.parseDouble(textFieldOper2.getText());
				
				JButton boton = (JButton)arg0.getSource();
				switch(boton.getText()) {
				case "Sumar":
					res = num1 + num2;
					break;
				case "Restar":
					res = num1 - num2;
					break;
				case "Multiplicar":
					res = num1 * num2;
					break;
				case "Dividir":
					res = num1 / num2;
					break;
				case "Salir":
					dispose();
					break;
				case "About":
					JOptionPane.showMessageDialog(null, "team-5");
					break;
				}
				lblHistorico.setText(lblHistorico.getText()+" "+textFieldRes.getText());
				textFieldRes.setText(Double.toString(res));
			}
		};
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addActionListener(actList);
		btnSumar.setBounds(41, 110, 96, 32);
		contentPane.add(btnSumar);
		
		JButton btnRestar = new JButton("Restar");
		btnRestar.addActionListener(actList);
		btnRestar.setBounds(251, 110, 96, 32);
		contentPane.add(btnRestar);
		
		JButton btnMult = new JButton("Multiplicar");
		btnMult.addActionListener(actList);
		btnMult.setBounds(41, 152, 96, 32);
		contentPane.add(btnMult);
		
		JButton btnDiv = new JButton("Dividir");
		btnDiv.addActionListener(actList);
		btnDiv.setBounds(251, 152, 96, 32);
		contentPane.add(btnDiv);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(actList);
		btnSalir.setBounds(41, 202, 96, 34);
		contentPane.add(btnSalir);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(actList);
		btnAbout.setBounds(251, 202, 96, 34);
		contentPane.add(btnAbout);
	}
	
	
	

}
