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
public class staffHarian extends staff {

    public int jmlJamKerja;

    public staffHarian() {

    }

    public staffHarian(String nama, String alamat, String jk, int umur, int gaji, int lembur, int potongan, int JmlJamKerja) {
        super(nama, alamat, jk, umur, gaji, potongan, lembur);
        jmlJamKerja = JmlJamKerja;
    }

    public void tampilStaffHarian() {
        System.out.println("=============Data Staff Harian=============");
        super.tampilDataStaff();
        System.out.println("Jumlah Jam Kerja    : " + jmlJamKerja);
        System.out.println("Gaji Berish         : " + ((gaji * jmlJamKerja) + lembur - potongan));
    }
}
