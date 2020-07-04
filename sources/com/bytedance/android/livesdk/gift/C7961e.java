package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.network.response.C3479d;
import java.lang.ref.WeakReference;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.e */
final /* synthetic */ class C7961e implements C7326g {

    /* renamed from: a */
    private final GiftManager f21546a;

    /* renamed from: b */
    private final boolean f21547b;

    /* renamed from: c */
    private final WeakReference f21548c;

    /* renamed from: d */
    private final long f21549d;

    /* renamed from: e */
    private final boolean f21550e;

    C7961e(GiftManager giftManager, boolean z, WeakReference weakReference, long j, boolean z2) {
        this.f21546a = giftManager;
        this.f21547b = z;
        this.f21548c = weakReference;
        this.f21549d = j;
        this.f21550e = z2;
    }

    public final void accept(Object obj) {
        this.f21546a.lambda$syncGiftList$0$GiftManager(this.f21547b, this.f21548c, this.f21549d, this.f21550e, (C3479d) obj);
    }
}
