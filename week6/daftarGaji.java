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
public class daftarGaji extends Pegawai {
Pegawai [] listPegawai;
public int x = 0;

    public daftarGaji(int jumlahPegawai){
        listPegawai = new Pegawai[jumlahPegawai];
    }
    public void addPegawai(Pegawai pegawai){
        listPegawai[x]=pegawai;
        x++;
    }
    public void printSemuaGaji(){
        for (int i = 0; i < x; i++) {
            System.out.print(listPegawai[i].getNama()+" Bergaji: ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}
