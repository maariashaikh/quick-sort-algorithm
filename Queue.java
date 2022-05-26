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
public interface Queue<E> {
    
    int size();
    boolean isEmpty();
    E first();
    void enqueue(E e);
    E dequeue();
}
