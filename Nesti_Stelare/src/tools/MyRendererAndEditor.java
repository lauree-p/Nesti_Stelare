package tools;

import java.awt.Component;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

import entity.AdminEntity;
import entity.BaseEntity;
import models.Administrators;
import models.Article;
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
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				if (nomBtn.equals("Supprimer")) {
					String elementAsupprimer = table.getModel().getValueAt(row, 0).toString();
					int confirmationValue = JOptionPane.showConfirmDialog(null,
							"voulez vous vraiment supprimer" + elementAsupprimer, "suppression",
							JOptionPane.WARNING_MESSAGE);

					if (confirmationValue == 0) {

						if (baseview.getClass().getName() == "views.View_Administrators") {
							int idAdmin = Integer.parseInt(Administrators.arrayRow.get(row)[0]);
							if (SuperAdmin.deleteAdmin(idAdmin)) {
								model.removeRow(row);
							} else {
								JOptionPane.showMessageDialog(null,
										"Suppression impossible, l'administrateur est lié à un autre élément");
							}
						}
//						if (baseview.toString() == "View_Administrators") {
//							int idArticle = Integer.parseInt(Article.arrayRow.get(row)[0]);
//							if (SuperAdmin.deleteAdmin(idAdmin)) {
//								model.removeRow(row);
//							}
						// }

					}
					// baseview.confirmDelete = false;
				} else if (nomBtn.equals("Modifier")) {
					if (baseview.getClass().getName().equals("views.View_Administrators")) {
						int idAdmin = Integer.parseInt(Administrators.arrayRow.get(row)[0]);
						AdminEntity admin = new AdminEntity();
						admin.setPseudo(table.getModel().getValueAt(row, 0).toString());
						admin.setSuperAdmin(table.getModel().getValueAt(row, 1).equals("1"));
						admin.setPassword(table.getModel().getValueAt(row, 2).toString());
						JTextField textField1 = new JTextField();
						textField1.setText(admin.getPseudo());
						JTextField textField2 = new JTextField();
						textField2.setText(admin.getPassword());
						Object[] inputFields = { "Nom d'utilisateur", textField1,

								"Mot de passe ", textField2 };
						int test = JOptionPane.showConfirmDialog(null, inputFields, "Modifier un administrateur",
								JOptionPane.WARNING_MESSAGE);
						if (test == 0) {
							SuperAdmin.updateAdmin(idAdmin, textField1.getText(), textField2.getText());
							model.setValueAt(textField1.getText(), row, 0);
							model.setValueAt(textField2.getText(), row, 2);
						}
					}else if(baseview.getClass().getName().equals("views.View_Products")){
						System.out.println("toto");
					}

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