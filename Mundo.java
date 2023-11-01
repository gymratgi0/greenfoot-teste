import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mundo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("music.mp3");
    
    public void started()
    {
        bgMusic.playLoop();
    }
    public void stopped()
    {
        bgMusic.pause();
    }
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Mundo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,116,36);
        Counter2 counter2 = new Counter2();
        addObject(counter2,711,31);
        dipper dipper = new dipper();
        addObject(dipper,105,363);
        ilumimi ilumimi = new ilumimi();
        addObject(ilumimi,701,391);
    }
    
    /*public void ganhador(){
        if (dipper ){
            setBackground(new GreenfootImage("DipperVen.png"));
        }
    }*/
}
