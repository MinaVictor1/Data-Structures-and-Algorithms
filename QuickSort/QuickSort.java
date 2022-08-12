package com.mycompany.mavenproject2;

public class QuickSort {
    public int partition(int []arr,int start,int end){
        int i=start;
        int j=end;
        int pivloc=i; 
        
        while(true){
            while(arr[pivloc]<=arr[j]&&pivloc!=j){
                j--;
            }if(pivloc==j){
                break;
            }else if(arr[pivloc]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[pivloc];
                arr[pivloc]=temp;
                pivloc=j;
            }
            while(arr[pivloc]>=arr[i]&&pivloc!=i){
                i++;
            }if(pivloc==i){
                break;
            }else if(arr[pivloc]<arr[i]){
                int temp=arr[i];
                arr[i]=arr[pivloc];
                arr[pivloc]=temp;
                pivloc=j;
            }
        }
        return pivloc;
    }
    public void quicksort(int arr[],int l,int h){
        if(l<h){
            int piv=partition(arr, l, h);
            quicksort(arr, l, piv-1);
            quicksort(arr, piv+1, h);
        }
    }
}
