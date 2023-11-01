import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fogo extends ilumimi
{
    GifImage myGif = new GifImage("fogo.gif");
    
    /**
     * Act - do whatever the fogo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        setImage(myGif.getCurrentImage());
        acertarAlvo();
    }
    
    public void moveAtaque()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() - Math.cos(angle));
        int y = (int) Math.round(getY() + Math.sin(angle));
        
        setLocation(x,y);
    }
    
    public void acertarAlvo(){
        Actor b = getOneIntersectingObject(dipper.class);
        
        if(b != null){
            Counter2 counter = (Counter2) getWorld().getObjects(Counter2.class).get(0);
            counter.add(1);
            
            getWorld().removeObject(b);
            getWorld().removeObject(this);
        }
    }
}
