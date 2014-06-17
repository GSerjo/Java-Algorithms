package com.company;

public class Main {

    public static void main(String[] args)
    {
        int count = StdIn.readInt();
        IUnionFind unionFind = createUnionFind(count);

        while(!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(unionFind.connected(p, q))
            {
                continue;
            }
            unionFind.union(p, q);
            StdOut.println(p + " " + q);
        }

        StdOut.println(unionFind.count() + " " + "components");
    }

    private static IUnionFind createUnionFind(int count)
    {
        //return new QuickFindUF(count);
        return new QuickUnionUF(count);
    }
}
