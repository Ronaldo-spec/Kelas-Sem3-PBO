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
public class Windows extends Laptop{
    
    public String fitur;
    
    public Windows(){
        
    }
    public Windows(String merk,int kecProc,int sizeMemo,String jnsProc,String jnsBaterai,String fitur){
        super(merk,kecProc,sizeMemo,jnsProc,jnsBaterai);
        this.fitur=fitur;
    }
    public void tampilWindows(){
        System.out.println("==================== WINDOWS ====================");
        super.tampilLaptop();
        System.out.println("Features        : "+fitur);
    }
}
