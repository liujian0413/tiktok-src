package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.gift.C3433c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.m */
final /* synthetic */ class C8132m implements C7326g {

    /* renamed from: a */
    private final C3433c f22197a;

    /* renamed from: b */
    private final long f22198b;

    /* renamed from: c */
    private final long f22199c;

    C8132m(C3433c cVar, long j, long j2) {
        this.f22197a = cVar;
        this.f22198b = j;
        this.f22199c = j2;
    }

    public final void accept(Object obj) {
        GiftManager.lambda$sendGiftInternal$8$GiftManager(this.f22197a, this.f22198b, this.f22199c, (Throwable) obj);
    }
}
