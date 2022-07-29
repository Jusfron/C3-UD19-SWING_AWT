package ud1903;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Enumeration;
import java.awt.event.ActionEvent;

public class Encuesta extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the frame.
	 */
	public Encuesta() {
		setVisible(true);
		setTitle("Encuesta tecnologica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Windows");
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(20, 42, 89, 39);
		contentPane.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Linux");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(122, 42, 77, 39);
		contentPane.add(rdbtnNewRadioButton_1);

		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Mac");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(211, 42, 64, 39);
		contentPane.add(rdbtnNewRadioButton_2);

		JLabel lblNewLabel = new JLabel("Elije un sistema operativo");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(20, 11, 218, 39);
		contentPane.add(lblNewLabel);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Programacion");
		chckbxNewCheckBox.setBounds(20, 116, 117, 23);
		contentPane.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Diseño gráfico");
		chckbxNewCheckBox_1.setBounds(143, 116, 132, 23);
		contentPane.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Administración");
		chckbxNewCheckBox_2.setBounds(277, 116, 146, 23);
		contentPane.add(chckbxNewCheckBox_2);

		JLabel lblNewLabel_1 = new JLabel("Elije tu especialidad");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 74, 191, 47);
		contentPane.add(lblNewLabel_1);

		JSlider slider = new JSlider();
		slider.setName("");
		slider.setToolTipText("");
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(1);
		slider.setValueIsAdjusting(true);
		slider.setSnapToTicks(true);
		slider.setValue(0);
		slider.setMaximum(10);
		slider.setBounds(20, 175, 200, 31);
		contentPane.add(slider);

		JLabel lblNewLabel_2 = new JLabel("Horas dedicadas en el pc");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 146, 309, 23);
		contentPane.add(lblNewLabel_2);

		JButton ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						"Sistema:  \n" + sacarTexto() + "\n\nEspecialidad:"
								+ sacarEspecialidad(chckbxNewCheckBox, chckbxNewCheckBox_1, chckbxNewCheckBox_2)
								+ "\nHoras dedicadas: " + slider.getValue());
				setVisible(false);
			}
		});
		ok.setBounds(173, 217, 89, 35);
		contentPane.add(ok);

	}

	private String sacarTexto() {
		Enumeration<AbstractButton> botones = buttonGroup.getElements();
		String text = "";
		while (botones.hasMoreElements()) {
			AbstractButton boton = botones.nextElement();
			if (boton.isSelected()) {
				text = boton.getText();
			}
		}
		return text;
	}

	private String sacarEspecialidad(JCheckBox chckbxNewCheckBox, JCheckBox chckbxNewCheckBox_1,
			JCheckBox chckbxNewCheckBox_2) {
		String text = "\n";
		if (chckbxNewCheckBox.isSelected()) {
			text = chckbxNewCheckBox.getText() + "\n";
		}
		if (chckbxNewCheckBox_1.isSelected()) {
			text = text + chckbxNewCheckBox_1.getText() + "\n";
		}
		if (chckbxNewCheckBox_2.isSelected()) {
			text = text + chckbxNewCheckBox_2.getText() + "\n";
		}
		if (text.equals("\n")) {
			text = "no hay especialidad";
		}

		return text;
	}

	private String sacarHoras() {
		String text = "";
		return text;
	}
}
