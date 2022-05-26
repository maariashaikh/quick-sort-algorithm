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

public class SinglyLinkedList<E> {
        //-----------NESTED NODE CLASS----------------//
      private static class Node <E>
           {
               private E element; //reference to the element stored at this node
               
               private Node<E> next; //reference to the subsequent node in the list
               
               /** ------CONSTRUCTOR------
                you need to give it the date (element) of the node and the pointed to the next node **/
               public Node(E e, Node<E> n) 
               {    
                   element = e; // data of the node
                   next = n; //pointer to next node
               }
               
               public E getElement(){return element;}
               
               public Node<E> getNext(){return next;}
               
               public void setNext(Node<E> n)//method to allow to change the value of the next node
               {
                   next = n;
               }
               
           }
    //-----------END OF NESTED NODE CLASS----------------//    
    
    //=============== METHODS===============//
    
    //instance variables of the Singly Linked List
    private Node<E> head = null; //head node of the list
    private Node<E> tail = null; //last node of the list
    private int size = 0; //number of nodes in the list, initially at zero, and to be incremented (or filled)
    
    public SinglyLinkedList(){} //constructs initially emply list
    
    //===========ADDING METHODS: ====================//
    public int size(){return size;}
    public boolean isEmpty(){return size==0;}
    
    public void addFirst(E e)
    {
        head = new Node<>(e, head); //adds element e to the front of the list, "head" is a pointed to the head
        
        if(size ==0)
            tail = head;//special case: new node becomes the tail also
        size++; // incrementing the size of the list
    }
    
    public void addLast(E e)//add element e to the end of the list
    {
        Node<E> newest = new Node<E>(e, null);//node will eventually be the tail (containing data "e" and pointing to null 
        
        if(isEmpty())
            head = newest; //special case: previously empty list
        else
            tail.setNext(newest);//adding new node after existing tail
        tail = newest;//new node becomes the tail
        size++;
    }
    public E first(){ //returns (but does not remove) the first element
        if(isEmpty()) return null;
        return head.getElement();
    }
    public E removeFirst(){
        if(isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
            return answer;        
    }
    
    public static void printList()
    {   
        SinglyLinkedList list = new SinglyLinkedList();
        Node thisNode = list.head;
        
        System.out.println("Printing the singly linked list: ");
        
        while(thisNode != null) //prints each node (while it is not null)
        {
            System.out.print(thisNode.element + "  ");
            
            thisNode = thisNode.next;
        }
    }
    
}