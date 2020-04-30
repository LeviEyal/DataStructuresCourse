package תירגול_2;

public class q1 {
    public static void main(String[] args) {
        
    }

    //O(2n+k)=O(n+k)
    private static int q1(int[] a, int n) {
        int max=a[0];
        for (int i = 0; i < a.length; i++)       //O(n)
            if(a[i]>max) max=a[i];

        int t[] = new int[max+1];
        for (int i = 0; i < a.length; i++)       //O(n)
            t[a[i]]++;

        for (int i = 0; i < t.length; i++) {     //O(k) k=max
            if(t[i]>0) n--;
            if(n==0) return i;
        }
        return -1111;

    }
}