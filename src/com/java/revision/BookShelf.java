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
public class BookShelf {
    
    public static void main(String[] args) {
        Book b = new Book();
        
        b.Title = "Java for Beginers";
        b.BookNumber = 1;
        b.Author = "Johhny Page";
        
        System.out.println(b.Title + " " + b.Author + " " + b.BookNumber + ".");
    }
}
