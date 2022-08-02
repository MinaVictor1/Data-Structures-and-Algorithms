package com.mycompany.mavenproject2;

public class ArrayList <t>{
    private t arr[];
    private static final int default_size=10;
    int size;
    int index;

    public ArrayList(int size) {
        if(size<0)
            this.size=10;
        else
            this.size=size;
        arr=(t[])new Object[size];
        index=0;
    }
    public boolean isempty(){
        return index==0;
    }
    public boolean isfull(){
        return index==size;
    }
    public int getsize(){
        return index;
    }
    public void print(){
        for(int i=0;i<index;i++){
            System.out.println(arr[i]);
        }
    }
    public void insertAt(int pos,t item){
        if(isfull())
            System.out.println("The Array is full");
        else if(pos<0||pos>size)
            System.out.println("Out Of Range");
        else
            for(int i=index;i>pos;i--){
            arr[i]=arr[i-1];
        }
        arr[pos]=item;
        index++;
    }    
    public void insret(t element){
        if(isfull())
            System.out.println("The Array is full");
        else
            arr[index]=element;
        index++;
    }
    public void removeaAt(int pos){
        if(isempty())
            System.out.println("the array is empty");
        else if(pos<0||pos>size)
            System.out.println("Out Of Range");
        else{
            for(int i=pos;i<index;i++){
                arr[i]=arr[i+1];
            }
            index--;
        }
    }
    public void updateAT(int pos,t element){
        if(pos<0||pos>size)
            System.out.println("Out Of Range");
        else
            arr[pos]=element;
    }
    public t getelement(int pos){
        if(pos<0||pos>size){
            System.out.println("Out Of Range");
            return null;
        }
        else
            return arr[pos];
        
    }
}
