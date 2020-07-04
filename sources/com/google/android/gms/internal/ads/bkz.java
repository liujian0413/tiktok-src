package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

final class bkz extends Handler {

    /* renamed from: a */
    private final /* synthetic */ bkx f42432a;

    bkz(bkx bkx, Looper looper) {
        this.f42432a = bkx;
        super(looper);
    }

    public final void handleMessage(Message message) {
        this.f42432a.mo40863a(message);
    }
}
