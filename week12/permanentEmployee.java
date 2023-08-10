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
public class permanentEmployee extends employee implements payable{
private int salary;
    public permanentEmployee(String name,int salary){
        this.name=name;
        this.salary=salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
   
    
    @Override
    public int getPaymentAmount() {
        return (int) (salary+0.05*salary);
    }
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo()+"\n";
        info+= "Registered as permanent employee with salary "+salary;
        return info;
    }
    
    
}
