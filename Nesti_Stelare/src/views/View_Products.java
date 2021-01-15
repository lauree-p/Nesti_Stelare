package views;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

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
		String data_products[][] = { { "oeuf", "Ingrédient", "poussin2021" }, { "farine", "Ingrédient", "cadeck2021" },
				{ "fourchette", "Ustensile", "duban2021" } };
		String[] columnNames_products = { "Nom", "Type", "Administrateur qui a rentré le produit" };

		// All Panels (TabbedPane)
		panel_products = new JPanel();
		panel_products.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Produits", null, panel_products, null);
		panel_products.setLayout(null);

		// Création du ScrollPane
		JScrollPane scrollPane_products = new JScrollPane();
		scrollPane_products.setBounds(0, 0, 708, 585);

		// Ajout du ScrollPane à panel_articles
		panel_products.add(scrollPane_products);

		JTable table_products = new JTable(data_products, columnNames_products);

		scrollPane_products.setViewportView(table_products);
		scrollPane_products.setColumnHeaderView(table_products.getTableHeader());

		JPanel panel = new JPanel();
		panel.setBounds(812, 11, 328, 247);
		panel.setBackground(Color.WHITE);
		panel_products.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Type = new JLabel("Type de produits :");
		lbl_Type.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Type.setBounds(0, 53, 129, 14);
		panel.add(lbl_Type);

		JLabel lbl_Products_List = new JLabel("Liste des produits");
		lbl_Products_List.setBounds(111, 11, 110, 15);
		lbl_Products_List.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_Products_List.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbl_Products_List);
		
		JComboBox comboBox_Type = new JComboBox();
		comboBox_Type.setBounds(19, 78, 136, 22);
		panel.add(comboBox_Type);
		
		JLabel lbl_Name_Products = new JLabel("Nom du produit : ");
		lbl_Name_Products.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Name_Products.setBounds(0, 121, 129, 14);
		panel.add(lbl_Name_Products);
		
		JComboBox comboBox_Name = new JComboBox();
		comboBox_Name.setBounds(19, 146, 136, 22);
		panel.add(comboBox_Name);
		
		JButton btn_Add_Products = new JButton("Ajouter un produit");
		btn_Add_Products.setBounds(98, 200, 145, 23);
		panel.add(btn_Add_Products);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(812, 269, 328, 110);
		panel_products.add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox _Administrators = new JComboBox();
		_Administrators.setBounds(33, 49, 122, 22);
		panel_1.add(_Administrators);
		
		JLabel lbl_Administrators = new JLabel("Adminstrateurs");
		lbl_Administrators.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_Administrators.setBounds(100, 11, 128, 14);
		lbl_Administrators.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lbl_Administrators);

	}
}
