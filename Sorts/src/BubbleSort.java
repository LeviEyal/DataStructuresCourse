package Sorts.src;

import java.util.Arrays;

/*
-------------------------------
    Eyal Levi
-------------------------------
*/
public class BubbleSort {

    public static void main(String[] args) {
        int a[] = {1,4,5,23,-4,5,2,11,-2};
        System.out.println(Arrays.toString(a));
        bubble_sort(a);
        System.out.println(Arrays.toString(a));
    }

    //O(n^2)
    public static void bubble_sort(int[] a) { 
        for(int i=0; i<a.length-1; i++)
            for(int j=0; j<a.length-1-i; j++) 
                if(a[j]>a[j+1]){ //Swap: O(3)=O(1)
                    int temp=a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
    }
}