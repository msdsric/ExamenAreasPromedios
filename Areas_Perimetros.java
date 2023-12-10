package Calculadora_Basica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Areas_Perimetros extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Areas_Perimetros frame = new Areas_Perimetros();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Areas_Perimetros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ir a Calculadora Basica");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
				Calculadora_Basica a = new Calculadora_Basica();
				a.setVisible(true);
				
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton.setBounds(297, 227, 127, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("triangulo");
		lblNewLabel.setBounds(10, 11, 70, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(51, 36, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("lado1");
		lblNewLabel_1.setBounds(10, 39, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("lado2");
		lblNewLabel_1_1.setBounds(10, 64, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("lado3");
		lblNewLabel_1_2.setBounds(10, 89, 46, 14);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("area");
		lblNewLabel_1_3.setBounds(10, 174, 46, 14);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("perimetro");
		lblNewLabel_1_4.setBounds(10, 199, 46, 14);
		contentPane.add(lblNewLabel_1_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(51, 61, 86, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(51, 89, 86, 20);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_2 = new JLabel("altura");
		lblNewLabel_2.setBounds(10, 120, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_3 = new JTextField();
		textField_3.setBounds(51, 120, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("base");
		lblNewLabel_3.setBounds(10, 151, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(51, 145, 86, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(51, 171, 86, 20);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(61, 196, 86, 20);
		contentPane.add(textField_6);
		
		JLabel lblCuadrado = new JLabel("cuadrado");
		lblCuadrado.setBounds(173, 11, 70, 14);
		contentPane.add(lblCuadrado);
		
		JLabel lblNewLabel_1_5 = new JLabel("lado1");
		lblNewLabel_1_5.setBounds(158, 39, 46, 14);
		contentPane.add(lblNewLabel_1_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(195, 36, 86, 20);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(195, 83, 86, 20);
		contentPane.add(textField_8);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("area");
		lblNewLabel_1_3_1.setBounds(158, 89, 46, 14);
		contentPane.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_4_1 = new JLabel("perimetro");
		lblNewLabel_1_4_1.setBounds(158, 120, 46, 14);
		contentPane.add(lblNewLabel_1_4_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(205, 117, 86, 20);
		contentPane.add(textField_9);
		
		JButton btnNewButton_1 = new JButton("calcular");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double area, perimetro, lado1, lado2, lado3, base, altura;
				base=Double.valueOf(textField_4.getText());
				altura=Double.valueOf(textField_3.getText());
				lado1= Double.valueOf(textField.getText());
				lado2= Double.valueOf(textField_1.getText());
				lado3=Double.valueOf(textField_2.getText());
				
				perimetro= lado1+lado2+lado3;
				area=(base*altura)/2;
				
				textField_5.setText(String.valueOf(area));
				textField_6.setText(String.valueOf(perimetro));
			}
		});
		btnNewButton_1.setBounds(48, 227, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Calcular C");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double area,perimetro,lado1;
				lado1=Double.valueOf(textField_7.getText());
				
				perimetro= lado1*4;
				area= lado1*lado1;
				
				textField_8.setText(String.valueOf(area));
				textField_9.setText(String.valueOf(perimetro));
				
			}
		});
		btnNewButton_2.setBounds(168, 147, 89, 23);
		contentPane.add(btnNewButton_2);
	}

}
