package com.mycompany.mavenproject3;

public class SelectionSort  {
    public SelectionSort(int [] arr){ 
        for (int i = 0; i < arr.length-1; i++) {
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int smallnum=arr[min];
            arr[min]=arr[i];
            arr[i]=smallnum;
        }
    }
    public void print(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
   }
