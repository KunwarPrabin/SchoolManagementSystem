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
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentImport imp = new StudentImport(input);
        while (true) {
            System.out.println("<=WELCOME TO SCHOOL MANAGEMENT SYSTEM=>");
            System.out.println("1.Add Student");
            System.out.println("2.Delete Student");
            System.out.println("3.Show All");
            System.out.println("4.Search");
            System.out.println("5.Exit");
            System.out.println("Enter Your choice[1-5]");

            int choice = input.nextInt();

            if (choice == 1) {
                imp.addStudent();
            } else if (choice == 2) {
                imp.deleteStudent();
            } else if (choice == 3) {
                imp.showAll();
            } else if (choice == 4) {
                imp.search();
            } else {
                System.exit(0);
            }
        }
    }

}
