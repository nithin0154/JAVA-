package BST;

import java.util.ArrayList;

import javax.swing.event.InternalFrameAdapter;

import Arrays.rainwater;
import Patterns.revNum;
import Strings.isAnagram;

public class start {
    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node createBST(Node root, int n) {
        if (root == null) {
            return new Node(n);
        }
        if (n < root.data) {
            root.left = createBST(root.left, n);
        } else {
            root.right = createBST(root.right, n);
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
    
    public static void inOrderReturner(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        inOrderReturner(root.left,list);
        list.add(root.data);
        inOrderReturner(root.right,list);
    }

    // Print in range
    public static boolean searchInBST(Node root, int k) {
        if (root == null) {
            return false;
        }
        if (root.data == k) {
            return true;
        } else if (k < root.data) {
            return searchInBST(root.left, k);
        } else {
            return searchInBST(root.right, k);
        }
    }

    public static Node iSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static Node removerNode(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (root.right == null && root.left == null) {
            return null;
        }
        if (root.left == null) {
            return root.right;
        }
        if (root.right == null) {
            return root.left;
        }
        Node iS = iSuccessor(root.right);
        root.data = iS.data;
        root.right = removerNode(root.right, iS.data);
        return root;
    }

    public static Node deleteNode(Node root, int k) {
        if (root == null) {
            return null;
        }
        if (root.data == k) {
            return removerNode(root, k);
        } else if (k < root.data) {
            root.left = deleteNode(root.left, k);
        } else {
            root.right = deleteNode(root.right, k);
        }
        return root;
    }

    public static void printInRange(Node root, int k1, int k2) {
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        } else if (root.data < k1) {
            printInRange(root.right, k1, k2);
        } else {
            printInRange(root.left, k1, k2);
        }
    }

    public static void rtoLPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(path);
        }
        rtoLPath(root.left, path);
        rtoLPath(root.right, path);
        path.removeLast();
    }
    //This approach is by getting the inorder traversal and checking the order is ascending or not
    public static boolean validateBST(Node root){
        ArrayList<Integer> list = new ArrayList<>();
        inOrderReturner(root,list);
        System.out.println(list);
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i)>list.get(i+1)) {
                return false;
            }
        }
        return true;
    }
    

    //Approach to validate a BST :  Max(LEFT SUB TREE)<root && Min(RIGHT SUB TREE) for all nodes then return true else false
    public static boolean isValidBST(Node root ,Node min, Node max){
        if (root==null) {
            return true;
        }
        if (min!=null && min.data>=root.data) {
                return false;
        }
        else if (max!=null && max.data<= root.data) {
            return false;
        }
        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
        
    }
    
    public static Node mirrorBst(Node root) {
        if (root == null) {
            return null;
        }
        Node leftSubTree = mirrorBst(root.left);
        Node rightSubTree = mirrorBst(root.right);

        root.left = rightSubTree;
        root.right = leftSubTree;
        return root;
    }
   

    public static void main(String[] args) {
        int values[] = { 8, 5, 3, 1, 4, 6, 10, 11, 14 };
        int kms[] = { 5, 3, 7, 1, 4, 2 };
        int m[] ={1,1,1};
        Node root = null;
        for (int i = 0; i < kms.length; i++) {
            root = createBST(root, kms[i]);
        }
        inOrder(root);
        System.out.println();
        root = mirrorBst(root);
        inOrder(root);
        // System.out.println(root.data);
        // System.out.println(searchInBST(root, 5));

        // root = deleteNode(root,3 );
        // inOrder(root);

        // Print in range
        // printInRange(root, 1,5);
        // ArrayList<Integer> path = new ArrayList<>();
        // rtoLPath(root, path);
        System.out.println(isValidBST(root,null,null));
    }
}
