package com.company;

import java.util.ArrayList;

interface searchBook{
    void search_by_name(String s);
    void search_by_author(String s);
    void search_by_pub_date(String s);

}
interface bookDB{
    public void addBook();
    public void deleteBook();
    public void addUser();
    public void deleteUser();
    public void issueBook();
}
class Book{
   public String bookName;
   public String ISBN;
   public String author;
   boolean isAvailable;
   Book(String bookName, String ISBN, String author,boolean isAvailable)
    {
        this.bookName = bookName;
        this.ISBN = ISBN;
        this.author = author;
        this.isAvailable = isAvailable;
    }
    public void displayBookDetails()
    {
        System.out.println("/nBook Name : "+bookName+"\nISBN: "+ISBN+"\nAuthor: "
                +author+"\nisAvailable: "+isAvailable);
    }
}
class novel extends Book{
    String type;
    novel(String bookName, String ISBN, String author, boolean isAvailable, String type) {
        super(bookName, ISBN, author, isAvailable);
        this.type = type;
    }
}

abstract class User implements searchBook {

    public abstract void create_user_details(int id, String name, int age);
}
class staff extends User
{
    int id;
    String name;
    int age;
    @Override
    public void search_by_name(String s) {
        System.out.println("Book searched by book name by staff");
    }
    @Override
    public void search_by_author(String s) {
        System.out.println("Book searched by author name by staff");
    }
    @Override
    public void search_by_pub_date(String s) {
        System.out.println("Book searched by published date by staff");
    }
    @Override
    public void create_user_details(int id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class Customer extends User
{
    int id;
    String name;
    int age;
    @Override
    public void search_by_name(String s) {
        System.out.println("Book searched by book name by customer");
    }

    @Override
    public void search_by_author(String s) {
        System.out.println("Book searched by author name by customer");
    }

    @Override
    public void search_by_pub_date(String s) {
        System.out.println("Book searched by published date by customer");
    }

    @Override
    public void create_user_details(int id,String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

class Librarian implements bookDB{


    @Override
    public void addBook() {
        System.out.println("\nBook Added successfully");
    }

    @Override
    public void deleteBook() {
        System.out.println("\nBook Deleted successfully");
    }

    @Override
    public void addUser() {
        System.out.println("\nUser Added successfully");
    }

    @Override
    public void deleteUser() {
        System.out.println("\nUser Deleted successfully");
    }

    @Override
    public void issueBook() {
        System.out.println("\nFirst check user detals then book will be successfully issued");
    }
}


public class Ques1 {
    public static void main(String[] args) {

        System.out.println("Library Management System ");
        Librarian lb=new Librarian();
        Customer customer=new Customer();

        lb.addUser();
        customer.search_by_author("xyz");
        lb.issueBook();
        novel n = new novel("xyz","sbn-102-01-34","abc",true,"fiction");
    }
}