package Bank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;

public class SignUp_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	JLabel lblNewLabel_3;
	JLabel lblNewLabel_4;
	JLabel lblNewLabel_5;
	JRadioButton rdbtnYes;
	JRadioButton rdbtnNo;
	JLabel lblNewLabel_5_1;
	JRadioButton rdbtnYes_1;
	JRadioButton rdbtnNo_1;
	JComboBox comboBox_1;
	JComboBox comboBox_1_1;
	JComboBox comboBox_1_1_1;
	JComboBox comboBox_1_2_1;
	Connection con;
	PreparedStatement prepare;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp_2 frame = new SignUp_2();
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

	/**
	 * Create the frame.
	 */
	public SignUp_2() {
		super("XYZ Bank - Page 2");
		setIconImage(Toolkit.getDefaultToolkit().getImage(SignUp_2.class.getResource("/Images/bank_icon_129525.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 641, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(245, 255, 250));
		contentPane_1.setBounds(0, 0, 629, 668);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("Appliication Form No. - ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(75, 10, 367, 53);
		contentPane_1.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(25, 122, 592, 8);
		contentPane_1.add(separator);
		
		JLabel lblNewLabel_2_1 = new JLabel("Category :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1.setBounds(39, 223, 207, 27);
		contentPane_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("PAN Number :");
		lblNewLabel_2_1_3.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_3.setBounds(39, 399, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Aadhar Number :");
		lblNewLabel_2_1_5.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_5.setBounds(39, 456, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("Senior Citizen :");
		lblNewLabel_2_1_6.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_6.setBounds(39, 506, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("Existing Account :");
		lblNewLabel_2_1_7.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_7.setBounds(39, 553, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_7);
		
		JButton btnNewButton = new JButton("Next");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pattern p1 = Pattern.compile("^[A-Z]\\w[A-Z]{3}\\w[0-9]{3}\\w[A-Z]{0}$");
				String  pan = textField_1.getText().toString();
				Matcher match1 = p1.matcher(pan);
				boolean check1 = match1.matches();
				
				Pattern p2 = Pattern.compile("^[0-9]...........$");
				String  aadhar = textField.getText().toString();
				Matcher match2 = p2.matcher(aadhar);
				boolean check2 = match2.matches();
				
				if(textField_1.getText().toString().isEmpty() == false && check1 == true)
				{
					if(textField.getText().toString().isEmpty() == false && check2 == true)
					{
						if(rdbtnYes.isSelected() == true || rdbtnNo.isSelected() == true)
						{
							if(rdbtnYes_1.isSelected() == true || rdbtnNo_1.isSelected() == true)
							{
								String sc;
								if(rdbtnYes.isSelected() == true)
								{
									sc = " Yes ";
								}
								else
								{
									sc = " No ";
								}
								
								String Ex;
								if(rdbtnYes_1.isSelected() == true)
								{
									Ex = " Yes ";
								}
								else
								{
									Ex = " No ";
								}
								
								
								int Form = SignUp_1.app_no;
								String Cast = comboBox_1.getSelectedItem().toString();
								String Category = comboBox_1_1.getSelectedItem().toString();
								String Income = comboBox_1_1_1.getSelectedItem().toString(); 
								String Occupation = comboBox_1_2_1.getSelectedItem().toString(); 
								String PAN = textField_1.getText().toString();
								String Aadhar = textField.getText().toString();
								String Senior_citizen = sc;
								String Exiting_account = Ex;
								
								con = DBconnection.DBconnect();
								
								try
								{
									prepare = con.prepareStatement("insert into signup_2(form_number,religion,category,	income,occupation,pan_number,aadhar_number,senior_citizen,exiting_account) values(?,?,?,?,?,?,?,?,?)");
									
									prepare.setInt(1, Form);
									prepare.setString(2, Cast);
									prepare.setString(3, Category);
									prepare.setString(4, Income);
									prepare.setString(5, Occupation);
									prepare.setString(6, PAN);
									prepare.setString(7, Aadhar);
									prepare.setString(8, Senior_citizen);
									prepare.setString(9, Exiting_account);
									
									prepare.executeUpdate();
									
									dispose();
									SignUp_3 frame = new SignUp_3();
									frame.setVisible(true);
								}
								 catch (SQLException e1)
								{
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
							}
							else if(rdbtnYes_1.isSelected() == false || rdbtnNo_1.isSelected() == false)
							{
								lblNewLabel_5_1.setVisible(true);
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
				}
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(454, 616, 96, 36);
		contentPane_1.add(btnNewButton);
		
		String api_no = SignUp_1.take;
		
		
		JLabel label_1_1 = new JLabel(api_no);
		label_1_1.setFont(new Font("Tahoma", Font.BOLD, 40));
		label_1_1.setBounds(439, 10, 178, 53);
		contentPane_1.add(label_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("Page 2: Additional Details\r\n");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(157, 69, 348, 43);
		contentPane_1.add(lblNewLabel_1);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Jain", "Hindu", "Muslim", "Sikh", "Christion", "Other"}));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setBounds(270, 163, 280, 29);
		contentPane_1.add(comboBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Religion :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(41, 163, 140, 27);
		contentPane_1.add(lblNewLabel_2);
		
		comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"General", "OBC", "SC", "NT", "ST", "Other"}));
		comboBox_1_1.setForeground(Color.BLACK);
		comboBox_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1_1.setBackground(Color.WHITE);
		comboBox_1_1.setBounds(270, 223, 280, 29);
		contentPane_1.add(comboBox_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Income :");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_1.setBounds(39, 283, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_1);
		
		comboBox_1_1_1 = new JComboBox();
		comboBox_1_1_1.setModel(new DefaultComboBoxModel(new String[] {"Less than 1 Lack", "Less than 2 Lack", "Less than 3 Lack", "Less than 4 Lack", "Less than 5 Lack", "More than 5 Lack"}));
		comboBox_1_1_1.setForeground(Color.BLACK);
		comboBox_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1_1_1.setBackground(Color.WHITE);
		comboBox_1_1_1.setBounds(270, 283, 280, 29);
		contentPane_1.add(comboBox_1_1_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Occupation :");
		lblNewLabel_2_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2_1_3_1.setBounds(39, 336, 207, 27);
		contentPane_1.add(lblNewLabel_2_1_3_1);
		
		comboBox_1_2_1 = new JComboBox();
		comboBox_1_2_1.setModel(new DefaultComboBoxModel(new String[] {"Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others"}));
		comboBox_1_2_1.setForeground(Color.BLACK);
		comboBox_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		comboBox_1_2_1.setBackground(Color.WHITE);
		comboBox_1_2_1.setBounds(270, 336, 280, 29);
		contentPane_1.add(comboBox_1_2_1);
		rdbtnNo = new JRadioButton("No");
		buttonGroup.add(rdbtnNo);
		
		rdbtnNo.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNo.setBackground(new Color(245, 255, 250));
		rdbtnNo.setBounds(402, 510, 103, 21);
		contentPane_1.add(rdbtnNo);
		rdbtnYes = new JRadioButton("Yes\r\n\r\n");
		buttonGroup.add(rdbtnYes);
		rdbtnYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_5.setVisible(false);
				rdbtnNo.setSelected(false);
				rdbtnYes.setSelected(true);
				rdbtnNo.setSelected(false);
			}
		});
		rdbtnYes.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnYes.setBackground(new Color(245, 255, 250));
		rdbtnYes.setBounds(270, 512, 103, 21);
		contentPane_1.add(rdbtnYes);
		rdbtnNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_5.setVisible(false);
				
				rdbtnYes.setSelected(false);
				rdbtnNo.setSelected(true);
				rdbtnYes.setSelected(false);
			}
		});
		
		
		rdbtnYes_1 = new JRadioButton("Yes\r\n\r\n");
		buttonGroup_1.add(rdbtnYes_1);
		
		rdbtnYes_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnYes_1.setBackground(new Color(245, 255, 250));
		rdbtnYes_1.setBounds(270, 553, 103, 21);
		contentPane_1.add(rdbtnYes_1);
		
		rdbtnNo_1 = new JRadioButton("No");
		buttonGroup_1.add(rdbtnNo_1);
		rdbtnNo_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_5_1.setVisible(false);
				rdbtnYes_1.setSelected(false);
				rdbtnNo_1.setSelected(true);
				rdbtnYes_1.setSelected(false);
			}
		});
		rdbtnNo_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		rdbtnNo_1.setBackground(new Color(245, 255, 250));
		rdbtnNo_1.setBounds(402, 553, 103, 21);
		contentPane_1.add(rdbtnNo_1);
		
		textField_1 = new JTextField();
		textField_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_3.setVisible(false);
			}
		});
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(270, 399, 280, 27);
		contentPane_1.add(textField_1);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_4.setVisible(false);
			}
		});
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setColumns(10);
		textField.setBounds(270, 456, 280, 27);
		contentPane_1.add(textField);
		
		lblNewLabel_3 = new JLabel("Enter Valid PAN Number (E.g. ALWPG5809L).");
		lblNewLabel_3.setForeground(Color.RED);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(270, 423, 280, 21);
		contentPane_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Enter Valid Aadhar Number (12 - digit)");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(268, 481, 302, 23);
		contentPane_1.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Select one of the above option\r\n");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setBounds(270, 534, 235, 21);
		contentPane_1.add(lblNewLabel_5);
		lblNewLabel_5.setVisible(false);
		
		lblNewLabel_5_1 = new JLabel("Select one of the above option\r\n");
		lblNewLabel_5_1.setForeground(Color.RED);
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5_1.setBounds(270, 580, 235, 21);
		contentPane_1.add(lblNewLabel_5_1);
		lblNewLabel_5_1.setVisible(false);
		lblNewLabel_4.setVisible(false);
		lblNewLabel_3.setVisible(false);
		rdbtnYes_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				lblNewLabel_5_1.setVisible(false);
				rdbtnNo_1.setSelected(false);
				rdbtnYes_1.setSelected(true);
				rdbtnNo_1.setSelected(false);
			}
		});
		
		//SignUp_1 form_1 = new SignUp_1();
		
		
	}
}
