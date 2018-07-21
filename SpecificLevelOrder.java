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
import java.util.Queue;
import java.util.LinkedList;
public class SpecificLevelOrder {
 
    public void specificPrinting(){
         TreeStructure treestructure =new TreeStructure();
        treestructure.insert();
        NodeStructure root=treestructure.getroot();
        System.out.println("top down printing of data-");
        levelorder(root);
        
        
    }
    
    public void levelorder(NodeStructure root){
        
        if (root == null)
            return;
  
        System.out.print(root.key);
  
        if (root.left != null)
            System.out.print(" " + root.left.key + " " + root.right.key);
  
        if (root.left.left == null)
            return;
  
        Queue<NodeStructure> q = new LinkedList<NodeStructure>();
        q.add(root.left);
        q.add(root.right);
  
        NodeStructure first = null, second = null;
  
        while (!q.isEmpty()) 
        {
            first = q.peek();
            q.remove();
            second = q.peek();
            q.remove();

            System.out.print(" " + first.left.key + " " +second.right.key);
            System.out.print(" " + first.right.key + " " +second.left.key);

            if (first.left.left != null) 
            {
                q.add(first.left);
                q.add(second.right);
                q.add(first.right);
                q.add(second.left);
            }
        }
    }
}

