
/******************************************************************************
*  @author Eyal Levi
*  https://github.com/LeviEyal
*  Data Structures 2020 - CS Ariel university
*  Stack implementation using an array (generic)
******************************************************************************/

package Stack;
public class Stack_LL<T> {

    class Node<T>{
        private T key;
        private Node<T> next;

        public Node(T key){
            this.key = key;
            this.next = null;
        }
    }

    private int size;
    private Node<T> top;

    public Stack_LL(){
        size = 0;
        top = null;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void push(T key){
        Node<T> newNode = new Node<>(key);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop(){
        if(isEmpty()) return null;
        Node<T> temp = top;
        top = top.next;
        size--;
        return temp.key;
    }

    public T peek(){
        if(isEmpty()) return null;
        return top.key;
    }

    public void print(){
        for(Node<T> p=top; p!=null; p=p.next)
            System.out.println("|"+p.key+"|");
    }
}