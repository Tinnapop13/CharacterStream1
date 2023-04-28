/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package characterstream1;

import java.io.File;
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
public class LAB1 {
       public static void main(String[] args) throws IOException {
         try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World!!");
            output.write("Welcome to Java");
            output.close();
            
        } catch (IOException ex) {
            Logger.getLogger(CharacterStream1.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
           try {
               int ch;
               FileReader input = new FileReader("data.txt");
               while((ch=input.read()) != -1){
               System.out.print(ch);
        }
           } catch (FileNotFoundException ex) {
               Logger.getLogger(LAB1.class.getName()).log(Level.SEVERE, null, ex);
           }
        
    }
       
}
