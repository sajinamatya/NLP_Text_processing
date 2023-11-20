/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datastructure2023.week2;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class sajin {
    public static void main(String[] args) {
        week2 glass1 = new week2("lev", "rayban", "red",
                222, 2,
                Boolean.TRUE);
        week2 glass2 = new week2("dsa", "levv", "blue",
                2333, 3, Boolean.TRUE);
        ArrayList<week2> array = new ArrayList();            
        array.add(glass1);
        array.add(glass2);
        
        for(week2 arrays : array){
            System.out.println(arrays.getModel() + "price" + arrays.getPrize());
            
            
        }
    }
}
