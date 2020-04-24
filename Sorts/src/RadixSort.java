package Sorts.src;
/*
-------------------------------
    Eyal Levi
-------------------------------
*/
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int a[] = {2,33,454,332,5545,432,5,656,678,229,7000,656,3,45456,23,45,2,0};
        System.out.println("Before radix-sort:\n" + Arrays.toString(a));
        radixSort(a);
        System.out.println("\nAfter radix-sort:\n" + Arrays.toString(a));
    }

    private static void radixSort(int[] a) {
        int d = maxLengthInArray(a);    //d - length of the max element

        for(int i=0; i<d; i++){
            int b[] = new int[a.length];
            int p=0;
            for(int k=0; k<10; k++){
                for(int j=0; j<a.length; j++){
                    int x = digitAt(a[j], i);
                    if(x == k)
                        b[p++] = a[j];
                }
            }
            //copy from b to a
            for(int j=0; j<a.length; j++)   a[j] = b[j]; 
        }
    }
    private static int maxLengthInArray(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++)
            if(a[i]>max) max = a[i];
        return (int)(Math.log10(max))+1;
    }
    private static int digitAt(int n, int d) {
        int t = (int) Math.pow(10, d);
        return (n/t)%10;
    }

}