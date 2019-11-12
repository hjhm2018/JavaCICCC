package GUIAssignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Palindrome {

	private JFrame frmPalindrome;
	private JTextField originalWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Palindrome window = new Palindrome();
					window.frmPalindrome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Palindrome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPalindrome = new JFrame();
		frmPalindrome.setTitle("Palindrome");
		frmPalindrome.setBounds(100, 100, 450, 300);
		frmPalindrome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPalindrome.getContentPane().setLayout(null);
		
		originalWord = new JTextField();
		originalWord.setToolTipText("insert word");
		originalWord.setBounds(113, 23, 178, 39);
		frmPalindrome.getContentPane().add(originalWord);
		originalWord.setColumns(10);
		
		JLabel wordLabel = new JLabel("Word");
		wordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		wordLabel.setBounds(44, 23, 59, 39);
		frmPalindrome.getContentPane().add(wordLabel);
		
		JButton checkPalidrome = new JButton("Check");
		
		checkPalidrome.setBounds(144, 73, 105, 39);
		frmPalindrome.getContentPane().add(checkPalidrome);
		
		JLabel OutputMessage = new JLabel("");
		OutputMessage.setBounds(98, 137, 215, 39);
		frmPalindrome.getContentPane().add(OutputMessage);
		
		
		checkPalidrome.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String word = originalWord.getText().toLowerCase();
				
				String reversedWord = "";
				
				for(int i = word.length() - 1; i >= 0; i--) {
					reversedWord = reversedWord + word.charAt(i);
				}
				
				if(word.equals(reversedWord)) {
					OutputMessage.setText(word.substring(0, 1).toUpperCase() + word.substring(1) + " is a palindrome");
				} else {
					OutputMessage.setText(word.substring(0, 1).toUpperCase() + word.substring(1) + " is not a palindrome");
				}
			}
		});
	}
}
