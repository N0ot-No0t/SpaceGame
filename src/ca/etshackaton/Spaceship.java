package ca.etshackaton;

import java.awt.event.*;
import javax.swing.JComponent;

public class Spaceship extends JComponent {
	
	private int Xcoord;
	private int Ycoord;
	private static final int LEFT = 1;
	private static final int RIGHT = 2;
	
	
	public Spaceship () {
		
		// get the image
		// set the location of the object
	}
	
	
	public int getXcoord() {
		return Xcoord;
	}
	public void setXcoord(int xcoord) {
		Xcoord = xcoord;
	}

	public int getYcoord() {
		return Ycoord;
	}

	public void setYcoord(int ycoord) {
		Ycoord = ycoord;
	}

	public void shoot () {
		// do we need that?
	}
	
	public void move (int direction) {
		if (direction == LEFT) {
			this.setLocation(this.Xcoord -1 , Ycoord);
		} if (direction == RIGHT) {
			this.Xcoord += 1;
			this.setLocation(this.Xcoord +1, Ycoord);
		} 

	}
	public void destroy() {
		// maybe
	}


}
