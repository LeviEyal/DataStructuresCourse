package Heaps.src;

import java.util.Arrays;

public class MaxHeap {
    int heap[];
    int SIZE = 0;

    public MaxHeap(int capacity){
        if(capacity<0) throw new RuntimeException("Capacity must be positive");
        heap = new int[capacity+1];
        heap[0] = Integer.MIN_VALUE;
    }

    public MaxHeap(int a[]){
        heap = new int[a.length+1];
        for (int i = 0; i < a.length; i++)
            heap[i+1] = a[i];
        SIZE = a.length;
        heap[0] = Integer.MIN_VALUE;
        buildHeap();
    }

    private void buildHeap() {
        for (int i = SIZE/2 ; i>=1 ; i--)
            heapify(i);
    }

    public boolean add(int key){
        if(SIZE == heap.length-1) return false;
        heap[++SIZE] = key;
        swapUp(SIZE - 1);
        return true;
    }

    private void swapUp(int i) {
        if(i == 1) return;
        int parent = parent(i);
        if(heap[parent] < heap[i]){
            swap(heap, i, parent);
            swapUp(parent);
        }
    }

    public void heapify(int i) {
        int left = left(i);
        int right = right(i);
        int largest = i;
        if(left>0 && heap[left] > heap[largest])
            largest = left;
        if(right>0 && heap[right] > heap[largest])
            largest = right;
        if(largest == i) return;
        swap(heap, largest, i);
        heapify(largest);
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private int left(int i) {
        return (i*2 > SIZE? -1 : i*2);
    }
    private int right(int i) {
        return ((i*2+1) > SIZE? -1 : i*2+1);
    }
    private int parent(int i) {
        if(i<1) return -1;
        return i/2;
    }

    public boolean removeMax(){
        if(SIZE == 0) return false;
        swap(heap, 1, SIZE);
        SIZE--;
        heapify(1);
        return true;
    }

    public int getMax(){
        return heap[1];
    }

    public void printHeap(){
        System.out.println(Arrays.toString(heap));
    }

}