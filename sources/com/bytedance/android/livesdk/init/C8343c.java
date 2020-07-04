package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.base.p118b.C2328c;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.host.IHostUser;

/* renamed from: com.bytedance.android.livesdk.init.c */
final /* synthetic */ class C8343c implements C2328c {

    /* renamed from: a */
    static final C2328c f22888a = new C8343c();

    private C8343c() {
    }

    /* renamed from: a */
    public final long mo8147a() {
        return ((IHostUser) C9469i.m27984a(IHostUser.class)).getCurUserId();
    }
}
