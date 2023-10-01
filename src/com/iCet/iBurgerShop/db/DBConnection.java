/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.iBurgerShop.db;

/**
 *
 * @author chama
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private CustomerDB customerDB;
    
    private DBConnection(){
        customerDB = new CustomerDB();
    }
    public CustomerDB getCustomerDB(){
        return customerDB;
    }
    public static DBConnection getInstance(){
        if(dBConnection ==null){
            dBConnection=new DBConnection();
        }
        return dBConnection;
    }
}
