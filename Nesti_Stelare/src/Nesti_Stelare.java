import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.ListSelectionModel;

public class Nesti_Stelare {

	private JFrame frame;
	private JTable table_articles;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nesti_Stelare window = new Nesti_Stelare();
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
	public Nesti_Stelare() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		//frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		//frame.getContentPane().setEnabled(false);
		frame.setVisible(true);
		//frame.setEnabled(false);
		frame.getContentPane().setBackground(new Color(46, 22, 14));
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_log = new JPanel();
		panel_log.setBackground(new Color(230, 167, 86));
		panel_log.setBounds(0, 0, 1274, 46);
		frame.getContentPane().add(panel_log);
		panel_log.setLayout(null);
		
		JButton btn_disconnect = new JButton("Deconnexion");
		btn_disconnect.setBounds(1124, 14, 124, 23);
		panel_log.add(btn_disconnect);
		
		JLabel lbl_nickname = new JLabel("SuperAdministrateur01");
		lbl_nickname.setBounds(902, 11, 204, 29);
		panel_log.add(lbl_nickname);
		lbl_nickname.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_nickname.setForeground(Color.BLACK);
		
	    String data[][]={ 
	    		{"Boite de 6 oeufs","Ingrédient","2.50$","800g","boîte","actif","2"},    
	    		{"Paquet de farine","Ingrédient","1.45$","430g","paquet","en attente","4"},
	    		{"Lot de 2 fourchette","Ustensile","4.20$","100g","lot","bloqué","1"}
                };    
	    String[] columnNames={"Nom","Type","Prix","Poid","Conditionnement","Etat","Stock"};   
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 57, 884, 613);
		frame.getContentPane().add(tabbedPane);
		
		JTabbedPane tabbedPane_articles = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_articles.setToolTipText("Article");
		tabbedPane.addTab("Article", null, tabbedPane_articles, null);
		
		JScrollPane scrollPane_articles = new JScrollPane();
		tabbedPane_articles.addTab("New tab", null, scrollPane_articles, null);
		table_articles.setFillsViewportHeight (true);
		
		table_articles = new JTable(data, columnNames);
		table_articles.setColumnSelectionAllowed(true);
		table_articles.setCellSelectionEnabled(true);
		table_articles.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table_articles.setSurrendersFocusOnKeystroke(true);
		scrollPane_articles.setColumnHeaderView(table_articles);
		
		JTabbedPane tabbedPane_producteurs = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane_producteurs.setBackground(new Color(0, 0, 205));
		tabbedPane.addTab("Producteurs", null, tabbedPane_producteurs, null);
		
		JTabbedPane tabbedPane_commandes = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Commandes", null, tabbedPane_commandes, null);
		
		JTabbedPane tabbedPane_compte = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Mon compte", null, tabbedPane_compte, null);
		
		JTabbedPane tabbedPane_admin = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("Administrateurs", null, tabbedPane_admin, null);
		
		JScrollPane scrollPane_admin = new JScrollPane();
		tabbedPane_admin.addTab("New tab", null, scrollPane_admin, null);
		
		table = new JTable(data,columnNames);
		scrollPane_admin.setColumnHeaderView(table);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(904, 77, 350, 19);
		panel_3.setBackground(new Color(230, 167, 86));
		frame.getContentPane().add(panel_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(904, 96, 350, 574);
		frame.getContentPane().add(panel_1_1);
		panel_1_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(152, 5, 46, 14);
		panel_1_1.add(lblNewLabel);
	}
}
