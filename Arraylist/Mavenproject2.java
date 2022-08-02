package com.mycompany.mavenproject2;

import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
     ArrayList<Integer> arr=new ArrayList(20);
       arr.insret(5);
       arr.insret(10);
       arr.insret(15);
       arr.insret(20);
       arr.insret(25);
       arr.insret(30);
       arr.insret(35);
       arr.insret(40);
       arr.insret(45);
       arr.insret(50);
       arr.insertAt(2, 1000);
       arr.removeaAt(6);
       arr.updateAT(6, 1020000);
       arr.print();
       System.out.println("-----------------------------------------------------");
       arr.getsize();
       arr.getelement(5);
  }  
}