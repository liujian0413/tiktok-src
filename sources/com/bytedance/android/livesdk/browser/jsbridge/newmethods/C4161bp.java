package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.webkit.WebView;
import com.bytedance.ies.web.jsbridge2.C11155d;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bp */
public final class C4161bp extends C11155d<JSONObject, JSONObject> {

    /* renamed from: b */
    public static final C4162a f12209b = new C4162a(null);

    /* renamed from: a */
    public final WebView f12210a;

    /* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.bp$a */
    public static final class C4162a {
        private C4162a() {
        }

        public /* synthetic */ C4162a(C7571f fVar) {
            this();
        }
    }

    public C4161bp(WebView webView) {
        C7573i.m23587b(webView, "webView");
        this.f12210a = webView;
    }

    /* renamed from: a */
    private final JSONObject m14266a(int i) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("code", i);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("canGoBack", this.f12210a.canGoBack() ? 1 : 0);
        jSONObject2.put("canGoForward", this.f12210a.canGoForward() ? 1 : 0);
        jSONObject.put("data", jSONObject2);
        return jSONObject;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        if (r3.equals("status") != false) goto L_0x004e;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject invoke(org.json.JSONObject r3, com.bytedance.ies.web.jsbridge2.CallContext r4) {
        /*
            r2 = this;
            java.lang.String r0 = "params"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            java.lang.String r4 = "type"
            java.lang.String r3 = r3.optString(r4)
            r4 = 1
            if (r3 != 0) goto L_0x0014
            goto L_0x004d
        L_0x0014:
            int r0 = r3.hashCode()
            r1 = -892481550(0xffffffffcacdcff2, float:-6744057.0)
            if (r0 == r1) goto L_0x0044
            r1 = -677145915(0xffffffffd7a392c5, float:-3.59701531E14)
            if (r0 == r1) goto L_0x0036
            r1 = 3015911(0x2e04e7, float:4.226191E-39)
            if (r0 == r1) goto L_0x0028
            goto L_0x004d
        L_0x0028:
            java.lang.String r0 = "back"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x004d
            android.webkit.WebView r3 = r2.f12210a
            r3.goBack()
            goto L_0x004e
        L_0x0036:
            java.lang.String r0 = "forward"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x004d
            android.webkit.WebView r3 = r2.f12210a
            r3.goForward()
            goto L_0x004e
        L_0x0044:
            java.lang.String r0 = "status"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x004d
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            org.json.JSONObject r3 = r2.m14266a(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4161bp.invoke(org.json.JSONObject, com.bytedance.ies.web.jsbridge2.CallContext):org.json.JSONObject");
    }
}
