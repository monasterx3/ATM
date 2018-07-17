

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

public class nextMenu extends JFrame {

	private JPanel contentPane;
	
	public static String cardNumber=ATMFramee.getCard();
	
	
	
	
	public static String firstName=TheDataBase.getFirstNameByCardNumb(cardNumber);
	public static String lastName=TheDataBase.getLastNameByCardNumb(cardNumber);
	public static String Balance=TheDataBase.getAccountBalanceByCardNumb(cardNumber);
	public static String Email= TheDataBase.getEmailCardNumb(cardNumber);
	public static String AccountType=TheDataBase.getAccountTypeByCardNumb(cardNumber);
	
	
	
	
	JButton btnWithdraw = new JButton("WITHDRAW");	
	JButton btnCheck = new JButton("CHECK BALANCE");
	JButton btnDeposit = new JButton("DEPOSIT");
	JButton btnTakeCard = new JButton("TAKE CARD");
	private final JTextField txtWelcome = new JTextField();
	private final JTextField txtAccountType = new JTextField();
	private final JTextField txtAccountNumber = new JTextField();
	private final JTextField txtCheckingOr = new JTextField();
	private final JTextField txtAccountnumbers = new JTextField();
	
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
		txtAccountnumbers.setEditable(false);
		txtAccountnumbers.setText(cardNumber);
		txtAccountnumbers.setColumns(10);
		txtCheckingOr.setEditable(false);
		txtCheckingOr.setText(AccountType);
		txtCheckingOr.setColumns(10);
		txtAccountNumber.setEditable(false);
		txtAccountNumber.setForeground(SystemColor.blue);
		txtAccountNumber.setText("Account Number:");
		txtAccountNumber.setColumns(10);
		txtAccountType.setEditable(false);
		txtAccountType.setText("Account Type:");
		txtAccountType.setColumns(10);
		txtAccountType.setForeground(SystemColor.blue);
		txtWelcome.setEditable(false);
		txtWelcome.setForeground(SystemColor.blue);
		txtWelcome.setText("Welcome "+lastName+" "+firstName);
		txtWelcome.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 519, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(6, 6, 6, 6));
		setContentPane(contentPane);
		
		JLabel lblNewLabel_1 = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel_1.setForeground(SystemColor.blue);
		lblNewLabel_1.setFont(new Font("Georgia", Font.BOLD, 25));
		
		JLabel lblNewLabel_2 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		
		
		btnWithdraw.setForeground(SystemColor.blue);
		btnWithdraw.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		
		btnCheck.setForeground(SystemColor.blue);
		btnCheck.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		
		
		//btnDeposit.setBackground(Color.GRAY);
		btnDeposit.setForeground(SystemColor.blue);
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeposit.setFont(new Font("Lucida Grande", Font.BOLD, 14));
		btnTakeCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "THANKS FOR USING DATA STRUCTURE BANK ATM");

				dispose();
			}
		});
		
		
		btnTakeCard.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		btnTakeCard.setForeground(Color.RED);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addComponent(lblNewLabel_1)
					.addContainerGap(101, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtAccountType, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtAccountNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(txtAccountnumbers, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
								.addComponent(txtCheckingOr, GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(95)
							.addComponent(lblNewLabel_2))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addComponent(btnCheck, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnDeposit, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnWithdraw, GroupLayout.PREFERRED_SIZE, 194, GroupLayout.PREFERRED_SIZE))))
						.addComponent(txtWelcome, GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE))
					.addGap(144))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(327, Short.MAX_VALUE)
					.addComponent(btnTakeCard, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
					.addGap(95))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtWelcome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtCheckingOr, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAccountType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtAccountnumbers, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtAccountNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(30)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnDeposit)
						.addComponent(btnWithdraw))
					.addGap(18)
					.addComponent(btnCheck)
					.addPreferredGap(ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
					.addComponent(btnTakeCard)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		actionDeposit();
		actionCheckBalance();
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
