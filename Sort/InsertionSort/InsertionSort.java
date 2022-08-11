package com.mycompany.mavenproject2;

//index---> 0   1   2   3   4   5    6
//Array---> 80  90  60  30  50  70   40
class InsertionSort {
    public InsertionSort(int [] arr){
        int key,j;
    for(int i=1;i<arr.length;i++){
        key=arr[i];//50
        j=i-1;//0
        while (j>=0&&arr[j]>key) {            
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    for(int g=0;g<arr.length;g++){
        System.out.println(arr[g]);
    }
  }
}
