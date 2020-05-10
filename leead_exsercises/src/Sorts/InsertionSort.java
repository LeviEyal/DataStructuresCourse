package Sorts;

import java.util.Arrays;

/*
-------------------------------
    Eyal Levi
-------------------------------
*/
public class InsertionSort {

    public static void main(String[] args) {
        int a[] = {1,4,5,23,-4,5,2,11,-2};
        System.out.println(Arrays.toString(a));
        sort(a);
        System.out.println(Arrays.toString(a));
    }

    //O(n^2)
    private static void sort(int[] a) {
        for(int i=1; i<a.length; i++){
            int j=i-1;
            int key=a[i];
            while(j>=0 && a[j]>key)
                a[j+1]=a[j--];
            a[j+1]=key;
        }
    }
}