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
public class barrier implements destroyable{
    public int strength; 
    
    public barrier(int strength){
        this.strength=strength;
    }
    public void setStrngth(int strength){
        this.strength=strength;
    }
    public int getString(){
        return strength;
    }
    

    @Override
    public void destroyed() {
        int destroy = (int) (this.strength*0.2);
        this.strength -=destroy;
    }
    public String getBarrierInfo(){
        return "Barrier Strength: "+strength;
    }
}
