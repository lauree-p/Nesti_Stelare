package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class View_MyAccount {
	
	static JPanel panel_myAccount;
	
	public View_MyAccount() {
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
		panel_myAccount = new JPanel();
		panel_myAccount.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Mon compte", null, panel_myAccount, null);
		panel_myAccount.setLayout(null);
		
	    // Création du ScrollPane
		JScrollPane scrollPane_myAccount = new JScrollPane();
		scrollPane_myAccount.setBounds(0, 0, 888, 585);
		
		// Ajout du ScrollPane à panel_articles
		panel_myAccount.add(scrollPane_myAccount);
		
		JTable table_myAccount = new JTable(data_admin,columnNames_admin);
		
		scrollPane_myAccount.setViewportView(table_myAccount);
        scrollPane_myAccount.setColumnHeaderView(table_myAccount.getTableHeader());
        
        JPanel panel = new JPanel();
        panel.setBounds(898, 11, 328, 273);
        panel.setBackground(Color.WHITE);
        panel_myAccount.add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setBounds(898, 295, 328, 279);
        panel_myAccount.add(panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));

	}
}
