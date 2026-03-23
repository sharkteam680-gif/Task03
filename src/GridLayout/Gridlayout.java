package GridLayout;

import javax.swing.*;
import javax. swing. border. Border;
import java.awt.*;


public class Gridlayout {
    JFrame BorderFrame;
    JPanel JPanelOne;
    JPanel JPanelTwo;
    JPanel JPanelThree;

    public Gridlayout(){
        this.CreateJFrameBorderLayout();
    }
    public void CreateJFrameBorderLayout(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        BorderFrame = new JFrame ("GridLayout");
        BorderFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        BorderFrame.setLayout(new GridLayout(1,3));

        BorderFrame.add(this.CreateJPanelOne());
        BorderFrame.add(this.CreateJPanelTwo());
        BorderFrame.add(this.CreateJPanelThree());

        BorderFrame.setVisible(true);
    }
    public JPanel CreateJPanelOne(){
        JPanelOne = new JPanel();
        Border JPanelOneBorder =BorderFactory.createTitledBorder("JPanelOne");
        JPanelOne.setBorder(JPanelOneBorder);
        JPanelOne.setBackground(Color.cyan);
        return JPanelOne;
    }
    public JPanel CreateJPanelTwo() {
        JPanelTwo = new JPanel();
        Border JPanelTwoBorder = BorderFactory.createTitledBorder("JPanelTwo");
        JPanelTwo.setBorder(JPanelTwoBorder);
        JPanelTwo.setBackground(Color.darkGray);
        return JPanelTwo;
    }
    public JPanel CreateJPanelThree() {
        JPanelThree = new JPanel();
        Border JPanelThreeBorder = BorderFactory.createTitledBorder("JPanelThree");
        JPanelThree.setBorder(JPanelThreeBorder);
        JPanelThree.setBackground(Color.gray);
        return JPanelThree;
    }

}



