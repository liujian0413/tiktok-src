package com.bytedance.android.livesdk.gift.honor;

import com.bytedance.android.livesdk.gift.model.C8158m;

/* renamed from: com.bytedance.android.livesdk.gift.honor.q */
final /* synthetic */ class C8105q implements Runnable {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f22120a;

    /* renamed from: b */
    private final C8158m f22121b;

    C8105q(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, C8158m mVar) {
        this.f22120a = liveGiftHonorLevelWidget;
        this.f22121b = mVar;
    }

    public final void run() {
        this.f22120a.mo21184a(this.f22121b);
    }
}
