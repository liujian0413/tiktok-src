package com.ttnet.org.chromium.base.task;

final /* synthetic */ class AsyncTask$$Lambda$0 implements Runnable {
    private final AsyncTask arg$1;
    private final Object arg$2;

    AsyncTask$$Lambda$0(AsyncTask asyncTask, Object obj) {
        this.arg$1 = asyncTask;
        this.arg$2 = obj;
    }

    public final void run() {
        this.arg$1.lambda$postResult$1$AsyncTask(this.arg$2);
    }
}
