package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
<<<<<<< HEAD
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class View_Products {

	static JPanel panel_products;

=======
import javax.swing.table.DefaultTableModel;

import tools.MyRendererAndEditor;

public class View_Products {
	
>>>>>>> main
	public View_Products() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
<<<<<<< HEAD

		// Data Arrays
		String data_products[][] = { { "oeuf", "Ingrédient", "poussin2021" }, { "farine", "Ingrédient", "cadeck2021" },
				{ "fourchette", "Ustensile", "duban2021" } };
		String[] columnNames_products = { "Nom", "Type", "Administrateur qui a rentré le produit" };

		// All Panels (TabbedPane)
		panel_products = new JPanel();
		panel_products.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Produits", null, panel_products, null);
		panel_products.setLayout(null);

		// Création du ScrollPane
		JScrollPane scrollPane_products = new JScrollPane();
		scrollPane_products.setBounds(0, 0, 708, 585);

		// Ajout du ScrollPane à panel_articles
		panel_products.add(scrollPane_products);

		JTable table_products = new JTable(data_products, columnNames_products);

		scrollPane_products.setViewportView(table_products);
		scrollPane_products.setColumnHeaderView(table_products.getTableHeader());

		JPanel panel = new JPanel();
		panel.setBounds(812, 11, 328, 247);
		panel.setBackground(Color.WHITE);
		panel_products.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Type = new JLabel("Type de produits :");
		lbl_Type.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Type.setBounds(0, 53, 129, 14);
		panel.add(lbl_Type);

		JLabel lbl_Products_List = new JLabel("Liste des produits");
		lbl_Products_List.setBounds(111, 11, 110, 15);
		lbl_Products_List.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_Products_List.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl_Products_List);
		
		JComboBox comboBox_Type = new JComboBox();
		comboBox_Type.setBounds(19, 78, 136, 22);
		panel.add(comboBox_Type);
		
		JLabel lbl_Name_Products = new JLabel("Nom du produit : ");
		lbl_Name_Products.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Name_Products.setBounds(0, 121, 129, 14);
		panel.add(lbl_Name_Products);
		
		JComboBox comboBox_Name = new JComboBox();
		comboBox_Name.setBounds(19, 146, 136, 22);
		panel.add(comboBox_Name);
		
		JButton btn_Add_Products = new JButton("Ajouter un produit");
		btn_Add_Products.setBounds(98, 200, 145, 23);
		panel.add(btn_Add_Products);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(812, 269, 328, 110);
		panel_products.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox _Administrators = new JComboBox();
		_Administrators.setBounds(33, 49, 122, 22);
		panel_1.add(_Administrators);
		
		JLabel lbl_Administrators = new JLabel("Adminstrateurs");
		lbl_Administrators.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_Administrators.setBounds(100, 11, 128, 14);
		lbl_Administrators.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lbl_Administrators);

=======
		
		/**
		 * Panels_products
		 */
		
		// Create panel_products (TabbedPane)
		JPanel panel_products = new JPanel();
		panel_products.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Produits", null, panel_products, null);
		panel_products.setLayout(null);
		
		/**
		 *  Table article
		 */
		
	    // Create scrollPane_products_ingredients
		JScrollPane scrollPane_products_ingredients = new JScrollPane();
		scrollPane_products_ingredients.setBounds(0, 0, 888, 284);
		// Add scrollPane_products_ingredients to panel_articles
		panel_products.add(scrollPane_products_ingredients);
		// Create table_products_ingredients
		JTable table_products_ingredients = new JTable();
	    table_products_ingredients.setModel(new DefaultTableModel(
			new Object[][] {
				{"Oeuf",24,2," ", "-"},
				{"Farine", 56,2," ", "-"},
				{"Sucre", 58,2," ", "-"},
				{"Chocolat", 120,2," ", "-"}
			},
			new String[] {
				"Nom ingredient", "Jour avant péremption","Nombre d'articles correspondant"," ", "-"}
		) {
			private static final long serialVersionUID = 6100160127192405992L;
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
		});
			
	    // Columns Properties
		table_products_ingredients.getColumnModel().getColumn(0).setResizable(false);
		table_products_ingredients.getColumnModel().getColumn(1).setResizable(false);
		table_products_ingredients.getColumnModel().getColumn(2).setResizable(false);
		table_products_ingredients.getColumnModel().getColumn(3).setResizable(false);
		 // Add btn upload
		table_products_ingredients.getColumn(" ").setCellRenderer(new MyRendererAndEditor(table_products_ingredients, "Modifier"));
		table_products_ingredients.getColumn(" ").setCellEditor(new MyRendererAndEditor(table_products_ingredients, "Modifier"));
		 // Add btn delete
		table_products_ingredients.getColumn("-").setCellRenderer(new MyRendererAndEditor(table_products_ingredients, "Supprimer"));
		table_products_ingredients.getColumn("-").setCellEditor(new MyRendererAndEditor(table_products_ingredients, "Supprimer"));
		// Get table_article visible in the scrollPane_articles
		scrollPane_products_ingredients.setViewportView(table_products_ingredients);
        scrollPane_products_ingredients.setColumnHeaderView(table_products_ingredients.getTableHeader());
        
		/**
		 *  Table article
		 */
        
        // Create scrollPane_products_utensils
        JScrollPane scrollPane_products_utensils = new JScrollPane();
        scrollPane_products_utensils.setBounds(0, 295, 888, 290);
        panel_products.add(scrollPane_products_utensils);
        
        // Create table_products_utensils
		JTable table_products_utensils = new JTable();
	    table_products_utensils.setModel(new DefaultTableModel(
			new Object[][] {
				{"Fouet",2," ","-"},
				{"Fourchette",2," ", "-"},
				{"Batteur",2," ", "-"},
				{"Rape a chocolat",2," ", "-"}
			},
			new String[] {
				"Nom ustensile","Nombre d'articles correspondant"," ", "-"}
		) {
			private static final long serialVersionUID = -1698236882141505675L;
				boolean[] columnEditables = new boolean[] {
					false, false, false, false
				};
				public boolean isCellEditable(int row, int column) {
					return columnEditables[column];
				}
		});
	    // Columns Properties
		table_products_utensils.getColumnModel().getColumn(0).setResizable(false);
		table_products_utensils.getColumnModel().getColumn(1).setResizable(false);
		table_products_utensils.getColumnModel().getColumn(2).setResizable(false);
		table_products_utensils.getColumnModel().getColumn(3).setResizable(false);
		// Add btn upload
		table_products_utensils.getColumn(" ").setCellRenderer(new MyRendererAndEditor(table_products_utensils, "Modifier"));
		table_products_utensils.getColumn(" ").setCellEditor(new MyRendererAndEditor(table_products_utensils, "Modifier"));
		// Add btn delete
		table_products_utensils.getColumn("-").setCellRenderer(new MyRendererAndEditor(table_products_utensils, "Supprimer"));
		table_products_utensils.getColumn("-").setCellEditor(new MyRendererAndEditor(table_products_utensils, "Supprimer"));
		// Get table_products_utensils visible in the scrollPane_products_utensils
		scrollPane_products_utensils.setViewportView(table_products_utensils);
		scrollPane_products_utensils.setColumnHeaderView(table_products_utensils.getTableHeader());
		
		/**
		 *  Panel create new product
		 */
		
		// Create panel_create_product
		JPanel panel_create_product = new JPanel();
		panel_create_product.setBounds(898, 11, 328, 273);
		panel_create_product.setBackground(Color.RED);
        panel_products.add(panel_create_product);
        panel_create_product.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        
>>>>>>> main
	}
}
