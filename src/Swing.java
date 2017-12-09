import javax.swing.*;
import java.awt.*;

/**
 * Requirements:
 * 4 JTextFields
 * Array to create TextFields
 * Flow Layout
 * Grid Layout - 2 rows and 2 columns
 * Border Layout
 */

public class Swing extends JFrame{

    public Swing(){
        JPanel panelFlow = new JPanel();
        panelFlow.setLayout(new FlowLayout());
        panelFlow.add(new JButton("FlowLayout1"));
        panelFlow.add(new JButton("FlowLayout2"));
        panelFlow.add(new JButton("FlowLayout3"));
        panelFlow.add(new JButton("FlowLayout4"));
        setSize(200,75);
        setTitle("Button in a panel");
        add(panelFlow);
        setVisible(true);

        JPanel panelGrid = new JPanel();
        panelGrid.setLayout(new GridLayout(2,2));
        panelGrid.add(new JButton("GridLayout1")).setLocation(1,1);
        panelGrid.add(new JButton("GridLayout2")).setLocation(2,1);
        panelGrid.add(new JButton("GridLayout3")).setLocation(1,2);
        panelGrid.add(new JButton("GridLayout4")).setLocation(2,2);
        setSize(500,175);
        setTitle("Button in a panel");
        add(panelGrid);
        setVisible(true);

        JPanel panelBorder = new JPanel();
        panelBorder.setLayout(new BorderLayout());
        panelBorder.add(new JButton("BorderLayout1"), BorderLayout.NORTH);
        panelBorder.add(new JButton("BorderLayout2"), BorderLayout.SOUTH);
        panelBorder.add(new JButton("BorderLayout3"), BorderLayout.EAST);
        panelBorder.add(new JButton("BorderLayout3"), BorderLayout.WEST);

    }

    public static void main(String [] args){
        new Swing();
    }

}
