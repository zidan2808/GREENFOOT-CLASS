import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{   
    public void act()
    {
        move(-7);
        resetEdge();
        KrabyPatty();
    }
    
    public Enemy()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/13, image.getHeight()/13);
        setImage(image);
    }
    
    public int speed = 7;
    public Enemy(int speedinput)
    {
        setRotation(-180);
        this.speed=speedinput;
    }
    
    public void resetEdge(){
        if(isAtEdge())
        {
            setLocation(1000,getY());
        } 
    }
    
    
    public void KrabyPatty()
    {
        World a = getWorld(); 
        
        if (this.isTouching(Shoot.class))
        {
            //remove enemy
            a.addObject(new Boom(),getX(),getY()); 
            removeTouching(Shoot.class);
            a.removeObject(this);    
               
        }
        else if(this.isAtEdge( ))
        {
            a.removeObject(this);             
        }
    }
    
}
