package com.facebook.react.util;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Pair;
import java.util.LinkedList;
import java.util.List;

public class RNThread extends HandlerThread {
    public static ThreadLocal<Handler> handlerCache = new ThreadLocal<>();
    private Callback mCallback;
    private Handler mHandler;
    private List<Pair<Message, Long>> waitingJobs = new LinkedList();

    static class SafeCallback implements Callback {
        final Callback mCallback;

        SafeCallback(Callback callback) {
            this.mCallback = callback;
        }

        public boolean handleMessage(Message message) {
            try {
                if (this.mCallback != null) {
                    return this.mCallback.handleMessage(message);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    static class SafeRunnable implements Runnable {
        final long mDelayTime;
        final Runnable mTask;

        public void run() {
            try {
                if (this.mTask != null) {
                    this.mTask.run();
                }
            } catch (Throwable th) {
                Handler handler = (Handler) RNThread.handlerCache.get();
                if (handler != null) {
                    if (!(th instanceof RuntimeException) || (!th.toString().contains("java.lang.RuntimeException: Unable to load script") && !th.toString().contains("java.lang.RuntimeException: Could not open file"))) {
                        Message obtainMessage = handler.obtainMessage(10001);
                        obtainMessage.obj = th;
                        handler.sendMessage(obtainMessage);
                    } else {
                        Message obtainMessage2 = handler.obtainMessage(10002);
                        obtainMessage2.obj = th;
                        handler.sendMessage(obtainMessage2);
                    }
                }
            }
        }

        SafeRunnable(Runnable runnable) {
            this.mTask = runnable;
        }

        SafeRunnable(Runnable runnable, long j) {
            this.mTask = runnable;
            this.mDelayTime = j;
        }
    }

    public Handler getHandler() {
        return this.mHandler;
    }

    public boolean quit() {
        if (this.mHandler != null) {
            this.mHandler.removeCallbacksAndMessages(null);
        }
        return super.quit();
    }

    public void run() {
        super.run();
        handlerCache.remove();
    }

    public boolean isRNThreadAlive() {
        if (this.mHandler == null || getLooper() == null || !isAlive()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        this.mHandler = new Handler(getLooper(), this.mCallback);
        handlerCache.set(this.mHandler);
        for (int i = 0; i < this.waitingJobs.size(); i++) {
            Pair pair = (Pair) this.waitingJobs.get(i);
            this.mHandler.sendMessageDelayed((Message) pair.first, ((Long) pair.second).longValue());
        }
    }

    public RNThread(String str) {
        super(str);
        start();
    }

    public static Callback secure(Callback callback) {
        if (callback == null || (callback instanceof SafeCallback)) {
            return callback;
        }
        return new SafeCallback(callback);
    }

    public static Runnable secure(Runnable runnable) {
        if (runnable == null || (runnable instanceof SafeRunnable)) {
            return runnable;
        }
        return new SafeRunnable(runnable);
    }

    public void post(Runnable runnable) {
        Message obtain = Message.obtain(this.mHandler, secure(runnable));
        if (this.mHandler != null) {
            this.mHandler.sendMessage(obtain);
        } else {
            this.waitingJobs.add(Pair.create(obtain, Long.valueOf(0)));
        }
    }

    public void removeMessage(int i, Object obj) {
        if (this.mHandler != null) {
            this.mHandler.removeMessages(i, obj);
        }
    }

    public RNThread(String str, int i) {
        super(str, i);
        start();
    }

    public static Runnable secure(Runnable runnable, long j) {
        if (runnable == null || (runnable instanceof SafeRunnable)) {
            return runnable;
        }
        return new SafeRunnable(runnable, j);
    }

    public void postDelayed(Runnable runnable, long j) {
        Message obtain = Message.obtain(this.mHandler, secure(runnable));
        if (this.mHandler == null) {
            this.waitingJobs.add(Pair.create(obtain, Long.valueOf(j)));
        } else {
            this.mHandler.sendMessageDelayed(obtain, j);
        }
    }

    public void sendMessageDelayed(Message message, long j) {
        if (message == null || !isRNThreadAlive()) {
            return;
        }
        if (this.mHandler == null) {
            this.waitingJobs.add(Pair.create(message, Long.valueOf(j)));
        } else {
            this.mHandler.sendMessageDelayed(message, j);
        }
    }

    public RNThread(String str, Callback callback) {
        super(str);
        this.mCallback = secure(callback);
        start();
    }

    public void post(Runnable runnable, Object obj) {
        Message obtain = Message.obtain(this.mHandler, secure(runnable));
        obtain.obj = obj;
        if (this.mHandler != null) {
            obtain.sendToTarget();
        } else {
            this.waitingJobs.add(Pair.create(obtain, Long.valueOf(0)));
        }
    }

    public RNThread(String str, int i, Callback callback) {
        super(str, i);
        this.mCallback = secure(callback);
        start();
    }
}
