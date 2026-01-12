package Trees;
import java.util.*;

public class checkSubTreeExists {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node fnode, Node subroot) {
        if (fnode == null && subroot == null) {
            return true;
        } else if (fnode == null || subroot == null || fnode.data != subroot.data) {
            return false;
        }
        if (!isIdentical(fnode.left, subroot.left)) {
            return false;
        }
        if (!isIdentical(fnode.right, subroot.right)) {
            return false;
        }
        return true;
    }

    public static boolean subtreeExists(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }
        return subtreeExists(root.left, subroot) || subtreeExists(root.right, subroot);
    }

    static class Info {
        Node node;
        int hdist;

        Info(Node node, int hdist) {
            this.node = node;
            this.hdist = hdist;
        }
    }

    public static void topView(Node root) {
        //
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hdist)) {
                    map.put(curr.hdist, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hdist - 1));
                    min = Math.min(curr.hdist - 1, min);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hdist + 1));
                    max = Math.max(curr.hdist + 1, max);
                }
            }
        }
        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }

    }

    // This is the approach to print the nodes at kth level using inOrder Traversal
    public static void kthLevelNodes(Node root, int k) {
        if (root == null) {
            return;
        }
        int count = 1;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                count++;
                // System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (count == k) {
                    System.out.print(curr.data + " ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr==null) {
                if (q.isEmpty()) {
                    break;
                }else{
                    System.out.println();
                    q.add(null);
                }
            }else{
                System.out.print(curr.data+" ");
                if (curr.left!=null) {
                    q.add(curr.left);
                }
                if (curr.right!=null) {
                    q.add(curr.right);
                }
            }
        }

    }

    // The kth level nodes can be printed using recursion
    public static void recKthLevelNodes(Node root, int level, int cl) {
        if (root == null) {
            return;
        }
        if (level == cl) {
            System.out.print(root.data + " ");
            return;
        }
        recKthLevelNodes(root.left, level, cl + 1);
        recKthLevelNodes(root.right, level, cl + 1);
    }

    public static boolean getPath(Node root, int n, ArrayList<Node> list) {
        if (root == null) {
            return false;
        }
        list.add(root);
        if (root.data == n) {
            return true;
        }
        boolean foundLeft = getPath(root.left, n, list);
        boolean foundRight = getPath(root.right, n, list);
        if (foundRight || foundLeft) {
            return true;
        }
        list.remove(list.size() - 1);
        return false;
    }

    public static Node lca(Node root, int n1, int n2) {
        ArrayList<Node> list1 = new ArrayList<>();
        ArrayList<Node> list2 = new ArrayList<>();

        getPath(root, n1, list1);
        getPath(root, n2, list2);
        int i = 0;
        for (i = 0; i < list1.size() && i < list2.size(); i++) {
            if (list1.get(i) != list2.get(i)) {
                break;
            }
        }
        Node lca = null;
        if (i > 0) {
            lca = list1.get(i - 1);
        }
        return lca;

    }

    // Approach 2 : to find the Lowest Common Ancestor\
    public static Node lca2(Node root, int n1, int n2) {
        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }
        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);

        if (right == null) {
            return left;
        }
        if (left == null) {
            return right;
        }
        return root;
    }

    // The program to find the min distance( No of nodes ) B/W two given Nodes

    public static int minDistance(Node root, int n1, int n2) {

        Node lcak = lca2(root, n1, n2);
        if (lcak == null) {
            return -1;
        }
        // System.out.println(lcak.data);
        return lcaDist(lcak, n1) + lcaDist(lcak, n2);
    }

    public static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);

        if (left == -1 && right == -1) {
            return -1;
        } else if (left == -1) {
            return right + 1;
        } else {
            return left + 1;
        }
    }

    // Finding the Kth Ancestor of Given data
    public static int kthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int leftDist = kthAncestor(root.left, n, k);
        int rightDist = kthAncestor(root.right, n, k);

        if (leftDist == -1 && rightDist == -1) {
            return -1;
        }
        int max = Math.max(leftDist, rightDist);
        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
    }

    //Finding the sum tree

    public static int sumTree(Node root){
        if(root==null){
            return 0;
        }
        int leftsum = sumTree(root.left);
        int rightsum = sumTree(root.right);
        int k = root.data;
        root.data = leftsum+rightsum ;
        return leftsum+rightsum+k;
    }

    public static void main(String[] args) {

        ////
        /// 1
        /// / \
        /// 2 3
        /// / \ / \
        /// 4 5 6 7
        ///

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Node subroot = new Node(2);
        // subroot.left = new Node(4);
        // subroot.right = new Node(5);

        // HashMap<Integer,Integer> map = new HashMap<>();

        // System.out.println(subtreeExists(root, subroot));
        // // topView(root);
        // kthLevelNodes(root, 3);
        // System.out.println();
        // recKthLevelNodes(root, 3, 1);
        // System.out.println();
        // System.out.println("-----------------");
        // Node k = lca2(root, 0, 0);
        // if (k != null) {
        //     System.out.println(k.data);
        // } else {
        //     System.out.println("No such nodes exists in the tree");
        // }
        // // System.out.println(lca2(root, 0, 0).data);
        // System.out.println(minDistance(root, 0, 6));
        // System.out.println();

        // kthAncestor(root, 4, 1);
        sumTree(root);
        levelOrder(root);
    }
}
