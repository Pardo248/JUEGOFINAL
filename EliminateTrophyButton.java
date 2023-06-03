import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EliminateTrophyButton extends PauseButtons
{
    private Trophy callingTrophy;
    private TrophyCollector list;
    
    public EliminateTrophyButton(Trophy link, TrophyCollector list){
        callingTrophy = link;
        this.list = list;
    }
    
    public EliminateTrophyButton(){
        
    }
    
    public void act()
    {
        if (Greenfoot.isKeyDown("space")) {
            list.add(callingTrophy);
            getWorld().removeObject(callingTrophy);
            getWorld().removeObject(this);
        }
        
        
    }
}
