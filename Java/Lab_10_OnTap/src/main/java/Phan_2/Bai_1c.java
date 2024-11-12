/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Phan_2;
import java.io.*;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author hfuc
 */
public class Bai_1c {
    public static void main(String[] args) throws EOFException{
        try{
            File myFile = new File("src/data2.json");

            ObjectMapper mapper = new ObjectMapper();

            inform info = mapper.readValue(myFile, inform.class);
            
            System.out.print(info);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
