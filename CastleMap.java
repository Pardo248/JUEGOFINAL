import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CastleMap here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastleMap extends Map
{
    
    public CastleMap()
    {
        super(1200, 750, 1); 
        prepare();
    }

    private void prepare()
    {

        PauseButton pauseButton = new PauseButton(new CastlePause(this, listaTrofeos));
        addObject(pauseButton,57,57);

        Obstacles();

        ACTrophy aCTrophy = new ACTrophy(listaTrofeos);
        addObject(aCTrophy,561,356);
        DoomTrophy doomTrophy = new DoomTrophy(listaTrofeos);
        addObject(doomTrophy,1090,676);
        CopaTrophy copaTrophy = new CopaTrophy(listaTrofeos);
        addObject(copaTrophy,1021,31);

        Character player = new Character();
        addObject(player,64,370);
        CasteBoss casteBoss = new CasteBoss(this, listaTrofeos,records);
        addObject(casteBoss,991,376);

        SpearGirl spearGirl = new SpearGirl(this, listaTrofeos,records);
        addObject(spearGirl,191,373);

        CombateTutorialArrow combateTutorialArrow = new CombateTutorialArrow();
        addObject(combateTutorialArrow,20,424);
    }
    
    private void Obstacles(){
                Rectangle100Px rectangle100Px = new Rectangle100Px();
        addObject(rectangle100Px,392,615);
        Rectangle100Px rectangle100Px2 = new Rectangle100Px();
        addObject(rectangle100Px2,526,614);
        Rectangle100Px rectangle100Px3 = new Rectangle100Px();
        addObject(rectangle100Px3,676,614);
        Rectangle100Px rectangle100Px4 = new Rectangle100Px();
        addObject(rectangle100Px4,967,718);
        Rectangle100Px rectangle100Px5 = new Rectangle100Px();
        addObject(rectangle100Px5,1123,720);
        Rectangle100Px rectangle100Px6 = new Rectangle100Px();
        addObject(rectangle100Px6,524,558);
        Rectangle100Px rectangle100Px7 = new Rectangle100Px();
        addObject(rectangle100Px7,608,557);
        Rectangle100Px rectangle100Px8 = new Rectangle100Px();
        addObject(rectangle100Px8,527,483);
        Rectangle100Px rectangle100Px9 = new Rectangle100Px();
        addObject(rectangle100Px9,690,484);
        Square75Px square75Px = new Square75Px();
        addObject(square75Px,488,520);
        Square32Px square32Px = new Square32Px();
        addObject(square32Px,677,541);
        Square32Px square32Px2 = new Square32Px();
        addObject(square32Px2,696,525);
        Square32Px square32Px3 = new Square32Px();
        addObject(square32Px3,725,515);
        Square32Px square32Px4 = new Square32Px();
        addObject(square32Px4,751,511);
        Rectangle100Px rectangle100Px10 = new Rectangle100Px();
        addObject(rectangle100Px10,964,57);
        Rectangle100Px rectangle100Px11 = new Rectangle100Px();
        addObject(rectangle100Px11,926,4);
        Rectangle100Px rectangle100Px12 = new Rectangle100Px();
        addObject(rectangle100Px12,1077,6);
        Rectangle100Px rectangle100Px13 = new Rectangle100Px();
        addObject(rectangle100Px13,1117,59);
        rectangle100Px11.setLocation(973,11);
        removeObject(rectangle100Px11);
        removeObject(rectangle100Px12);
        Rectangle100Px rectangle100Px14 = new Rectangle100Px();
        addObject(rectangle100Px14,965,165);
        Rectangle100Px rectangle100Px15 = new Rectangle100Px();
        addObject(rectangle100Px15,1118,166);
        Square75Px square75Px2 = new Square75Px();
        addObject(square75Px2,927,109);
        Square75Px square75Px3 = new Square75Px();
        addObject(square75Px3,223,496);
        Square75Px square75Px4 = new Square75Px();
        addObject(square75Px4,225,572);
        Square50Px square50Px = new Square50Px();
        addObject(square50Px,274,597);
        Rectangle100Px rectangle100Px16 = new Rectangle100Px();
        addObject(rectangle100Px16,157,436);
        Rectangle100Px rectangle100Px17 = new Rectangle100Px();
        addObject(rectangle100Px17,76,439);
        Rectangle100Px rectangle100Px18 = new Rectangle100Px();
        addObject(rectangle100Px18,277,431);
        Rectangle100Px rectangle100Px19 = new Rectangle100Px();
        addObject(rectangle100Px19,72,312);
        Rectangle100Px rectangle100Px20 = new Rectangle100Px();
        addObject(rectangle100Px20,221,312);
        removeObject(rectangle100Px18);
        removeObject(rectangle100Px20);
        Square75Px square75Px5 = new Square75Px();
        addObject(square75Px5,188,283);
        Square50Px square50Px2 = new Square50Px();
        addObject(square50Px2,246,248);
        Square32Px square32Px5 = new Square32Px();
        addObject(square32Px5,239,281);
        Square32Px square32Px6 = new Square32Px();
        addObject(square32Px6,275,238);
        Square32Px square32Px7 = new Square32Px();
        addObject(square32Px7,297,223);
        Square32Px square32Px8 = new Square32Px();
        addObject(square32Px8,316,201);
        Square32Px square32Px9 = new Square32Px();
        addObject(square32Px9,344,188);
        Square32Px square32Px10 = new Square32Px();
        addObject(square32Px10,370,166);
        Square32Px square32Px11 = new Square32Px();
        addObject(square32Px11,397,149);
        Square32Px square32Px12 = new Square32Px();
        addObject(square32Px12,434,151);
        Square32Px square32Px13 = new Square32Px();
        addObject(square32Px13,455,161);
        Square32Px square32Px14 = new Square32Px();
        addObject(square32Px14,475,147);
        Square32Px square32Px15 = new Square32Px();
        addObject(square32Px15,475,114);
        Square32Px square32Px16 = new Square32Px();
        addObject(square32Px16,498,97);
        Square32Px square32Px17 = new Square32Px();
        addObject(square32Px17,527,85);
        Square32Px square32Px18 = new Square32Px();
        addObject(square32Px18,559,78);
        Square32Px square32Px19 = new Square32Px();
        addObject(square32Px19,588,71);
        Square32Px square32Px20 = new Square32Px();
        addObject(square32Px20,614,60);
        Square32Px square32Px21 = new Square32Px();
        addObject(square32Px21,642,49);
        Square32Px square32Px22 = new Square32Px();
        addObject(square32Px22,673,36);
        Square32Px square32Px23 = new Square32Px();
        addObject(square32Px23,705,31);
        Square50Px square50Px3 = new Square50Px();
        addObject(square50Px3,739,46);
        Square50Px square50Px4 = new Square50Px();
        addObject(square50Px4,768,65);
        Square50Px square50Px5 = new Square50Px();
        addObject(square50Px5,816,62);
        Square50Px square50Px6 = new Square50Px();
        addObject(square50Px6,832,26);
        square50Px6.setLocation(821,10);
        rectangle100Px10.setLocation(900,60);
        rectangle100Px10.setLocation(973,67);
        
        rectangle100Px.setLocation(371,619);
        rectangle100Px2.setLocation(492,620);
        rectangle100Px3.setLocation(662,626);
        
        Square32Px square32Px24 = new Square32Px();
        addObject(square32Px24,752,614);
        Square32Px square32Px25 = new Square32Px();
        addObject(square32Px25,770,600);
        Square32Px square32Px26 = new Square32Px();
        addObject(square32Px26,778,636);
        Square32Px square32Px27 = new Square32Px();
        addObject(square32Px27,799,664);
        Square32Px square32Px28 = new Square32Px();
        addObject(square32Px28,830,691);
        Square32Px square32Px29 = new Square32Px();
        addObject(square32Px29,862,711);
        Square75Px square75Px6 = new Square75Px();
        addObject(square75Px6,1078,607);
        Square75Px square75Px7 = new Square75Px();
        addObject(square75Px7,1153,669);
        Square75Px square75Px8 = new Square75Px();
        addObject(square75Px8,1013,624);
        Square75Px square75Px9 = new Square75Px();
        addObject(square75Px9,1018,559);
        Square75Px square75Px10 = new Square75Px();
        addObject(square75Px10,1101,512);
        Square75Px square75Px11 = new Square75Px();
        addObject(square75Px11,1104,440);
        Square75Px square75Px12 = new Square75Px();
        addObject(square75Px12,1105,374);
        Square75Px square75Px13 = new Square75Px();
        addObject(square75Px13,1105,300);
        Square75Px square75Px14 = new Square75Px();
        addObject(square75Px14,1118,233);
        rectangle100Px15.setLocation(1119,161);
        Square75Px square75Px15 = new Square75Px();
        addObject(square75Px15,1119,161);
        Square75Px square75Px16 = new Square75Px();
        addObject(square75Px16,802,370);
        square75Px8.setLocation(1025,610);
    }
}
