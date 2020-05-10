package Sorts;

import java.util.Arrays;
/*
-------------------------------
    Eyal Levi
-------------------------------
*/
public class CountingSort {
    public static void main(String[] args) {
        int a[] = {2,33,454,332,545,432,5,656,678,229,70,656,3,456,23,45,2,0};
        System.out.println("Before Counting-sort:\n" + Arrays.toString(a));
        countingSort(a);
        System.out.println("\nAfter Counting-sort:\n" + Arrays.toString(a));
    }

    //O(n)
    private static void countingSort(int[] a) {
        int max=0;
        for(int i = 0 ; i < a.length ; i++)
            if(a[i]>max) max=a[i];
        int t[] = new int[max+1];
        for(int i=0; i<a.length; i++)
            t[a[i]]++;
        for(int i=0,k=0; i<t.length; i++)
            for(int j=0; j<t[i]; j++)
                a[k++] = i; 
    }
}