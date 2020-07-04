package com.storage.async;

public class DBAsyncObservable<T> extends CompletableObservable<T> {
    public static DBAsyncObservable newInstance(Action action) {
        return new DBAsyncObservable(action);
    }

    public static <M> DBAsyncObservable newInstance(Function<M> function) {
        return new DBAsyncObservable(function);
    }

    public DBAsyncObservable(Action action) {
        super(action);
        schudleOn(Schedulers.shortIO());
        observeOn(Schedulers.m145483ui());
    }

    public DBAsyncObservable(Function<T> function) {
        super(function);
        schudleOn(Schedulers.shortIO());
        observeOn(Schedulers.m145483ui());
    }
}
