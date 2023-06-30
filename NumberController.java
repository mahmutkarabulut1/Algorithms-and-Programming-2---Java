/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControllerDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

/**
 *
 * @author mahmut
 */
public class NumberController {
    int [] numbers = new int [20];
    
    public NumberController(File file) throws FileNotFoundException, IOException  {
        BufferedReader bufferedReader = new BufferedReader(new  FileReader(file));
       
   
        int a = 0;
        while(a<20){
            String line;
            line = bufferedReader.readLine();
            int intLine = Integer.parseInt(line); // to replace the element in the index of the list
            numbers[a] = intLine;
            a ++;
        }
        bubbleSort(numbers);
        
        
    }
    public static void bubbleSort( int[] numbers)
 {
     
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
        
    }
    
    
public boolean searchBinary( int wantedNumber) { 
        int left = 0, right = numbers.length - 1; 
        while (left <= right) { 
            int middle = left + (right - left) / 2; 
  
            // check if x is the median value
            if (numbers[middle] == wantedNumber) 
                return true; 
            
            // if x is greater than the median, ignore the left half
            if (numbers[middle] < wantedNumber) 
                left = middle + 1; 
  
            // if x is less than the median, ignore the right half
            else
                right = middle - 1; 
        } 
  
        // returns -1 if the value x is not found in the array
        return false; 
    } 
public boolean searchSequential( int wantedNumber) { 
    int n = numbers.length; 
    for(int i = 0; i < n; i++) { 
        if(numbers[i] == wantedNumber) 
            return true; 
    } 
    return false; 
 
}

}

