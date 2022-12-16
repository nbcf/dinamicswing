package br.teste.engine;


import br.teste.beans.Cozinha;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;





public class CozinhaCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof Cozinha) {

            Cozinha cozinha = (Cozinha) value;
            setText(cozinha.getNome());
        }
        return this;
    }
}
