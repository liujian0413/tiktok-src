package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.ies.web.jsbridge2.C11155d;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.newmethods.ae */
public final class C4096ae extends C11155d<JSONObject, Object> {
    /* renamed from: a */
    private static void m14177a(JSONObject jSONObject) {
        C3172e.m12002a(jSONObject.optString("service"), jSONObject.optInt("status"), jSONObject.optJSONObject("ext_json"));
    }

    /* renamed from: b */
    private static void m14178b(JSONObject jSONObject) {
        C3172e.m12004a(jSONObject.optString("service"), jSONObject.optLong("duration"), jSONObject.optJSONObject("ext_json"));
    }

    /* renamed from: c */
    private static void m14179c(JSONObject jSONObject) {
        C3172e.m12000a(jSONObject.optString("service"), jSONObject.optInt("status"), jSONObject.optLong("duration"), jSONObject.optJSONObject("ext_json"));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(org.json.JSONObject r3, com.bytedance.ies.web.jsbridge2.CallContext r4) throws java.lang.Exception {
        /*
            r2 = this;
            java.lang.String r4 = "type"
            java.lang.String r4 = r3.optString(r4)
            java.lang.String r0 = "args"
            org.json.JSONObject r3 = r3.getJSONObject(r0)
            int r0 = r4.hashCode()
            r1 = -1853762817(0xffffffff9181d2ff, float:-2.0482648E-28)
            if (r0 == r1) goto L_0x0034
            r1 = -858688242(0xffffffffccd1750e, float:-1.0981592E8)
            if (r0 == r1) goto L_0x002a
            r1 = 1821543916(0x6c928dec, float:1.417387E27)
            if (r0 == r1) goto L_0x0020
            goto L_0x003e
        L_0x0020:
            java.lang.String r0 = "monitorStatus"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x003e
            r4 = 0
            goto L_0x003f
        L_0x002a:
            java.lang.String r0 = "monitorDuration"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x003e
            r4 = 1
            goto L_0x003f
        L_0x0034:
            java.lang.String r0 = "monitorStatusAndDuration"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x003e
            r4 = 2
            goto L_0x003f
        L_0x003e:
            r4 = -1
        L_0x003f:
            switch(r4) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0047;
                case 2: goto L_0x0043;
                default: goto L_0x0042;
            }
        L_0x0042:
            goto L_0x004e
        L_0x0043:
            m14179c(r3)
            goto L_0x004e
        L_0x0047:
            m14178b(r3)
            goto L_0x004e
        L_0x004b:
            m14177a(r3)
        L_0x004e:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4096ae.invoke(org.json.JSONObject, com.bytedance.ies.web.jsbridge2.CallContext):java.lang.Object");
    }
}
