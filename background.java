import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Enemy enemy = new Enemy();
        addObject(enemy,500,59);
        ObjectSpecial objectSpecial = new ObjectSpecial();
        addObject(objectSpecial,330,105);
        Player player = new Player();
        addObject(player,417,445);
        Enemy enemy2 = new Enemy();
        addObject(enemy2,736,73);
        enemy.setLocation(502,62);
        removeObject(enemy);
    }
}
