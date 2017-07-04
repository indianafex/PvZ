import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
      if(getObjectsInRange(40)=1)
      { this.hp=hp-1;
        }
    }
}
