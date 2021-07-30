import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Espacio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Espacio extends World
{
        GreenfootSound myMusic = new GreenfootSound("Musica Retro Videojuegos Sin Copyright.mp3");
    
        private counter score;
        private counter level;
        
        private int velocidad;
        private int nivel;
        private Rocket rocket;
        private int numeroAsteroides;
        
        /**
         * Constructor for objects of class Espacio.
         * 
         */
        public Espacio()
        {    
            // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
            super(900, 700, 1);
            
            velocidad = 2;
            
            score = new counter("Score: ");
            rocket = new Rocket(velocidad);
            
            addObject(rocket, 450, 650);
            addObject(score, 100, 100);
            
        }
        
        public static void setTimeout(Runnable runnable, int delay){
            new Thread(() -> {
                try {
                    Thread.sleep(delay);
                    runnable.run();
                }
                catch (Exception e){
                    System.err.println(e);
                }
            }).start();
        }
        
        public void act(){
            myMusic.play();
            if(numeroAsteroides <= 6){
                anadirAsteroides();
                setTimeout(() -> anadirAsteroides(), 2500);
                setTimeout(() -> anadirAsteroides(), 5000);
            }
        }
        
        public int getRandomNumber(int start,int end){
           int normal = Greenfoot.getRandomNumber(end-start+1);
           return normal+start;
        }
        
        public void aumentarPuntuacion(int valor){
            score.add(valor);
        }
        
        public void disminuirRivales(){
            numeroAsteroides--;
        }
        
        public void anadirAsteroides(){
            int space = getRandomNumber(50,900);
            addObject(new Asteroide(velocidad),space, 10);
            numeroAsteroides ++;
        }
    }

