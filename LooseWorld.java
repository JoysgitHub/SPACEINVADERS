import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LooseWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LooseWorld extends World
{

    /**
     * Constructor for objects of class LooseWorld.
     * 
     */
    public LooseWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        addObject(new RestartButton(),200,300);
    }
}
