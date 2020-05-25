package Assignments.src;

import java.util.Arrays;

/******************************************************************************
 * @author Eyal Levi 
 * https://github.com/happyEyal 
 * Data Structures 2020 - CS
 * Ariel university Assignment 2 - question 3
 ******************************************************************************/

public class Range {
    private int[] arr;

    //O(n+k)
    public Range(int a[], int k){
        arr = new int[k+2];
        for(int i=0; i<a.length; i++){
            if(a[i]<=k)
                arr[a[i]+1]++;
        }
        for(int i=1; i<=k+1; i++)
            arr[i] += arr[i-1];
    }

    //O(1)
    public int query(int a, int b){
        return arr[b+1] - arr[a];
    }

    public static void main(String[] args) {
        // int a[] = {2,6,33,55,6,2,33,44,412,12,46,75,41,1,0,12,4,685,231,2,3,566,78,65,43,22,64,75,53};
        int a[] = {1,4,3,7,5,6,0,0,3,0,9,6,4};
        // int a[] = {1,2,1,2,1};
        // int a[] = {1,1,3,1,0,0,0,0,0,0,1};
        Range r = new Range(a, 6);
        System.out.println(r.query(4, 6));
        System.out.println(r.query(3, 3));
        System.out.println(r.query(1, 4));
        // System.out.println(r.query(3, 9));
    }
}