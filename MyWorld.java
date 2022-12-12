import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    
    int level = 1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        //create the elephant object
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        //create a label
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 40, 40 );
        
        createApple();
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level +=1;
        }
    }
    
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x,y);
    }
}
