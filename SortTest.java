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

public class SortTest {
    public static void main(String[] args){
        
        //LinkedList<Point> points = new LinkedList<>();
        LinkedQueue<Point> points = new LinkedQueue<>();
        
        Point point1 = new Point(5,6);
        Point point2 = new Point(7,10);        
        Point point3 = new Point(50,4);
        Point point4 = new Point(7,3);


        points.enqueue(point1);
        points.enqueue(point2);
        points.enqueue(point3);
        points.enqueue(point4);
        

        System.out.println("Unsorted points: ");
        while (points.size() != 0)
            points.dequeue().print();
        
        
        points.enqueue(point1);
        points.enqueue(point2);
        points.enqueue(point3);
        points.enqueue(point4);
              

        
        Sort.quickSort(points, new PointComparator());
    
        System.out.println("Sorted Points: ");
        while (points.size() != 0)
            points.dequeue().print();

        }
        
    }
        