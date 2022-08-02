package com.mycompany.mavenproject2;

public class queue_array <t>{
    private int rear;
    private int front;
    private int lengh;
    private t[] arr;
    private int MAX_LENGH;

    public queue_array(int MAX_LENGH) {
        this.front=0;
        this.rear=MAX_LENGH-1;
        this.MAX_LENGH=MAX_LENGH;
        this.lengh=0;
        this.arr=(t[])new Object[MAX_LENGH];
    }
    public boolean isempty(){
        return lengh==0;
    }
    public boolean isfull(){
        return lengh==MAX_LENGH;
    }
    public void enqueue(t item){
        if(isfull())
            System.out.println("the Queue is full");
        else{
            rear=(rear+1)%MAX_LENGH;
            arr[rear]=item;
            lengh++;
        }
    }
    public void dequeue(){
        if(isempty())
            System.out.println("The Queue is empty");
        else{
            front=(front+1)%MAX_LENGH;
            lengh--;
        }
    }
    public t getfront(){
        assert(!isempty());
        return arr[front];
    }
    public t getrear(){
        assert(!isempty());
        return arr[rear];
    }
    public void print(){
        for(int i=front;i!=rear;i=(i+1)%MAX_LENGH){
            System.out.println(arr[i]);
        }
    }
    public int search(t element){
        int pos=-1;
        if(!isempty()){
            for(int i=front;i!=rear;i=(i+1)%MAX_LENGH){
                if(arr[i]==element){
                    pos=i;
                    break;
                }
            }
            if(pos==-1){
                if(arr[rear]==element)
                    pos=rear;
            }
        }
         else
            System.out.println("The Queue is empty");

        return pos;
    }
}
