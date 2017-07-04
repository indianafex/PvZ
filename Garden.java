import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Garden extends World
{
    private MouseInfo mouse = Greenfoot.getMouseInfo();
    private long lastFallingTime;
    private int fallingSpeed = 5000;
    private int sun = 0;
    
    public Garden()
    {    
        super(1200, 800, 1);
        MouseInfo m = Greenfoot.getMouseInfo();
        
    }
    
    public void act() {
        if(System.currentTimeMillis() > (lastFallingTime + fallingSpeed)) {
            sun+=25;
            lastFallingTime = System.currentTimeMillis();
        }
        showText("Sun: " + sun, 200, 100);
    }
    
    public void fall() {
        
    }
    
    public void changeSun(int Sun) {
        sun+=Sun;
    }
    
}