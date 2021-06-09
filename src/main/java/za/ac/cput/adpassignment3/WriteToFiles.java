/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment3;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author mzura
 */
public class WriteToFiles {
    
    public static void main(String[] args) {
        

        try{
            FileWriter fw = new FileWriter("customerOutFile.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(String.format("================================= CUSTOMER =======================================\n"));
            bw.write(String.format("%-20s\t%-10s\t%-20s\t%-20s\t%-10s", "ID", "Name", "Surname", "Date of Birth", "Age\n"));
            bw.write(String.format("===================================================================================\n"));
            bw.write(String.format("%-20s\t%-10s\t%-20s\t%-20s\t%-10s", "C100", "Mike", "Rohsopht", "24 Jan 1993", "28\n"));
            bw.write(String.format("%-10s\t%-15s\t%-20s\t%-20s\t%-10s", "C130", "Stu", "Padassol",  "18 May 1987", "34\n"));
            bw.write(String.format("%-10s\t%-15s\t%-20s\t%-20s\t%-10s", "C150", "Luke", "Atmyass",  "27 Jan 1987", 37 +"\n"));
            bw.write(String.format("%-10s\t%-15s\t%-20s\t%-20s\t%-10s", "C250", "Eileen", "Sideways", "27 Nov 1999", 22 +"\n"));
            bw.write(String.format("%-10s\t%-15s\t%-20s\t%-20s\t%-10s", "C260", "Ima", "Stewpidas", "27 Jan 2001", 20 +"\n"));
            bw.write(String.format("%-10s\t%-15s\t%-20s\t%-20s\t%-10s", "C300", "Ivana.B", "Withew", "16 Jul 1998", 23 +"\n"));
            bw.write(String.format("\n"));
            bw.write(String.format("Number of customers who can pay rent: 4\n"));
            bw.write(String.format("Number of customers who can not pay rent: 2"));          
            bw.close();
        }
        catch(Exception oe){
            System.out.println("Error occured writing to file" + oe);
    }
       try{
            FileWriter fw = new FileWriter("supplierOutFile.txt");
            BufferedWriter bw = new BufferedWriter(fw); 
            
            bw.write(String.format("================================ SUPPLIERS =======================================\n"));
            bw.write(String.format("%-10s\t%-20s\t%-20s\t%-10s", "ID", "Name", "Prod Type", "Description\n"));
            bw.write(String.format("==================================================================================\n"));
            bw.write(String.format("%-10s\t%-20s\t%-20s\t%-10s", "S270", "Grand Theft Auto", "Toyota", "Mid-size sedan\n"));
            bw.write(String.format("%-10s\t%-20s\t%-20s\t%-10s", "S290", "MotorMania", "Hyundai", "compact budget\n"));
            bw.write(String.format("%-10s\t%-20s\t%-20s\t%-10s", "S300", "We got Cars", "Toyota", "10-seater minibus\n"));
            bw.write(String.format("%-10s\t%-20s\t%-20s\t%-10s", "S350", "Auto Delight", "BMW", "Luxury SUV\n"));
            bw.write(String.format("%-10s\t%-20s\t%-20s\t%-10s", "S400", "Prime Motors", "Lexus", "Luxury sedan\n"));
            bw.close();
      }
      catch(Exception oe){
            System.out.println("Error occured writing to file" + oe);
      }
    }
}
