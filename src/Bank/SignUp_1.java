package Bank;
import java.awt.EventQueue;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.toedter.calendar.JMonthChooser;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;

public class SignUp_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static String take;
	String getno ;
	private JTextField textField_1;
	public static JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_2;
	static JLabel lblNewLabel_4;
	JComboBox comboBox_1;
	JLabel lblNewLabel_6;
	JLabel lblNewLabel_7;
	JLabel lblNewLabel_8;
	JLabel lblNewLabel_9;
	JLabel lblNewLabel_10;
	JComboBox comboBox_2_1;
	JLabel lblNewLabel_11;
	JLabel lblNewLabel_5;
	JComboBox comboBox_3;
	public static int app_no;
	JComboBox comboBox_2;
	JLabel label_1_1;
	Connection conn,con;
	PreparedStatement prepare;
	public static String send_email;
	private JTextField textField_3;
	static String full_name;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	static int create_form_no()
	{
		Random random = new Random();
		
		int num = random.nextInt(99999);
		return num;
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp_1 frame = new SignUp_1();
					frame.setVisible(true);
					ImageIcon icon = new ImageIcon("C:\\Users\\udaya\\eclipse-workspace\\XYZ Bank\\Images\\bank_icon_129525.png");
					frame.setIconImage(icon.getImage());
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SignUp_1() {
		
		super("XYZ Bank");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp_1.class.getResource("/Images/bank_icon_129525.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 787);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Appliication Form No. - ");
		lblNewLabel.setBounds(75, 10, 367, 53);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(lblNewLabel);
		
		label_1_1 = new JLabel("");
		label_1_1.setBounds(444, 10, 178, 53);
		label_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		
		app_no = SignUp_1.create_form_no();
		take = String.valueOf(app_no).toString();
		label_1_1.setText(take);
		getno =label_1_1.getText() ;
		contentPane.add(label_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Page 1: Personal Details\r\n");
		lblNewLabel_1.setBounds(171, 65, 318, 43);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name :");
		lblNewLabel_2.setBounds(35, 140, 140, 27);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 122, 592, 8);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("Father's Name :");
		lblNewLabel_2_1.setBounds(35, 193, 207, 27);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Date Of Birth :");
		lblNewLabel_2_1_1.setBounds(35, 285, 207, 27);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Gender :");
		lblNewLabel_2_1_2.setBounds(39, 322, 207, 27);
		lblNewLabel_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Email Address :");
		lblNewLabel_2_1_3.setBounds(39, 369, 207, 27);
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Marital Status :");
		lblNewLabel_2_1_4.setBounds(39, 420, 207, 27);
		lblNewLabel_2_1_4.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Address :");
		lblNewLabel_2_1_5.setBounds(39, 473, 207, 27);
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("City :");
		lblNewLabel_2_1_6.setBounds(39, 578, 207, 27);
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("Pin Code :");
		lblNewLabel_2_1_7.setBounds(39, 636, 207, 27);
		lblNewLabel_2_1_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_7);
		
		JLabel lblNewLabel_2_1_8 = new JLabel("State :");
		lblNewLabel_2_1_8.setBounds(39, 526, 207, 27);
		lblNewLabel_2_1_8.setFont(new Font("Tahoma", Font.BOLD, 22));
		contentPane.add(lblNewLabel_2_1_8);
		
		textField = new JTextField();
		JLabel lblNewLabel_3 = new JLabel("Enter valid first name which contains A to Z and a to z letters\r\n");
		lblNewLabel_3.setForeground(new Color(255, 0, 0));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(270, 168, 352, 15);
		lblNewLabel_3.setVisible(false);
		contentPane.add(lblNewLabel_3);
		
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				lblNewLabel_3.setVisible(false);
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(270, 140, 347, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton female = new JRadioButton(" Female\r\n");
		buttonGroup.add(female);
		female.setBounds(411, 326, 139, 21);
		
		female.setFont(new Font("Tahoma", Font.BOLD, 20));
		female.setBackground(new Color(245, 255, 250));
		contentPane.add(female);
		
		JRadioButton male = new JRadioButton(" Male\r\n");
		buttonGroup.add(male);
		male.setBounds(270, 326, 103, 21);
		male.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//rdbtnFemale.setSelected(false);
				lblNewLabel_6.setVisible(false);
				male.setSelected(true);
				female.setSelected(false);
				if(female.isSelected()== true)
				{
					female.setSelected(false);
				}
				
				
			}
		});
		male.setFont(new Font("Tahoma", Font.BOLD, 20));
		male.setBackground(new Color(245, 255, 250));
		contentPane.add(male);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(270, 290, 69, 27);
		contentPane.add(comboBox);
		
		JRadioButton unmarried = new JRadioButton("Unmarried");
		buttonGroup_1.add(unmarried);
		
		unmarried.setFont(new Font("Tahoma", Font.BOLD, 20));
		unmarried.setBackground(new Color(245, 255, 250));
		unmarried.setBounds(393, 424, 157, 21);
		contentPane.add(unmarried);
		
		JRadioButton married = new JRadioButton("Married");
		buttonGroup_1.add(married);
		married.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_8.setVisible(false);
				unmarried.setSelected(false);
				married.setSelected(true);
				unmarried.setSelected(false);
			}
		});
		married.setFont(new Font("Tahoma", Font.BOLD, 20));
		married.setBackground(new Color(245, 255, 250));
		married.setBounds(270, 424, 121, 21);
		contentPane.add(married);
		
		JButton btnNewButton = new JButton("Next");
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			Pattern p = Pattern.compile("^[A-Za-z]\\w[a-z]{1,29}$");
			String  name = textField.getText().toString();
			Matcher match = p.matcher(name);
			boolean check = match.matches();
			String  father = textField_1.getText().toString();
			Matcher match1 = p.matcher(father);
			boolean check1 = match1.matches();
			String  surname = textField_3.getText().toString();
			Matcher match2 = p.matcher(surname);
			boolean check2 = match2.matches();
			
			Pattern p1 = Pattern.compile("^[A-Za-z]\\w{2,29}@gmail\\.com$");
			String  email = textField_4.getText().toString();
			Matcher match3 = p1.matcher(email);
			boolean check3 = match3.matches();
			
			con = DBconnection.DBconnect();
			boolean check_email = true;
			try 
			{
				Statement sm = con.createStatement();
				String sql = "Select * from signup_1 where 	email = '"+email+"'";
				ResultSet rs = sm.executeQuery(sql);
				if(rs.next() == true && check3 == true)
				{
					check_email = false;
					JOptionPane.showMessageDialog(null	, email+" is already exist in our system.");
					textField_4.setText("");
					textField_4.requestFocusInWindow();
				}
				
			} 
			catch (SQLException e1) 
			{
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
//			Pattern p2 = Pattern.compile("^[A-Za-z]\\w[a-z]{1,29}$");
			String  city = textField_6.getText().toString();
			Matcher match4 = p.matcher(city);
			boolean check4 = match4.matches();
			
			Pattern p3 = Pattern.compile("^[0-9].....$");
			String  pincode = textField_2.getText().toString();
			Matcher match5 = p3.matcher(pincode);
			boolean check5 = match5.matches();
			
				if(textField.getText().isEmpty() == false && check == true)
				{
					
					if(textField_1.getText().isEmpty() == false &&  check1 == true)
					{
						
						if(textField_3.getText().isEmpty() == false && check2 == true)
						{
							if(male.isSelected()==true || female.isSelected()==true)
							{
								if(textField_4.getText().isEmpty() == false && check_email == true && check3 == true)
								{
									if(married.isSelected()==true || unmarried.isSelected()==true)
									{
										if(textField_5.getText().isEmpty() == false )
										{
											if(textField_6.getText().isEmpty() == false && check4 == true)
											{
												if(textField_2.getText().isEmpty() == false && check5 == true)
												{
													String Date = comboBox.getSelectedItem().toString();
													String month = comboBox_3.getSelectedItem().toString();
													String year = comboBox_1.getSelectedItem().toString();
													String g;
													if(male.isSelected() == true)
													{
														g = "Male";
													}
													else
													{
														g = "Female";
													}
													String m;
													if(married.isSelected() == true)
													{
														m = "Married";
													}
													else
													{
														m = "Unmarried";
													}
													
													String First = textField.getText().toString();
													int Form_no = app_no;
													String Father = textField_1.getText().toString();
													String Surname = textField_3.getText().toString();
													full_name = First+" "+Father+" "+Surname;
													String Date_of_birth = Date+"/"+month+"/"+year;
													String Gender = g;
													String Email = textField_4.getText().toString();
													send_email = Email;
													String Marrige = m;
													String Address = textField_5.getText().toString();
													String State = comboBox_2.getSelectedItem().toString();
													String City = textField_6.getText().toString();
													String Pincode = textField_2.getText().toString();
													
													 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
													  LocalDateTime current = LocalDateTime.now();  
													 //  System.out.println(dtf.format(current)); 
													  String date_acc = dtf.format(current);
													//System.out.println(Form_no);
													conn = DBconnection.DBconnect();
													try
													{
														prepare = conn.prepareStatement("insert into signup_1(form_number,first_name,father_name,surname,date_of_birth,gender,email,marital_status,address,state,city,pincode,account_opening_date) values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
														
														prepare.setInt(1, Form_no);
														
														prepare.setString(2, First);
														prepare.setString(3, Father);
														prepare.setString(4, Surname);
														prepare.setString(5, Date_of_birth);
														prepare.setString(6, Gender);
														prepare.setString(7, Email);
														prepare.setString(8, Marrige);
														prepare.setString(9, Address);
														prepare.setString(10, State);
														prepare.setString(11, City);
														prepare.setString(12, Pincode);
														prepare.setString(13, date_acc.toString());
														prepare.executeUpdate();
														
														dispose();
														SignUp_2 frame = new SignUp_2();
														frame.setVisible(true);
														
													}
													 catch (SQLException e1)
													{
														// TODO Auto-generated catch block
														e1.printStackTrace();
													}
													
													
													
													
													
												}
												else
												{
													lblNewLabel_11.setVisible(true);
												}
												
											}
											else 
											{
												lblNewLabel_10.setVisible(true);
											}
											
										}
										else
										{
											lblNewLabel_9.setVisible(true);
										}
										
									}
									else
									{
										lblNewLabel_8.setVisible(true);
									}
									
								}
								else
								{
									lblNewLabel_7.setVisible(true);
								}
								
							}
							else
							{
								lblNewLabel_6.setVisible(true);
							}
							
						}
						else
						{
							lblNewLabel_5.setVisible(true);
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
					//lblNewLabel_4.setVisible(true);
					//textField.requestFocusInWindow();
				}
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(526, 704, 96, 36);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_4.setVisible(false);
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(270, 193, 347, 27);
		contentPane.add(textField_1);
		
		textField_4 = new JTextField();
		textField_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_7.setVisible(false);
			}
		});
		textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_4.setColumns(10);
		textField_4.setBounds(270, 372, 347, 27);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_9.setVisible(false);
			}
		});
		textField_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_5.setColumns(10);
		textField_5.setBounds(270, 476, 347, 27);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_10.setVisible(false);
			}
		});
		textField_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(270, 578, 347, 27);
		contentPane.add(textField_6);
		
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_11.setVisible(false);
			}
		});
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(270, 636, 347, 27);
		contentPane.add(textField_2);
		
		lblNewLabel_4 = new JLabel("Enter valid father's name which contains A to Z and a to z letters");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setBounds(270, 219, 367, 15);
		contentPane.add(lblNewLabel_4);
		lblNewLabel_4.setVisible(false);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"}));
		comboBox_1.setBounds(524, 290, 98, 27);
		contentPane.add(comboBox_1);
		
		lblNewLabel_6 = new JLabel("Select gender");
		lblNewLabel_6.setForeground(Color.RED);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(270, 347, 280, 15);
		contentPane.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Enter valid Email id");
		lblNewLabel_7.setForeground(Color.RED);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(270, 397, 270, 21);
		contentPane.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("Select one of the above option");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(270, 451, 270, 15);
		contentPane.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Enter valid address");
		lblNewLabel_9.setForeground(Color.RED);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(270, 502, 272, 15);
		contentPane.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("Enter city");
		lblNewLabel_10.setForeground(Color.RED);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(270, 605, 270, 21);
		contentPane.add(lblNewLabel_10);
		
		comboBox_2 = new JComboBox();
		
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Andhra Pradesh", "Arunachal Pradesh", "Asom (Assam)", "Bihar", "Karnataka", "Kerala", "Chhattisgarh", "Uttar Pradesh", "Goa", "Gujarat", "Haryana", "Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "West Bengal", "Madhya Pradesh", "Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim", "Tamil Nadu", "Telangana", "Tripura", "Uttarakhand"}));
		comboBox_2.setBounds(270, 527, 347, 27);
		contentPane.add(comboBox_2);
		
		lblNewLabel_11 = new JLabel("Enter Pin code\r\n");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setForeground(Color.RED);
		lblNewLabel_11.setBounds(270, 673, 270, 21);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_2_2 = new JLabel("Surname :");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_2.setBounds(35, 248, 140, 27);
		contentPane.add(lblNewLabel_2_2);
		
		textField_3 = new JTextField();
		textField_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_5.setVisible(false);
			}
		});
		textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(270, 243, 347, 27);
		contentPane.add(textField_3);
		
		lblNewLabel_5 = new JLabel("Enter valid surname which contains A to Z and a to z letters");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(270, 271, 347, 13);
		contentPane.add(lblNewLabel_5);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"}));
		comboBox_3.setBounds(360, 290, 141, 27);
		contentPane.add(comboBox_3);
		lblNewLabel_11.setVisible(false);
		lblNewLabel_5.setVisible(false);
		
		
		
		//comboBox_2.setVisible(false);
		lblNewLabel_10.setVisible(false);
		lblNewLabel_9.setVisible(false);
		lblNewLabel_8.setVisible(false);
		lblNewLabel_7.setVisible(false);
		lblNewLabel_6.setVisible(false);
		
		
		
		
		unmarried.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_8.setVisible(false);
				married.setSelected(false);
				unmarried.setSelected(true);
				married.setSelected(false);
			}
		});
		
		female.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_6.setVisible(false);
				male.setSelected(false);
				female.setSelected(true);
				male.setSelected(false);

			}
		});

	}
}
