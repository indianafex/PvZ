import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Zombie extends Actor
{
    private int hp;
    private int walkspeed;
    private int damage;
    
    public Zombie(int hp, int walkspeed, int damage)
    {
        this.hp = hp;
        this.walkspeed = walkspeed;
        this.damage = damage;
    }
    
    
    public void act() 
    {
      move(-6);
      if(getX()<10)
      {Greenfoot.stop();}
     
    } 
    
    public void s()
    {
      List<Projectile> projectiles = getObjectsInRange(40, Projectile.class);
      if(projectiles.size() >= 1)
      { this.hp=hp-projectiles.size();
         for(int i = 0; i < projectiles.size(); i++)
         {
             Greenfoot.getworld.removeObject(
             
             
            }
      }
    }
}
