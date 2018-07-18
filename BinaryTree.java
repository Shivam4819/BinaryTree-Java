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
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        NthNodeInorder n=new NthNodeInorder();
        n.inorder();
        
        SipralLevelOrder s=new SipralLevelOrder();
        //s.sprialPrint();
        
       // LevelOrder l=new LevelOrder();
       // l.levelOrderPrint();
        
        NewLineLevelOrder l=new NewLineLevelOrder();
      //  l.newLinePrint();
        
        ReverseOrderPrint r=new ReverseOrderPrint();
      //  r.reverOrder();
    }
    
}
