package com.mycompany.mavenproject2;

public class Stack <t> {
    node top;
   private class node{
       t item;
       node next;
   }

    public Stack() {
        this.top = null;
    }
   public void push(t newitem){
       node newnode=new node();
        if (newnode == null) {
            System.out.print("Heap Overflow");
        }else{
            newnode.item=newitem;
            newnode.next=top;
            top=newnode;
        }
   }
   public boolean isempty(){
       return top == null;
   }
   /*public void pop(){
       if(isempty()){
           System.out.println("stack empty");
       }else{
           node temp=top;
           top=top.next;
           temp.next=null;
       }
   }*/
   //An other way to pop
   public void pop(){
       if(isempty()){
           System.out.println("stack empty");
       }else{
           top=top.next;
       }
   }
    public void display()
    {
        if (top == null) {
            System.out.printf("Stack Underflow");
        }
        else {
            node temp = top;
            while (temp != null) {
                System.out.printf("%d->", temp.item);
                temp = temp.next;
            }
        }
    }
}
