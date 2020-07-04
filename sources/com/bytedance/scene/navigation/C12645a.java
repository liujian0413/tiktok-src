package com.bytedance.scene.navigation;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bytedance.scene.navigation.a */
final class C12645a extends Handler {

    /* renamed from: a */
    private boolean f33573a = true;

    /* renamed from: a */
    public final void mo31052a(Runnable runnable) {
        Message obtain = Message.obtain(this, runnable);
        if (this.f33573a) {
            obtain.setAsynchronous(true);
        }
        sendMessage(obtain);
    }

    C12645a(Looper looper) {
        super(looper);
        if (VERSION.SDK_INT < 16) {
            this.f33573a = false;
            return;
        }
        if (this.f33573a && VERSION.SDK_INT < 22) {
            Message obtain = Message.obtain();
            try {
                obtain.setAsynchronous(true);
            } catch (NoSuchMethodError unused) {
                this.f33573a = false;
            }
            obtain.recycle();
        }
    }
}
