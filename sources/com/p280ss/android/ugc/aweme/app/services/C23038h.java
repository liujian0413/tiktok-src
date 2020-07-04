package com.p280ss.android.ugc.aweme.app.services;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.services.h */
public class C23038h {

    /* renamed from: a */
    private static C23038h f60802a;

    /* renamed from: b */
    private JSONObject f60803b;

    private C23038h(Context context) {
        String a = m75715a(context, "assets-map/aweme.json");
        if (!TextUtils.isEmpty(a)) {
            try {
                this.f60803b = new JSONObject(a);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public static C23038h m75714a(Context context) {
        if (f60802a == null) {
            synchronized (C23038h.class) {
                if (f60802a == null) {
                    f60802a = new C23038h(context);
                }
            }
        }
        return f60802a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028 A[SYNTHETIC, Splitter:B:14:0x0028] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f A[SYNTHETIC, Splitter:B:22:0x002f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m75715a(android.content.Context r3, java.lang.String r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.services.C23038h.m75715a(android.content.Context, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public final int mo60009a(String str, int i) {
        if (!TextUtils.isEmpty(str) && this.f60803b != null) {
            return this.f60803b.optInt(str, 0);
        }
        return 0;
    }

    /* renamed from: a */
    public final String mo60010a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && this.f60803b != null) {
            return this.f60803b.optString(str, str2);
        }
        return null;
    }
}
