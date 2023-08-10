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
public class Pegawai {
    String nip;
    String nama;
    String alamat;
    
    public Pegawai(){
        
    }
    
    public void Pegawai(String NIP,String Nama,String Alamat){
        nip=NIP;
        nama=Nama;
        alamat=Alamat;
    }
    public void setNama(String Nama){
        nama=Nama;
    }
    public String getNama(){
        return nama;
    }
   public int getGaji(){
       return 100000;
   }
}
