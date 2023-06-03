import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrofeoDesierto here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrofeoDesierto extends TrofeosMenuScreen
{
    private TrophyCollector lista;
    private EdenAppleTrophy edenAppleTrophy = new EdenAppleTrophy(lista);
    private HatTrophy hatTrophy = new HatTrophy(lista);
    private PipboyTrophy pipboyTrophy = new PipboyTrophy(lista);

    public TrofeoDesierto(PauseMenuScreen pauseWorld, TrophyCollector lista){
        super(pauseWorld);
        this.lista = lista;
    }

    public void act()
    {

        if(isTrophyActive(edenAppleTrophy)){
            addObject(edenAppleTrophy,202,418);
        } 
        if(isTrophyActive(hatTrophy)){
             addObject(hatTrophy,595,418);
        } 
        if(isTrophyActive(pipboyTrophy)){
            addObject(pipboyTrophy,1003,422);
        } 
    }
    
    private boolean isTrophyActive(Trophy link){
        return lista.contains(link);
    }
}
