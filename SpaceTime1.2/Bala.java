import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bala here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bala extends Nave
{
    /**
     * Act - do whatever the Bala wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      Movimiento();
     
    
           //removeTouching(Asteroide.class);
        
    }    
    public void Movimiento()
    {
        int y=getY();
        y=y-2;
        setLocation(getX(), y);
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }
   
}
