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
public class rectangle extends shape{
    protected double width;
    protected double length;
    
    public rectangle(){
        
    }
    public rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    public rectangle(double width,double length,String color,boolean filled){
         this.width=width;
        this.length=length;
        super.color=color;
        super.filled=filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getPerimeter() {
        return 2*length + 2*width;
    }

    @Override
    public String toString() {
        return "------------Rectangle------------"+"\n"
                + "Color    :" + getColor() +"\n"
                + "Filled   :" + isFilled()+"\n"
                + "Width    :" + width +"\n"
                + "Length   :" + length;
    }
}
