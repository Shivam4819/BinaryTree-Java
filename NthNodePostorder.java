/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shivam
 */
public class NthNodePostorder {
     
    Stack<Integer>stack=new Stack();
     public void postOrder(){
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
        display(root.right);
        System.out.println(root.key);
        stack.add(root.key);
        
         
     }
     public void displayStack(){
        int num=0;
         System.out.print("enter index value to know value");
         Scanner s=new Scanner(System.in);
         num=s.nextInt();
        System.out.println("stack->");
        num=num-1;
         System.out.println("elment ="+stack.elementAt(num));
     }
}
