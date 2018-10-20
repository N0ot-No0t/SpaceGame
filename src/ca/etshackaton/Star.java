package ca.etshackaton;

import javax.swing.*;
import java.awt.*;

public class Star extends JComponent {

    private int [] pointX = {0,25,30,35,60,35,30,25};
    private int [] pointY = {30,25,0,25,30,35,60,35};
    private final int SPEED = 3;

    public Star(){

        this.setSize(60,60);
        //this.setLayout(null);

    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        g.setColor(Color.yellow);
        g.fillPolygon(pointX,pointY,8);
//        g.fillRect(0, 0, 60, 60);

    }

    public void move(){

        this.setLocation(this.getX(),this.getY() + SPEED);

    }
}
