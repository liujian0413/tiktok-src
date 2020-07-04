package com.bytedance.android.livesdk.gift.relay;

import com.bytedance.android.live.network.response.C3479d;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.relay.d */
final /* synthetic */ class C8276d implements C7326g {

    /* renamed from: a */
    private final GiftRelayDialogFragment f22724a;

    /* renamed from: b */
    private final long f22725b;

    /* renamed from: c */
    private final long f22726c;

    C8276d(GiftRelayDialogFragment giftRelayDialogFragment, long j, long j2) {
        this.f22724a = giftRelayDialogFragment;
        this.f22725b = j;
        this.f22726c = j2;
    }

    public final void accept(Object obj) {
        this.f22724a.mo21411a(this.f22725b, this.f22726c, (C3479d) obj);
    }
}
