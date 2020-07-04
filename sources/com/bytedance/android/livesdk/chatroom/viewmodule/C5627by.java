package com.bytedance.android.livesdk.chatroom.viewmodule;

import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.by */
final /* synthetic */ class C5627by implements C7326g {

    /* renamed from: a */
    private final C54391 f16695a;

    /* renamed from: b */
    private final int f16696b;

    /* renamed from: c */
    private final long f16697c;

    /* renamed from: d */
    private final Exception f16698d;

    C5627by(C54391 r1, int i, long j, Exception exc) {
        this.f16695a = r1;
        this.f16696b = i;
        this.f16697c = j;
        this.f16698d = exc;
    }

    public final void accept(Object obj) {
        this.f16695a.mo13857a(this.f16696b, this.f16697c, this.f16698d, (Integer) obj);
    }
}
