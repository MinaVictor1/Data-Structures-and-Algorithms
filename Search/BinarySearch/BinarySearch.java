package com.mycompany.mavenproject2;

public class BinarySearch {
    public int binarysearch(int []arr,int l,int h,int key){
        while(l<=h){
            int m=(l+h)/2;
            if(arr[m]==key)
                return m;
            if(arr[m]>key)
                h=m-1;
            else
                l=m+1;
        }
        return -1;
    }
}
