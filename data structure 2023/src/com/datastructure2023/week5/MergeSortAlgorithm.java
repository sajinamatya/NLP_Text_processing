package com.datastructure2023.week5;

import java.util.Arrays;

/**
 *
 * @author prithivi
 */
public class MergeSortAlgorithm {
    
    public void sort (int[] a){
        if(a.length <= 1) {return;}
        
        int[] first = new int[a.length/2];
        int[] second = new int[a.length - first.length];
        
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
    
    public void merge(int[] first, int[] second, int[] mainArray){
        int firstCounter = 0;
        int secondCounter = 0;
        int mainArrayCounter = 0;
        
        while(firstCounter< first.length && secondCounter< second.length){
            if(first[firstCounter] < second[secondCounter]){
                mainArray[mainArrayCounter] = first[firstCounter];
                firstCounter++;
            }else {
                mainArray[mainArrayCounter] = second[secondCounter];
                secondCounter++;
            }
            mainArrayCounter++;
        }
        
        while(firstCounter < first.length){
            mainArray[mainArrayCounter] = first[firstCounter];
            firstCounter++;
            mainArrayCounter++;
        }
        
        
        while(secondCounter < second.length){
            mainArray[mainArrayCounter] = second[secondCounter];
            secondCounter++;
            mainArrayCounter++;
        }
    }
    
    
    public static void main(String[] args) {
        int[] data = {92,2,5,1,6,3};
        MergeSortAlgorithm al = new MergeSortAlgorithm();
        al.sort(data);
        System.out.println(Arrays.toString(data));
    }
}
