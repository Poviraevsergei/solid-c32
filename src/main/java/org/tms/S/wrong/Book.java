package org.tms.S.wrong;

public class Book {
    private String title;
    private String author;
    private int year;
    
    public void saveBookToDatabase(){
        //логика сохранения книги в БД
    }

    public void printBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
