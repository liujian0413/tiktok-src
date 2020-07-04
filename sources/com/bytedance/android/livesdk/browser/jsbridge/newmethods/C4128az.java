package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.az */
final /* synthetic */ class C4128az implements C7326g {

    /* renamed from: a */
    private final SubscribeMatchMethod f12122a;

    /* renamed from: b */
    private final int f12123b;

    /* renamed from: c */
    private final CallContext f12124c;

    C4128az(SubscribeMatchMethod subscribeMatchMethod, int i, CallContext callContext) {
        this.f12122a = subscribeMatchMethod;
        this.f12123b = i;
        this.f12124c = callContext;
    }

    public final void accept(Object obj) {
        this.f12122a.mo11671a(this.f12123b, this.f12124c, (C3479d) obj);
    }
}
