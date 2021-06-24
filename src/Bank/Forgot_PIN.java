package Bank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Toolkit;

public class Forgot_PIN extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	JLabel lblNewLabel_1_1;
	private JButton btnSendPinTo;
	private JLabel lblNewLabel_2;
	String otp;
	String  email;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Forgot_PIN frame = new Forgot_PIN();
					ImageIcon icon = new ImageIcon("C:\\Users\\udaya\\eclipse-workspace\\XYZ Bank\\Images\\bank_icon_129525.png");
					frame.setIconImage(icon.getImage());
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
	public Forgot_PIN() {
		super("XYZ Bank - Forgot PIN");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Forgot_PIN.class.getResource("/Images/bank_icon_129525.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 310);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Forgot PIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBackground(new Color(245, 255, 250));
		lblNewLabel.setBounds(276, 10, 152, 49);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_2.setVisible(false);
			}
		});
		textField.setBounds(201, 83, 548, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Your Email - ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(10, 83, 181, 34);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Request OTP");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				Pattern p1 = Pattern.compile("^[A-Za-z]\\w{2,29}@gmail\\.com$");
				email = textField.getText().toString();
				Matcher match3 = p1.matcher(email);
				boolean check3 = match3.matches();
				boolean check_mail = false;
				Connection connect = DBconnection.DBconnect();
				try
				{
					Statement statement = connect.createStatement();
					String queary = "select email from signup_1 where email = '"+email+"'";
					ResultSet result = statement.executeQuery(queary);
					if(result.next())
					{
						check_mail = true;
					}
					
				}
				catch (SQLException e1) 
				{
					
					e1.printStackTrace();
				}
				
				if(check3 == true && check_mail == true)
				{
					btnSendPinTo.setVisible(true);
					textField_1.setVisible(true);
					lblNewLabel_1_1.setVisible(true);
					lblNewLabel_2.setVisible(false);
					JOptionPane.showMessageDialog(null, "OTP is successefully sent to "+email+"\nPlease Check Your Email Inbox");
					
					
					Random ran = new Random();
					int get = ran.nextInt(999999);
					
					otp = String.valueOf(get);
					

					String message = "your OTP is "+otp+".";		//"uday you did it bro keep going ";
			        
			        String subject = "XYZ BANK";
			        String to = email;
			        String from = "paperpattern1616@gmail.com";
			        
			       App.sendEmail(message,subject,to,from);
			       
					// send email code
				}
				else if(check3 == true)
				{
					JOptionPane.showMessageDialog(null, email+" this email address was not found in our\ndatabase please enter valid email");
					textField.setText("");
					textField.requestFocusInWindow();
				}
				else
				{
					lblNewLabel_2.setVisible(true);
					
				}
				
			}
		});
		btnNewButton.setBackground(new Color(240, 128, 128));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(201, 217, 174, 29);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(201, 149, 548, 34);
		contentPane.add(textField_1);
		
		
		lblNewLabel_1_1 = new JLabel("Enter OTP - ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(10, 149, 181, 34);
		contentPane.add(lblNewLabel_1_1);
		
		btnSendPinTo = new JButton("Send PIN To Eamil");
		btnSendPinTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(otp.equals(textField_1.getText().toString()))
				{
					//database code remaining
					
					Connection con = DBconnection.DBconnect();
					try 
					{
						Statement st = con.createStatement();
					
						String Get_pin = SignUp_3.create_pin_no();
						String getdata = "select form_number from signup_1 where email = '"+email+"'";
						ResultSet resultSet = st.executeQuery(getdata);
						
						int form_No = 0;
						
						if(resultSet.next())
						{
							
							form_No = resultSet.getInt("form_number");
						}
						
						Statement star = con.createStatement();
						String fix = "select pin_number from signup_3 where form_number = '"+form_No+"'";
						ResultSet resul = st.executeQuery(fix);
						String find = null;
						if(resul.next())
						{
							find = resul.getString("pin_number");
						}
						//System.out.println(find);
						
						
						PreparedStatement pre = con.prepareStatement("update signup_3 set pin_number = replace(pin_number, '"+find+"','"+Get_pin+"') where form_number = '"+form_No+"' ");
						pre.executeUpdate();

						//System.out.println(Get_pin);
						
						String message = "Your New PIN Is "+Get_pin+".\nThank You.";		//"uday you did it bro keep going ";
				        
				        String subject = "XYZ BANK";
				        String to = email;
				        String from = "paperpattern1616@gmail.com";
				        
				       App.sendEmail(message,subject,to,from);
				       
				       JOptionPane.showMessageDialog(null, "PIN Successfully changed:)");
				       dispose();
				       LogIn frame = new LogIn();
						frame.setVisible(true);
						
					} 
					catch (SQLException e1) 
					{
						
						e1.printStackTrace();
					}
					//JOptionPane.showMessageDialog(null, "PIN Successfully changed:)");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Wrong OTP :(");
					textField_1.setText("");
					textField_1.requestFocusInWindow();
					
				}
			}
		});
		btnSendPinTo.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSendPinTo.setBackground(new Color(152, 251, 152));
		btnSendPinTo.setBounds(490, 217, 259, 29);
		contentPane.add(btnSendPinTo);
		btnSendPinTo.setVisible(false);
		
		lblNewLabel_2 = new JLabel("Enter Valid Email ID");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(201, 116, 339, 23);
		contentPane.add(lblNewLabel_2);
		lblNewLabel_2.setVisible(false);
		textField_1.setVisible(false);
		lblNewLabel_1_1.setVisible(false);
	}
}
