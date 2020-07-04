package com.bytedance.android.live.wallet.billing;

import com.bytedance.android.live.wallet.model.CheckOrderOriginalResult;

/* renamed from: com.bytedance.android.live.wallet.billing.b */
final /* synthetic */ class C3689b implements Runnable {

    /* renamed from: a */
    private final C3675a f10993a;

    /* renamed from: b */
    private final CheckOrderOriginalResult f10994b;

    C3689b(C3675a aVar, CheckOrderOriginalResult checkOrderOriginalResult) {
        this.f10993a = aVar;
        this.f10994b = checkOrderOriginalResult;
    }

    public final void run() {
        this.f10993a.mo11133a(this.f10994b);
    }
}
