package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import com.bytedance.android.live.network.response.C3479d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.aa */
final /* synthetic */ class C4268aa implements C7326g {

    /* renamed from: a */
    private final Handler f12431a;

    /* renamed from: b */
    private final int f12432b;

    C4268aa(Handler handler, int i) {
        this.f12431a = handler;
        this.f12432b = i;
    }

    public final void accept(Object obj) {
        C4275g.m14441a(this.f12431a, this.f12432b, (C3479d) obj);
    }
}
