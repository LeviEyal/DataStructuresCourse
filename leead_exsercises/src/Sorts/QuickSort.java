package Sorts;
/*
-------------------------------
    Eyal Levi
-------------------------------
*/
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int a[] = {1,4,5,23,-4,5,2,11,-2};
        System.out.println(Arrays.toString(a));
        quick_sort(a);
        System.out.println(Arrays.toString(a));
    }

    private static void quick_sort(int[] a) {
        quick_sort(a, 0, a.length-1);
    }
    private static void quick_sort(int[] a, int l, int h) {
        if(l>=h) return;
        int p=partition(a,l,h);
        quick_sort(a, l, p-1);
        quick_sort(a, p+1, h);
    }
    public static int partition (int[] a, int l, int h){
        if(l>=h) return l;
        int p=l, i=l+1, j=h;
        while(i<=j){
            if(a[i]<=a[p])      i++;
            else if(a[j]>a[p])  j--;
            else                swap(a,i,j);
        }
        swap(a,p,j);
        return j;
    }
    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i]=a[j];
        a[j]=t;
    }
}