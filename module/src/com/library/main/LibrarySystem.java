package com.library.main;

import com.library.services.LibraryServices;

import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LibraryServices lib=new LibraryServices();

        while(true){
            System.out.println("/n.......Library Menu......");
            System.out.println("1. Add Book...");
            System.out.println("2. Remove Book...");
            System.out.println("3. Search Book...");
            System.out.println("4. Show All Book...");
            System.out.println("5. Exit...");
            System.out.println("Choose Option");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    lib.addbook();
                    break;
                case 2:
                    lib.removebook();
                    break;
                case 3:
                    lib.searchBook();
                    break;
                case 4:
                    lib.showallbook();
                    break;
                case 5:
                    System.out.println("Program end");
                default:
                    System.out.println("choice inveld");
            }
        }
    }
}
