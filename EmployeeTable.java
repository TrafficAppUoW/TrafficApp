/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author imran
 */
public class EmployeeTable {
    private static Connection connect= DB.getConnection();
    public static void insert(int id, String a, String b,String c, String d,String e,String f, String g, String h, String i,String j,String k,String l, String m,String n,String o, String p, String q,String r,String s,String t,String u,String v,String w,String x,String y,String z, String aa,String bb,String cc,String dd,String ee){
        
        String sql ="INSERT INTO TrafficData (count_point_id,direction_of_travel,year,count_date,hour,region_id,region_name,local_authority_id,local_authority_name,road_name,road_type,start_junction_road_name,end_junction_road_name,easting,northing,latitude,longitude,link_length_km,link_length_miles,pedal_cycles,two_wheeled_motor_vehicles,cars_and_taxis,busses_and_coatches,lgvs,hgvs_2_rigid_axle,hgvs_3_rigid_axle,hgvs_4_or_more_rigid_axle,hgvs_3_or_4_articulated_axle,hgvs_5_articulated_axle,hgvs_6_articulated_axle,all_hgvs,all_motor_vehicles) VALUES" +"("+ "'"+id+"',"+"'"+a+"',"+"'"+b+"',"+"'"+c+"','"+d+"',"+"'"+e+"',"+"'"+f+"','"+g+"',"+"'"+h+"',"+"'"+i+"','"+j+"',"+"'"+k+"',"+"'"+l+"','"+m+"',"+"'"+n+"',"+"'"+o+"','"+p+"',"+"'"+q+"',"+"'"+r+"','"+s+"',"+"'"+t+"',"+"'"+u+"','"+v+"',"+"'"+w+"',"+"'"+x+"','"+y+"',"+"'"+z+"',"+"'"+aa+"','"+bb+"',"+"'"+cc+"',"+"'"+dd+"','"+ee+"')";
        
        
        try {
            Statement statement = connect.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Employee Table Created");
        } catch (Exception ex) {
            System.out.println("[Employee Table] - error in the create statement"+ex.getMessage());
        }
    
    }
    public static void batchInsert(ArrayList<String> input){
    for(String currentLine: input){
        String[] lineArray = currentLine.split(",");
        int id = Integer.parseInt(lineArray[0]);
        String direction_of_travel = lineArray[1];
        String year = lineArray[2];
        String count_date = lineArray[3];
        String hour = lineArray[4];
        String region_id = lineArray[5];
        String region_name = lineArray[6];
        String local_authority_id = lineArray[7];
        String local_authority_name = lineArray[8];
        String road_name = lineArray[9];
        String road_type = lineArray[10];
        String start_junction_road_name = lineArray[11];
        String end_junction_road_name = lineArray[12];
        String easting = lineArray[13];
        String northing = lineArray[14];
        String latitude = lineArray[15];
        String longitude = lineArray[16];
        String link_length_km = lineArray[17];
        String link_length_miles = lineArray[18];
        String pedal_cycles = lineArray[19];
        String two_wheeled_motor_vehicles = lineArray[20];
        String cars_and_taxis = lineArray[21];
        String busses_and_coatches = lineArray[22];
        String lgvs = lineArray[23];
        String hgvs_2_rigid_axle = lineArray[24];
        String hgvs_3_rigid_axle = lineArray[25];
        String hgvs_4_or_more_rigid_axle = lineArray[26];
        String hgvs_3_or_4_articulated_axle = lineArray[27];
        String hgvs_5_articulated_axle = lineArray[28];
        String hgvs_6_articulated_axle = lineArray[29];
        String all_hgvs = lineArray[30];
        String all_motor_vehicles = lineArray[31];
        
        
        
        
        
        insert(id,direction_of_travel,year,count_date,hour,region_id,region_name,local_authority_id,local_authority_name,road_name,road_type,start_junction_road_name,end_junction_road_name,easting,northing,latitude,longitude,link_length_km,link_length_miles,pedal_cycles,two_wheeled_motor_vehicles,cars_and_taxis,busses_and_coatches,lgvs,hgvs_2_rigid_axle,hgvs_3_rigid_axle,hgvs_4_or_more_rigid_axle,hgvs_3_or_4_articulated_axle,hgvs_5_articulated_axle,hgvs_6_articulated_axle,all_hgvs,all_motor_vehicles);
} 
    
    
}
    
    public static ResultSet get(int id){
        
        String sql ="SELECT * FROM Employee WHERE id= "+id;
        
        ResultSet result =null;
        try {
            Statement statement = connect.createStatement();
            result = statement.executeQuery(sql);
            if(result.next()){
                System.out.println("Employee " + result.getString("name") +" retrieved ");
            }
            
        } catch (Exception ex) {
            System.out.println("[Employee Table] - error while reading from employee table "+ex.getMessage());
        }
    
    return result;
}
    public static void update(int id, String name, String job,int salary){
        
        String sql ="UPDATE Employee SET name = '" + name + "',job='" + job+ "',salary='"+salary+"' WHERE id=" +id;
        
        try {
            Statement statement = connect.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Employee "+ name+  " updated");
        } catch (Exception ex) {
            System.out.println("[Employee Table] - error while updating employee table "+ex.getMessage());
        }
    
    
}
    public static void delete(int id){
        
        String sql ="DELETE FROM Employee WHERE id = "+id;
        
        try {
            Statement statement = connect.createStatement();
            statement.executeUpdate(sql);
            System.out.println("Employee with id: "+ id+  " id deleted");
        } catch (Exception ex) {
            System.out.println("[Employee Table] - error while deleting from the employee table "+ex.getMessage());
        }
    
    
}
}
