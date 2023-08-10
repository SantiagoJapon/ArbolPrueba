/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package org.arbolprueba;

/**
 *
 * @author MSIBRAVO
 */
public class Ejecutable {

    public static void main(String[] args) {
TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(8);
        root.right.right = new TreeNode(20);
        
        System.out.println("Preorden:");
        preOrder(root);
        System.out.println();
        
        System.out.println("Inorden:");
        inOrder(root);
        System.out.println();
        
        System.out.println("Postorden:");
        postOrder(root);
        System.out.println();
    }
    public static void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }


}
