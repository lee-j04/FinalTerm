/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class ActivityForLoop {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        double[] grades = new double[5];
        String[] subjects = {"\nMath","Science","English","History","Programming"};
        
        System.out.println("Please enter the grades of the following subjects: ");
        
       for(int i = 0; i < subjects.length; i++) {
           //System.out.print(subjects[i] + ":");
           //grades[i] = lee.nextDouble();
       double grade;
       do {
           System.out.print(subjects[i] + " : ");
           while (!lee.hasNextDouble()) {
               System.out.println("Invalid input. Please enter a numeric value");
               lee.next(); // clear the invalid input
           }
           grade = lee.nextDouble();
           if (grade < 0 || grade > 100) {
           System.out.println("Invalid grade. Please enter a value between");
           }
       }while (grade < 65 || grade > 100);
       grades[i] = grade;
       
       }
       
       System.out.println("\nGrades of the subject: ");
       
       for (int i = 0; i < subjects.length; i++) {
           System.out.println(subjects[i] + " : " + grades[i]);
       }
       System.out.println("Total No. of Subject: " + subjects.length);
        
        int totalgrade = 0;
        
        for (int i = 0; i < subjects.length; i++){
            totalgrade += grades[i];
        }
        
        double average = (double)totalgrade / subjects.length;
        
        System.out.println("The average grade is: " + average);
        for(int i = 0; i < grades.length; i++) {
            char gradesClassification;
            if (grades[i] >= 90) {
                gradesClassification = 'A'; 
            }else if (grades[i] >= 80) {
                gradesClassification = 'B';
            }else if (grades[i] >= 70) {
                gradesClassification = 'C';
            }else if (grades[i] >= 60) {
                gradesClassification = 'D';
            }else {
                gradesClassification = 'F';
            }
            System.out.println(subjects[i] + ":" + grades[i] + "->" + gradesClassification);
            
        }
        lee.close();
    }
}
 