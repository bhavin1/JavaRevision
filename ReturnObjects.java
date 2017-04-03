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
public class ReturnObjects {
    public static void main(String[] args) {
        createObject t1 = new createObject(1234);
        createObject t2 = t1.incrByTen();
        t2 = t2.incrByTen();
        System.out.println(t2.a);
    }
}

class createObject
{
    int a;

    createObject(int i) {
        a = i;
    }

    createObject incrByTen()
    {
        createObject t = new createObject(a + 10);
        return t;
    }
    
    
    
}
