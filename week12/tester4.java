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
public class tester4 {
    public static void main(String[] args) {
        owner ow = new owner();
        electricityBill eBill = new electricityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("=================================");
        
        permanentEmployee pemp = new permanentEmployee("Hulk", 500);
        ow.pay(pemp);
        System.out.println("=================================");
        
        internshipEmployee iemp = new internshipEmployee("Widow", 5);
        ow.showMyEmploye(pemp);
        System.out.println("=================================");
        ow.showMyEmploye(iemp);
    }
}
