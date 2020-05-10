package LinkedList;

public class SortedLinkedList {

    private static class Node{
        private int key;
        private Node next;

        public Node(int key){
            this.key = key;
            this.next = null;
        }
    }

    private Node head, tail;
    private int size = 0;

    public SortedLinkedList(){
        head = tail = null;
    }

    public void add(int key){
        Node newNode = new Node(key);
        if(head == null)
            head = tail = newNode;
        else if(key < head.key){
            newNode.next = head;
            head = newNode;
        }
        else if(key > tail.key)
            tail.next = newNode;
        else{
            for(Node p=head; p.next!=null ; p=p.next)
                if(key<p.next.key){
                    newNode.next = p.next;
                    p.next = newNode;
                }
        }
        size++;
    }

    public int size(){
        return size;
    }

}