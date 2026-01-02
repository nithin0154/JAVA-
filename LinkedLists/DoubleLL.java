package LinkedLists;


public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    //print 
    public void printList(Node current){
        Node temp = current;
        // System.out.print("null");
        while (temp!=null) {
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.print("null");
    }
    //add first 
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=tail=newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode; 
        } 
        size++;
    }
    //addLast
    public void addLast(int data){
        Node newNode = new Node(data);
        if( head==null){
            head=tail=newNode;
        }
       else{
        tail.next=newNode;
        newNode.next=null;
        newNode.prev=tail;
        tail=newNode;
       }
       size++;
    }
    //removeFirst
    public int removeFirst(){
        if (head==null) {
          System.out.println("The list is empty");
          return Integer.MAX_VALUE;
        }
        else if (head.next==null) {
            
        }
            Node temp = head;
            head = temp.next;
            int val = temp.data;
            head.prev = null;
            size--;
            return val;  
    }
    public int removeLast(){
        if(head==null){
            System.out.println("The list is empty");
            return Integer.MAX_VALUE;
        }if(head.next==null){
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        Node temp= tail;
        int val= temp.data;
        tail = temp.prev;
        tail.next=null;
        size--;
        return val;
    }
    public void reverse(){
        Node curr= head;
        Node next= null;
        Node prev= null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        Node newNode= dll.new Node(5);
        head = newNode;
        tail = newNode;
        dll.addLast(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.addLast(4);
        

        //printing
        // dll.printList(head);
        // System.out.println();
        // System.out.println(dll.removeFirst());
        // dll.printList(head);
        // System.out.println();
        // System.out.println(dll.removeLast());
        // dll.printList(head);
        dll.printList(head);
        dll.reverse();
        System.out.println();
        dll.printList(head);
    }
}
