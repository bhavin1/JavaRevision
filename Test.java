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
public class Test {
    int a, b;
    
    Test(int i, int j)
    {
        a = i;
        b = j;
    }
    
    //Pass an Object
    void PassObject(Test o)
    {
        o.a *= 2;
        o.b /= 2;
    }
}

class PassOb
{
    public static void main(String[] args) {
        Test ob1 = new Test(15, 20);
        ob1.PassObject(ob1);
        System.out.println(ob1.a + " " + ob1.b);
    }
}
