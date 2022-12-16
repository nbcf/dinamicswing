package br.teste.engine;


import br.teste.beans.CadTipoUnd;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;





public  class TipoUnidadeCellRenderer extends DefaultListCellRenderer {

    @Override
    public  Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof CadTipoUnd) {

            CadTipoUnd cadTipoUnd = (CadTipoUnd) value;
            setText(cadTipoUnd.getTipoUnd().toString());
        }
        return this;
    }
}
