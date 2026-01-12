package BST;
public class bst2 {
    static class Node{
        int data ;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.right=null;
            this.left= null;
        }
    }
    public static Node creator(int[] arr, int st, int e){ 
        if (st>e) {
           return null;
        }
        int mid = (st+e)/2;
        Node root = new Node(arr[mid]);
        root.left = creator(arr, st, mid-1);
        root.right = creator(arr, mid+1, e);
        return root;
    }
    public static void inOrder(Node root){
        if (root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        int arr[] ={3,5,6,8,10,11,12};
        Node root = creator(arr, 0, arr.length-1);
        inOrder(root);
    }
}
