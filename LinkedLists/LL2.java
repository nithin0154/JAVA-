package LinkedLists;

import LinkedLists.LinkedListNonGeneric.*;


public class LL2 {
    private static Node merge(Node lh, Node rh) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while (lh != null && rh != null) {
            if (lh.data <= rh.data) {
                temp.next = lh;
                lh = lh.next;
                temp = temp.next;
            } else {
                temp.next = rh;
                rh = rh.next;
                temp = temp.next;
            }
        }

        while (lh != null) {
            temp.next = lh;
            lh = lh.next;
            temp = temp.next;
        }

        while (rh != null) {
            temp.next = rh;
            rh = rh.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        // to find the mid
        Node mid = findMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        // left and right ms
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        // merge
        return merge(newLeft, newRight);
    }

    private static Node findMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void zigZag(Node head){
        //find the mid
        Node mid = findMid(head);
        //reverse the 2nd half
        
            Node prev = null;
            Node currNode = mid.next;
            mid.next=null;
            Node next = null;
            while (currNode!=null) {
                next = currNode.next;
                currNode.next = prev;
                prev=currNode;
                currNode = next;
                
            }
            Node lh=head;
            Node rh = prev;
            Node nextL,nextR;
            while (lh!=null && rh!=null) {
                nextL=lh.next;
                lh.next = rh;
                nextR = rh.next;
                rh.next = nextL;

                lh = nextL;
                rh= nextR;
            }
    }

    public static void main(String[] args) {
       LinkedListNonGeneric ll = new LinkedListNonGeneric();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.print();
        ll.head =  mergeSort(ll.head);
        ll.print();

        zigZag(ll.head);
        ll.print();
    }

}