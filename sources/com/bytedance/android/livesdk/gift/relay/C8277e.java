package com.bytedance.android.livesdk.gift.relay;

import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.gift.relay.e */
final /* synthetic */ class C8277e implements C7326g {

    /* renamed from: a */
    private final GiftRelayDialogFragment f22727a;

    /* renamed from: b */
    private final long f22728b;

    C8277e(GiftRelayDialogFragment giftRelayDialogFragment, long j) {
        this.f22727a = giftRelayDialogFragment;
        this.f22728b = j;
    }

    public final void accept(Object obj) {
        this.f22727a.mo21412a(this.f22728b, (Throwable) obj);
    }
}
