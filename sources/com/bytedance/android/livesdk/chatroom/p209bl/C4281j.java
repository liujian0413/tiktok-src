package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import com.bytedance.android.live.network.response.C3477b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.j */
final /* synthetic */ class C4281j implements C7326g {

    /* renamed from: a */
    private final Handler f12461a;

    /* renamed from: b */
    private final int f12462b;

    C4281j(Handler handler, int i) {
        this.f12461a = handler;
        this.f12462b = i;
    }

    public final void accept(Object obj) {
        C4275g.m14455b(this.f12461a, this.f12462b, (C3477b) obj);
    }
}
