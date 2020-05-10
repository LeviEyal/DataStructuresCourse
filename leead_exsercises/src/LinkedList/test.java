package LinkedList;

public class test {
    public static void main(String[] args) {
        // SingleLinkedList<Integer> sll = new SingleLinkedList<>();
        // sll.add(3);
        // sll.add(5);
        // sll.add(7);
        // sll.add(2);
        // sll.add(4);
        // // sll.remove(4);
        // // sll.remove(3);
        // // sll.remove(7);
        // // sll.remove(2);
        // // sll.remove(5);
        // sll.print();
        // System.out.println(sll.search(5));
        // System.out.println(sll.at(2));
        // SingleLinkedList<String> sll2 = new SingleLinkedList<>();
        // sll2.add("a");
        // sll2.add("b");
        // sll2.add("c");
        // sll2.add("d");
        // sll2.add("e");
        // sll2.print();

        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.add(3);
        dll.add(4);
        dll.add(5);
        dll.removeFirst();
        dll.removeLast();
        // dll.removeLast();
        dll.remove(4);
        
        dll.print();
    }
}