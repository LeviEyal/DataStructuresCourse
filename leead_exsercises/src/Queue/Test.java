package Queue;

public class Test {
    public static void main(String[] args) {
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