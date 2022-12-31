import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Electro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Electro extends Actor
{
    /**
     * Act - do whatever the Electro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public  Electro()
    {
        GreenfootImage image = getImage();
        image.scale(150,150);    
    }
    
    public int time=30;
    public void ElectroHit()
    {
        time--;
        if(time==0){
            getWorld().removeObject(this);
        }
    }
    
    public void act()
    {
        ElectroHit();
        // Add your action code here.
    }
}
