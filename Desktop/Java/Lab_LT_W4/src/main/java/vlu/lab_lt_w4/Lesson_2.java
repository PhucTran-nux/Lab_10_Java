/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlu.lab_lt_w4;
import java.util.*;
/**
 *
 * @author hoang_phuc_2174802010591
 */
public class Lesson_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        int m = 0, n = 0;
        while(true){
            try{
                System.out.print("Enter m: ");
                m = input.nextInt();
                if( m <= 0){
                    throw new IllegalArgumentException("row number must be greater than 0");
                }
        
                System.out.print("Enter n: ");
                n = input.nextInt();
                if ( n <= 0 ){
                    throw new IllegalArgumentException("collum number must be greater than 0");
                }
                break;
            } catch (IllegalArgumentException e){
                System.out.println("Error");
            } catch (InputMismatchException e){
                System.out.println("Error");
                input.nextLine();
            }
        }
        
        
        int[][] array = new int[m][n];
        
        for ( int i = 0;i < m;i++){
            for(int j = 0;j<n;j++){
                while(true){
                    try{
                        System.out.print("(" + i + ", " + j + "): ");
                        array[i][j] = input.nextInt();
                        break;
                    } catch (InputMismatchException e){
                        System.out.print("Error:");
                        input.nextLine();
                    }
                }
            }
        }
        System.out.print("\n");
        System.out.println("Array: ");
        for (int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
