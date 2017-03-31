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
public class Box {
    double width;
    double height;
    double depth;
    
    double volume()
    {
        return width * height * depth;
    }
    
    void setDimension(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
}
