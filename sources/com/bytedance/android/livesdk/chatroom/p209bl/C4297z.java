package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.z */
final /* synthetic */ class C4297z implements C7326g {

    /* renamed from: a */
    private final C4275g f12485a;

    /* renamed from: b */
    private final Handler f12486b;

    /* renamed from: c */
    private final long f12487c;

    C4297z(C4275g gVar, Handler handler, long j) {
        this.f12485a = gVar;
        this.f12486b = handler;
        this.f12487c = j;
    }

    public final void accept(Object obj) {
        this.f12485a.mo11965a(this.f12486b, this.f12487c, (Throwable) obj);
    }
}
