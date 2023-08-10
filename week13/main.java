
import kuis2.circle;
import kuis2.rectangle;
import kuis2.shape;
import kuis2.square;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bedman
 */
public class main {

    public static void main(String[] args) {

        circle c1 = new circle(14, "green", false);
        System.out.println(c1);
        circle c2 = new circle(21);
        System.out.println(c2);
        circle c3 = new circle(21, "red", true);
        System.out.println(c3);
        System.out.println("==========================================");
        System.out.println("Color       : " + c1.getColor());
        System.out.println("Filled      : " + c1.isFilled());
        System.out.println("Radius      : " + c1.getRadius());
        System.out.printf("Area         : " + c1.getArea() + "\n");
        System.out.printf("Perimeter    : " + c1.getPerimeter() + "\n");
        System.out.println("==========================================");
        System.out.println("");
        rectangle r1 = new rectangle(10, 5, "Golden Red", true);
        System.out.println(r1);
        rectangle r2 = new rectangle(6, 14);
        System.out.println(r2);
        rectangle r3 = new rectangle(21, 40, "Cream", false);
        System.out.println(r3);
        System.out.println("==========================================");
        System.out.println("Color       : " + r1.getColor());
        System.out.println("Filled      : " + r1.isFilled());
        System.out.println("Width       : " + r1.getWidth());
        System.out.printf("Length       : " + r1.getLength() + "\n");
        System.out.printf("Perimeter    : " + r1.getPerimeter() + "\n");
        System.out.println("==========================================");
        System.out.println("");
        square sq1 = new square(5, "Brown", false);
        System.out.println(sq1);
        square sq2 = new square(10);
        System.out.println(sq2);
        square sq3 = new square(15, "Silver", true);
        System.out.println(sq3);
        System.out.println("==========================================");
        System.out.printf("Area         : " + sq1.getArea() + "\n");
        System.out.printf("Perimeter    : " + sq1.getPerimeter() + "\n");
        System.out.println("==========================================");
    }
}
