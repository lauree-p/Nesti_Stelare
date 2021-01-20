package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import tools.MyRendererAndEditor;

public class View_Administrators {
	
	public View_Administrators() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		/**
		 * Panels_administrators
		 */
		
		// Create panel_administrators (TabbedPane)
		JPanel panel_administrators = new JPanel();
		panel_administrators.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Administrateurs", null, panel_administrators, null);
		panel_administrators.setLayout(null);

		/**
		 *  Table admin
		 */			    
		
		// Create scrollPane_administrators
		JScrollPane scrollPane_administrators = new JScrollPane();
		scrollPane_administrators.setBounds(0, 0, 888, 585);
		// Add scrollPane_administrators to panel_administrators
		panel_administrators.add(scrollPane_administrators);
		
		// Create table_admin
		JTable table_admin = new JTable();
		table_admin.setModel(new DefaultTableModel(
			new Object[][] {
				{"Lauree","true","poussin2021"},    
				{"Stephane-cad55","false","cadeck2021"},
				{"Dubanremi","false","duban2021"}
		    },   
			new String[] {
				"Pseudo","IsSuperAdmin","Mot de passe"," ", "-"}
		) {
			private static final long serialVersionUID = 546831570763595984L;
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		// Columns Properties
		table_admin.getColumnModel().getColumn(0).setResizable(false);
		table_admin.getColumnModel().getColumn(1).setResizable(false);
		table_admin.getColumnModel().getColumn(2).setResizable(false);
		table_admin.getColumnModel().getColumn(3).setResizable(false);
		table_admin.getColumnModel().getColumn(4).setResizable(false);
	    // Add btn upload
		table_admin.getColumn(" ").setCellRenderer(new MyRendererAndEditor(table_admin, "Modifier"));
		table_admin.getColumn(" ").setCellEditor(new MyRendererAndEditor(table_admin, "Modifier"));
	    // Add btn delete
		table_admin.getColumn("-").setCellRenderer(new MyRendererAndEditor(table_admin, "Supprimer"));
		table_admin.getColumn("-").setCellEditor(new MyRendererAndEditor(table_admin, "Supprimer"));
		// Get table_admin visible in the scrollPane
		scrollPane_administrators.setViewportView(table_admin);
        scrollPane_administrators.setColumnHeaderView(table_admin.getTableHeader());
        
        /**
         *  Panel create admin
         */
        
        // Create panel_create_admin
        JPanel panel_create_admin = new JPanel();
        panel_create_admin.setBounds(898, 11, 328, 273);
        panel_create_admin.setBackground(Color.RED);
        panel_administrators.add(panel_create_admin);
        panel_create_admin.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        

	}
}
