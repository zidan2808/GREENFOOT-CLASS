import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Actor
{
    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        turn(2);
        BoomBubble();
    }
    
    public Boom(){
        GreenfootImage image = getImage();
        image.scale(image.getWidth()-10, image.getHeight()-10);
        setImage(image);
    }
    
    int boomTimer = 0;
    
    public void BoomBubble(){
        if(boomTimer==60){
        getWorld().removeObject(this);
        }else{
            boomTimer++;        
        }
    }
}


