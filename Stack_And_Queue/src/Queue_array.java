package Stack_And_Queue.src;
/*
-------------------------------
    Eyal Levi
-------------------------------
*/

public class Queue_array<T> {

    private T a[];
    private int first, last;
    private int size;

    public Queue_array(int capacity){
        a = (T[]) new Object[capacity];
        size=0;
        first = 0;last = -1;
    }

    public boolean enQueue(T element){
        if(isfull()) return false;
        a[(++last)%a.length] = element;
        size++;
        return true;
    }

    public T deQueue(){
        if(isEmpty()) return null;
        Object temp = a[first];
        first = (first+1)%a.length;
        size--;
        return (T)temp;
    }

    private boolean isEmpty() {
        return size==0;
    }

    private boolean isfull() {
        return size==a.length;
    }

    public int size(){
        return size;
    }

    public String toString(){
        if(size==0) return "The Queue is empty";
        String s="--------------------------\n";
        for(int i=0; i<size; i++){
            int k = (first+i)%a.length;
            s+="|"+a[k]+"|";
            if(k == last)
                s+=" <-- LAST";
            if(k == first)
                s+=" <-- FIRST";
            s+="\n";
        }
        return s+"--------------------------\n";
    }

}