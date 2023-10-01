/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.iBurgerShop.controller;

import com.iCet.iBurgerShop.db.CustomerDB;
import com.iCet.iBurgerShop.db.DBConnection;
import com.iCet.iBurgerShop.model.Customer;

/**
 *
 * @author chama
 */
public class CustomerController {
    
    public static boolean addCustomer(Customer customer){
        CustomerDB customerDB= DBConnection.getInstance().getCustomerDB();
        customerDB.add(customer);
        return true;
    }
    
    public static Customer[] getAllCustomers(){
        CustomerDB customerDB= DBConnection.getInstance().getCustomerDB();
        return customerDB.toArray(); 
    }
    
    public static Customer searchCustomer(String id){
        CustomerDB customerDB=DBConnection.getInstance().getCustomerDB();
        return customerDB.search(id);
    }
    public static boolean deleteCustomer(Customer customer){
        CustomerDB customerDB=DBConnection.getInstance().getCustomerDB();
        return customerDB.remove(customer);
    }
    
}
