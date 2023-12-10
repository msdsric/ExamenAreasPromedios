package Calculadora_Basica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora_Basica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel jLabell;
int num1,num2;
String signo;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora_Basica frame = new Calculadora_Basica();
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
	public Calculadora_Basica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"2");
			}
		});
		btnNewButton_1.setBounds(10, 79, 55, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"4");
			}
		});
		btnNewButton_2.setBounds(10, 147, 55, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"5");
			}
		});
		btnNewButton_3.setBounds(10, 184, 55, 23);
		contentPane.add(btnNewButton_3);
		
		
		JButton btnNewButton_4 = new JButton("3");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"3");
			}
		});
		btnNewButton_4.setBounds(10, 113, 55, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"6");
			}
		});
		btnNewButton_5.setBounds(10, 218, 55, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("+");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(jLabell.getText());
				signo="+";
				jLabell.setText("");
			}
		});
		btnNewButton_6.setBounds(75, 218, 45, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText("");
			}
		});
		btnC.setBounds(75, 184, 45, 23);
		contentPane.add(btnC);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"9");
			}
		});
		btnNewButton_9.setBounds(75, 113, 45, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("8");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"8");
			}
			
		});
		btnNewButton_10.setBounds(75, 79, 45, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("7");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"7");
			}
		});
		btnNewButton_11.setBounds(75, 49, 45, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("1");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"1");;
			}
		});
		btnNewButton_12.setBounds(10, 49, 55, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Integer.parseInt(jLabell.getText());
				switch(signo) {
				case "+": 
					jLabell.setText(Integer.toString(num1+num2));
					break;
				case "*": 
					jLabell.setText(Integer.toString(num1*num2));
					break;
				case "/": 
					jLabell.setText(Integer.toString(num1/num2));
					break;
				case "-": 
					jLabell.setText(Integer.toString(num1-num2));
					break;
				}
			}
		});
		btnNewButton_14.setBounds(130, 49, 61, 23);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("-");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(jLabell.getText());
				signo="-";
				jLabell.setText("");
			}
		});
		btnNewButton_15.setBounds(130, 79, 61, 23);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("/");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(jLabell.getText());
				signo="/";
				jLabell.setText("");
			}
		});
		btnNewButton_16.setBounds(130, 113, 61, 23);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("*");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(jLabell.getText());
				signo="*";
				jLabell.setText("");
			}
		});
		btnNewButton_17.setBounds(130, 147, 55, 23);
		contentPane.add(btnNewButton_17);
		
		jLabell = new JLabel("");
		jLabell.setBounds(10, 11, 414, 27);
		contentPane.add(jLabell);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jLabell.setText(jLabell.getText()+"0");
			}
		});
		btnNewButton_7.setBounds(75, 147, 45, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton = new JButton("Clic para ir a calculadora de áreas y perimetros");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				this.setVisible(false);
				Areas_Perimetros c = new Areas_Perimetros();
				c.setVisible(true);
				
				
				
				
			}

			private void setVisible(boolean b) {
				// TODO Auto-generated method stub
				
			}
			
		});
		btnNewButton.setBounds(130, 194, 294, 47);
		contentPane.add(btnNewButton);
	}
}
