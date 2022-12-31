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
        enemy.setLocation(738,176);
        hero.setLocation(38,190);
        enemy.setLocation(745,191);
        enemy.setLocation(736,179);
        enemy.setLocation(965,220);
        enemy.setLocation(944,260);
        hero.setLocation(79,224);
        hero.setLocation(50,295);
        hero.setLocation(31,302);
        hero.setLocation(144,249);
        hero.setLocation(62,273);
    }
}
