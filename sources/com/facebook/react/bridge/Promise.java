package com.facebook.react.bridge;

public interface Promise {
    void reject(String str);

    void reject(String str, String str2);

    void reject(String str, String str2, Throwable th);

    void reject(String str, Throwable th);

    void reject(Throwable th);

    void resolve(Object obj);
}
