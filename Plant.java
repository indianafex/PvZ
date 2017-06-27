import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Plant extends Actor
{
    private int attackSpeed;
    private int hp;
    private int cost;
    private long lastFired;
    private String type;
    
    public Plant(int attackSpeed, int hp, int cost, String type) {
        this.attackSpeed = attackSpeed;
        this.hp = hp;
        this.cost = cost;
        lastFired = System.currentTimeMillis();
        this.type = type;
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
        getWorld().addObject(p, getX(), getY());
    }
}
