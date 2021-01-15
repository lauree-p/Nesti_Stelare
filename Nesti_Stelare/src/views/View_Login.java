package views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class View_Login {

	private static final String CENTER = null;
	private JFrame frame;
	private JTextField name;
	private JTextField passWord;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					View_Login window = new View_Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public View_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(46, 22, 14));
		frame.getContentPane().setLayout(null);
		frame.setBounds(100, 100, 496, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/**
		 * Nesti logo.
		 */
		JLabel img = new JLabel(new ImageIcon(View_Login.class.getResource("/img/connect-image.png")));
		img.setBounds(0, 0, 480, 127);
		frame.getContentPane().add(img);

		JLabel name_user = new JLabel("Nom utilisateur");
		name_user.setForeground(new Color(230, 167, 86));
		name_user.setFont(new Font("Tahoma", Font.PLAIN, 15));
		name_user.setHorizontalAlignment(SwingConstants.CENTER);
		name_user.setBounds(-12, 170, 157, 14);
		frame.getContentPane().add(name_user);

		JLabel passWord_user = new JLabel("Mot de passe");
		passWord_user.setForeground(new Color(230, 167, 86));
		passWord_user.setHorizontalAlignment(SwingConstants.CENTER);
		passWord_user.setFont(new Font("Tahoma", Font.PLAIN, 15));
		passWord_user.setBounds(-12, 248, 146, 14);
		frame.getContentPane().add(passWord_user);

		/**
		 * Fields to fill for connection.
		 */
		name = new JTextField();
		name.setBounds(124, 163, 346, 33);
		frame.getContentPane().add(name);
		name.setColumns(10);

		passWord = new JTextField();
		passWord.setBounds(124, 241, 346, 33);
		frame.getContentPane().add(passWord);
		passWord.setColumns(10);

		/**
		 * Button to connect.
		 */
		JButton btn_connection = new JButton("SE CONNECTER");
		btn_connection.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_connection.setForeground(Color.WHITE);
		btn_connection.setBackground(new Color(88, 55, 30));
		btn_connection.setBounds(171, 306, 157, 33);
		frame.getContentPane().add(btn_connection);

	}
}