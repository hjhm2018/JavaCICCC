package GUIAssignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrimeNumberChecker {

	private JFrame frmPrimeNumberChecker;
	private JTextField numberField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeNumberChecker window = new PrimeNumberChecker();
					window.frmPrimeNumberChecker.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrimeNumberChecker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrimeNumberChecker = new JFrame();
		frmPrimeNumberChecker.setTitle("Prime Number Checker");
		frmPrimeNumberChecker.setBounds(100, 100, 450, 300);
		frmPrimeNumberChecker.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrimeNumberChecker.getContentPane().setLayout(null);
		
		numberField = new JTextField();
		numberField.setBounds(143, 50, 220, 39);
		frmPrimeNumberChecker.getContentPane().add(numberField);
		numberField.setColumns(10);
		
		JLabel Number = new JLabel("Number");
		Number.setBounds(59, 50, 56, 39);
		frmPrimeNumberChecker.getContentPane().add(Number);
		
		JLabel labelQuestion = new JLabel("Is it a prime number?");
		labelQuestion.setBounds(176, 0, 127, 39);
		frmPrimeNumberChecker.getContentPane().add(labelQuestion);
		
		JLabel messageLabel = new JLabel("");
		messageLabel.setBounds(111, 158, 270, 39);
		frmPrimeNumberChecker.getContentPane().add(messageLabel);
		
		JButton checkButton = new JButton("Check");
		checkButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				try {
					int number = Integer.valueOf(numberField.getText());
					
					if(number < 0) {
						messageLabel.setText("Number must be positive");
					}else if(number < 2) {
						messageLabel.setText("Number must be >= 2 at least");
					}else if(number == 2) {
						messageLabel.setText(number + " is a prime number");
					} else {
						for(int x = 2; x < number; x++)
			            {
			            if(number % x == 0)
			            {
			            	messageLabel.setText(number + " is not a prime number");
			            	//return;
			            	break;
			            }
			            }
						messageLabel.setText(number + " is a prime number");
					}
				} catch(NumberFormatException nfe) {
					messageLabel.setText("It's not a number");
				}
								
			}
		});
		checkButton.setBounds(194, 112, 89, 23);
		frmPrimeNumberChecker.getContentPane().add(checkButton);
		
		
	}
}
