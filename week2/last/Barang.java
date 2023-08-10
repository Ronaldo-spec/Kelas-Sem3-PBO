
package pbo.minggu2;
import java.util.Scanner;
public class Barang {
    String namaBarang,kodeBarang;
    int hargaDasar,hargaJual;
    float diskon;
    public static float Diskon;
    Barang(){
        
    }
    public void Barang (String nb,int hd,String kb,float Diskkon){
        namaBarang=nb;
        hargaDasar=hd;
        kodeBarang=kb;
        diskon=Diskkon/100;
    }
    public void hitungHargaJual(){
        hargaJual=(int) (hargaDasar-(diskon*hargaDasar));
    }
    public void tampilData(){
        System.out.println("=======NOTA PEMBELIAN=======");
        System.out.println("Kode Barang     : "+kodeBarang);
        System.out.println("Nama            : "+namaBarang);
        System.out.println("Harga           : Rp. "+hargaDasar);
        System.out.println("Jumlah Diskon   : "+Diskon+"%");
        System.out.println("Harga Jual      : Rp. "+hargaJual);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Barang brg = new Barang();
        System.out.print("Masukkan Kode Barang: ");
        String kode=input.next();
        System.out.print("Masukkan Nama Barang: ");
        String nama = input.next();
        System.out.print("Harga Dasar Barang: Rp. ");
        int harga = input.nextInt();
        System.out.print("Jumlah Diskon(%): ");
        Diskon = input.nextFloat();
        brg.Barang(nama, harga, kode, Diskon);
        brg.hitungHargaJual();
        brg.tampilData();
    }
   
}
