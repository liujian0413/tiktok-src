package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn.rnmethod.common;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.rnmethod.common.b */
final /* synthetic */ class C25942b implements Runnable {

    /* renamed from: a */
    private final ReadableMap f68625a;

    /* renamed from: b */
    private final Callback f68626b;

    C25942b(ReadableMap readableMap, Callback callback) {
        this.f68625a = readableMap;
        this.f68626b = callback;
    }

    public final void run() {
        ReactCommonModule.lambda$share$1$ReactCommonModule(this.f68625a, this.f68626b);
    }
}
