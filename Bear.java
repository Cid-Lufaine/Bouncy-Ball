import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.Random;

public class Bear extends Actor
{
    
    private int offsetX ;
    private int offsetY ;
    private int speed = 5;
    private int counterAddObject;
    private Random random = new Random();
    private Bee bee;
    
    public Bear(){
        if(random.nextInt(5)<=3)
        {
            offsetX=1;
        }else{
            offsetX=-1;
        }
        if(random.nextInt(5)<=3)
        {
            offsetY=1;
        }else{
            offsetY=-1;
        }
        
        
        
        
    }
    

    public void act()
    {
        
        int x = getX();
        int y = getY();
        
        setLocation(x + offsetX*speed, y + offsetY*speed);
        
        if(isAtEdge()){
            if(getX()  >= 575 || getX() <= 0){
            offsetX *= -1;
            }
            if(getY() >= 375 || getY() <= 0){
            offsetY *= -1;
            }
            if(speed<20)
            {
                speed += (random.nextInt(5));
            }else{
                speed=5;
            }
        }
        
        
        bee = (Bee)getOneIntersectingObject(Bee.class);
        
        if(bee != null && counterAddObject == 0){
            counterAddObject = 60;
            
            World world =getWorld();
            
            world.addObject(new Boomb(),bee.getX(),bee.getY());
            
        }
        
        if(counterAddObject > 0){
            counterAddObject--;
        }
    }
}
