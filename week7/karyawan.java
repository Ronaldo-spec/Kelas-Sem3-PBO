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
public class karyawan {
    public String nama,alamat,jk;
    public int umur,gaji;
    
    public karyawan(){
        
    }
    public karyawan(String Nama, String Alamat,String Jk,int Umur,int Gaji){
        nama=Nama;
        alamat=Alamat;
        jk=Jk;
        umur=Umur;
        gaji=gaji;
    }
    public void tampilDatakaryawan(){
        System.out.println("Nama                : "+nama);
        System.out.println("Alamat              : "+alamat);
        System.out.println("Jenis Kelamin       : "+jk);
        System.out.println("Umur                : "+umur);
        System.out.println("Gaji                : "+gaji);
        
    }
}
