/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author Bedman
 */
public class circle extends shape{
    
    protected double radius;
    
    public circle(){
        
    }
    public circle(double radius){
        this.radius=radius;
    }
    public circle(double radius, String color,boolean filled){
        this.radius=radius;
        super.color=color;
        super.filled=filled;
    }
    public double getRadius(){
        return this.radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
         return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "------------CIRCLE==========" +"\n"
                + "Color    : " + getColor() + "\n"
                + "filled   : " + isFilled() + "\n"
                + "radius   : " + radius;
    }
}
