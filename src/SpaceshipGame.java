import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * @author panos
 */
public class SpaceshipGame extends BasicGame
{

    public SpaceshipGame()
    {
        super("Spaceship game");
    }

    public static void main(String[] arguments)
    {
        try
        {
            AppGameContainer app = new AppGameContainer(new SpaceshipGame());
            app.setDisplayMode(500, 400, false);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer container) throws SlickException
    {
    }

    @Override
    public void update(GameContainer container, int delta) throws SlickException
    {
    }


    public void render(GameContainer container, Graphics g, StateBasedGame sbg) throws SlickException
    {

        //Translate to camera X and Y
        g.translate(-camera.camX, -camera.camY);

        //Scaling map
        g.scale(3, 3);
        //Rendering map
        try {
            mapRender.render();
        } catch (SlickException e1) {
            e1.printStackTrace();
        }

        //Draw player
        player1.drawPlayer(g);

    }
}

