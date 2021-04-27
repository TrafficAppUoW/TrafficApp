/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author imran
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*FirstGUI firstGUI = new FirstGUI();
        firstGUI.setVisible(true);
        // TODO code application logic here
        Tables.creatEmployee();
        EmployeeTable.insert(1,"imran" , "kfc", 10000);
        EmployeeTable.insert(2,"ibrahim" , "mosque", 15000);
        ResultSet employee = EmployeeTable.get(2);
        String job;
        try {
            job = employee.getString("job");
            System.out.println(job);
        } catch (Exception ex) {
            System.out.println("error while printing job");
        }
        EmployeeTable.update(1, "mark weins","food guy", 100000);*/
        Tables.createTrafficDataTable();
        ArrayList<String> fileContents = CSVReader.readFile("./TrafficData.csv");
        EmployeeTable.batchInsert(fileContents);
    }
    
}
