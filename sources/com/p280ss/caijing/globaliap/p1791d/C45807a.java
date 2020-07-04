package com.p280ss.caijing.globaliap.p1791d;

import android.content.Context;
import com.p280ss.caijing.globaliap.p1789b.C45803b;

/* renamed from: com.ss.caijing.globaliap.d.a */
public final class C45807a implements C45803b {

    /* renamed from: a */
    private Context f117165a;

    /* renamed from: a */
    public final String mo111022a() {
        return "GoogleConfirmTask";
    }

    /* JADX INFO: used method not loaded: com.ss.caijing.globaliap.f.b.a(java.lang.String, boolean, boolean):null, types can be incorrect */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        com.p280ss.caijing.globaliap.p1795f.C45863b.m143923a(r4, false, true);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x009f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            android.content.Context r0 = r10.f117165a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.content.Context r0 = r10.f117165a
            java.util.Map r0 = com.p280ss.caijing.globaliap.p1791d.C45846h.m143868a(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0012
            return
        L_0x0012:
            java.util.Set r1 = r0.keySet()
            int r2 = r1.size()
            if (r2 <= 0) goto L_0x0037
            int r2 = r1.size()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r4 = "size"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r2.toString()
            r3.put(r4, r2)
            java.lang.String r2 = "caijing_iap_google_background_confirm_size"
            com.p280ss.caijing.globaliap.p1795f.C45864c.m143930a(r2, r3)
        L_0x0037:
            java.util.Iterator r1 = r1.iterator()
        L_0x003b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r2 = r0.get(r2)
            org.json.JSONObject r2 = (org.json.JSONObject) r2
            if (r2 == 0) goto L_0x003b
            java.lang.String r3 = com.p280ss.caijing.globaliap.p1791d.C45845g.m143863a(r2)     // Catch:{ c -> 0x00ac }
            java.lang.String r4 = com.p280ss.caijing.globaliap.p1791d.C45845g.m143865b(r2)     // Catch:{ c -> 0x00ac }
            com.ss.caijing.globaliap.e.c$a r5 = new com.ss.caijing.globaliap.e.c$a
            r5.<init>()
            java.lang.String r6 = "https://tp-paymva.snssdk.com/gateway-u"
            com.ss.caijing.globaliap.e.c$a r5 = r5.mo111070a(r6)
            java.lang.String r2 = r2.toString()
            java.util.Map r2 = com.p280ss.caijing.globaliap.p1791d.C45846h.m143869a(r2)
            com.ss.caijing.globaliap.e.c$a r2 = r5.mo111071a(r2)
            com.ss.caijing.globaliap.e.c r2 = r2.f117275a
            com.ss.caijing.globaliap.e.c$b r2 = r2.mo111069a()     // Catch:{ b -> 0x00a7 }
            android.content.Context r5 = r10.f117165a     // Catch:{ b -> 0x00a7 }
            int r6 = r2.f117276a     // Catch:{ b -> 0x00a7 }
            r7 = 200(0xc8, float:2.8E-43)
            r8 = 1
            r9 = 0
            if (r6 != r7) goto L_0x00a3
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009f }
            java.lang.String r2 = r2.f117277b     // Catch:{ JSONException -> 0x009f }
            r6.<init>(r2)     // Catch:{ JSONException -> 0x009f }
            com.ss.caijing.globaliap.a.c r2 = new com.ss.caijing.globaliap.a.c     // Catch:{ JSONException -> 0x009f }
            r2.<init>()     // Catch:{ JSONException -> 0x009f }
            com.ss.caijing.globaliap.a.c$a r2 = com.p280ss.caijing.globaliap.p1788a.C45799c.m143782a(r6)     // Catch:{ JSONException -> 0x009f }
            boolean r2 = r2.mo111017a()     // Catch:{ JSONException -> 0x009f }
            if (r2 == 0) goto L_0x009b
            com.p280ss.caijing.globaliap.p1791d.C45846h.m143871a(r5, r3)     // Catch:{ JSONException -> 0x009f }
            com.p280ss.caijing.globaliap.p1795f.C45863b.m143923a(r4, r8, r9)     // Catch:{ JSONException -> 0x009f }
            goto L_0x003b
        L_0x009b:
            com.p280ss.caijing.globaliap.p1795f.C45863b.m143923a(r4, r9, r9)     // Catch:{ JSONException -> 0x009f }
            goto L_0x003b
        L_0x009f:
            com.p280ss.caijing.globaliap.p1795f.C45863b.m143923a(r4, r9, r8)     // Catch:{ b -> 0x00a7 }
            goto L_0x003b
        L_0x00a3:
            com.p280ss.caijing.globaliap.p1795f.C45863b.m143923a(r4, r9, r8)     // Catch:{ b -> 0x00a7 }
            goto L_0x003b
        L_0x00a7:
            r2 = move-exception
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20185b(r2)
            goto L_0x003b
        L_0x00ac:
            goto L_0x003b
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.caijing.globaliap.p1791d.C45807a.run():void");
    }

    public C45807a(Context context) {
        this.f117165a = context;
    }
}
