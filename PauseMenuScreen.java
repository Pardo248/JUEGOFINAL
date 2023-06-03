import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseMenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseMenuScreen extends Menus
{
    
    public PauseMenuScreen()
    {
        super(1200,750,1);
    }
    
    protected void prepare(World mapWorld, TrofeosMenuScreen trofeoScreen)
    {
        ResumeButton resumeButton = new ResumeButton(mapWorld);
        addObject(resumeButton,600,200);
        World worldLink = resumeButton.getWorld();
        TrophyButton trophyButton = new TrophyButton(trofeoScreen);
        addObject(trophyButton,600,400);
        MainMenuButton mainMenuButton = new MainMenuButton();
        addObject(mainMenuButton,600,600);
    }
    
}
