package com.p280ss.android.newmedia.p891a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.ApkUtil;
import java.util.Properties;
import org.json.JSONObject;

/* renamed from: com.ss.android.newmedia.a.c */
public class C19923c {

    /* renamed from: c */
    private static C19923c f54003c;

    /* renamed from: a */
    private Properties f54004a = new Properties();

    /* renamed from: b */
    private JSONObject f54005b;

    /* renamed from: c */
    private static String m65740c(Context context) {
        String str;
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            str = applicationInfo.sourceDir;
            return str;
        } catch (Throwable unused) {
            str = null;
        }
    }

    /* renamed from: a */
    public static C19923c m65736a(Context context) {
        if (f54003c == null) {
            synchronized (C19923c.class) {
                if (f54003c == null) {
                    f54003c = new C19923c(context);
                }
            }
        }
        return f54003c;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C19923c(android.content.Context r3) {
        /*
            r2 = this;
            r2.<init>()
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r2.f54004a = r0
            org.json.JSONObject r0 = r2.m65739b(r3)     // Catch:{ Exception -> 0x0010 }
            r2.f54005b = r0     // Catch:{ Exception -> 0x0010 }
        L_0x0010:
            java.util.Properties r0 = r2.f54004a     // Catch:{ Exception -> 0x0020 }
            android.content.res.AssetManager r3 = r3.getAssets()     // Catch:{ Exception -> 0x0020 }
            java.lang.String r1 = "ss.properties"
            java.io.InputStream r3 = r3.open(r1)     // Catch:{ Exception -> 0x0020 }
            r0.load(r3)     // Catch:{ Exception -> 0x0020 }
            return
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.newmedia.p891a.C19923c.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    private Object m65737a(String str) {
        Object obj;
        try {
            if (this.f54005b != null) {
                obj = this.f54005b.get(str);
            } else if (this.f54004a == null || !this.f54004a.containsKey(str)) {
                obj = null;
            } else {
                obj = this.f54004a.get(str);
            }
            return obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private JSONObject m65739b(Context context) {
        try {
            String a = ApkUtil.m19911a(m65740c(context), 1903654775);
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            if (!m65738a(jSONObject)) {
                return null;
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m65738a(JSONObject jSONObject) {
        try {
            if (!TextUtils.isEmpty(jSONObject.getString("meta_umeng_channel"))) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final String mo53429a(String str, String str2) {
        Object a = m65737a(str);
        if (!(a instanceof String)) {
            return str2;
        }
        return (String) a;
    }
}
