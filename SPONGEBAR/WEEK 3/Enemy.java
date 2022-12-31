import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int px=0;
    

    public Enemy()
    {
        //setRotation(0);
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/12, image.getHeight()/12);
        setImage(image);
        
    }
    
    public Enemy(int speedinput)
    {
        setRotation(-180);
        this.speed=speedinput;
        
    }
    
    public int speed = 7;
    
    public void act()
    {
        move(-7);
        //move(speed);
        
        if(isAtEdge())
        {
            setLocation(1000,getY());
        }
    }
    
    
}
