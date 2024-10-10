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
        
        System.out.print("Please enter the grades of the following subjects: ");
        
       for(int i = 0; i < subjects.length; i++) {
           System.out.print(subjects[i] + ":");
           grades[i] = lee.nextDouble();
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
    }
}
