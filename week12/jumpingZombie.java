/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12;

/**
 *
 * @author Bedman
 */
public class jumpingZombie extends zombie{
    
    public jumpingZombie(int health, int level){
        super.health=health;
        super.level=level;
    }
     @Override
    public void heal(){
        switch(this.level){
            case 1:
                this.health = (int)(this.health + (this.health * 0.3));
                break;
            case 2:
                this.health = (int)(this.health + (this.health*0.4));
                break;
            case 3:
                this.health = (int)(this.health + (this.health*0.5));
                break;
        }
    }
    @Override
    public void destroyed(){
        int destroy = (int)(this.health*0.1);
        this.health-= destroy;
    }
    @Override
    public String getZombieInfo(){
        System.out.println("JUMPING ZOMBIE");
        return "Health: "+health+"\n"
                +"Level: "+level+"\n"
                +"============================";
        
    }
}
