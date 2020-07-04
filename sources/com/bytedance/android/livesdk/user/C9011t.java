package com.bytedance.android.livesdk.user;

import com.bytedance.android.livesdkapi.depend.model.follow.FollowPair;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.user.t */
final /* synthetic */ class C9011t implements C7326g {

    /* renamed from: a */
    private final C8998l f24649a;

    /* renamed from: b */
    private final int f24650b;

    /* renamed from: c */
    private final long f24651c;

    /* renamed from: d */
    private final long f24652d;

    C9011t(C8998l lVar, int i, long j, long j2) {
        this.f24649a = lVar;
        this.f24650b = i;
        this.f24651c = j;
        this.f24652d = j2;
    }

    public final void accept(Object obj) {
        this.f24649a.mo22206a(this.f24650b, this.f24651c, this.f24652d, (FollowPair) obj);
    }
}
