package jd;

import javax.swing.tree.TreeNode;

public class FindTheLowesCommonAncestor {

    public static void main(String[] args) {

        int[] arr= {6,2,8,0,4, Integer.parseInt(null), Integer.parseInt(null), 3,5};
    }

    public static class Node {

        int val;
        Node left;
        Node right;

        // Constructor
        Node(int x) { this.val = x; }
    }

    public static class MyTree {
        // starting point of a tree -> root
        static Node root;

       public static boolean isEmpty(){ return root == null; }

        public static void insert(int data){

            // if root is empty -> insert data there
            if (isEmpty()) {
                root = new Node(data);
                return;
            }

            //Else make new reference to be able to compare left node or right node is empty then insert
            Node node = root;
            // while loop to iterate as long as is true
            while(true){
                if(node.val > data){
                    if(node.left==null){
                        node.left = new Node(data);
                        break;
                    }else node = node.left; // we move to the next node
                }else if(node.val < data){
                    if(node.right==null){
                        node.right = new Node(data);
                        break;
                    }else node = node.right;
                }
            }
        }

        public void preOrderTraversal(Node root){  // Root -> Left -> Right
            if(root==null) return;

            System.out.print(root.val + ", "); // root
            preOrderTraversal(root.left); // left
            preOrderTraversal(root.right); // right
        }
        public static void inOrderTraversal(Node root){ // Left -> Root -> Right
            if (root==null) return;

            inOrderTraversal(root.left);  // left
            System.out.print(root.val + ", ");  // root
            inOrderTraversal(root.right);  // right
        }
        public static Node postOrder(Node root){ // Left -> Right -> Root
            if (root==null) return null;

            inOrderTraversal(root.left); // left
            inOrderTraversal(root.right); // right
            return root; // root
        }



        public static Node lowestCommonAncestor(Node root, Node p, Node q){

            if(root==p || root==q) return root;

            Node node = root;
            Node result = null;

            while (true) {
                if (node == p || node == q) return result;
                if ((node.left == p || node.left == q) && (node.right == p || node.right == q)) {
                    result = node;
                    break;
                }
                if ((node.val > p.val || node.val > q.val)) {
                    if (node.left == p || node.left == q) {
                        result = node.left;
                        break;
                    } else node = node.left;
                }
                if ((node.val < p.val || node.val < q.val)) {
                    if (node.left == p || node.left == q) {
                        result = node.right;
                        break;
                    } else node = node.right;
                }
            }
            return result;
        }

    }










    public static Node lowestCommonAncestor(Node root, Node p, Node q) {

        if (p.val < root.val && q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val && q.val > root.val) return lowestCommonAncestor(root.right, p, q);

        return root;
    }




}
