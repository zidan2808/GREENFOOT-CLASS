import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    public Hero()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/3, image.getHeight()/3);
        setImage(image);
    }
    
    public void act()
    {
        moveHero();
        ShootPatty();
        TouchEnemy();
    }
    
    private void moveHero()
    
    { 
        
        if (Greenfoot.isKeyDown("W"))
        setLocation(getX(), getY()-7);
        
        if (Greenfoot.isKeyDown("S"))
        setLocation(getX(), getY()+7);
        
        if (Greenfoot.isKeyDown("A"))
        setLocation(getX()-7, getY());
        
        if (Greenfoot.isKeyDown("D"))
        setLocation(getX()+7, getY());
        
         if(isAtEdge()){
        setLocation(0,getY());
        }
    }
    
    private int time=10;
    
    private void ShootPatty()
    {
        World a = getWorld();
        
        if(Greenfoot.isKeyDown("Space"))
        {
            time--;
            if (time==0){
               a.addObject(new Shoot(), getX()+50, getY());    
               time=5;
               }
                   
        }
    
    }
    
    private void TouchEnemy()
    {
        World a = getWorld(); 
        
        if (this.isTouching(Enemy.class))
        {
            a.addObject(new Electro(),getX(),getY());
            removeTouching(Enemy.class);
            setLocation(20,getX()); 
        }
    }

}

