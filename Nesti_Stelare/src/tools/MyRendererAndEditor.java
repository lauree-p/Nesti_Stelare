package tools;

import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import entity.AdminEntity;
import entity.BaseEntity;
import models.Administrators;
import models.SuperAdmin;
import views.BaseView;
import views.View_Administrators;

import javax.swing.event.CellEditorListener;
import java.awt.event.*;
import java.util.EventObject;

public class MyRendererAndEditor implements TableCellRenderer, TableCellEditor {
	
	private JButton btn;
	private int row;

	public MyRendererAndEditor(JTable table, String nomBtn, BaseView baseview) {
		btn = new JButton(nomBtn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(row);
				if (nomBtn.equals("Supprimer")) {
					System.out.println("Click Supprimer");
					baseview.panel_delete.setVisible(true);
					if (baseview.confirmDelete) {
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.removeRow(row);
						int idAdmin = Integer.parseInt(Administrators.arrayRow.get(row)[0]);
						SuperAdmin.deleteAdmin(idAdmin);
					}
					baseview.confirmDelete = false;
				} 
				else if (nomBtn.equals("Modifier")) {
					baseview.loadDataInPanelUpdate(table, row);
					baseview.panel_update.setVisible(true);
				}
				
			}
		});
	}

	@Override
	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {
		return btn;
	}

	@Override
	public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
		this.row = row;
		return btn;
	}

	@Override
	public Object getCellEditorValue() {
		return true;
	}

	@Override
	public boolean isCellEditable(EventObject anEvent) {
		return true;
	}

	@Override
	public boolean shouldSelectCell(EventObject anEvent) {
		return true;
	}

	@Override
	public boolean stopCellEditing() {
		return true;
	}

	@Override
	public void cancelCellEditing() {
	}

	@Override
	public void addCellEditorListener(CellEditorListener l) {
	}

	@Override
	public void removeCellEditorListener(CellEditorListener l) {
	}
}