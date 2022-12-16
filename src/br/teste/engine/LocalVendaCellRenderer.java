package br.teste.engine;


import br.teste.beans.LocalPedido;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;




public class LocalVendaCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof LocalPedido) {

            LocalPedido loc = (LocalPedido) value;
            setText(loc.getNome());
        }
        return this;
    }
}
