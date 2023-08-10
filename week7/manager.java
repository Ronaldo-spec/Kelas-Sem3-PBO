/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

/**
 *
 * @author Bedman
 */
public class manager extends karyawan{
    public int tunjangan;
    
    public manager (){
        
    }
    public void tampilDataManager(){
        super.tampilDatakaryawan();
        System.out.println("Tunjangan           : "+tunjangan);
        System.out.println("Total Gaji          : "+(super.gaji+tunjangan));
    }
}
