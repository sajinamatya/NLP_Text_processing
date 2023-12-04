/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Islingtonprogrammes.algorithm;
import com.islingtonprogrammes.models.ProgrammesModel;
import java.util.Arrays;

/**
 *
 * @author LENOVO
 */
public class MergeSort {
    public void sort (ProgrammesModel[] a){
        if(a.length <= 1) {return;}
        
        ProgrammesModel[] first = new ProgrammesModel[a.length/2];
        ProgrammesModel[] second = new ProgrammesModel[a.length - first.length];
        
        for(int i=0; i<first.length; i++){
            first[i] = a[i];
        }
        
        for(int i=0; i<second.length; i++){
            second[i] = a[first.length+i];
        }
        
        sort(first);
        sort(second);
        merge(first, second, a);
    }
    
    public void merge(ProgrammesModel[] first, ProgrammesModel[] second, ProgrammesModel[] a){
        int firstCounter = 0;
        int secondCounter = 0;
        int mainArrayCounter = 0;
        
        while(firstCounter< first.length && secondCounter< second.length){
            if(first[firstCounter].getProgrammes().compareTo( second[secondCounter].getProgrammes())<=0){
               a[mainArrayCounter] = first[firstCounter];
                firstCounter++;
            }else {
                a[mainArrayCounter] = second[secondCounter];
                secondCounter++;
            }
            mainArrayCounter++;
        }
        
        while(firstCounter < first.length){
            a[mainArrayCounter] = first[firstCounter];
            firstCounter++;
            mainArrayCounter++;
        }
        
        
        while(secondCounter < second.length){
           a[mainArrayCounter] = second[secondCounter];
            secondCounter++;
            mainArrayCounter++;
        }
    }
    
    
   
}
