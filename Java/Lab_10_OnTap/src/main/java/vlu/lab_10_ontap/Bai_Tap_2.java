/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vlu.lab_10_ontap;
import java.util.*;
/**
 *
 * @author hfuc
 */
public class Bai_Tap_2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap mot so: ");
        int n = input.nextInt();
        
        if (n > 0){
            System.out.print("So duong: " + n);
        } else {
            System.out.print("So am: " + n);
        }
    }
}
