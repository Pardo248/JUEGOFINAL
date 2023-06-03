import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CombateTutorialArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CombateTutorialArrow extends TutorialButton
{
    public CombateTutorialArrow(){

    }
    
    public void act()
    {
        if (isTouching(Character.class)){
            Character player = (Character) getOneIntersectingObject(Character.class);
            
            player.setLocation(getX(), getY()-50);
            
            TutorialBatallaScreen tutorialCombate = new TutorialBatallaScreen();
            getWorld().addObject(tutorialCombate, 600,375);
        }

    }
}
