import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Garden extends World
{
    private MouseInfo mouse = Greenfoot.getMouseInfo();
    private long lastFallingTime;
    private int fallingSpeed;
    
    public Garden()
    {    
        super(1200, 800, 1);
    }
    
    public void act() {
        if(System.currentTimeMillis() > (lastFallingTime + fallingSpeed)) {
            fall();
            lastFallingTime = System.currentTimeMillis();
        }
    }
    
    public void fall() {
        Sun s = new Sun();
        addObject(s, 0, (50));
    }
}