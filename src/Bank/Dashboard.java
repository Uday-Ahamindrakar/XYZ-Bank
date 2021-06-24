package Bank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLayeredPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	private JLayeredPane layeredPane;
	private JPanel withdrawl;
	private JPanel deposit;
	private JPanel balance;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem;
	private JPanel panel_4;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_10_1;
	private JLabel lblNewLabel_11_1;
	private JLabel lblNewLabel_10_2;
	private JLabel lblNewLabel_11_2;
	private JLabel lblNewLabel_10_3;
	private JLabel lblNewLabel_11_3;
	private JLabel lblNewLabel_10_4;
	private JLabel lblNewLabel_11_4;
	private JLabel lblNewLabel_10_5;
	private JLabel lblNewLabel_11_5;
	private JLabel lblNewLabel_10_6;
	private JLabel lblNewLabel_11_6;
	private JLabel lblNewLabel_10_7;
	private JLabel lblNewLabel_11_7;
	private JLabel lblNewLabel_10_8;
	private JLabel lblNewLabel_11_8;
	private JLabel lblNewLabel_10_9;
	private JLabel lblNewLabel_11_9;
	private JLabel lblNewLabel_10_10;
	private JLabel lblNewLabel_11_10;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JLabel lblNewLabel_20;
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_22;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JButton btnCashWithdrawl;
	private JButton btnBalanceEnquiry;
	private JPanel fastcash;
	private JButton btnFastCash;
	private JButton btnPinChange;
	private JButton btnExit;
	private JPanel pinchange;
	private JButton persnal_info;
	private JPanel ministate;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	public static int final_balence;
	private JLabel lblNewLabel_2;
	int form_num = 0;
	private JTextField textField_1;
	private JPasswordField passwordField_1;
	String email_id = null;
	private JLabel lblBalence;
	private JSeparator separator_3;
	private JLabel lblNewLabel_4;
	private JPasswordField passwordField_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_25;
	private JLabel lblNewLabel_26;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void switchPane(JPanel panel)
	{
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
	}
	
	public Dashboard() {
		setTitle("XYZ BANK - DASHBOARD");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Dashboard.class.getResource("/Images/bank_icon_129525.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1340, 752);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		
		mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		mntmNewMenuItem = new JMenuItem("Exit");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		
		mnNewMenu.add(mntmNewMenuItem);
		
		mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 240, 693);
		panel.setBackground(new Color(175, 238, 238));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JButton btnNewButton = new JButton("Deposit\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPane(deposit);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(new Color(0, 0, 0));
		
		btnCashWithdrawl = new JButton("Cash Withdrawl\r\n");
		btnCashWithdrawl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPane(withdrawl);	
			}
		});
		btnCashWithdrawl.setForeground(Color.WHITE);
		btnCashWithdrawl.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnCashWithdrawl.setBackground(Color.BLACK);
		
		btnBalanceEnquiry = new JButton("Balance Enquiry\r\n");
		btnBalanceEnquiry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPane(balance);
			}
		});
		btnBalanceEnquiry.setForeground(Color.WHITE);
		btnBalanceEnquiry.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBalanceEnquiry.setBackground(Color.BLACK);
		
		btnFastCash = new JButton("Fast Cash");
		btnFastCash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPane(fastcash);
			}
		});
		btnFastCash.setForeground(Color.WHITE);
		btnFastCash.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnFastCash.setBackground(Color.BLACK);
		
		btnPinChange = new JButton("PIN Change");
		btnPinChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				switchPane(pinchange);
				dispose();
				Forgot_PIN frame = new Forgot_PIN();
				frame.setVisible(true);
				
			}
		});
		btnPinChange.setForeground(Color.WHITE);
		btnPinChange.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPinChange.setBackground(Color.BLACK);
		
		btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(Color.WHITE);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnExit.setBackground(Color.BLACK);
		
		persnal_info = new JButton("Personal Info.\r\n");
		persnal_info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String full_name;
				
				String card_details = LogIn.get_card_no;
				Connection connectme = DBconnection.DBconnect();
				try
				{
					Statement statemen = connectme.createStatement();
					String queary = "select form_number from signup_3 where card_number = '"+card_details+"'";
					ResultSet resullt = statemen.executeQuery(queary); 
					if(resullt.next())
					{
						form_num = resullt.getInt("form_number");
					}
				}
				catch (SQLException e1) 
				{
					
					e1.printStackTrace();
				}
				try 
				{
					Statement statemen = connectme.createStatement();
					String queary ="select signup_1.form_number,signup_1.first_name,signup_1.father_name,signup_1.surname,signup_1.email,"
							+ "signup_3.card_number,signup_3.account_number,signup_2.aadhar_number,signup_2.pan_number,"
							+ "signup_1.date_of_birth,signup_1.address,signup_1.state,signup_1.city,signup_1.pincode,"
							+ "signup_1.account_opening_date from signup_1"
							+ " join signup_2 on signup_1.form_number = signup_2.form_number"
							+ " join signup_3 on signup_1.form_number = signup_3.form_number where signup_1.form_number = '"+form_num+"'";
					ResultSet resullt = statemen.executeQuery(queary); 
					if(resullt.next())
					{
						full_name = resullt.getString("first_name")+" "+resullt.getString("father_name")+" "+resullt.getString("surname");
						lblNewLabel_9.setText(resullt.getString("form_number"));
						lblNewLabel_7.setText(full_name);
						lblNewLabel_11.setText(resullt.getString("email"));
						lblNewLabel_11_1.setText(resullt.getString("card_number"));
						lblNewLabel_11_2.setText(resullt.getString("account_number"));
						lblNewLabel_11_3.setText(resullt.getString("aadhar_number"));
						lblNewLabel_11_4.setText(resullt.getString("pan_number"));
						lblNewLabel_11_5.setText(resullt.getString("date_of_birth"));
						lblNewLabel_11_6.setText(resullt.getString("address"));
						lblNewLabel_11_7.setText(resullt.getString("state"));
						lblNewLabel_11_8.setText(resullt.getString("city"));
						lblNewLabel_11_9.setText(resullt.getString("pincode"));
						lblNewLabel_11_10.setText(resullt.getString("account_opening_date"));
					}
				} 
				catch (SQLException e1) 
				{
					
					e1.printStackTrace();
				}
				switchPane(panel_4);
			}
		});
		persnal_info.setForeground(Color.WHITE);
		persnal_info.setFont(new Font("Tahoma", Font.BOLD, 20));
		persnal_info.setBackground(Color.BLACK);
		
		JButton btnMiniStatement = new JButton("Mini Statement");
		btnMiniStatement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchPane(ministate);
			}
		});
		btnMiniStatement.setForeground(Color.WHITE);
		btnMiniStatement.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMiniStatement.setBackground(Color.BLACK);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(persnal_info, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnCashWithdrawl, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnBalanceEnquiry, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(btnMiniStatement, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnPinChange, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnFastCash, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(persnal_info, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(btnCashWithdrawl, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(btnBalanceEnquiry, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
					.addComponent(btnFastCash, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(37)
					.addComponent(btnMiniStatement, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(btnPinChange, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18))
		);
		panel.setLayout(gl_panel);
		
		layeredPane = new JLayeredPane();
		layeredPane.setBounds(237, 0, 1089, 714);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		deposit = new JPanel();
		deposit.setBackground(new Color(250, 250, 210));
		layeredPane.add(deposit, "name_76697615846300");
		deposit.setLayout(null);
		
		lblNewLabel = new JLabel("Deposit\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(302, 10, 392, 61);
		deposit.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Enter PIN -");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(206, 307, 266, 61);
		deposit.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField.setBounds(536, 222, 432, 55);
		deposit.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Deposit Ammount -");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1.setBounds(70, 222, 392, 65);
		deposit.add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 35));
		passwordField.setBounds(536, 307, 432, 55);
		deposit.add(passwordField);
		
		btnNewButton_1 = new JButton("Deposit\r\n");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_2.setVisible(false);
				Pattern p1 = Pattern.compile("[0-9]+");//String regex = "[0-9]+";
				String Amm = textField.getText().toString();
				Matcher match3 = p1.matcher(Amm);
				boolean check = match3.matches();
				String check_password = passwordField.getText().toString();
				String login_password = LogIn.get_pin;
				boolean verify_password = false;
				if(check_password.equals(login_password))
				{
					verify_password = true;
				}
				
				if(check == true && verify_password == true)
				{
					int Remaining_Ammount = Integer.parseInt(Amm);
					Connection connection = DBconnection.DBconnect();
					try
					{
						int take = 0;
						Statement stm = connection.createStatement();
						String string = "select form_number from signup_3 where card_number = '"+LogIn.get_card_no+"'";
						ResultSet validOrNot = stm.executeQuery(string);
						if(validOrNot.next())
						{
							take = validOrNot.getInt("form_number");
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Error Occured");
						}
//						String queary = "insert into "+"customer_"+String.valueOf(take)+"(depoit) values(?)";
//						PreparedStatement prepare = connection.prepareStatement(queary);
//						prepare.setString(1, String.valueOf(Remaining_Ammount));	
//						prepare.executeUpdate();
						
						String string_email = "select email from signup_1 where form_number = '"+String.valueOf(take)+"'";
						ResultSet validOrNot_email = stm.executeQuery(string_email);
						if(validOrNot_email.next())
						{
							email_id = validOrNot_email.getString("email");
							
						}
						
						int balence = 0;
						String balence_queary = "select balence from "+"customer_"+String.valueOf(take)+" order by id desc limit 1";//where id = '1'";
						validOrNot = stm.executeQuery(balence_queary);
						if(validOrNot.next())
						{
							String bal = validOrNot.getString("balence");
							balence = Integer.parseInt(bal);
							final_balence = balence + Remaining_Ammount;
							
							String balence_update = "insert into "+"customer_"+String.valueOf(take)+"(depoit,balence) values(?,?)";
							PreparedStatement balence_prepare = connection.prepareStatement(balence_update);
							balence_prepare.setString(1, String.valueOf(Remaining_Ammount));
							balence_prepare.setString(2, String.valueOf(final_balence));
							
							balence_prepare.executeUpdate();
							
							
							String message = "Rs."+Remaining_Ammount+" is deposited in account\nYour Balence is Rs."+final_balence;
					        String subject = "XYZ BANK";
					        String to = email_id;
					        String from = "paperpattern1616@gmail.com";
					        
					       App.sendEmail(message,subject,to,from);
					       JOptionPane.showMessageDialog(null, "Ammount Deposited Successefully");
							textField.setText("");
							passwordField.setText("");
							textField.requestFocusInWindow();
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Error Occured");
						}
						
						
					}
					catch (SQLException e1) 
					{
						
						e1.printStackTrace();
					}
					
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter valid ammount or check your pin");
					//lblNewLabel_2.setVisible(true);
					
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1.setForeground(new Color(248, 248, 255));
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		btnNewButton_1.setBounds(536, 434, 170, 48);
		deposit.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Clear");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				passwordField.setText("");
				textField.requestFocusInWindow();
			}
		});
		btnNewButton_2.setForeground(new Color(248, 248, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setBounds(798, 427, 170, 55);
		deposit.add(btnNewButton_2);
		
		lblNewLabel_2 = new JLabel("Enter valid amount");
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(536, 276, 432, 23);
		deposit.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(24, 86, 1055, 2);
		deposit.add(separator);
		lblNewLabel_2.setVisible(false);
		
		withdrawl = new JPanel();
		withdrawl.setBackground(new Color(250, 250, 210));
		layeredPane.add(withdrawl, "name_76693740318600");
		withdrawl.setLayout(null);
		
		JLabel lblWithdraw = new JLabel("Withdraw");
		lblWithdraw.setHorizontalAlignment(SwingConstants.CENTER);
		lblWithdraw.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblWithdraw.setBounds(316, 10, 392, 61);
		withdrawl.add(lblWithdraw);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(24, 81, 1055, 2);
		withdrawl.add(separator_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		textField_1.setColumns(10);
		textField_1.setBounds(580, 223, 432, 55);
		withdrawl.add(textField_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Withdraw Ammount -");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_1_1.setBounds(114, 223, 392, 65);
		withdrawl.add(lblNewLabel_1_1_1);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		passwordField_1.setBounds(580, 308, 432, 55);
		withdrawl.add(passwordField_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Enter PIN -");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_1_2.setBounds(266, 308, 266, 61);
		withdrawl.add(lblNewLabel_1_2);
		
		JButton btnNewButton_1_1 = new JButton("Withdraw\r\n");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pattern p11 = Pattern.compile("[0-9]+");//String regex = "[0-9]+";
				String Amm = textField_1.getText().toString();
				Matcher match = p11.matcher(Amm);
				boolean check = match.matches();
				String check_password_1 = passwordField_1.getText().toString();
				String login_password_1 = LogIn.get_pin;
				boolean verify_password_1 = false;
				if(check_password_1.equals(login_password_1))
				{
					verify_password_1 = true;
				}
				if(check == true && verify_password_1 == true)
				{
					//start
					

					int Remaining_Ammount = Integer.parseInt(Amm);
					Connection connection = DBconnection.DBconnect();
					try
					{
						int take = 0;
						Statement stm = connection.createStatement();
						String string = "select form_number from signup_3 where card_number = '"+LogIn.get_card_no+"'";
						ResultSet validOrNot = stm.executeQuery(string);
						if(validOrNot.next())
						{
							take = validOrNot.getInt("form_number");
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Error Occured");
						}
//						String queary = "insert into "+"customer_"+String.valueOf(take)+"(depoit) values(?)";
//						PreparedStatement prepare = connection.prepareStatement(queary);
//						prepare.setString(1, String.valueOf(Remaining_Ammount));	
//						prepare.executeUpdate();
						int balence = 0;
						String balence_queary = "select balence from "+"customer_"+String.valueOf(take)+" order by id desc limit 1";//where id = '1'";
						validOrNot = stm.executeQuery(balence_queary);
						if(validOrNot.next())
						{
							String bal = validOrNot.getString("balence");
							balence = Integer.parseInt(bal);
							if(balence > Remaining_Ammount)
							{
								final_balence = balence - Remaining_Ammount;
							}
							else
							{
								JOptionPane.showMessageDialog(null,String.valueOf(Remaining_Ammount)+" that much balence is not available in your account :(");
							}
							
							
							String balence_update = "insert into "+"customer_"+String.valueOf(take)+"(withdraw,balence) values(?,?)";
							PreparedStatement balence_prepare = connection.prepareStatement(balence_update);
							balence_prepare.setString(1, String.valueOf(Remaining_Ammount));
							balence_prepare.setString(2, String.valueOf(final_balence));
							
							balence_prepare.executeUpdate();
							
							String message = "Rs."+Remaining_Ammount+" is debited from your account\nYour Balence is Rs."+final_balence;
					        String subject = "XYZ BANK";
					        String to = email_id;
					        String from = "paperpattern1616@gmail.com";
					        
					       App.sendEmail(message,subject,to,from);
					       JOptionPane.showMessageDialog(null, "Ammount Debited Successefully");
					       JOptionPane.showMessageDialog(null, "Ammount Debited Successefully");
							textField_1.setText("");
							passwordField_1.setText("");
							textField_1.requestFocusInWindow();
							
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Error Occured");
						}
						
					}
					catch (SQLException e1) 
					{
						
						e1.printStackTrace();
					}
				
					
					//end
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Enter valid ammount or check your pin");
					//lblNewLabel_2.setVisible(true);
				}
			}
		});
		btnNewButton_1_1.setForeground(new Color(248, 248, 255));
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setBounds(580, 435, 170, 48);
		withdrawl.add(btnNewButton_1_1);
		
		JButton btnNewButton_2_1 = new JButton("Clear");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_1.setText("");
				passwordField_1.setText("");
				textField_1.requestFocusInWindow();
			}
		});
		btnNewButton_2_1.setForeground(new Color(248, 248, 255));
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_2_1.setBackground(Color.BLACK);
		btnNewButton_2_1.setBounds(842, 428, 170, 55);
		withdrawl.add(btnNewButton_2_1);
		
		balance = new JPanel();
		balance.setBackground(new Color(250, 250, 210));
		layeredPane.add(balance, "name_76687067715100");
		balance.setLayout(null);
		
		lblBalence = new JLabel("Balence");
		lblBalence.setHorizontalAlignment(SwingConstants.CENTER);
		lblBalence.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblBalence.setBounds(302, 10, 392, 61);
		balance.add(lblBalence);
		
		separator_3 = new JSeparator();
		separator_3.setBounds(24, 86, 1055, 2);
		balance.add(separator_3);
		
		lblNewLabel_4 = new JLabel("Enter PIN -");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_4.setBounds(50, 247, 266, 61);
		balance.add(lblNewLabel_4);
		
		passwordField_2 = new JPasswordField();
		passwordField_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		passwordField_2.setBounds(365, 252, 432, 55);
		balance.add(passwordField_2);
		
		btnNewButton_3 = new JButton("Clear");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				passwordField_2.setText("");
				passwordField_2.requestFocusInWindow();
			}
		});
		btnNewButton_3.setForeground(new Color(248, 248, 255));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_3.setBackground(Color.BLACK);
		btnNewButton_3.setBounds(627, 362, 170, 55);
		balance.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Submit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String check_pin = passwordField_2.getText().toString();
				String log_pin = LogIn.get_pin;
				if(check_pin.equals(log_pin))
				{
					//start
					Connection connection = DBconnection.DBconnect();
					try
					{
						int take = 0;
						Statement stm = connection.createStatement();
						String string = "select form_number from signup_3 where card_number = '"+LogIn.get_card_no+"'";
						ResultSet validOrNot = stm.executeQuery(string);
						if(validOrNot.next())
						{
							take = validOrNot.getInt("form_number");
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Error Occured");
						}

						int balence = 0;
						String balence_queary = "select balence from "+"customer_"+String.valueOf(take)+" order by id desc limit 1";//where id = '1'";
						validOrNot = stm.executeQuery(balence_queary);
						if(validOrNot.next())
						{
							String bal = validOrNot.getString("balence");
							balence = Integer.parseInt(bal);
							lblNewLabel_26.setText(NumberFormat.getCurrencyInstance().format(balence));
							//lblNewLabel_26.setText(bal);
							lblNewLabel_26.setVisible(true);
							lblNewLabel_25.setVisible(true);
							
							
							
							
//							String message = "Rs."+Remaining_Ammount+" is deposited in account\nYour Balence is Rs."+final_balence;
//					        String subject = "XYZ BANK";
//					        String to = email_id;
//					        String from = "paperpattern1616@gmail.com";
					        
//					       App.sendEmail(message,subject,to,from);
//					       JOptionPane.showMessageDialog(null, "Ammount Deposited Successefully");
//							textField.setText("");
//							passwordField.setText("");
//							textField.requestFocusInWindow();
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Error Occured");
						}
						
						
					}
					catch (SQLException e1) 
					{
						
						e1.printStackTrace();
					}
					
				
					
					//end
					
				}
			}
		});
		btnNewButton_4.setForeground(new Color(248, 248, 255));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton_4.setBackground(Color.BLACK);
		btnNewButton_4.setBounds(365, 365, 170, 52);
		balance.add(btnNewButton_4);
		
		lblNewLabel_3 = new JLabel("To check your account balence please enter below pin.");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_3.setBounds(29, 140, 1050, 48);
		balance.add(lblNewLabel_3);
		
		lblNewLabel_25 = new JLabel("Availabel Balence -");
		lblNewLabel_25.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_25.setBounds(194, 519, 341, 61);
		balance.add(lblNewLabel_25);
		lblNewLabel_25.setVisible(false);
		
		lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblNewLabel_26.setBounds(555, 519, 382, 61);
		balance.add(lblNewLabel_26);
		lblNewLabel_26.setVisible(false);
		contentPane.setLayout(null);
		contentPane.add(panel);
		contentPane.add(layeredPane);
		
		fastcash = new JPanel();
		fastcash.setBackground(new Color(250, 250, 210));
		layeredPane.add(fastcash, "name_412839714986800");
		
		ministate = new JPanel();
		layeredPane.add(ministate, "name_414676231492900");
		
		pinchange = new JPanel();
		layeredPane.add(pinchange, "name_413220856493700");
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(250, 250, 210));
		layeredPane.add(panel_4, "name_84055359441300");
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("PERSONAL INFORMATION ");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_5.setBounds(21, 7, 396, 27);
		panel_4.add(lblNewLabel_5);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(31, 44, 1059, 12);
		panel_4.add(separator_1);
		
		JLabel lblNewLabel_6 = new JLabel("Name :");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_6.setBounds(84, 82, 123, 27);
		panel_4.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_7.setBounds(478, 82, 434, 27);
		panel_4.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Form No - ");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_8.setBounds(809, 10, 93, 27);
		panel_4.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_9.setBounds(917, 10, 147, 27);
		panel_4.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Email :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10.setBounds(78, 136, 123, 27);
		panel_4.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11.setBounds(478, 136, 434, 27);
		panel_4.add(lblNewLabel_11);
		
		lblNewLabel_10_1 = new JLabel("Card Number :");
		lblNewLabel_10_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_1.setBounds(78, 189, 214, 27);
		panel_4.add(lblNewLabel_10_1);
		
		lblNewLabel_11_1 = new JLabel("");
		lblNewLabel_11_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_1.setBounds(478, 189, 434, 27);
		panel_4.add(lblNewLabel_11_1);
		
		lblNewLabel_10_2 = new JLabel("Account Number :");
		lblNewLabel_10_2.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_2.setBounds(78, 237, 245, 27);
		panel_4.add(lblNewLabel_10_2);
		
		lblNewLabel_11_2 = new JLabel("");
		lblNewLabel_11_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_2.setBounds(478, 237, 434, 27);
		panel_4.add(lblNewLabel_11_2);
		
		lblNewLabel_10_3 = new JLabel("Aadhar Number :");
		lblNewLabel_10_3.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_3.setBounds(84, 291, 245, 27);
		panel_4.add(lblNewLabel_10_3);
		
		lblNewLabel_11_3 = new JLabel("");
		lblNewLabel_11_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_3.setBounds(478, 291, 434, 27);
		panel_4.add(lblNewLabel_11_3);
		
		lblNewLabel_10_4 = new JLabel("PAN Number :");
		lblNewLabel_10_4.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_4.setBounds(84, 345, 245, 27);
		panel_4.add(lblNewLabel_10_4);
		
		lblNewLabel_11_4 = new JLabel("");
		lblNewLabel_11_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_4.setBounds(478, 345, 434, 27);
		panel_4.add(lblNewLabel_11_4);
		
		lblNewLabel_10_5 = new JLabel("Birth Date :");
		lblNewLabel_10_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_5.setBounds(84, 394, 245, 27);
		panel_4.add(lblNewLabel_10_5);
		
		lblNewLabel_11_5 = new JLabel("");
		lblNewLabel_11_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_5.setBounds(478, 394, 434, 27);
		panel_4.add(lblNewLabel_11_5);
		
		lblNewLabel_10_6 = new JLabel("Address :");
		lblNewLabel_10_6.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_6.setBounds(84, 448, 245, 27);
		panel_4.add(lblNewLabel_10_6);
		
		lblNewLabel_11_6 = new JLabel("");
		lblNewLabel_11_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_6.setBounds(478, 448, 434, 27);
		panel_4.add(lblNewLabel_11_6);
		
		lblNewLabel_10_7 = new JLabel("State :");
		lblNewLabel_10_7.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_7.setBounds(84, 502, 245, 27);
		panel_4.add(lblNewLabel_10_7);
		
		lblNewLabel_11_7 = new JLabel("");
		lblNewLabel_11_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_7.setBounds(478, 502, 434, 27);
		panel_4.add(lblNewLabel_11_7);
		
		lblNewLabel_10_8 = new JLabel("City :");
		lblNewLabel_10_8.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_8.setBounds(84, 552, 245, 27);
		panel_4.add(lblNewLabel_10_8);
		
		lblNewLabel_11_8 = new JLabel("");
		lblNewLabel_11_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_8.setBounds(478, 552, 434, 27);
		panel_4.add(lblNewLabel_11_8);
		
		lblNewLabel_10_9 = new JLabel("Pincode :");
		lblNewLabel_10_9.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_9.setBounds(78, 609, 245, 27);
		panel_4.add(lblNewLabel_10_9);
		
		lblNewLabel_11_9 = new JLabel("");
		lblNewLabel_11_9.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_9.setBounds(478, 609, 434, 27);
		panel_4.add(lblNewLabel_11_9);
		
		lblNewLabel_10_10 = new JLabel("Account Opening Date :");
		lblNewLabel_10_10.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_10_10.setBounds(78, 657, 325, 27);
		panel_4.add(lblNewLabel_10_10);
		
		lblNewLabel_11_10 = new JLabel("");
		lblNewLabel_11_10.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_11_10.setBounds(478, 657, 434, 27);
		panel_4.add(lblNewLabel_11_10);
		
		lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_12.setBounds(299, 44, 24, 27);
		panel_4.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("-");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_13.setBounds(435, 82, 33, 27);
		panel_4.add(lblNewLabel_13);
		
		lblNewLabel_14 = new JLabel("-");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_14.setBounds(435, 136, 33, 27);
		panel_4.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("-");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_15.setBounds(435, 189, 33, 27);
		panel_4.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("-");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_16.setBounds(435, 237, 33, 27);
		panel_4.add(lblNewLabel_16);
		
		lblNewLabel_17 = new JLabel("-");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_17.setBounds(435, 292, 33, 27);
		panel_4.add(lblNewLabel_17);
		
		lblNewLabel_18 = new JLabel("-");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_18.setBounds(435, 345, 33, 27);
		panel_4.add(lblNewLabel_18);
		
		lblNewLabel_19 = new JLabel("-");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_19.setBounds(435, 394, 33, 27);
		panel_4.add(lblNewLabel_19);
		
		lblNewLabel_20 = new JLabel("-");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_20.setBounds(435, 448, 33, 27);
		panel_4.add(lblNewLabel_20);
		
		lblNewLabel_21 = new JLabel("-");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_21.setBounds(435, 502, 33, 27);
		panel_4.add(lblNewLabel_21);
		
		lblNewLabel_22 = new JLabel("-");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_22.setBounds(435, 552, 33, 27);
		panel_4.add(lblNewLabel_22);
		
		lblNewLabel_23 = new JLabel("-");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_23.setBounds(435, 609, 33, 27);
		panel_4.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("-");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_24.setBounds(435, 657, 33, 27);
		panel_4.add(lblNewLabel_24);
	}
}
