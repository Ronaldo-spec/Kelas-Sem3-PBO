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
public class Laptop extends Komputer{
    
    public String jnsBaterai;
    
    public Laptop(){
        
    }
    public Laptop(String merk, int kecProc,int sizeMemo,String jnsProc,String JnsBaterai){
        super(merk,kecProc,sizeMemo,jnsProc);
        jnsBaterai=JnsBaterai;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Battery Type    : "+jnsBaterai);
    }
}
