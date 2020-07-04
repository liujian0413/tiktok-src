package com.bytedance.android.livesdk.gift.honor;

/* renamed from: com.bytedance.android.livesdk.gift.honor.i */
final /* synthetic */ class C8097i implements Runnable {

    /* renamed from: a */
    private final LiveGiftHonorLevelWidget f22110a;

    /* renamed from: b */
    private final Integer f22111b;

    C8097i(LiveGiftHonorLevelWidget liveGiftHonorLevelWidget, Integer num) {
        this.f22110a = liveGiftHonorLevelWidget;
        this.f22111b = num;
    }

    public final void run() {
        this.f22110a.mo21190b(this.f22111b);
    }
}
