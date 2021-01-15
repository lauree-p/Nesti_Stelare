package views;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class View_Suppliers {
	
	static JPanel panel_suppliers;
	
	public View_Suppliers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Data Arrays
		String data_suppliers[][]={
				{"Le Comptoir Paysans d'Oc","Rue de Montels Église","Lattes","34970","Bernard","Tolino","04 67 55 75 79","actif"},    
	    		{"Le Comptoir Paysans d'Oc","Rue de Montels Église","Lattes","34970","Bernard","Tolino","04 67 55 75 79","actif"},
	    		{"Le Comptoir Paysans d'Oc","Rue de Montels Église","Lattes","34970","Bernard","Tolino","04 67 55 75 79","actif"}
	    		};    
		String[] columnNames_suppliers={"Entreprise","Adresse","Ville","CP","Nom","Prénom","Tel","Etat"};
	    
	    
		// All Panels (TabbedPane)
		panel_suppliers = new JPanel();
		panel_suppliers.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Fournisseurs", null, panel_suppliers, null);
		panel_suppliers.setLayout(null);
		
	    // Création du ScrollPane
		JScrollPane scrollPane_suppliers = new JScrollPane();
		scrollPane_suppliers.setBounds(0, 0, 888, 585);
		
		// Ajout du ScrollPane à panel_articles
		panel_suppliers.add(scrollPane_suppliers);
		
		JTable table_suppliers = new JTable(data_suppliers,columnNames_suppliers);
		
		scrollPane_suppliers.setViewportView(table_suppliers);
        scrollPane_suppliers.setColumnHeaderView(table_suppliers.getTableHeader());
        
        JPanel panel = new JPanel();
        panel.setBounds(898, 11, 328, 273);
        panel.setBackground(Color.WHITE);
        panel_suppliers.add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(898, 295, 328, 279);
        panel_suppliers.add(panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));

	}

}
