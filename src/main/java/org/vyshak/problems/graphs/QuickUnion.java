package org.vyshak.problems.graphs;

public class QuickUnion {

    private int[] rootArray;

    public QuickUnion(int size) {
        rootArray = new int[size];
        for (int i = 0; i < size; i++) {
            rootArray[i] = i;
        }
    }

    private int find(int x) {
        while (rootArray[x] != x) {
            x = rootArray[x];
        }
        return x;
    }

    private void union(int x, int y) {
        int rootOfX = find(x);
        int rootOfY = find(y);

        if (rootOfX != rootOfY) {
            rootArray[y] = rootOfX;
        }
    }

    private boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        QuickUnion quickUnion = new QuickUnion(10);
        // 1-2-5-6-7 3-8-9 4
        quickUnion.union(1, 2);
        quickUnion.union(2, 5);
        quickUnion.union(5, 6);
        quickUnion.union(6, 7);
        quickUnion.union(3, 8);
        quickUnion.union(8, 9);
        System.out.println(quickUnion.connected(1, 5)); // true
        System.out.println(quickUnion.connected(5, 7)); // true
        System.out.println(quickUnion.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        quickUnion.union(9, 4);
        System.out.println(quickUnion.connected(4, 9)); // true
    }
}
