/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceLatihan;

/**
 *
 * @author Bedman
 */
public class singa  extends Binatang implements IKarnivora {
     public String suara;
     public String warnaBulu;

    public singa(String nama, int jmlKaki,String suara,String warnaBulu) {
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Jenis Hewan        : Karnivora");
        System.out.println("Makanan            : Daging");
    }
     @Override
    public void displayBinatang(){
         System.out.println("Nama               : "+nama);
         System.out.println("Jumlah Kakinya     : "+jmlKaki);
         System.out.println("Suaranya           : "+suara);
         System.out.println("Warna hewan ini    : "+warnaBulu);
    }
    public void displayData(){
        displayMakan();
        displayBinatang();
        System.out.println("==============================================");
    }
    
}
