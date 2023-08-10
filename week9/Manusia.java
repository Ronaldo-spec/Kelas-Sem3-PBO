/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu9;

/**
 *
 * @author Bedman
 */
public class Manusia {
    void bernapas(){
        System.out.println("Manusia bernapas");
    }
    void makan (){
        System.out.println("Manusia makan");
    }
}
class Dosen extends Manusia{
    public void makan(){
        System.out.println("Dosen makan");
    }
    void lembur(){
        System.out.println("Dosen Lembur");
    }
}
class Mahasiswa extends Manusia{
    public void makan(){
        System.out.println("Mahasiswa makan");
    }
    void  tidur(){
        System.out.println("Mahasiswa tidur");
    }
}
class main {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        d.makan();
        m.makan();
    }
}

