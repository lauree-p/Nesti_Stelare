package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class View_Administrators {
	
	static JPanel panel_administrators;
	
	public View_Administrators() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Data Arrays
	    String data_admin[][]={ 
		{"Lauree","true","poussin2021"},    
		{"Stephane-cad55","false","cadeck2021"},
		{"Dubanremi","false","duban2021"}
        };    
	    String[] columnNames_admin={"Pseudo","IsSuperAdmin","Mot de passe"};
	    
	    
		// All Panels (TabbedPane)
		panel_administrators = new JPanel();
		panel_administrators.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Administrateurs", null, panel_administrators, null);
		panel_administrators.setLayout(null);
		
	    // Création du ScrollPane
		JScrollPane scrollPane_administrators = new JScrollPane();
		scrollPane_administrators.setBounds(0, 0, 888, 585);
		
		// Ajout du ScrollPane à panel_articles
		panel_administrators.add(scrollPane_administrators);
		
		JTable table_administrators = new JTable(data_admin,columnNames_admin);
		
		scrollPane_administrators.setViewportView(table_administrators);
        scrollPane_administrators.setColumnHeaderView(table_administrators.getTableHeader());
        
        JPanel panel = new JPanel();
        panel.setBounds(898, 11, 328, 273);
        panel.setBackground(Color.GREEN);
        panel_administrators.add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.GREEN);
        panel_1.setBounds(898, 295, 328, 279);
        panel_administrators.add(panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));

	}
}
