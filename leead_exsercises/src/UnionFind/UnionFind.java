package UnionFind;

import java.util.ArrayList;

public class UnionFind {
    private ArrayList<Integer> parent;
    private ArrayList<Integer> rank;

    public UnionFind(int size){
        parent = new ArrayList<>();
        rank = new ArrayList<>();
        for(int i=0; i<size; i++){
            parent.add(0);
            rank.add(0);
        }
    }

    public void makeSet(int v){
        parent.set(v, v);
    }

    public int find(int v){
        if(parent.get(v) != v)
            parent.set(v, find(parent.get(v)));
        return parent.get(v);
    }

    



    /* main */
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(7);
        uf.makeSet(1);
        uf.makeSet(2);
        uf.makeSet(3);
        uf.makeSet(4);
        uf.makeSet(5);
        uf.makeSet(6);
        System.out.println(uf.parent.toString());
        System.out.println(uf.rank.toString());
    }
}