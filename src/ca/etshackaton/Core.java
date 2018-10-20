package ca.etshackaton;

import javax.swing.*;
import java.awt.*;

public class Core extends JPanel implements Runnable {

    Star star1  = new Star();
    Star star2  = new Star();
    Square square = new Square();

    public Core(){

        this.setLayout(null);
        this.setSize(700,700);

        add(star1);
        star1.setLocation(200,200);

        add(star2);
        star2.setLocation(300,300);


        //System.out.println(star.getBounds());


//        add(square);
//        square.setVisible(true);
//        square.setLocation(0,0);
//        System.out.println(square.getHeight());

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0,0,this.getWidth(),this.getHeight());

    }

    @Override
    public void run() {

        while(true){

            try{
                Thread.sleep(10);
                java.awt.Toolkit.getDefaultToolkit().sync();

                makeStarMove(star1);
                makeStarMove(star2);

            }catch (InterruptedException ie){

                ie.printStackTrace();
                System.exit(0);

            }

        }

    }


    public void makeStarMove(Star star){

        star.move();

        if(star.getY() > this.getHeight()){

            System.out.println("test");

            star.setLocation(star.getX(),0 - star.getY());

        }


    }
}
