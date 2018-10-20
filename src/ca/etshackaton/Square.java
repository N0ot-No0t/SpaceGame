package ca.etshackaton;

import javax.swing.*;
import java.awt.*;

public class Square extends JComponent {

    public Square(){

        this.setSize(60,60);
        //this.setLayout(null);



    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.yellow);
        g.fillRect(0,0,60,60);

    }


}
