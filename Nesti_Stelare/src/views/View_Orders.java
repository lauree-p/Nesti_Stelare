package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class View_Orders {
	
	static JPanel panel_orders;
	
	public View_Orders() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Data Arrays
		String data_orders[][]={ 
	    		{"02/02/21","06/02/21","Boite de 6 oeufs","10","en attente","Le Comptoir Paysans d'Oc","Stephane-cad55"}  
                };    
	    String[] columnNames_orders={"Date de la commande","Date de réception","Article","Quantité","Etat","Producteur","Administrateur",};
	    
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
		
		JTable table_orders = new JTable(data_orders,columnNames_orders);
		
		scrollPane_orders.setViewportView(table_orders);
        scrollPane_orders.setColumnHeaderView(table_orders.getTableHeader());
        
        JPanel panel = new JPanel();
        panel.setBounds(898, 11, 328, 273);
        panel.setBackground(Color.ORANGE);
        panel_orders.add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.ORANGE);
        panel_1.setBounds(898, 295, 328, 279);
        panel_orders.add(panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));

	}
}
