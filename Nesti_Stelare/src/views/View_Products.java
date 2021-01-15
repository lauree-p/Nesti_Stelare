package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class View_Products {
	
	static JPanel panel_products;
	
	public View_Products() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Data Arrays
	    String data_products[][]={ 
	    		{"Boite de 6 oeufs","Ingrédient","2.50$","800g","boîte","actif","2"},    
	    		{"Paquet de farine","Ingrédient","1.45$","430g","paquet","en attente","4"},
	    		{"Lot de 2 fourchette","Ustensile","4.20$","100g","lot","bloqué","1"}
                };    
	    String[] columnNames_products={"Nom","Type","Prix","Poid","Conditionnement","Etat","Stock"};
	    
	    
		// All Panels (TabbedPane)
		panel_products = new JPanel();
		panel_products.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Produits", null, panel_products, null);
		panel_products.setLayout(null);
		
	    // Création du ScrollPane
		JScrollPane scrollPane_products = new JScrollPane();
		scrollPane_products.setBounds(0, 0, 888, 585);
		
		// Ajout du ScrollPane à panel_articles
		panel_products.add(scrollPane_products);
		
		JTable table_products = new JTable(data_products,columnNames_products);
		
		scrollPane_products.setViewportView(table_products);
        scrollPane_products.setColumnHeaderView(table_products.getTableHeader());
        
        JPanel panel = new JPanel();
        panel.setBounds(898, 11, 328, 273);
        panel.setBackground(Color.RED);
        panel_products.add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.RED);
        panel_1.setBounds(898, 295, 328, 279);
        panel_products.add(panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));

	}
}
