package com.storage.async;

public abstract class Observable<T> {
    protected Scheduler mObsverSchduler;
    protected Scheduler mSubScheduler;

    public abstract boolean isUnSubscribe();

    public abstract void subscribe(Subscriber<T> subscriber);

    public abstract boolean unSubscribe();

    public void subscribeSimple() {
        subscribe(null);
    }

    public Observable observeOn(Scheduler scheduler) {
        this.mObsverSchduler = scheduler;
        return this;
    }

    public Observable schudleOn(Scheduler scheduler) {
        this.mSubScheduler = scheduler;
        return this;
    }

    public static Observable create(Action action) {
        return CompletableObservable.newInstance(action);
    }

    public static <T> Observable<T> create(Function<T> function) {
        return CompletableObservable.newInstance(function);
    }
}
