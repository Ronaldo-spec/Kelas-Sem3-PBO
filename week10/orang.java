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
public class orang {
    private String nama;
    private hewan hewanPeliharaan;
    
    public orang(String nama){
        this.nama=nama;
    }
    public void peliharaanHewan(hewan hewanPeliharaan){
        this.hewanPeliharaan=hewanPeliharaan;
    }
    public void ajakPeliharaanJalan(){
        System.out.println("Namaku "+this.nama);
        System.out.println("Hewan peliharaanku berjalan dengan cara ");this.hewanPeliharaan.bergerak();
        System.out.println("==============================================");
    }
}
