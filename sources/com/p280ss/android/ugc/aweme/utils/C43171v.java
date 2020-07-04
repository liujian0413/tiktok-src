package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.utils.v */
public class C43171v {

    /* renamed from: c */
    private static C43171v f111799c;

    /* renamed from: a */
    public boolean f111800a;

    /* renamed from: b */
    public JSONObject f111801b;

    /* renamed from: a */
    public static C43171v m136920a() {
        if (f111799c == null) {
            synchronized (C43171v.class) {
                if (f111799c == null) {
                    f111799c = new C43171v();
                }
            }
        }
        return f111799c;
    }

    /* renamed from: a */
    public final void mo104784a(final Context context) {
        if (context != null && this.f111801b == null) {
            new Thread(new Runnable() {
                public final void run() {
                    String a = C43171v.m136921a(context.getApplicationContext(), "ttnet_config.json");
                    if (!TextUtils.isEmpty(a)) {
                        try {
                            C43171v.this.f111801b = new JSONObject(a);
                            C43171v.this.f111800a = C43171v.this.f111801b.optBoolean("boe_proxy_enabled", false);
                        } catch (JSONException unused) {
                        }
                    }
                }
            }).start();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[SYNTHETIC, Splitter:B:14:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[SYNTHETIC, Splitter:B:22:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m136921a(android.content.Context r3, java.lang.String r4) {
        /*
            r0 = 0
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ IOException -> 0x002c, all -> 0x0024 }
            java.io.InputStream r3 = r3.open(r4)     // Catch:{ IOException -> 0x002c, all -> 0x0024 }
            int r4 = r3.available()     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            byte[] r4 = new byte[r4]     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            r3.read(r4)     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            r3.close()     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            java.lang.String r2 = "utf-8"
            r1.<init>(r4, r2)     // Catch:{ IOException -> 0x002d, all -> 0x0022 }
            if (r3 == 0) goto L_0x0021
            r3.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            return r1
        L_0x0022:
            r4 = move-exception
            goto L_0x0026
        L_0x0024:
            r4 = move-exception
            r3 = r0
        L_0x0026:
            if (r3 == 0) goto L_0x002b
            r3.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            throw r4
        L_0x002c:
            r3 = r0
        L_0x002d:
            if (r3 == 0) goto L_0x0032
            r3.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C43171v.m136921a(android.content.Context, java.lang.String):java.lang.String");
    }
}
