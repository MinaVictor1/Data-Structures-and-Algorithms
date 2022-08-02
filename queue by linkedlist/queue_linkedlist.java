package com.mycompany.mavenproject2;

public class queue_linkedlist <t>{
    private node front;
    private node rear;
    private int lengh;
    private class node{
        t item;
        node next;
        public node(t item){
        this.item=item;
        this.next=null;
    }
    }
    
    public queue_linkedlist(){
        front=rear=null;
        lengh=0;
    }
    public boolean isempty(){
        return lengh==0;
    }
    public void enqueu(t element){
        node newnode=new node(element);
        if(isempty()){
           front=rear=newnode;
           lengh++;
           return;
        }
        rear.next=newnode;
        rear=newnode;
        lengh++;
    }
    public void dequeue (){
        if(isempty()){
            System.out.println("the queue is empty");
            return;
        }
        front=front.next;
        lengh--;
        if(front==null)
            rear=null;
    }
    public t getfront(){
        assert(!isempty());
        return front.item;
    }
    public t getrear(){
        assert(!isempty());
        return rear.item;
    }
    public void cleer(){
        front=null;
        rear=null;
    }
    public void display(){
        node cur=front;
        while(cur!=null){
            System.out.println(cur.item);
            cur=cur.next;
        }
    }
    
}
