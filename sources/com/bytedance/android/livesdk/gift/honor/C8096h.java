package com.bytedance.android.livesdk.gift.honor;

import com.bytedance.android.livesdk.gift.panel.p391a.C8169b;

/* renamed from: com.bytedance.android.livesdk.gift.honor.h */
final /* synthetic */ class C8096h implements Runnable {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f22108a;

    /* renamed from: b */
    private final C8169b f22109b;

    C8096h(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, C8169b bVar) {
        this.f22108a = liveGiftHonorLevelWidget;
        this.f22109b = bVar;
    }

    public final void run() {
        this.f22108a.mo21189b(this.f22109b);
    }
}
