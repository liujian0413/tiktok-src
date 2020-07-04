package com.google.android.gms.internal.ads;

import android.location.Location;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xd */
public final class C16160xd {
    /* JADX WARNING: Removed duplicated region for block: B:322:0x086b A[Catch:{ JSONException -> 0x09a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x086e A[Catch:{ JSONException -> 0x09a8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m52364a(android.content.Context r22, com.google.android.gms.internal.ads.C16151wv r23) {
        /*
            r1 = r23
            com.google.android.gms.internal.ads.zzaxe r2 = r1.f45261i
            android.location.Location r3 = r1.f45256d
            com.google.android.gms.internal.ads.xh r4 = r1.f45262j
            android.os.Bundle r5 = r1.f45253a
            org.json.JSONObject r6 = r1.f45263k
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ JSONException -> 0x09a8 }
            r8.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "extra_caps"
            com.google.android.gms.internal.ads.bl<java.lang.String> r10 = com.google.android.gms.internal.ads.C15585bw.f43814bH     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bt r11 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Object r10 = r11.mo41272a(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.util.List<java.lang.String> r9 = r1.f45255c     // Catch:{ JSONException -> 0x09a8 }
            int r9 = r9.size()     // Catch:{ JSONException -> 0x09a8 }
            if (r9 <= 0) goto L_0x0035
            java.lang.String r9 = "eid"
            java.lang.String r10 = ","
            java.util.List<java.lang.String> r11 = r1.f45255c     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = android.text.TextUtils.join(r10, r11)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0035:
            android.os.Bundle r9 = r2.f45572b     // Catch:{ JSONException -> 0x09a8 }
            if (r9 == 0) goto L_0x0040
            java.lang.String r9 = "ad_pos"
            android.os.Bundle r10 = r2.f45572b     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0040:
            com.google.android.gms.internal.ads.zzyv r9 = r2.f45573c     // Catch:{ JSONException -> 0x09a8 }
            java.text.SimpleDateFormat r10 = new java.text.SimpleDateFormat     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "yyyyMMdd"
            java.util.Locale r12 = java.util.Locale.US     // Catch:{ JSONException -> 0x09a8 }
            r10.<init>(r11, r12)     // Catch:{ JSONException -> 0x09a8 }
            long r11 = r9.f45778b     // Catch:{ JSONException -> 0x09a8 }
            r13 = -1
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 == 0) goto L_0x0063
            java.lang.String r11 = "cust_age"
            java.util.Date r12 = new java.util.Date     // Catch:{ JSONException -> 0x09a8 }
            long r13 = r9.f45778b     // Catch:{ JSONException -> 0x09a8 }
            r12.<init>(r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = r10.format(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0063:
            android.os.Bundle r10 = r9.f45779c     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x006e
            java.lang.String r10 = "extras"
            android.os.Bundle r11 = r9.f45779c     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r11)     // Catch:{ JSONException -> 0x09a8 }
        L_0x006e:
            int r10 = r9.f45780d     // Catch:{ JSONException -> 0x09a8 }
            r11 = -1
            if (r10 == r11) goto L_0x007e
            java.lang.String r10 = "cust_gender"
            int r12 = r9.f45780d     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09a8 }
        L_0x007e:
            java.util.List<java.lang.String> r10 = r9.f45781e     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = "kw"
            java.util.List<java.lang.String> r12 = r9.f45781e     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0089:
            int r10 = r9.f45783g     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == r11) goto L_0x0098
            java.lang.String r10 = "tag_for_child_directed_treatment"
            int r12 = r9.f45783g     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0098:
            boolean r10 = r9.f45782f     // Catch:{ JSONException -> 0x09a8 }
            r12 = 1
            if (r10 == 0) goto L_0x00a6
            java.lang.String r10 = "test_request"
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r13)     // Catch:{ JSONException -> 0x09a8 }
        L_0x00a6:
            int r10 = r9.f45777a     // Catch:{ JSONException -> 0x09a8 }
            r13 = 2
            if (r10 < r13) goto L_0x00c7
            boolean r10 = r9.f45784h     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x00b8
            java.lang.String r10 = "d_imp_hdr"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x09a8 }
        L_0x00b8:
            java.lang.String r10 = r9.f45785i     // Catch:{ JSONException -> 0x09a8 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ JSONException -> 0x09a8 }
            if (r10 != 0) goto L_0x00c7
            java.lang.String r10 = "ppid"
            java.lang.String r14 = r9.f45785i     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r14)     // Catch:{ JSONException -> 0x09a8 }
        L_0x00c7:
            int r10 = r9.f45777a     // Catch:{ JSONException -> 0x09a8 }
            r14 = 3
            if (r10 < r14) goto L_0x00d7
            java.lang.String r10 = r9.f45788l     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x00d7
            java.lang.String r10 = "url"
            java.lang.String r15 = r9.f45788l     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r15)     // Catch:{ JSONException -> 0x09a8 }
        L_0x00d7:
            int r10 = r9.f45777a     // Catch:{ JSONException -> 0x09a8 }
            r15 = 5
            if (r10 < r15) goto L_0x00fd
            android.os.Bundle r10 = r9.f45790n     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x00e7
            java.lang.String r10 = "custom_targeting"
            android.os.Bundle r7 = r9.f45790n     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r7)     // Catch:{ JSONException -> 0x09a8 }
        L_0x00e7:
            java.util.List<java.lang.String> r7 = r9.f45791o     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x00f2
            java.lang.String r7 = "category_exclusions"
            java.util.List<java.lang.String> r10 = r9.f45791o     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x00f2:
            java.lang.String r7 = r9.f45792p     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x00fd
            java.lang.String r7 = "request_agent"
            java.lang.String r10 = r9.f45792p     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x00fd:
            int r7 = r9.f45777a     // Catch:{ JSONException -> 0x09a8 }
            r10 = 6
            if (r7 < r10) goto L_0x010d
            java.lang.String r7 = r9.f45793q     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x010d
            java.lang.String r7 = "request_pkg"
            java.lang.String r10 = r9.f45793q     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x010d:
            int r7 = r9.f45777a     // Catch:{ JSONException -> 0x09a8 }
            r10 = 7
            if (r7 < r10) goto L_0x011d
            java.lang.String r7 = "is_designed_for_families"
            boolean r10 = r9.f45794r     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x011d:
            int r7 = r9.f45777a     // Catch:{ JSONException -> 0x09a8 }
            r10 = 8
            if (r7 < r10) goto L_0x013d
            int r7 = r9.f45796t     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == r11) goto L_0x0132
            java.lang.String r7 = "tag_for_under_age_of_consent"
            int r10 = r9.f45796t     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0132:
            java.lang.String r7 = r9.f45797u     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x013d
            java.lang.String r7 = "max_ad_content_rating"
            java.lang.String r9 = r9.f45797u     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x09a8 }
        L_0x013d:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.zzyz[] r7 = r7.f45804g     // Catch:{ JSONException -> 0x09a8 }
            if (r7 != 0) goto L_0x015a
            java.lang.String r7 = "format"
            com.google.android.gms.internal.ads.zzyz r10 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = r10.f45798a     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.zzyz r7 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            boolean r7 = r7.f45806i     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x0190
            java.lang.String r7 = "fluid"
            java.lang.String r10 = "height"
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x0190
        L_0x015a:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.zzyz[] r7 = r7.f45804g     // Catch:{ JSONException -> 0x09a8 }
            int r10 = r7.length     // Catch:{ JSONException -> 0x09a8 }
            r15 = 0
            r17 = 0
            r18 = 0
        L_0x0164:
            if (r15 >= r10) goto L_0x0190
            r13 = r7[r15]     // Catch:{ JSONException -> 0x09a8 }
            boolean r12 = r13.f45806i     // Catch:{ JSONException -> 0x09a8 }
            if (r12 != 0) goto L_0x0177
            if (r17 != 0) goto L_0x0177
            java.lang.String r12 = "format"
            java.lang.String r14 = r13.f45798a     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r12, r14)     // Catch:{ JSONException -> 0x09a8 }
            r17 = 1
        L_0x0177:
            boolean r12 = r13.f45806i     // Catch:{ JSONException -> 0x09a8 }
            if (r12 == 0) goto L_0x0186
            if (r18 != 0) goto L_0x0186
            java.lang.String r12 = "fluid"
            java.lang.String r13 = "height"
            r8.put(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            r18 = 1
        L_0x0186:
            if (r17 == 0) goto L_0x018a
            if (r18 != 0) goto L_0x0190
        L_0x018a:
            int r15 = r15 + 1
            r12 = 1
            r13 = 2
            r14 = 3
            goto L_0x0164
        L_0x0190:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            int r7 = r7.f45802e     // Catch:{ JSONException -> 0x09a8 }
            if (r7 != r11) goto L_0x019d
            java.lang.String r7 = "smart_w"
            java.lang.String r10 = "full"
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x019d:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            int r7 = r7.f45799b     // Catch:{ JSONException -> 0x09a8 }
            r10 = -2
            if (r7 != r10) goto L_0x01ab
            java.lang.String r7 = "smart_h"
            java.lang.String r12 = "auto"
            r8.put(r7, r12)     // Catch:{ JSONException -> 0x09a8 }
        L_0x01ab:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.zzyz[] r7 = r7.f45804g     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x0219
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x09a8 }
            r7.<init>()     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.zzyz r12 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.zzyz[] r12 = r12.f45804g     // Catch:{ JSONException -> 0x09a8 }
            int r13 = r12.length     // Catch:{ JSONException -> 0x09a8 }
            r14 = 0
            r15 = 0
        L_0x01bd:
            if (r14 >= r13) goto L_0x01ff
            r9 = r12[r14]     // Catch:{ JSONException -> 0x09a8 }
            boolean r10 = r9.f45806i     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x01c7
            r15 = 1
            goto L_0x01fa
        L_0x01c7:
            int r10 = r7.length()     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x01d2
            java.lang.String r10 = "|"
            r7.append(r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x01d2:
            int r10 = r9.f45802e     // Catch:{ JSONException -> 0x09a8 }
            if (r10 != r11) goto L_0x01de
            int r10 = r9.f45803f     // Catch:{ JSONException -> 0x09a8 }
            float r10 = (float) r10     // Catch:{ JSONException -> 0x09a8 }
            float r11 = r4.f45361t     // Catch:{ JSONException -> 0x09a8 }
            float r10 = r10 / r11
            int r10 = (int) r10     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x01e0
        L_0x01de:
            int r10 = r9.f45802e     // Catch:{ JSONException -> 0x09a8 }
        L_0x01e0:
            r7.append(r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "x"
            r7.append(r10)     // Catch:{ JSONException -> 0x09a8 }
            int r10 = r9.f45799b     // Catch:{ JSONException -> 0x09a8 }
            r11 = -2
            if (r10 != r11) goto L_0x01f5
            int r9 = r9.f45800c     // Catch:{ JSONException -> 0x09a8 }
            float r9 = (float) r9     // Catch:{ JSONException -> 0x09a8 }
            float r10 = r4.f45361t     // Catch:{ JSONException -> 0x09a8 }
            float r9 = r9 / r10
            int r9 = (int) r9     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x01f7
        L_0x01f5:
            int r9 = r9.f45799b     // Catch:{ JSONException -> 0x09a8 }
        L_0x01f7:
            r7.append(r9)     // Catch:{ JSONException -> 0x09a8 }
        L_0x01fa:
            int r14 = r14 + 1
            r10 = -2
            r11 = -1
            goto L_0x01bd
        L_0x01ff:
            if (r15 == 0) goto L_0x0214
            int r9 = r7.length()     // Catch:{ JSONException -> 0x09a8 }
            if (r9 == 0) goto L_0x020e
            java.lang.String r9 = "|"
            r10 = 0
            r7.insert(r10, r9)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x020f
        L_0x020e:
            r10 = 0
        L_0x020f:
            java.lang.String r9 = "320x50"
            r7.insert(r10, r9)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0214:
            java.lang.String r9 = "sz"
            r8.put(r9, r7)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0219:
            int r7 = r2.f45583m     // Catch:{ JSONException -> 0x09a8 }
            r9 = 24
            if (r7 == 0) goto L_0x02d8
            java.lang.String r7 = "native_version"
            int r10 = r2.f45583m     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "native_templates"
            java.util.List<java.lang.String> r10 = r2.f45584n     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.zzafl r7 = r2.f45595y     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x028a
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r7 = com.google.android.gms.internal.ads.C15585bw.f43822bP     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bt r10 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Object r7 = r10.mo41272a(r7)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ JSONException -> 0x09a8 }
            boolean r7 = r7.booleanValue()     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x026b
            com.google.android.gms.internal.ads.zzafl r7 = r2.f45595y     // Catch:{ JSONException -> 0x09a8 }
            int r7 = r7.f45506a     // Catch:{ JSONException -> 0x09a8 }
            r10 = 3
            if (r7 <= r10) goto L_0x026b
            java.lang.String r7 = "enable_native_media_orientation"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.zzafl r7 = r2.f45595y     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = r7.mo42163a()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "unknown"
            boolean r10 = r10.equals(r7)     // Catch:{ JSONException -> 0x09a8 }
            if (r10 != 0) goto L_0x026b
            java.lang.String r10 = "native_media_orientation"
            r8.put(r10, r7)     // Catch:{ JSONException -> 0x09a8 }
        L_0x026b:
            com.google.android.gms.internal.ads.zzafl r7 = r2.f45595y     // Catch:{ JSONException -> 0x09a8 }
            int r7 = r7.f45508c     // Catch:{ JSONException -> 0x09a8 }
            switch(r7) {
                case 0: goto L_0x027b;
                case 1: goto L_0x0278;
                case 2: goto L_0x0275;
                default: goto L_0x0272;
            }     // Catch:{ JSONException -> 0x09a8 }
        L_0x0272:
            java.lang.String r7 = "unknown"
            goto L_0x027d
        L_0x0275:
            java.lang.String r7 = "landscape"
            goto L_0x027d
        L_0x0278:
            java.lang.String r7 = "portrait"
            goto L_0x027d
        L_0x027b:
            java.lang.String r7 = "any"
        L_0x027d:
            java.lang.String r10 = "unknown"
            boolean r10 = r10.equals(r7)     // Catch:{ JSONException -> 0x09a8 }
            if (r10 != 0) goto L_0x028a
            java.lang.String r10 = "native_image_orientation"
            r8.put(r10, r7)     // Catch:{ JSONException -> 0x09a8 }
        L_0x028a:
            java.lang.String r7 = "native_multiple_images"
            com.google.android.gms.internal.ads.zzafl r10 = r2.f45595y     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x0296
            boolean r10 = r10.f45509d     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x0296
            r10 = 1
            goto L_0x0297
        L_0x0296:
            r10 = 0
        L_0x0297:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.util.List<java.lang.String> r7 = r2.f45596z     // Catch:{ JSONException -> 0x09a8 }
            boolean r7 = r7.isEmpty()     // Catch:{ JSONException -> 0x09a8 }
            if (r7 != 0) goto L_0x02ad
            java.lang.String r7 = "native_custom_templates"
            java.util.List<java.lang.String> r10 = r2.f45596z     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x02ad:
            int r7 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            if (r7 < r9) goto L_0x02bc
            java.lang.String r7 = "max_num_ads"
            int r10 = r2.f45562Y     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x02bc:
            java.lang.String r7 = r2.f45560W     // Catch:{ JSONException -> 0x09a8 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x09a8 }
            if (r7 != 0) goto L_0x02d8
            java.lang.String r7 = "native_advanced_settings"
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x02d1 }
            java.lang.String r11 = r2.f45560W     // Catch:{ JSONException -> 0x02d1 }
            r10.<init>(r11)     // Catch:{ JSONException -> 0x02d1 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x02d1 }
            goto L_0x02d8
        L_0x02d1:
            r0 = move-exception
            r7 = r0
            java.lang.String r10 = "Problem creating json from native advanced settings"
            com.google.android.gms.internal.ads.acd.m45780c(r10, r7)     // Catch:{ JSONException -> 0x09a8 }
        L_0x02d8:
            java.util.List<java.lang.Integer> r7 = r2.f45559V     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x0319
            java.util.List<java.lang.Integer> r7 = r2.f45559V     // Catch:{ JSONException -> 0x09a8 }
            int r7 = r7.size()     // Catch:{ JSONException -> 0x09a8 }
            if (r7 <= 0) goto L_0x0319
            java.util.List<java.lang.Integer> r7 = r2.f45559V     // Catch:{ JSONException -> 0x09a8 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ JSONException -> 0x09a8 }
        L_0x02ea:
            boolean r10 = r7.hasNext()     // Catch:{ JSONException -> 0x09a8 }
            if (r10 == 0) goto L_0x0319
            java.lang.Object r10 = r7.next()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ JSONException -> 0x09a8 }
            int r11 = r10.intValue()     // Catch:{ JSONException -> 0x09a8 }
            r12 = 2
            if (r11 != r12) goto L_0x0308
            java.lang.String r10 = "iba"
            r11 = 1
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x02ea
        L_0x0308:
            int r10 = r10.intValue()     // Catch:{ JSONException -> 0x09a8 }
            r11 = 1
            if (r10 != r11) goto L_0x02ea
            java.lang.String r10 = "ina"
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r11)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r10, r12)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x02ea
        L_0x0319:
            com.google.android.gms.internal.ads.zzyz r7 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            boolean r7 = r7.f45807j     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x0329
            java.lang.String r7 = "ene"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0329:
            com.google.android.gms.internal.ads.zzabp r7 = r2.f45552O     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x0344
            java.lang.String r7 = "is_icon_ad"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "icon_ad_expansion_behavior"
            com.google.android.gms.internal.ads.zzabp r10 = r2.f45552O     // Catch:{ JSONException -> 0x09a8 }
            int r10 = r10.f45501a     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0344:
            com.google.android.gms.internal.ads.zzaks r7 = r2.f45569ae     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x0384
            java.lang.String r7 = "ia_var"
            com.google.android.gms.internal.ads.zzaks r10 = r2.f45569ae     // Catch:{ JSONException -> 0x09a8 }
            int r11 = r10.f45531a     // Catch:{ JSONException -> 0x09a8 }
            switch(r11) {
                case 1: goto L_0x0357;
                case 2: goto L_0x0354;
                default: goto L_0x0351;
            }     // Catch:{ JSONException -> 0x09a8 }
        L_0x0351:
            int r10 = r10.f45531a     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x035a
        L_0x0354:
            java.lang.String r10 = "p"
            goto L_0x0377
        L_0x0357:
            java.lang.String r10 = "l"
            goto L_0x0377
        L_0x035a:
            r11 = 52
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x09a8 }
            r12.<init>(r11)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "Instream ad video aspect ratio "
            r12.append(r11)     // Catch:{ JSONException -> 0x09a8 }
            r12.append(r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = " is wrong."
            r12.append(r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = r12.toString()     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.afm.m45779c(r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "l"
        L_0x0377:
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "instr"
            r10 = 1
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0384:
            java.lang.String r7 = "slotname"
            java.lang.String r10 = r2.f45575e     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "pn"
            android.content.pm.ApplicationInfo r10 = r2.f45576f     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = r10.packageName     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            android.content.pm.PackageInfo r7 = r2.f45577g     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x03a5
            java.lang.String r7 = "vc"
            android.content.pm.PackageInfo r10 = r2.f45577g     // Catch:{ JSONException -> 0x09a8 }
            int r10 = r10.versionCode     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x03a5:
            java.lang.String r7 = "ms"
            java.lang.String r10 = r1.f45259g     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "seq_num"
            java.lang.String r10 = r2.f45579i     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "session_id"
            java.lang.String r10 = r2.f45580j     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "js"
            com.google.android.gms.internal.ads.zzbgz r10 = r2.f45581k     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = r10.f45677a     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r10)     // Catch:{ JSONException -> 0x09a8 }
            android.os.Bundle r7 = r2.f45550M     // Catch:{ JSONException -> 0x09a8 }
            android.os.Bundle r10 = r1.f45254b     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "am"
            int r12 = r4.f45342a     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "cog"
            boolean r12 = r4.f45343b     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r12 = m52361a(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "coh"
            boolean r12 = r4.f45344c     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r12 = m52361a(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = r4.f45345d     // Catch:{ JSONException -> 0x09a8 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ JSONException -> 0x09a8 }
            if (r11 != 0) goto L_0x03f7
            java.lang.String r11 = "carrier"
            java.lang.String r12 = r4.f45345d     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09a8 }
        L_0x03f7:
            java.lang.String r11 = "gl"
            java.lang.String r12 = r4.f45346e     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09a8 }
            boolean r11 = r4.f45347f     // Catch:{ JSONException -> 0x09a8 }
            if (r11 == 0) goto L_0x040c
            java.lang.String r11 = "simulator"
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
        L_0x040c:
            java.lang.String r11 = "is_latchsky"
            boolean r12 = r4.f45348g     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r12)     // Catch:{ JSONException -> 0x09a8 }
            boolean r11 = r4.f45349h     // Catch:{ JSONException -> 0x09a8 }
            if (r11 == 0) goto L_0x0426
            java.lang.String r11 = "is_sidewinder"
            r12 = 1
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x0427
        L_0x0426:
            r12 = 1
        L_0x0427:
            java.lang.String r11 = "ma"
            boolean r13 = r4.f45350i     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r13 = m52361a(r13)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "sp"
            boolean r13 = r4.f45351j     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r13 = m52361a(r13)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "hl"
            java.lang.String r13 = r4.f45352k     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = r4.f45353l     // Catch:{ JSONException -> 0x09a8 }
            boolean r11 = android.text.TextUtils.isEmpty(r11)     // Catch:{ JSONException -> 0x09a8 }
            if (r11 != 0) goto L_0x0453
            java.lang.String r11 = "mv"
            java.lang.String r13 = r4.f45353l     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0453:
            java.lang.String r11 = "muv"
            int r13 = r4.f45355n     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
            int r11 = r4.f45356o     // Catch:{ JSONException -> 0x09a8 }
            r13 = -2
            if (r11 == r13) goto L_0x046e
            java.lang.String r11 = "cnt"
            int r13 = r4.f45356o     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
        L_0x046e:
            java.lang.String r11 = "gnt"
            int r13 = r4.f45357p     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "pt"
            int r13 = r4.f45358q     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "rm"
            int r13 = r4.f45359r     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r11 = "riv"
            int r13 = r4.f45360s     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r11, r13)     // Catch:{ JSONException -> 0x09a8 }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r11.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = "build_build"
            java.lang.String r14 = r4.f45339A     // Catch:{ JSONException -> 0x09a8 }
            r11.putString(r13, r14)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = "build_device"
            java.lang.String r14 = r4.f45340B     // Catch:{ JSONException -> 0x09a8 }
            r11.putString(r13, r14)     // Catch:{ JSONException -> 0x09a8 }
            android.os.Bundle r13 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r13.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r14 = "is_charging"
            boolean r15 = r4.f45365x     // Catch:{ JSONException -> 0x09a8 }
            r13.putBoolean(r14, r15)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r14 = "battery_level"
            r19 = r10
            double r9 = r4.f45364w     // Catch:{ JSONException -> 0x09a8 }
            r13.putDouble(r14, r9)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "battery"
            r11.putBundle(r9, r13)     // Catch:{ JSONException -> 0x09a8 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r9.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "active_network_state"
            int r13 = r4.f45367z     // Catch:{ JSONException -> 0x09a8 }
            r9.putInt(r10, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "active_network_metered"
            boolean r13 = r4.f45366y     // Catch:{ JSONException -> 0x09a8 }
            r9.putBoolean(r10, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "network"
            r11.putBundle(r10, r9)     // Catch:{ JSONException -> 0x09a8 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r9.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "is_browser_custom_tabs_capable"
            boolean r13 = r4.f45341C     // Catch:{ JSONException -> 0x09a8 }
            r9.putBoolean(r10, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "browser"
            r11.putBundle(r10, r9)     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x05ad
            java.lang.String r9 = "android_mem_info"
            android.os.Bundle r10 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r10.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = "runtime_free"
            java.lang.String r14 = "runtime_free_memory"
            r21 = r13
            r12 = -1
            long r14 = r7.getLong(r14, r12)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r14 = java.lang.Long.toString(r14)     // Catch:{ JSONException -> 0x09a8 }
            r15 = r21
            r10.putString(r15, r14)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r14 = "runtime_max"
            java.lang.String r15 = "runtime_max_memory"
            long r15 = r7.getLong(r15, r12)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r15 = java.lang.Long.toString(r15)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r14, r15)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r14 = "runtime_total"
            java.lang.String r15 = "runtime_total_memory"
            long r12 = r7.getLong(r15, r12)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = java.lang.Long.toString(r12)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r14, r12)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "web_view_count"
            java.lang.String r13 = "web_view_count"
            r14 = 0
            int r13 = r7.getInt(r13, r14)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "debug_memory_info"
            android.os.Parcelable r7 = r7.getParcelable(r12)     // Catch:{ JSONException -> 0x09a8 }
            android.os.Debug$MemoryInfo r7 = (android.os.Debug.MemoryInfo) r7     // Catch:{ JSONException -> 0x09a8 }
            if (r7 == 0) goto L_0x05a9
            java.lang.String r12 = "debug_info_dalvik_private_dirty"
            int r13 = r7.dalvikPrivateDirty     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "debug_info_dalvik_pss"
            int r13 = r7.dalvikPss     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "debug_info_dalvik_shared_dirty"
            int r13 = r7.dalvikSharedDirty     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "debug_info_native_private_dirty"
            int r13 = r7.nativePrivateDirty     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "debug_info_native_pss"
            int r13 = r7.nativePss     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "debug_info_native_shared_dirty"
            int r13 = r7.nativeSharedDirty     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "debug_info_other_private_dirty"
            int r13 = r7.otherPrivateDirty     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "debug_info_other_pss"
            int r13 = r7.otherPss     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r13)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r12 = "debug_info_other_shared_dirty"
            int r7 = r7.otherSharedDirty     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ JSONException -> 0x09a8 }
            r10.putString(r12, r7)     // Catch:{ JSONException -> 0x09a8 }
        L_0x05a9:
            r11.putBundle(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x05ae
        L_0x05ad:
            r14 = 0
        L_0x05ae:
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r7.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "parental_controls"
            r10 = r19
            r7.putBundle(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = r4.f45354m     // Catch:{ JSONException -> 0x09a8 }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x09a8 }
            if (r9 != 0) goto L_0x05c9
            java.lang.String r9 = "package_version"
            java.lang.String r10 = r4.f45354m     // Catch:{ JSONException -> 0x09a8 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x05c9:
            java.lang.String r9 = "play_store"
            r11.putBundle(r9, r7)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "device"
            r8.put(r7, r11)     // Catch:{ JSONException -> 0x09a8 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r7.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "doritos"
            java.lang.String r10 = r1.f45257e     // Catch:{ JSONException -> 0x09a8 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "doritos_v2"
            java.lang.String r10 = r1.f45258f     // Catch:{ JSONException -> 0x09a8 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r9 = com.google.android.gms.internal.ads.C15585bw.f43758aE     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bt r10 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Object r9 = r10.mo41272a(r9)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ JSONException -> 0x09a8 }
            boolean r9 = r9.booleanValue()     // Catch:{ JSONException -> 0x09a8 }
            if (r9 == 0) goto L_0x062f
            com.google.android.gms.ads.b.a$a r9 = r1.f45260h     // Catch:{ JSONException -> 0x09a8 }
            if (r9 == 0) goto L_0x0605
            com.google.android.gms.ads.b.a$a r9 = r1.f45260h     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = r9.f38079a     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.ads.b.a$a r10 = r1.f45260h     // Catch:{ JSONException -> 0x09a8 }
            boolean r10 = r10.f38080b     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x0607
        L_0x0605:
            r9 = 0
            r10 = 0
        L_0x0607:
            boolean r11 = android.text.TextUtils.isEmpty(r9)     // Catch:{ JSONException -> 0x09a8 }
            if (r11 != 0) goto L_0x061f
            java.lang.String r11 = "rdid"
            r7.putString(r11, r9)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "is_lat"
            r7.putBoolean(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "idtype"
            java.lang.String r10 = "adid"
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x062f
        L_0x061f:
            java.lang.String r9 = com.google.android.gms.internal.ads.afb.m45733b(r22)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "pdid"
            r7.putString(r10, r9)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "pdidtype"
            java.lang.String r10 = "ssaid"
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
        L_0x062f:
            java.lang.String r9 = "pii"
            r8.put(r9, r7)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "platform"
            java.lang.String r9 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r7 = "submodel"
            java.lang.String r9 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r7, r9)     // Catch:{ JSONException -> 0x09a8 }
            if (r3 == 0) goto L_0x0648
            m52366a(r8, r3)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x065c
        L_0x0648:
            com.google.android.gms.internal.ads.zzyv r3 = r2.f45573c     // Catch:{ JSONException -> 0x09a8 }
            int r3 = r3.f45777a     // Catch:{ JSONException -> 0x09a8 }
            r7 = 2
            if (r3 < r7) goto L_0x065c
            com.google.android.gms.internal.ads.zzyv r3 = r2.f45573c     // Catch:{ JSONException -> 0x09a8 }
            android.location.Location r3 = r3.f45787k     // Catch:{ JSONException -> 0x09a8 }
            if (r3 == 0) goto L_0x065c
            com.google.android.gms.internal.ads.zzyv r3 = r2.f45573c     // Catch:{ JSONException -> 0x09a8 }
            android.location.Location r3 = r3.f45787k     // Catch:{ JSONException -> 0x09a8 }
            m52366a(r8, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x065c:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r7 = 2
            if (r3 < r7) goto L_0x0668
            java.lang.String r3 = "quality_signals"
            android.os.Bundle r7 = r2.f45582l     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r7)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0668:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r7 = 4
            if (r3 < r7) goto L_0x067c
            boolean r3 = r2.f45586p     // Catch:{ JSONException -> 0x09a8 }
            if (r3 == 0) goto L_0x067c
            java.lang.String r3 = "forceHttps"
            boolean r7 = r2.f45586p     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r7)     // Catch:{ JSONException -> 0x09a8 }
        L_0x067c:
            if (r5 == 0) goto L_0x0683
            java.lang.String r3 = "content_info"
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0683:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r5 = 5
            if (r3 < r5) goto L_0x06aa
            java.lang.String r3 = "u_sd"
            float r4 = r2.f45589s     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r3 = "sh"
            int r4 = r2.f45588r     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r3 = "sw"
            int r4 = r2.f45587q     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x06cb
        L_0x06aa:
            java.lang.String r3 = "u_sd"
            float r5 = r4.f45361t     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r3 = "sh"
            int r5 = r4.f45363v     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r3 = "sw"
            int r4 = r4.f45362u     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09a8 }
        L_0x06cb:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r4 = 6
            if (r3 < r4) goto L_0x06f7
            java.lang.String r3 = r2.f45590t     // Catch:{ JSONException -> 0x09a8 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x09a8 }
            if (r3 != 0) goto L_0x06ec
            java.lang.String r3 = "view_hierarchy"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x06e5 }
            java.lang.String r5 = r2.f45590t     // Catch:{ JSONException -> 0x06e5 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x06e5 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x06e5 }
            goto L_0x06ec
        L_0x06e5:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = "Problem serializing view hierarchy to JSON"
            com.google.android.gms.internal.ads.acd.m45780c(r4, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x06ec:
            java.lang.String r3 = "correlation_id"
            long r4 = r2.f45591u     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09a8 }
        L_0x06f7:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r4 = 7
            if (r3 < r4) goto L_0x0703
            java.lang.String r3 = "request_id"
            java.lang.String r4 = r2.f45592v     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0703:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r4 = 12
            if (r3 < r4) goto L_0x0718
            java.lang.String r3 = r2.f45539B     // Catch:{ JSONException -> 0x09a8 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x09a8 }
            if (r3 != 0) goto L_0x0718
            java.lang.String r3 = "anchor"
            java.lang.String r4 = r2.f45539B     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0718:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r4 = 13
            if (r3 < r4) goto L_0x0729
            java.lang.String r3 = "android_app_volume"
            float r4 = r2.f45540C     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0729:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r4 = 18
            if (r3 < r4) goto L_0x073a
            java.lang.String r3 = "android_app_muted"
            boolean r5 = r2.f45546I     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09a8 }
        L_0x073a:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r5 = 14
            if (r3 < r5) goto L_0x074f
            int r3 = r2.f45541D     // Catch:{ JSONException -> 0x09a8 }
            if (r3 <= 0) goto L_0x074f
            java.lang.String r3 = "target_api"
            int r5 = r2.f45541D     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09a8 }
        L_0x074f:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r5 = 15
            if (r3 < r5) goto L_0x0767
            java.lang.String r3 = "scroll_index"
            int r5 = r2.f45542E     // Catch:{ JSONException -> 0x09a8 }
            r7 = -1
            if (r5 != r7) goto L_0x075d
            goto L_0x0760
        L_0x075d:
            int r11 = r2.f45542E     // Catch:{ JSONException -> 0x09a8 }
            r7 = r11
        L_0x0760:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0767:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r5 = 16
            if (r3 < r5) goto L_0x0778
            java.lang.String r3 = "_activity_context"
            boolean r5 = r2.f45543F     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0778:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            if (r3 < r4) goto L_0x07a3
            java.lang.String r3 = r2.f45547J     // Catch:{ JSONException -> 0x09a8 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x09a8 }
            if (r3 != 0) goto L_0x0798
            java.lang.String r3 = "app_settings"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0791 }
            java.lang.String r7 = r2.f45547J     // Catch:{ JSONException -> 0x0791 }
            r5.<init>(r7)     // Catch:{ JSONException -> 0x0791 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x0791 }
            goto L_0x0798
        L_0x0791:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Problem creating json from app settings"
            com.google.android.gms.internal.ads.acd.m45780c(r5, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0798:
            java.lang.String r3 = "render_in_browser"
            boolean r5 = r2.f45548K     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r5)     // Catch:{ JSONException -> 0x09a8 }
        L_0x07a3:
            int r3 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            if (r3 < r4) goto L_0x07b2
            java.lang.String r3 = "android_num_video_cache_tasks"
            int r4 = r2.f45549L     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r3, r4)     // Catch:{ JSONException -> 0x09a8 }
        L_0x07b2:
            com.google.android.gms.internal.ads.zzbgz r3 = r2.f45581k     // Catch:{ JSONException -> 0x09a8 }
            boolean r4 = r2.f45563Z     // Catch:{ JSONException -> 0x09a8 }
            boolean r1 = r1.f45264l     // Catch:{ JSONException -> 0x09a8 }
            boolean r5 = r2.f45566ab     // Catch:{ JSONException -> 0x09a8 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r7.<init>()     // Catch:{ JSONException -> 0x09a8 }
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r9.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "cl"
            java.lang.String r11 = "235029740"
            r9.putString(r10, r11)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "rapid_rc"
            java.lang.String r11 = "dev"
            r9.putString(r10, r11)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "rapid_rollup"
            java.lang.String r11 = "HEAD"
            r9.putString(r10, r11)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = "build_meta"
            r7.putBundle(r10, r9)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "mf"
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r10 = com.google.android.gms.internal.ads.C15585bw.f43816bJ     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bt r11 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Object r10 = r11.mo41272a(r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ JSONException -> 0x09a8 }
            boolean r10 = r10.booleanValue()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r10 = java.lang.Boolean.toString(r10)     // Catch:{ JSONException -> 0x09a8 }
            r7.putString(r9, r10)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r9 = "instant_app"
            r7.putBoolean(r9, r4)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r4 = "lite"
            boolean r3 = r3.f45681e     // Catch:{ JSONException -> 0x09a8 }
            r7.putBoolean(r4, r3)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r3 = "local_service"
            r7.putBoolean(r3, r1)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r1 = "is_privileged_process"
            r7.putBoolean(r1, r5)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r1 = "container_version"
            r3 = 12451009(0xbdfcc1, float:1.744758E-38)
            r7.putInt(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r1 = "sdk_env"
            r8.put(r1, r7)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r1 = "cache_state"
            r8.put(r1, r6)     // Catch:{ JSONException -> 0x09a8 }
            int r1 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r3 = 19
            if (r1 < r3) goto L_0x082c
            java.lang.String r1 = "gct"
            java.lang.String r3 = r2.f45551N     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x082c:
            int r1 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r3 = 21
            if (r1 < r3) goto L_0x083d
            boolean r1 = r2.f45553P     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x083d
            java.lang.String r1 = "de"
            java.lang.String r3 = "1"
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x083d:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15585bw.f43766aM     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bt r3 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Object r1 = r3.mo41272a(r1)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x09a8 }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x0883
            com.google.android.gms.internal.ads.zzyz r1 = r2.f45574d     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r1 = r1.f45798a     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r3 = "interstitial_mb"
            boolean r3 = r1.equals(r3)     // Catch:{ JSONException -> 0x09a8 }
            if (r3 != 0) goto L_0x0866
            java.lang.String r3 = "reward_mb"
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x0864
            goto L_0x0866
        L_0x0864:
            r1 = 0
            goto L_0x0867
        L_0x0866:
            r1 = 1
        L_0x0867:
            android.os.Bundle r3 = r2.f45554Q     // Catch:{ JSONException -> 0x09a8 }
            if (r3 == 0) goto L_0x086e
            r20 = 1
            goto L_0x0870
        L_0x086e:
            r20 = 0
        L_0x0870:
            if (r1 == 0) goto L_0x0883
            if (r20 == 0) goto L_0x0883
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x09a8 }
            r1.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r4 = "interstitial_pool"
            r1.putBundle(r4, r3)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r3 = "counters"
            r8.put(r3, r1)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0883:
            java.lang.String r1 = r2.f45555R     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x088e
            java.lang.String r1 = "gmp_app_id"
            java.lang.String r3 = r2.f45555R     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x088e:
            java.lang.String r1 = r2.f45556S     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x08b4
            java.lang.String r1 = "TIME_OUT"
            java.lang.String r3 = r2.f45556S     // Catch:{ JSONException -> 0x09a8 }
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x08ac
            java.lang.String r1 = "sai_timeout"
            com.google.android.gms.internal.ads.bl<java.lang.Long> r3 = com.google.android.gms.internal.ads.C15585bw.f43790ak     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bt r4 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Object r3 = r4.mo41272a(r3)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x08bb
        L_0x08ac:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = r2.f45556S     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x08bb
        L_0x08b4:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = ""
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x08bb:
            java.lang.String r1 = r2.f45557T     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x08c6
            java.lang.String r1 = "fbs_aeid"
            java.lang.String r3 = r2.f45557T     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x08c6:
            java.lang.String r1 = r2.f45570af     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x08d1
            java.lang.String r1 = "apm_id_origin"
            java.lang.String r3 = r2.f45570af     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x08d1:
            int r1 = r2.f45564a     // Catch:{ JSONException -> 0x09a8 }
            r3 = 24
            if (r1 < r3) goto L_0x08e2
            java.lang.String r1 = "disable_ml"
            boolean r3 = r2.f45565aa     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x08e2:
            com.google.android.gms.internal.ads.bl<java.lang.String> r1 = com.google.android.gms.internal.ads.C15585bw.f43733G     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bt r3 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Object r1 = r3.mo41272a(r1)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x0929
            boolean r3 = r1.isEmpty()     // Catch:{ JSONException -> 0x09a8 }
            if (r3 != 0) goto L_0x0929
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bl<java.lang.Integer> r4 = com.google.android.gms.internal.ads.C15585bw.f43734H     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bt r5 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Object r4 = r5.mo41272a(r4)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ JSONException -> 0x09a8 }
            int r4 = r4.intValue()     // Catch:{ JSONException -> 0x09a8 }
            if (r3 < r4) goto L_0x0929
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ JSONException -> 0x09a8 }
            r3.<init>()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r4 = ","
            java.lang.String[] r1 = r1.split(r4)     // Catch:{ JSONException -> 0x09a8 }
            int r4 = r1.length     // Catch:{ JSONException -> 0x09a8 }
        L_0x0916:
            if (r14 >= r4) goto L_0x0924
            r5 = r1[r14]     // Catch:{ JSONException -> 0x09a8 }
            java.util.List r6 = com.google.android.gms.internal.ads.aez.m45711a(r5)     // Catch:{ JSONException -> 0x09a8 }
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x09a8 }
            int r14 = r14 + 1
            goto L_0x0916
        L_0x0924:
            java.lang.String r1 = "video_decoders"
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0929:
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C15585bw.f43874cO     // Catch:{ JSONException -> 0x09a8 }
            com.google.android.gms.internal.ads.bt r3 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Object r1 = r3.mo41272a(r1)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x09a8 }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x094a
            java.lang.String r1 = "omid_v"
            com.google.android.gms.internal.ads.ru r3 = com.google.android.gms.ads.internal.C14793ay.m42909o()     // Catch:{ JSONException -> 0x09a8 }
            r4 = r22
            java.lang.String r3 = r3.mo41960b(r4)     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x094a:
            java.util.ArrayList<java.lang.String> r1 = r2.f45567ac     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x095d
            java.util.ArrayList<java.lang.String> r1 = r2.f45567ac     // Catch:{ JSONException -> 0x09a8 }
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x09a8 }
            if (r1 != 0) goto L_0x095d
            java.lang.String r1 = "android_permissions"
            java.util.ArrayList<java.lang.String> r3 = r2.f45567ac     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x095d:
            java.lang.String r1 = r2.f45568ad     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x0968
            java.lang.String r1 = "consent_string"
            java.lang.String r3 = r2.f45568ad     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0968:
            java.lang.String r1 = r2.f45568ad     // Catch:{ JSONException -> 0x09a8 }
            if (r1 == 0) goto L_0x0973
            java.lang.String r1 = "iab_consent_info"
            android.os.Bundle r2 = r2.f45571ag     // Catch:{ JSONException -> 0x09a8 }
            r8.put(r1, r2)     // Catch:{ JSONException -> 0x09a8 }
        L_0x0973:
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.acd.m45776a(r1)     // Catch:{ JSONException -> 0x09a8 }
            if (r2 == 0) goto L_0x099f
            com.google.android.gms.internal.ads.acl r2 = com.google.android.gms.ads.internal.C14793ay.m42895a()     // Catch:{ JSONException -> 0x09a8 }
            org.json.JSONObject r2 = r2.mo39170a(r8)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r1 = r2.toString(r1)     // Catch:{ JSONException -> 0x09a8 }
            java.lang.String r2 = "Ad Request JSON: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ JSONException -> 0x09a8 }
            int r3 = r1.length()     // Catch:{ JSONException -> 0x09a8 }
            if (r3 == 0) goto L_0x0997
            java.lang.String r1 = r2.concat(r1)     // Catch:{ JSONException -> 0x09a8 }
            goto L_0x099c
        L_0x0997:
            java.lang.String r1 = new java.lang.String     // Catch:{ JSONException -> 0x09a8 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x09a8 }
        L_0x099c:
            com.google.android.gms.internal.ads.acd.m45438a(r1)     // Catch:{ JSONException -> 0x09a8 }
        L_0x099f:
            com.google.android.gms.internal.ads.acl r1 = com.google.android.gms.ads.internal.C14793ay.m42895a()     // Catch:{ JSONException -> 0x09a8 }
            org.json.JSONObject r1 = r1.mo39170a(r8)     // Catch:{ JSONException -> 0x09a8 }
            return r1
        L_0x09a8:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "Problem serializing ad request to JSON: "
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x09bf
            java.lang.String r1 = r2.concat(r1)
            goto L_0x09c4
        L_0x09bf:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x09c4:
            com.google.android.gms.internal.ads.acd.m45783e(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16160xd.m52364a(android.content.Context, com.google.android.gms.internal.ads.wv):org.json.JSONObject");
    }

    /* renamed from: a */
    private static void m52366a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* renamed from: a */
    private static Integer m52361a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0152 A[Catch:{ JSONException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015b A[Catch:{ JSONException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0236 A[Catch:{ JSONException -> 0x028f }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x023f A[Catch:{ JSONException -> 0x028f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaxi m52360a(android.content.Context r57, com.google.android.gms.internal.ads.zzaxe r58, java.lang.String r59) {
        /*
            r0 = r58
            r15 = 0
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x028f }
            r1 = r59
            r10.<init>(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "ad_base_url"
            r11 = 0
            java.lang.String r1 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r2 = "ad_url"
            java.lang.String r4 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r2 = "ad_size"
            java.lang.String r13 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r2 = "ad_slot_size"
            java.lang.String r40 = r10.optString(r2, r13)     // Catch:{ JSONException -> 0x028f }
            r12 = 1
            if (r0 == 0) goto L_0x002d
            int r2 = r0.f45583m     // Catch:{ JSONException -> 0x028f }
            if (r2 == 0) goto L_0x002d
            r24 = 1
            goto L_0x002f
        L_0x002d:
            r24 = 0
        L_0x002f:
            java.lang.String r2 = "ad_json"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
            if (r2 != 0) goto L_0x003d
            java.lang.String r2 = "ad_html"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
        L_0x003d:
            if (r2 != 0) goto L_0x0045
            java.lang.String r2 = "body"
            java.lang.String r2 = r10.optString(r2, r11)     // Catch:{ JSONException -> 0x028f }
        L_0x0045:
            if (r2 != 0) goto L_0x0053
            java.lang.String r3 = "ads"
            boolean r3 = r10.has(r3)     // Catch:{ JSONException -> 0x028f }
            if (r3 == 0) goto L_0x0053
            java.lang.String r2 = r10.toString()     // Catch:{ JSONException -> 0x028f }
        L_0x0053:
            java.lang.String r3 = "debug_dialog"
            java.lang.String r19 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r3 = "debug_signals"
            java.lang.String r42 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r3 = "interstitial_timeout"
            boolean r3 = r10.has(r3)     // Catch:{ JSONException -> 0x028f }
            r8 = -1
            if (r3 == 0) goto L_0x007a
            java.lang.String r3 = "interstitial_timeout"
            double r5 = r10.getDouble(r3)     // Catch:{ JSONException -> 0x028f }
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r5 = r5 * r16
            long r5 = (long) r5     // Catch:{ JSONException -> 0x028f }
            r16 = r5
            goto L_0x007c
        L_0x007a:
            r16 = r8
        L_0x007c:
            java.lang.String r3 = "orientation"
            java.lang.String r3 = r10.optString(r3, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r5 = "portrait"
            boolean r5 = r5.equals(r3)     // Catch:{ JSONException -> 0x028f }
            r14 = -1
            if (r5 == 0) goto L_0x008f
            r3 = 7
            r18 = 7
            goto L_0x009d
        L_0x008f:
            java.lang.String r5 = "landscape"
            boolean r3 = r5.equals(r3)     // Catch:{ JSONException -> 0x028f }
            if (r3 == 0) goto L_0x009b
            r3 = 6
            r18 = 6
            goto L_0x009d
        L_0x009b:
            r18 = -1
        L_0x009d:
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ JSONException -> 0x028f }
            if (r3 == 0) goto L_0x00cb
            boolean r3 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x028f }
            if (r3 != 0) goto L_0x00cb
            com.google.android.gms.internal.ads.zzbgz r1 = r0.f45581k     // Catch:{ JSONException -> 0x028f }
            java.lang.String r3 = r1.f45677a     // Catch:{ JSONException -> 0x028f }
            r5 = 0
            r6 = 0
            r7 = 0
            r20 = 0
            r21 = 0
            r1 = r58
            r2 = r57
            r8 = r20
            r9 = r21
            com.google.android.gms.internal.ads.zzaxi r1 = com.google.android.gms.internal.ads.C16153wx.m52335a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r2 = r1.f45623a     // Catch:{ JSONException -> 0x028f }
            java.lang.String r3 = r1.f45625b     // Catch:{ JSONException -> 0x028f }
            long r4 = r1.f45636m     // Catch:{ JSONException -> 0x028f }
            r20 = r4
            r4 = r3
            r3 = r2
            goto L_0x00d0
        L_0x00cb:
            r3 = r1
            r4 = r2
            r1 = r11
            r20 = -1
        L_0x00d0:
            if (r4 != 0) goto L_0x00d8
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ JSONException -> 0x028f }
            r0.<init>(r15)     // Catch:{ JSONException -> 0x028f }
            return r0
        L_0x00d8:
            java.lang.String r2 = "click_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 != 0) goto L_0x00e2
            r5 = r11
            goto L_0x00e4
        L_0x00e2:
            java.util.List<java.lang.String> r5 = r1.f45626c     // Catch:{ JSONException -> 0x028f }
        L_0x00e4:
            if (r2 == 0) goto L_0x00eb
            java.util.List r2 = m52362a(r2, r5)     // Catch:{ JSONException -> 0x028f }
            r5 = r2
        L_0x00eb:
            java.lang.String r2 = "impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 != 0) goto L_0x00f5
            r6 = r11
            goto L_0x00f7
        L_0x00f5:
            java.util.List<java.lang.String> r6 = r1.f45628e     // Catch:{ JSONException -> 0x028f }
        L_0x00f7:
            if (r2 == 0) goto L_0x00fe
            java.util.List r2 = m52362a(r2, r6)     // Catch:{ JSONException -> 0x028f }
            r6 = r2
        L_0x00fe:
            java.lang.String r2 = "downloaded_impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 != 0) goto L_0x0108
            r7 = r11
            goto L_0x010a
        L_0x0108:
            java.util.List<java.lang.String> r7 = r1.f45614R     // Catch:{ JSONException -> 0x028f }
        L_0x010a:
            if (r2 == 0) goto L_0x0113
            java.util.List r2 = m52362a(r2, r7)     // Catch:{ JSONException -> 0x028f }
            r48 = r2
            goto L_0x0115
        L_0x0113:
            r48 = r7
        L_0x0115:
            java.lang.String r2 = "manual_impression_urls"
            org.json.JSONArray r2 = r10.optJSONArray(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 != 0) goto L_0x011f
            r7 = r11
            goto L_0x0121
        L_0x011f:
            java.util.List<java.lang.String> r7 = r1.f45632i     // Catch:{ JSONException -> 0x028f }
        L_0x0121:
            if (r2 == 0) goto L_0x012a
            java.util.List r2 = m52362a(r2, r7)     // Catch:{ JSONException -> 0x028f }
            r22 = r2
            goto L_0x012c
        L_0x012a:
            r22 = r7
        L_0x012c:
            if (r1 == 0) goto L_0x0142
            int r2 = r1.f45634k     // Catch:{ JSONException -> 0x028f }
            if (r2 == r14) goto L_0x0136
            int r2 = r1.f45634k     // Catch:{ JSONException -> 0x028f }
            r18 = r2
        L_0x0136:
            long r7 = r1.f45629f     // Catch:{ JSONException -> 0x028f }
            r25 = 0
            int r2 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x0142
            long r1 = r1.f45629f     // Catch:{ JSONException -> 0x028f }
            r7 = r1
            goto L_0x0144
        L_0x0142:
            r7 = r16
        L_0x0144:
            java.lang.String r1 = "active_view"
            java.lang.String r23 = r10.optString(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "ad_is_javascript"
            boolean r25 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            if (r25 == 0) goto L_0x015b
            java.lang.String r1 = "ad_passback_url"
            java.lang.String r1 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x028f }
            r26 = r1
            goto L_0x015d
        L_0x015b:
            r26 = r11
        L_0x015d:
            java.lang.String r1 = "mediation"
            boolean r9 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "custom_render_allowed"
            boolean r27 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "content_url_opted_out"
            boolean r28 = r10.optBoolean(r1, r12)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "content_vertical_opted_out"
            boolean r43 = r10.optBoolean(r1, r12)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "prefetch"
            boolean r29 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "refresh_interval_milliseconds"
            r56 = r13
            r12 = -1
            long r16 = r10.optLong(r1, r12)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "mediation_config_cache_time_milliseconds"
            long r12 = r10.optLong(r1, r12)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "gws_query_id"
            java.lang.String r2 = ""
            java.lang.String r30 = r10.optString(r1, r2)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "height"
            java.lang.String r2 = "fluid"
            java.lang.String r14 = ""
            java.lang.String r2 = r10.optString(r2, r14)     // Catch:{ JSONException -> 0x028f }
            boolean r31 = r1.equals(r2)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "native_express"
            boolean r32 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "video_start_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x028f }
            java.util.List r33 = m52362a(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "video_complete_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x028f }
            java.util.List r34 = m52362a(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "rewards"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x028f }
            com.google.android.gms.internal.ads.zzbaz r35 = com.google.android.gms.internal.ads.zzbaz.m52671a(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "use_displayed_impression"
            boolean r36 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "auto_protection_configuration"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x028f }
            com.google.android.gms.internal.ads.zzaxk r37 = com.google.android.gms.internal.ads.zzaxk.m52666a(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "set_cookie"
            java.lang.String r2 = ""
            java.lang.String r38 = r10.optString(r1, r2)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "remote_ping_urls"
            org.json.JSONArray r1 = r10.optJSONArray(r1)     // Catch:{ JSONException -> 0x028f }
            java.util.List r39 = m52362a(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "safe_browsing"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x028f }
            com.google.android.gms.internal.ads.zzbbq r41 = com.google.android.gms.internal.ads.zzbbq.m52672a(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "render_in_browser"
            boolean r2 = r0.f45548K     // Catch:{ JSONException -> 0x028f }
            boolean r44 = r10.optBoolean(r1, r2)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "custom_close_blocked"
            boolean r45 = r10.optBoolean(r1)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "enable_omid"
            boolean r47 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "omid_settings"
            java.lang.String r50 = r10.optString(r1, r11)     // Catch:{ JSONException -> 0x028f }
            java.lang.String r1 = "disable_closable_area"
            boolean r49 = r10.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x028f }
            com.google.android.gms.internal.ads.zzyv r1 = r0.f45573c     // Catch:{ JSONException -> 0x028f }
            android.os.Bundle r1 = r1.f45789m     // Catch:{ JSONException -> 0x028f }
            java.lang.Class<com.google.ads.mediation.admob.AdMobAdapter> r2 = com.google.ads.mediation.admob.AdMobAdapter.class
            java.lang.String r2 = r2.getName()     // Catch:{ JSONException -> 0x028f }
            android.os.Bundle r1 = r1.getBundle(r2)     // Catch:{ JSONException -> 0x028f }
            if (r1 == 0) goto L_0x022c
            java.lang.String r2 = "is_analytics_logging_enabled"
            boolean r1 = r1.getBoolean(r2, r15)     // Catch:{ JSONException -> 0x028f }
            if (r1 == 0) goto L_0x022c
            r52 = 1
            goto L_0x022e
        L_0x022c:
            r52 = 0
        L_0x022e:
            java.lang.String r1 = "creative_configuration"
            org.json.JSONObject r1 = r10.optJSONObject(r1)     // Catch:{ JSONException -> 0x028f }
            if (r1 == 0) goto L_0x023f
            java.lang.String r2 = "scroll_aware"
            boolean r1 = r1.optBoolean(r2, r15)     // Catch:{ JSONException -> 0x028f }
            r53 = r1
            goto L_0x0241
        L_0x023f:
            r53 = 0
        L_0x0241:
            com.google.android.gms.internal.ads.zzaxi r54 = new com.google.android.gms.internal.ads.zzaxi     // Catch:{ JSONException -> 0x028f }
            boolean r14 = r0.f45586p     // Catch:{ JSONException -> 0x028f }
            boolean r10 = r0.f45544G     // Catch:{ JSONException -> 0x028f }
            boolean r11 = r0.f45558U     // Catch:{ JSONException -> 0x028f }
            r46 = 0
            java.lang.String r51 = ""
            r1 = r54
            r2 = r58
            r0 = r10
            r55 = r11
            r10 = r12
            r12 = r22
            r22 = r56
            r56 = r14
            r13 = r16
            r15 = r18
            r16 = r22
            r17 = r20
            r20 = r25
            r21 = r26
            r22 = r23
            r23 = r27
            r25 = r56
            r26 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r30 = r32
            r31 = r35
            r32 = r33
            r33 = r34
            r34 = r36
            r35 = r37
            r36 = r0
            r37 = r38
            r38 = r39
            r39 = r44
            r44 = r55
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ JSONException -> 0x028f }
            return r54
        L_0x028f:
            r0 = move-exception
            java.lang.String r1 = "Could not parse the inline ad response: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x02a5
            java.lang.String r0 = r1.concat(r0)
            goto L_0x02aa
        L_0x02a5:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x02aa:
            com.google.android.gms.internal.ads.acd.m45783e(r0)
            com.google.android.gms.internal.ads.zzaxi r0 = new com.google.android.gms.internal.ads.zzaxi
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16160xd.m52360a(android.content.Context, com.google.android.gms.internal.ads.zzaxe, java.lang.String):com.google.android.gms.internal.ads.zzaxi");
    }

    /* renamed from: a */
    private static List<String> m52362a(JSONArray jSONArray, List<String> list) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    /* renamed from: a */
    public static JSONObject m52365a(zzaxi zzaxi) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (zzaxi.f45623a != null) {
            jSONObject.put("ad_base_url", zzaxi.f45623a);
        }
        if (zzaxi.f45635l != null) {
            jSONObject.put("ad_size", zzaxi.f45635l);
        }
        jSONObject.put("native", zzaxi.f45642s);
        if (zzaxi.f45642s) {
            jSONObject.put("ad_json", zzaxi.f45625b);
        } else {
            jSONObject.put("ad_html", zzaxi.f45625b);
        }
        if (zzaxi.f45637n != null) {
            jSONObject.put("debug_dialog", zzaxi.f45637n);
        }
        if (zzaxi.f45608L != null) {
            jSONObject.put("debug_signals", zzaxi.f45608L);
        }
        if (zzaxi.f45629f != -1) {
            double d = (double) zzaxi.f45629f;
            Double.isNaN(d);
            jSONObject.put("interstitial_timeout", d / 1000.0d);
        }
        if (zzaxi.f45634k == 7) {
            jSONObject.put("orientation", "portrait");
        } else if (zzaxi.f45634k == 6) {
            jSONObject.put("orientation", "landscape");
        }
        if (zzaxi.f45626c != null) {
            jSONObject.put("click_urls", m52363a(zzaxi.f45626c));
        }
        if (zzaxi.f45628e != null) {
            jSONObject.put("impression_urls", m52363a(zzaxi.f45628e));
        }
        if (zzaxi.f45614R != null) {
            jSONObject.put("downloaded_impression_urls", m52363a(zzaxi.f45614R));
        }
        if (zzaxi.f45632i != null) {
            jSONObject.put("manual_impression_urls", m52363a(zzaxi.f45632i));
        }
        if (zzaxi.f45640q != null) {
            jSONObject.put("active_view", zzaxi.f45640q);
        }
        jSONObject.put("ad_is_javascript", zzaxi.f45638o);
        if (zzaxi.f45639p != null) {
            jSONObject.put("ad_passback_url", zzaxi.f45639p);
        }
        jSONObject.put("mediation", zzaxi.f45630g);
        jSONObject.put("custom_render_allowed", zzaxi.f45641r);
        jSONObject.put("content_url_opted_out", zzaxi.f45644u);
        jSONObject.put("content_vertical_opted_out", zzaxi.f45609M);
        jSONObject.put("prefetch", zzaxi.f45645v);
        if (zzaxi.f45633j != -1) {
            jSONObject.put("refresh_interval_milliseconds", zzaxi.f45633j);
        }
        if (zzaxi.f45631h != -1) {
            jSONObject.put("mediation_config_cache_time_milliseconds", zzaxi.f45631h);
        }
        if (!TextUtils.isEmpty(zzaxi.f45647x)) {
            jSONObject.put("gws_query_id", zzaxi.f45647x);
        }
        jSONObject.put("fluid", zzaxi.f45648y ? "height" : "");
        jSONObject.put("native_express", zzaxi.f45649z);
        if (zzaxi.f45598B != null) {
            jSONObject.put("video_start_urls", m52363a(zzaxi.f45598B));
        }
        if (zzaxi.f45599C != null) {
            jSONObject.put("video_complete_urls", m52363a(zzaxi.f45599C));
        }
        if (zzaxi.f45597A != null) {
            zzbaz zzbaz = zzaxi.f45597A;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("rb_type", zzbaz.f45667a);
            jSONObject2.put("rb_amount", zzbaz.f45668b);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject2);
            jSONObject.put("rewards", jSONArray);
        }
        jSONObject.put("use_displayed_impression", zzaxi.f45600D);
        jSONObject.put("auto_protection_configuration", zzaxi.f45601E);
        jSONObject.put("render_in_browser", zzaxi.f45605I);
        jSONObject.put("disable_closable_area", zzaxi.f45615S);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("scroll_aware", zzaxi.f45619W);
        jSONObject.put("creative_configuration", jSONObject3);
        return jSONObject;
    }

    /* renamed from: a */
    private static JSONArray m52363a(List<String> list) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }
}
