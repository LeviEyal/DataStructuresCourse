/*
-------------------------------
    Eyal Levi
-------------------------------
*/
package Stack_And_Queue.src;

public class Test {
    public static void main(String[] args) {
        // Stack_LL<Integer> myStack = new Stack_LL<>();
        // myStack.push(3);
        // myStack.push(4);
        // myStack.push(5);
        // myStack.pop();
        // myStack.print();
        // System.out.println(myStack.peek());

        // Queue_LL<Object> q = new Queue_LL<>();
        // System.out.println(q);
        // q.enQueue(1);
        // System.out.println(q);
        // q.enQueue(2);
        // q.enQueue(3);
        // q.clear();
        // q.enQueue("eyal");
        // q.enQueue(4);
        // q.enQueue('t');
        // System.out.println(q);
        // System.out.println("size: "+q.size());
        // System.out.println(q.deQueue());
        // System.out.println(q.deQueue());
        // System.out.println(q.deQueue());
        // System.out.println(q.deQueue());
        // System.out.println(q.deQueue());
        // System.out.println(q.deQueue());
        // System.out.println(q);

        Queue_array<Object> q = new Queue_array<>(6);
        System.out.println(q);
        q.enQueue(1);
        System.out.println(q);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue("eyal");
        q.enQueue(4);
        q.enQueue('t');
        System.out.println(q);
        System.out.println("deQueue: "+q.deQueue());
        System.out.println(q);
        System.out.println("deQueue: "+q.deQueue());
        System.out.println(q);
        System.out.println("deQueue: "+q.deQueue());
        System.out.println(q);
        System.out.println("deQueue: "+q.deQueue());
        System.out.println(q);
        System.out.println("deQueue: "+q.deQueue());
        System.out.println(q);
        System.out.println("deQueue: "+q.deQueue());
        System.out.println(q);

    }
}