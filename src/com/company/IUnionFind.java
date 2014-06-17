package com.company;


public interface IUnionFind
{
    boolean connected(int p, int q);
    int count();
    void union(int p, int q);
}
