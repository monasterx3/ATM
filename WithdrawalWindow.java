package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
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

	private JPanel contentPane;
	private JTextField textField;
	JButton btnWithdraw = new JButton("WITHDRAW");
	JButton btnNewButton_3 = new JButton("CANCEL");
	JButton btnGoBack = new JButton("GO BACK");
	JButton button = new JButton("60.00");
	JButton btnNewButton = new JButton("500.00");
	JButton btnNewButton_1 = new JButton("200.00");
	JButton btnNewButton_2 = new JButton("40.00");
	JButton btnNewButton_4 = new JButton("20.00");
	JButton btnNewButton_5 = new JButton("100.00");
	
	String display=""; //create varible to display value
	
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("DATA STRUCTURES BANK");
		lblNewLabel.setForeground(SystemColor.controlHighlight);
		lblNewLabel.setBackground(SystemColor.text);
		lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 25));
		
		JLabel lblNewLabel_1 = new JLabel("ATM 24/7 ALL AROUND THE WORLD");
		
		JLabel lblEnterOtherAmount = new JLabel("ENTER OTHER AMOUNT");
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.window);
		
		textField = new JTextField();
		textField.setColumns(10);
		
		
		btnWithdraw.setForeground(SystemColor.controlHighlight);
		
		btnNewButton_3.setForeground(Color.RED);
		
		
		btnGoBack.setForeground(Color.RED);
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
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(lblEnterOtherAmount, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
													.addGap(25))
												.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
													.addComponent(textField, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
													.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE)))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnNewButton)
												.addComponent(btnNewButton_5)
												.addComponent(btnNewButton_1))))))))
					.addContainerGap(20, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(200, Short.MAX_VALUE)
					.addComponent(btnGoBack, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton_3)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(59)
					.addComponent(btnWithdraw, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(113, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel)
					.addGap(3)
					.addComponent(lblNewLabel_1)
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_5)
									.addGap(3)
									.addComponent(btnNewButton_1)
									.addGap(4)
									.addComponent(btnNewButton)))
							.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
							.addComponent(lblEnterOtherAmount)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(btnNewButton_4)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnNewButton_2)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(button))))
					.addGap(3)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnWithdraw)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnGoBack)
						.addComponent(btnNewButton_3))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		actionGoBack();
		actionCancel();
		action20();
		action40();
		action60();
		action100();
		action200();
		action500();
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
	public void actionCancel() {
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				JOptionPane.showMessageDialog(null, "Withdrawal Canceled. Thank you for banking with us!" );
				dispose(); 
			}
		});
	}
	
	public void action20 (){ //method to display 20.00 
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent ae) {
				display=textField.getText(); //get whatever value already present in text field
				if (textField.getText().equals("")) {
					textField.setText("20.00"); //if text field is empty then display 20
				}else{
					double display20=Double.parseDouble(display); //else convert string from text field to double 
					double add20=display20+20.00;  //added 20 to current value
					String value=String.valueOf(add20); //convert value back to string
					textField.setText(value); //display string
				}
			}
		});
	}
	public void action40 (){ //method to display 40.00 
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent ae) {
				display=textField.getText(); 
				if (textField.getText().equals("")) {
					textField.setText("40.00"); 
				}else{
					double display40=Double.parseDouble(display); 
					double add40=display40+40.00;  
					String value=String.valueOf(add40); 
					textField.setText(value); 
				}
			}
		});
	}
	public void action60 (){ //method to display 60.00 
		button.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent ae) {
				display=textField.getText(); 
				if (textField.getText().equals("")) {
					textField.setText("60.00"); 
				}else{
					double display60=Double.parseDouble(display); 
					double add60=display60+60.00;  
					String value=String.valueOf(add60); 
					textField.setText(value); 
				}
			}
		});
	}
	public void action100 (){ //method to display 100.00 
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent ae) {
				display=textField.getText(); 
				if (textField.getText().equals("")) {
					textField.setText("100.00"); 
				}else{
					double display100=Double.parseDouble(display); 
					double add100=display100+100.00;  
					String value=String.valueOf(add100); 
					textField.setText(value); 
				}
			}
		});
	}
	public void action200 (){ //method to display 200.00 
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent ae) {
				display=textField.getText(); 
				if (textField.getText().equals("")) {
					textField.setText("200.00"); 
				}else{
					double display200=Double.parseDouble(display); 
					double add200=display200+200.00;  
					String value=String.valueOf(add200); 
					textField.setText(value); 
				}
			}
		});
	}
	public void action500 (){ //method to display 500.00 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed (ActionEvent ae) {
				display=textField.getText(); 
				if (textField.getText().equals("")) {
					textField.setText("500.00"); 
				}else{
					double display500=Double.parseDouble(display); 
					double add500=display500+500.00;  
					String value=String.valueOf(add500); 
					textField.setText(value); 
				}
			}
		});
	}
}
