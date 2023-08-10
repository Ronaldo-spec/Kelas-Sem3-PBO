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
public class mainClass {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Gilbert");
        dosen.setSKS(10);
        
        Pegawai pegawai = new Pegawai();
        pegawai.setNama("Aldaman");
        
        daftarGaji dg = new daftarGaji(2);
        dg.addPegawai(dosen);
        dg.addPegawai(pegawai);
        dg.printSemuaGaji();
    }
}
