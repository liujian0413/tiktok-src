package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.livesdk.browser.p197g.C4025b;
import com.bytedance.ies.web.jsbridge2.C11152c;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.at */
public final class C4116at extends C11152c<C4118b, Object> {

    /* renamed from: a */
    private C4117a f12101a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.at$a */
    public interface C4117a {
        /* renamed from: a */
        void mo11604a(C4025b bVar);

        /* renamed from: f */
        C4025b mo11613f();
    }

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.at$b */
    static final class C4118b {
        @C6593c(mo15949a = "title")

        /* renamed from: a */
        String f12102a;
        @C6593c(mo15949a = "desc")

        /* renamed from: b */
        String f12103b;
        @C6593c(mo15949a = "image")

        /* renamed from: c */
        String f12104c;
        @C6593c(mo15949a = "url")

        /* renamed from: d */
        String f12105d;

        C4118b() {
        }
    }

    public final void onTerminate() {
        this.f12101a = null;
    }

    public C4116at(C4117a aVar) {
        this.f12101a = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void invoke(C4118b bVar, CallContext callContext) {
        this.f12101a.mo11604a(new C4025b(bVar.f12102a, bVar.f12103b, bVar.f12104c, bVar.f12105d));
        finishWithSuccess();
    }
}
