package sifreleme;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Panel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.Choice;
import java.awt.Scrollbar;

public class homePage extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					homePage frame = new homePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

			String encrypted;
			String gelen;
			String result;
			int length;
			int i,j;
			
	public homePage() {
		setResizable(false);
		
		
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\wgsu\\Desktop\\indir.png"));
		setTitle("Java Encrypt\u0131on");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 747, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(255, 0, 0), 4));
		panel.setBackground(Color.BLACK);
		panel.setBounds(163, 49, 414, 162);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbltextToBe = new JLabel("text to be encrypted\r\n");
		lbltextToBe.setBounds(109, 0, 193, 28);
		lbltextToBe.setFont(new Font("Stencil Std", Font.PLAIN, 15));
		lbltextToBe.setForeground(new Color(0, 128, 0));
		panel.add(lbltextToBe);
		
		TextArea textEncry = new TextArea();
		textEncry.setBackground(Color.WHITE);
		textEncry.setForeground(new Color(255, 0, 0));
		textEncry.setFont(new Font("Arial Unicode MS", Font.BOLD, 15));
		textEncry.setBounds(10, 34, 394, 116);
		panel.add(textEncry);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(255, 0, 0), 5, true));
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 732, 36);
		contentPane.add(panel_1);
		
		JLabel lblTitle = new JLabel("BASI\r\nC JAVA ENCRYPTION");
		lblTitle.setForeground(new Color(0, 128, 0));
		lblTitle.setFont(new Font("Stencil Std", Font.PLAIN, 25));
		lblTitle.setBounds(201, 0, 370, 41);
		panel_1.add(lblTitle);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(255, 0, 0), 4));
		panel_2.setBackground(Color.BLACK);
		panel_2.setBounds(163, 237, 414, 70);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblEncryptýonType = new JLabel("encryption type");
		lblEncryptýonType.setBounds(130, 0, 193, 28);
		lblEncryptýonType.setForeground(new Color(0, 128, 0));
		lblEncryptýonType.setFont(new Font("Stencil Std", Font.PLAIN, 15));
		panel_2.add(lblEncryptýonType);

		
		txtNumber = new JTextField();
		txtNumber.setBackground(new Color(244, 164, 96));
		txtNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtNumber.setForeground(new Color(139, 0, 0));
		txtNumber.setBounds(199, 28, 50, 28);
		panel_2.add(txtNumber);
		txtNumber.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("SH\u0130FT");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setForeground(new Color(255, 140, 0));
		lblNewLabel.setBounds(150, 33, 50, 16);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(255, 0, 0), 4));
		panel_3.setBackground(Color.BLACK);
		panel_3.setBounds(163, 346, 414, 167);
		contentPane.add(panel_3);
		
		JLabel lblResult = new JLabel("RESULT TEXT\r\n");
		lblResult.setForeground(new Color(0, 128, 0));
		lblResult.setFont(new Font("Stencil Std", Font.PLAIN, 15));
		lblResult.setBounds(149, 0, 115, 28);
		panel_3.add(lblResult);
		
		TextArea textResultArea = new TextArea();
		textResultArea.setBackground(new Color(255, 255, 240));
		textResultArea.setForeground(Color.BLUE);
		textResultArea.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		textResultArea.setBounds(10, 34, 394, 116);
		panel_3.add(textResultArea);
		
		JButton btnCeaser = new JButton("CEASER\r\n");
		btnCeaser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if(txtNumber.getText().equals("")) {
				JOptionPane.showMessageDialog(new Frame(),"Shift number must be blank!");
				}else {
				int shift = Integer.parseInt(txtNumber.getText());
				String userText = textEncry.getText().toLowerCase();
				operationClass c = new operationClass();
				c.Ceaser(userText, shift);
				textResultArea.setText(c.encrypted.toLowerCase());
				}

			}
		});
		btnCeaser.setForeground(new Color(255, 0, 0));
		btnCeaser.setFont(new Font("Stencil", Font.PLAIN, 13));
		btnCeaser.setBackground(new Color(244, 164, 96));
		btnCeaser.setBounds(12, 32, 97, 25);
		panel_2.add(btnCeaser);
		
		JButton btnAtbash = new JButton("ATBASH\r\n");
		btnAtbash.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String userTextAtbash = textEncry.getText().toLowerCase();
				// .toLowerCase() because ý don't want bug :) 
				
				operationClass c = new operationClass();
				
				c.Atbash(userTextAtbash);
				textResultArea.setText(c.encryptedAtbash.toLowerCase());
				
			}
		});
		btnAtbash.setBackground(new Color(244, 164, 96));
		btnAtbash.setForeground(new Color(255, 0, 0));
		btnAtbash.setFont(new Font("Stencil", Font.PLAIN, 13));
		btnAtbash.setBounds(305, 32, 97, 25);
		panel_2.add(btnAtbash);
		
		JLabel lblNewLabel_1 = new JLabel("AUTHOR BY SEM\u0130H YOLCU");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Trajan Pro", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(245, 536, 233, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\wgsu\\Desktop\\giphy (3).gif"));
		lblNewLabel_2.setBounds(0, 35, 732, 501);
		contentPane.add(lblNewLabel_2);
	}
}
