package GUIAssignments;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculator {

	private JFrame frmCalculator;
	private JTextField inputBox;

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
	
	public String lastNumber = "0";
	public float lastAnswer = 0;
	
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 450, 300);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(64, 70, 217, 43);
		frmCalculator.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton number7Button = new JButton("7");
		number7Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNumber = lastNumber + "7";
				//inputBox.setText(lastNumber);
			}
		});
		panel.add(number7Button);
		
		JButton number8Button = new JButton("8");
		number8Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNumber = lastNumber + "8";
				//inputBox.setText("8");
			}
		});
		panel.add(number8Button);
		
		JButton number9Button = new JButton("9");
		number9Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//initialAnswer = initialAnswer + 9;
				lastNumber = lastNumber + "9";
				//inputBox.setText("9");
			}
		});
		panel.add(number9Button);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(64, 114, 217, 43);
		frmCalculator.getContentPane().add(panel_1);
		panel_1.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton number4Button = new JButton("4");
		number4Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNumber = lastNumber + "4";
				//inputBox.setText("4");
			}
		});
		panel_1.add(number4Button);
		
		JButton number5Button = new JButton("5");
		number5Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNumber = lastNumber + "7";
				//inputBox.setText("5");
			}
		});
		panel_1.add(number5Button);
		
		JButton number6Button = new JButton("6");
		number6Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNumber = lastNumber + "6";
				//inputBox.setText("6");
			}
		});
		panel_1.add(number6Button);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(64, 158, 217, 43);
		frmCalculator.getContentPane().add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton button_3 = new JButton("1");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNumber = lastNumber + "1";
				//inputBox.setText("1");
			}
		});
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("2");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNumber = lastNumber + "2";
				//inputBox.setText("2");
			}
		});
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("3");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNumber = lastNumber + "3";
				//inputBox.setText("3");
			}
		});
		panel_2.add(button_5);
		
		JButton number0Button = new JButton("0");
		number0Button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lastNumber = lastNumber + "0";
				//inputBox.setText("0");
			}
		});
		number0Button.setBounds(135, 202, 72, 43);
		frmCalculator.getContentPane().add(number0Button);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(287, 70, 139, 127);
		frmCalculator.getContentPane().add(panel_3);
		panel_3.setLayout(new GridLayout(2, 2, 0, 0));
		
		JButton additionButton = new JButton("+");
		additionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				inputBox.setText(inputBox.getText() + "+" + lastNumber);
				lastAnswer = lastAnswer + Integer.valueOf(lastNumber);
			}
		});
		panel_3.add(additionButton);
		
		JButton substractionButton = new JButton("-");
		substractionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputBox.setText(inputBox.getText() + "-" + lastNumber);
				lastAnswer = lastAnswer - Integer.valueOf(lastNumber);
				
			}
		});
		panel_3.add(substractionButton);
		
		JButton divisionButton = new JButton("/");
		divisionButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputBox.setText(inputBox.getText() + "/" + lastNumber);
				lastAnswer = lastAnswer / Integer.valueOf(lastNumber);
			}
		});
		panel_3.add(divisionButton);
		
		JButton multiplyButton = new JButton("x");
		multiplyButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputBox.setText(inputBox.getText() + "*" + lastNumber);
				lastAnswer = lastAnswer * Integer.valueOf(lastNumber);
			}
		});
		panel_3.add(multiplyButton);
		
		inputBox = new JTextField();
		inputBox.setBounds(80, 11, 310, 43);
		frmCalculator.getContentPane().add(inputBox);
		inputBox.setColumns(10);
		
		JButton equalButton = new JButton("=");
		equalButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				inputBox.setText("");
			}
		});
		equalButton.setBounds(318, 198, 69, 63);
		frmCalculator.getContentPane().add(equalButton);
	}
}
