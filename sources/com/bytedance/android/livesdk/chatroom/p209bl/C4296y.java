package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import com.bytedance.android.live.network.response.C3477b;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.y */
final /* synthetic */ class C4296y implements C7326g {

    /* renamed from: a */
    private final C4275g f12482a;

    /* renamed from: b */
    private final Handler f12483b;

    /* renamed from: c */
    private final long f12484c;

    C4296y(C4275g gVar, Handler handler, long j) {
        this.f12482a = gVar;
        this.f12483b = handler;
        this.f12484c = j;
    }

    public final void accept(Object obj) {
        this.f12482a.mo11963a(this.f12483b, this.f12484c, (C3477b) obj);
    }
}
