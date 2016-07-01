import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class Renderer_table2 extends DefaultTableCellRenderer
{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        Color color = new Color(207, 151, 60);

        if ((row + column) % 2 == 0)                // раскраска доски
        {
            cell.setBackground(Color.orange);
        }
        else {
            cell.setBackground(color);
        }

        return cell;
    }

}
