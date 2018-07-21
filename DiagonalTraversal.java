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
public class DiagonalTraversal {
    public void diagonal(){
     TreeStructure treestructure =new TreeStructure();
        treestructure.insert();
        NodeStructure root=treestructure.getroot();
       // diagonalDisplay(root);
        boundaryTraversal(root);
    }
    
    public void diagonalDisplay(NodeStructure root){
        
        Queue<NodeStructure> q1=new LinkedList<>();
        Queue<NodeStructure> q2=new LinkedList<>();
        Iterator itr=q1.iterator();
        Iterator itr2=q2.iterator();  
        
        q1.add(root);
        q1.add(null);
        
        while(itr.hasNext()){
            NodeStructure temp=q1.poll();
            if(temp==null){
                if(!itr.hasNext())
                    return;
                q1.add(null);
                
            }
            else{
                while(temp!=null){
                    System.out.print(temp.key+" ");
                    if(temp.left!=null)
                        q1.add(temp.left);
                    temp=temp.right;
                }
            }
            
        }
        
        
    }
    
    public void boundaryTraversal(NodeStructure root){
        Queue<NodeStructure> q1=new LinkedList<>();
        Iterator itr=q1.iterator();
        Stack<NodeStructure>stack = new Stack<NodeStructure>();
        stack.push(root);
        while (!stack.empty()) {
            NodeStructure temp=stack.pop();
            while(temp!=null){
            if(temp.right!=null){
                stack.push(temp.right);
                
            }
             if(temp.left!=null){
                System.out.print(temp.key+" ");
                temp=temp.left;
            }
            if(temp.left==null || temp.right==null){
                System.out.print(temp.key+" ");
                temp=stack.pop();
               //System.out.println("temp.key->"+temp.key);
            }
           }
        }
    }
}
