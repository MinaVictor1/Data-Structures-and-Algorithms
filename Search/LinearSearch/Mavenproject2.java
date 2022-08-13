package com.mycompany.mavenproject2;

public class Mavenproject2 {

   public static void main(String[] args) {
       int []arr={10,50,20,90,7,0,105};
       LinearSearch search=new LinearSearch();
       if(search.search(arr, 520)==-1){
           System.out.println("the element is not found" );
       }else{
           System.out.println("the element in index "+search.search(arr, 50));
       }
  }  
}