import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;


public class Ship extends GameObject
{
    public float x, y;
    private static Image ship;

    public Ship(float x, float y)
    {
        this.x = x;
        this.y = y;
        try {
            ship = new Image("SPACESHIP.gif");
        }catch(SlickException se){


    }

    }

    public void draw()
    {
        ship.draw(x, y);
    }
}