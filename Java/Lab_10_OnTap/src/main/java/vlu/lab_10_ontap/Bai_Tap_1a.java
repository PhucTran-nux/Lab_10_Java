/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vlu.lab_10_ontap;
import java.util.*;
/**
 *
 * @author Hoang_Phuc_2174802010591
 */
public class Bai_Tap_1a {

    public static void main(String[] args) throws IllegalArgumentException{
        try {
            Scanner input = new Scanner(System.in);

            System.out.print("Nhap mot so: ");
            int so = input.nextInt();
            int[] so_mang = new int[so];

            int tong = 0;
            for (int i = 0; i < so; i++) {
                so_mang[i] = input.nextInt();
            }

            for (int tongcong : so_mang) {
                tong += tongcong;
                
            }

            System.out.print(tong);
        } catch (IllegalArgumentException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }
}
