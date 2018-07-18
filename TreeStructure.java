/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author shivam
 */
class NodeStructure{
     protected int key;
    protected NodeStructure left,right;
}
public class TreeStructure extends NodeStructure{
    NodeStructure root,newnode1,temp,temp1;
    
    public void insert() throws InputMismatchException{
        Scanner scanner =new Scanner(System.in);
        boolean flag=true,flag1=true;
        int lastValue=0,num=0,data=0;
        
        while(flag1){
            try{
            System.out.print("enter the no of data-");
            num=scanner.nextInt();
            flag1=false;
            }
            catch(InputMismatchException i){
                System.out.println("wrong input!!..");
                scanner.nextLine();
            }
        }
        flag1=true;
        for (int i = 0; i < num; i++) {
            
            while(flag1){
                try{
                System.out.print("enter data-");
                data=scanner.nextInt();
                flag1=false;
                }
                catch(InputMismatchException e){
                    System.out.println("wrong input!!..");
                    scanner.nextLine();
                }
            }
            flag1=true;

            newnode1=new NodeStructure();
            newnode1.left=null;
            newnode1.key=data;
            newnode1.right=null;
            
            
            if(root==null){
                root=newnode1;
                System.out.println("root is inserted");
            }
            else{
                temp=root;
                System.out.println("you are in else");
                flag=true;
                while(flag){
                    
                    System.out.print("where you want to insert-");
                    char choice=scanner.next().charAt(0);
                    if(choice=='l'){
                        if(temp.left==null){
                            temp.left=newnode1;
                            System.out.println("inserted on left");
                            flag=false;
                        }
                        else{
                            temp=temp.left;
                            System.out.println("moved left");
                            flag=true;
                        }
                    }
                    else if(choice=='r'){
                        if(temp.right==null){
                            temp.right=newnode1;
                            System.out.println("inserted on right");
                            flag=false;
                        }
                        else{
                            temp=temp.right;
                            System.out.println("moved right");
                            flag=true;
                        }
                    }
                    else
                        System.out.println("wrong choice");
                }
            }
        }
    }
    
    public void nthinorder(NodeStructure root, int num){
    int count=0;
        if(root==null)
            return;
        if(count<=num){
            nthinorder(root.left,num);
            count++;
           // System.out.println("count->"+c);
            if(count==num)
                System.out.println(root.key+" ");
        
            nthinorder(root.right,num);
        }
    }
    public void inorder(NodeStructure root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.println(root.key+" ");
        inorder(root.right);
    }
    
    NodeStructure getroot(){
        return root;
    }
}
