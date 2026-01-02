
import java.util.LinkedList;
import java.util.Queue;

public class BTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class Info{
        int height;
        int diameter;
        Info(int height, int diameter){
            this.diameter = diameter;
            this.height = height;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrderPrinter(Node root) { // T.C = O(n)
            if (root == null) {
                // System.out.print("-1"+" ");
                return;
            }
            System.out.print(root.data + " ");
            preOrderPrinter(root.left);
            preOrderPrinter(root.right);

        }

        public static void inOrder(Node root) { // T.C = O(n)
            if (root == null) {
                // System.out.print("-1" + " ");
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

        }

        public static void postOrder(Node root) { // T.C = O(n)
            if (root == null) {
                // System.out.print("-1" + " ");
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        
        public static void levelOrder(Node root){
           if (root==null) {
             return ;
           }
           Queue <Node> q = new LinkedList<>();
           q.add(root);
           q.add(null);
           while (!q.isEmpty()) {
              Node currNode = q.remove();
              if (currNode==null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
              }else{
                System.out.print(currNode.data+" ");
                if (currNode.left!=null) {
                    q.add(currNode.left);
                }
                if (currNode.right!=null) {
                    q.add(currNode.right);
                }
              }
           }
        }
    }

    public static int heightOfTree(Node root) {
        if (root == null) {
            return 0;
        }
        int height = Math.max(heightOfTree(root.left),heightOfTree(root.right))+1;
        return height;
        // return height;
    }

    public static int countOfNodes(Node root){
        if (root==null) {
            return 0;
        }
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return (leftNodes + rightNodes+1);
    }

    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftNodes = sumOfNodes(root.left);
        int rightNodes = sumOfNodes(root.right);
        return (leftNodes + rightNodes + root.data);
    }

    //Diameter in the Trees : The maximum no of nodes b/w any two leaf nodes 
    //Approach 1: using the Pre built height function which leads to time complexity of O(n^2);

    public static int treeDiameter(Node root){
        if(root==null){
            return 0;
        }
        int ld = heightOfTree(root.left);
        int rd = heightOfTree(root.right);

        //Passes through the root node case 
        int dia = ld+rd+1;

        return Math.max(dia, Math.max(treeDiameter(root.left),treeDiameter(root.right)));
    }
    
    //Approch 2 : Using the same function for calculating the height and diameter 
    //this approach uses a class with height and diameter of each node 
    //T.C = O(n)
    public static Info diaCalculator(Node root){
        if(root==null){
            return new Info(0, 0);
        }
        Info left = diaCalculator(root.left);
        Info right = diaCalculator(root.right);
        
        int currDia = Math.max((left.height+right.height+1),Math.max(left.diameter, right.diameter));
        int currHeight = (Math.max(left.height, right.height)+1);
        return new Info(currHeight, currDia);
    }


    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);

        // tree.preOrderPrinter(root);
        // System.out.println();
        // System.out.println("-----------");
        // tree.inOrder(root);
        // System.out.println();
        // System.out.println("-----------");
        // tree.postOrder(root);
        // System.out.println();

        tree.levelOrder(root);
        System.out.println(heightOfTree(root));
        System.out.println();
        System.out.println("The total no of nodes in the tree: "+ countOfNodes(root));
        System.out.println("The sum of values of all the nodes: " + sumOfNodes(root));
        System.out.println("The diameter of the tree:"+treeDiameter(root));
        Info obj = diaCalculator(root);
        System.out.println("The diameter of the tree: " + obj.diameter+", Height : "+ obj.height);

    }
}
