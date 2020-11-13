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
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import Application.MyZone_Logic;


public class MyZone extends JFrame
{

	private JPanel contentPane;
	public JTable table;
	
	
	public MyZone() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("אזור אישי");
		lblNewLabel1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel1.setForeground(Color.BLACK);
		lblNewLabel1.setBounds(280, 0, 150, 53);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel_1 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05D7\u05E7");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(245, 53, 75, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u05E7\u05D8\u05D2\u05D5\u05E8\u05D9\u05D4");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(397, 53, 75, 29);
		contentPane.add(lblNewLabel_1_2);
		
		
		
		//Buttons
		JButton ButtonAddGame = new JButton("\u05D4\u05D5\u05E1\u05E4\u05EA \u05DE\u05E9\u05D7\u05E7");
		ButtonAddGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				addGame nw = new addGame();
				nw.setVisible(true);
			}
		});
		ButtonAddGame.setBounds(63, 530, 109, 36);
		contentPane.add(ButtonAddGame);
		
		
		
		JButton ButtonFindGame = new JButton("\u05D7\u05D9\u05E4\u05D5\u05E9 \u05DE\u05E9\u05D7\u05E7");
		ButtonFindGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				changeGame nw = new changeGame();
				nw.setVisible(true);
			}
		});
		ButtonFindGame.setBounds(518, 530, 109, 36);
		contentPane.add(ButtonFindGame);
		
		JButton buttonRefresh = new JButton("\u05E8\u05E2\u05E0\u05DF \u05DE\u05E9\u05D7\u05E7\u05D9\u05DD");
		buttonRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				MyZone nw = new MyZone();
				nw.setVisible(true);
			}
		});
		buttonRefresh.setBounds(291, 530, 109, 33);
		contentPane.add(buttonRefresh);
		
		
		
		table = new JTable();
		table.setBackground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Game Name", "Catagory"
			}
		));
		table.setBounds(212, 81, 309, 390);
		contentPane.add(table);
		DefaultTableModel model = MyZone_Logic.initTable();
		table.setModel(model);
		
	}
};
	
	
	
	

