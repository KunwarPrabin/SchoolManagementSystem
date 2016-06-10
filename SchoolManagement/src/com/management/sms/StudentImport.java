/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.management.sms;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class StudentImport {

    String[] names = new String[10];
    int counter = 0;
    Scanner input;
    
    //constructor
    public StudentImport(Scanner input) {
        this.input = input;
    }

    public void addStudent() {
        while (true) {
            System.out.println("Add Student");
            System.out.println("Enter Name");
            names[counter] = input.next();
            counter++;
            System.out.println("You Have" + (10 - counter) + "names left to add.");
            System.out.println("Do You Want To continue[Y/N]:");
            if (input.next().equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void deleteStudent() {
        System.out.println("Delete");
        showAll();
        System.out.println("Enter the name to delete: ");
        String name = input.next();
        //int counter1 = 0;
        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                names[i] = null;
                counter--;
                System.out.println("You Have" + (10 - counter) + "names left to add.");
                // counter1 = 1;
                break;

            }
        }
    }

    public void showAll() {
        System.out.println("Show All");
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                System.out.println(names[i]);
            }
        }
    }

    public void search() {
        while (true) {
            System.out.println("Enter any text to search:");
            String name = input.next();
            boolean found = false;
            for (int i = 0; i < names.length; i++) {
                if (names[i] != null && names[i].contains(name)) {
                    System.out.println(names[i]);
                    found = true;

                }
            }

            if (!found) {
                System.out.println("No Name Found");
                System.out.println("Do you want to search again[Y/N]:");
                if (input.next().equalsIgnoreCase("n")) {
                    break;
                }
            }
        }
    }
}
