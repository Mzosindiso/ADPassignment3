/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.stream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author 219189153
 */
public class ReadSerializedFile {
    private ObjectInputStream input;
    Customer cust;
    Supplier supp;
    Customer [] custArray = new Customer[6];
    Supplier [] suppArray = new Supplier[5];
     
    public void openFile(){
        try{
            input = new ObjectInputStream( new FileInputStream( "stakeholder.ser" ) ); 
            System.out.println("================== CUSTOMERS ===========================================\n");
            System.out.println("==========================================================================");
        }
        catch ( IOException ioe){
            System.out.println("error opening ser file: " + ioe.getMessage());
            System.exit(1);
        }
    }
    public void customerArray(){
        custArray[0] = new Customer("C150", "Luke", "Atmyass", "Bellville", "1981-01-27", 1520.50, false);
        custArray[1] = new Customer("C130", "Stu", "Padassol", "Sea Point", "1987-05-18", 645.25, true);
        custArray[2] = new Customer("C100", "Mike", "Rohsopht", "Bellville", "1993-01-24", 975.10, true);
        custArray[3] = new Customer("C300", "Ivana.B", "Withew", "Langa", "1998-07-16", 1190.50, false);
        custArray[4] = new Customer("C250", "Eileen", "Sideways", "Nyanga", "1999-11-27", 190.85, true);
        custArray[5] = new Customer("C260", "Ima", "Stewpidas", "Atlantis", "2001-01-27", 1890.70, true);

    }
    public void supplierArray(){
        suppArray[0] = new Supplier("S270", "Grand Theft Auto", "Toyota", "Mid-size sedan");
        suppArray[1] = new Supplier("S400", "Prime Motors", "Lexus", "Luxury sedan");
        suppArray[2] = new Supplier("S300", "We got Cars", "Toyota", "10-seater minibus");
        suppArray[3] = new Supplier("S350", "Auto Delight", "BMW", "Luxury SUV");
        suppArray[4] = new Supplier("S290", "MotorMania", "Hyundai", "compact budget");
        
    }

    public void  readStakeholderFile(){    
       try{
           input = new ObjectInputStream(new FileInputStream("stakeholder.ser"));   
           Customer custArray =  new Customer();
            if(custArray instanceof Stakeholder){
                for(int i = 0; i < 11; ++i){
                System.out.println(input.readObject());
                
            }
            }
        }
         catch (IOException ex) {
             System.out.println("============Error occured================" + ex);
         } catch (ClassNotFoundException ex) {
            System.out.println("=================Error Class not Found================");
        }

    }
    public void storeCustomerList(){
        System.out.println("===================================================================================\n");
        System.out.println("===================================== Customer List ===================================");
        //input = new ObjectInputStream(new FileInputStream("stakeholder.ser"));
        for(int i = 0; i < custArray.length; i++){
            System.out.println(custArray[i]);
            
        }
        
    }
    public void storeSupplierList(){
        System.out.println("======================================================================================\n");
        System.out.println("===================================== Supply List ========================================");
        //input = new ObjectInputStream(new FileInputStream("stakeholder.ser"));
        for(int i = 0; i < suppArray.length; i++){
            System.out.println(suppArray[i]);
        }
        }
}