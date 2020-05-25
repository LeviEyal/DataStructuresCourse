package Sorts;

import java.util.Arrays;

/******************************************************************************
*  @author Eyal Levi
*  https://github.com/LeviEyal
*  Data Structures 2020 - CS Ariel university
*  Selection sort algorithm
******************************************************************************/

public class SelectionSort {

    public static void main(String[] args) {
        int a[] = {1,4,5,23,-4,5,2,11,-2};
        System.out.println(Arrays.toString(a));
        sort2(a);
        System.out.println(Arrays.toString(a));
    }
//_____________________________________________________________________________
    private static void sort(int[] a) {
        for(int i=0; i<a.length; i++){
            int j = findSmallest(a,i);
        //swap
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
    private static int findSmallest(int[] a, int i) {
        int minIndex=i;
        for( ; i<a.length; i++)
            if(a[i]<a[minIndex])
                minIndex=i;
        return minIndex;
    }
//_____________________________________________________________________________
    /* option 2 */
    private static void sort2(int[] a) {
        for(int i=0; i<a.length; i++){
        //find smallest from i to end 
            int minIndex=i;
            for(int j=i ; j<a.length; j++)
                if(a[j]<a[minIndex])
                    minIndex=j;
        //swap
            int t = a[i];
            a[i] = a[minIndex];
            a[minIndex] = t;
        }
    }

}