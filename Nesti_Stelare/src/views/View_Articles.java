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

	static JPanel panel_articles;
	private JTextField textField_article_name;
	private JTextField textField_article_poids;
	private JTable table;

	public View_Articles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		// Data Arrays
		String[] columnNames_articles = { "Nom", "Type", "Prix", "Poid", "Conditionnement", "Etat", "Stock","+","-"};
		Object[][] data_articles = { { "Boite de 6 oeufs", "Ingrédient", "2.50$", "800g", "boîte", "actif", "2","+","-" },
				{ "Paquet de farine", "Ingrédient", "1.45$", "430g", "paquet", "en attente", "4","+","-" },
				{ "Lot de 2 fourchette", "Ustensile", "4.20$", "100g", "lot", "bloqué", "1","+","-"} };
		

	    //Header de JTable 
	    String[] columns_articles_suppliers = new String[] {"Fournisseurs","Prix","+","-"};
	    //données pour JTable dans un tableau 2D
	    Object[][] data_articles_suppliers = new Object[][] {
	        {"Labo&Gato", 2.85,"+","-"},
	        {"Kitchenware", 2.80,"+","-" },
	        {"Sugarcraft", 2.50,"+","-"},
	        {"Wenny's Store", 2.45,"+","-"},
	        {"Hypmark Kitchen", 2.95,"+","-"},
	    };
		// All Panels (TabbedPane)
		panel_articles = new JPanel();
		panel_articles.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Articles", null, panel_articles, null);
		panel_articles.setLayout(null);

		// Création du ScrollPane
		JScrollPane scrollPane_articles = new JScrollPane();
		scrollPane_articles.setBounds(0, 0, 888, 585);

		// Ajout du ScrollPane à panel_articles
		panel_articles.add(scrollPane_articles);

		JTable table_article = new JTable(data_articles, columnNames_articles);
		table_article.setModel(new DefaultTableModel(
			new Object[][] {
				{"Boite de 6 oeufs", "Ingr\u00E9dient", "2.50$", "800g", "bo\u00EEte", "actif", "2", "+", "-"},
				{"Paquet de farine", "Ingr\u00E9dient", "1.45$", "430g", "paquet", "en attente", "4", "+", "-"},
				{"Lot de 2 fourchette", "Ustensile", "4.20$", "100g", "lot", "bloqu\u00E9", "1", "+", "-"},
			},
			new String[] {
				"Nom", "Type", "Prix", "Poid", "Conditionnement", "Etat", "Stock", "+", "-"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_article.getColumnModel().getColumn(0).setResizable(false);
		table_article.getColumnModel().getColumn(1).setResizable(false);
		table_article.getColumnModel().getColumn(2).setResizable(false);
		table_article.getColumnModel().getColumn(3).setResizable(false);
		table_article.getColumnModel().getColumn(3).setPreferredWidth(56);
		table_article.getColumnModel().getColumn(4).setResizable(false);
		table_article.getColumnModel().getColumn(5).setResizable(false);
		table_article.getColumnModel().getColumn(6).setResizable(false);
		table_article.getColumnModel().getColumn(7).setResizable(false);
		table_article.getColumnModel().getColumn(8).setResizable(false);

		scrollPane_articles.setViewportView(table_article);
		scrollPane_articles.setColumnHeaderView(table_article.getTableHeader());

		JPanel panel_create_article = new JPanel();
		panel_create_article.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_create_article.setBounds(898, 11, 328, 273);
		panel_create_article.setBackground(Color.WHITE);
		panel_articles.add(panel_create_article);
		panel_create_article.setLayout(null);

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

		textField_article_name = new JTextField();
		textField_article_name.setBounds(23, 59, 277, 20);
		panel_create_article.add(textField_article_name);
		textField_article_name.setColumns(10);

		JLabel lbl_article_select_product = new JLabel("S\u00E9lection du produit :");
		lbl_article_select_product.setBounds(23, 90, 277, 20);
		panel_create_article.add(lbl_article_select_product);

		JComboBox comboBox_article_product = new JComboBox();
		comboBox_article_product.setBounds(23, 109, 277, 20);
		panel_create_article.add(comboBox_article_product);

		JLabel lbl_article_poids = new JLabel("Poids :");
		lbl_article_poids.setBounds(23, 140, 46, 14);
		panel_create_article.add(lbl_article_poids);

		textField_article_poids = new JTextField();
		textField_article_poids.setBounds(23, 156, 143, 20);
		panel_create_article.add(textField_article_poids);
		textField_article_poids.setColumns(10);

		JComboBox comboBox_article_poids = new JComboBox();
		comboBox_article_poids.setBounds(176, 156, 124, 20);
		panel_create_article.add(comboBox_article_poids);

		JLabel lbl_article_conditionnement = new JLabel("Conditionnement :");
		lbl_article_conditionnement.setBounds(23, 187, 109, 20);
		panel_create_article.add(lbl_article_conditionnement);

		JComboBox comboBox_article_conditionnement = new JComboBox();
		comboBox_article_conditionnement.setBounds(23, 208, 277, 20);
		panel_create_article.add(comboBox_article_conditionnement);

		JButton btn_article_create = new JButton("Cr\u00E9er l'article");
		btn_article_create.setBounds(101, 239, 136, 23);
		panel_create_article.add(btn_article_create);

		JPanel panel_list_suppliers = new JPanel();
		panel_list_suppliers.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_list_suppliers.setBackground(Color.WHITE);
		panel_list_suppliers.setBounds(898, 295, 328, 279);
		panel_articles.add(panel_list_suppliers);
		panel_list_suppliers.setLayout(null);

		JScrollPane scrollPane_list_suppliers = new JScrollPane();
		scrollPane_list_suppliers.setBounds(0, 34, 328, 245);
		panel_list_suppliers.add(scrollPane_list_suppliers);



		JLabel lbl_title_list_suppliers = new JLabel("Liste des fournisseurs de l'article s\u00E9lectionn\u00E9");
		lbl_title_list_suppliers.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_title_list_suppliers.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title_list_suppliers.setBounds(0, 0, 328, 34);
		panel_list_suppliers.add(lbl_title_list_suppliers);
	    
	    //définir le modéle de JTable
	    DefaultTableModel model = new DefaultTableModel(data_articles_suppliers, columns_articles_suppliers);
		JTable table_article_suppliers = new JTable(model);
		scrollPane_list_suppliers.setColumnHeaderView(table_article_suppliers);
		scrollPane_list_suppliers.setViewportView(table_article_suppliers);
	    
	    //définir notre Renderer sur la colonne " "
		table_article.getColumn("+").setCellRenderer(new MyRendererAndEditor(table_article, "Ajouter"));
		table_article.getColumn("+").setCellEditor(new MyRendererAndEditor(table_article, "Ajouter"));
		
		//définir notre Renderer sur la colonne " "
		table_article.getColumn("-").setCellRenderer(new MyRendererAndEditor(table_article, "Supprimer"));
		table_article.getColumn("-").setCellEditor(new MyRendererAndEditor(table_article, "Supprimer"));
		
		//définir notre Renderer sur la colonne " "
		table_article_suppliers.getColumn("+").setCellRenderer(new MyRendererAndEditor(table_article_suppliers, "Ajouter"));
		table_article_suppliers.getColumn("+").setCellEditor(new MyRendererAndEditor(table_article_suppliers, "Ajouter"));
		
		//définir notre Renderer sur la colonne " "
		table_article_suppliers.getColumn("-").setCellRenderer(new MyRendererAndEditor(table_article_suppliers, "Supprimer"));
		table_article_suppliers.getColumn("-").setCellEditor(new MyRendererAndEditor(table_article_suppliers, "Supprimer"));

	}
}
