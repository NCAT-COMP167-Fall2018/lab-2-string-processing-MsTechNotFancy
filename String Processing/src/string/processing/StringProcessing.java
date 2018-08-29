/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.processing;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yeady
 */
public class StringProcessing {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            String[] record = new String[100];
            
            int currIndex = 0;
            Scanner reader = new Scanner(new File(args[0]));
            while(reader.hasNext()){
                
                
                String[] line = reader.nextLine().split(",");
                
                String firstname = line[0];
                String lastname = line[1];
                String gender = line[2];
                String age = line[3];
                String phoneNumber = line[4];
                String email = line[5];
                
                if(genderIsValid(gender)){
                   System.out.println(record[currIndex] = String.format("%-20s%-20s%-10s%10s%10s%-20s", firstname, lastname, gender, age,  phoneNumber, email));
                } else {
                    System.err.println(String.format(String.format("%-20s%-20s%-10s%10s-10s%-20s", firstname, lastname, gender, age,  phoneNumber, email)));
                }
          
                currIndex++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StringProcessing.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
     private static boolean genderIsValid(String gender){
         if(gender.trim().equalsIgnoreCase("male")) {
             return true;
         }else if(gender.trim().equalsIgnoreCase("female")){
                 return true;
             
         }
         return false;
                 
     }

}