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
public class segitiga {
 int sudut;

 int totalSudut(int sudutA){
     return 180-sudutA;
 }
 int totalSudut(int sudutA,int sudutB){
     return 180-(sudutA+sudutB);
 }
 int keliling (int sisiA,int sisiB,int sisiC){
     return (sisiA+sisiB+sisiC);
 }
 double keliling(int sisiA,int sisiB){
      int keliling;
     double sisiC = Math.sqrt(Math.pow(sisiA,2)+Math.pow(sisiB,2));
     return keliling = (int)(sisiA+sisiB+sisiC);
 }
}
class Utama {
    public static void main(String[] args) {
        segitiga s = new segitiga();
        System.out.println("Sudut 1         : "+s.totalSudut(45));
        System.out.println("Sudur 2         : "+s.totalSudut(90, 45));
        System.out.println("Keliling 2 sisi : "+(double) s.keliling(90, 90));
        System.out.println("Keliling 3 sisi : "+s.keliling(80, 80, 80));
    }
}