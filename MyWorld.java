import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Jugador jugadorAzul = new Jugador(0,0,0,255);
    Jugador jugadorVerde = new Jugador(4,0,255,0);
    Contador contadorAzul = new Contador();
    Contador contadorVerde = new Contador();
    int count = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 800, 1); 
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(jugadorAzul, 650, 750);
        addObject(jugadorVerde, 150, 750);
        addObject(contadorAzul, 720, 50);
        addObject(contadorVerde, 50, 50);
    }
    public void act()
    {
        count++;
        if(count > 100){
            addObject(new Comida(255, 0, 0), Greenfoot.getRandomNumber(getWidth() -1), Greenfoot.getRandomNumber(getHeight() -1 ));
            count = 0;
    }   }
}
