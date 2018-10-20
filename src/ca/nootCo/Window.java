package ca.nootCo;

import javax.swing.*;

public class Window extends JFrame {

    private int WIDTH = 700;
    private int HEIGHT = 700;
    private Core core = new Core();
    private Thread thread;
    private Star star = new Star();

    public Window(){

            this.setTitle("Moving Star");
            this.setSize(WIDTH,HEIGHT);
            //this.setLayout(null);

            this.add(core);
            //star.setLocation(100,100);
            thread = new Thread(core);
            thread.start();




            this.setVisible(true);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
