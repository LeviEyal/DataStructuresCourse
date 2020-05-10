package Sorts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/*
-------------------------------
    Eyal Levi
-------------------------------
*/
public class BucketSort {
    public static void main(String[] args) {
        double a[] = {19,4.8,5,23,0.3,14,5,2.5,11,2,1.5,0.45};
        System.out.println(Arrays.toString(a));
        bucketSort(a,10);
        System.out.println(Arrays.toString(a));
    }

    private static void bucketSort(double[] a, int buckets) {
        double interval = Interval(a);                      //O(n)
        ArrayList<Double> b[] = new ArrayList[buckets+1];   //O(1)
        for (int i = 0; i <= buckets; i++)                  //O(k)
            b[i] = new ArrayList<Double>();

        for (int i = 0; i < a.length; i++) {                //O(n)
            int t = (int)(a[i]*buckets/interval);           //O(1)
            b[t].add(a[i]);                                 //O(1)
        }
        for (int i = 0; i < b.length; i++)
            Collections.sort(b[i]);

        int k=0;
        for (int i = 0; i < b.length; i++)
            for (int j = 0; j < b[i].size() ; j++)
                a[k++] = b[i].get(j);

    }

    private static double Interval(double[] a) {
        double max = a[0], min = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]<min) min = a[i];
            if(a[i]>max) max = a[i];
        }
        return max-min;
    }
}