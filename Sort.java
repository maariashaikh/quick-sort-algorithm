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

public class Sort<K> {
    
    public static class DefaultComparator<K> implements Comparator<K>{
        
        //two elements of similar data types can be compared
        public int compare(K a, K b) throws ClassCastException{
            
            //if not comparable throw exception
            return((Comparable<K>) a).compareTo(b);
        }
    }
    public static <K> void merge(Queue<K> S1, Queue<K> S2, Queue<K> S, Comparator<K> comp ){
        
        while((!S1.isEmpty()) && (!S2.isEmpty())){
            if(comp.compare(S1.first(), S2.first())<0) 
                S.enqueue(S1.dequeue()); //take next element from S1
            else
                S.enqueue(S2.dequeue()); //take next element from S2
        }
        
        while(!S1.isEmpty()){
            S.enqueue(S1.dequeue()); //move any elements that remain in S1
        }
        while(!S2.isEmpty()){
            S.enqueue(S2.dequeue()); //move any elements that remain in S1
        }
    }
    /**Merge sort contents of queue*/
    public static <K> void mergeSort(Queue<K> S, Comparator<K> comp){
        
        
        int n = S.size();
        
        //base case 
        if(n < 2){
            return;
        }
        
        
        Queue<K> S1 = new LinkedQueue<>();
        Queue<K> S2 = new LinkedQueue<>(); 
        
        //add the first half of the original list 
        while(S1.size() < n/2){
            //S1.add(S.remove());
            S1.enqueue(S.dequeue());
        }
        while(!S.isEmpty()){
            S2.enqueue(S.dequeue());
        }
        //conquer (with recursion)
        mergeSort(S1, comp); //sort first half
        mergeSort(S2, comp); //sort second half
        //merge results
        merge(S1, S2, S, comp); // merge sorted halves back into original
        //add remaining to the second list 

    }
    
    public static <K> void quickSort(Queue<K> S, Comparator<K> comp){
        
        int n = S.size();
        if(n<2) return;
        
        K pivot = S.first();

        Queue<K> L = new LinkedQueue<>();
        Queue<K> E = new LinkedQueue<>();
        Queue<K> G = new LinkedQueue<>();        
        
        while(!S.isEmpty()){ //divide original into L,E and G

            K element = S.dequeue();            
            int c = comp.compare(element, pivot);
            if(c < 0){ //element less than pivot
       
                L.enqueue(element);                
            }
            else if(c == 0){ //element is equal to pivot
        
                E.enqueue(element);
            }
            else{ //element is greater than pivot
           
                G.enqueue(element);
            }
        }
        //conquer
        quickSort(L, comp); //sort elements less than pivot 
        quickSort(G, comp); //sort elements greater than pivot
        
        //concatenate results
        while(!L.isEmpty()){
            S.enqueue(L.dequeue());
        }
        while(!E.isEmpty()){
            S.enqueue(E.dequeue());

        }
        while(!G.isEmpty()){
            S.enqueue(G.dequeue());            

        }
        
    }
}
