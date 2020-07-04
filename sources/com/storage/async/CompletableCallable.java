package com.storage.async;

import java.util.concurrent.Callable;

public class CompletableCallable<V> implements Callable<V> {
    private Function<V> innerFunction;

    public V call() throws Exception {
        return this.innerFunction.fun();
    }

    public CompletableCallable(Function function) {
        this.innerFunction = function;
    }

    public CompletableCallable(final Action action) {
        this.innerFunction = new Function<V>() {
            public V fun() {
                action.act();
                return null;
            }
        };
    }
}
