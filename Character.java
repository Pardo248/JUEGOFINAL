import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Movable
{
    
    public void act()
    {
        handleKeys();

        
    }
    
    private void handleKeys(){
        Boolean flag = false;
        
        
        if(Greenfoot.isKeyDown("left")){
            direction = DIRECTION_LEFT;
            flag = true;
        } 
        if(Greenfoot.isKeyDown("right")){
            direction = DIRECTION_RIGHT;
            flag = true;
        } 
        if(Greenfoot.isKeyDown("up")){
            direction = DIRECTION_UP;
            flag = true;
        } 
        if(Greenfoot.isKeyDown("down")){
            direction = DIRECTION_DOWN;
            flag = true;
        }
        
        if (flag){ 
            handleMovement();
        }
    }
    
    
    private void handleMovement(){
                switch(direction){
            case DIRECTION_RIGHT:
                setLocation(getX() + OFFSET, getY());
                if (isTouching(Obstacle.class)){
                    setLocation(getX() - OFFSET, getY());
                };
                break;
            
            case DIRECTION_LEFT:
                setLocation(getX() - OFFSET, getY());
                if (isTouching(Obstacle.class)){
                    setLocation(getX() + OFFSET, getY());
                };
                break;
                
            case DIRECTION_UP:
                setLocation(getX(), getY() - OFFSET);
                if (isTouching(Obstacle.class)){
                    setLocation(getX(), getY() + OFFSET);
                };
                break;
                
            case DIRECTION_DOWN:
                setLocation(getX(), getY() + OFFSET);
                if (isTouching(Obstacle.class)){
                    setLocation(getX(), getY() - OFFSET);
                };
                break;
        }
    }
}
