package Bank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Random;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.awt.Toolkit;

public class SignUp_3 extends JFrame {

	private JPanel contentPane;
	JRadioButton Saving;
	JRadioButton Recuring;
	JRadioButton Currunt;
	JRadioButton Fixed;
	JLabel lblNewLabel_3;
	JCheckBox compulsory;
	JLabel lblNewLabel_4;
	static String Ac_no;
	static String card_no;
	static String pin_no;
	
static String create_account_no()
{
		Random random = new Random();
		int ff = random.nextInt(999999999);
		int qq = random.nextInt(999);
		String s1 = String.valueOf(ff);
		String s2 = String.valueOf(qq);
		String result = s1+s2;
		int count =0;
		if(result.length() == 12){
			//System.out.println(result);
			return result;
		}
		else{
			String result1 = null;
			while(count<100) {
				int w = random.nextInt(999999999);
				int t = random.nextInt(999);
				String p = String.valueOf(w);
				String o = String.valueOf(t);
				result1 = p+o;
				if(result1.length() == 12)
				{
					
					//System.out.println(result1);
					break;
				}
				count++;	
			}
			return result1;
		}
}

static String create_card_no()
{

	Random random = new Random();
	int ff = random.nextInt(999999999);
	int qq = random.nextInt(9999999);
	String s1 = String.valueOf(ff);
	String s2 = String.valueOf(qq);
	String result = s1+s2;
	int count =0;
	if(result.length() == 16){
		return result;
	}
	else{
		String result1 = null;
		while(count<100) {
			int w = random.nextInt(999999999);
			int t = random.nextInt(9999999);
			String p = String.valueOf(w);
			String o = String.valueOf(t);
			result1 = p+o;
			if(result1.length() == 16)
			{
				//System.out.println(result1);
				break;
			}
			count++;	
		}
		
		return result1;
	}	

}

static String create_pin_no()
{

	Random random = new Random();
	int ff = random.nextInt(9999);
	
	String s1 = String.valueOf(ff);
	
	int count =0;
	if(s1.length() == 4){
		//System.out.println(s1);
		return s1;
	}
	else{
		String result1 = null;
		while(count<200) {
			int w = random.nextInt(9999);
			
			result1 = String.valueOf(w);
			
			
			if(result1.length() == 4)
			{
				//System.out.println(result1);
				break;
			}
			count++;	
		}
		return result1;
	}	

	
}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp_3 frame = new SignUp_3();
					ImageIcon icon = new ImageIcon("C:\\Users\\udaya\\eclipse-workspace\\XYZ Bank\\Images\\bank_icon_129525.png");
					frame.setIconImage(icon.getImage());
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public SignUp_3() {
		
		super("XYZ Bank - Page 3");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp_3.class.getResource("/Images/bank_icon_129525.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 696);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(245, 255, 250));
		contentPane_1.setBounds(0, 0, 629, 668);
		contentPane.add(contentPane_1);
		contentPane_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Appliication Form No. - ");
		lblNewLabel.setBounds(73, 0, 367, 53);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane_1.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 88, 592, 8);
		contentPane_1.add(separator);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Facilities :");
		lblNewLabel_2_1_5.setBounds(25, 429, 207, 27);
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane_1.add(lblNewLabel_2_1_5);
		
		JButton btnNewButton = new JButton("Cancel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(339, 609, 113, 36);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(Color.BLACK);
		contentPane_1.add(btnNewButton);
		
		String api_no = SignUp_1.take;
		
		JLabel label_1_1 = new JLabel(api_no);
		label_1_1.setBounds(439, 0, 178, 53);
		label_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		contentPane_1.add(label_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Page 3: Account Details\r\n");
		lblNewLabel_1.setBounds(157, 46, 348, 43);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contentPane_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Card Number :");
		lblNewLabel_2_1_1.setBounds(25, 283, 207, 27);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("Account Type :");
		lblNewLabel_2_1_5_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_5_1.setBounds(25, 96, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_5_1);
		
		Saving = new JRadioButton("  Saving Account\r\n\r\n");
		Saving.setSelected(true);
		Saving.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3.setVisible(false);
				if(Saving.isSelected() == true)
				{
					Recuring.setSelected(false);
					Currunt.setSelected(false);
					Fixed.setSelected(false);
				}
				
			}
		});
		Saving.setFont(new Font("Tahoma", Font.BOLD, 20));
		Saving.setBackground(new Color(245, 255, 250));
		Saving.setBounds(25, 129, 228, 36);
		contentPane_1.add(Saving);
		
		Recuring = new JRadioButton("  Recuring Deposit Account");
		Recuring.setEnabled(false);
		Recuring.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3.setVisible(false);
				
				if(Recuring.isSelected() == true)
				{
					Saving.setSelected(false);
					Currunt.setSelected(false);
					Fixed.setSelected(false);
				}
			}
		});
		Recuring.setFont(new Font("Tahoma", Font.BOLD, 20));
		Recuring.setBackground(new Color(245, 255, 250));
		Recuring.setBounds(293, 129, 324, 36);
		contentPane_1.add(Recuring);
		
		Currunt = new JRadioButton("  Currunt Account\r\n\r\n");
		Currunt.setEnabled(false);
		Currunt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3.setVisible(false);
				
				if(Currunt.isSelected() == true)
				{
					Saving.setSelected(false);
					Recuring.setSelected(false);
					Fixed.setSelected(false);
				}
				
				
			}
		});
		Currunt.setFont(new Font("Tahoma", Font.BOLD, 20));
		Currunt.setBackground(new Color(245, 255, 250));
		Currunt.setBounds(25, 167, 221, 21);
		contentPane_1.add(Currunt);
		
		Fixed = new JRadioButton("  Fixed Deposit Account\r\n");
		Fixed.setEnabled(false);
		Fixed.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3.setVisible(false);
				
				if(Fixed.isSelected() == true)
				{
					Saving.setSelected(false);
					Recuring.setSelected(false);
					Currunt.setSelected(false);
				}
				
			}
		});
		Fixed.setFont(new Font("Tahoma", Font.BOLD, 20));
		Fixed.setBackground(new Color(245, 255, 250));
		Fixed.setBounds(293, 167, 306, 21);
		contentPane_1.add(Fixed);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("XXXX-XXXX-XXXX-3421");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_1_1.setBounds(293, 283, 269, 27);
		contentPane_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("(Your 16-digit Card Number)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(25, 320, 214, 21);
		contentPane_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("PIN :");
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_1_2.setBounds(25, 351, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("XXXX");
		lblNewLabel_2_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_1_3.setBounds(293, 351, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("(Your 4-digit passcode)");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(25, 388, 214, 21);
		contentPane_1.add(lblNewLabel_2_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(25, 225, 592, 8);
		contentPane_1.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(25, 425, 592, 8);
		contentPane_1.add(separator_2);
		
		JCheckBox atm = new JCheckBox("  ATM Card");
		atm.setFont(new Font("Tahoma", Font.BOLD, 20));
		atm.setBackground(new Color(245, 255, 250));
		atm.setBounds(25, 480, 165, 21);
		contentPane_1.add(atm);
		
		JCheckBox netbank = new JCheckBox("  Internet Banking");
		netbank.setEnabled(false);
		netbank.setFont(new Font("Tahoma", Font.BOLD, 20));
		netbank.setBackground(new Color(245, 255, 250));
		netbank.setBounds(192, 480, 223, 21);
		contentPane_1.add(netbank);
		
		JCheckBox mobbank = new JCheckBox("  Mobile Banking");
		mobbank.setEnabled(false);
		mobbank.setFont(new Font("Tahoma", Font.BOLD, 20));
		mobbank.setBackground(new Color(245, 255, 250));
		mobbank.setBounds(417, 480, 200, 21);
		contentPane_1.add(mobbank);
		
		JCheckBox mailbank = new JCheckBox("  Email Alerts");
		mailbank.setEnabled(false);
		mailbank.setSelected(true);
		mailbank.setFont(new Font("Tahoma", Font.BOLD, 20));
		mailbank.setBackground(new Color(245, 255, 250));
		mailbank.setBounds(25, 514, 165, 21);
		contentPane_1.add(mailbank);
		
		JCheckBox cb = new JCheckBox("  Cheque Book");
		cb.setEnabled(false);
		cb.setFont(new Font("Tahoma", Font.BOLD, 20));
		cb.setBackground(new Color(245, 255, 250));
		cb.setBounds(192, 518, 223, 21);
		contentPane_1.add(cb);
		
		JCheckBox es = new JCheckBox("  E-Statement");
		es.setEnabled(false);
		es.setSelected(true);
		es.setFont(new Font("Tahoma", Font.BOLD, 20));
		es.setBackground(new Color(245, 255, 250));
		es.setBounds(417, 518, 200, 21);
		contentPane_1.add(es);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Ac_no = SignUp_3.create_account_no();
			
				card_no = SignUp_3.create_card_no();
				pin_no = SignUp_3.create_pin_no();
				
				
				String save = null;
				if(Saving.isSelected() == true)
				{
					save = "Saving";
				}
				
				String ATm = null;
				if(atm.isSelected() == true)
				{
					ATm = "Yes";
				}
				else
				{
					ATm = "No";
				}
				
				String netb = null;
				if(netbank.isSelected() == true)
				{
					netb = "Yes";
				}
				else
				{
					netb = "No";
				}
				
				String mb = null;
				if(mobbank.isSelected() == true)
				{
					mb = "Yes";
				}
				else
				{
					mb = "No";
				}
				
				String mailb = null;
				if(mailbank.isSelected() == true)
				{
					mailb = "Yes";
				}
				else
				{
					mailb = "No";
				}
				
				String checkk = null;
				if(cb.isSelected() == true)
				{
					checkk = "Yes";
				}
				else
				{
					checkk = "No";
				}
				
				
				String estate = null;
				if(es.isSelected() == true)
				{
					estate = "Yes";
				}
				else
				{
					estate = "No";
				}
				//es
				
				
				
				int Form = SignUp_1.app_no;
				String Account_type = save;
				String Account_number = Ac_no;
				String Card_number = card_no;
				String Pin_number = pin_no;
				String Atm_card = ATm;
				String Net_bank = netb;
				String Mob_bank = mb;
				String Email_bank = mailb;
				String Check_book = checkk;
				String E_statement = estate;
				
				
				
				Connection connect = DBconnection.DBconnect();
				PreparedStatement prepare,prepare1;
				Statement statement;
				boolean check_details = true;
				int count =0;
				while(count<100)
				{
					try 
					{
						statement = connect.createStatement();
						String find_db = "select * from signup_3 where 	account_number = '"+Account_number+"' and card_number = '"+Card_number+"'";
						ResultSet rset = statement.executeQuery(find_db);
						
						if(rset.next() == true)
						{
							check_details = false;
							Account_number = SignUp_3.create_account_no();
							Card_number = SignUp_3.create_card_no();
						}
						else
						{
							check_details = true;
							break;
						}
					} 
					catch (SQLException e2) 
					{
						
						e2.printStackTrace();
					}
					
					count++;
				}
				
				 
				//String acccc = dtf.format(current);
				
				
				
				
				
				
				if(Saving.isSelected() == true || Recuring.isSelected() == true || Currunt.isSelected() == true || Fixed.isSelected() == true)
				{
					if(compulsory.isSelected() == true)
					{
						
						if(check_details == true)
						{
							
							
							try
							{
								prepare = connect.prepareStatement("insert into signup_3(form_number,account_type,account_number,card_number,pin_number,atm_card,net_bank,mob_bank,email_bank,check_book,e_statement) values(?,?,?,?,?,?,?,?,?,?,?)");
								
								prepare.setInt(1, Form);
								prepare.setString(2, Account_type);
								prepare.setString(3, Account_number);
								prepare.setString(4, Card_number);
								prepare.setString(5, Pin_number);
								prepare.setString(6, Atm_card);
								prepare.setString(7, Net_bank);
								prepare.setString(8, Mob_bank);
								prepare.setString(9, Email_bank);
								prepare.setString(10, Check_book);
								prepare.setString(11, E_statement);
								
								prepare.executeUpdate();
								String table_name = String.valueOf(Form);
								Statement stm = connect.createStatement();
								String sql = "CREATE TABLE " +"customer_"+table_name+           //'"'+"customer_"+table_name+'"'+
						                   "(id int not NULL AUTO_INCREMENT, " +
						                   " depoit VARCHAR(255), " + 
						                   " withdraw VARCHAR(255), " + 
						                   " balence VARCHAR(255), " +
						                   " PRIMARY KEY ( id ))"; 
								 
								stm.executeUpdate(sql);
								String set_balence = "1";
								String queary = "insert into "+"customer_"+table_name+"(balence) values(?)";
								PreparedStatement prep = connect.prepareStatement(queary);
								prep.setString(1, set_balence);
								
								prep.executeUpdate();
								
								JOptionPane.showMessageDialog(null, "Your Account Is Created Successfully.\nAll The Details Regarding\nCard Number, PIN And Account Number\nAre Sent To This Email - "+SignUp_1.textField_4.getText().toString()+"\nThnak You.");
								
								String message = "Hey "+SignUp_1.full_name+", thank you for opennig your bank account in XYZ BANK.\nYour account details are provided below: \n1. Account Number =  "+Account_number+"\n2.Card Number =  "+Card_number+"\n3. PIN =  "+Pin_number+"\nThank You.  ";		//"uday you did it bro keep going ";
						        
						        String subject = "XYZ BANK";
						        String to = SignUp_1.send_email;
						        String from = "paperpattern1616@gmail.com";
						        
						       App.sendEmail(message,subject,to,from);

							}
							 catch (SQLException e1)
							{
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
							
							
							dispose();
							LogIn frame = new LogIn();
							frame.setVisible(true);
							
							
						}
						else
						{
							JOptionPane.showMessageDialog(null, "Sorry for inconveniance\nPlease try again");

						}
						
					}
					else
					{
						lblNewLabel_4.setVisible(true);
					}
				}
				else
				{
					lblNewLabel_3.setVisible(true);
				}
				
			}
		});
		btnSubmit.setForeground(Color.WHITE);
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSubmit.setBackground(Color.BLACK);
		btnSubmit.setBounds(192, 609, 113, 36);
		contentPane_1.add(btnSubmit);
		
		compulsory = new JCheckBox("  I hearby declares that the above entered details correct to the best of my knowledge\r\n");
		compulsory.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_4.setVisible(false);
			}
		});
		compulsory.setSelected(true);
		compulsory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		compulsory.setBackground(new Color(245, 255, 250));
		compulsory.setBounds(25, 563, 592, 21);
		contentPane_1.add(compulsory);
		
		lblNewLabel_3 = new JLabel("Select Account that you want to open ");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(25, 194, 306, 21);
		contentPane_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Select the above  chech box to submit.");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(25, 590, 304, 21);
		contentPane_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_1_1_4 = new JLabel("Account Number :");
		lblNewLabel_2_1_1_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_1_4.setBounds(25, 243, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_1_4);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("XXXX-XXXX-XXXX");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_1_1_1.setBounds(293, 243, 269, 27);
		contentPane_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_5 = new JLabel("Currunt, Recuring and Fixed Account will be available soon.");
		lblNewLabel_5.setForeground(Color.BLUE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(192, 95, 437, 28);
		contentPane_1.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("Internet Banking, Mobile Banking and Cheque Book Option will be available soon");
		lblNewLabel_5_1.setForeground(Color.BLUE);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_1.setBounds(25, 455, 592, 19);
		contentPane_1.add(lblNewLabel_5_1);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_3.setVisible(false);
	}
	
	
}
