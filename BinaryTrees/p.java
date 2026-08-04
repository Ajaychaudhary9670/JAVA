package BinaryTrees;



public class p {
    public static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;

        }

    }

    public static class buildTree {
        static int idx = -1;

        public static Node maketree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = maketree(nodes);
            newNode.right = maketree(nodes);
            return newNode;

        }

        public static void preOrderTaversal(Node root) {
            if (root == null) {
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

        public static void postorder(Node root) {
            if (root == null) {
                return;

            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");

        }

    }

    public static void print(Node root, int level) {
        if (root == null) {
            return;

        }
        print(root.right, level + 1);
        for (int i = 0; i < level; i++) {
            System.out.print("     ");
        }
        System.out.println(root.data);
        print(root.left, level + 1);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        buildTree tree = new buildTree();
        Node root = tree.maketree(nodes);
        System.out.println(root.data);
        print(root, 0);
        System.out.println(" ");
        tree.preOrderTaversal(root);
        System.out.println(" ");

        tree.postorder(root);
        System.out.println(" ");
       tree.inOrderTraversal(root);

    }
}