package com.bytedance.ies.ugc.appcontext;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.util.Properties;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.ugc.appcontext.e */
class C6410e {

    /* renamed from: d */
    private static C6410e f18752d;

    /* renamed from: a */
    private Properties f18753a;

    /* renamed from: b */
    private JSONObject f18754b;

    /* renamed from: c */
    private Context f18755c;

    /* renamed from: a */
    private void m19994a() {
        if (this.f18753a == null) {
            this.f18753a = new Properties();
            try {
                this.f18753a.load(this.f18755c.getAssets().open("ss.properties"));
            } catch (Exception unused) {
            }
        }
    }

    private C6410e(Context context) {
        this.f18755c = context;
        try {
            this.f18754b = m19996b(context);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private static String m19997c(Context context) {
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
    public static C6410e m19992a(Context context) {
        if (f18752d == null) {
            synchronized (C6410e.class) {
                if (f18752d == null) {
                    f18752d = new C6410e(context);
                }
            }
        }
        return f18752d;
    }

    /* renamed from: a */
    private Object m19993a(String str) {
        Object obj = null;
        try {
            if (this.f18754b != null) {
                obj = this.f18754b.get(str);
            }
        } catch (Throwable unused) {
        }
        if (obj != null) {
            return obj;
        }
        try {
            m19994a();
            if (this.f18753a != null && this.f18753a.containsKey(str)) {
                obj = this.f18753a.get(str);
            }
        } catch (Throwable unused2) {
        }
        return obj;
    }

    /* renamed from: b */
    private JSONObject m19996b(Context context) {
        try {
            String a = ApkUtil.m19911a(m19997c(context), 1903654775);
            if (TextUtils.isEmpty(a)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            if (!m19995a(jSONObject)) {
                return null;
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m19995a(JSONObject jSONObject) {
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
    public final String mo15357a(String str, String str2) {
        Object a = m19993a(str);
        if (!(a instanceof String)) {
            return str2;
        }
        return (String) a;
    }
}
