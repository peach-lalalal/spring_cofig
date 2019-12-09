package cn.peach.controller;

public class Demo implements Runnable {
    @Override
    public void run() {
test();
    }
    synchronized void  test(){
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
