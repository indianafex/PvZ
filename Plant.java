import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Plant extends Actor
{
    private int attackSpeed = 2000;
    private int hp;
    private int cost = 10;
    private long lastFired;
    private String type;
    
    public Plant() {
        lastFired = System.currentTimeMillis();
        World w = getWorld();
        Garden g = (Garden)w;
        try {
            g.changeSun(cost);
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException thrown");
            System.out.println(w);
        }
        
    }
    
    public void act()
    {
        if(System.currentTimeMillis() > (lastFired + attackSpeed)) {
            shoot();
            lastFired = System.currentTimeMillis();
        }
    }
    
    public void shoot() {
        Projectile p = new Projectile();
        getWorld().addObject(p, getX() + 45, getY() - 30);
    }
}
