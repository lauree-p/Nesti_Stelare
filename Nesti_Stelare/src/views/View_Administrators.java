package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.Administrators;
import tools.MyRendererAndEditor;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

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
			Administrators.readAll(),
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
        panel_create_admin.setBorder(new LineBorder(new Color(0, 0, 0)));
        panel_create_admin.setBounds(898, 11, 328, 204);
        panel_create_admin.setBackground(Color.WHITE);
        panel_administrators.add(panel_create_admin);
        panel_create_admin.setLayout(null);
        
        JLabel lbl_User_Name = new JLabel("Nom d'utilisateur");
        lbl_User_Name.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_User_Name.setBounds(20, 43, 102, 14);
        panel_create_admin.add(lbl_User_Name);
        
        JLabel lbl_Administratori = new JLabel("Ajouter un administrateur");
        lbl_Administratori.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl_Administratori.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_Administratori.setBounds(70, 11, 198, 14);
        panel_create_admin.add(lbl_Administratori);
        
        JTextField textField_User_Name = new JTextField();
        textField_User_Name.setHorizontalAlignment(SwingConstants.CENTER);
        textField_User_Name.setBounds(20, 68, 287, 20);
        panel_create_admin.add(textField_User_Name);
        textField_User_Name.setColumns(10);
        
        JLabel lbl_PassWord = new JLabel("Mot de passe");
        lbl_PassWord.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_PassWord.setBounds(10, 99, 102, 14);
        panel_create_admin.add(lbl_PassWord);
        
        JTextField textField_PassWord = new JTextField();
        textField_PassWord.setHorizontalAlignment(SwingConstants.CENTER);
        textField_PassWord.setBounds(20, 124, 287, 20);
        panel_create_admin.add(textField_PassWord);
        textField_PassWord.setColumns(10);
        
        JButton btn_Create_Administrator = new JButton("Crée un administrateur");
        btn_Create_Administrator.setBounds(70, 163, 198, 23);
        panel_create_admin.add(btn_Create_Administrator);
        

	}
}
