/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment3;

/**
 *
 * @author 219189153
 */
public class RunSerializedFile {
    
public static void main(String [] args){
    ReadSerializedFile  read = new ReadSerializedFile();
    read.openFile();
    read.readStakeholderFile();
    read.customerArray();
    read.supplierArray();
    read.storeCustomerList();
    read.storeSupplierList();
}
}