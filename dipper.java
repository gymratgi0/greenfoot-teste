import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dipper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dipper extends Actor
{
    public int speed = 3;
    private int sTimer = 0;
    public int vida = 1000;
    
    /**
     * Act - do whatever the dipper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        movPerso1();
    }

    public void movPerso1(){
        
        if (Greenfoot.isKeyDown("w")) {
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")) {
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")) {
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")) {
            this.setLocation(this.getX() + speed, this.getY());
        }
        if (Greenfoot.isKeyDown("r") && (sTimer == 0)){
            sTimer ++;
            getWorld().addObject(new espadada(), getX() + 130, getY() + 30);
        }
        else{
            if(!Greenfoot.isKeyDown("r")){
                sTimer = 0;
            }
        }
    }
    
    public void acertarAlvo(){
        Actor b = getOneIntersectingObject(ilumimi.class);
        
        if(b != null){
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            
            getWorld().removeObject(b);
            getWorld().removeObject(this); 
            }
        }
    }

