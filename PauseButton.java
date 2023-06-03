import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PauseButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PauseButton extends PauseButtons
{
    private World pauseScreen;
    
    public PauseButton(){    
    }
    
    public PauseButton(World link){
        pauseScreen = link;
    }
    
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            
            Greenfoot.setWorld(pauseScreen);
            
        }
    }
}
