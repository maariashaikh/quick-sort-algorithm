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
import java.util.*;

public class PointComparator<K> implements Comparator<K>{
    
    int xa,xb,ya,yb;
    
    public int compare(Object a, Object b) throws ClassCastException{
        xa = ((Point) a).getX();
        ya = ((Point) a).getY();
        xb = ((Point) b).getX();
        yb = ((Point) b).getY();
        
        if(xa != xb){ return (xa - xb);}
        else{ return (ya - yb);}
    }
}
