package com.p280ss.android.ugc.aweme.net.corenet;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.net.cronet.C10928a;
import com.p280ss.android.ugc.aweme.base.C6893q;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.b */
public final class C34057b extends C10928a {
    public C34057b(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static void m109660a(int i, String str, long j, JSONObject jSONObject) {
        if (!TextUtils.isEmpty(str) && str.contains("/aweme/") && !str.endsWith(".jpeg")) {
            try {
                jSONObject.put("libraId", i);
                jSONObject.put("url", str);
                jSONObject.put("duration", j);
                jSONObject.put("useCronet", jSONObject.has("request_log"));
            } catch (JSONException unused) {
            }
            C6893q.m21447a("api_libra", jSONObject);
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26342a(long r12, long r14, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.bytedance.ttnet.p671c.C12955b r19, org.json.JSONObject r20) {
        /*
            r11 = this;
            r9 = r16
            r0 = r19
            if (r20 != 0) goto L_0x000d
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r10 = r1
            goto L_0x000f
        L_0x000d:
            r10 = r20
        L_0x000f:
            boolean r1 = com.bytedance.ttnet.C12947b.m37743a()     // Catch:{  }
            if (r1 == 0) goto L_0x001d
            java.lang.String r1 = "netClientType"
            java.lang.String r2 = "CronetClient"
            r10.put(r1, r2)     // Catch:{  }
            goto L_0x0024
        L_0x001d:
            java.lang.String r1 = "netClientType"
            java.lang.String r2 = "TTOkhttp3Client"
            r10.put(r1, r2)     // Catch:{  }
        L_0x0024:
            java.lang.String r1 = "networkQuality"
            com.facebook.network.connectionclass.b r2 = com.facebook.network.connectionclass.C14143b.m41756a()     // Catch:{  }
            com.facebook.network.connectionclass.ConnectionQuality r2 = r2.mo33901b()     // Catch:{  }
            java.lang.String r2 = r2.toString()     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "downloadSpeed"
            com.facebook.network.connectionclass.b r2 = com.facebook.network.connectionclass.C14143b.m41756a()     // Catch:{  }
            double r2 = r2.mo33902c()     // Catch:{  }
            int r2 = (int) r2     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "/aweme/v2/feed"
            boolean r1 = r9.contains(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = "rid"
            boolean r1 = r9.contains(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x005a
            java.lang.String r1 = "is_feed_compound"
            java.lang.String r2 = "1"
            r10.put(r1, r2)     // Catch:{  }
        L_0x005a:
            if (r0 == 0) goto L_0x00b1
            java.lang.String r1 = "addExecutorToAllInterceptors"
            long r2 = r0.f27501d     // Catch:{  }
            long r4 = r0.f27500c     // Catch:{  }
            r6 = 0
            long r2 = r2 - r4
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "addExecutorTime"
            long r2 = r0.f27500c     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "allInterceptorsTime"
            long r2 = r0.f27501d     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "fallback"
            int r2 = r0.f27520w     // Catch:{  }
            r10.put(r1, r2)     // Catch:{  }
            boolean r1 = r0 instanceof com.p280ss.android.ugc.aweme.net.C34068h     // Catch:{ JSONException -> 0x00b0 }
            if (r1 == 0) goto L_0x00b1
            r1 = r0
            com.ss.android.ugc.aweme.net.h r1 = (com.p280ss.android.ugc.aweme.net.C34068h) r1     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r1 = r1.f88840C     // Catch:{ JSONException -> 0x00b0 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00b0 }
            if (r2 != 0) goto L_0x00b1
            java.lang.String r2 = "errorCode"
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r2 = "0"
            boolean r1 = r2.equals(r1)     // Catch:{ JSONException -> 0x00b0 }
            if (r1 != 0) goto L_0x00b1
            java.lang.String r1 = "logid"
            com.ss.android.ugc.aweme.net.h r0 = (com.p280ss.android.ugc.aweme.net.C34068h) r0     // Catch:{ JSONException -> 0x00b0 }
            java.lang.String r0 = r0.f88841D     // Catch:{ JSONException -> 0x00b0 }
            r10.put(r1, r0)     // Catch:{ JSONException -> 0x00b0 }
            r7 = 200(0xc8, float:2.8E-43)
            r0 = r12
            r2 = r14
            r4 = r16
            r5 = r18
            r6 = r17
            r8 = r10
            com.p280ss.android.ugc.aweme.base.C6893q.m21449b(r0, r2, r4, r5, r6, r7, r8)     // Catch:{ JSONException -> 0x00b0 }
            goto L_0x00b1
        L_0x00b0:
        L_0x00b1:
            r7 = 200(0xc8, float:2.8E-43)
            r0 = r12
            r2 = r14
            r4 = r16
            r5 = r18
            r6 = r17
            r8 = r10
            com.p280ss.android.ugc.aweme.base.C6893q.m21442a(r0, r2, r4, r5, r6, r7, r8)
            com.bytedance.ies.ugc.aweme.network.f r0 = com.bytedance.ies.ugc.aweme.network.C10944e.m32115b()
            com.bytedance.ies.ugc.aweme.network.j<java.lang.Integer> r0 = r0.f29634p
            java.lang.Object r0 = r0.mo26439a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x00e5
            com.bytedance.ies.ugc.aweme.network.f r0 = com.bytedance.ies.ugc.aweme.network.C10944e.m32115b()
            com.bytedance.ies.ugc.aweme.network.j<java.lang.Integer> r0 = r0.f29634p
            java.lang.Object r0 = r0.mo26439a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r12
            m109660a(r0, r9, r12, r10)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.net.corenet.C34057b.mo26342a(long, long, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ttnet.c.b, org.json.JSONObject):void");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo26341a(long r13, long r15, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.bytedance.ttnet.p671c.C12955b r20, java.lang.Throwable r21, org.json.JSONObject r22) {
        /*
            r12 = this;
            r9 = r17
            r0 = r20
            r1 = r21
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = 0
            r2[r3] = r19
            int r10 = com.bytedance.ies.net.cronet.C10933d.m32089a(r1, r2)
            int r2 = com.bytedance.ies.net.cronet.C10933d.m32088a(r21)
            if (r22 != 0) goto L_0x001d
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            r11 = r3
            goto L_0x001f
        L_0x001d:
            r11 = r22
        L_0x001f:
            if (r1 == 0) goto L_0x00c1
            java.lang.String r3 = "errorDesc"
            java.lang.String r1 = r21.toString()     // Catch:{  }
            r11.put(r3, r1)     // Catch:{  }
            java.lang.String r1 = "networkQuality"
            com.facebook.network.connectionclass.b r3 = com.facebook.network.connectionclass.C14143b.m41756a()     // Catch:{  }
            com.facebook.network.connectionclass.ConnectionQuality r3 = r3.mo33901b()     // Catch:{  }
            java.lang.String r3 = r3.toString()     // Catch:{  }
            r11.put(r1, r3)     // Catch:{  }
            java.lang.String r1 = "downloadSpeed"
            com.facebook.network.connectionclass.b r3 = com.facebook.network.connectionclass.C14143b.m41756a()     // Catch:{  }
            double r3 = r3.mo33902c()     // Catch:{  }
            int r3 = (int) r3     // Catch:{  }
            r11.put(r1, r3)     // Catch:{  }
            java.lang.String r1 = "substatus"
            r11.put(r1, r2)     // Catch:{  }
            boolean r1 = com.bytedance.ttnet.C12947b.m37743a()     // Catch:{  }
            if (r1 == 0) goto L_0x005c
            java.lang.String r1 = "netClientType"
            java.lang.String r2 = "CronetClient"
            r11.put(r1, r2)     // Catch:{  }
            goto L_0x0063
        L_0x005c:
            java.lang.String r1 = "netClientType"
            java.lang.String r2 = "TTOkhttp3Client"
            r11.put(r1, r2)     // Catch:{  }
        L_0x0063:
            java.lang.String r1 = "/aweme/v2/feed"
            boolean r1 = r9.contains(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = "rid"
            boolean r1 = r9.contains(r1)     // Catch:{  }
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = "is_feed_compound"
            java.lang.String r2 = "1"
            r11.put(r1, r2)     // Catch:{  }
        L_0x007a:
            if (r0 == 0) goto L_0x00c1
            java.lang.String r1 = "addExecutorToAllInterceptors"
            long r2 = r0.f27501d     // Catch:{  }
            long r4 = r0.f27500c     // Catch:{  }
            r6 = 0
            long r2 = r2 - r4
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "addExecutorTime"
            long r2 = r0.f27500c     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "allInterceptorsTime"
            long r2 = r0.f27501d     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            java.lang.String r1 = "fallback"
            int r2 = r0.f27520w     // Catch:{  }
            r11.put(r1, r2)     // Catch:{  }
            boolean r1 = r0 instanceof com.p280ss.android.ugc.aweme.net.C34068h     // Catch:{ JSONException -> 0x00c0 }
            if (r1 == 0) goto L_0x00c1
            r1 = r0
            com.ss.android.ugc.aweme.net.h r1 = (com.p280ss.android.ugc.aweme.net.C34068h) r1     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r1 = r1.f88840C     // Catch:{ JSONException -> 0x00c0 }
            com.ss.android.ugc.aweme.net.h r0 = (com.p280ss.android.ugc.aweme.net.C34068h) r0     // Catch:{ JSONException -> 0x00c0 }
            java.lang.String r0 = r0.f88841D     // Catch:{ JSONException -> 0x00c0 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ JSONException -> 0x00c0 }
            if (r2 != 0) goto L_0x00b4
            java.lang.String r2 = "errorCode"
            r11.put(r2, r1)     // Catch:{ JSONException -> 0x00c0 }
        L_0x00b4:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ JSONException -> 0x00c0 }
            if (r1 != 0) goto L_0x00c1
            java.lang.String r1 = "logid"
            r11.put(r1, r0)     // Catch:{ JSONException -> 0x00c0 }
            goto L_0x00c1
        L_0x00c0:
        L_0x00c1:
            r0 = r13
            r2 = r15
            r4 = r17
            r5 = r19
            r6 = r18
            r7 = r10
            r8 = r11
            com.p280ss.android.ugc.aweme.base.C6893q.m21449b(r0, r2, r4, r5, r6, r7, r8)
            com.p280ss.android.ugc.aweme.base.C6893q.m21442a(r0, r2, r4, r5, r6, r7, r8)
            com.bytedance.ies.ugc.aweme.network.f r0 = com.bytedance.ies.ugc.aweme.network.C10944e.m32115b()
            com.bytedance.ies.ugc.aweme.network.j<java.lang.Integer> r0 = r0.f29634p
            java.lang.Object r0 = r0.mo26439a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x00f7
            com.bytedance.ies.ugc.aweme.network.f r0 = com.bytedance.ies.ugc.aweme.network.C10944e.m32115b()
            com.bytedance.ies.ugc.aweme.network.j<java.lang.Integer> r0 = r0.f29634p
            java.lang.Object r0 = r0.mo26439a()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = r13
            m109660a(r0, r9, r13, r11)
        L_0x00f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.net.corenet.C34057b.mo26341a(long, long, java.lang.String, java.lang.String, java.lang.String, com.bytedance.ttnet.c.b, java.lang.Throwable, org.json.JSONObject):void");
    }
}
