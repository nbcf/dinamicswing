package br.teste.renderer;



import br.teste.beans.Funcionarios;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;

public class FuncionariosListCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Funcionarios) {

            Funcionarios funcionarios = (Funcionarios) value;
            setText(funcionarios.getNome().toString());
        }
        return this;
    }
}
