package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import tools.MyRendererAndEditor;

public class View_Orders {
	
	public View_Orders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
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
 					"Nom", "Type", "Prix", "Poids", "Jour avant péremption", "Etat", "Quantité", " ","-"}
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
	}
}
