package com.p280ss.android.ugc.aweme.miniapp_api;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p1843tt.miniapphost.entity.MicroSchemaEntity.Builder;
import com.p1843tt.miniapphost.entity.MicroSchemaEntity.Host;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.f */
public final class C33447f {

    /* renamed from: a */
    private static final String f87290a;

    /* renamed from: b */
    private static final String f87291b;

    static {
        if (C6399b.m19946v()) {
            f87290a = "snssdk1233://microapp?";
            f87291b = "snssdk1233://microgame?";
        } else if (C6399b.m19947w()) {
            f87290a = "snssdk1180://microapp?";
            f87291b = "snssdk1180://microgame?";
        } else {
            f87290a = "snssdk1128://microapp?";
            f87291b = "snssdk1128://microgame?";
        }
    }

    /* renamed from: a */
    public static String m108185a(MicroAppInfo microAppInfo) {
        if (microAppInfo == null) {
            return "";
        }
        return microAppInfo.getSchema();
    }

    /* renamed from: f */
    private static boolean m108193f(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m108186a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Uri.parse(str).getQueryParameter("app_id");
    }

    /* renamed from: c */
    public static boolean m108190c(String str) {
        if (!m108193f(str)) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), "microapp");
    }

    /* renamed from: e */
    public static boolean m108192e(String str) {
        if (!m108193f(str)) {
            return false;
        }
        return TextUtils.equals(Uri.parse(str).getHost(), "microgame");
    }

    /* renamed from: b */
    public static boolean m108189b(String str) {
        if (!m108193f(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m108191d(String str) {
        if (!m108193f(str)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.equals(host, "microapp") || TextUtils.equals(host, "microgame")) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m108188a(java.lang.String r4, java.lang.String r5, boolean r6, java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L_0x0024
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ Exception -> 0x0023 }
            r2.<init>()     // Catch:{ Exception -> 0x0023 }
            java.lang.String r3 = "web_url"
            r2.put(r3, r7)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r7 = "other_open"
            r0.put(r7, r2)     // Catch:{ Exception -> 0x0023 }
            goto L_0x0024
        L_0x0023:
        L_0x0024:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 != 0) goto L_0x0035
            java.lang.String r7 = "UTF-8"
            java.lang.String r4 = java.net.URLDecoder.decode(r4, r7)     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ UnsupportedEncodingException -> 0x0035 }
            goto L_0x0036
        L_0x0035:
            r4 = r1
        L_0x0036:
            if (r6 == 0) goto L_0x003b
            java.lang.String r6 = "microgame"
            goto L_0x003d
        L_0x003b:
            java.lang.String r6 = "microapp"
        L_0x003d:
            if (r4 != 0) goto L_0x0042
            java.lang.String r7 = ""
            goto L_0x0046
        L_0x0042:
            java.lang.String r7 = r4.getPath()
        L_0x0046:
            java.util.HashMap r4 = com.p280ss.android.ugc.aweme.miniapp_api.C33434b.m108097a(r4)
            java.lang.String r4 = m108187a(r6, r5, r7, r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.miniapp_api.C33447f.m108188a(java.lang.String, java.lang.String, boolean, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m108187a(String str, String str2, String str3, HashMap<String, Object> hashMap, HashMap<String, Object> hashMap2) {
        Host host;
        Builder builder = new Builder();
        if (str == "microapp") {
            host = Host.MICROAPP;
        } else {
            host = Host.MICROGAME;
        }
        return builder.host(host).appId(str2).path(str3).query(hashMap).customFields(hashMap2).build().toSchema();
    }
}
