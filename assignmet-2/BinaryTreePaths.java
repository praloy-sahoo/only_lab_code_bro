import java.util.ArrayList;

/* ============ OUTER CLASS ============ */
class BinaryTree {

    /* ============ INNER NODE CLASS ============ */
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    Node root;

    /* ============ METHOD TO PRINT ROOT TO LEAF PATHS ============ */
    void printPaths(Node node, ArrayList<Integer> path) {

        if (node == null)
            return;

        // add current node to path
        path.add(node.data);

        // if leaf node, print the path
        if (node.left == null && node.right == null) {
            for (int x : path) {
                System.out.print(x + " ");
            }
            System.out.println();
        } 
        else {
            // go left and right
            printPaths(node.left, path);
            printPaths(node.right, path);
        }

        // backtracking
        path.remove(path.size() - 1);
    }
}

/* ============ MAIN CLASS ============ */
public class BinaryTreePaths {
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        /*
                1
               / \
              2   3
               \
                5
        */

        tree.root = tree.new Node(1);
        tree.root.left = tree.new Node(2);
        tree.root.right = tree.new Node(3);
        tree.root.left.right = tree.new Node(5);

        ArrayList<Integer> path = new ArrayList<>();

        System.out.println("Root to Leaf Paths:");
        tree.printPaths(tree.root, path);
    }
}
