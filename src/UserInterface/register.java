package UserInterface;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SpinnerListModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import UserAuthorization.UserFactory;
import UserAuthorization.register_limit;

public class register extends JFrame
{

	private JPanel contentPane;
	private JTextField textEmail;
	private JTextField textName;
	private JTextField textCity;
	private JTextField textCode;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	
	
	public register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Register");
		lblNewLabel1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel1.setForeground(Color.BLACK);
		lblNewLabel1.setBounds(290, 0, 137, 53);
		contentPane.add(lblNewLabel1);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(225, 110, 246, 29);
		contentPane.add(textEmail);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(225, 177, 246, 29);
		contentPane.add(textName);
		
		textCity = new JTextField();
		textCity.setColumns(10);
		textCity.setBounds(225, 381, 246, 29);
		contentPane.add(textCity);
		
		textCode = new JTextField();
		textCode.setColumns(10);
		textCode.setBounds(225, 507, 246, 29);
		contentPane.add(textCode);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerListModel(new String[] {"1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004"}));
		spinner.setBounds(225, 449, 246, 29);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_1 = new JLabel("\u05D0\u05D9\u05DE\u05D9\u05D9\u05DC");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(422, 84, 49, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u05E9\u05DD \u05D5\u05E9\u05DD \u05DE\u05E9\u05E4\u05D7\u05D4");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(359, 152, 112, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u05E1\u05D9\u05E1\u05DE\u05D0");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(422, 219, 49, 29);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u05D0\u05D9\u05DE\u05D5\u05EA \u05E1\u05D9\u05E1\u05DE\u05D0");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(376, 286, 95, 29);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("\u05E2\u05D9\u05E8 \u05DE\u05D2\u05D5\u05E8\u05D9\u05DD");
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(393, 354, 88, 29);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("\u05E9\u05E0\u05EA \u05DC\u05D9\u05D3\u05D4");
		lblNewLabel_1_5.setForeground(Color.RED);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(406, 421, 75, 29);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("\u05E1\u05D9\u05E1\u05DE\u05EA \u05DE\u05E0\u05D4\u05DC");
		lblNewLabel_1_6.setForeground(Color.RED);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_6.setBounds(376, 475, 105, 35);
		contentPane.add(lblNewLabel_1_6);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(225, 246, 246, 29);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(225, 314, 246, 29);
		contentPane.add(passwordField_1);
		
		JButton btnNewButton_1_1 = new JButton("\u05D4\u05E8\u05E9\u05DE\u05D4");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Password = passwordField.getText();
				String Password1 = passwordField_1.getText();
				String Email = textEmail.getText();
				String Name = textName.getText();
				String City = textCity.getText();
				String code = textCode.getText();
				String Year = spinner.getValue().toString();
				
				if(register_limit.passwordCheck(Password,Password1) && register_limit.mailValid(Email) && (code.isEmpty()|| code.equals("111"))) 
				{
					home nw = new home();
					nw.setVisible(true);
					setVisible(false);
					UserFactory.createUser(Email, Name, Password, Year, City, code);
					
				}
				else
				
					JOptionPane.showMessageDialog(null, "אחד הנתונים שגוי, אנא בדוק את נתוניך שוב");
				
			}
		});
		btnNewButton_1_1.setBounds(297, 553, 109, 36);
		contentPane.add(btnNewButton_1_1);
	}

}
