import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.nio.file.*;
import java.nio.charset.*;
/**
 * Write a description of class LOSSE here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LOSSE extends CombatMap
{
    String nom;
    /**
     * Constructor for objects of class LOSSE.
     * 
     */
    public LOSSE(int x, int y, int z)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(x,y,z);
    }
    protected void PrintScore(float score,World currentWorld){
        
      Greenfoot.setWorld(currentWorld);
      nom = Greenfoot.ask("Cual es tu nombre?");
      showText("Score: "+ nom +"-"+ score + "\n Presiona F para reintentar",600,100);
      if(Greenfoot.isKeyDown("f")){
            Greenfoot.setWorld(currentWorld);
        }
      
    }
}
