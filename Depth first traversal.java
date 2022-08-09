package com.mycompany.mavenproject2;

class Binary_tree {
    static class node{       
        int item;
        node left ,right;
        public node(int item){
            this.item=item;
            left=right=null;
        }
    }
    node root;
    
    public Binary_tree(){
        this.root=null;
    }
    public void preorder(node item){
        if(item==null)
            return;
        System.out.print(item.item+" ");
        preorder(item.left);
        preorder(item.right);
    }
    
    public void inorder(node item){
        if(item==null)
            return;
        inorder(item.left);
        System.out.print(item.item+" ");
        inorder(item.right);
    }
     public void postorder(node item){
        if(item==null)
            return;
        postorder(item.left);
        postorder(item.right);
        System.out.print(item.item+" ");
    }
}
