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
public class Mac extends Laptop{
    
    public String security;
    
    public Mac(){
        
    }
    public Mac (String merk,int kecProc,int sizeMemo,String jnsProc,String jnsBaterai,String security){
        super(merk,kecProc,sizeMemo,jnsProc,jnsBaterai);
        this.security=security;
    }
    public void tampilMac(){
        System.out.println("==================== MACBOOK ====================");
        super.tampilLaptop();
        System.out.println("Security        : "+security);
    }
}
