package com.example.thread.interruption.demo;

/**
 * 
 * @Description: 捕获异常并重新抛出
 */
public class RethrowInterrupterException {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = Thread.currentThread();
        try {
            thread.interrupt();
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("做一些清理工作");
            throw e;
        }
    }

}
