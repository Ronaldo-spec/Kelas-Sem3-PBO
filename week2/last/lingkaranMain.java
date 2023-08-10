
package pbo.minggu2;
import java.util.Scanner;
public class lingkaranMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean ulang = true;
        lingkaran lg = new lingkaran();
        System.out.print("Masukkan diameter: ");
        lg.diameter=input.nextDouble();
        lg.jariJari();
        while (ulang){
            System.out.println("PILIHAN");
            System.out.println("1. Hitung Luas");
            System.out.println("2. Hitung Keliling");
            System.out.println("3. Selesai");
            int pilih = input.nextInt();
            switch (pilih){
                case 1:
                   System.out.println("Luasnya adalah: "+lg.hitungLuas());
                   break;
                case 2:
                     System.out.println("Kelilingnya adalah: "+lg.hitungKeliling());
                     break;
                case 3:
                    ulang = false;
            } 
    }
    }
}
