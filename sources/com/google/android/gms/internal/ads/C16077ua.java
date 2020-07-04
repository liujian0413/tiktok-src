package com.google.android.gms.internal.ads;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ua */
public final class C16077ua implements C16064to<C15621de> {

    /* renamed from: a */
    private final boolean f45088a;

    /* renamed from: b */
    private final boolean f45089b;

    /* renamed from: c */
    private final boolean f45090c;

    public C16077ua(boolean z, boolean z2, boolean z3) {
        this.f45088a = z;
        this.f45089b = z2;
        this.f45090c = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00dc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.android.gms.internal.ads.C15636ds mo41978a(com.google.android.gms.internal.ads.C16055tf r22, org.json.JSONObject r23) throws org.json.JSONException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        /*
            r21 = this;
            r0 = r21
            r7 = r22
            r8 = r23
            java.lang.String r3 = "images"
            boolean r5 = r0.f45088a
            boolean r6 = r0.f45089b
            r4 = 0
            r1 = r22
            r2 = r23
            java.util.List r1 = r1.mo41984a(r2, r3, r4, r5, r6)
            java.lang.String r2 = "app_icon"
            boolean r3 = r0.f45088a
            r4 = 1
            com.google.android.gms.internal.ads.agj r2 = r7.mo41983a(r8, r2, r4, r3)
            java.lang.String r3 = "video"
            com.google.android.gms.internal.ads.agj r3 = r7.mo41982a(r8, r3)
            com.google.android.gms.internal.ads.agj r4 = r22.mo41981a(r23)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r1.next()
            com.google.android.gms.internal.ads.agj r5 = (com.google.android.gms.internal.ads.agj) r5
            java.lang.Object r5 = r5.get()
            com.google.android.gms.internal.ads.dd r5 = (com.google.android.gms.internal.ads.C15620dd) r5
            r7.add(r5)
            goto L_0x0031
        L_0x0047:
            com.google.android.gms.internal.ads.ami r1 = com.google.android.gms.internal.ads.C16055tf.m52163a(r3)
            com.google.android.gms.internal.ads.de r3 = new com.google.android.gms.internal.ads.de
            java.lang.String r5 = "headline"
            java.lang.String r5 = r8.getString(r5)
            boolean r6 = r0.f45090c
            if (r6 == 0) goto L_0x0094
            com.google.android.gms.internal.ads.abp r6 = com.google.android.gms.ads.internal.C14793ay.m42898d()
            android.content.res.Resources r6 = r6.mo39096f()
            if (r6 == 0) goto L_0x0069
            r9 = 2131826342(0x7f1116a6, float:1.9285566E38)
            java.lang.String r6 = r6.getString(r9)
            goto L_0x006b
        L_0x0069:
            java.lang.String r6 = "Test Ad"
        L_0x006b:
            if (r5 == 0) goto L_0x0095
            java.lang.String r9 = java.lang.String.valueOf(r6)
            int r9 = r9.length()
            int r9 = r9 + 3
            java.lang.String r10 = java.lang.String.valueOf(r5)
            int r10 = r10.length()
            int r9 = r9 + r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r9)
            r10.append(r6)
            java.lang.String r6 = " : "
            r10.append(r6)
            r10.append(r5)
            java.lang.String r5 = r10.toString()
        L_0x0094:
            r6 = r5
        L_0x0095:
            java.lang.String r5 = "body"
            java.lang.String r9 = r8.getString(r5)
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.en r2 = (com.google.android.gms.internal.ads.C15658en) r2
            java.lang.String r5 = "call_to_action"
            java.lang.String r10 = r8.getString(r5)
            java.lang.String r5 = "rating"
            r11 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r11 = r8.optDouble(r5, r11)
            java.lang.String r5 = "store"
            java.lang.String r13 = r8.optString(r5)
            java.lang.String r5 = "price"
            java.lang.String r14 = r8.optString(r5)
            java.lang.Object r4 = r4.get()
            r15 = r4
            com.google.android.gms.internal.ads.cw r15 = (com.google.android.gms.internal.ads.C15612cw) r15
            android.os.Bundle r16 = new android.os.Bundle
            r16.<init>()
            r4 = 0
            if (r1 == 0) goto L_0x00d1
            com.google.android.gms.internal.ads.amy r5 = r1.mo39464b()
            r17 = r5
            goto L_0x00d3
        L_0x00d1:
            r17 = r4
        L_0x00d3:
            if (r1 == 0) goto L_0x00dc
            android.view.View r1 = r1.getView()
            r18 = r1
            goto L_0x00de
        L_0x00dc:
            r18 = r4
        L_0x00de:
            r19 = 0
            r20 = 0
            r5 = r3
            r8 = r9
            r9 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16077ua.mo41978a(com.google.android.gms.internal.ads.tf, org.json.JSONObject):com.google.android.gms.internal.ads.ds");
    }
}
