import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialScreens here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TutorialScreens extends Actor
{
    public TutorialScreens(String newImage){
        setImage(newImage);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
            getWorld().removeObject(this);
        } 
    }
}
