package BST;

import ImportantQuestion.repeatArray;

public class treeCreation {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }

    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }
        return root;

    }

    public static void inOrder(Node root) {
        if (root == null) {
            return;

        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Boolean Search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }
        if (root.data > key) {
            return Search(root.left, key);
        } else {
            return Search(root.right, key);
        }

    }

    public static Node Delete(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.data > key) {
            root.left = Delete(root.left, key);
        } else if (root.data < key) {
            root.right = Delete(root.right, key);
        } else {
            if (root.left == null && root.right == null) { // case1
                return null;

            }
            if (root.right == null) { // case2
                return root.left;

            } else if (root.left == null) {
                return root.right;
            }

            Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = Delete(root.right, Is.data);
        }
        return root;

    }

    public static Node findInorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;

        }
        return root;
    }

    public static void main(String[] args) {
        int val[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;
        for (int i = 0; i < val.length; i++) {
            root = insert(root, val[i]);
        }
        inOrder(root);
        System.out.println();
        // System.out.println(Search(root, 11));
        System.out.println(Delete(root, 1));
        inOrder(root);

    }

}
