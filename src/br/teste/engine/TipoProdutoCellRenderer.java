package br.teste.engine;


import br.teste.beans.TipoProduto;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;





public class TipoProdutoCellRenderer extends DefaultListCellRenderer {

    @Override
    public Component getListCellRendererComponent(
            JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
        if (value instanceof TipoProduto) {

            TipoProduto tipoProduto = (TipoProduto) value;
            setText(tipoProduto.getNomeTipo());
          //  p.setTipoProduto(tipoProduto.getNomeTipo());
        }
        return this;
    }
    
//    private br.teste.beans.Produtos p;
//    public void recebeObjeto(br.teste.beans.Produtos p) {
//        this.p = p;
//    }
}
