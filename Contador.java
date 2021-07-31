import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Contador here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Contador extends Actor
{
    /**
     * Act - do whatever the Contador wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int puntos = 0;
    public Contador()
    {
        setImage(new GreenfootImage("Puntos: " + puntos, 26, Color.BLACK, Color.WHITE));
    }
    public void act()
    {
        setImage(new GreenfootImage("Puntos: " + puntos, 26, Color.BLACK, Color.WHITE));
        ganaste();
    }
    public void sumarPuntos()
    {
        puntos++;
    }
    public void ganaste()
    {
        if(puntos == 10){
            getWorld().addObject(new ganaste(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
