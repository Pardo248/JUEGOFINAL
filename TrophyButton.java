import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrophyButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrophyButton extends PauseButtons
{
    private TrofeosMenuScreen trofeosScreen;
    
    public TrophyButton(TrofeosMenuScreen trofeosScreen){
        this.trofeosScreen = trofeosScreen;
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(trofeosScreen);
        }
    }
}
