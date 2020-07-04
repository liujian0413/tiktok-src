package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.i */
public final class C4171i extends C11152c<Object, Object> {

    /* renamed from: a */
    private C4172a f12224a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.i$a */
    public interface C4172a {
        /* renamed from: g */
        void mo11614g();
    }

    public final void onTerminate() {
    }

    public C4171i(C4172a aVar) {
        this.f12224a = aVar;
    }

    public final void invoke(Object obj, CallContext callContext) throws Exception {
        if (this.f12224a != null) {
            this.f12224a.mo11614g();
        }
    }
}
