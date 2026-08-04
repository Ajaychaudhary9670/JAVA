package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

import String.printLargestStr;

public class buildTree {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }

    }

    public static class BinaryTrees { // Time Complexity is O(n)
        static int idx = -1;

        public static Node buildTrees(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]); // step 1 create new Node
            newNode.left = buildTrees(nodes); // left subtree of created Node
            newNode.right = buildTrees(nodes); // right subtree of created Node
            return newNode;

        }

        public static void preOrderTaversal(Node root) { // Time Complexity is O(n)

            if (root == null) {
                // System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");
            preOrderTaversal(root.left);
            preOrderTaversal(root.right);

        }

        public static void inOrderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);

        }

        public static void postorderTraversal(Node root) {
            if (root == null) {
                return;

            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();

                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }

                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }

                }

            }

        }

       

        
    }
     public static void print(Node root,int level){
            if(root==null){
                return;
            }
            print(root.right, level+1);
            for(int i=0;i<level;i++){
                System.out.print("    ");
            }
            System.out.println(root.data);
            print(root.left, level+1);
        }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTrees tree = new BinaryTrees();
        // Node root = tree.buildTrees(nodes);
        // System.out.println(root.data);
        Node root = tree.buildTrees(nodes);

        // System.out.println("preorder");
        // tree.preOrderTaversal(root);

        // System.out.println("inorder");
        // tree.inOrderTraversal(root);
        // System.out.println("postorder");

        // tree.postorderTraversal(root);
        tree.levelorder(root);
        // System.out.println("   ");
      print(root, 0);

    }
}
