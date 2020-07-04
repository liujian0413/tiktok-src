package com.p280ss.android.ugc.aweme.p1216fe.registry.p1224rn;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.ss.android.ugc.aweme.fe.registry.rn.a */
final /* synthetic */ class C28059a implements Runnable {

    /* renamed from: a */
    private final AmeRNBridgeModule f73917a;

    /* renamed from: b */
    private final String f73918b;

    /* renamed from: c */
    private final ReadableMap f73919c;

    /* renamed from: d */
    private final Callback f73920d;

    C28059a(AmeRNBridgeModule ameRNBridgeModule, String str, ReadableMap readableMap, Callback callback) {
        this.f73917a = ameRNBridgeModule;
        this.f73918b = str;
        this.f73919c = readableMap;
        this.f73920d = callback;
    }

    public final void run() {
        this.f73917a.lambda$call$0$AmeRNBridgeModule(this.f73918b, this.f73919c, this.f73920d);
    }
}
