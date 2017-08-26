package com.mzgy.thread;

/**
 * Created by mypc on 2017/8/26.
 */
public class ThreadB extends Thread {
    private HasSelfPrivateNum num;
    public ThreadB(HasSelfPrivateNum num){
        this.num = num;
    }
    public void run(){
        num.addI("b");
    }
}
