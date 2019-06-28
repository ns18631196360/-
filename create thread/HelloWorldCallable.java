package com.example.thread.creation.demo.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Description: Callable接口创建线程
 */
public class HelloWorldCallable  {
    public static void main(String[] args) {
        // FutureTask对象
        // Lambda表达式
        FutureTask task = new FutureTask(() -> {
            int count = 0;
            for (int i = 0; i <= 100; i++) {
                count += i;
            }
            return count;
        });
        // 创建线程
        Thread thread = new Thread(task);
        // 启动线程
        thread.start();
        try {
            // 获取线程返回值
            System.out.println("1 + 2 + 3 + ... + 100 = " + task.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}


/*
*或者
*/
public class HelloWorldCallable  {
    public static void mian(String[] args){
        Callable callable = new Callable(){
            public T call(){
                //执行方法
            }
        }
        Futuretask futuretask = new Futuretask(callable);
        
        Thread thread = new Thread(futuretask);
        thread.start();
        try {
            T x = futuretask.get();
        } catch ( InterruptedException e){
            //处理中断异常
        } catch (ExcuetionException e){
            //处理执行异常
        }
    }
