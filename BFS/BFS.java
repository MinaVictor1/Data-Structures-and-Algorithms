package com.mycompany.mavenproject2;

import java.util.LinkedList;
import java.util.Queue;

class BFS {
   static class node{       
        int item;
        node left ,right;
        public node(int item){
            this.item=item;
            left=right=null;
        }
    }
    node root;
    
    public void levelorder(node root){
        Queue<node> q=new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {            
            node cur=q.poll();
            System.out.println(cur.item+" ");
            if(cur.left!=null)
                q.add(cur.left);
            if(cur.right!=null)
                q.add(cur.right);
        }
        //q.poll();
    }
}
