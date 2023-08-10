/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu6;

/**
 *
 * @author Bedman
 */
public class classBB extends ClassAA{
    private int z;
    
    public void setZ(int z){
        this.z=z;
    }
    public void getNilaiZ(){
        System.out.println("Nilai Z: "+z);
    }
    public void getJumlah(){
        System.out.println("Jumlah: "+(super.x+y+z));
    }
}
