package BinaryTrees;

import String.printLargestStr;

public class practice {
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

    public static class Buildtree {
        static int idx = -1;

        public Node maketree(int nodes[]) { // static
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = maketree(nodes);
            newNode.right = maketree(nodes);
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

    

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Buildtree tree = new Buildtree();
        // Node root = Buildtree.maketree(nodes); //when we use static
        Node root = tree.maketree(nodes);
        System.out.println("root node =  " + root.data);
        print(root,0);
    }
}
