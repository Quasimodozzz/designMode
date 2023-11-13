package com.example.demo.utils;

import com.example.demo.pojos.User;

public class ThreadLocalUtil {
    ThreadLocal<User> threadLocal = new ThreadLocal<>();

    public void setThreadLocal(ThreadLocal<User> threadLocal) {
        this.threadLocal = threadLocal;
    }
}
