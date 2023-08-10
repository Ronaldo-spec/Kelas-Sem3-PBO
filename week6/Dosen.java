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
public class Dosen extends Pegawai {

    public int jumlahSKS;
    public int tarifSKS=100000;
public Dosen(){
    
}
    public void Dosen(String NIP, String Nama, String Alamat) {
        super.nip = NIP;
        super.nama = Nama;
        super.alamat = Alamat;
    }
    public void setSKS(int sks){
        jumlahSKS=sks;
    }
    @Override
    public int getGaji(){
     int total = jumlahSKS*tarifSKS;
     return total+super.getGaji();
    }
}
