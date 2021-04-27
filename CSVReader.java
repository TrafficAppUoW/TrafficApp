/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author imran
 */
public class CSVReader {
    public static ArrayList<String> readFile(String fileName){
        ArrayList<String> fileContents = new ArrayList<String>();
        
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            bufferedReader.readLine();
            while((line=bufferedReader.readLine()) != null){
                fileContents.add(line);
                System.out.println(line);
            
            }
            
        } catch (Exception ex) {
            System.out.println("error while reading file" + ex.getMessage());
        }
        
        return fileContents;
    }
}
