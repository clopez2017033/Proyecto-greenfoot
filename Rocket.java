import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    private int speed;
    
    public Rocket(int v){
        speed = v;
    }
    
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("right")){
            move(4);
        }else if(Greenfoot.isKeyDown("left")){
            move(-4);
        }else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+4);
        }else if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-4);
        }else{
            setLocation(getX(),getY()-2);
        }
        
        checkCollision();
    }
    
    public void checkCollision(){
        Actor collided = getOneIntersectingObject(Asteroide.class);
        if (collided != null)
        {
          World myWorld = getWorld();
          getWorld().removeObject(collided);
          gameOver gameover = new gameOver();
          myWorld.addObject(gameover, myWorld.getWidth()/2, myWorld.getHeight()/2);
          getWorld().removeObject(this);
          Greenfoot.stop();
        }
    }
    
    public void aumentaVelocidad(){
        speed++;
    }
    
}
