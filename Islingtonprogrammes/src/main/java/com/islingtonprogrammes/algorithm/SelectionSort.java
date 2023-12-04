/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.islingtonprogrammes.algorithm;
import com.islingtonprogrammes.models.ProgrammesModel;
/**
 *
 * @author LENOVO
 */
public class SelectionSort {
    public void selectionSort(ProgrammesModel[] nums){
        int size = nums.length;
        
        for(int step=0; step<size-1; step++){
            int minIndex = step;
            
            for(int next=step+1; next<size; next++){
                if(nums[next].getModulename ().compareTo(nums[minIndex].getModulename())< 0 ){
                    minIndex = next;
                }
            }
            //number swap
           ProgrammesModel temp = nums[step];
            nums[step] = nums[minIndex];
            nums[minIndex] = temp;
            
            //word swap
            
        }
    }
    
    
}
