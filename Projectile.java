import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    
    public void act() 
    {
        move(25);
        if(isAtEdge()) {
            getWorld().removeObject(this);
        }
    }    
}