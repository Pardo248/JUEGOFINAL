import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class TofeosMenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrofeosMenuScreen extends Menus
{

    public TrofeosMenuScreen(PauseMenuScreen pauseWorld)
    {
        super(1200, 750, 1); 
        prepare(pauseWorld);
    }
    
    private void prepare(PauseMenuScreen pauseWorld){
        ResumeButton resumeButton = new ResumeButton(pauseWorld);
        addObject(resumeButton,186,88);
    }
    
    
}
