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
    public static boolean isIdentical(Node fnode , Node subroot){
        if(fnode ==null && subroot ==null){
            return true;
        }else if (fnode ==null || subroot ==null || fnode.data!= subroot.data) {
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
        if(root==null){
            return false;
        }
        if(root.data == subroot.data){
           if (isIdentical(root,subroot)) {
             return  true;
           }
        }
        return subtreeExists(root.left, subroot) || subtreeExists(root.right, subroot);
    }

    static class Info {
     Node node ;
     int hdist;
        Info(Node node, int hdist){
            this.node = node;
            this.hdist = hdist;
        }
    }

    public static void topView(Node root){
        //
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        int min =0,max =0;
        q.add(new Info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr==null) {
                if (q.isEmpty()) {
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if (!map.containsKey(curr.hdist)) {
                    map.put(curr.hdist, curr.node);
                }
                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hdist - 1));
                    min = Math.min(curr.hdist - 1, min);
                }
                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hdist +1));
                    max = Math.max(curr.hdist + 1, max);
                }
            }
        }
        for (int i = min; i <=max; i++) {
            System.out.print(map.get(i).data+" ");
        }

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


        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        HashMap<Integer,Integer> map = new HashMap<>();

        System.out.println(subtreeExists(root, subroot));
        topView(root);
    }
}
