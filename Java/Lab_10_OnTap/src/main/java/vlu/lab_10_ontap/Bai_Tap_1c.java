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
public class Bai_Tap_1c {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nhap mot so: ");
        int so = input.nextInt();
        int[] mang_so = new int[so];
        
        for (int i = 0;i < so; i++){
            mang_so[i] = input.nextInt();
        }
        
        int so_le = 0;
        for (int tong : mang_so){
            if( tong % 2 != 0){
                so_le += tong;
            }
        }
        System.out.print(so_le);
    }
}
