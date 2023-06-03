import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartMenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartMenuScreen extends Menus
{

    
    public StartMenuScreen()
    {    
        super(1200, 750, 1); 
        prepare();
    }
    
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        JugarButton jugarButton = new JugarButton();
        addObject(jugarButton,602,661);
        RecordsButton recordsButton = new RecordsButton();
        addObject(recordsButton,189,663);
    }
}
