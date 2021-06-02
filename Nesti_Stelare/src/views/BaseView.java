package views;

import javax.swing.JPanel;
import javax.swing.JTable;

import entity.BaseEntity;

public abstract class  BaseView {
	
	public JPanel panel_update;
	public JPanel panel_delete;
	public JPanel panel_confirm_delete;
	public boolean confirmDelete = false;
	
	/**
	 * 
	 */
	public BaseView() {
		super();
		this.panel_update = new JPanel();
		this.panel_delete = new JPanel();
		this.panel_confirm_delete = new JPanel();
	}
	
	/**
	 * @return the panel_update
	 */
	public JPanel getPanel_update() {
		return panel_update;
	}
	/**
	 * @param panel_update the panel_update to set
	 */
	public void setPanel_update(JPanel panel_update) {
		this.panel_update = panel_update;
	}

	/**
	 * @return the panel_delete
	 */
	public JPanel getPanel_delete() {
		return panel_delete;
	}
	/**
	 * @param panel_delete the panel_delete to set
	 */
	public void setPanel_delete(JPanel panel_delete) {
		this.panel_delete = panel_delete;
	}
	
	
	/**
	 * @return the panel_confirm_delete
	 */
	public JPanel getPanel_confirm_delete() {
		return panel_confirm_delete;
	}
	/**
	 * @param panel_confirm_delete the panel_confirm_delete to set
	 */
	public void setPanel_confirm_delete(JPanel panel_confirm_delete) {
		this.panel_confirm_delete = panel_confirm_delete;
	}
	
	public abstract void loadDataInPanelUpdate(JTable table, int row);
	
	public abstract void loadDataInPanelDelete(JTable table, int row);

}
