package com.p280ss.ugc.live.sdk.p1831a;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.util.Locale;

/* renamed from: com.ss.ugc.live.sdk.a.a */
public final class C46243a {
    /* renamed from: a */
    public static String m145197a(String str, C46244b bVar) {
        if (bVar == null) {
            return str;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.startsWith(WebKitApi.SCHEME_HTTP)) {
            int indexOf = lowerCase.indexOf("://", 4) + 3;
            if (indexOf == 7 || indexOf == 8) {
                return m145198a(str, bVar, lowerCase, indexOf);
            }
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m145198a(java.lang.String r6, com.p280ss.ugc.live.sdk.p1831a.C46244b r7, java.lang.String r8, int r9) {
        /*
            int r0 = r8.length()
            r1 = -1
            r3 = r9
            r2 = -1
        L_0x0007:
            if (r9 >= r0) goto L_0x0024
            char r4 = r8.charAt(r9)
            r5 = 35
            if (r4 == r5) goto L_0x0024
            r5 = 47
            if (r4 == r5) goto L_0x0024
            r5 = 58
            if (r4 == r5) goto L_0x0020
            switch(r4) {
                case 63: goto L_0x0024;
                case 64: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0021
        L_0x001d:
            int r3 = r9 + 1
            goto L_0x0021
        L_0x0020:
            r2 = r9
        L_0x0021:
            int r9 = r9 + 1
            goto L_0x0007
        L_0x0024:
            if (r2 != r1) goto L_0x0027
            r2 = r9
        L_0x0027:
            java.lang.String r8 = r6.substring(r3, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x0080
            java.lang.String r7 = r7.mo114202a(r8)
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0080
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.lang.String r1 = r6.substring(r1, r3)
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            if (r2 >= r9) goto L_0x0064
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = r6.substring(r2, r9)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
        L_0x0064:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r7)
            java.lang.String r7 = "/"
            r0.append(r7)
            r0.append(r8)
            java.lang.String r6 = r6.substring(r9)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
        L_0x0080:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ugc.live.sdk.p1831a.C46243a.m145198a(java.lang.String, com.ss.ugc.live.sdk.a.b, java.lang.String, int):java.lang.String");
    }
}
