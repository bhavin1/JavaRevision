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
public class Book {
    String Title;
    int BookNumber;
    String Author;

    public Book(String Title, int BookNumber, String Author) {
        this.Title = Title;
        this.BookNumber = BookNumber;
        this.Author = Author;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setBookNumber(int BookNumber) {
        this.BookNumber = BookNumber;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getBookNumber() {
        return BookNumber;
    }

    @Override
    public String toString() {
        String str;
        return str = Title + Author + BookNumber;
    }
    
    
}
