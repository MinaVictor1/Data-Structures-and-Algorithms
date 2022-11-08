package com.mycompany.mavenproject4;

import java.util.*;

public class Mavenproject4 {
  
    public static void main(String[] args) {
       Scanner in =new Scanner(System.in);
       String str=in.next();
       StringBuffer bul=new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            bul.append(str.charAt(i));
        }
        for (int i = str.length()-1; i >= 0 ; i--) {
            bul.append(str.charAt(i));
        }
        System.out.println(bul);
    }
}
