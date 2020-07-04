package com.bytedance.android.livesdk.gift;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.gift.GiftManager.C7858a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.g */
final /* synthetic */ class C8077g implements C7326g {

    /* renamed from: a */
    private final GiftManager f22024a;

    /* renamed from: b */
    private final C7858a f22025b;

    C8077g(GiftManager giftManager, C7858a aVar) {
        this.f22024a = giftManager;
        this.f22025b = aVar;
    }

    public final void accept(Object obj) {
        this.f22024a.lambda$syncXgCoin$2$GiftManager(this.f22025b, (C3479d) obj);
    }
}
