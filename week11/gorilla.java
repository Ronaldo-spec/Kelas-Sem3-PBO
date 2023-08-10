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
public class gorilla extends Binatang{
    public String suara;
    public String warnaBulu;
   
    public gorilla(String nama, int jmlKaki, String suara,String warnaBulu) {
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }
    public void displayMakan(){
        System.out.println("Jenis Hewan        : Omnivora");
        System.out.println("Makanan            : Segala");
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
