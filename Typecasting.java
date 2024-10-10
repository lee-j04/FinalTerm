/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.typecasting;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Typecasting {
    
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        
        System.out.print("Enter the Item Price: ");
        double itepri = lee.nextDouble();
        
        System.out.print("Enter the Quantity Sold: ");
        int quanso = lee.nextInt();
        
        int round = (int)Math.round(itepri);
        int res = quanso * round;
        
        System.out.print("Total Revenue: " + res);
        
    }
}
