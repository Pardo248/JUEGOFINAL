import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ResumeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResumeButton extends PauseButtons
{
    private World resumeLink;
    public ResumeButton(World link){
        resumeLink = link;
    }
    
    public ResumeButton(){

    }
    
    
    public void act()
    {  
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(resumeLink);
        }
    }
}
