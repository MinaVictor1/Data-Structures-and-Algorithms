package com.mycompany.mavenproject1;

public class MergeSort {
    public void merge(int[]arr,int l,int m,int r){
        int i,j,k;
        int n1=m-l+1;
        int n2=r-m;
        int []arr1=new int[n1];
        int []arr2=new int[n2];
        for(i=0;i<n1;i++)
            arr1[i]=arr[l+i];
        for(j=0;j<n2;j++)
            arr2[j]=arr[m+1+j];
        
        i=j=0;
        k=l;
        
        while(i<n1&&j<n2){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=arr1[i];
            i++;
            k++;
        }
         while(j<n2){
            arr[k]=arr2[j];
            j++;
            k++;
        }
    }
    public void Sort(int[]arr,int l,int r){
        if(l<r){
            int m=(l+r)/2;
            Sort(arr, l, m);
            Sort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
}
