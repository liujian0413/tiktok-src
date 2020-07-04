package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import com.bytedance.android.live.network.response.C3477b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.l */
final /* synthetic */ class C4283l implements C7326g {

    /* renamed from: a */
    private final Handler f12465a;

    /* renamed from: b */
    private final int f12466b;

    C4283l(Handler handler, int i) {
        this.f12465a = handler;
        this.f12466b = i;
    }

    public final void accept(Object obj) {
        C4275g.m14440a(this.f12465a, this.f12466b, (C3477b) obj);
    }
}
