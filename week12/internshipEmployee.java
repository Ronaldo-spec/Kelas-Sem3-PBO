/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12;

/**
 *
 * @author Bedman
 */
public class internshipEmployee extends employee{
    private int length;
    
    public internshipEmployee(String name, int length){
        this.length=length;
        this.name=name;
    }
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length=length;
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info+="Registered as internship employee for "+length+" month(s)";
        return info;
    }
}
