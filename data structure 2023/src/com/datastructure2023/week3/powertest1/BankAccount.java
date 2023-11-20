/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructure2023.week3.powertest1;

/**
 *
 * @author Dell
 */
public class BankAccount {
    int accountNumber; 
    private double balance; 
    
    public BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance; 
    }

   public void deposit( double amount){

    this.balance += amount; 


   }
   public void withdraw(double amount){
  this.balance-= amount ; 
   }

    public double getBalance() {
          return this.balance;
      }

   public static void main(String[] args) {
       

    }
      
     
    
}
