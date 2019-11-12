package GUIAssignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class RandomNumberGenerator {

	private JFrame frmRandomNumberGenerator;
	private JTextField minNumber;
	private JTextField maxNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RandomNumberGenerator window = new RandomNumberGenerator();
					window.frmRandomNumberGenerator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RandomNumberGenerator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRandomNumberGenerator = new JFrame();
		frmRandomNumberGenerator.setTitle("Random Number Generator");
		frmRandomNumberGenerator.setBounds(100, 100, 450, 300);
		frmRandomNumberGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRandomNumberGenerator.getContentPane().setLayout(null);
		
		JLabel GenerateRandomNumberLabel = new JLabel("Generate Random Number");
		GenerateRandomNumberLabel.setBounds(147, 11, 153, 36);
		frmRandomNumberGenerator.getContentPane().add(GenerateRandomNumberLabel);
		
		minNumber = new JTextField();
		minNumber.setBounds(210, 58, 137, 36);
		frmRandomNumberGenerator.getContentPane().add(minNumber);
		minNumber.setColumns(10);
		
		JLabel MinNumberLabel = new JLabel("Min. Number");
		MinNumberLabel.setBounds(113, 63, 74, 26);
		frmRandomNumberGenerator.getContentPane().add(MinNumberLabel);
		
		JLabel MaxNumberLabel = new JLabel("Max. Number");
		MaxNumberLabel.setBounds(113, 109, 74, 26);
		frmRandomNumberGenerator.getContentPane().add(MaxNumberLabel);
		
		maxNumber = new JTextField();
		maxNumber.setColumns(10);
		maxNumber.setBounds(210, 104, 137, 36);
		frmRandomNumberGenerator.getContentPane().add(maxNumber);
		
		JLabel lblRange = new JLabel("Range");
		lblRange.setBounds(58, 80, 47, 36);
		frmRandomNumberGenerator.getContentPane().add(lblRange);
		
		JLabel randomNumber = new JLabel("");
		randomNumber.setBounds(156, 194, 144, 36);
		frmRandomNumberGenerator.getContentPane().add(randomNumber);
		
		JButton btnGenerate = new JButton("Generate");
		
		btnGenerate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Random rand = new Random();
				
				int minValue = Integer.valueOf(minNumber.getText());
				int maxValue = Integer.valueOf(maxNumber.getText());

				randomNumber.setText(String.valueOf(rand.nextInt(rand.nextInt((maxValue - minValue) + 1) + minValue)));
			}
		});
		
		btnGenerate.setBounds(166, 159, 89, 23);
		frmRandomNumberGenerator.getContentPane().add(btnGenerate);
		
		
	}

}
