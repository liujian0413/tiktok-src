package com.ttnet.org.chromium.base;

public interface JniStaticTestMocker<T> {
    void setInstanceForTesting(T t);
}
