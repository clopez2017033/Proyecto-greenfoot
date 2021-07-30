import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startScreen extends World
{

    /**
     * Constructor for objects of class startScreen.
     * 
     */
    public startScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 700, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        startText startText = new startText();
        addObject(startText,465,131);
        enter enter = new enter();
        addObject(enter,428,608);
        Cometa cometa = new Cometa();
        addObject(cometa,618,377);
        Cometa2 cometa2 = new Cometa2();
        addObject(cometa2,240,300);
        Cometa2 cometa22 = new Cometa2();
        addObject(cometa22,129,508);
        Cometa2 cometa23 = new Cometa2();
        addObject(cometa23,344,431);
    }
    
    public void act(){
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new Espacio());
    }
}
