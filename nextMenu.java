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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class nextMenu extends JFrame {

	private JPanel contentPane;
	JButton btnWithdraw = new JButton("WITHDRAW");	
	JButton btnCheck = new JButton("CHECK BALANCE");
	JButton btnDeposit = new JButton("DEPOSIT");
	//JButton btnGoBack = new JButton("GO BACK"); I dont think this button is needed  
	JButton btnTakeCard = new JButton("EXIT");
	
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
		
		
		//btnGoBack.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		//btnGoBack.setForeground(Color.RED);
		
		
		btnTakeCard.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnTakeCard.setForeground(Color.RED);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(206, Short.MAX_VALUE)
					//.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnTakeCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(20))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(132)
					.addComponent(btnCheck, GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
					.addGap(124))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(6)
							.addComponent(btnDeposit, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnWithdraw, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1))
					.addGap(36))
				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
					.addGap(96)
					.addComponent(lblNewLabel_2)
					.addContainerGap(113, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnWithdraw)
						.addComponent(btnDeposit))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnCheck)
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						//.addComponent(btnGoBack)
						.addComponent(btnTakeCard)))
		);
		contentPane.setLayout(gl_contentPane);
		actionDeposit();
		actionCheckBalance();
		actionWithdraw();
		actionExit();
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
	
	public void actionWithdraw() {
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
							WithdrawalWindow WithdrawalWindow=new WithdrawalWindow();
							WithdrawalWindow.setVisible(true); 
							dispose(); //close this window
			}
		});
	}
	public void actionExit() {
		btnTakeCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
							JOptionPane.showMessageDialog(null, "Account Activity Canceled. Thank you for banking with us!" );
							dispose(); 
						}
				});
		}
}
