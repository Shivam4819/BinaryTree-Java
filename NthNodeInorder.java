/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author shivam
 */
import java.util.Stack;
import java.util.Scanner;
public class NthNodeInorder {
    
    Stack<Integer>stack=new Stack();
     public void inorder(){
         TreeStructure treestructure =new TreeStructure();
        treestructure.insert();
        NodeStructure root=treestructure.getroot();
        int num=2;
        display(root);
        displayStack();
     }
     
     public void display(NodeStructure root){
         //int count=0;
         
         if(root==null)
             return;
            display(root.left);
             System.out.println(root.key);
             stack.add(root.key);
             display(root.right);
         
     }
     public void displayStack(){
        int num=0;
         System.out.println("enter index value to know value");
         Scanner s=new Scanner(System.in);
         num=s.nextInt();
        System.out.println("stack->");
        num=num-1;
         System.out.println("elment ="+stack.elementAt(num));
     }
}
