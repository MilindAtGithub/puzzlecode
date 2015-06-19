package com.milind.thread.odd_even_number_print;

/**
 * Created by deobhank on 6/19/2015.
 */
public class MyThread implements Runnable {

    private boolean printEven;
    private Counter counter;

    public MyThread(boolean printEven, Counter counter) {
        this.printEven = printEven;
        this.counter = counter;
    }

    @Override
    public void run() {

        while (counter.getCounter()<100){
            if(printEven){
                synchronized (counter){
                    if(counter.getCounter()%2 ==0){
                        System.out.println(Thread.currentThread().getName()+" counter Val: "+counter.getCounter());
                        counter.setCounter(counter.getCounter()+1);
                        counter.notifyAll();
                    }else {
                        try {
                            counter.wait();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }else{
                synchronized (counter){
                    if(counter.getCounter()%2 !=0){
                        System.out.println(Thread.currentThread().getName()+" counter Val: "+counter.getCounter());
                        counter.setCounter(counter.getCounter()+1);
                        counter.notifyAll();
                    }else {
                        try {
                            counter.wait();

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }

        }

    }
}
