import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trophy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trophy extends Actor
{
    private TrophyCollector list;
    private EliminateTrophyButton button;
    private GreenfootImage image;
    private boolean scaleImageFlag = false;

    public Trophy(String newImage, TrophyCollector lista) {
        list = lista;
        image = new GreenfootImage(newImage);
        setImage(image);
        button = new EliminateTrophyButton(this, list);
    }

    public void act()
    {
        //Si es instancia de trofeos y recibe un click, abre el texto
        //
        World world = getWorld();
        if (scaleImageFlag == false && world instanceof TrofeosMenuScreen) {
            GreenfootImage image = getImage();
            if (world instanceof TrofeoCastillo){
                image.scale(image.getWidth() * 6, image.getHeight() * 6);
            } else {
                image.scale(image.getWidth() * 7, image.getHeight() * 7);
            }
            setImage(image);
            scaleImageFlag = true;

        } else if (isTouching(Character.class)){
            getWorld().addObject(button, 1100, 650);
        } else {
            getWorld().removeObject(button);
        } 

    }

}
