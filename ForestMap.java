import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ForestMap extends Map
{
    
    
    public ForestMap()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        PauseButton pauseButton = new PauseButton(new ForestPause(this, listaTrofeos));
        addObject(pauseButton,57,57);

        waterObstacles();
        treesCliffsObstacles();
        blueObstacles();
        buttons(listaTrofeos);
        mobs();
        
        

        Character player = new Character();
        addObject(player,38,479);
        CombateTutorialArrow combateTutorialArrow = new CombateTutorialArrow();
        addObject(combateTutorialArrow,405,668);
    }
    
    private void mobs(){
        RiverSlimeGirl riverSlimeGirl = new RiverSlimeGirl(this, listaTrofeos.getSize(),records);
        addObject(riverSlimeGirl,564,634);
        HadaBoss hadaBoss = new HadaBoss(this, listaTrofeos.getSize(),records);
        addObject(hadaBoss,752,250);
    }
    
    private void blueObstacles(){
        RectangleUp100Px rectangleUp100Px = new RectangleUp100Px();
        addObject(rectangleUp100Px,648,636);
        RectangleUp100Px rectangleUp100Px2 = new RectangleUp100Px();
        addObject(rectangleUp100Px2,480,630);
    }
    
    private void buttons(TrophyCollector listaTrofeos){
        TrophyTutorialArrow trophyTutorialArrow = new TrophyTutorialArrow();
        addObject(trophyTutorialArrow,31,548);
        trophyTutorialArrow.setLocation(32,548);
        WitcherTrophy witcherTrophy = new WitcherTrophy(listaTrofeos);
        addObject(witcherTrophy,28,717);
        PokemonBallTrophy pokemonBallTrophy = new PokemonBallTrophy(listaTrofeos);
        addObject(pokemonBallTrophy,53,257);
        LanzaTrophy lanzaTrophy = new LanzaTrophy(listaTrofeos);
        addObject(lanzaTrophy,833,726);
    }
    
    private void waterObstacles(){
                Square50Px square50Px7 = new Square50Px();
        addObject(square50Px7,684,534);
        Square50Px square50Px8 = new Square50Px();
        addObject(square50Px8,668,484);
        Square50Px square50Px9 = new Square50Px();
        addObject(square50Px9,654,452);
        Square50Px square50Px10 = new Square50Px();
        addObject(square50Px10,606,435);
        Square50Px square50Px11 = new Square50Px();
        addObject(square50Px11,553,455);
        Square50Px square50Px12 = new Square50Px();
        addObject(square50Px12,529,490);
        Square50Px square50Px13 = new Square50Px();
        addObject(square50Px13,495,491);
        Square50Px square50Px14 = new Square50Px();
        addObject(square50Px14,480,465);
        Square50Px square50Px15 = new Square50Px();
        addObject(square50Px15,442,447);
        square50Px15.setLocation(417,433);
        Square50Px square50Px16 = new Square50Px();
        addObject(square50Px16,417,433);
        square50Px16.setLocation(401,417);
        Square50Px square50Px17 = new Square50Px();
        addObject(square50Px17,401,417);
        Square50Px square50Px18 = new Square50Px();
        addObject(square50Px18,377,391);
        square50Px18.setLocation(361,370);
        Square50Px square50Px19 = new Square50Px();
        addObject(square50Px19,361,370);
        Square50Px square50Px20 = new Square50Px();
        addObject(square50Px20,320,356);
        square50Px20.setLocation(308,335);
        Square50Px square50Px21 = new Square50Px();
        addObject(square50Px21,308,335);
        square50Px21.setLocation(287,326);
        Square50Px square50Px22 = new Square50Px();
        addObject(square50Px22,287,326);
        Square50Px square50Px23 = new Square50Px();
        addObject(square50Px23,254,313);
        Square50Px square50Px24 = new Square50Px();
        addObject(square50Px24,242,285);
        Square50Px square50Px25 = new Square50Px();
        addObject(square50Px25,259,257);
        Square50Px square50Px26 = new Square50Px();
        addObject(square50Px26,272,216);
        square50Px7.setLocation(699,520);
        Square50Px square50Px27 = new Square50Px();
        addObject(square50Px27,699,520);
        Square50Px square50Px28 = new Square50Px();
        addObject(square50Px28,712,478);
        square50Px28.setLocation(727,462);
        Square50Px square50Px29 = new Square50Px();
        addObject(square50Px29,727,462);
        Square50Px square50Px30 = new Square50Px();
        addObject(square50Px30,746,452);
        square50Px30.setLocation(758,440);
        Square50Px square50Px31 = new Square50Px();
        addObject(square50Px31,758,440);
        Square50Px square50Px32 = new Square50Px();
        addObject(square50Px32,794,428);
        Square50Px square50Px33 = new Square50Px();
        addObject(square50Px33,857,448);
        Square50Px square50Px34 = new Square50Px();
        addObject(square50Px34,831,422);
        Square50Px square50Px35 = new Square50Px();
        addObject(square50Px35,905,453);
        Square50Px square50Px36 = new Square50Px();
        addObject(square50Px36,923,478);
        square50Px36.setLocation(945,463);
        Square50Px square50Px37 = new Square50Px();
        addObject(square50Px37,945,463);
        Square50Px square50Px38 = new Square50Px();
        addObject(square50Px38,960,430);
        Square50Px square50Px39 = new Square50Px();
        addObject(square50Px39,948,394);
        Square50Px square50Px40 = new Square50Px();
        addObject(square50Px40,927,368);
        square50Px40.setLocation(916,354);
        Square50Px square50Px41 = new Square50Px();
        addObject(square50Px41,916,354);
        square50Px41.setLocation(897,333);
        Square50Px square50Px42 = new Square50Px();
        addObject(square50Px42,897,333);
        square50Px42.setLocation(880,340);
        Square50Px square50Px43 = new Square50Px();
        addObject(square50Px43,880,340);
        square50Px43.setLocation(864,363);
        Square50Px square50Px44 = new Square50Px();
        addObject(square50Px44,864,363);
        square50Px44.setLocation(840,377);
        Square50Px square50Px45 = new Square50Px();
        addObject(square50Px45,840,377);
        Square50Px square50Px46 = new Square50Px();
        addObject(square50Px46,799,384);
        Square75Px square75Px30 = new Square75Px();
        addObject(square75Px30,735,393);
        Square75Px square75Px31 = new Square75Px();
        addObject(square75Px31,568,203);
        square75Px31.setLocation(592,235);
        Square75Px square75Px32 = new Square75Px();
        addObject(square75Px32,592,235);
        Square75Px square75Px33 = new Square75Px();
        addObject(square75Px33,600,273);
        Square75Px square75Px34 = new Square75Px();
        addObject(square75Px34,617,324);
        square75Px34.setLocation(646,355);
        Square75Px square75Px35 = new Square75Px();
        addObject(square75Px35,646,355);
        square75Px35.setLocation(670,386);
        Square75Px square75Px36 = new Square75Px();
        addObject(square75Px36,670,386);
        Square75Px square75Px37 = new Square75Px();
        addObject(square75Px37,343,339);
        Square75Px square75Px38 = new Square75Px();
        addObject(square75Px38,392,379);
        Square32Px square32Px8 = new Square32Px();
        addObject(square32Px8,546,525);
        Square32Px square32Px9 = new Square32Px();
        addObject(square32Px9,554,553);
        Square32Px square32Px10 = new Square32Px();
        addObject(square32Px10,557,586);
        Square32Px square32Px11 = new Square32Px();
        addObject(square32Px11,569,681);
        Square32Px square32Px12 = new Square32Px();
        addObject(square32Px12,542,686);
        Square32Px square32Px13 = new Square32Px();
        addObject(square32Px13,508,688);
        Square32Px square32Px14 = new Square32Px();
        addObject(square32Px14,476,688);
        Square32Px square32Px15 = new Square32Px();
        addObject(square32Px15,445,689);
        Square32Px square32Px16 = new Square32Px();
        addObject(square32Px16,419,695);
        square32Px16.setLocation(403,707);
        Square32Px square32Px17 = new Square32Px();
        addObject(square32Px17,403,707);
        square32Px17.setLocation(394,718);
        Square32Px square32Px18 = new Square32Px();
        addObject(square32Px18,394,718);
        Square32Px square32Px19 = new Square32Px();
        addObject(square32Px19,388,740);
        square32Px19.setLocation(400,738);
        Square32Px square32Px20 = new Square32Px();
        addObject(square32Px20,400,738);
        square32Px16.setLocation(416,710);
        Square32Px square32Px21 = new Square32Px();
        addObject(square32Px21,416,710);
        Square32Px square32Px22 = new Square32Px();
        addObject(square32Px22,291,720);
        Square32Px square32Px23 = new Square32Px();
        addObject(square32Px23,892,294);
        Square32Px square32Px24 = new Square32Px();
        addObject(square32Px24,887,265);
        Square32Px square32Px25 = new Square32Px();
        addObject(square32Px25,891,237);
    }
    
    private void treesCliffsObstacles(){
                Square75Px sqare75Px = new Square75Px();
        addObject(sqare75Px,193,678);
        Square75Px sqare75Px2 = new Square75Px();
        addObject(sqare75Px2,26,608);
        Square75Px sqare75Px3 = new Square75Px();
        addObject(sqare75Px3,962,720);
        Square75Px sqare75Px4 = new Square75Px();
        addObject(sqare75Px4,1036,690);
        Square32Px square32Px = new Square32Px();
        addObject(square32Px,995,632);
        Square75Px sqare75Px5 = new Square75Px();
        addObject(sqare75Px5,1106,614);
        Square75Px sqare75Px6 = new Square75Px();
        addObject(sqare75Px6,1152,532);
        Square50Px square50Px = new Square50Px();
        addObject(square50Px,1098,567);
        Square32Px square32Px2 = new Square32Px();
        addObject(square32Px2,1114,490);
        Square75Px square75Px7 = new Square75Px();
        addObject(square75Px7,1196,455);
        Square75Px square75Px8 = new Square75Px();
        addObject(square75Px8,1189,372);
        Square75Px square75Px9 = new Square75Px();
        addObject(square75Px9,1080,270);
        Square75Px square75Px10 = new Square75Px();
        addObject(square75Px10,1089,187);
        Square75Px square75Px11 = new Square75Px();
        addObject(square75Px11,1119,104);
        Square75Px square75Px12 = new Square75Px();
        addObject(square75Px12,1159,98);
        square75Px10.setLocation(1063,173);
        Square75Px square75Px13 = new Square75Px();
        addObject(square75Px13,1063,173);
        Square75Px square75Px14 = new Square75Px();
        addObject(square75Px14,1035,132);
        Square75Px square75Px15 = new Square75Px();
        addObject(square75Px15,1016,59);
        Square75Px square75Px16 = new Square75Px();
        addObject(square75Px16,963,4);
        Square75Px square75Px17 = new Square75Px();
        addObject(square75Px17,884,1);
        Square75Px square75Px18 = new Square75Px();
        addObject(square75Px18,799,6);
        Square75Px square75Px19 = new Square75Px();
        addObject(square75Px19,707,14);
        Square75Px square75Px20 = new Square75Px();
        addObject(square75Px20,643,42);
        Square75Px square75Px21 = new Square75Px();
        addObject(square75Px21,593,86);
        Square75Px square75Px22 = new Square75Px();
        addObject(square75Px22,575,130);
        Square75Px square75Px23 = new Square75Px();
        addObject(square75Px23,432,118);
        Square75Px square75Px24 = new Square75Px();
        addObject(square75Px24,351,125);
        Square75Px square75Px25 = new Square75Px();
        addObject(square75Px25,308,157);
        Square75Px square75Px26 = new Square75Px();
        addObject(square75Px26,233,173);
        Square75Px square75Px27 = new Square75Px();
        addObject(square75Px27,161,166);
        Square75Px square75Px28 = new Square75Px();
        addObject(square75Px28,93,138);
        Square75Px square75Px29 = new Square75Px();
        addObject(square75Px29,15,151);
        Square50Px square50Px2 = new Square50Px();
        addObject(square50Px2,0,190);
        Square50Px square50Px3 = new Square50Px();
        addObject(square50Px3,39,360);
        Square50Px square50Px4 = new Square50Px();
        addObject(square50Px4,112,357);
        Square32Px square32Px3 = new Square32Px();
        addObject(square32Px3,148,404);
        Square50Px square50Px5 = new Square50Px();
        addObject(square50Px5,113,704);
        square50Px5.setLocation(126,724);
        Square50Px square50Px6 = new Square50Px();
        addObject(square50Px6,716,717);
        Square32Px square32Px4 = new Square32Px();
        addObject(square32Px4,833,696);
        Square32Px square32Px5 = new Square32Px();
        addObject(square32Px5,616,719);
        Square32Px square32Px6 = new Square32Px();
        addObject(square32Px6,938,538);
        Square32Px square32Px7 = new Square32Px();
        addObject(square32Px7,831,517);
        removeObject(square32Px4);
    }
}
