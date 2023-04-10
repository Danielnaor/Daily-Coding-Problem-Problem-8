/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.daily_coding_problem_problem_8;

/**
 *
 * @author carmitnaor
 */
public class mainClass {
    

    public static void main(String[] args) {
        UnivalNode root = 
        new UnivalNode(0,
            new UnivalNode(1, null, null), new UnivalNode(0, 
                new UnivalNode(1, new UnivalNode(1, null, null), 
                    new UnivalNode(1, null, null)), new UnivalNode(0, null, null)));
        UnivalTree tree = new UnivalTree();
        tree.setRoot(root);
        System.out.println(tree.count_the_number_of_unival_subtrees());
    }
    
    
    
    
    
    
    
    
    
    
}
