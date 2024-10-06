/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vlu.lab_lt_w4;
import java.util.*;
/**
 *
 * @author Hoang_Phuc_2174802010591
 */
public class Lab_LT_W4 {
    
    public static double calculatorA(double x, double y) throws Exception{
        double top = 5 * x - y;
        
        if ( top == 0 ){
            throw new ArithmeticException("The denominator is 0, the division is invalid.");
        }
        
        double below = 2 * x + 7 * y;
        double calcu = top / below;
        if ( below < 0 ){
            throw new ArithmeticException("Expressions with negative square roots cannot be calculated.");
        }
        
        
        return Math.sqrt(calcu);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try{
            System.out.print("Enter x: ");
            double x = input.nextDouble();
            
            System.out.print("Enter y: ");
            double y = input.nextDouble();
            
            double result = calculatorA(x, y);
            System.out.print("Result: " + result);
        } catch (ArithmeticException e){
            System.out.print("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.print("Error: " + e.getMessage());
        }
    }
}
