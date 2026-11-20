/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author User
 */
public class binary {

    public static class Node {
        Applicants employee;
        Node left;
        Node right;

        Node(Applicants employee) {
            this.employee = employee;
        }
    }

    private Node root;

    public Node insert(Applicants employee) { // Begin f the tree first employee
        if (root != null) {
            throw new IllegalStateException("Root already exists.");
        }

        root = new Node(employee);
        return root;
    }

    public Node insert(Node manager, Applicants employee) { // add an employee under the root
        
        if (manager == null) {
            throw new IllegalArgumentException("Manager is required.");
        }

        Node child = new Node(employee); // create Node new employee

        if (manager.left == null) { // if first level full pul to right side
            manager.left = child;
        } else if (manager.right == null) { // if left side full pull to right side
            manager.right = child;
        } else {
            throw new IllegalStateException(  // if try add 3rd employee, it will drop
            // if both side full not add 3rd employee
                "This manager already has two employees."
            );
        }

        return child;
    }

    public void printLevelOrder() { // print level by level
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int level = 1;

        while (!queue.isEmpty()) {
            int levelSize = queue.size(); 
            // save how many employees are at the current level

            System.out.println("Level " + level + ":");

            for (int index = 0; index < levelSize; index++) {
                Node current = queue.remove(); // print first employee 
                Applicants employee = current.employee;

                System.out.println(
                    employee.getName()
                    + " | " + employee.getJobPosition()
                    + " | " + employee.getDepartment()
                ); // add child for next level

                if (current.left != null) {
                    queue.add(current.left);
                }

                if (current.right != null) {
                    queue.add(current.right);
                } // print children next level 
            }

            level++;
        }
    }

    public int getHeight() {  // Count tree height
        return calculateHeight(root);
    }

    private int calculateHeight(Node current) {
        if (current == null) {
            return -1;
        }

        return 1 + Math.max(
            calculateHeight(current.left),
            calculateHeight(current.right)
        );
    }

    public int getTotalNodes() { // count all employees
        return countNodes(root);
    }

    private int countNodes(Node current){
        if (current == null) {
            return 0;
        }

        return 1
            + countNodes(current.left)
            + countNodes(current.right);
    }
}

