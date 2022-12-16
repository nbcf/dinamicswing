/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.teste.engine;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author nil_b
 */
public class DefaultTableCellRender extends DefaultTableCellRenderer{
  
    

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); 

        String str = (String) value;
        if ("OK".equals(str)) {
            c.setForeground(Color.RED);
        } else if ("NO".equals(str)) {
            c.setForeground(Color.GREEN);
        } else if ("yellow".equals(str)) {
            c.setForeground(Color.YELLOW);
        }
        return c;
    }
}