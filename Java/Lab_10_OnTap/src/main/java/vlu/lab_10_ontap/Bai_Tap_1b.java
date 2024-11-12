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
public class Bai_Tap_1b{
    public static void main(String[] args) throws IllegalArgumentException{
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Nhap mot so: ");
            int so = input.nextInt();
            int[] so_mang = new int[so];

            for (int i = 0; i < so; i++) {
                so_mang[i] = input.nextInt();
            }

            int tong_chan = 0;
            for (int tong : so_mang) {
                if (tong % 2 == 0) {
                    tong_chan += tong;
                }
            }
            System.out.print(tong_chan);
        } catch (IllegalArgumentException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
