/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.HashMap;

public class JavaApplication2 {

      public static void main(String[] args) {

         
         Integer [] vector = {1, 3, 5, 7, 9, 1, 5, 4, 3, 9,100,-4};
         //String[] vector = {"Ana", "Juan", "Elena", "Elena", "Juan", "Ana", "Pedro"};
        
         Histogram <Integer> histogram = CalculaHistogram.computeHistogram(vector);
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " <==> " + histogram.get(key));
        }
    
    
    }
    
    }
    
  
