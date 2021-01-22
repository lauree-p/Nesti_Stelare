package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import models.Administrators;
import models.SuperAdmin;
import tools.MyRendererAndEditor;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		int columnCount = table_admin.getColumnModel().getColumnCount();
		for (int i = 0; i < columnCount; i++ ) {
			table_admin.getColumnModel().getColumn(i).setResizable(false);
		}
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
        
        JLabel lbl_user_name = new JLabel("Nom d'utilisateur");
        lbl_user_name.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_user_name.setBounds(20, 43, 102, 14);
        panel_create_admin.add(lbl_user_name);
        
        JLabel lbl_administratori = new JLabel("Ajouter un administrateur");
        lbl_administratori.setFont(new Font("Tahoma", Font.BOLD, 12));
        lbl_administratori.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_administratori.setBounds(70, 11, 198, 14);
        panel_create_admin.add(lbl_administratori);
        
        JTextField textField_user_name = new JTextField();
        textField_user_name.setHorizontalAlignment(SwingConstants.CENTER);
        textField_user_name.setBounds(20, 68, 287, 20);
        panel_create_admin.add(textField_user_name);
        textField_user_name.setColumns(10);
        
        JLabel lbl_passWord = new JLabel("Mot de passe");
        lbl_passWord.setHorizontalAlignment(SwingConstants.CENTER);
        lbl_passWord.setBounds(10, 99, 102, 14);
        panel_create_admin.add(lbl_passWord);
        
        JTextField textField_passWord = new JTextField();
        textField_passWord.setHorizontalAlignment(SwingConstants.CENTER);
        textField_passWord.setBounds(20, 124, 287, 20);
        panel_create_admin.add(textField_passWord);
        textField_passWord.setColumns(10);
        
        JButton btn_create_administrator = new JButton("Crée un administrateur");
        btn_create_administrator.setBounds(70, 163, 198, 23);
        panel_create_admin.add(btn_create_administrator);
        btn_create_administrator.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                SuperAdmin.addAdmin(textField_user_name.getText(),textField_passWord.getText());
                uploadTable(table_admin);
            }
            
        });
        

	}
	
	public void uploadTable(JTable oldTable) {
		
		oldTable.setModel(new DefaultTableModel(
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
	    // Add btn upload
		oldTable.getColumn(" ").setCellRenderer(new MyRendererAndEditor(oldTable, "Modifier"));
		oldTable.getColumn(" ").setCellEditor(new MyRendererAndEditor(oldTable, "Modifier"));
	    // Add btn delete
		oldTable.getColumn("-").setCellRenderer(new MyRendererAndEditor(oldTable, "Supprimer"));
		oldTable.getColumn("-").setCellEditor(new MyRendererAndEditor(oldTable, "Supprimer"));
		
	}
}
