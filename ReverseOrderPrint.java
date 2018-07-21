/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author shivam
 */
public class ReverseOrderPrint {
    
    public void reverOrder(){
        
        TreeStructure treestructure =new TreeStructure();
        treestructure.insert();
        NodeStructure root=treestructure.getroot();
        print(root);
        alternateReverse(root);
    }
    
    public void print(NodeStructure root){
     
        
        boolean flag=false;
        Queue<NodeStructure> q1=new LinkedList<>();
        Queue<NodeStructure> q2=new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        Iterator itr=q1.iterator();
        Iterator itr2=q2.iterator();  
        q1.add(root);
        
        while(itr.hasNext()|| itr2.hasNext()){
            while(itr.hasNext()){
                if(q1.element().left  != null)
                    q2.add(q1.element().left);

                if(q1.element().right != null)
                     q2.add(q1.element().right);
                stack.add(q1.peek().key);
                q1.remove();
            }
            while (itr2.hasNext()){
                if (q2.element().left != null)
                    q1.add(q2.element().left);
                
                if (q2.element().right != null)
                    q1.add(q2.element().right);
                
                stack.add(q2.peek().key);
                q2.remove();
            }
        }
        while(!stack.empty()){
            System.out.print(stack.peek()+" ");
            stack.pop();
        }
    }
    
    public void alternateReverse(NodeStructure root){
        boolean flag=false;
        Queue<NodeStructure> q1=new LinkedList<>();
        Queue<NodeStructure> q2=new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        Iterator itr=q1.iterator();
        Iterator itr2=q2.iterator();  
        q1.add(root);
        
        while(itr.hasNext()|| itr2.hasNext()){
            while(itr.hasNext()){
                if(q1.element().left  != null)
                    q2.add(q1.element().left);

                if(q1.element().right != null)
                     q2.add(q1.element().right);
                stack.add(q1.peek().key);
                q1.remove();
            }
            while (itr2.hasNext()){
                if (q2.element().left != null)
                    q1.add(q2.element().left);
                
                if (q2.element().right != null)
                    q1.add(q2.element().right);
                
                while(!stack.empty()){
                    System.out.print(stack.peek()+" ");
                    stack.pop();    
                }
                    q2.remove();
                
            }
        
        }
    }
}

