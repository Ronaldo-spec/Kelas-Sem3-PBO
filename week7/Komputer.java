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
public class Komputer {
    public String merk,jnsProc;
    public int kecProc,sizeMemo;
    
    public Komputer(){
        
    }
    public Komputer(String Merk,int KecProc,int SizeMemo,String JnsProc){
        merk=Merk;
        kecProc=KecProc;
        sizeMemo=SizeMemo;
        jnsProc=JnsProc;
    }
    public void tampilData(){
        System.out.println("Merk            : "+merk);
        System.out.println("Processor Speed : "+kecProc+"GHz");
        System.out.println("Memory Size     : "+sizeMemo+"GB");
        System.out.println("Processor Type  : "+jnsProc);
    }
}
