import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Asteroide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Asteroide extends Actor
{
    public int speed;
    
    public Asteroide(int v){
        speed = v;
    }
    
    /**
     * Act - do whatever the Asteroide wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(), getY() + speed);
        if( getY() >= getWorld().getHeight() - 1 ){
            Espacio juego = (Espacio) getWorld();
            juego.removeObject(this);
            juego.aumentarPuntuacion(10);
            juego.disminuirRivales();
        }
    } 
}
