
package pbo.minggu2;
import java.util.Scanner;
public class nomor1 {
    public String namaGame,nama;
    public int hargaSatuan,ID,total,lama;
    nomor1(){
        
    }
    public void harga(int Harga){
        hargaSatuan=Harga;
    }
    public void data(String Nama,String game,int id){
        nama=Nama;
        namaGame=game;
        ID=id;
    }
    public void lamaSewa(int Lama){
        lama=Lama;
    }
    public void total(){
        total=hargaSatuan*lama;
    }
    public void cetak (){
        System.out.println("=====NOTA PEMBAYARAN=====");
        System.out.println("Nama Member: "+nama);
        System.out.println("ID Member: "+ID);
        System.out.println("Game yang Disewa: "+namaGame);
        System.out.println("Total biaya Sewa: "+total);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        nomor1 n1 = new nomor1();
        System.out.println("Masukkan Data");
        System.out.print("Nama Member: ");
        String nama=input.next();
        System.out.print("Member ID: ");
        int id=input.nextInt();
        System.out.print("Nama Game: ");
        String game=input.next();
        System.out.print("Lama Sewa (hari): ");
        int lama=input.nextInt();
        System.out.print("Harga Sewa / Hari: Rp.");
        int hari = input.nextInt();
        n1.data(nama, game, id);
        n1.lamaSewa(lama);
        n1.harga(hari);
        n1.total();
        n1.cetak();
    }
}
