/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab10;

/**
 *
 * @author sobiya2
 */
public class Point<K>{
    protected int xc, yc;
    
    public Point(int x, int y){
        xc = x;
        yc = y;
    }
    
    public int getX(){
        return xc;
    }
    
    public int getY(){
        return yc;
    }
    public void print(){
        int x = getX();
        int y = getY();
        System.out.println("(" + x + "," +  y + ")");
    }
}
