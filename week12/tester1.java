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
public class tester1 {
    public static void main(String[] args) {
        permanentEmployee pemp = new permanentEmployee("Mysterio", 500);
        internshipEmployee iemp = new internshipEmployee("Batista", 5);
        electricityBill eBill = new electricityBill(5, "A-1");
        employee e;
        payable p;
        e = pemp;
        e= iemp;
        p = pemp;
        p=eBill;
    }
}
