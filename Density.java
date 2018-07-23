/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author shivam
 */
public class Density {
    public void depthAndDensity(){
        TreeStructure tree = new TreeStructure();
        tree.insert();
        NodeStructure root=tree.getroot();
        levelorder(root);
    }
    
    public void levelorder( NodeStructure root){
        int size=0,height=0;
        Queue<NodeStructure> q1=new LinkedList<>();
        Queue<NodeStructure> q2=new LinkedList<>();
        Iterator itr=q1.iterator();
        Iterator itr2=q2.iterator();  
        q1.add(root);
        
        while(itr.hasNext()|| itr2.hasNext()){
            while(itr.hasNext()){
                if(q1.element().left  != null)
                    q2.add(q1.element().left);

                if(q1.element().right != null)
                     q2.add(q1.element().right);
              
                System.out.print(q1.element().key+" ");
                size++;
                q1.remove();
            }
            height++;
            while (itr2.hasNext())
            {
                if (q2.element().left != null)
                    q1.add(q2.element().left);

                if (q2.element().right != null)
                    q1.add(q2.element().right);
                
                System.out.print(q2.element().key+" ");
                size++;
                q2.remove();
            }
            height++;
        }
        density(height, size);
        depth(height);
    }
    
    public void density(int height,int size){
        float density=0;
        
        density=size/height;
        System.out.println("density is-"+density);
    }
    public void depth(int height){
        height=height-1;
        System.out.println("depth is-"+height);
    }
}
