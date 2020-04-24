package BinarySearch.src;
/*
-------------------------------
    Eyal Levi
-------------------------------
*/
public class binary_search {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,6,7,8,9};
        System.out.println(bs_recursive(a,8));
        System.out.println(bs(a,8));
        System.out.println(bs_between(a,4));
    }

    private static int bs_recursive(int[] a, int val) {
        if(val<a[0] || val>a[a.length-1]) return -1;
        return bs_recursive(a, 0, a.length-1, val);
    }
    private static int bs_recursive(int[] a, int l, int h, int val) {
        int m = (l+h)/2;                    //O(1)
        if(h<l) return -1;
        if(a[m]==val) return m;             //O(1)
        if(a[m]>val)  return bs_recursive(a, l, m-1, val);
        else          return bs_recursive(a, m+1, h, val);
    }

    public static int bs(int[] a, int val){
        int l = 0;
        int h = a.length-1;
        while(l<=h){
            int m = (l+h)/2;
            if(val==a[m]) return m;
            if(val<a[m])    h=m-1;
            if(val>a[m])    l=m+1;
        }
        return -1;
    }

    public static int bs_between(int[] a, int val){
        if(val<a[0]) return 0;
        if(val>a[a.length-1]) return a.length+1;
        int start=0, end=a.length-1;
        while(end-start!=1){
            int mid = (start+end)/2;
            if(start==end) return start;
            else if(a[mid]>val) end=mid-1;
            else start=mid+1;
        }
        return end;
    }
}