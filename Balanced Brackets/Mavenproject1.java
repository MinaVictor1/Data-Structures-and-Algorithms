package com.mycompany.mavenproject1;

public class Mavenproject1 {
     
    public static void main(String[] args) {
        if (BalancedBrackets.areBracketsBalanced("{([])}"))//Balanced 
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        
        if (BalancedBrackets.areBracketsBalanced("{([])}"))//Not Balanced 
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}
