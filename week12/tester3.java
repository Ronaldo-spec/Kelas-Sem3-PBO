/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12;

import minggu12.employee.payable;

/**
 *
 * @author Bedman
 */
public class tester3 {
    public static void main(String[] args) {
        permanentEmployee pemp = new permanentEmployee("Hendo", 500);
        internshipEmployee iemp = new internshipEmployee("Mou", 5);
        electricityBill eBill = new electricityBill(5, "A-1");
        employee e[]={pemp,iemp};
        payable p[]={pemp,eBill};
        employee e2[]={pemp,iemp,eBill};
    }
}
