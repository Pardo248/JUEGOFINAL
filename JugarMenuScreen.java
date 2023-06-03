import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JugarMenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JugarMenuScreen extends Menus
{
    
    public JugarMenuScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //TrophyCollector.clearListaTrofeos();
        ForestButton forestButton = new ForestButton();
        addObject(forestButton,136,700);
        DesertButton desertButton = new DesertButton();
        addObject(desertButton,590,703);
        CastleButton castleButton = new CastleButton();
        addObject(castleButton,983,706);
        ResturnStartButton resturnStartButton = new ResturnStartButton();
        addObject(resturnStartButton,93,64);
    }
}
