package com.snapchat.kit.sdk.core.metrics;

public interface MetricQueue<T> {
    void push(T t);
}
