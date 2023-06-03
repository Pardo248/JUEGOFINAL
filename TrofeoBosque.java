import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TrofeoBosque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TrofeoBosque extends TrofeosMenuScreen
{
    private TrophyCollector lista;
    
    private WitcherTrophy witcherTrophy = new WitcherTrophy(lista);
    private PokemonBallTrophy pokemonBallTrophy = new PokemonBallTrophy(lista);
    private LanzaTrophy lanzaTrophy = new LanzaTrophy(lista);
    

    public TrofeoBosque(PauseMenuScreen pauseWorld, TrophyCollector lista){
        super(pauseWorld);
        this.lista = lista;
        prepare();
    }
    public TrofeoBosque(){
        super(null);
        prepare();
    }

    private void prepare()
    {
        
    }
    
    public void act(){
        if(isTrophyActive(witcherTrophy)){
            addObject(witcherTrophy,260,410);
        } 
        if(isTrophyActive(pokemonBallTrophy)){
            addObject(pokemonBallTrophy,596,413);
        } 
        if(isTrophyActive(lanzaTrophy)){
            addObject(lanzaTrophy,936,413);
        } 
    }
    
    private boolean isTrophyActive(Trophy link){
        return lista.contains(link);
    }
}

