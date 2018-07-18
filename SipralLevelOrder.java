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
public class SipralLevelOrder {
    
    public void sprialPrint(){
        TreeStructure treestructure =new TreeStructure();
        treestructure.insert();
        NodeStructure root=treestructure.getroot();
        level0rderSpiral(root);
    }
    
    public void level0rderSpiral(NodeStructure root){
        
        boolean flag=false;
        Queue<NodeStructure> q1=new LinkedList<>();
        Queue<NodeStructure> q2=new LinkedList<>();
        Queue<NodeStructure> q3=new LinkedList<>();
        Iterator itr=q1.iterator();
        Iterator itr2=q2.iterator();  
        q1.add(root);
        
        while(itr.hasNext()|| itr2.hasNext()){
            while(itr.hasNext()){
                if(q1.element().left  != null)
                    q2.add(q1.element().left);

                if(q1.element().right != null)
                     q2.add(q1.element().right);
                if(flag==false)
                System.out.print(q1.element().key+" ");
                q1.remove();
            }
            while (itr2.hasNext())
            {
                if (q2.element().left != null){
                    q1.add(q2.element().left);
                    q3.add(q2.element().left);
                }
                if (q2.element().right != null){
                    q1.add(q2.element().right);
                    q3.add(q2.element().right);
                }
                System.out.print(q2.element().key+" ");
                q2.remove();
                flag=true;
            }
            if(flag=true){
                Stack<Integer> stack = new Stack<>();
                while (!q3.isEmpty()) {
                stack.add(q3.peek().key);
                q3.remove();
                }
                
                while(!stack.empty()){
                    System.out.print(stack.peek()+" ");
                    stack.pop();
                }
            }
        }
        
    }
}
