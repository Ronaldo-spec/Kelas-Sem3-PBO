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
public class staffTetap extends staff {

    public String golongan;
    public int asuransi;

    public staffTetap() {

    }

    public staffTetap(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, String golongan, int asuransi) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        this.golongan = golongan;
        this.asuransi = asuransi;
    }

    public void tampilStaffTetap() {
        System.out.println("=============Data Staff Tetap=============");
        super.tampilDataStaff();
        System.out.println("Golongan            : " + golongan);
        System.out.println("Jumlah ASuransi     : " + asuransi);
        System.out.println("Gaji Bersih         : " + (gaji + lembur - potongan - asuransi));
    }
}
