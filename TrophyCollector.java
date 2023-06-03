import greenfoot.*;
import java.util.ArrayList;

public class TrophyCollector {
    private ArrayList<Trophy> listaTrofeos = new ArrayList<Trophy>();  
    
    public void add(Trophy trophy) {
        listaTrofeos.add(trophy);
    }

    public boolean contains(Trophy trophyType){
        for (Trophy i : listaTrofeos) {
            if(i.getClass().equals(trophyType.getClass())){
                return true;
            }
        }
        return false;
    }
    
    public void clear() {
        listaTrofeos.clear();
    }
    
    public int getSize(){
        return listaTrofeos.size();
    }
}
