import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{

    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    public int temp = 50;
    public int temp1 = 50;
    public int temp2 = 50;
    public void act(){
        temp--;
        //Diálogo 1
        if(Greenfoot.isKeyDown("enter") && (temp < 1)){
            setBackground(new GreenfootImage("1.png"));
            temp1--;
        }
        //Diálogo 2
        if (Greenfoot.isKeyDown("enter") && (temp1 < 1)){
            setBackground(new GreenfootImage("2.png"));
            temp2--;
        }
        //Iniciar o jogo
        if (Greenfoot.isKeyDown("enter") && (temp2 < 1)){
            Mundo world = new Mundo();
            Greenfoot.setWorld(world);
        }
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
    }
}
