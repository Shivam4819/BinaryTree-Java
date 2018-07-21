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
       
        NthNodeInorder node=new NthNodeInorder();
        node.inorder();
        
        NthNodePostorder nthnode=new NthNodePostorder();
        nthnode.postOrder();
        
        SipralLevelOrder s=new SipralLevelOrder();
        s.sprialPrint();
        
        LevelOrder levelorder=new LevelOrder();
        levelorder.levelOrderPrint();
        
        NewLineLevelOrder newline=new NewLineLevelOrder();
        newline.newLinePrint();
        
        ReverseOrderPrint reverse=new ReverseOrderPrint();
        reverse.reverOrder();
        
        DiagonalTraversal d=new DiagonalTraversal();
        d.diagonal();
        
        SpecificLevelOrder specific =new SpecificLevelOrder();
        specific.specificPrinting();
        
        MorrisTraversal morris = new MorrisTraversal();
        morris.morrrisPrinting();
        
        ItrativeTraversal itrative=new ItrativeTraversal();
        itrative.traversals();
        
    }
    
}
