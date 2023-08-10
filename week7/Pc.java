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
public class Pc extends Komputer{
    
    public int ukuranMonitor;
    
    public Pc (){
        
    }
    public Pc(String merk,int kecProc,int sizeMemo,String jnsProc,int ukuranMonitor){
        super(merk,kecProc,sizeMemo,jnsProc);
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("==================== Private Computer ====================");
        super.tampilData();
        System.out.println("Monitor Size        : "+ukuranMonitor+" inch");
    }
}
