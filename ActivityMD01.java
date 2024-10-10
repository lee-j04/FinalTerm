/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class ActivityMD01 {
    public static void main(String[] args) {
        
        char[][] array = new char [3][4];
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[i].length; j++) 
            {
               array[i][j] = '*';
            }
        }
        
        for(int i = 0; i < array[i].length; i++)
        { 
            for(int j = 0; j < array[i].length; j++)
            {
                System.out.print(array[i][j] + " ");                                         
            }
            System.out.println();
        }
    }   
}
