import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author Iyi Adeniyi
 * @version 2022-12-12
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * The main world act loop
     */
    public void act()
    {
        //stat the game if the user presses space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,399,97);

        Label label = new Label("press <space> to start", 40);
        addObject(label,216,228);

        Label label2 = new Label("use \u2190 and \u2192 to move", 40);
        addObject(label2,214,288);

        elephant.setLocation(477,268);
        HungryElephant hungryElephant = new HungryElephant();
        addObject(hungryElephant,281,37);
        hungryElephant.setLocation(348,37);
    }
}
