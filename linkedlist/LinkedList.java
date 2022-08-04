package com.mycompany.mavenproject2;

public class LinkedList <t>{
    private class node{
        t item;
        node next;
        public node(t Item){
            this.item=Item;
            next=null;
        }
    }
    private node head;
    private node tail;
    private int lengh;
    public LinkedList(){
        head=tail=null;
        lengh=0;
    }
    public boolean isempty(){
        return lengh==0;
    }
    public void insertatfirst(t element){
        node newnode=new node(element);
        if(lengh==0){
           head=tail=newnode;
           newnode.next=null;
        }
        else{
           newnode.next=head;
           head=newnode;
        }
        lengh++;
    }
    public void insert(t element){
        node newnode=new node(element);
        if(lengh==0){
           head=tail=newnode;
           newnode.next=null;
        }
        else{
            tail.next=newnode;
            newnode.next=null;
            tail=newnode;
        }
        lengh++;
    }
    public void insertAt(int pos,t element){
        
        if(pos<0||pos>lengh){
            System.out.println("out of range");
        }
        else{  
            node newnode=new node(element);
            if(pos==0){
                insertatfirst(element);
            }
            else if(pos==lengh){
                insert(element);
            }
            else {
                node cur=head;
                for(int i=0;i<pos-1;i++){
                    cur=cur.next;
                }
                newnode.next=cur.next;
                cur.next=newnode;
                lengh++;
            }
        }
    }
    public void removefirst(){
        if(lengh==0)
            return;
        else if(lengh==1){
            head=tail=null;
            lengh--;
        }
        else{
            head=head.next;
            lengh--;
        }
    }
    public void remove(){
        node cur=head.next;
        node pre=head;
        if(lengh==0)
            return;
        else if(lengh==1){
            head=tail=null;
            lengh--;
        }else{
        while(cur!=tail){
            pre=cur;
            cur=cur.next;
        }
        pre.next=null;
        tail=pre;
        lengh--;
        }
    }
    public void removeAt(t element){
        if(isempty())
            return;
        node cur,pre;
        if(head.item==element){
            head=head.next;
            lengh--;
            if(lengh==0){
                tail=null;
            }
        }
        else{
            cur=head.next;
            pre=head;
            while(cur!=null){
                if(cur.item==element){
                    break;
                }
                pre=cur;
                cur=cur.next;
            }
            if(cur==null)
                System.out.println("not found");
            else{
                pre.next=cur.next;
                    if(cur==tail){
                    tail=pre;
                }lengh--;
            } 
        }
    }
    public void reverse(){
        node cur ,next,pre;
        pre=null;
        cur=head;
        next=cur.next;
        while(next!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        head=pre;
    }
    public int search(t element){
        node cur=head;
        int pos=0;
        while(cur!=null){
            if(cur.item==element)
                return pos;
            cur=cur.next;
            pos++;
        }
        return -1;
    }
    public void print(){
        node cur=head;
        while (cur!=null) {            
            System.out.println(cur.item);
            cur=cur.next;
        }
    }
}
