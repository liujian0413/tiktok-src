package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.sdk.webview.p901b.C20133e;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.e */
public class C43505e extends C20133e {

    /* renamed from: a */
    private C11087a f112656a;

    /* renamed from: a */
    private void m137985a() {
        C42961az.m136383d(this);
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0032 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036 A[Catch:{ Exception -> 0x003d }] */
    @org.greenrobot.eventbus.C7709l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindMobileFinishEvent(com.p280ss.android.ugc.aweme.account.p941d.C21166a r5) {
        /*
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x003d }
            r0.<init>()     // Catch:{ Exception -> 0x003d }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x003d }
            r1.<init>()     // Catch:{ Exception -> 0x003d }
            java.lang.String r2 = "type"
            java.lang.String r3 = "bindPhone"
            r0.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r2 = "code"
            java.lang.String r3 = r5.f56897a     // Catch:{ JSONException -> 0x0032 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0032 }
            r3 = r3 ^ 1
            r1.put(r2, r3)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r2 = r5.f56898b     // Catch:{ JSONException -> 0x0032 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x0032 }
            if (r2 != 0) goto L_0x002d
            java.lang.String r2 = "_raw"
            java.lang.String r5 = r5.f56898b     // Catch:{ JSONException -> 0x0032 }
            r1.put(r2, r5)     // Catch:{ JSONException -> 0x0032 }
        L_0x002d:
            java.lang.String r5 = "args"
            r0.put(r5, r1)     // Catch:{ JSONException -> 0x0032 }
        L_0x0032:
            com.bytedance.ies.web.a.a r5 = r4.f112656a     // Catch:{ Exception -> 0x003d }
            if (r5 == 0) goto L_0x003d
            com.bytedance.ies.web.a.a r5 = r4.f112656a     // Catch:{ Exception -> 0x003d }
            java.lang.String r1 = "H5_nativeEvent"
            r5.mo27034b(r1, r0)     // Catch:{ Exception -> 0x003d }
        L_0x003d:
            r4.m137985a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.web.jsbridge.C43505e.onBindMobileFinishEvent(com.ss.android.ugc.aweme.account.d.a):void");
    }

    public C43505e(C11087a aVar, WeakReference<Context> weakReference) {
        super(weakReference);
        this.f112656a = aVar;
    }

    public void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        String string = iVar.f30171d.getString("type");
        iVar.f30170c = "open";
        iVar.f30171d.put("type", string);
        iVar.f30173f = false;
        C42961az.m136382c(this);
        open(iVar.f30171d);
    }
}
