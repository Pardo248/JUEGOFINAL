import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Return here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Return extends Actor
{
    World currentWorld;
    StartMenuScreen nuevo = new StartMenuScreen();
    public void Return(World currentWorld){
        this.currentWorld =currentWorld;
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("f")){
            Greenfoot.setWorld(nuevo);
        }
    }
}
