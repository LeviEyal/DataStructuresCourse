package Sorts.src;

import java.util.Arrays;

/*
-------------------------------
    Eyal Levi
-------------------------------
*/
public class MergeSort {

    public static void main(String[] args) {
        int a[] = {1,4,5,23,-4,5,2,11,-2};
        System.out.println(Arrays.toString(a));
        merge_sort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void merge_sort(int[] a) {
        merge_sort(a,0,a.length-1);
    }
    private static void merge_sort(int[] a, int l, int h) {
        if(l>=h) return;
        int m = (l+h)/2;
        merge_sort(a, l, m);
        merge_sort(a, m+1, h);
        merge(a,l,m,h);
    }
    private static void merge(int[] a, int l, int m, int h) {
        int t[] = new int[h-l+1];
        int i=l, j=m+1;
        int k=0;
        while(i<=m && j<=h){
            if(a[i]<a[j])   t[k++]=a[i++];
            else            t[k++]=a[j++];
        }
        while(i<=m)     t[k++]=a[i++];
        while(j<=h)     t[k++]=a[j++];

        //copy from t to a
        for(i=0; i<t.length; i++)   
            a[l+i]=t[i];
    }

    
}