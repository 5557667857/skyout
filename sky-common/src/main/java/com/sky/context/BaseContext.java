package com.sky.context;

public class BaseContext {
    //为每个线程提供独立的变量副本，不同线程的变量互不干扰
    public static ThreadLocal<Long> threadLocal = new ThreadLocal<>();
    //给当前线程设置变量副本
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }
    //获取当前线程的变量副本
    public static Long getCurrentId() {
        return threadLocal.get();
    }
    //删除当前线程的变量副本
    public static void removeCurrentId() {
        threadLocal.remove();
    }

}
