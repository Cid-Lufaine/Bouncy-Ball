import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    
    Bear bear1 =new Bear();
    Bear bear2 =new Bear();
    Bee bee = new Bee();
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(bear1,100,100);
        addObject(bear2,200,100);
        addObject(bee,300,100);
    }
}
