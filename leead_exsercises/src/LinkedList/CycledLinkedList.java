package LinkedList;

public class CycledLinkedList<T> {

    private static class Node<T> {
        private T key;
        private Node<T> next;

        public Node(T key) {
            this.key = key;
            this.next = null;
        }

        public String toString() {
            return "key: " + key;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public CycledLinkedList() {
        head=tail=null;
        size=0;
    }

    public void add(T key){
        Node<T> newNode = new Node<>(key);
        if(head == null) head = newNode;
        else  {
            tail.next = newNode;
            newNode.next = head;
        }           
        tail = newNode;
        size++;
    }

    public void remove(T key){
        Node<T> p;
        int count = 0;
        for(p = head; count++<=size ; p=p.next){
            if(p.next.key.equals(key)){
                p.next = p.next.next;
                size--;
            }
        }
    }

    public Node<T> search(T key) {
        int count = 0;
        for(Node<T> p=head; count++<=size ; p=p.next)
            if(p.key.equals(key))
                return p;
        return null;
    }

    public Node<T> at(int i) {
        for(Node<T> p=head; p!=null; p=p.next, i--)
            if(i==0)
                return p;
        return null;
    }

    public void print(){
        if(head == null){
            System.out.println("Size:"+0);
            return;
        }
        int count = 0;
        for(Node<T> p = head; count++<=size ; p=p.next)
            System.out.print(p.key+" -> ");
        System.out.println("null.   Size:"+size+"   Head: "+head.key+"  Tail: "+tail.key);
    }

}