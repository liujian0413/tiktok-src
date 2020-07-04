package com.bytedance.ttnet;

import android.text.TextUtils;

/* renamed from: com.bytedance.ttnet.a */
public final class C12924a {
    /* renamed from: c */
    public static String m37624c() {
        C12961d.m37772a();
        throw new IllegalArgumentException("cdnHostSuffix is not init !!!");
    }

    /* renamed from: a */
    public static String m37621a() {
        String e = C12961d.m37772a().mo31471e();
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        throw new IllegalArgumentException("apiIHostPrefix is not init !!!");
    }

    /* renamed from: b */
    public static String m37623b() {
        String d = C12961d.m37772a().mo31470d();
        if (!TextUtils.isEmpty(d)) {
            return d;
        }
        throw new IllegalArgumentException("hostSuffix is not init !!!");
    }

    /* renamed from: a */
    public static String m37622a(String str) {
        String d = C12961d.m37772a().mo31470d();
        if (str == null || TextUtils.isEmpty(d)) {
            throw new IllegalArgumentException("hostSuffix is not init !!!");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(d);
        return sb.toString();
    }
}
