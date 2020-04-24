package LinkedList.src;

public class SingleLinkedList<T> {

    private static class Node<T>{
        private T key;
        private Node<T> next;

        public Node(T key){
            this.key = key;
            this.next = null;
        }

        public String toString(){
            return "key: "+key;
        }
    }

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public SingleLinkedList(){
        head=tail=null;
        size=0;
    }

    public void add(T key){
        Node<T> newNode = new Node<>(key);
        if(head == null) head = newNode;
        else             tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void remove(T key){
        Node<T> p;
        if(head.key.equals(key)){
            if(size == 1){
               head = tail = null; 
               return;
            } 
            head=head.next;
            size--;
            return;
        } 
        for(p = head; p.next!=null; p=p.next){
            if(p.next.key.equals(key)){
                p.next = p.next.next;
                size--;
                if(p.next == null){
                    tail = p;
                    return;
                }  
            }
        }
    }

    public Node<T> search(T key) {
        for(Node<T> p=head; p!=null; p=p.next)
            if(p.key.equals(key)) return p;
        return null;
    }

    public Node<T> at(int i) {
        for(Node<T> p=head; p!=null; p=p.next, i--)
            if(i==0) return p;
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