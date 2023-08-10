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
public abstract class shape {
    protected String color;
    protected boolean filled;
    
    public shape(){
        
    }
    public shape (String color, boolean filled){
        
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
    
}
