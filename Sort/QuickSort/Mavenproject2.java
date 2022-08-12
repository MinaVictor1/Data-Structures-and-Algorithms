package com.mycompany.mavenproject2;

import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
       int [] arr={10,5,60,12,80,14,80};
       QuickSort sort=new QuickSort();
       sort.quicksort(arr, 0, arr.length-1);
       System.out.println(Arrays.toString(arr));
  }  
}