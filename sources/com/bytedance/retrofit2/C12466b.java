package com.bytedance.retrofit2;

import com.bytedance.retrofit2.p637a.C12462c;

/* renamed from: com.bytedance.retrofit2.b */
public interface C12466b<T> extends Cloneable {
    void cancel();

    C12466b<T> clone();

    void enqueue(C12474e<T> eVar);

    C12534t<T> execute() throws Exception;

    boolean isCanceled();

    C12462c request();
}
