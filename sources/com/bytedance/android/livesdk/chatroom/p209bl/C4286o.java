package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import com.bytedance.android.live.network.response.C3480e;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.o */
final /* synthetic */ class C4286o implements C7326g {

    /* renamed from: a */
    private final Handler f12470a;

    /* renamed from: b */
    private final int f12471b;

    C4286o(Handler handler, int i) {
        this.f12470a = handler;
        this.f12471b = i;
    }

    public final void accept(Object obj) {
        C4275g.m14442a(this.f12470a, this.f12471b, (C3480e) obj);
    }
}
