package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class NewAcct extends JFrame {

	private JPanel contentPane;
	private JTextField fName_textField;
	private JTextField lName_textField;
	private JTextField email_textField;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewAcct frame = new NewAcct();
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
	public NewAcct() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("FIRST NAME");
		lblNewLabel.setForeground(SystemColor.controlHighlight);
		
		JLabel lblNewLabel_1 = new JLabel("LAST NAME");
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		
		JLabel lblNewLabel_2 = new JLabel("ACCOUNT TYPE");
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		
		fName_textField = new JTextField();
		fName_textField.setColumns(10);
		
		lName_textField = new JTextField();
		lName_textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("EMAIL");
		lblNewLabel_3.setForeground(SystemColor.controlHighlight);
		
		email_textField = new JTextField();
		email_textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lblNewLabel_4.setForeground(SystemColor.controlHighlight);
		
		JLabel lblNewLabel_5 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JLabel lblNewLabel_6 = new JLabel("PLEASE FILL OUT NEW ACCOUNT FORM");
		lblNewLabel_6.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		
		JLabel pinNum_textField = new JLabel("PIN #");
		pinNum_textField.setForeground(SystemColor.controlHighlight);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		JButton btnCreateAcct = new JButton("CREATE ACCOUNT");
		btnCreateAcct.setForeground(SystemColor.controlHighlight);
		
		JCheckBox chckbxChecking = new JCheckBox("CHECKING");
		
		JCheckBox chckbxSavings = new JCheckBox("SAVINGS");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(54)
							.addComponent(lblNewLabel_4))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(chckbxChecking)
							.addGap(45)
							.addComponent(chckbxSavings))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblNewLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblNewLabel_1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(pinNum_textField))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addComponent(lblNewLabel_3)))
							.addGap(33)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField_4, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
								.addComponent(lName_textField, 0, 0, Short.MAX_VALUE)
								.addComponent(email_textField, GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
								.addComponent(fName_textField, 0, 0, Short.MAX_VALUE))
							.addGap(72)
							.addComponent(btnCreateAcct))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(90)
							.addComponent(lblNewLabel_5))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(62)
							.addComponent(lblNewLabel_6)))
					.addContainerGap(1, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_5)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_6)
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(chckbxChecking)
						.addComponent(chckbxSavings))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(fName_textField, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lName_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(email_textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_3))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(pinNum_textField)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnCreateAcct)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
