package com.bytedance.android.livesdk.gift.honor;

import com.bytedance.android.livesdk.gift.model.C8158m;

/* renamed from: com.bytedance.android.livesdk.gift.honor.g */
final /* synthetic */ class C8095g implements Runnable {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f22106a;

    /* renamed from: b */
    private final C8158m f22107b;

    C8095g(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, C8158m mVar) {
        this.f22106a = liveGiftHonorLevelWidget;
        this.f22107b = mVar;
    }

    public final void run() {
        this.f22106a.mo21192c(this.f22107b);
    }
}
