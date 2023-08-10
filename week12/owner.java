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
public class owner extends employee implements payable{
    public void pay(payable p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        if (p instanceof electricityBill) {
            electricityBill eb = (electricityBill)p;
            System.out.println(""+eb.getBillInfo());
        } else if (p instanceof permanentEmployee){
            permanentEmployee pe = (permanentEmployee)p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmploye(employee e){
        System.out.println(""+e.getEmployeeInfo());
        if (e instanceof permanentEmployee) {
            System.out.println("You Have to Pay Them Monthly");
        } else {
            System.out.println("No Need to Pay Them");
        }
    }
}
