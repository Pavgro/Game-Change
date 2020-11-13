package UserInterface;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import Application.changeGame_Logic;



public class changeGame extends JFrame {
	
	private JPanel contentPane;
	private JTextField text;
	public JTable tableChange;

	
	public changeGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 650);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel1 = new JLabel("החלפת משחקים");
		lblNewLabel1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel1.setForeground(Color.BLACK);
		lblNewLabel1.setBounds(229, 0, 243, 53);
		contentPane.add(lblNewLabel1);
		
		JLabel lblNewLabel_1_2 = new JLabel("\u05D4\u05E7\u05DC\u05D3 \u05E9\u05DD \u05DE\u05E9\u05D7\u05E7:");
		lblNewLabel_1_2.setForeground(Color.RED);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_2.setBounds(517, 49, 127, 29);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("\u05E9\u05DD \u05DE\u05E9\u05D7\u05E7");
		lblNewLabel_1_3.setForeground(Color.RED);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_3.setBounds(229, 124, 75, 29);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("\u05E7\u05D8\u05D2\u05D5\u05E8\u05D9\u05D4");
		lblNewLabel_1_4.setForeground(Color.RED);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_4.setBounds(346, 124, 64, 29);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("\u05D9\u05E6\u05D9\u05E8\u05EA \u05E7\u05E9\u05E8");
		lblNewLabel_1_5.setForeground(Color.RED);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_5.setBounds(439, 124, 75, 29);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("\u05D4\u05D9\u05E0\u05DA \u05D9\u05DB\u05D5\u05DC \u05DC\u05E8\u05DB\u05D5\u05E9 \u05D0\u05EA \u05D4\u05DE\u05E9\u05D7\u05E7 \u05D1\u05D0\u05EA\u05E8 \u05D4\u05D0\u05D9\u05E0\u05D8\u05E8\u05E0\u05D8 \u05E9\u05DC\u05E0\u05D5 - ");
		lblNewLabel_1_6.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_6.setBounds(153, 446, 368, 17);
		contentPane.add(lblNewLabel_1_6);
		
		
		JLabel lblNewLabel_1_7 = new JLabel("\u05DC\u05D0 \u05DE\u05E6\u05D0\u05EA \u05D4\u05D7\u05DC\u05E4\u05D4 \u05DE\u05EA\u05D0\u05D9\u05DE\u05D4?!");
		lblNewLabel_1_7.setForeground(Color.DARK_GRAY);
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_7.setBounds(325, 405, 196, 60);
		contentPane.add(lblNewLabel_1_7);
		
		text = new JTextField();
		text.setColumns(10);
		text.setBounds(390, 74, 246, 29);
		contentPane.add(text);
		
		JButton ButtonChange = new JButton("\u05D7\u05E4\u05E9");
		ButtonChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = text.getText();
				
				changeGame_Logic.nameGameToCheck = name;
				
				changeGame nw  = new changeGame ();
				nw.setVisible(true);
				setVisible(false);
				
			}
		});
		ButtonChange.setBounds(44, 70, 109, 36);
		contentPane.add(ButtonChange);
		
		JButton ButtonMyZone = new JButton("\u05D7\u05D6\u05E8\u05D4 \u05DC\u05D0\u05D6\u05D5\u05E8 \u05D4\u05D0\u05D9\u05E9\u05D9");
		ButtonMyZone.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setVisible(false);
				MyZone nw = new MyZone();
				nw.setVisible(true);
			}
		});
		ButtonMyZone.setBounds(44, 551, 121, 36);
		contentPane.add(ButtonMyZone);
		
		JButton ButtonBUG = new JButton("\u05DC\u05D7\u05E5 \u05DB\u05D0\u05DF");
		ButtonBUG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				changeGame_Logic.openWebPage("https://www.bug.co.il/");
				
			}
		});
		ButtonBUG.setBounds(63, 448, 90, 17);
		contentPane.add(ButtonBUG);
		
		
		tableChange = new JTable();
		tableChange.setBackground(Color.LIGHT_GRAY);
		tableChange.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Game Name", "Catagory", "Email"
			}
		));
		tableChange.getColumnModel().getColumn(0).setPreferredWidth(60);
		tableChange.getColumnModel().getColumn(1).setPreferredWidth(60);
		tableChange.getColumnModel().getColumn(2).setPreferredWidth(103);
		tableChange.setBounds(212, 150, 309, 263);
		contentPane.add(tableChange);
		DefaultTableModel model = changeGame_Logic.initTable();
		tableChange.setModel(model);
		
	}
}
