package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.C3433c;
import com.bytedance.android.live.network.response.C3479d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.l */
final /* synthetic */ class C8131l implements C7326g {

    /* renamed from: a */
    private final C3433c f22192a;

    /* renamed from: b */
    private final long f22193b;

    /* renamed from: c */
    private final User f22194c;

    /* renamed from: d */
    private final long f22195d;

    /* renamed from: e */
    private final long f22196e;

    C8131l(C3433c cVar, long j, User user, long j2, long j3) {
        this.f22192a = cVar;
        this.f22193b = j;
        this.f22194c = user;
        this.f22195d = j2;
        this.f22196e = j3;
    }

    public final void accept(Object obj) {
        GiftManager.lambda$sendGiftInternal$7$GiftManager(this.f22192a, this.f22193b, this.f22194c, this.f22195d, this.f22196e, (C3479d) obj);
    }
}
