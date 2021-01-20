package views;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import tools.MyRendererAndEditor;


public class View_Articles {

	public View_Articles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		/**
		 * Panels_articles
		 */
		
		// Create panels_articles (TabbedPane)
		JPanel panel_articles = new JPanel();
		panel_articles.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Articles", null, panel_articles, null);
		panel_articles.setLayout(null);
		
		/**
		 *  Table article
		 */
		
		// Create scrollPane_articles
		JScrollPane scrollPane_articles = new JScrollPane();
		scrollPane_articles.setBounds(0, 0, 888, 585);
		// Add scrollPane_articles to panel_articles
		panel_articles.add(scrollPane_articles);
		
		// Create table_article
		JTable table_article = new JTable();
		table_article.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boite de 6 oeufs", "Ingr\u00E9dient", 2.52+"€", "800g", "actif", "2", " "},
				{"Paquet de farine", "Ingr\u00E9dient", 1.45+"€", "430g", "en attente", "4", " "},
				{"Lot de 2 fourchette", "Ustensile", 4.24+"€", "100g", "bloqu\u00E9", "1", " "},
			},
			new String[] {
				"Nom", "Type", "Prix", "Poids", "Etat", "Stock", " "}
		) {
			private static final long serialVersionUID = 546831570763595984L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		// Columns Properties
		table_article.getColumnModel().getColumn(0).setResizable(false);
		table_article.getColumnModel().getColumn(1).setResizable(false);
		table_article.getColumnModel().getColumn(2).setResizable(false);
		table_article.getColumnModel().getColumn(3).setResizable(false);
		table_article.getColumnModel().getColumn(4).setResizable(false);
		table_article.getColumnModel().getColumn(5).setResizable(false);
		table_article.getColumnModel().getColumn(6).setResizable(false);
	    // Add btn upload
		table_article.getColumn(" ").setCellRenderer(new MyRendererAndEditor(table_article, "Modifier"));
		table_article.getColumn(" ").setCellEditor(new MyRendererAndEditor(table_article, "Modifier"));
		// Get table_article visible in the scrollPane_articles
		scrollPane_articles.setViewportView(table_article);
		scrollPane_articles.setColumnHeaderView(table_article.getTableHeader());
		
		/**
		 *  Panel create new article
		 */
		
		// Create panel_create_article
		JPanel panel_create_article = new JPanel();
		panel_create_article.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_create_article.setBounds(898, 11, 328, 273);
		panel_create_article.setBackground(Color.WHITE);
		panel_articles.add(panel_create_article);
		panel_create_article.setLayout(null);
		
		// Labels
		JLabel lbl_article_title = new JLabel("Cr\u00E9er un nouvel article");
		lbl_article_title.setForeground(Color.BLACK);
		lbl_article_title.setBackground(Color.LIGHT_GRAY);
		lbl_article_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_article_title.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_article_title.setBounds(0, 0, 328, 35);
		panel_create_article.add(lbl_article_title);

		JLabel lbl_article_name = new JLabel("Nom de l'article :");
		lbl_article_name.setBounds(23, 44, 277, 14);
		panel_create_article.add(lbl_article_name);
		
		JLabel lbl_article_poids = new JLabel("Poids :");
		lbl_article_poids.setBounds(23, 140, 46, 14);
		panel_create_article.add(lbl_article_poids);
		
		JLabel lbl_article_select_product = new JLabel("S\u00E9lection du produit :");
		lbl_article_select_product.setBounds(23, 90, 277, 20);
		panel_create_article.add(lbl_article_select_product);
		
		JLabel lbl_article_conditionnement = new JLabel("Conditionnement :");
		lbl_article_conditionnement.setBounds(23, 187, 109, 20);
		panel_create_article.add(lbl_article_conditionnement);
		
		// TextField
		JTextField textField_article_name = new JTextField();
		textField_article_name.setBounds(23, 59, 277, 20);
		panel_create_article.add(textField_article_name);
		textField_article_name.setColumns(10);

		JTextField textField_article_poids = new JTextField();
		textField_article_poids.setBounds(23, 156, 143, 20);
		panel_create_article.add(textField_article_poids);
		textField_article_poids.setColumns(10);

		// ComboBox
		JComboBox comboBox_article_product = new JComboBox();
		comboBox_article_product.setBounds(23, 109, 277, 20);
		panel_create_article.add(comboBox_article_product);

		JComboBox comboBox_article_poids = new JComboBox();
		comboBox_article_poids.setBounds(176, 156, 124, 20);
		panel_create_article.add(comboBox_article_poids);

		JComboBox comboBox_article_conditionnement = new JComboBox();
		comboBox_article_conditionnement.setBounds(23, 208, 277, 20);
		panel_create_article.add(comboBox_article_conditionnement);

		// Btn create article
		JButton btn_article_create = new JButton("Cr\u00E9er l'article");
		btn_article_create.setBounds(101, 239, 136, 23);
		panel_create_article.add(btn_article_create);

		/**
		 *  Panel table suppliers by article
		 */
		
		// Create panel_list_suppliers
		JPanel panel_list_suppliers = new JPanel();
		panel_list_suppliers.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_list_suppliers.setBackground(Color.WHITE);
		panel_list_suppliers.setBounds(898, 295, 328, 279);
		panel_articles.add(panel_list_suppliers);
		panel_list_suppliers.setLayout(null);
		
		// Label Title table 
		JLabel lbl_title_list_suppliers = new JLabel("Liste des fournisseurs de l'article s\u00E9lectionn\u00E9");
		lbl_title_list_suppliers.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_title_list_suppliers.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title_list_suppliers.setBounds(0, 0, 328, 34);
		panel_list_suppliers.add(lbl_title_list_suppliers);
		
		// Create scrollPane_list_suppliers
		JScrollPane scrollPane_list_suppliers = new JScrollPane();
		scrollPane_list_suppliers.setBounds(0, 34, 328, 245);
		panel_list_suppliers.add(scrollPane_list_suppliers);
		
		// Create table_article_suppliers
		JTable table_article_suppliers = new JTable();
		table_article_suppliers.setModel(new DefaultTableModel(
			new Object[][] {
				{"Labo&Gato", 2.85+"€"},
		        {"Kitchenware", 2.82+"€"},
		        {"Sugarcraft", 2.54+"€"},
		        {"Wenny's Store", 2.45+"€"},
		        {"Hypmark Kitchen", 2.95+"€"}
			},
			new String[] {"Fournisseur","Prix"}
		) {
			private static final long serialVersionUID = -8222166176512458254L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		// Get table_article_suppliers visible in the scrollPane
		scrollPane_list_suppliers.setColumnHeaderView(table_article_suppliers);
		scrollPane_list_suppliers.setViewportView(table_article_suppliers);

	}
}
