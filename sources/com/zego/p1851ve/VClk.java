package com.zego.p1851ve;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.lang.ref.WeakReference;

/* renamed from: com.zego.ve.VClk */
public class VClk extends Thread {
    private EventHandler mHandler;
    public long pThis;

    /* renamed from: com.zego.ve.VClk$EventHandler */
    static class EventHandler extends Handler implements FrameCallback {
        private int mErrorCount;
        private WeakReference<VClk> mHost;
        private boolean mRunning = true;

        public void uninit() {
            this.mHost = null;
        }

        public void doFrame(long j) {
            if (this.mRunning) {
                VClk.on_video_tick(((VClk) this.mHost.get()).pThis, j);
                Choreographer.getInstance().postFrameCallback(this);
            }
        }

        public void handleMessage(Message message) {
            if (message.what == 0) {
                this.mRunning = true;
                try {
                    Choreographer.getInstance().postFrameCallback(this);
                } catch (Exception unused) {
                    this.mErrorCount++;
                    VClk vClk = (VClk) this.mHost.get();
                    if (this.mErrorCount == 3) {
                        VClk.on_error(vClk.pThis);
                    } else {
                        vClk.restartClock();
                    }
                }
            } else if (message.what == 1) {
                this.mRunning = false;
                try {
                    Choreographer.getInstance().removeFrameCallback(this);
                } catch (Exception unused2) {
                }
            } else {
                if (message.what == 2) {
                    Looper myLooper = Looper.myLooper();
                    if (myLooper != null) {
                        if (VERSION.SDK_INT >= 18) {
                            myLooper.quitSafely();
                            return;
                        }
                        myLooper.quit();
                    }
                }
            }
        }

        public EventHandler(VClk vClk, Looper looper) {
            super(looper);
            this.mHost = new WeakReference<>(vClk);
        }
    }

    public static native int on_error(long j);

    public static native int on_video_tick(long j, long j2);

    public VClk() {
        super("VClk");
    }

    public int restartClock() {
        if (this.mHandler != null) {
            this.mHandler.sendEmptyMessageDelayed(0, 16);
        }
        return 0;
    }

    public int startClock() {
        if (this.mHandler != null) {
            this.mHandler.sendEmptyMessage(0);
        }
        return 0;
    }

    public int stopClock() {
        if (this.mHandler != null) {
            this.mHandler.sendEmptyMessage(1);
        }
        return 0;
    }

    public void run() {
        Looper.prepare();
        this.mHandler = new EventHandler(this, Looper.myLooper());
        Looper.loop();
        this.mHandler.uninit();
        this.mHandler = null;
    }

    public int start(long j) {
        this.pThis = j;
        start();
        while (this.mHandler == null) {
            Thread.yield();
        }
        return 0;
    }

    public int stop(long j) {
        if (this.mHandler != null) {
            this.mHandler.sendEmptyMessage(2);
        }
        try {
            join();
        } catch (Exception unused) {
        }
        this.pThis = 0;
        System.gc();
        return 0;
    }
}
