package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class nextMenu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JButton btnWithdraw = new JButton("WITHDRAW");	
	JButton btnCheck = new JButton("CHECK BALANCE");
	JButton btnDeposit = new JButton("DEPOSIT");
	JButton btnTransfer = new JButton("TRANSFER");
	JButton btnGoBack = new JButton("GO BACK");
	JButton btnTakeCard = new JButton("TAKE CARD");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nextMenu frame = new nextMenu();
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
	public nextMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel_1.setForeground(SystemColor.controlHighlight);
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 25));
		
		JLabel lblNewLabel_2 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		
		btnWithdraw.setForeground(SystemColor.controlHighlight);
		btnWithdraw.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		
		btnCheck.setForeground(SystemColor.controlHighlight);
		btnCheck.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		
		btnDeposit.setBackground(Color.GRAY);
		btnDeposit.setForeground(SystemColor.controlHighlight);
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeposit.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		
		btnTransfer.setForeground(SystemColor.controlHighlight);
		btnTransfer.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		
		btnGoBack.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnGoBack.setForeground(Color.RED);
		
		
		btnTakeCard.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnTakeCard.setForeground(Color.RED);
		
		textField = new JTextField();
		textField.setBackground(SystemColor.window);
		textField.setColumns(10);
		
		JRadioButton rdbtnChecking = new JRadioButton("Checking");
		
		JRadioButton rdbtnSavings = new JRadioButton("Savings");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(lblNewLabel_1)
					.addContainerGap(48, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(btnTransfer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(btnDeposit, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
								.addComponent(rdbtnChecking))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(btnCheck, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
								.addComponent(btnWithdraw, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(6)
									.addComponent(rdbtnSavings))))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(103)
							.addComponent(lblNewLabel_2))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(21)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 386, GroupLayout.PREFERRED_SIZE)))
					.addGap(31))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(206, Short.MAX_VALUE)
					.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnTakeCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDeposit)
						.addComponent(btnWithdraw))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnTransfer)
						.addComponent(btnCheck))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnSavings)
						.addComponent(rdbtnChecking))
					.addPreferredGap(ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnGoBack)
						.addComponent(btnTakeCard)))
		);
		contentPane.setLayout(gl_contentPane);
		actionDeposit();
		actionCheckBalance();
		actionTranfer();
		actionWithdraw();
	}
	public void actionDeposit() {
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
							Deposit Deposit=new Deposit();
							Deposit.setVisible(true); //open next window which is nextMenu
							dispose(); //close this window
			
			}
		});
	}
	public void actionCheckBalance() {
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
							CheckBalance CheckBalance=new CheckBalance();
							CheckBalance.setVisible(true); //open next window which is nextMenu
							dispose(); //close this window
			}
		});
	}
	public void actionTransfer() {
		btnTransfer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
							Transfer Transfer=new Transfer();
							Transfer.setVisible(true); 
							dispose(); //close this window
			}
		});
	}
	public void actionWithdraw() {
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
							WithdrawalWindow WithdrawalWindow=new WithdrawalWindow();
							WithdrawalWindow.setVisible(true); 
							dispose(); //close this window
			}
		});
	}
}
