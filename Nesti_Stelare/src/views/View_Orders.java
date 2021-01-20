package views;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
<<<<<<< HEAD
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class View_Orders {

	static JPanel panel_orders;
	private JTextField _Number_Product;
	private JTable table;

=======
import javax.swing.table.DefaultTableModel;

import tools.MyRendererAndEditor;

public class View_Orders {
	
>>>>>>> main
	public View_Orders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
<<<<<<< HEAD

		// Data Arrays
		String data_orders[][] = { { "02/02/21", "06/02/21", "Boite de 6 oeufs", "10", "en attente",
				"Le Comptoir Paysans d'Oc", "Stephane-cad55" } };
		String[] columnNames_orders = { "Date de la commande", "Date de réception", "Article", "Quantité", "Etat",
				"Producteur", "Administrateur", };

		// Data Arrays
		String data_orders_list_orders[][] = { { "Boite de 6 oeufs", "Ingrédient" },
				{ "Paquet de farine", "Ingrédient" }, { "Lot de 2 fourchette", "Ustensile" } };
		String[] columnNames_list_orders = { "Nom", "Type" };

		// All Panels (TabbedPane)
		panel_orders = new JPanel();
		panel_orders.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Commandes", null, panel_orders, null);
		panel_orders.setLayout(null);

		// Création du ScrollPane
		JScrollPane scrollPane_orders = new JScrollPane();
		scrollPane_orders.setBounds(0, 0, 888, 585);

		// Ajout du ScrollPane à panel_articles
		panel_orders.add(scrollPane_orders);

		JTable table_orders = new JTable(data_orders, columnNames_orders);

		scrollPane_orders.setViewportView(table_orders);
		scrollPane_orders.setColumnHeaderView(table_orders.getTableHeader());

		JPanel panel = new JPanel();
		panel.setBounds(898, 11, 328, 214);
		panel.setBackground(Color.WHITE);
		panel_orders.add(panel);
		panel.setLayout(null);

		JLabel lbl_Orders = new JLabel("Ajouter un produit \u00E0 la commande");
		lbl_Orders.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_Orders.setBounds(62, 11, 220, 14);
		lbl_Orders.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl_Orders);

		JLabel lbl_Company_Name = new JLabel("S\u00E9lectionnez l'entreprise");
		lbl_Company_Name.setBounds(10, 47, 148, 14);
		panel.add(lbl_Company_Name);

		JLabel lbl_Name_Product = new JLabel("Nom du produit :");
		lbl_Name_Product.setBounds(10, 103, 176, 14);
		panel.add(lbl_Name_Product);

		JButton btn_Add_Orders = new JButton("Ajouter \u00E0 la commande");
		btn_Add_Orders.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Add_Orders.setBounds(79, 171, 191, 23);
		panel.add(btn_Add_Orders);

		JComboBox comboBox_Name_Product = new JComboBox();
		comboBox_Name_Product.setBounds(10, 128, 176, 22);
		panel.add(comboBox_Name_Product);

		_Number_Product = new JTextField();
		_Number_Product.setBounds(196, 129, 122, 20);
		panel.add(_Number_Product);
		_Number_Product.setColumns(10);

		JLabel lbl_Number_Products = new JLabel("Nombre de produits :");
		lbl_Number_Products.setBounds(196, 103, 191, 14);
		panel.add(lbl_Number_Products);

		JComboBox comboBox_Company = new JComboBox();
		comboBox_Company.setBounds(10, 72, 308, 22);
		panel.add(comboBox_Company);

		JPanel panel_List_Orders = new JPanel();
		panel_List_Orders.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_List_Orders.setBackground(Color.WHITE);
		panel_List_Orders.setBounds(898, 295, 328, 279);
		panel_orders.add(panel_List_Orders);
		panel_List_Orders.setLayout(null);

		JScrollPane scrollPane_List_Orders = new JScrollPane();
		scrollPane_List_Orders.setBounds(0, 34, 328, 184);
		panel_List_Orders.add(scrollPane_List_Orders);

		JTable table_Articles_Orders = new JTable(data_orders_list_orders, columnNames_list_orders);
		scrollPane_List_Orders.setColumnHeaderView(table_Articles_Orders);
		scrollPane_List_Orders.setViewportView(table_Articles_Orders);

		JLabel lbl_title_list_orders = new JLabel("Liste des produits de la commande");
		lbl_title_list_orders.setBounds(0, 0, 328, 34);
		lbl_title_list_orders.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_title_list_orders.setHorizontalAlignment(SwingConstants.CENTER);
		panel_List_Orders.add(lbl_title_list_orders);

		JButton btn_Add_This_Orders = new JButton("Ajouter cette commande");
		btn_Add_This_Orders.setBounds(81, 234, 182, 23);
		panel_List_Orders.add(btn_Add_This_Orders);

=======
		
		/**
		 * Panels_orders
		 */
			    
		// Create panel_orders (TabbedPane)
		JPanel panel_orders = new JPanel();
		panel_orders.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Commandes", null, panel_orders, null);
		panel_orders.setLayout(null);
		
		/**
		 *  Table orders
		 */
		
	    // Create scrollPane_orders
		JScrollPane scrollPane_orders = new JScrollPane();
		scrollPane_orders.setBounds(0, 0, 888, 286);
		
		// Add scrollPane_orders tp panel_orders
		panel_orders.add(scrollPane_orders);
		
		// Create table_orders
		JTable table_orders = new JTable();
	    table_orders.setModel(new DefaultTableModel(
			new Object[][] {
				{"18/02/21","22/02/21",50+"€", "en attente", "Sugarcraft", "Stephane-cad55"," ", "-"},
				{"18/02/21","22/02/21", 50+"€","en attente", "Sugarcraft", "Stephane-cad55"," ", "-"},
				{"18/02/21","22/02/21", 50+"€","en attente", "Sugarcraft", "Stephane-cad55"," ", "-"},
				{"18/02/21","22/02/21", 50+"€","en attente", "Sugarcraft", "Stephane-cad55"," ", "-"},
				{"18/02/21","22/02/21", 50+"€","en attente", "Sugarcraft", "Stephane-cad55"," ", "-"}
			},
			new String[] {
				"Date de la commande", "Date de réception", "Prix Total","Etat", "Producteur", "Administrateur"," ", "-"}
		) {
			private static final long serialVersionUID = -779283527594587689L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false,false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		// Columns Properties
		table_orders.getColumnModel().getColumn(0).setResizable(false);
		table_orders.getColumnModel().getColumn(1).setResizable(false);
		table_orders.getColumnModel().getColumn(2).setResizable(false);
		table_orders.getColumnModel().getColumn(3).setResizable(false);
		table_orders.getColumnModel().getColumn(4).setResizable(false);
		table_orders.getColumnModel().getColumn(5).setResizable(false);
		table_orders.getColumnModel().getColumn(6).setResizable(false);
		table_orders.getColumnModel().getColumn(7).setResizable(false);
		// Add btn upload
		table_orders.getColumn(" ").setCellRenderer(new MyRendererAndEditor(table_orders, "Modifier"));
		table_orders.getColumn(" ").setCellEditor(new MyRendererAndEditor(table_orders, "Modifier"));
		// Add btn delete
		table_orders.getColumn("-").setCellRenderer(new MyRendererAndEditor(table_orders, "Supprimer"));
		table_orders.getColumn("-").setCellEditor(new MyRendererAndEditor(table_orders, "Supprimer"));
		// Get table_orders visible in the scrollPane_orders
		scrollPane_orders.setViewportView(table_orders);
        scrollPane_orders.setColumnHeaderView(table_orders.getTableHeader());
        
		/**
		 *  Table articles by order  
		 */
        
        JScrollPane scrollPane_orders_articles = new JScrollPane();
        scrollPane_orders_articles.setBounds(0, 297, 888, 288);
        panel_orders.add(scrollPane_orders_articles);
        
        // Create table_suppliers
 		JTable table_orders_articles = new JTable();
 	    table_orders_articles.setModel(new DefaultTableModel(
 	    		new Object[][] {
 					{"Boite de 6 oeufs", "Ingr\u00E9dient", 2.52+"€", "800g",25, "actif", "2", " ","-"},
 					{"Paquet de farine", "Ingr\u00E9dient", 1.45+"€", "430g",25, "en attente", "4", " ","-"},
 					{"Lot de 2 fourchette", "Ustensile", 4.24+"€", "100g",null, "bloqu\u00E9", "1", " ","-"},
 				},
 				new String[] {
 					"Nom", "Type", "Prix", "Poids", "Jour avant péremption", "Etat", "Stock", " ","-"}
 		) {
			private static final long serialVersionUID = -8814775745908591959L;
			boolean[] columnEditables = new boolean[] {
 				false, false, false, false, false, false, false, false, false
 			};
 			public boolean isCellEditable(int row, int column) {
 				return columnEditables[column];
 			}
 		});
 	    // Columns Properties
 		table_orders_articles.getColumnModel().getColumn(0).setResizable(false);
 		table_orders_articles.getColumnModel().getColumn(1).setResizable(false);
 		table_orders_articles.getColumnModel().getColumn(2).setResizable(false);
 		table_orders_articles.getColumnModel().getColumn(3).setResizable(false);
 		table_orders_articles.getColumnModel().getColumn(4).setResizable(false);
 		table_orders_articles.getColumnModel().getColumn(5).setResizable(false);
 		table_orders_articles.getColumnModel().getColumn(6).setResizable(false);
 		table_orders_articles.getColumnModel().getColumn(7).setResizable(false);
 		table_orders_articles.getColumnModel().getColumn(8).setResizable(false);
 		// Add btn upload
 		table_orders_articles.getColumn(" ").setCellRenderer(new MyRendererAndEditor(table_orders, "Modifier"));
 		table_orders_articles.getColumn(" ").setCellEditor(new MyRendererAndEditor(table_orders, "Modifier"));
 		// Add btn delete
 		table_orders_articles.getColumn("-").setCellRenderer(new MyRendererAndEditor(table_orders, "Supprimer"));
 		table_orders_articles.getColumn("-").setCellEditor(new MyRendererAndEditor(table_orders, "Supprimer"));
 		// Get table_orders_articles visible in the scrollPane_orders_articles
 		scrollPane_orders_articles.setViewportView(table_orders_articles);
 		scrollPane_orders_articles.setColumnHeaderView(table_orders_articles.getTableHeader());
 		
		/**
		 *  Panel add new order
		 */
        
        JPanel panel = new JPanel();
        panel.setBounds(898, 11, 328, 273);
        panel.setBackground(Color.RED);
        panel_orders.add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        
		/**
		 *  Panel articles by order
		 */
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.RED);
        panel_1.setBounds(898, 295, 328, 279);
        panel_orders.add(panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
>>>>>>> main
	}
}
