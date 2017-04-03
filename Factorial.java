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
public class Factorial {
    //This is a recursive method
    int fact(int i)
    {
        int result;
        
        if(i <= 1){
            return i;
        }
        else{
            result = fact(i-1)* i;
            return result;
        }
    }
}
