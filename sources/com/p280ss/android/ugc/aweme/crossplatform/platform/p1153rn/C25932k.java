package com.p280ss.android.ugc.aweme.crossplatform.platform.p1153rn;

import com.facebook.react.ReactInstanceManager.ReactInstanceEventListener;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26024b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.platform.rn.k */
final /* synthetic */ class C25932k implements ReactInstanceEventListener {

    /* renamed from: a */
    private final C25924g f68595a;

    /* renamed from: b */
    private final String f68596b;

    /* renamed from: c */
    private final C26024b f68597c;

    C25932k(C25924g gVar, String str, C26024b bVar) {
        this.f68595a = gVar;
        this.f68596b = str;
        this.f68597c = bVar;
    }

    public final void onReactContextInitialized(ReactContext reactContext) {
        this.f68595a.mo67306a(this.f68596b, this.f68597c, reactContext);
    }
}
