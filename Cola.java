import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cola here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cola extends Actor
{
    /**
     * Act - do whatever the Cola wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g, b, jugador;
    int countLength = 0;
    static int azulLength = 1;
    static int verdeLength = 1;
    public Cola(int jugador, int r, int g, int b)
    {
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    public void act()
    {
        countLength++;
        if(countLength>15 && isTouching(Jugador.class)){
            getWorld().addObject(new Perdiste(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        if(jugador == 0 && countLength % azulLength == 0){
            getWorld().removeObject(this);
            azulLength++;
          }
        if(jugador == 4 && countLength % verdeLength == 0){
            getWorld().removeObject(this);
            verdeLength++;
        }
        
    }
}
