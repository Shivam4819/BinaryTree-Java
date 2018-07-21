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
public class ItrativeTraversal {
    
    public void traversals(){
        TreeStructure tree=new TreeStructure();
        tree.insert();
        NodeStructure root=tree.getroot();
        preorder(root);
        postorder(root);
        postorderSingleStack(root);
    }
    
    public void preorder(NodeStructure root){
        
        Stack<NodeStructure> stack=new Stack<NodeStructure>();
        stack.push(root);
        while(!stack.empty()){
            NodeStructure data=stack.pop();
            System.out.print(data.key+" ");
            
            if (data.right!=null){
                stack.push(data.right);
            }
            if(data.left!=null){
                stack.push(data.left);
            }
        }
    }
    
    public void postorder(NodeStructure root){
        Stack<NodeStructure> stack1=new Stack<NodeStructure>();
        Stack<NodeStructure> stack2=new Stack<NodeStructure>();
        stack1.push(root);
        while(!stack1.empty()){
            NodeStructure data=stack1.pop();
            stack2.push(data);
            
            if(data.left!=null){
                stack1.push(data.left);
            }
            
            if (data.right!=null){
                stack1.push(data.right);
            }
        }
        
        while (!stack2.isEmpty()) 
        {
            NodeStructure temp = stack2.pop();
            System.out.print(temp.key + " ");
        }
    }
    
    public void postorderSingleStack(NodeStructure root){
        Stack<NodeStructure> stack1=new Stack<NodeStructure>();
        do{
            while(root!=null){
                if(root.right!=null)
                    stack1.push(root.right);
                stack1.push(root);
                root=root.left;
            }
            root=stack1.pop();
            if(root.right!=null){
                NodeStructure temp=stack1.peek();
                if(root.key==temp.key){
                  stack1.pop();
                  stack1.push(root);
                  root=root.right;  
                }
                else{
                    System.out.print(root.key+" ");
                    root=null;
                }
            }
            
        }while(!stack1.empty());
    }
}
