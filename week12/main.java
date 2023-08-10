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
public class main {
    public static void main(String[] args) {
        walkingZombie wz = new walkingZombie(100, 2);
        jumpingZombie jz = new jumpingZombie(100,3);
        barrier b = new barrier(100);
        plant p = new plant();
        
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
        System.out.println("=============================");
        
        for (int i = 0; i < 4; i++) {
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);
            
        }
        System.out.println(""+wz.getZombieInfo());
        System.out.println(""+jz.getZombieInfo());
        System.out.println(""+b.getBarrierInfo());
    }
}
