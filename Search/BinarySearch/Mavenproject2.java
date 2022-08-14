package com.mycompany.mavenproject2;
//import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
       int []arr={10,6,20,2,5,3,6,8,4};
       BinarySearch search=new BinarySearch();
       if(search.binarysearch(arr, 0, arr.length-1, 5)==-1)
           System.out.println("element not found");
       else
           System.out.println(search.binarysearch(arr, 0, arr.length-1, 5));
      }  
}