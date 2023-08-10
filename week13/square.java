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
public class square extends rectangle{
    protected double side;
    
    public square(){
        super();
    }
    public square(double side){
        super(side,side);
    }
    public square(double side,String color,boolean filled){
        super(side,side);
        super.color=color;
        super.filled=filled;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
       this.side=side;
    }
    @Override
     public void setWidth(double width){
        this.width=width;
    }
    @Override
     public void setLength(double length){
        this.length=length;
    }
     @Override
    public String toString() {
         return "------------Square------------"+"\n"
                 + "Color   :" + getColor() +"\n"
                 + "Filled  :" + isFilled() +"\n"
                 + "Width   :" + getWidth();
    }
}
