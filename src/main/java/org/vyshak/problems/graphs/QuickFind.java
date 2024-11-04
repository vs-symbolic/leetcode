package org.vyshak.problems.graphs;

public class QuickFind {

    private int[] rootArray;

    public QuickFind(int size) {
        rootArray = new int[size];
        for (int i = 0; i < size; i++) {
            rootArray[i] = i;
        }
    }

    private int find(int x) {
        return rootArray[x];
    }

    private void union(int x, int y) {
        int rootOfX = find(x);
        int rootOfY = find(y);

        if (rootOfX != rootOfY) {
            for (int i = 0; i < rootArray.length; i++) {
                if (rootArray[i] == rootOfY) rootArray[i] = rootOfX;
            }
        }
    }

    private boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        QuickFind qf = new QuickFind(10);
        // 1-2-5-6-7 3-8-9 4
        qf.union(1, 2);
        qf.union(2, 5);
        qf.union(5, 6);
        qf.union(6, 7);
        qf.union(3, 8);
        qf.union(8, 9);
        System.out.println(qf.connected(1, 5)); // true
        System.out.println(qf.connected(5, 7)); // true
        System.out.println(qf.connected(4, 9)); // false
        // 1-2-5-6-7 3-8-9-4
        qf.union(9, 4);
        System.out.println(qf.connected(4, 9)); // true
    }
}
