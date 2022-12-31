import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,63,187);

        Enemy enemy = new Enemy();
        addObject(enemy,209,106);

        hero.setLocation(62,273);
        
        enemy.setLocation(978,263);
    }
    
    
    public void act()
    {
        spawnEnemy();
    }
    public int timerEnemy = 0;
    
    public void spawnEnemy(){
        if (timerEnemy==90){
            
            addObject(new Enemy(), 999, Greenfoot.getRandomNumber(400));
            timerEnemy = 0;
        }
        else{
            timerEnemy++;        
        }
    }
}
