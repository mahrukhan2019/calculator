package CalculatorApp;
/*
	 * Mahrukh Khan
	 * This program will create a GUI calculator to compute values using +,-,*,/, %.
 */

	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JTextField;
	import javax.swing.JButton;
	import java.awt.Color;
	import java.awt.event.ActionListener;
	import java.awt.event.ActionEvent;
	import java.awt.Font;
	import javax.swing.SwingConstants;	
	
public class Calculator {

		// create variables
		private JFrame frmCalculator;
		private JTextField textField;
		double num1;
		double num2;
		double result;
		String operation;
		String answer;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Calculator window = new Calculator();
						window.frmCalculator.setVisible(true);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

		/**
		 * Create the application.
		 */
		public Calculator() {
			initialize();
		}

		/**
		 * Initialize the contents of the frame.
		 */
		private void initialize() {
			// create JFrame
			frmCalculator = new JFrame();
			// set JFrame properties such as title, background...
			frmCalculator.setTitle("Calculator");
			frmCalculator.setResizable(false);
			frmCalculator.setBackground(Color.PINK);
			frmCalculator.getContentPane().setBackground(Color.PINK);
			frmCalculator.setBounds(100, 100, 343, 515);
			frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frmCalculator.getContentPane().setLayout(null);

			// create textfield
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.RIGHT);
			textField.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
			textField.setBounds(9, 6, 325, 85);
			frmCalculator.getContentPane().add(textField);
			textField.setColumns(10);

			// create buttons for all the numbers 1-9

			JButton button = new JButton("7");
			button.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button.getText();
					textField.setText(enterNum);
				}
			});
			button.setBounds(15, 175, 71, 68);
			frmCalculator.getContentPane().add(button);

			JButton button_1 = new JButton("8");
			button_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button_1.getText();
					textField.setText(enterNum);
				}
			});
			button_1.setBounds(95, 175, 71, 68);
			frmCalculator.getContentPane().add(button_1);

			JButton button_2 = new JButton("9");
			button_2.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button_2.getText();
					textField.setText(enterNum);
				}
			});
			button_2.setBounds(175, 175, 71, 68);
			frmCalculator.getContentPane().add(button_2);

			JButton button_3 = new JButton("4");
			button_3.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button_3.getText();
					textField.setText(enterNum);
				}
			});
			button_3.setBounds(15, 255, 71, 68);
			frmCalculator.getContentPane().add(button_3);

			JButton button_4 = new JButton("5");
			button_4.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button_4.getText();
					textField.setText(enterNum);
				}
			});
			button_4.setBounds(95, 255, 71, 68);
			frmCalculator.getContentPane().add(button_4);

			JButton button_5 = new JButton("6");
			button_5.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button_5.getText();
					textField.setText(enterNum);
				}
			});
			button_5.setBounds(175, 255, 71, 68);
			frmCalculator.getContentPane().add(button_5);

			JButton button_6 = new JButton("1");
			button_6.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button_6.getText();
					textField.setText(enterNum);
				}
			});
			button_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {

				}
			});
			button_6.setBounds(15, 335, 71, 68);
			frmCalculator.getContentPane().add(button_6);

			JButton button_7 = new JButton("2");
			button_7.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button_7.getText();
					textField.setText(enterNum);
				}
			});
			button_7.setBounds(95, 335, 71, 68);
			frmCalculator.getContentPane().add(button_7);

			JButton button_8 = new JButton("3");
			button_8.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button_8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button_8.getText();
					textField.setText(enterNum);
				}
			});
			button_8.setBounds(175, 335, 71, 68);
			frmCalculator.getContentPane().add(button_8);

			JButton button_11 = new JButton("0");
			button_11.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
			button_11.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String enterNum = textField.getText() + button_11.getText();
					textField.setText(enterNum);
				}
			});
			button_11.setBounds(15, 414, 149, 68);
			frmCalculator.getContentPane().add(button_11);

			// create button for clear

			JButton btnAc = new JButton("AC");
			btnAc.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			btnAc.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField.setText(null);
				}
			});
			btnAc.setBounds(15, 103, 71, 68);
			frmCalculator.getContentPane().add(btnAc);

			// create buttons for all the operations

			JButton button_9 = new JButton("+/-");
			button_9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					double oppositeNum = Double.parseDouble(String.valueOf(textField.getText()));
					oppositeNum = oppositeNum * (-1);
					textField.setText(String.valueOf(oppositeNum));
				}

			});
			button_9.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			button_9.setBounds(95, 103, 71, 68);
			frmCalculator.getContentPane().add(button_9);

			JButton button_10 = new JButton("%");
			button_10.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "%";
				}
			});
			button_10.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			button_10.setBounds(175, 103, 71, 68);
			frmCalculator.getContentPane().add(button_10);

			JButton button_12 = new JButton(".");
			button_12.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (!textField.getText().contains(".")) {
						String enterNum = textField.getText() + button_12.getText();
						textField.setText(enterNum);
					}
				}
			});
			button_12.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
			button_12.setBounds(175, 414, 71, 68);
			frmCalculator.getContentPane().add(button_12);

			JButton button_13 = new JButton("/");
			button_13.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "/";
				}
			});
			button_13.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			button_13.setBounds(258, 103, 71, 68);
			frmCalculator.getContentPane().add(button_13);

			JButton btnX = new JButton("x");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "*";
				}
			});
			btnX.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			btnX.setBounds(258, 175, 71, 68);
			frmCalculator.getContentPane().add(btnX);

			JButton button_14 = new JButton("-");
			button_14.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "-";
				}
			});
			button_14.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			button_14.setBounds(259, 255, 71, 68);
			frmCalculator.getContentPane().add(button_14);

			JButton button_15 = new JButton("+");
			button_15.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num1 = Double.parseDouble(textField.getText());
					textField.setText("");
					operation = "+";
				}
			});
			button_15.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			button_15.setBounds(258, 335, 71, 68);
			frmCalculator.getContentPane().add(button_15);

			// create button for =

			JButton button_16 = new JButton("=");
			button_16.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					num2 = Double.parseDouble(textField.getText());

					// addition
					if (operation == "+") {
						result = num1 + num2;
						answer = String.format("%.2f", result);
						textField.setText(answer);

					}
					// subtraction
					else if (operation == "-") {
						result = num1 - num2;
						answer = String.format("%.2f", result);
						textField.setText(answer);

					}
					// Multiplication
					else if (operation == "*") {
						result = num1 * num2;
						answer = String.format("%.2f", result);
						textField.setText(answer);

					}
					// division
					else if (operation == "/") {
						result = num1 / num2;
						answer = String.format("%.2f", result);
						textField.setText(answer);

					}
					// modulus
					else if (operation == "%") {
						result = num1 % num2;
						answer = String.format("%.2f", result);
						textField.setText(answer);

					}

				}
			});
			button_16.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
			button_16.setBounds(258, 414, 71, 68);
			frmCalculator.getContentPane().add(button_16);
		}
	}

	


