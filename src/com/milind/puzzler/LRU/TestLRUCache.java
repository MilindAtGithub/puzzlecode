package com.milind.puzzler.LRU;

/**
 * Created by deobhank on 3/12/2015.
 */
public class TestLRUCache {

    public static  void  main (String args[]){

        LRUCache cache = new LRUCache(3);
        cache.add(1,501);
        cache.add(1,502);
        System.out.println("Get: " + cache.get(1));
        cache.add(1,503);
        System.out.println("Get: " + cache.get(1));
        cache.add(1,504);
        System.out.println("Get: " + cache.get(1));
        cache.add(2,601);
        cache.add(2,602);
        cache.add(2,603);
        cache.add(2,604);
        cache.add(3,701);
        cache.add(3,702);
        cache.add(3,703);
        cache.add(3,704);
        cache.add(4,801);
        cache.add(4,802);
        cache.add(4,803);
        cache.add(4,804);
        System.out.println("Get Again: "+ cache.get(1));
    }
}
