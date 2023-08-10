/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceLatihan;

/**
 *
 * @author Bedman
 */
public class pascaSarjana  extends  mahasiswa implements iCumLaude, IBerprestasi{
    
    public pascaSarjana(String nama){
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan TESIS");
    }

    @Override
    public void meraihIPKTertinggi() {
        System.out.println("IPK ku mencapai 4,00");
    }
    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya juara kompetisi Nasional");
    }

    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("saya menerbitkan artikel jurnal Nasional");
    }
     public void menjuaraiKompetisi1() {
        System.out.println("Saya juara kompetisi International");
    }

    @Override
    public void membuatPublikasiIlmiah1() {
        System.out.println("saya menerbitkan artikel jurnal International");
    }
}
