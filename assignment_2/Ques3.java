/*
Given the root of a binary tree, return all root-to-leaf paths in any order. A leaf is a node with no
children. Treat a node as an inner class. Write appropriate code representing the node containing
an integer (1>n>100) or a string (6 letter names). You may use ArrayList (List<String> example = new
ArrayList<String/Integer>();).
*/

import java.util.ArrayList;
import java.util.Scanner;

class BinaryTree {
    class Node {
        int data;
        Node left, right;
        Node(int data) { this.data = data; }
    }

    Node root;

    // tree 
    public Node buildFromArray(int[] arr, int i) {
        if (i >= arr.length || arr[i] == -1) return null;

        Node newNode = new Node(arr[i]);
        newNode.left = buildFromArray(arr, 2 * i + 1);
        newNode.right = buildFromArray(arr, 2 * i + 2);
        return newNode;
    }

    void printPath(Node x, ArrayList<Integer> path) {
        if (x == null) return;
        path.add(x.data);

        if (x.left == null && x.right == null) {
            System.out.println("Path: " + path);
        } else {
            printPath(x.left, path);
            printPath(x.right, path);
        }
        path.remove(path.size() - 1);
    }
}

public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements (-1 for null):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BinaryTree tree = new BinaryTree();
        tree.root = tree.buildFromArray(arr, 0);

        System.out.println("\nall path:");
        tree.printPath(tree.root, new ArrayList<>());
        
        sc.close();
    }
}
