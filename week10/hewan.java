/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu10.abstractclass;

/**
 *
 * @author Bedman
 */
public abstract class hewan {
    private int umur;
    
    protected hewan(){
        this.umur=0;
    }
    public void bertambahUmur(){
        this.umur+=1;
    }
    public abstract void bergerak();
}
