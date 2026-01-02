package LinkedLists;
// import java.util.LinkedList;

import Strings.palindromstring;

public class LinkedListNonGeneric {

    public static Node head;
    public static Node tail;
    static int size = 0;

    // methods to add, remove, display, etc. can be added here
    public void print() {
        if (head == null) {
            System.out.println("The linkedlist is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("null");
        System.out.println();

    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;

    }

    public void add(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            i++;
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        int val = head.data;
        if (head == null) {
            System.out.println("The Linked list is empty");
            return Integer.MAX_VALUE;
        } else if (head.next == null) {
            head = tail = null;
            size--;
            return val;
        }
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        Node temp = head;
        Node prev = tail;
        if (size == 0) {
            System.out.println("The Linked list is empty");
            return Integer.MAX_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        int val = temp.data;
        size--;
        prev.next = null;
        tail = prev;
        return val;
    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // find method returns the index of first occurence or returns -1 if not found

    public int find(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            i++;
            temp = temp.next;
        }
        return -1;
    }

    // Find method using the recursion
    public int findRec(int key) {
        return helper(key, head, 0);
    }

    public int helper(int key, Node temp, int i) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return i;
        }
        return helper(key, temp.next, i + 1);
    }

    public void reverse() {
        Node prev = null;
        Node currNode = tail = head;
        Node after = null;
        while (currNode != null) {
            after = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = after;
        }
        head = prev;
    }

    public int removeNthFromEnd(int N) {
        int m = (size - N) + 1;
        int i = 1;
        Node temp = head;
        if (N == size) {
            int val = head.data;
            head = head.next;
            return val;
        }
        while (i < m - 1) {
            temp = temp.next;
            i++;
        }
        int val = temp.next.data;
        temp.next = temp.next.next;
        return val;
    }

    // This is done using an extra space such that space comp= O(n);
    public boolean palindromeCheck() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data);
            temp = temp.next;
        }
        System.out.println(sb);
        return palindromstring.isPalindrome(sb.toString());
    }

    // slow-fast approach
    public Node findMid(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // To do check the palidrome of LL with space comp as O(1)
    public boolean isPalindromeByNoExtraSpace() {
        if (head == null || head.next == null) {
            return true;
        }
        // step-1 : find mid
        Node mid = findMid(head);
        // Step-2 : find reverse of second half
        Node prev = null;
        Node currNode = mid;
        Node next = null;
        while (currNode != null) {
            next = currNode.next;
            currNode.next = prev;
            prev = currNode;
            currNode = next;
        }
        Node rightHead = prev;
        Node leftHead = head;
        while (rightHead != null) {
            if (leftHead.data != rightHead.data) {
                return false;
            }
            leftHead = leftHead.next;
            rightHead = rightHead.next;
        }
        return true;
    }

    //Find if there is cycle in the LL or not?
    //Floyd's cycle finding algorithm is used to find this Problem exists or not.
     public static boolean isInCycle(){
        Node slow = head;
        Node fast= head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow==fast) {
                return true;
            }
        }
        return false;
     }
     public static void removeCycle(){
         Node slow = head;
         Node fast = head;
         while (fast != null && fast.next != null) {
             slow = slow.next;
             fast = fast.next.next;
             if (slow == fast) {
                break;
             }
         }
         slow = head;
         Node prev= null;
         while (fast!=slow) {
            prev=fast;
            fast=fast.next;
            slow=slow.next;
         }
         prev.next=null;
     }


    public static void main(String[] args) {
        // LinkedListNonGeneric ll = new LinkedListNonGeneric();
        // LinkedList<Integer> ll2 = new LinkedList<>();
        // ll2.add(5, 8);
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(250);
        // // ll.print();
        // ll.add(2, 25);
        // ll.add(2, 45);
        // ll.print();
        // palindromstring ps = new palindromstring();
        // // ll.removeLast();
        // // ll.print();

        // // System.out.println(ll.find(1));
        // // System.out.println(ll.findRec(1));
        // // System.out.println(ll.size);
        // // ll.reverse();
        // ll.print();
        // System.out.println(ll.removeNthFromEnd(1));
        // ll.print();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addLast(2);
        // ll.print();
        // System.out.println(ll.palindromeCheck());
        // System.out.println(ll.isPalindromeByNoExtraSpace());

            head= new Node(1);
            Node temp =new Node(2);
            head.next= temp;
            head.next.next = new Node(3);
            head.next.next.next = temp;
            
        System.out.println(isInCycle());
        removeCycle();
        System.out.println(isInCycle());
    }

}