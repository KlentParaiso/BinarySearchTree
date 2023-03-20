/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinarySearchTree;

/**
 *
 * @author Paraiso_ICS104
 */
public class Tester {
    public static void main(String[] args) {
      BST bst = new BST();
        bst.insert(40);
        bst.insert(30);
        bst.insert(25);
        bst.insert(35);
        bst.insert(50);
        bst.insert(30);
        bst.insert(45);
        bst.insert(60);
        System.out.println(bst.traverInOrder());  
      System.out.println(bst.traverPreOrder());
      System.out.println(bst.traverPostOrder());
      
     System.out.println(bst.search(50));

    }
        
    


}
