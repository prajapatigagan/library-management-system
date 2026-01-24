package com.library.services;

import com.library.model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryServices {
    Scanner sc= new Scanner(System.in);
    ArrayList<Book>books=new ArrayList<>();

    public void addbook(){
        sc.nextLine();
        System.out.println("Enter Book Title...");
        String title=sc.nextLine();

        System.out.println("Enter Book Id...");
        int id=sc.nextInt();

        System.out.println("Enter Author Name...");
        String author=sc.nextLine();

        books.add(new Book(title,id,author));
        System.out.println("Book Add Succssfully...");
    }
    public void removebook(){
        System.out.println("Enter book id to remove: ");
        int id=sc.nextInt();

        boolean found=false;
        for (int i = 0; i <books.size() ; i++) {
            if(books.get(i).getId()==id){
                System.out.println("remove: "+books.get(i));
                books.remove(i);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Book Not Found..");
        }
    }
    public void searchBook(){
        sc.nextLine();
        System.out.println("Enter Book Title To Search...");
        String title=sc.nextLine();

        boolean found=false;
        for (Book b:books){
            if(b.getTitle().equalsIgnoreCase(title)){
                System.out.println("book found: "+b);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Book Not Found");
        }
    }
    public void showallbook(){
        if(books.isEmpty()){
            System.out.println("no book in library");
        }
        else{
            for(Book b: books){
                System.out.println(b);
            }
        }
    }
}