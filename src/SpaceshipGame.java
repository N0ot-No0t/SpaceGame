import org.newdawn.slick.Animation;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.tiled.TiledMap;

/**
 * @author panos
 */
public class SpaceshipGame extends BasicGame
{

    private Image SPACEMAP;
    private Image SPACESHIP;
    private float x, y;
    private double ratio = 0.001;
    private float speedX, speedY;

    Camera cam;

    public SpaceshipGame()
    {
        super("Spaceship game");
    }

    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new SpaceshipGame());
            app.setDisplayMode(1000, 800, false);
            app.start();
            app.setTargetFrameRate(60);
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }

    @Override

    public void init(GameContainer container) throws SlickException {
        SPACEMAP = new Image("SPACEMAP.jpg");
        SPACESHIP = new Image("SPACESHIP.gif");
        x=0;
        speedX = 0;
        y=0;

        cam = new Camera(0,0);
        speedY = 0;
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException {
        Input input = container.getInput();


        if(input.isKeyDown(Input.KEY_RIGHT) && (x<935))
            speedX += ratio*delta;
        if(input.isKeyDown(Input.KEY_LEFT) && (x>0))
            speedX -= ratio*delta;
        if(input.isKeyDown(Input.KEY_UP) && (y>0))
            speedY -= ratio*delta;
        if(input.isKeyDown(Input.KEY_DOWN) && (y<740))
            speedY += ratio*delta;

        //do {
            if(((int)x)==935) {
                speedX = 0;
                if (input.isKeyDown(Input.KEY_LEFT))
                    speedX -= ratio* delta;
            }
            if(((int)x)==0) {
                speedX = 0;
                if (input.isKeyDown(Input.KEY_RIGHT))
                    speedX += ratio* delta;
            }
            if(((int)y)==0) {
                speedY = 0;
                if (input.isKeyDown(Input.KEY_DOWN))
                    speedY += ratio* delta;
            }
            if(((int)y)==740) {
                speedY = 0;
                if (input.isKeyDown(Input.KEY_UP))
                    speedY -= ratio* delta;
            }



        x += speedX;
        System.out.println(speedX);
        y += speedY;
        System.out.println(speedY);
        //x = input.getMouseX();
        //y = input.getMouseY();
        //SPACESHIP.rotate(delta);
    }

    public void render(GameContainer container, Graphics g) throws SlickException {
        SPACEMAP.draw();
        SPACESHIP.draw(x,y);

    }

    private void tick(){



    }
}

