/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_2;
import java.util.*;
import java.io.*;
/**
 *
 * @author hfuc
 */
public class Bai_1b {
    public static void main(String args[]){
        
        try{
            File myfile = new File("src/data1.txt");
            
            Scanner readF = new Scanner(myfile);
            int sum_even = 0;
            while(readF.hasNextLine()){
                String data = readF.nextLine();
                int data_sumeven = Integer.parseInt(data);
                if ( data_sumeven % 2 == 0 ){
                    sum_even += data_sumeven;
                }
            }
            System.out.print(sum_even);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
