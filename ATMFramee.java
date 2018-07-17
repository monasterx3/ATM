
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
import javax.swing.JTextField;

public class ATMFramee extends JFrame {
	public static TheDataBase dataB = new TheDataBase();

	private JPanel contentPane;
	
	JButton btnProceed = new JButton("PROCEED"); 
	private JTextField textField;
	public static String cardNumber;
	
	
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
		setBounds(100, 100, 520, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel.setForeground(SystemColor.blue);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 26));
		
		JLabel lblNewLabel_1 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JLabel lblNewLabel_3 = new JLabel("Insert credit/ debit card or enter account number");
		
		JLabel label = new JLabel("");
		
		JButton btnCard = new JButton("");
		btnCard.setBackground(Color.GRAY);
		btnCard.setIcon(new ImageIcon("C:\\Users\\diaof\\eclipse-workspace\\Testing\\src\\card-img.jpeg"));
		btnCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PinM pin = new PinM();
				
				pin.setVisible(true);
			}
		
		});
		
		
		JLabel lblNewLabel_2 = new JLabel("ENTER CARD #:");
		lblNewLabel_2.setForeground(SystemColor.blue);
		
		
		btnProceed.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnProceed.setForeground(SystemColor.blue);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnCreateAccount = new JButton("CREATE ACCOUNT");
		btnCreateAccount.setForeground(Color.RED);
	
	
		
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
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(6)
									.addComponent(btnCard, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE)))
					.addGap(99))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(188)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(btnCreateAccount, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnProceed, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
					.addGap(349))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_3)
					.addGap(12)
					.addComponent(btnCard)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnProceed, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCreateAccount)
					.addGap(20)
					.addComponent(label)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		actionATMFramee(); //call method
	}
	public void actionATMFramee() {
		btnProceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String acctnum = textField.getText(); //get user input
				cardNumber=acctnum;// assign user input to the CardNumber
				
				
				
				if(dataB.checkConnection()) {
					if(dataB.checkCard(cardNumber)) { //Check if account number entered from user is the same 
						//System.out.println(dataB.getPinByCardNumb(cardNumber));
						PinM PinM=new PinM();
						PinM.setVisible(true); //open next window which is pinM
						dispose(); //close this window
					}else {
						JOptionPane.showMessageDialog(null, "Invalid Account Number");
						textField.setText("");
						textField.requestFocus();
					}
			}else {
				System.out.println("nope");
			}
				
				
				
			}
		});
	}
	
	public static String getCard() {
		return cardNumber;
	}
	
}
