package gui;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class CheckBalance extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JButton btnNewButton = new JButton("EXIT");
	JButton btnGoBack = new JButton("GO BACK");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBalance frame = new CheckBalance();
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
	public CheckBalance() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel.setForeground(SystemColor.controlHighlight);
		
		JLabel lblNewLabel_1 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JLabel lblAccountSummary = new JLabel("Account Summary");
		lblAccountSummary.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		
		btnNewButton.setForeground(Color.RED);
		
		btnGoBack.setForeground(Color.RED);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(97)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(146)
							.addComponent(lblAccountSummary))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(43)
							.addComponent(lblNewLabel)))
					.addContainerGap(46, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(236, Short.MAX_VALUE)
					.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(68)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addGap(18)
					.addComponent(lblAccountSummary)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnGoBack)))
		);
		contentPane.setLayout(gl_contentPane);
		actionGoBack();
		actionExit();
	}
	public void actionGoBack() {
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
					nextMenu nextMenu=new nextMenu();
					nextMenu.setVisible(true); //open next window which is nextMenu
					dispose(); //close this window
			
			}
		});
	}
	public void actionExit() {
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
							JOptionPane.showMessageDialog(null, "You're now signed out. Thank you for banking with us!" );
							dispose(); 
						}
				});
		}
}
