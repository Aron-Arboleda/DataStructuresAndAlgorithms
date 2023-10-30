public class LinkedLists {
    public static void main(String[] args) throws Exception {
        Node head = new Node(4);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(10);
        Node nodeE = new Node(2);

        head.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        nodeD.next = nodeE;

        System.out.println(LinkedList.countNodes(head));
    }
}

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    static int countNodes(Node head){
        int total = 1;
        Node current = head;
        while (current.next != null){
            total += 1;
            current = current.next;
        }
        return total;
    }
}
