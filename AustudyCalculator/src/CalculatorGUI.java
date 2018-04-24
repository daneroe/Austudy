import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Button;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class CalculatorGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorGUI frame = new CalculatorGUI();
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
	public CalculatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 629, 667);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Please select your situation:");
		lblNewLabel.setBounds(52, 121, 333, 20);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("You are single, under 18 & living at home");
		rdbtnNewRadioButton.setBounds(54, 164, 356, 29);
		contentPane.add(rdbtnNewRadioButton);
		
		if (rdbtnNewRadioButton.isSelected()) {
			
			int scenarios = 1;
			
		}
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("You are single, over 18 and living at home");
		rdbtnNewRadioButton_1.setBounds(54, 202, 352, 29);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("You are single or in a couple, no children, living away from home");
		rdbtnNewRadioButton_2.setBounds(54, 240, 502, 29);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("You are in a couple with children");
		rdbtnNewRadioButton_3.setBounds(54, 280, 333, 29);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("You are single with children");
		rdbtnNewRadioButton_4.setBounds(54, 317, 333, 29);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JLabel lblPleaseEnterYour = new JLabel("Please enter your fortnightly income (before tax):");
		lblPleaseEnterYour.setBounds(52, 385, 398, 20);
		contentPane.add(lblPleaseEnterYour);
		
		textField = new JTextField();
		textField.setBounds(62, 432, 146, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		Button button = new Button("Calculate payment");
		button.setBounds(238, 431, 172, 27);
		contentPane.add(button);
		
		JLabel lblBasedOnYour = new JLabel("Your maximum fortnightly payment will be");
		lblBasedOnYour.setBounds(52, 473, 540, 68);
		contentPane.add(lblBasedOnYour);
		
		textField_1 = new JTextField();
		textField_1.setBounds(62, 544, 146, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
