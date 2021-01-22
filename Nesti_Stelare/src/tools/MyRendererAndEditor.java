package tools;

import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import models.Administrators;
import models.SuperAdmin;
import views.View_Administrators;

import javax.swing.event.CellEditorListener;
import java.awt.event.*;
import java.util.EventObject;

public class MyRendererAndEditor implements TableCellRenderer, TableCellEditor {
	
	private JButton btn;
	private int row;

	public MyRendererAndEditor(JTable table, String nomBtn) {
		btn = new JButton(nomBtn);
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nomBtn == "Supprimer") {
					System.out.println("Click Supprimer");
					View_Administrators.panel_admin_delete.setVisible(true);
					if (View_Administrators.confirmDelete) {
						DefaultTableModel model = (DefaultTableModel) table.getModel();
						model.removeRow(row);
						int idAdmin = Integer.parseInt(Administrators.arrayRow.get(row)[0]);
						SuperAdmin.deleteAdmin(idAdmin);
					}
					View_Administrators.confirmDelete = false;
				} 
				else if (nomBtn == "Modifier") {
					View_Administrators.panel_admin_update.setVisible(true);
					
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