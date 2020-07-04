package com.bytedance.android.livesdk.chatroom.interact;

import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.n */
final /* synthetic */ class C4819n implements C7326g {

    /* renamed from: a */
    private final C44612 f13731a;

    /* renamed from: b */
    private final int f13732b;

    /* renamed from: c */
    private final long f13733c;

    /* renamed from: d */
    private final Exception f13734d;

    C4819n(C44612 r1, int i, long j, Exception exc) {
        this.f13731a = r1;
        this.f13732b = i;
        this.f13733c = j;
        this.f13734d = exc;
    }

    public final void accept(Object obj) {
        this.f13731a.mo12187a(this.f13732b, this.f13733c, this.f13734d, (Integer) obj);
    }
}
