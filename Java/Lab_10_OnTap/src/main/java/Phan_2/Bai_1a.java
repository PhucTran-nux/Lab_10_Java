/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author hfuc
 */
public class Bai_1a {
    
    public static void main(String[] args){
        try{
            File myFile = new File("src/data.txt");
            int sum = 0;
            Scanner myReader = new Scanner(myFile);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                int data_number = Integer.parseInt(data);
                sum+=data_number;
            }
            System.out.print(sum);
            myReader.close();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
