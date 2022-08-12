package com.mycompany.mavenproject1;
import java.util.Arrays;

public class Mavenproject1 {
     
    public static void main(String[] args) {
        int []arr={50,20,10,90,70,60};
        MergeSort m=new MergeSort();
        m.Sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}