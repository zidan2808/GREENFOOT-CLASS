import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Hero()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
    public void act()
    {
        
        moveHero();
    }
    
    public void moveHero()
    
    { 
        
        if (Greenfoot.isKeyDown("W"))
        setLocation(getX(), getY()-3);
        
        if (Greenfoot.isKeyDown("S"))
        setLocation(getX(), getY()+3);
        
        if (Greenfoot.isKeyDown("A"))
        setLocation(getX()-3, getY());
        
        if (Greenfoot.isKeyDown("D"))
        setLocation(getX()+3, getY());
        
         if(isAtEdge()){
        setLocation(0,getY());
        }
    }

}

