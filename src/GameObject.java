
import org.newdawn.slick.Graphics;

public abstract class GameObject {

    public float x,y;
    public float velX = 0, velY = 0;
    public ObjectId id;

    public GameObject(float x, float y, ObjectId id){

        this.x = x;
        this.y = y;
        this.id = id;

    }

    public abstract void tick();

    public abstract void render(Graphics g);


    protected void update() {
    }

    protected void draw() {
    }

    public abstract float getY();
    public abstract float getX();
    public abstract float setY(float y);
    public abstract float setX(float x);

    public abstract float getVelX();
    public abstract float getVelY();
    public abstract float getselX(float velX);
    public abstract float getselY(float velY);
}