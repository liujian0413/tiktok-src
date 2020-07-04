package com.storage.async;

public class CompletableObservable<T> extends Observable implements Excutor {
    private Action innerAction;
    private Function<T> innerFunction;
    private CompletableFutureTask<T> task;

    public boolean isUnSubscribe() {
        if (this.task == null) {
            return false;
        }
        return this.task.isUnSubscribe();
    }

    public boolean unSubscribe() {
        if (this.task == null) {
            return false;
        }
        return this.task.cancel();
    }

    CompletableObservable(Action action) {
        this.innerAction = action;
    }

    CompletableObservable(Function<T> function) {
        this.innerFunction = function;
    }

    public static CompletableObservable newInstance(Action action) {
        if (action != null) {
            return new CompletableObservable(action);
        }
        throw new NullPointerException("action is null");
    }

    public static <M> CompletableObservable newInstance(Function<M> function) {
        if (function != null) {
            return new CompletableObservable(function);
        }
        throw new NullPointerException("function is null");
    }

    public synchronized void subscribe(final Subscriber subscriber) {
        if (this.task == null) {
            if (this.innerAction != null) {
                this.task = new CompletableFutureTask<T>(new CompletableCallable(this.innerAction)) {
                    /* access modifiers changed from: protected */
                    public void onError(Throwable th) {
                        if (subscriber != null) {
                            subscriber.onError(th);
                        }
                    }

                    /* access modifiers changed from: protected */
                    public void onResult(T t) {
                        if (CompletableObservable.this.mObsverSchduler != null) {
                            CompletableObservable.this.mObsverSchduler.execute(new Runnable() {
                                public void run() {
                                    if (subscriber != null) {
                                        subscriber.onSuccess();
                                    }
                                }
                            });
                        } else if (subscriber != null) {
                            subscriber.onSuccess();
                        }
                    }
                };
            }
            if (this.innerFunction != null) {
                this.task = new CompletableFutureTask<T>(new CompletableCallable((Function) this.innerFunction)) {
                    /* access modifiers changed from: protected */
                    public void onError(Throwable th) {
                        if (subscriber != null) {
                            subscriber.onError(th);
                        }
                    }

                    /* access modifiers changed from: protected */
                    public void onResult(final T t) {
                        if (CompletableObservable.this.mObsverSchduler != null) {
                            CompletableObservable.this.mObsverSchduler.execute(new Runnable() {
                                public void run() {
                                    if (subscriber != null) {
                                        subscriber.onSuccess(t);
                                    }
                                }
                            });
                        } else if (subscriber != null) {
                            subscriber.onSuccess(t);
                        }
                    }
                };
            }
            if (this.mSubScheduler == null) {
                this.task.run();
            } else {
                this.mSubScheduler.execute(this.task);
            }
        } else {
            throw new IllegalStateException("Observable has subscribed");
        }
    }
}
