package com.bytedance.android.livesdk.browser.jsbridge.p201c;

import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.g */
public final class C4052g extends C11155d<C4053a, Void> {

    /* renamed from: a */
    private C4054b f12043a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.g$a */
    public static final class C4053a {
        @C6593c(mo15949a = "status")

        /* renamed from: a */
        public int f12044a;
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c.g$b */
    public interface C4054b {
        /* renamed from: a */
        void mo11665a(C4053a aVar);
    }

    public C4052g(C4054b bVar) {
        this.f12043a = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Void invoke(C4053a aVar, CallContext callContext) throws Exception {
        if (this.f12043a != null) {
            this.f12043a.mo11665a(aVar);
        }
        return null;
    }
}
