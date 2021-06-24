package Bank;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class LogIn extends JFrame {

	private JPanel contentPane;
	private JTextField txtCardNumber;
	private JPasswordField passwordField;
	static String get_card_no;
	//static String get_pin;
	protected static String get_pin;

	public static void main(String[] args) {
		
		LogIn log = new LogIn();
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn frame = new LogIn();
					ImageIcon ic = new ImageIcon(getClass().getClassLoader().getResource("bank_icon_129525.png"));

//					ImageIcon icon = new ImageIcon("C:\\Users\\udaya\\eclipse-workspace\\XYZ Bank\\Images\\bank_icon_129525.png");
					frame.setIconImage(ic.getImage());
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public LogIn() {
		super("XYZ Bank");
		setIconImage(Toolkit.getDefaultToolkit().getImage(LogIn.class.getResource("/Images/bank_icon_129525.png")));
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 496, 547);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBackground(new Color(204, 255, 255));
		contentPane_1.setBounds(0, 0, 480, 484);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(LogIn.class.getResource("/Images/icons8-bank-building-64.png")));
		lblNewLabel.setBounds(203, 0, 71, 59);
		contentPane_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("LOGIN");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(176, 63, 128, 42);
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(LogIn.class.getResource("/Images/login_icon_176905 (2).png")));
		lblNewLabel_2.setBounds(176, 103, 128, 119);
		contentPane_1.add(lblNewLabel_2);
		
		txtCardNumber = new JTextField();
		txtCardNumber.setToolTipText("");
		txtCardNumber.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtCardNumber.setText("");
				
			}
		});
		
		txtCardNumber.setText("XXXX-XXXX-XXXX-XXXX");
		txtCardNumber.setFont(new Font("Tahoma", Font.PLAIN, 24));
		txtCardNumber.setColumns(10);
		
		txtCardNumber.setBounds(167, 240, 278, 42);
		
		contentPane_1.add(txtCardNumber);
		//txtCardNumber.requestFocusInWindow();
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 24));
		passwordField.setBounds(167, 320, 278, 42);
		contentPane_1.add(passwordField);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Connection con = DBconnection.DBconnect();
				try 
				{
					Statement stat = con.createStatement();
					
					String check_connet = "select * from signup_3 where card_number = '"+txtCardNumber.getText().toString()+"' and pin_number = '"+passwordField.getText().toString()+"' ";
					ResultSet resultset = stat.executeQuery(check_connet);
					
					if(resultset.next())
					{
						get_card_no  = txtCardNumber.getText().toString();
						get_pin = passwordField.getText().toString();
						dispose();
						Dashboard frame = new Dashboard();
						frame.setVisible(true);
					}
					else
					{
						JOptionPane.showMessageDialog(null, "Sorry for inconveniance\nPlease try again");

					}
				} 
				catch (SQLException e1) 
				{
					
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.setBackground(new Color(102, 204, 51));
		btnNewButton.setBounds(26, 421, 116, 42);
		contentPane_1.add(btnNewButton);
		
		JButton btnSignup = new JButton("Signup");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				dispose();
				SignUp_1 frame = new SignUp_1();
				frame.setVisible(true);
				
			}
		});
		btnSignup.setForeground(Color.WHITE);
		btnSignup.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnSignup.setBackground(new Color(255, 51, 0));
		btnSignup.setBounds(176, 421, 116, 42);
		contentPane_1.add(btnSignup);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setForeground(Color.WHITE);
		btnClear.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		btnClear.setBackground(new Color(255, 102, 0));
		btnClear.setBounds(329, 421, 116, 42);
		contentPane_1.add(btnClear);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(26, 218, 419, 12);
		contentPane_1.add(separator);
		
		JLabel lblNewLabel_1_1 = new JLabel("CARD NO. -");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(10, 240, 144, 42);
		contentPane_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("PIN -\r\n");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(86, 319, 71, 42);
		contentPane_1.add(lblNewLabel_1_1_1);
		
		JButton btnNewButton_1 = new JButton("Forgot PIN\r\n");
		btnNewButton_1.setBackground(new Color(153, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				Forgot_PIN frame = new Forgot_PIN();
				frame.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setBounds(286, 374, 159, 21);
		contentPane_1.add(btnNewButton_1);
		//btnNewButton_1.setVisible(false);
	}
}
