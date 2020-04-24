/*
-------------------------------
    Eyal Levi
-------------------------------
*/
package Stack_And_Queue.src;

public class Queue_LL<T> {

    private static class Node<T>{
        private T key;
        private Node<T> next;

        public Node(T key){
            this.key = key;
            next = null;
        }
        public String toString(){
            return ""+key;
        }
    }

    private int size;
    private Node<T> first, last;

    public Queue_LL(){
        size = 0;
        first = last = null;
    }

    public void enQueue(T key){
        Node<T> newNode = new Node<>(key);
        if(size==0)
            first = last = newNode;
        else{
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    public Node<T> deQueue(){
        if(size == 0) return null;
        else{
            size--;
            Node<T> t = first;
            first = first.next;
            return t;
        }
    }

    public int size(){
        return size;
    }

    public void clear(){
        first = last = null;
        size = 0;
    }

    public String toString(){
        if(size==0) return "The Queue is empty";
        String s="";
        for(Node<T> p=first; p!=null; p=p.next){
            s+="|"+p.key+"|";
            if(p == last)
                s+=" <-- LAST";
            if(p == first)
                s+=" <-- FIRST";
            s+="\n";
        }
        return s;
    }



}