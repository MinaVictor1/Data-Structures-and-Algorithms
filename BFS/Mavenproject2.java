package com.mycompany.mavenproject2;

//import java.util.*;

public class Mavenproject2 {

   public static void main(String[] args) {
      BFS tree=new BFS();
      tree.root=new BFS.node(1);
      tree.root.left=new BFS.node(12);
      tree.root.right=new BFS.node(9);
      tree.root.left.left=new BFS.node(5);
      tree.root.left.right=new BFS.node(6);
      tree.root.right.left=new BFS.node(15);
      tree.root.right.right=new BFS.node(20);
      tree.root.left.left.left=new BFS.node(12);
      System.out.println("levelorder");
      tree.levelorder(tree.root);
  }  
}