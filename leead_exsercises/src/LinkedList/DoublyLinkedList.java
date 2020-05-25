package LinkedList;
/******************************************************************************
*  @author Eyal Levi
*  https://github.com/LeviEyal
*  Data Structures 2020 - CS Ariel university
*  Doubly Linked List (generic)
******************************************************************************/
public class DoublyLinkedList<T> {

    private static class Node<T>{
        private T key;
        private Node<T> prev,next;

        public Node(T key, Node<T> prev, Node<T> next){
            this.key = key;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node<T> head, tail;
    private int size;

    public DoublyLinkedList(){
        head = tail = null;
        size = 0;
    }

    public void add(T val){
        if(head == null)
            head = tail = new Node<>(val, null, null);
        else{
            tail.next = new Node<>(val, tail, null);
            tail = tail.next;
        }
        size++;
    }

    public void removeFirst(){
        if(head != null){
            head = head.next;
            size--;
            if(head != null)
                head.prev = null;
        } 
    }

    public void removeLast(){
        if(tail != null){
            tail = tail.prev;
            size--;
            if(tail != null)
                tail.next = null;
            else head = null;
        }
    }

    public void remove(T val){
        Node<T> t = search(val);
        if(head == t) removeFirst();
        else if(tail == t) removeLast();
        else if(t != null){
            t.prev.next = t.next;
            t.next.prev = t.prev;
            size--;
        }
    }

    public Node<T> search(T val){
        for(Node<T> p=head; p!=null; p=p.next)
            if(p.key.equals(val))
                return p;
        return null;
    }

    public void print(){
        if(head == null){
            System.out.println("Size:"+0);
            return;
        }
        for(Node<T> p = head; p!=null; p=p.next)
            System.out.print(p.key+" -> ");
        System.out.println("null.   Size:"+size+"   Head: "+head.key+"  Tail: "+tail.key);
    }
}