package com.bytedance.android.livesdk.chatroom.interact;

import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.x */
final /* synthetic */ class C4844x implements C7326g {

    /* renamed from: a */
    private final C44621 f13827a;

    /* renamed from: b */
    private final int f13828b;

    /* renamed from: c */
    private final long f13829c;

    /* renamed from: d */
    private final Exception f13830d;

    C4844x(C44621 r1, int i, long j, Exception exc) {
        this.f13827a = r1;
        this.f13828b = i;
        this.f13829c = j;
        this.f13830d = exc;
    }

    public final void accept(Object obj) {
        this.f13827a.mo12218a(this.f13828b, this.f13829c, this.f13830d, (Integer) obj);
    }
}
