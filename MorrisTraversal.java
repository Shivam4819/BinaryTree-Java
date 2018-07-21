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
public class MorrisTraversal {
 
    public void morrrisPrinting(){
        TreeStructure treestructure=new TreeStructure();
        treestructure.insert();
        NodeStructure root=treestructure.getroot();
        
        display(root);
    }
    
    public void display(NodeStructure root){
        
        while(root!=null){
            if(root.left==null){
                System.out.print(root.key+ " " );
                root=root.right;
            }
            else{
                NodeStructure current=root.left;
                
                while (current.right != null && current.right != root) {
                    current = current.right;
                }
 
                if (current.right == root) {
                    current.right = null;
                    root = root.right;
                }
  
                else {
                    System.out.print(root.key + " ");
                    current.right = root;
                    root = root.left;
                }
            }
        }
    }
}
