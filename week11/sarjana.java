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
public class sarjana extends mahasiswa implements iCumLaude {

    public sarjana(String nama) {
        super(nama);
    }

    @Override
    public void lulus() {
        System.out.println("Skripsi ku sudah di Accept");
    }

    @Override
    public void meraihIPKTertinggi() {
        System.out.println("Semoga IPK ku 5,00");
    }
}
