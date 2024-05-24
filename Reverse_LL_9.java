public class Reverse_LL_9 {
    private static Node head;

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    public void insertLL(int d) {
        Node node = new Node(d);
        if (head == null) {
            head = node;
            return;
        }
        Node cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    public void reverseLL() {
        Node cur = head;
        Node prev = null;
        Node next = null;

        while (cur != null) {
            next = cur.next;                                                                            
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void display() {
        Node cur = head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Reverse_LL_9 ll = new Reverse_LL_9();
        ll.insertLL(1);
        ll.insertLL(2);
        ll.insertLL(3);
        ll.display();
        ll.reverseLL();
        ll.display();
    }
}
