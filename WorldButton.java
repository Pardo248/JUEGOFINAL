import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldButton extends Button
{
    World link;
    
    public WorldButton(World newLink){
        link = newLink;
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(link);
        }
    }
}
