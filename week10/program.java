/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10.abstractclass;

/**
 *
 * @author Bedman
 */
public class program {
    public static void main(String[] args) {
        kucing kucingKampung = new kucing();
        ikan lumba = new ikan();
        
        orang ani = new orang("Ani");
        orang budi = new orang("Budi");
        
        ani.peliharaanHewan(kucingKampung);
        budi.peliharaanHewan(lumba);
        
        ani.ajakPeliharaanJalan();
        budi.ajakPeliharaanJalan();
    }
}
