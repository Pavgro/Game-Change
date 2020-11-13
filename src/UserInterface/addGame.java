package UserInterface;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import Application.addGame_Logic;



public class addGame extends JFrame
{
	private JPanel contentPane;
	private JTextField textNameGame;
	private JTextField textCatgory;
	private JTextField textName;
	private JTextField textCity;
	private JTextField textEmail;
	
	
	public addGame() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("הוספת משחק");
		lblNewLabel1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel1.setForeground(Color.BLACK);
		lblNewLabel1.setBounds(247, 0, 203, 53);
		contentPane.add(lblNewLabel1);
		
		textNameGame = new JTextField();
		textNameGame.setColumns(10);
		textNameGame.setBounds(225, 110, 246, 29);
		contentPane.add(textNameGame);
		
		textCatgory = new JTextField();
		textCatgory.setColumns(10);
		textCatgory.setBounds(225, 177, 246, 29);
		contentPane.add(textCatgory);
		
		textName = new JTextField();
		textName.setColumns(10);
		textName.setBounds(225, 246, 246, 29);
		contentPane.add(textName);
		
		textCity = new JTextField();
		textCity.setColumns(10);
		textCity.setBounds(225, 314, 246, 29);
		contentPane.add(textCity);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(225, 381, 246, 29);
		contentPane.add(textEmail);
		
		JLabel lblNewLabel_1 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05D7\u05E7");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(396, 84, 75, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u05E7\u05D8\u05D2\u05D5\u05E8\u05D9\u05D4");
		lblNewLabel_1_1.setForeground(Color.RED);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(413, 152, 58, 29);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u05D1\u05E2\u05DC \u05D4\u05DE\u05E9\u05D7\u05E7");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(383, 219, 88, 29);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u05E2\u05D9\u05E8 \u05DE\u05D2\u05D5\u05E8\u05D9\u05DD");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(390, 286, 81, 29);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("\u05D0\u05D9\u05DE\u05D9\u05D9\u05DC");
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(419, 354, 52, 29);
		contentPane.add(lblNewLabel_1_4);
		
		
		JButton buttonToZone = new JButton("\u05D7\u05D6\u05E8\u05D4 \u05DC\u05D0\u05D6\u05D5\u05E8 \u05D0\u05D9\u05E9\u05D9");
		buttonToZone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				MyZone nw = new MyZone();
				nw.setVisible(true);
			}
		});
		buttonToZone.setBounds(268, 513, 137, 36);
		contentPane.add(buttonToZone);
		
		JButton ButtonAddGame = new JButton("\u05D4\u05D5\u05E1\u05E4\u05EA \u05DE\u05E9\u05D7\u05E7");
		ButtonAddGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Email = textEmail.getText();
				String Name = textName.getText();
				String City = textCity.getText();
				String NameGame = textNameGame.getText();
				String Catgory = textCatgory.getText();
				
					
					
					if(addGame_Logic.mailValid(Email)) 
					{
						MyZone nw = new MyZone();
						nw.setVisible(true);
						setVisible(false);
						addGame_Logic.createGame(Name, Email, NameGame, Catgory, City);
						
					}
					else
					
						JOptionPane.showMessageDialog(null, "האימייל שהזנת שגוי");
					
				
			}
		});
		
		ButtonAddGame.setBounds(282, 451, 109, 36);
		contentPane.add(ButtonAddGame);
			
	}

}
