package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.C14793ay;

@C6505uv
public final class ace extends apn {
    public ace(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            C14793ay.m42898d().mo39089a((Throwable) e, "AdMobHandler.handleMessage");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39131a(Message message) {
        try {
            super.mo39131a(message);
        } catch (Throwable th) {
            acl.m45530a(C14793ay.m42898d().f39923c, th);
            throw th;
        }
    }
}
