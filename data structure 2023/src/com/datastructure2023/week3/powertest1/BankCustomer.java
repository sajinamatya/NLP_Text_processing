/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructure2023.week3.powertest1;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
    public class BankCustomer extends BankAccount { //Inheritance 
        String customerName;
        int customerID;
        ArrayList<String>  accounts = new ArrayList<String>();
    // constructor of BankCustomer class  
        public BankCustomer(String customerName, int customerID, int accountNumber, double balance) {
            super(accountNumber, balance);
            this.customerName = customerName;
            this.customerID = customerID;
        }




        public void addAccount(String account){
            accounts.add(account);
        }

        public double getTotalBalance(){



            return getBalance(); 
        }



        public static void main(String[] args) {
            BankCustomer customer = new BankCustomer("sajin", 231321,32323232,40000);
            customer.addAccount("Nabil");
            customer.addAccount("SIddhartha");
            customer.deposit(222);
            customer.withdraw(3232);
    
    
    
    
    }
        

