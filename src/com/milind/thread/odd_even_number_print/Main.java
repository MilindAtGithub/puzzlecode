package com.milind.thread.odd_even_number_print;

/**
 * Created by deobhank on 6/19/2015.
 */
public class Main {

    public static void main (String args[]){

        Counter counter = new Counter(0);
        Thread even = new Thread(new MyThread(true,counter));
        Thread odd = new Thread(new MyThread(false,counter));
        even.start();
        odd.start();;
    }
}
