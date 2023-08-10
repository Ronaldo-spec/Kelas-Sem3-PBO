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
public class staff extends karyawan {

    public int lembur, potongan;

    public staff() {

    }

    public staff(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan) {
        super(nama, alamat, jk, umur, gaji);
        this.lembur = lembur;
        this.potongan = potongan;
    }
    public void tampilDataStaff(){
        super.tampilDatakaryawan();
        System.out.println("Lembur              : "+lembur);
        System.out.println("Potongan            : "+potongan);
        System.out.println("Total Gaji          : "+(gaji+lembur-potongan));
    }
}
