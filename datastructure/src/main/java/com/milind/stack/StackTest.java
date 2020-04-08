package com.milind.stack;

/**
 * Created by deobhank on 6/20/2015.
 */
public class StackTest {


    public static void main (String args[]){

        Stack st = new Stack();
        st.push("A");
        st.push("B");
        st.push("C");
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }

}
