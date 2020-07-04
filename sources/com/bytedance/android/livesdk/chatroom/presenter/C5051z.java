package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.network.response.C3479d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.presenter.z */
final /* synthetic */ class C5051z implements C7326g {

    /* renamed from: a */
    private final C5048y f14348a;

    /* renamed from: b */
    private final long f14349b;

    /* renamed from: c */
    private final long f14350c;

    /* renamed from: d */
    private final String f14351d;

    C5051z(C5048y yVar, long j, long j2, String str) {
        this.f14348a = yVar;
        this.f14349b = j;
        this.f14350c = j2;
        this.f14351d = str;
    }

    public final void accept(Object obj) {
        this.f14348a.mo13089a(this.f14349b, this.f14350c, this.f14351d, (C3479d) obj);
    }
}
