package gridlayout;

import javax.swing.*;
import javax. swing. border. Border;
import java.awt.*;


public class gridlayout {
    JFrame BorderFrame;
    JPanel jpanelone;
    JPanel jpaneltwo;
    JPanel jpanelthree;

    public gridlayout(){
        this.createjframeborderlayout();
    }
    public void createjframeborderlayout(){
        JFrame.setDefaultLookAndFeelDecorated(true);
        BorderFrame = new JFrame ("gridlayout");
        BorderFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        BorderFrame.setExtendedState(Frame.MAXIMIZED_BOTH);
        BorderFrame.setLayout(new GridLayout(1,3));

        BorderFrame.add(this.createjpanelone());
        BorderFrame.add(this.createjpaneltwo());
        BorderFrame.add(this.createjpanelthree());

        BorderFrame.setVisible(true);
    }
    public JPanel createjpanelone(){
        jpanelone = new JPanel();
        Border jpaneloneborder =BorderFactory.createTitledBorder("JPanelOne");
        jpanelone.setBorder(jpaneloneborder);
        jpanelone.setBackground(Color.cyan);
        return jpanelone;
    }
    public JPanel createjpaneltwo() {
        jpaneltwo = new JPanel();
        Border jpaneltwoborder = BorderFactory.createTitledBorder("JPanelTwo");
        jpaneltwo.setBorder(jpaneltwoborder);
        jpaneltwo.setBackground(Color.darkGray);
        return jpaneltwo;
    }
    public JPanel createjpanelthree() {
        jpanelthree = new JPanel();
        Border jpanelthreeborder = BorderFactory.createTitledBorder("JPanelThree");
        jpanelthree.setBorder(jpanelthreeborder);
        jpanelthree.setBackground(Color.gray);
        return jpanelthree;
    }

}



