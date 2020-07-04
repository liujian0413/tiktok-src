package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import com.bytedance.android.live.network.response.C3477b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.h */
final /* synthetic */ class C4279h implements C7326g {

    /* renamed from: a */
    private final Handler f12455a;

    /* renamed from: b */
    private final int f12456b;

    /* renamed from: c */
    private final int f12457c;

    C4279h(Handler handler, int i, int i2) {
        this.f12455a = handler;
        this.f12456b = i;
        this.f12457c = i2;
    }

    public final void accept(Object obj) {
        C4275g.m14438a(this.f12455a, this.f12456b, this.f12457c, (C3477b) obj);
    }
}
