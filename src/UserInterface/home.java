package UserInterface;

import Application.MyZone_Logic;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Jtest.AppTest;
import UserAuthorization.Home_limit;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class home extends JFrame {

	private JPanel contentPane;
	private JTextField Email;
	private JPasswordField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
					frame.setSize(716, 650);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}			
			
		});
		
		Result result = JUnitCore.runClasses(AppTest.class);
		
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
		
	}

	/**
	 * Create the frame.
	 */
	public home() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Game Change");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(258, 0, 225, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_0 = new JLabel("By");
		lblNewLabel_0.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_0.setForeground(Color.BLACK);
		lblNewLabel_0.setBounds(554, 4, 31, 53);
		contentPane.add(lblNewLabel_0);
		
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_1_1.setIcon(new ImageIcon(home.class.getResource("/image/game change pic.jpg")));
		lblNewLabel_1_1.setBounds(0, 398, 700, 215);
		contentPane.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_1_1_1.setIcon(new ImageIcon(home.class.getResource("/image/bug_logo.jpg")));
		lblNewLabel_1_1_1.setBounds(585, 0, 162, 67);
		contentPane.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setVerticalAlignment(SwingConstants.TOP);
		
		JLabel lblNewLabel_1 = new JLabel("Email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBounds(337, 97, 56, 29);
		contentPane.add(lblNewLabel_1);
		
		Email = new JTextField();
		Email.setBounds(237, 123, 246, 29);
		contentPane.add(Email);
		Email.setColumns(10);
		
		JLabel lblNewLabel_1_2 = new JLabel("Password");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(323, 163, 90, 29);
		contentPane.add(lblNewLabel_1_2);
		
		JButton ButtonRegister = new JButton("\u05DE\u05E9\u05EA\u05DE\u05E9 \u05D7\u05D3\u05E9");
		ButtonRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				register nw = new register();
				nw.setVisible(true);
			}
		});
		ButtonRegister.setBounds(304, 296, 109, 36);
		contentPane.add(ButtonRegister);
		
		JButton ButtonLogin = new JButton("\u05DB\u05E0\u05D9\u05E1\u05D4");
		ButtonLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String Password = password.getText();
				String email = Email.getText();
				if(Home_limit.checkToLogin(email, Password)) 
				{
					MyZone_Logic.mailToCheck = email;
					MyZone nw = new MyZone ();
					nw.setVisible(true);
					setVisible(false);
					
				}
				else
				
					JOptionPane.showMessageDialog(null, "פרטיך שגויים / אינך רשום למערכת");
				
			}
		});
		ButtonLogin.setBounds(304, 239, 109, 36);
		contentPane.add(ButtonLogin);
		
		password = new JPasswordField();
		password.setBounds(237, 185, 246, 29);
		contentPane.add(password);
	}

}
