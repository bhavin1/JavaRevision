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
public class BoxDemo {

    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        mybox1.setDimension(10, 20, 15);
        mybox2.setDimension(3, 6, 9);
        // display volume of first box
        System.out.println("Volume of mybox1 is " + mybox1.volume());
        
        // display volume of second box
        System.out.println("Volume of mybox1 is " + mybox2.volume());
    }
}
