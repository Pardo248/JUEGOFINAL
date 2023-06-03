import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.ArrayList;

public class DesertMap extends Map
{
    
    public DesertMap()
    {
        super(1200, 750, 1); 

        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PauseButton pauseButton = new PauseButton(new DesertPause(this, listaTrofeos));
        addObject(pauseButton,57,57);

        HatTrophy hatTrophy = new HatTrophy(listaTrofeos);
        addObject(hatTrophy,922,678);
        EdenAppleTrophy edenAppleTrophy = new EdenAppleTrophy(listaTrofeos);
        addObject(edenAppleTrophy,638,102);
        PipboyTrophy pipboyTrophy = new PipboyTrophy(listaTrofeos);
        addObject(pipboyTrophy,94,665);

        FarahonBoss farahonBoss = new FarahonBoss(this, listaTrofeos,records);
        addObject(farahonBoss,1123,366);

        
        Character player = new Character();
        addObject(player,33,376);
        Square50Px square50Px = new Square50Px();
        addObject(square50Px,398,719);
        Square50Px square50Px2 = new Square50Px();
        addObject(square50Px2,399,665);
        Square50Px square50Px3 = new Square50Px();
        addObject(square50Px3,394,612);
        Square50Px square50Px4 = new Square50Px();
        addObject(square50Px4,398,560);
        Square75Px square75Px = new Square75Px();
        addObject(square75Px,361,526);
        Square75Px square75Px2 = new Square75Px();
        addObject(square75Px2,364,461);
        Square75Px square75Px3 = new Square75Px();
        addObject(square75Px3,428,522);
        Square75Px square75Px4 = new Square75Px();
        addObject(square75Px4,431,466);
        Square75Px square75Px5 = new Square75Px();
        addObject(square75Px5,363,223);
        Square75Px square75Px6 = new Square75Px();
        addObject(square75Px6,363,287);
        Square75Px square75Px7 = new Square75Px();
        addObject(square75Px7,429,285);
        Square75Px square75Px8 = new Square75Px();
        addObject(square75Px8,428,225);
        Square32Px square32Px = new Square32Px();
        addObject(square32Px,482,265);
        Square32Px square32Px2 = new Square32Px();
        addObject(square32Px2,481,482);
        Square50Px square50Px5 = new Square50Px();
        addObject(square50Px5,400,26);
        Square32Px square32Px3 = new Square32Px();
        addObject(square32Px3,189,742);
        Square32Px square32Px4 = new Square32Px();
        addObject(square32Px4,160,640);
        Square32Px square32Px5 = new Square32Px();
        addObject(square32Px5,957,463);
        Square32Px square32Px6 = new Square32Px();
        addObject(square32Px6,1037,459);
        Square32Px square32Px7 = new Square32Px();
        addObject(square32Px7,962,292);
        Square32Px square32Px8 = new Square32Px();
        addObject(square32Px8,1042,287);
        Square75Px square75Px9 = new Square75Px();
        addObject(square75Px9,41,542);
        Square50Px square50Px6 = new Square50Px();
        addObject(square50Px6,85,513);
        square50Px6.setLocation(-294,678);
        Square75Px square75Px10 = new Square75Px();
        addObject(square75Px10,148,496);
        Square50Px square50Px7 = new Square50Px();
        addObject(square50Px7,19,603);
        Square50Px square50Px8 = new Square50Px();
        addObject(square50Px8,15,647);
        Square50Px square50Px9 = new Square50Px();
        addObject(square50Px9,69,740);
        Square75Px square75Px11 = new Square75Px();
        addObject(square75Px11,150,258);
        Square75Px square75Px12 = new Square75Px();
        addObject(square75Px12,102,207);
        Square75Px square75Px13 = new Square75Px();
        addObject(square75Px13,62,149);
        Square75Px square75Px14 = new Square75Px();
        addObject(square75Px14,34,82);
        Square75Px square75Px15 = new Square75Px();
        addObject(square75Px15,25,27);
        Square50Px square50Px10 = new Square50Px();
        addObject(square50Px10,81,6);
        Square50Px square50Px11 = new Square50Px();
        addObject(square50Px11,132,10);
        square50Px11.setLocation(156,1);
        Square50Px square50Px12 = new Square50Px();
        addObject(square50Px12,156,1);
        Square50Px square50Px13 = new Square50Px();
        addObject(square50Px13,544,44);
        Square50Px square50Px14 = new Square50Px();
        addObject(square50Px14,1145,733);
        Zombie zombie = new Zombie(this, listaTrofeos,records);
        addObject(zombie,794,374);
        RectangleDown100Px rectangleDown100Px = new RectangleDown100Px();
        addObject(rectangleDown100Px,790,746);
        RectangleDown100Px rectangleDown100Px2 = new RectangleDown100Px();
        addObject(rectangleDown100Px2,783,2);

        CombateTutorialArrow combateTutorialArrow = new CombateTutorialArrow();
        addObject(combateTutorialArrow,552,471);
    }
}
