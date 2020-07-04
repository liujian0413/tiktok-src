package com.bytedance.android.livesdk.gift;

import java.lang.ref.WeakReference;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.f */
final /* synthetic */ class C8076f implements C7326g {

    /* renamed from: a */
    private final boolean f22022a;

    /* renamed from: b */
    private final WeakReference f22023b;

    C8076f(boolean z, WeakReference weakReference) {
        this.f22022a = z;
        this.f22023b = weakReference;
    }

    public final void accept(Object obj) {
        GiftManager.lambda$syncGiftList$1$GiftManager(this.f22022a, this.f22023b, (Throwable) obj);
    }
}
