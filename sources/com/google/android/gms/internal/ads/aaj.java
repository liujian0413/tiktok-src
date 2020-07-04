package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.C15333p;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@C6505uv
final class aaj {

    /* renamed from: a */
    private static final Map<String, String> f39800a;

    /* renamed from: b */
    private final Context f39801b;

    /* renamed from: c */
    private final List<String> f39802c;

    /* renamed from: d */
    private final C16232zv f39803d;

    aaj(Context context, List<String> list, C16232zv zvVar) {
        this.f39801b = context;
        this.f39802c = list;
        this.f39803d = zvVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r5 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<java.lang.String> mo39035a(java.lang.String[] r11) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r11.length
            r2 = 0
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x0079
            r4 = r11[r3]
            java.util.List<java.lang.String> r5 = r10.f39802c
            java.util.Iterator r5 = r5.iterator()
        L_0x0012:
            boolean r6 = r5.hasNext()
            r7 = 1
            if (r6 == 0) goto L_0x0048
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = r6.equals(r4)
            if (r8 == 0) goto L_0x0027
        L_0x0025:
            r5 = 1
            goto L_0x0049
        L_0x0027:
            java.lang.String r8 = "android.webkit.resource."
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x003c
            java.lang.String r6 = r8.concat(r6)
            goto L_0x0041
        L_0x003c:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x0041:
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L_0x0012
            goto L_0x0025
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 == 0) goto L_0x0071
            java.util.Map<java.lang.String, java.lang.String> r5 = f39800a
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L_0x0065
            android.content.Context r5 = r10.f39801b
            java.util.Map<java.lang.String, java.lang.String> r6 = f39800a
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            boolean r5 = com.google.android.gms.internal.ads.acl.m45535a(r5, r6)
            if (r5 == 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r7 = 0
        L_0x0065:
            if (r7 == 0) goto L_0x006b
            r0.add(r4)
            goto L_0x0076
        L_0x006b:
            com.google.android.gms.internal.ads.zv r5 = r10.f39803d
            r5.mo42150c(r4)
            goto L_0x0076
        L_0x0071:
            com.google.android.gms.internal.ads.zv r5 = r10.f39803d
            r5.mo42149b(r4)
        L_0x0076:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aaj.mo39035a(java.lang.String[]):java.util.List");
    }

    static {
        HashMap hashMap = new HashMap();
        if (C15333p.m44600g()) {
            hashMap.put("android.webkit.resource.AUDIO_CAPTURE", "android.permission.RECORD_AUDIO");
            hashMap.put("android.webkit.resource.VIDEO_CAPTURE", "android.permission.CAMERA");
        }
        f39800a = hashMap;
    }
}
