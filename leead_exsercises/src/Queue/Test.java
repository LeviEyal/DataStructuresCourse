package Queue;
/******************************************************************************
*  @author Eyal Levi
*  https://github.com/LeviEyal
*  Data Structures 2020 - CS Ariel university
*  Queue tests
******************************************************************************/
public class Test {
    public static void main(String[] args) {
        // System.out.println(q);
        // q.enQueue(1);
        // System.out.println(q);
        // q.enQueue(2);
        // q.enQueue(3);
        // q.enQueue("eyal");
        // q.enQueue(4);
        // q.enQueue('t');
        // System.out.println(q);
        // System.out.println("deQueue: "+q.deQueue());
        // System.out.println(q);
        // System.out.println("deQueue: "+q.deQueue());
        // System.out.println(q);
        // System.out.println("deQueue: "+q.deQueue());
        // System.out.println(q);
        // System.out.println("deQueue: "+q.deQueue());
        // System.out.println(q);
        // System.out.println("deQueue: "+q.deQueue());
        // System.out.println(q);
        // System.out.println("deQueue: "+q.deQueue());
        // System.out.println(q);
        Queue_array<Object> q = new Queue_array<>(6);
        q.enQueue(2);
        q.enQueue(6);
        q.enQueue(12);
        q.enQueue(-4);
        q.enQueue(9);

        q.deQueue();
        q.enQueue(52);
        System.out.println(q);

    }
}