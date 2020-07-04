package com.p280ss.android.common.applog;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: com.ss.android.common.applog.TeaThread */
public class TeaThread extends HandlerThread {
    private static volatile TeaThread sInst;
    private final LinkedList<Runnable> afterLooperPrepared = new LinkedList<>();
    private volatile boolean isLooperPrepared = false;
    private final Object lock = new Object();
    private Handler mHandler;

    public Handler createTeaHandler() {
        return new Handler(getLooper());
    }

    private TeaThread() {
        super("TeaThread");
    }

    public static TeaThread getInst() {
        if (sInst == null) {
            synchronized (TeaThread.class) {
                if (sInst == null) {
                    TeaThread teaThread = new TeaThread();
                    sInst = teaThread;
                    teaThread.start();
                }
            }
        }
        return sInst;
    }

    public Handler getTeaHandler() {
        if (this.mHandler == null) {
            synchronized (this) {
                if (this.mHandler == null) {
                    this.mHandler = new Handler(getLooper());
                }
            }
        }
        return this.mHandler;
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        super.onLooperPrepared();
        synchronized (this.lock) {
            this.isLooperPrepared = true;
            ArrayList<Runnable> arrayList = new ArrayList<>(this.afterLooperPrepared);
            this.afterLooperPrepared.clear();
            if (!arrayList.isEmpty()) {
                for (Runnable post : arrayList) {
                    post(post);
                }
            }
        }
    }

    public void ensureTeaThread(Runnable runnable) {
        ensureTeaThreadLite(runnable);
    }

    public void removeCallbacks(Runnable runnable) {
        getTeaHandler().removeCallbacks(runnable);
    }

    public void post(Runnable runnable) {
        if (runnable != null) {
            getTeaHandler().post(runnable);
        }
    }

    public void repost(Runnable runnable) {
        if (runnable != null) {
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    public void ensureTeaThreadLite(Runnable runnable) {
        if (runnable != null) {
            if (this.isLooperPrepared) {
                post(runnable);
                return;
            }
            synchronized (this.lock) {
                if (this.isLooperPrepared) {
                    post(runnable);
                } else {
                    if (this.afterLooperPrepared.size() > 1000) {
                        this.afterLooperPrepared.poll();
                    }
                    this.afterLooperPrepared.add(runnable);
                }
            }
        }
    }

    public void postDelay(Runnable runnable, long j) {
        if (runnable != null) {
            getTeaHandler().postDelayed(runnable, j);
        }
    }

    public void repost(Runnable runnable, long j) {
        if (runnable != null) {
            removeCallbacks(runnable);
            postDelay(runnable, j);
        }
    }
}
