/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author imran
 */
public class Tables {
    //create employee table in database
    //to execute qurrey you need connection object
    public static void createTrafficDataTable(){
        Connection connect= DB.getConnection();
        //make a request/querry to the database
        String sql= "CREATE TABLE if not exists TrafficData"
                +"("+
                "count_point_id INTEGER PRIMARY KEY,"+
                "direction_of_travel VARCHAR(15),"+
                "year VARCHAR(15), "+
                "count_date VARCHAR(15),"+
                "hour VARCHAR(15),"+
                "region_id VARCHAR(15),"+
                "region_name VARCHAR(15),"+
                "local_authority_id VARCHAR(15),"+//wow
                "local_authority_name VARCHAR(15),"+
                "road_name VARCHAR(15),"+
                "road_type VARCHAR(15),"+
                "start_junction_road_name VARCHAR(15),"+
                "end_junction_road_name VARCHAR(15),"+
                "easting VARCHAR(15),"+
                "northing VARCHAR(15),"+
                "latitude VARCHAR(15),"+
                "longitude VARCHAR(15),"+
                "link_length_km VARCHAR(15),"+
                "link_length_miles VARCHAR(15),"+
                "pedal_cycles VARCHAR(15),"+
                "two_wheeled_motor_vehicles VARCHAR(15),"+
                "cars_and_taxis VARCHAR(15),"+
                "busses_and_coatches VARCHAR(15),"+
                "lgvs VARCHAR(15),"+
                "hgvs_2_rigid_axle VARCHAR(15),"+
                "hgvs_3_rigid_axle VARCHAR(15),"+
                "hgvs_4_or_more_rigid_axle VARCHAR(15),"+
                "hgvs_3_or_4_articulated_axle VARCHAR(15),"+
                "hgvs_5_articulated_axle VARCHAR(15),"+
                "hgvs_6_articulated_axle VARCHAR(15),"+
                "all_hgvs VARCHAR(15),"+
                "all_motor_vehicles VARCHAR(15))";
        
        try {
            Statement sqlStatement=connect.createStatement();
            //this actually executes the querry/request
            sqlStatement.executeUpdate(sql);
            System.out.println("Traffic table created");
            
        } catch (Exception e) {
            System.out.println("error with creating the statement in table class"+ e.getMessage());
        }
    }
}

