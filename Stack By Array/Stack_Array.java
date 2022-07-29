package com.mycompany.mavenproject3;

public class Stack <t> {
    private int top;
    private t []array;
    private int size;

    public Stack(int Size) {
        this.size=Size;
        this.array = (t[]) new Object[size];
        this.top=-1;
    }
    public void push(t item){
        if(top==size-1){
            System.out.println("stack full on push");
        }else{
            top++;
            array[top]=item;
        }
    }
    public boolean isempty(){
        if(top==-1){
            return true; 
        }else{
            return false;
            
        }
    }
    public void pop(){
        if(isempty()){
            System.out.println("stack is empty");
        }else{
            top--;
        }
    }
     public void peek(){
        if(isempty()){
            System.out.println("stack is empty");
        }else{
            System.out.println(array[top]);
        }
    }
     public void print(){
         for (int i = 0; i < top+1; i++) {
             System.out.println(array[i]);
         }
     }
}
