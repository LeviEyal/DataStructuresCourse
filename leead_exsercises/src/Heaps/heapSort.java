package Heaps;
/******************************************************************************
*  @author Eyal Levi
*  https://github.com/LeviEyal
*  Data Structures 2020 - CS Ariel university
*  Heap Sort algorithm
******************************************************************************/
import java.util.Arrays;

public class heapSort {
    public static void main(String[] args) {
        int a[] = {1,4,5,23,-4,5,2,11,-2};
        System.out.println(Arrays.toString(a));
        heap_sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void heap_sort(int[] a) {
        MaxHeap b = new MaxHeap(a);
        for(int i=a.length; i>=2; i--){
            swap(b.heap,i,1);
            b.SIZE--;
            b.heapify(1);
        } 
        for (int i = 0; i < a.length; i++)
            a[i] = b.heap[i+1];
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}