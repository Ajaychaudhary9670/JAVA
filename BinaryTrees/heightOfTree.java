package BinaryTrees;

import java.lang.Thread.State;

import recursion.decreasingNum;

public class heightOfTree {
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

    public static int Height(Node root) { // O(n)
        if (root == null) {
            return 0;
        }
        int lh = Height(root.left);
        int rh = Height(root.right);
        return Math.max(lh, rh) + 1;

    }

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int leftcount = count(root.left);
        int rightcount = count(root.right);
        return leftcount + rightcount + 1;
    }

    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        int leftcount = sum + sum(root.left);
        int rightcount = sum + sum(root.right);
        return leftcount + rightcount + root.data;
    }


    // 1st approch to calculate Diamerter of tree       //O(n^2)

    public static int Diamerter(Node root){
        if(root==null){
            return 0;
        }
        int leftdiameter = Diamerter(root.left);
        int leftHt = Height(root.left);
        int rightDia = Diamerter(root.right);
        int rightHt = Height(root.right);
        int selfDia = leftHt+rightHt +1;
        return Math.max(selfDia,Math.max(rightDia, selfDia));

    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        print(root, 0);
        System.out.println("height of tree is =  " + Height(root));
        System.out.println("number of nudes in tree is = " + count(root));
        System.out.println("sum of all nodes of tree = " + sum(root));
        System.out.println("diameter of tree is = "+Diamerter(root));

    }

}
