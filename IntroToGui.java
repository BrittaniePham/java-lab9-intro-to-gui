package lab9_intro_to_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class IntroToGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntroToGui frame = new IntroToGui();
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
	public IntroToGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("My First GUI");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 33));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.BLUE);
		lblNewLabel.setForeground(Color.GREEN);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnWest = new JButton("WEST");
		contentPane.add(btnWest, BorderLayout.WEST);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.SOUTH);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		panel.add(textField);
		textField.setColumns(16);
		
		JLabel lblHi = new JLabel("Hi");
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHi.setFont(new Font("Papyrus", Font.PLAIN, 77));
		lblHi.setForeground(Color.ORANGE);
		lblHi.setOpaque(true);
		lblHi.setBackground(Color.RED);
		contentPane.add(lblHi, BorderLayout.CENTER);
	}

}
