package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.fragment.WebDialogFragment;
import com.bytedance.ies.web.jsbridge2.C11155d;
import com.bytedance.ies.web.jsbridge2.CallContext;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.as */
public final class C4113as extends C11155d<C4114a, Object> {

    /* renamed from: a */
    private WebDialogFragment f12093a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.as$a */
    static final class C4114a {
        @C6593c(mo15949a = "type")

        /* renamed from: a */
        String f12094a;
        @C6593c(mo15949a = "args")

        /* renamed from: b */
        C4115a f12095b;

        /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.as$a$a */
        static final class C4115a {
            @C6593c(mo15949a = "url")

            /* renamed from: a */
            String f12096a;
            @C6593c(mo15949a = "width")

            /* renamed from: b */
            int f12097b;
            @C6593c(mo15949a = "height")

            /* renamed from: c */
            int f12098c;
            @C6593c(mo15949a = "radius")

            /* renamed from: d */
            int f12099d;
            @C6593c(mo15949a = "close_by_mask")

            /* renamed from: e */
            int f12100e;
        }

        C4114a() {
        }
    }

    public C4113as(WebDialogFragment webDialogFragment) {
        this.f12093a = webDialogFragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object invoke(C4114a aVar, CallContext callContext) throws Exception {
        if (TextUtils.equals("webview_popup", aVar.f12094a)) {
            C4115a aVar2 = aVar.f12095b;
            this.f12093a.mo11641a(aVar2.f12096a, aVar2.f12097b, aVar2.f12098c, aVar2.f12099d, aVar2.f12100e);
        } else {
            terminate();
        }
        return null;
    }
}
