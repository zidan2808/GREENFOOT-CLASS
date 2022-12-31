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
        EnemyLaser enemyLaser = new EnemyLaser();
        addObject(enemyLaser,849,223);
        enemyLaser.setLocation(950,208);
        enemyLaser.setLocation(939,178);
        enemy.setLocation(953,280);
        enemy.setLocation(953,282);
        enemy.setLocation(944,414);
        enemyLaser.setLocation(924,181);
        enemy.setLocation(917,407);
    }
    
    
    public void act()
    {
        spawnEnemy();
    }
    private int timerEnemy = 0;
    
    private void spawnEnemy(){
        if (timerEnemy==90){
            
            addObject(new Enemy(), 999, Greenfoot.getRandomNumber(500));
            timerEnemy = 5;
            addObject(new EnemyLaser(), 999, Greenfoot.getRandomNumber(100));
            timerEnemy = 10;
        }
        else{
            timerEnemy++;        
        }
    }
}
