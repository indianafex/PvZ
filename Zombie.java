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
      move(-walkspeed);
      if(getX()<10)
      {Greenfoot.stop();}
      damage();
     
    } 
    
    public void damage()
    {
      List<Projectile> projectiles = getIntersectingObjects( Projectile.class);
      if(projectiles.size() >= 1)
      { 
          System.out.println("Getroffen");
          hp-=projectiles.size();
      removeTouching(Projectile.class);
      }
      if(hp==0)
      {getWorld().removeObject(this);
        }
    }
}
