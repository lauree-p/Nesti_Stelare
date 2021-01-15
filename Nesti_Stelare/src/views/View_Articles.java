package views;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class View_Articles {
	
	static JPanel panel_articles;
	
	public View_Articles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		// Data Arrays
	    String data_articles[][]={ 
	    		{"Boite de 6 oeufs","Ingr�dient","2.50$","800g","bo�te","actif","2"},    
	    		{"Paquet de farine","Ingr�dient","1.45$","430g","paquet","en attente","4"},
	    		{"Lot de 2 fourchette","Ustensile","4.20$","100g","lot","bloqu�","1"}
                };    
	    String[] columnNames_articles={"Nom","Type","Prix","Poid","Conditionnement","Etat","Stock"};
	    
	    
		// All Panels (TabbedPane)
		panel_articles = new JPanel();
		panel_articles.setBackground(Color.WHITE);
		View_App.tabbedPane.addTab("Articles", null, panel_articles, null);
		panel_articles.setLayout(null);
		
	    // Cr�ation du ScrollPane
		JScrollPane scrollPane_articles = new JScrollPane();
		scrollPane_articles.setBounds(0, 0, 888, 585);
		
		// Ajout du ScrollPane � panel_articles
		panel_articles.add(scrollPane_articles);
		
		JTable table_article = new JTable(data_articles,columnNames_articles);
		
		scrollPane_articles.setViewportView(table_article);
        scrollPane_articles.setColumnHeaderView(table_article.getTableHeader());
        
        JPanel panel = new JPanel();
        panel.setBounds(898, 11, 328, 273);
        panel.setBackground(Color.BLUE);
        panel_articles.add(panel);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLUE);
        panel_1.setBounds(898, 295, 328, 279);
        panel_articles.add(panel_1);
        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));

	}
}
