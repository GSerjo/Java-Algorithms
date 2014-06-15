package com.company;

public class Main {

    public static void main(String[] args) {

        int count = StdIn.readInt();
        QuickFindUF uf = new QuickFindUF(count);

        while(!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(uf.connected(p, q))
            {
                continue;
            }
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }

        StdOut.println(uf.count() + " " + "components");
    }
}
