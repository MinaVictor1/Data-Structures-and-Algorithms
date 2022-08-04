package com.mycompany.mavenproject2;

//import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
       LinkedList<Integer> link=new LinkedList();
       link.insert(10);
       link.insert(15);
       link.insert(20);
       link.insert(25);
       link.insert(30);
       link.insertatfirst(5);
       link.insertAt(0, 0);
       link.removeAt(25);
       link.print();
       System.out.println("-----------------------------------------------------");
       link.reverse();
       link.print();
       if(link.search(25)==-1)
           System.out.println("element not found");
       else
           System.out.println(link.search(20));
  }  
}