package GUIAssignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class PasswordGeneratorApp {

	private JFrame frmPasswordGenerator;
	private JTextField passLength;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordGeneratorApp window = new PasswordGeneratorApp();
					window.frmPasswordGenerator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PasswordGeneratorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordGenerator = new JFrame();
		frmPasswordGenerator.setTitle("Password Generator");
		frmPasswordGenerator.setBounds(100, 100, 450, 300);
		frmPasswordGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordGenerator.getContentPane().setLayout(null);
		
		JLabel PasswordGeneratorLabel = new JLabel("Password Generator");
		PasswordGeneratorLabel.setBounds(154, 22, 126, 34);
		frmPasswordGenerator.getContentPane().add(PasswordGeneratorLabel);
		
		passLength = new JTextField();
		passLength.setBounds(154, 67, 96, 20);
		frmPasswordGenerator.getContentPane().add(passLength);
		passLength.setColumns(10);
		
		JLabel PasswordLengthLabel = new JLabel("Password Length");
		PasswordLengthLabel.setBounds(25, 67, 111, 20);
		frmPasswordGenerator.getContentPane().add(PasswordLengthLabel);
		
		JLabel PasswordLabel = new JLabel("");
		PasswordLabel.setBounds(111, 161, 197, 28);
		frmPasswordGenerator.getContentPane().add(PasswordLabel);
		
		JButton GeneratePasswordButton = new JButton("Generate Password");
		GeneratePasswordButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int passwordLength = Integer.valueOf(passLength.getText());
				
				String alphabetUpperCase = "";
				String alphabetLowerCase = "";
				String allStrings;
				String randomStrings = "";
				String allowedSymbols = "!#$%&*<=>?@^|~";
				String numbers = "0123456789";
				
				for (int i = 65; i <= 90; i++){

					alphabetUpperCase = alphabetUpperCase + (char) i;
				}
				
				for (int i = 97; i <= 122; i++){

					alphabetLowerCase = alphabetLowerCase + (char) i;
				}
				
				Random rand = new Random();
				
				allStrings = alphabetUpperCase + alphabetLowerCase + allowedSymbols + numbers;
				
				for (int i = 0; i < passwordLength; i++){

					randomStrings = randomStrings + allStrings.charAt(rand.nextInt(allStrings.length()));
				}
				
				PasswordLabel.setText(randomStrings);
				
			}
		});
		GeneratePasswordButton.setBounds(124, 112, 167, 23);
		frmPasswordGenerator.getContentPane().add(GeneratePasswordButton);
		
		
	}
}
