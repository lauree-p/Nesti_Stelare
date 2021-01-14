package views;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingConstants;

public class View_App {
	
	private JFrame frame;

	/**
	 * Create the application.
	 */
	public View_App() {
		initialize();
	}

	private void initialize() {
		
		// Frame Principale
		frame = new JFrame();
		frame.setResizable(false);
		frame.setVisible(true);
		frame.getContentPane().setBackground(new Color(46, 22, 14));
		frame.setBounds(100, 100, 1280, 720);	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Panel log
		JPanel panel_log = new JPanel();
		panel_log.setBackground(new Color(230, 167, 86));
		panel_log.setBounds(0, 0, 1274, 46);
		panel_log.setLayout(null);
		
		// Bouton deconnexion
		JButton btn_disconnect = new JButton("Deconnexion");
		btn_disconnect.setBounds(1124, 14, 124, 23);
		
		// Label Nickname
		JLabel lbl_nickname = new JLabel("SuperAdministrateur01");
		lbl_nickname.setBounds(910, 11, 204, 29);
		lbl_nickname.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_nickname.setForeground(Color.BLACK);
		
		panel_log.add(btn_disconnect);
		panel_log.add(lbl_nickname);
		
		frame.getContentPane().add(panel_log);
		
		// TabbedPane
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(10, 57, 1241, 613);
		
		frame.getContentPane().add(tabbedPane);
		
		// All Panels (TabbedPane)
		JPanel panel_articles = new JPanel();
		panel_articles.setBackground(Color.WHITE);
		tabbedPane.addTab("Articles", null, panel_articles, null);
		panel_articles.setLayout(null);
		
		JPanel panel_suppliers = new JPanel();
		panel_articles.setBackground(Color.WHITE);
		tabbedPane.addTab("Fournisseurs", null, panel_suppliers, null);
		panel_articles.setLayout(null);
		
		JPanel panel_orders = new JPanel();
		tabbedPane.addTab("Commandes", null, panel_orders, null);
		panel_articles.setLayout(null);
		
		JPanel panel_products = new JPanel();
		tabbedPane.addTab("Produits", null, panel_products, null);
		panel_articles.setLayout(null);
		
		JPanel panel_myAccount = new JPanel();
		tabbedPane.addTab("Mon compte", null, panel_myAccount, null);
		panel_articles.setLayout(null);
		
		JPanel panel_administrators = new JPanel();
		tabbedPane.addTab("Administrateurs", null, panel_administrators, null);
		panel_articles.setLayout(null);
		
	}
}
