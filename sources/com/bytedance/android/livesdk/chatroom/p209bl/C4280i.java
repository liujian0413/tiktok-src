package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.i */
final /* synthetic */ class C4280i implements C7326g {

    /* renamed from: a */
    private final Handler f12458a;

    /* renamed from: b */
    private final int f12459b;

    /* renamed from: c */
    private final int f12460c;

    C4280i(Handler handler, int i, int i2) {
        this.f12458a = handler;
        this.f12459b = i;
        this.f12460c = i2;
    }

    public final void accept(Object obj) {
        C4275g.m14439a(this.f12458a, this.f12459b, this.f12460c, (Throwable) obj);
    }
}
