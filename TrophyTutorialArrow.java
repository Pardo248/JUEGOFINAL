import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TutorialArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrophyTutorialArrow extends TutorialButton
{
    /**
     * Act - do whatever the TutorialArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TrophyTutorialArrow(){

    }
    
    public void act()
    {
        if (isTouching(Character.class)){
            Character player = (Character) getOneIntersectingObject(Character.class);
            
            player.setLocation(getX(), getY()-50);
            
            TutorialTrofeosScreen tutorialTrofeo = new TutorialTrofeosScreen();
            getWorld().addObject(tutorialTrofeo, 600,375);
        }

    }
}
