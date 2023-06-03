import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrofeoCastillo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrofeoCastillo extends TrofeosMenuScreen
{
    private TrophyCollector lista;
    private DoomTrophy doomTrophy = new DoomTrophy(lista);
    private ACTrophy aCTrophy = new ACTrophy(lista);
    private CopaTrophy copaTrophy = new CopaTrophy(lista);

    public TrofeoCastillo(PauseMenuScreen pauseWorld, TrophyCollector lista){
        super(pauseWorld);
        this.lista = lista;
    }
    public TrofeoCastillo(){
        super(null);
    }

    public void act()
    {
        
        if(isTrophyActive(doomTrophy)){
        addObject(doomTrophy,602,420);
        } 
        if(isTrophyActive(aCTrophy)){
        addObject(aCTrophy,951,409);
        } 
        if(isTrophyActive(copaTrophy)){
        addObject(copaTrophy,219,395);
        } 
    }
    
    private boolean isTrophyActive(Trophy link){
        return lista.contains(link);
    }
}
