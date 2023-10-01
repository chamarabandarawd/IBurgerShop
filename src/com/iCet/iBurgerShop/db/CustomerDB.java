/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iCet.iBurgerShop.db;

import com.iCet.iBurgerShop.model.Customer;

/**
 *
 * @author chama
 */
public class CustomerDB {

    private Customer[] customerArray;

    public CustomerDB() {
        this.customerArray = new Customer[0];
    }

    public void extendsArray() {
        Customer[] temCustArray = new Customer[customerArray.length + 1];
        for (int i = 0; i < customerArray.length; i++) {
            temCustArray[i] = customerArray[i];
        }
        customerArray = temCustArray;
    }

       public void add(Customer customer){ //add to the last
        extendsArray();
        customerArray[customerArray.length-1]=customer;
    } 

    public void add(int index, Customer customer) {
        customerArray[index] = customer;

    }

    public int search(Customer customer) {
        for (int i = 0; i < customerArray.length; i++) {
            if (customer.equals(customerArray[i])) {
                return i;
            }
        }
        return -1;
    }

    public Customer get(int index) {
        if (index >= 0 && index < customerArray.length) {
            return customerArray[index];
        }
        return null;
    }

    public Customer[] toArray() {
        Customer[] tempCustomerArray = new Customer[customerArray.length];
        for (int i = 0; i < customerArray.length; i++) {
            tempCustomerArray[i] = customerArray[i];
        }
        return tempCustomerArray;
    }

    public boolean remove(Customer customer) {
        int index=search(customer);
        System.out.println(index);
        Customer[] tempCustomerArray = new Customer[customerArray.length-1];
        for (int i = 0; i < index; i++) {
            tempCustomerArray[i] = customerArray[i];
        }
        for (int i = index; i < tempCustomerArray.length; i++) {
            tempCustomerArray[i] = customerArray[i+1];
        }
        customerArray = tempCustomerArray;
        return true;

    }

    public void remove(int index) {

    }

    public Customer search(String id) {
        for (Customer c : customerArray) {
            if (c.getId().equalsIgnoreCase(id)) {
                return c;

            }
        }
        return null;
    }

}
