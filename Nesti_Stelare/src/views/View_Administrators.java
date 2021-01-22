package views;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class View_Administrators {
	
	public static JPanel panel_admin_update = new JPanel();
	public static JPanel panel_admin_delete = new JPanel();
	public static JButton btn_delete_confirm = new JButton("Confirmer");
	public static boolean confirmDelete = false;
	
	public View_Administrators() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings("serial")
	private void initialize() {
		
		/**
		 * Panels_administrators
		 */
		
		// Create panel_administrators (TabbedPane)
		JPanel panel_administrators = new JPanel();
		panel_administrators.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Administrateurs", null, panel_administrators, null);
		panel_admin_update.setVisible(false);
		panel_administrators.setLayout(null);

		/**
		 *  Table admin
		 */
		
		/**
		 *  Panel update
		 */		
		panel_admin_delete.setVisible(false);
		
		panel_admin_delete.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_admin_delete.setBackground(Color.LIGHT_GRAY);
		panel_admin_delete.setBounds(320, 200, 400, 159);
		panel_admin_delete.setLayout(null);
		panel_administrators.add(panel_admin_delete);
		
		JLabel lbl_title_delete_admin = new JLabel("Supprimer un administrateur");
		lbl_title_delete_admin.setBounds(115, 23, 182, 15);
		lbl_title_delete_admin.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_admin_delete.add(lbl_title_delete_admin);
		
		JButton btn_delete_cancel = new JButton("Annuler");
		btn_delete_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_admin_delete.setVisible(false);
			}
		});
		btn_delete_cancel.setBounds(100, 125, 89, 23);
		panel_admin_delete.add(btn_delete_cancel);
		
		JButton btn_delete_confirm = new JButton("Confirmer");
		btn_delete_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmDelete = true;
				panel_admin_delete.setVisible(false);
			}
		});
		btn_delete_confirm.setBounds(221, 125, 110, 23);
		panel_admin_delete.add(btn_delete_confirm);
		
		JLabel lblNewLabel = new JLabel("Souhaitez vous vraiment supprimer l'administrateur :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 61, 400, 14);
		panel_admin_delete.add(lblNewLabel);
		
		JLabel lblToto = new JLabel("Toto ?");
		lblToto.setHorizontalAlignment(SwingConstants.CENTER);
		lblToto.setBounds(0, 86, 400, 14);
		panel_admin_delete.add(lblToto);
		
		panel_admin_update.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_admin_update.setBackground(Color.LIGHT_GRAY);
		panel_admin_update.setBounds(362, 200, 313, 212);
		panel_admin_update.setLayout(null);
		panel_administrators.add(panel_admin_update);
		
		JLabel lbl_title_update_admin = new JLabel("Modifier un administrateur");
		lbl_title_update_admin.setBounds(68, 22, 182, 15);
		lbl_title_update_admin.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_admin_update.add(lbl_title_update_admin);
		
		JTextField textField_update_username = new JTextField();
		textField_update_username.setBounds(56, 73, 194, 20);
		panel_admin_update.add(textField_update_username);
		textField_update_username.setColumns(10);
		
		JTextField textField_update_password = new JTextField();
		textField_update_password.setColumns(10);
		textField_update_password.setBounds(56, 125, 194, 20);
		panel_admin_update.add(textField_update_password);
		
		JLabel lbl_update_username = new JLabel("Nom d'utilisateur :");
		lbl_update_username.setBounds(56, 48, 114, 14);
		panel_admin_update.add(lbl_update_username);
		
		JLabel lbl_update_password = new JLabel("Mot de passe :");
		lbl_update_password.setBounds(56, 104, 86, 14);
		panel_admin_update.add(lbl_update_password);
		
		JButton btn_update_cancel = new JButton("Annuler");
		btn_update_cancel.setBounds(51, 170, 89, 23);
		panel_admin_update.add(btn_update_cancel);
		
		btn_update_cancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	panel_admin_update.setVisible(false);
            }
            
        });
		
		JButton btn_update_update = new JButton("Modifier");
		btn_update_update.setBounds(171, 170, 89, 23);
		panel_admin_update.add(btn_update_update);
		
		btn_update_update.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	panel_admin_update.setVisible(false);
            }
            
        });
		
		// Create scrollPane_administrators
		JScrollPane scrollPane_administrators = new JScrollPane();
		scrollPane_administrators.setBounds(0, 0, 888, 585);
		// Add scrollPane_administrators to panel_administrators
		panel_administrators.add(scrollPane_administrators);
		
		// Create table_admin
		JTable table_admin = new JTable();
		String[] nameColumn =  {"Pseudo","IsSuperAdmin","Mot de passe"," ", "-"};
		table_admin.setModel(new DefaultTableModel(Administrators.readAll(),nameColumn) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, true, true
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
        
        JButton btn_create_administrator = new JButton("Créer un administrateur");
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
	
	@SuppressWarnings("serial")
	public void uploadTable(JTable oldTable) {
		String[] nameColumn =  {"Pseudo","IsSuperAdmin","Mot de passe"," ", "-"};
		oldTable.setModel(new DefaultTableModel(Administrators.readAll(),nameColumn) {
				boolean[] columnEditables = new boolean[] {
						false, false, false, true, true
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
