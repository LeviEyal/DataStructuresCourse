package Assignments.src;

import java.util.Arrays;

/******************************************************************************
 *  @author Eyal Levi
 *  @since 2020
 *  Data Structures - CS Ariel university
 *  Assignment 1
 ******************************************************************************/
public class Ex1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,9,10,11,12,13,14,15,16};
        // int arr[] = {0,3,3,5,7};
        System.out.println(Search(arr,-2));
        System.out.println(Search(arr,1));
        System.out.println(Search(arr,2));
        System.out.println(Search(arr,3));
        System.out.println(Search(arr,4));
        System.out.println(Search(arr,5));
        System.out.println(Search(arr,6));
        System.out.println(Search(arr,7));
        System.out.println(Search(arr,8));
        System.out.println(Search(arr,9));
        System.out.println(Search(arr,10));
        System.out.println(Search(arr,11));
        System.out.println(Search(arr,12));
        System.out.println(Search(arr,16));
        System.out.println(Search(arr,17));
    }

    // public static int Search1(int[] arr, int k){
    //     if(k > arr[arr.length-1] || k<arr[0]) return -1; 
    //     int i=0, exp=1;
    //     while(arr[i] <= k){
    //         if(arr[i] == k) return i; //if k found - return index
    //         if((i+exp*2)>=arr.length || arr[i+exp*2]> k) exp=1; //if next jump pass k - restart jumps height
    //         else exp*=2;
    //         i+=exp;
    //     }
    //     return -1;
    // }

    public static int Search(int[] arr, int k){
        int s = arr.length;
        if(k>arr[s-1] || k<arr[0]) return -1; 
        int i=1;
        while(i<s && arr[i] <= k) i*=2;
        return binarySearch(arr, i/2, Math.min(i, s-1), k);
    }

    private static int binarySearch(int[] a, int l, int h, int val) {
        int m = (l+h)/2;                    //O(1)
        if(h<l) return -1;
        if(a[m]==val) return m;             //O(1)
        if(a[m]>val)  return binarySearch(a, l, m-1, val);
        else          return binarySearch(a, m+1, h, val);
    }
}