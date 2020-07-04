package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.m */
final /* synthetic */ class C4284m implements C7326g {

    /* renamed from: a */
    private final Handler f12467a;

    /* renamed from: b */
    private final int f12468b;

    C4284m(Handler handler, int i) {
        this.f12467a = handler;
        this.f12468b = i;
    }

    public final void accept(Object obj) {
        C4275g.m14443a(this.f12467a, this.f12468b, (Throwable) obj);
    }
}
