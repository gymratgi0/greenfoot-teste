import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ilumimi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ilumimi extends Actor
{
    GifImage myGif = new GifImage("ilumimi.gif");
    public int speed = 3;
    private int sTimer = 0;
    public int vida = 10;
    
    /**
     * Act - do whatever the ilumimi wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movPerso2();
        setImage(myGif.getCurrentImage());
    }

    public void movPerso2(){
        
        if (Greenfoot.isKeyDown("up")) {
        this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("down")) {
        this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("left")) {
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            this.setLocation(this.getX() + speed, this.getY());
        }
        if (Greenfoot.isKeyDown("f") && (sTimer == 0)){
            sTimer ++;
            getWorld().addObject(new fogo(), getX() - 120, getY() + 20);
        }
        else{
            if(!Greenfoot.isKeyDown("f")){
                sTimer = 0;
            }
        }
    }
    
    public void acertarAlvo(){
        Actor b = getOneIntersectingObject(dipper.class);
        
        if(b != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            vida--;
            
            if(vida == 0){
                getWorld().removeObject(b);
                getWorld().removeObject(this); 
            }
        }
    }
}
