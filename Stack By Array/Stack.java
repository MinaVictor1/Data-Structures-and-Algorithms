package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {
        Stack<Integer> sta=new Stack(20);
        sta.push(5);
        sta.push(10);
        sta.push(15);
        sta.pop();
        sta.push(20);
        sta.peek();
    }
}
