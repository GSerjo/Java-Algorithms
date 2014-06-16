package com.company;

public class QuickUnionUF
{
    private int[] id;
    private int  count;
    public QuickUnionUF(int count)
    {
        this.count = count;
        id = new int[count];
        for (int i = 0; i < count; i++)
        {
            id[i] = i;
        }
    }

    private int find(int value)
    {
        while (value != id[value])
        {
            value = id[value];
        }
        return value;
    }

    public boolean connected(int p, int q)
    {
        return find(p) == find(q);
    }

    public int count()
    {
        return count;
    }

    public void union(int p, int q)
    {
        int rootP = find(p);
        int rootQ = find(q);
        if(rootP == rootQ)
        {
            return;
        }
        id[rootP] = rootQ;
        count--;
    }
}
