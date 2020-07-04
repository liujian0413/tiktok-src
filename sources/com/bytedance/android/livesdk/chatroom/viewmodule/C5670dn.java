package com.bytedance.android.livesdk.chatroom.viewmodule;

import com.bytedance.android.livesdk.chatroom.p209bl.PlatformMessageHelper;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.dn */
final /* synthetic */ class C5670dn implements Runnable {

    /* renamed from: a */
    private final PlatformMessageHelper f16755a;

    private C5670dn(PlatformMessageHelper platformMessageHelper) {
        this.f16755a = platformMessageHelper;
    }

    /* renamed from: a */
    static Runnable m18036a(PlatformMessageHelper platformMessageHelper) {
        return new C5670dn(platformMessageHelper);
    }

    public final void run() {
        this.f16755a.onMessageFinish();
    }
}
