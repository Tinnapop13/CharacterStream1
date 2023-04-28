/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tinnapop
 */
public class CharacterStream1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World!!");
            output.write("Welcome to Java");
            
        } catch (IOException ex) {
            Logger.getLogger(CharacterStream1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
