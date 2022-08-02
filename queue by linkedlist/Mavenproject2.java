package com.mycompany.mavenproject2;

import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
    queue_linkedlist q=new queue_linkedlist();
       q.enqueu(5);
       q.enqueu(10);
       q.enqueu(15);
       q.enqueu(20);
       q.enqueu(25);
       q.enqueu(30);
       q.enqueu(35);
       q.enqueu(40);
       q.enqueu(45);
       q.enqueu(50);
       q.dequeue();
       q.display();
       System.out.println("------------------------------------------------------------------------------");
       System.out.println(q.getfront());
       System.out.println(q.getrear());
       
       
  }  
}