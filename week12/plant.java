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
public class plant {
     public void doDestroy(destroyable d){
        if(d instanceof walkingZombie){
            walkingZombie wz = (walkingZombie)d;
            wz.destroyed();
        }else if(d instanceof jumpingZombie){
            jumpingZombie jz = (jumpingZombie)d;
            jz.destroyed();
        }else if(d instanceof barrier){
            barrier b = (barrier)d;
            b.destroyed();
        }
    }
}
