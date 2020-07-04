package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;

final class bst implements Callback, FrameCallback {

    /* renamed from: b */
    private static final bst f43470b = new bst();

    /* renamed from: a */
    public volatile long f43471a;

    /* renamed from: c */
    private final Handler f43472c;

    /* renamed from: d */
    private final HandlerThread f43473d = new HandlerThread("ChoreographerOwner:Handler");

    /* renamed from: e */
    private Choreographer f43474e;

    /* renamed from: f */
    private int f43475f;

    /* renamed from: a */
    public static bst m49994a() {
        return f43470b;
    }

    private bst() {
        this.f43473d.start();
        this.f43472c = new Handler(this.f43473d.getLooper(), this);
        this.f43472c.sendEmptyMessage(0);
    }

    /* renamed from: b */
    public final void mo41257b() {
        this.f43472c.sendEmptyMessage(1);
    }

    /* renamed from: c */
    public final void mo41258c() {
        this.f43472c.sendEmptyMessage(2);
    }

    public final void doFrame(long j) {
        this.f43471a = j;
        this.f43474e.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                this.f43474e = Choreographer.getInstance();
                return true;
            case 1:
                this.f43475f++;
                if (this.f43475f == 1) {
                    this.f43474e.postFrameCallback(this);
                }
                return true;
            case 2:
                this.f43475f--;
                if (this.f43475f == 0) {
                    this.f43474e.removeFrameCallback(this);
                    this.f43471a = 0;
                }
                return true;
            default:
                return false;
        }
    }
}
