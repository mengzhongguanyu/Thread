package com.mzgy.thread;

/**
 * Created by mypc on 2017/8/26.
 */
public class ThreadA extends Thread {
    private HasSelfPrivateNum num;
    public ThreadA(HasSelfPrivateNum num){
        this.num = num;
    }
    public void run(){
        num.addI("a");
    }
}
