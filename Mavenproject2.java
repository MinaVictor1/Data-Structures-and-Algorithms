package com.mycompany.mavenproject2;

//import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
      Binary_tree tree=new Binary_tree();
      tree.root=new Binary_tree.node(1);
      tree.root.left=new Binary_tree.node(12);
      tree.root.right=new Binary_tree.node(9);
      tree.root.left.left=new Binary_tree.node(5);
      tree.root.left.right=new Binary_tree.node(6);
      System.out.println("preorder");
      tree.preorder(tree.root);
      System.out.println(" ");
      System.out.println("inorder");
      tree.inorder(tree.root);
      System.out.println(" ");
      System.out.println("postorder");
      tree.postorder(tree.root);
  }  
}