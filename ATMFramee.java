package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ATMFramee extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;
	JButton btnProceed = new JButton("PROCEED"); 
	JButton btnNewAccount = new JButton("NEW ACCOUNT");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ATMFramee frame = new ATMFramee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		new ATMFramee();
	}

	/**
	 * Create the frame.
	 */
	public ATMFramee() {
		setForeground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel.setForeground(SystemColor.controlHighlight);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 26));
		
		JLabel lblNewLabel_1 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JLabel lblNewLabel_3 = new JLabel("Insert credit/ debit card or enter account number");
		
		JLabel label = new JLabel("");
		
		JButton btnCard = new JButton("");
		btnCard.setIcon(new ImageIcon("/Users/apple/eclipse-workspace/ATM/src/gui/card-img.jpeg"));
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PinM pin = new PinM();
				pin.setVisible(true);
			}
		
		}); 
		
		JLabel lblNewLabel_2 = new JLabel("Account #:");
		lblNewLabel_2.setForeground(SystemColor.controlHighlight);
		
		
		passwordField = new JPasswordField();
		
		
		btnProceed.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnProceed.setForeground(SystemColor.controlHighlight);
		
		JLabel lblNewLabel_4 = new JLabel("Create a New Account Now");
		lblNewLabel_4.setForeground(SystemColor.controlHighlight);
		
		
		btnNewAccount.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnNewAccount.setForeground(SystemColor.controlHighlight);
	
	
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(label)
							.addGap(571))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(92)
							.addComponent(lblNewLabel_1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(37)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 396, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(66)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCard, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(26)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 212, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnProceed))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_4)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnNewAccount, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCard, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnProceed)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lblNewLabel_2)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(168)
							.addComponent(label))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_4)
							.addComponent(btnNewAccount)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		actionATMFramee(); //call method
		actionCreateAcct();
	}
	public void actionATMFramee() {
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String acctnum=passwordField.getText(); //get user input
					if(acctnum.equals("123")) { //Check if account number entered from user is the same 
						PinM PinM=new PinM();
						PinM.setVisible(true); //open next window which is pinM
						dispose(); //close this window
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Account Number");
						passwordField.setText("");
						passwordField.requestFocus();
					}
			}
		});
	}
	public void actionCreateAcct(){
		btnNewAccount.addActionListener( new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				NewAcct NewAcct=new NewAcct();
				NewAcct.setVisible(true);
				dispose();
			}
		});
	}
	
}

