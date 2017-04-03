/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.revision;

/**
 *
 * @author Bhavin
 */
public class Stack {
    private int stck[] = new int[10];
    private int tos;
    
    //initialise top to the stack
    Stack()
    {
        tos = -1;
    }
    
    //Push an item on top of the stack
    void push(int i)
    {
        if(tos == 9)
        {
            System.out.println("Stack is full.");
        }
        else
        {
            stck[++tos] = i;
        }
    }
    
    //Pop and item from the stack
    int pop()
    {
        if(tos < 0){
            System.out.println("Stack is Underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }
}
