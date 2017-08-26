package com.mzgy.thread;

/**
 * Created by mypc on 2017/8/26.
 */
public class Run {
    public static void main(String[] args){
        HasSelfPrivateNum num = new HasSelfPrivateNum();
        ThreadA a = new ThreadA(num);
        a.start();
        ThreadB b = new ThreadB(num);
        b.start();
    }
}
