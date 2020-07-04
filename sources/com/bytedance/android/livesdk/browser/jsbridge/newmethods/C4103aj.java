package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.ProgressDialog;
import com.bytedance.ies.web.jsbridge2.C11152c;
import org.json.JSONObject;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.aj */
public final class C4103aj extends C11152c<JSONObject, Object> {

    /* renamed from: a */
    private ProgressDialog f12085a;

    /* renamed from: b */
    private C7321c f12086b;

    public final void onTerminate() {
        if (this.f12086b != null) {
            this.f12086b.dispose();
        }
        if (this.f12085a != null) {
            this.f12085a.dismiss();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11691a(Long l) throws Exception {
        if (this.f12085a != null) {
            this.f12085a.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void invoke(org.json.JSONObject r5, com.bytedance.ies.web.jsbridge2.CallContext r6) throws java.lang.Exception {
        /*
            r4 = this;
            java.lang.String r0 = "type"
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r1 = "args"
            org.json.JSONObject r5 = r5.getJSONObject(r1)
            int r1 = r0.hashCode()
            r2 = 3529469(0x35dafd, float:4.94584E-39)
            r3 = 0
            if (r1 == r2) goto L_0x0026
            r2 = 1671672458(0x63a3b28a, float:6.039369E21)
            if (r1 == r2) goto L_0x001c
            goto L_0x0030
        L_0x001c:
            java.lang.String r1 = "dismiss"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x0031
        L_0x0026:
            java.lang.String r1 = "show"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0030
            r0 = 0
            goto L_0x0031
        L_0x0030:
            r0 = -1
        L_0x0031:
            switch(r0) {
                case 0: goto L_0x004d;
                case 1: goto L_0x0035;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x008b
        L_0x0035:
            io.reactivex.b.c r5 = r4.f12086b
            if (r5 == 0) goto L_0x003e
            io.reactivex.b.c r5 = r4.f12086b
            r5.dispose()
        L_0x003e:
            android.app.ProgressDialog r5 = r4.f12085a
            if (r5 == 0) goto L_0x0047
            android.app.ProgressDialog r5 = r4.f12085a
            r5.dismiss()
        L_0x0047:
            r5 = 0
            r4.f12086b = r5
            r4.f12085a = r5
            goto L_0x008b
        L_0x004d:
            android.app.ProgressDialog r0 = r4.f12085a
            if (r0 == 0) goto L_0x0056
            android.app.ProgressDialog r0 = r4.f12085a
            r0.dismiss()
        L_0x0056:
            android.content.Context r6 = r6.f30265a
            java.lang.String r0 = "message"
            java.lang.String r5 = r5.getString(r0)
            android.app.ProgressDialog r5 = com.bytedance.android.livesdk.utils.C9044al.m27011b(r6, r5)
            r4.f12085a = r5
            android.app.ProgressDialog r5 = r4.f12085a
            r5.setCancelable(r3)
            android.app.ProgressDialog r5 = r4.f12085a
            r5.show()
            r5 = 8
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            io.reactivex.aa r5 = p346io.reactivex.C7319aa.m22922a(r5, r0)
            io.reactivex.z r6 = p346io.reactivex.p1865a.p1867b.C47549a.m148327a()
            io.reactivex.aa r5 = r5.mo19127a(r6)
            com.bytedance.android.livesdk.browser.jsbridge.newmethods.ak r6 = new com.bytedance.android.livesdk.browser.jsbridge.newmethods.ak
            r6.<init>(r4)
            io.reactivex.d.g r0 = com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4105al.f12088a
            io.reactivex.b.c r5 = r5.mo19129a(r6, r0)
            r4.f12086b = r5
        L_0x008b:
            r4.finishWithSuccess()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4103aj.invoke(org.json.JSONObject, com.bytedance.ies.web.jsbridge2.CallContext):void");
    }
}
