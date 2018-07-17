


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
	
	public static String cardNumber=ATMFramee.getCard();
	
	public static String firstName=TheDataBase.getFirstNameByCardNumb(cardNumber);
	public static String lastName=TheDataBase.getLastNameByCardNumb(cardNumber);
	public static String Balance=TheDataBase.getAccountBalanceByCardNumb(cardNumber);
	public static String Email= TheDataBase.getEmailCardNumb(cardNumber);
	public static String AccountType=TheDataBase.getAccountTypeByCardNumb(cardNumber);
	
	

	private JPanel contentPane;
	private JTextField txtHello;
	JButton btnNewButton = new JButton("TAKE CARD");
	JButton btnGoBack = new JButton("GO BACK");
	private JTextField txtAccountBalanace;
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
		setBounds(100, 100, 520, 400);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 25));
		lblNewLabel.setForeground(SystemColor.blue);
		
		JLabel lblNewLabel_1 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JLabel lblAccountSummary = new JLabel("Account Summary");
		lblAccountSummary.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		
		txtHello = new JTextField();
		txtHello.setEditable(false);
		txtHello.setText("Account Number: "+cardNumber);
		txtHello.setColumns(10);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "THANKS FOR USING DATA STRUCTURE BANK ATM");

				dispose();
			}
		});
		
		btnNewButton.setForeground(Color.RED);
		
		btnGoBack.setForeground(Color.RED);
		
		txtAccountBalanace = new JTextField();
		txtAccountBalanace.setEditable(false);
		txtAccountBalanace.setText("Account Balanace: "+ TheDataBase.getAccountBalanceByCardNumb(cardNumber));
		txtAccountBalanace.setColumns(10);
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
					.addContainerGap(116, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(306, Short.MAX_VALUE)
					.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(68)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(txtAccountBalanace, Alignment.LEADING)
						.addComponent(txtHello, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
					.addContainerGap(142, Short.MAX_VALUE))
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
					.addComponent(txtHello, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtAccountBalanace, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(btnGoBack)))
		);
		contentPane.setLayout(gl_contentPane);
		actionGoBack();
		
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
}
