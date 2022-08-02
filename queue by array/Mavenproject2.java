package com.mycompany.mavenproject2;

import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
    queue_array<Integer> q=new queue_array(10);
       q.enqueue(5);
       q.enqueue(10);
       q.enqueue(15);
       q.enqueue(20);
       q.enqueue(25);
       q.enqueue(30);
       q.enqueue(35);
       q.enqueue(40);
       q.enqueue(45);
       q.enqueue(50);
       q.dequeue();
       q.print();
       System.out.println("----------------------------------------------------------------------------------------------------------");
       System.out.println("Front-->"+q.getfront());
       System.out.println("Rear-->"+q.getrear());
       System.out.println("The Queue is empty or not empty-->"+q.isempty());
       System.out.println("The Position for element 20 -->"+q.search(20));
  }  
}