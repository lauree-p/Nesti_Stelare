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
	    
		// Panel_myAccount (TabbedPane)
		panel_myAccount = new JPanel();
		panel_myAccount.setBackground(Color.RED);
		View_App.tabbedPane.addTab("Mon compte", null, panel_myAccount, null);
		panel_myAccount.setLayout(null);

	}
}
