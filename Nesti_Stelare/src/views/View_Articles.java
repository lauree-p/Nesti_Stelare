package views;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableModel;
import entity.AdminEntity;
import entity.ArticleEntity;
import models.Article;
import tools.MyRendererAndEditor; 

public class View_Articles extends BaseView {
	
	private JTextField textField_update_name = new JTextField();
	private JTextField textField_update_password = new JTextField();
	private JLabel lbl_name_delete = new JLabel();

	public View_Articles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		/**
		 * Panels_articles
		 */
		
		// Create panels_articles (TabbedPane)
		JPanel panel_articles = new JPanel();
		panel_articles.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Articles", null, panel_articles, null);
		panel_update.setVisible(false);
		panel_articles.setLayout(null);
		

		/**
		 *  Panel delete
		 */		
		panel_delete.setVisible(false);
		panel_delete.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_delete.setBackground(Color.LIGHT_GRAY);
		panel_delete.setBounds(320, 200, 400, 159);
		panel_delete.setLayout(null);
		panel_articles.add(panel_delete);
		
		JLabel lbl_title_delete_admin = new JLabel("Supprimer un administrateur");
		lbl_title_delete_admin.setBounds(115, 23, 182, 15);
		lbl_title_delete_admin.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_delete.add(lbl_title_delete_admin);
		
		JButton btn_delete_cancel = new JButton("Annuler");
		btn_delete_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_delete.setVisible(false);
			}
		});
		btn_delete_cancel.setBounds(100, 125, 89, 23);
		panel_delete.add(btn_delete_cancel);
		
		JButton btn_delete_confirm = new JButton("Confirmer");
		btn_delete_confirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				confirmDelete = true;
				panel_delete.setVisible(false);
			}
		});
		btn_delete_confirm.setBounds(221, 125, 110, 23);
		panel_delete.add(btn_delete_confirm);
		
		JLabel lbl_confirm_delete = new JLabel("Souhaitez vous vraiment supprimer l'administrateur :");
		lbl_confirm_delete.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_confirm_delete.setBounds(0, 61, 400, 14);
		panel_delete.add(lbl_confirm_delete);
		
		lbl_name_delete.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_name_delete.setBounds(0, 86, 400, 14);
		panel_delete.add(lbl_name_delete);
		
		panel_update.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_update.setBackground(Color.LIGHT_GRAY);
		panel_update.setBounds(362, 200, 313, 212);
		panel_update.setLayout(null);
		panel_articles.add(panel_update);
		
		JLabel lbl_title_update_admin = new JLabel("Modifier un administrateur");
		lbl_title_update_admin.setBounds(68, 22, 182, 15);
		lbl_title_update_admin.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_update.add(lbl_title_update_admin);
		
		textField_update_name.setBounds(56, 73, 194, 20);
		panel_update.add(textField_update_name);
		textField_update_name.setColumns(10);
		
		
		textField_update_password.setColumns(10);
		textField_update_password.setBounds(56, 125, 194, 20);
		panel_update.add(textField_update_password);
		
		JLabel lbl_update_username = new JLabel("Nom d'utilisateur :");
		lbl_update_username.setBounds(56, 48, 114, 14);
		panel_update.add(lbl_update_username);
		
		JLabel lbl_update_password = new JLabel("Mot de passe :");
		lbl_update_password.setBounds(56, 104, 86, 14);
		panel_update.add(lbl_update_password);
		
		JButton btn_update_cancel = new JButton("Annuler");
		btn_update_cancel.setBounds(51, 170, 89, 23);
		panel_update.add(btn_update_cancel);
		
		btn_update_cancel.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	panel_update.setVisible(false);
            }
            
        });
		
		JButton btn_update_update = new JButton("Modifier");
		btn_update_update.setBounds(171, 170, 89, 23);
		panel_update.add(btn_update_update);
		
		btn_update_update.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	panel_update.setVisible(false);
            }
            
        });
		
		// Create scrollPane_articles
		JScrollPane scrollPane_articles = new JScrollPane();
		scrollPane_articles.setBounds(0, 0, 888, 585);
		// Add scrollPane_articles to panel_articles
		panel_articles.add(scrollPane_articles);
		
		/**
		 *  Table article
		 */
		
		
		// Create table_article
		JTable table_article = new JTable();
		String[] nameColumn =  {"Nom", "Type", "Prix", "Poids", "Etat", "Stock", " ", "-"};
		table_article.setModel(new DefaultTableModel(Article.readAll(),nameColumn) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		int columnCount = table_article.getColumnModel().getColumnCount();
		for (int i = 0; i < columnCount; i++ ) {
			table_article.getColumnModel().getColumn(i).setResizable(false);
		}
		
		// Add btn upload
		table_article.getColumn(" ").setCellRenderer(new MyRendererAndEditor(table_article, "Modifier", this));
		table_article.getColumn(" ").setCellEditor(new MyRendererAndEditor(table_article, "Modifier", this));
	    // Add btn delete
		table_article.getColumn("-").setCellRenderer(new MyRendererAndEditor(table_article, "Supprimer", this));
		table_article.getColumn("-").setCellEditor(new MyRendererAndEditor(table_article, "Supprimer", this));
		
		scrollPane_articles.setViewportView(table_article);
		scrollPane_articles.setColumnHeaderView(table_article.getTableHeader());
		//article.setType(table_article.getModel().getValueAt(i, 1).toString());
		//article.setPrice(Double.parseDouble((String) table_article.getModel().getValueAt(i, 2)));
		//article.setWeight(Double.parseDouble((String) table_article.getModel().getValueAt(i, 3)));
		//article.setState(table_article.getModel().getValueAt(i, 4).toString());
		//article.setStock(Integer.parseInt((String) table_article.getModel().getValueAt(i, 5)));

		/**
		 *  Panel create new article
		 */
		
		// Create panel_create_article
		JPanel panel_create_article = new JPanel();
		panel_create_article.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_create_article.setBounds(898, 11, 328, 238);
		panel_create_article.setBackground(Color.WHITE);
		panel_articles.add(panel_create_article);
		panel_create_article.setLayout(null);
		
		// Labels
		JLabel lbl_article_title = new JLabel("Créer un nouvel article");
		lbl_article_title.setForeground(Color.BLACK);
		lbl_article_title.setBackground(Color.LIGHT_GRAY);
		lbl_article_title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_article_title.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_article_title.setBounds(0, 0, 328, 35);
		panel_create_article.add(lbl_article_title);

		JLabel lbl_article_name = new JLabel("Nom de l'article :");
		lbl_article_name.setBounds(23, 44, 277, 14);
		panel_create_article.add(lbl_article_name);
		
		JLabel lbl_article_poids = new JLabel("Poids :");
		lbl_article_poids.setBounds(23, 140, 46, 14);
		panel_create_article.add(lbl_article_poids);
		
		JLabel lbl_article_select_product = new JLabel("Sélection du produit :");
		lbl_article_select_product.setBounds(23, 90, 277, 20);
		panel_create_article.add(lbl_article_select_product);
		
		// TextField
		JTextField textField_article_name = new JTextField();
		textField_article_name.setBounds(23, 59, 277, 20);
		panel_create_article.add(textField_article_name);
		textField_article_name.setColumns(10);

		JTextField textField_article_poids = new JTextField();
		textField_article_poids.setBounds(23, 156, 143, 20);
		panel_create_article.add(textField_article_poids);
		textField_article_poids.setColumns(10);

		// ComboBox
		JComboBox comboBox_article_product = new JComboBox();
		comboBox_article_product.setBounds(23, 109, 277, 20);
		panel_create_article.add(comboBox_article_product);

		JComboBox comboBox_article_poids = new JComboBox();
		comboBox_article_poids.setBounds(176, 156, 124, 20);
		panel_create_article.add(comboBox_article_poids);

		// Btn create article
		JButton btn_article_create = new JButton("Créer l'article");
		btn_article_create.setBounds(101, 198, 136, 23);
		panel_create_article.add(btn_article_create);

		/**
		 *  Panel table suppliers by article
		 */
		
		// Create panel_list_suppliers
		JPanel panel_list_suppliers = new JPanel();
		panel_list_suppliers.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_list_suppliers.setBackground(Color.WHITE);
		panel_list_suppliers.setBounds(898, 295, 328, 279);
		panel_articles.add(panel_list_suppliers);
		panel_list_suppliers.setLayout(null);
		
		// Label Title table 
		JLabel lbl_title_list_suppliers = new JLabel("Liste des fournisseurs de l'article sélectionné");
		lbl_title_list_suppliers.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_title_list_suppliers.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_title_list_suppliers.setBounds(0, 0, 328, 34);
		panel_list_suppliers.add(lbl_title_list_suppliers);
		
		// Create scrollPane_list_suppliers
		JScrollPane scrollPane_list_suppliers = new JScrollPane();
		scrollPane_list_suppliers.setBounds(0, 34, 328, 245);
		panel_list_suppliers.add(scrollPane_list_suppliers);
		
		// Create table_article_suppliers
		JTable table_article_suppliers = new JTable();
		table_article_suppliers.setModel(new DefaultTableModel(
			new Object[][] {
				{"Labo&Gato", 2.85+"€"},
		        {"Kitchenware", 2.82+"€"},
		        {"Sugarcraft", 2.54+"€"},
		        {"Wenny's Store", 2.45+"€"},
		        {"Hypmark Kitchen", 2.95+"€"}
			},
			new String[] {"Fournisseur","Prix"}
		) {
			private static final long serialVersionUID = -8222166176512458254L;
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		// Get table_article_suppliers visible in the scrollPane
		scrollPane_list_suppliers.setColumnHeaderView(table_article_suppliers);
		scrollPane_list_suppliers.setViewportView(table_article_suppliers);

	}

	@Override
	public void loadDataInPanelUpdate(JTable table, int row) {
		ArticleEntity article = new ArticleEntity();
		article.setName(table.getModel().getValueAt(row, 0).toString());
		//article.setType(table.getModel().getValueAt(row, 1).toString());
		//article.setPrice(Double.parseDouble((String) table.getModel().getValueAt(row, 2)));
		//article.setWeight(Double.parseDouble((String) table.getModel().getValueAt(row, 3)));
		//article.setState(table.getModel().getValueAt(row, 4).toString());
		//article.setStock(Integer.parseInt((String) table.getModel().getValueAt(row, 5)));
		this.textField_update_name.setText(article.getName());
	}
	
	@Override
	public void loadDataInPanelDelete(JTable table, int row) {
		AdminEntity admin = new AdminEntity();
		admin.setPseudo(table.getModel().getValueAt(row, 0).toString());
		this.lbl_name_delete.setText(admin.getPseudo());
	}
}
