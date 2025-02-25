import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

public class HoverTableRenderer extends DefaultTableCellRenderer {
    private int hoveredRow = -1; 

    public void setHoveredRow(int row) {
        this.hoveredRow = row;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

      
        cell.setForeground(Color.BLACK); 
        cell.setBackground(Color.WHITE); 

        setBorder(null);

       
        if (row == hoveredRow) {
            cell.setBackground(Color.LIGHT_GRAY); 
        }

       
        if (isSelected) {
            cell.setBackground(new Color(0x85DCEA));
            cell.setForeground(Color.BLACK); 
        }

        return cell;
    }
}
