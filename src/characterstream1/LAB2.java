/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characterstream1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tinnapop
 */
public class LAB2 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);

            output.write("Hello World!!");
            output.write("Welcome to Java");
            output.close();
            
        } catch (IOException ex) {
            Logger.getLogger(CharacterStream1.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
           try {
               String s;
               FileReader file = new FileReader("data.txt");
               BufferedReader input = new BufferedReader(file);
               while((s=input.read()) != -1){
               System.out.print(s);
            }
           } catch (FileNotFoundException ex) {
               Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
           } catch (IOException ex) {
            Logger.getLogger(LAB2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
