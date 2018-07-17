

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Color;

public class WithdrawalWindow extends JFrame {
	public static String cardNumber=ATMFramee.getCard();

	private JPanel contentPane;
	JButton btnWithdraw = new JButton("WITHDRAW");	
	JButton btnNewButton_3 = new JButton("TAKE CARD");
	JButton btnGoBack = new JButton("GO BACK");
	private JTextField textField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WithdrawalWindow frame = new WithdrawalWindow();
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
	public WithdrawalWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel.setForeground(SystemColor.blue);
		lblNewLabel.setBackground(SystemColor.text);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JButton btnNewButton = new JButton("500.00");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText("500.00");
			}
		});
		
		JButton btnNewButton_1 = new JButton("200.00");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText("200.00");
			}
		});
		
		JButton btnNewButton_2 = new JButton("40.00");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText("40.00");
			}
		});
		
		JButton btnNewButton_4 = new JButton("20.00");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText("20.00");
				
			}
		});
		
		JButton btnNewButton_5 = new JButton("100.00");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText("100.00");
				
			}
		});
		JButton button = new JButton("60.00");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField.setText("60.00");
			}
		});
		
		JLabel lblEnterOtherAmount = new JLabel("ENTER OTHER AMOUNT:");
		lblEnterOtherAmount.setForeground(Color.RED);
		lblEnterOtherAmount.setBackground(Color.BLUE);
		
		
		
		
		btnWithdraw.setForeground(SystemColor.blue);
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String withDrawAmount=textField.getText();
				float balanceToWithdraw =Float.parseFloat(withDrawAmount);
				float currentBalance=Float.parseFloat(TheDataBase.getAccountBalanceByCardNumb(cardNumber));
				if (numbOrNot(withDrawAmount)) {
					if(balanceToWithdraw < currentBalance) {
						TheDataBase.updateBalanceWithdraw(cardNumber, withDrawAmount);
						String newBalanceNow=TheDataBase.getAccountBalanceByCardNumb(cardNumber);
						JOptionPane.showMessageDialog(null, "TAKE YOUR CASH!\n Your New Balance is: "+newBalanceNow);



						textField.setText("");
						
					}else {
						
						JOptionPane.showMessageDialog(null, "LOW BALANCE, ARE YOU A COLLEGE STUDENT? :)");
						textField.setText("");
						//textField.requestFocus();
					}
				}else {
					JOptionPane.showMessageDialog(null, "Enter a Number in the field or Choose a Quick Balance");
					textField.setText("");
				}
				
			}
		});
		
		
		btnNewButton_3.setForeground(Color.RED);
		
		
		btnGoBack.setForeground(Color.RED);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton button_1 = new JButton("TAKE CARD");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "THANKS FOR USING DATA STRUCTURE BANK ATM");

				dispose();
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Dialog", Font.BOLD, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(35)
									.addComponent(lblNewLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnNewButton_4)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(button)))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_1)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(textField, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblEnterOtherAmount, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnNewButton)
												.addComponent(btnNewButton_5)
												.addComponent(btnNewButton_1))))))))
					.addContainerGap(102, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(279, Short.MAX_VALUE)
					.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_3)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(100)
					.addComponent(btnWithdraw, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(221, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(337, Short.MAX_VALUE)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(45))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(3)
					.addComponent(lblNewLabel_1)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(25)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_5)
									.addGap(3)
									.addComponent(btnNewButton_1)
									.addGap(4)
									.addComponent(btnNewButton)
									.addPreferredGap(ComponentPlacement.RELATED, 5, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(btnNewButton_4)
										.addComponent(lblEnterOtherAmount))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(button)))
							.addGap(29))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
							.addGap(39)))
					.addGap(5)
					.addComponent(btnWithdraw)
					.addGap(92)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnGoBack)
						.addComponent(btnNewButton_3))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		actionGoBack();
	}
	public boolean numbOrNot(String Number) {
		 boolean isItNumb= false;
	try {
	     Float.parseFloat(Number);
	     isItNumb=true;
	}
	catch (NumberFormatException e) {
		isItNumb=false;
	}
	return isItNumb;
	}
	public void actionGoBack() {
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
					nextMenu nextMenu=new nextMenu();
					nextMenu.setVisible(true); 
					dispose(); 
			
			}
		});
	}
}
