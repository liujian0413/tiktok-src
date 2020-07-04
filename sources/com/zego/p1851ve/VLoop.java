package com.zego.p1851ve;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;

/* renamed from: com.zego.ve.VLoop */
public class VLoop implements Callback {
    private final Object lock = new Object();
    private Handler mHandler;
    private boolean mIsRunning;
    private String mNativeTag;
    private HandlerThread mThread;
    private long pthis;

    private static native int on_end(long j);

    private static native int on_msg_delayed(long j, long j2);

    private static native int on_run_loop(long j);

    private static native int on_start(long j);

    public int postMessage() {
        this.mHandler.sendEmptyMessage(1);
        return 0;
    }

    public int startLoop() {
        StringBuilder sb = new StringBuilder("vloop-");
        sb.append(this.mNativeTag);
        this.mThread = new HandlerThread(sb.toString());
        this.mThread.start();
        this.mHandler = new Handler(this.mThread.getLooper(), this);
        on_start(this.pthis);
        this.mIsRunning = true;
        return 0;
    }

    public int stopLoop() {
        synchronized (this.lock) {
            this.mIsRunning = false;
            this.mHandler.removeCallbacksAndMessages(this);
            this.mHandler = null;
        }
        if (VERSION.SDK_INT >= 18) {
            this.mThread.quitSafely();
        } else {
            this.mThread.quit();
        }
        this.mThread = null;
        on_end(this.pthis);
        return 0;
    }

    public boolean handleMessage(Message message) {
        try {
            synchronized (this.lock) {
                if (this.mIsRunning) {
                    if (message.what == 1) {
                        on_run_loop(this.pthis);
                    } else if (message.what == 2) {
                        on_msg_delayed(this.pthis, ((Long) message.obj).longValue());
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public int setThis(long j, String str) {
        this.pthis = j;
        this.mNativeTag = str;
        return 0;
    }

    public int postMessageDelayed(long j, long j2) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.obj = Long.valueOf(j);
        this.mHandler.sendMessageDelayed(obtain, j2);
        return 0;
    }
}
