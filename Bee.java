import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
public class Bee extends Actor
{
    
    private int offsetX ;
    private int offsetY ;
    private int speed = 5;
    private int counterAddObject;
    private Random random = new Random();
    
    public Bee (){
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
            if(getX() >= 575 || getX() <= 0){
            offsetX *= -1;
            }
            if(getY() >= 375 || getY() <= 0){
            offsetY *= -1;
            }
        }
        
        
        
    }
}
