// package revision;

// public class buildTree {
//     public static class Node {
//         int data;
//         Node left;
//         Node right;

//         Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null;
//         }
//     }

//     public static class build {
//         static int idx = -1;

//         public static Node buildT(int nodes[]) {
//             idx++;
//             if (nodes[idx] == -1) {
//                 return null;
//             }
//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildT(nodes);
//             newNode.right = buildT(nodes);
//             return newNode;
//         }
//     }

//     public static void print(Node root, int level) {
//         if (root == null) {
//             return;

//         }
//         print(root.right, level + 1);
//         for (int i = 0; i < level; i++) {
//             System.out.print("   ");
//         }
//         System.out.println(root.data);
//         print(root.left, level + 1);

//     }

//     public static void main(String[] args) {
//         int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
//         // Node root = build.buildT(nodes);
//         // System.out.println("root node is: "+root.data);
//         // print(root, 0);

//         Node root = build.buildT(nodes);

//         System.out.println("Root node is: " + root.data);

//         print(root, 0);

//     }

// }

package revision;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.text.Position;

import Stack.stackRev;

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

    public static class build {
        static int idx = -1;

        public static Node buildT(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildT(nodes);
            newNode.right = buildT(nodes);
            return newNode;

        }
    }

    public static void print(Node root, int level) {
        if (root == null) {
            return;
        }
        print(root.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("    ");
        }
        System.out.println(root.data);
        print(root.left, level + 1);
    }

    public static void InOrderTraverasal(Node root) {
        if (root == null) {
            return;
        }
        InOrderTraverasal(root.left);
        System.out.print(root.data + " ");
        InOrderTraverasal(root.right);
    }

    public static void preOrderTaversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrderTaversal(root.left);
        preOrderTaversal(root.right);
    }

    public static void postorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelOrderTraversal(Node root){
        if(root==null){
            return;
        }
        Queue <Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode = q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+ " ");
                if(currNode.left!=null)
                    q.add(currNode.left);
                if(currNode.right!=null)
                    q.add(currNode.right);
            }

            
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = build.buildT(nodes);
        System.out.println("root of the tree is : " + root.data);

        print(root, 0);

        System.out.print("preOrderTraversal is = ");
        preOrderTaversal(root);

        System.out.println();

        System.out.print("InOrderTraversal is = ");
        InOrderTraverasal(root);

        System.out.println();

        System.out.print("PostOrderTraversal is = ");
        postorderTraversal(root);
        System.out.println();

    

        levelOrderTraversal(root);

    }

}