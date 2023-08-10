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
public class tester2 {
    public static void main(String[] args) {
        permanentEmployee pemp = new permanentEmployee("Skipper", 500);
        employee e;
        e = pemp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("========================");
        System.out.println(""+pemp.getEmployeeInfo());
    }
}
