package com.p280ss.android.ugc.p302a;

/* renamed from: com.ss.android.ugc.a.f */
public abstract class C6853f {
    /* renamed from: a */
    public static <T> T m21299a(String str) {
        try {
            Class cls = Class.forName(str);
            if (cls != null) {
                return cls.newInstance();
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
