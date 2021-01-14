package views;



public class View_Articles {


	public View_Articles() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
	    String data_articles[][]={ 
	    		{"Boite de 6 oeufs","Ingrédient","2.50$","800g","boîte","actif","2"},    
	    		{"Paquet de farine","Ingrédient","1.45$","430g","paquet","en attente","4"},
	    		{"Lot de 2 fourchette","Ustensile","4.20$","100g","lot","bloqué","1"}
                };    
	    String[] columnNames_articles={"Nom","Type","Prix","Poid","Conditionnement","Etat","Stock"};
	    
//	    String data_admin[][]={ 
//	    		{"Lauree","true","poussin2021"},    
//	    		{"Stephane-cad55","false","cadeck2021"},
//	    		{"Dubanremi","false","duban2021"}
//                };    
//	    String[] columnNames_admin={"Pseudo","IsSuperAdmin","Mot de passe"};
//	    
//	    String data_producteurs[][]={ 
//	    		{"Le Comptoir Paysans d'Oc","Rue de Montels Église","Lattes","34970","Bernard","Tolino","04 67 55 75 79","actif"},    
//	    		{"Le Comptoir Paysans d'Oc","Rue de Montels Église","Lattes","34970","Bernard","Tolino","04 67 55 75 79","actif"},
//	    		{"Le Comptoir Paysans d'Oc","Rue de Montels Église","Lattes","34970","Bernard","Tolino","04 67 55 75 79","actif"}
//                };    
//	    String[] columnNames_producteurs={"Entreprise","Adresse","Ville","CP","Nom","Prénom","Tel","Etat"};
//	    
//	    String data_commandes[][]={ 
//	    		{"02/02/21","06/02/21","Boite de 6 oeufs","10","en attente","Le Comptoir Paysans d'Oc","Stephane-cad55"}  
//                };    
//	    String[] columnNames_commandes={"Date de la commande","Date de réception","Article","Quantité","Etat","Producteur","Administrateur",};  
		
//		frame = new JFrame();
//		frame.setResizable(false);
//		frame.setVisible(true);
//		frame.getContentPane().setBackground(new Color(46, 22, 14));
//		frame.setBounds(100, 100, 1280, 720);
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		frame.getContentPane().setLayout(null);
		
//		JPanel panel_log = new JPanel();
//		panel_log.setBackground(new Color(230, 167, 86));
//		panel_log.setBounds(0, 0, 1274, 46);
//		panel_log.setLayout(null);
//		
//		//frame.getContentPane().add(panel_log);
//		
//		JButton btn_disconnect = new JButton("Deconnexion");
//		btn_disconnect.setBounds(1124, 14, 124, 23);
//		
//		JLabel lbl_nickname = new JLabel("SuperAdministrateur01");
//		lbl_nickname.setBounds(910, 11, 204, 29);
//		lbl_nickname.setHorizontalAlignment(SwingConstants.RIGHT);
//		lbl_nickname.setForeground(Color.BLACK);
//		
//		panel_log.add(btn_disconnect);
//		panel_log.add(lbl_nickname);
		
	//	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	//	tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
	//	tabbedPane.setBounds(10, 57, 1241, 613);
		
//      frame.getContentPane().add(tabbedPane);
		
//		JPanel panel_articles = new JPanel();
//		panel_articles.setBackground(Color.YELLOW);
//		tabbedPane.addTab("New tab", null, panel_articles, null);
//		panel_articles.setLayout(null);
		
//		JScrollPane scrollPane_articles = new JScrollPane();
//		scrollPane_articles.setBounds(0, 0, 888, 585);
//		panel_articles.add(scrollPane_articles);
//		
//		table_article = new JTable(data_articles,columnNames_articles);
//		
//		scrollPane_articles.setViewportView(table_article);
//        scrollPane_articles.setColumnHeaderView(table_article.getTableHeader());
//        
//        JPanel panel = new JPanel();
//        panel.setBounds(898, 11, 328, 273);
//        panel.setBackground(Color.CYAN);
//        panel_articles.add(panel);
//        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
//        
//        JPanel panel_1 = new JPanel();
//        panel_1.setBackground(Color.CYAN);
//        panel_1.setBounds(898, 295, 328, 279);
//        panel_articles.add(panel_1);
//        panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));

	}
}
