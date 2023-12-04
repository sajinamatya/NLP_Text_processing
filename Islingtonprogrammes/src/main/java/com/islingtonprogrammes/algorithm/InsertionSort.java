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
public class InsertionSort {
    public static void insertionSort(ProgrammesModel[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            ProgrammesModel key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key.getsNo()
            // to one position ahead of their current position
            while (j >= 0 && arr[j].getSno() > key.getSno()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    
}
