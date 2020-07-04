package com.p280ss.android.ugc.aweme.net.p333a;

import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.net.a.a */
public class C7178a {

    /* renamed from: a */
    private static C7178a f20104a;

    /* renamed from: b */
    private Object f20105b;

    private C7178a() {
        try {
            this.f20105b = Class.forName("android.os.SystemProperties").newInstance();
        } catch (ClassNotFoundException | InstantiationException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* renamed from: a */
    public static C7178a m22406a() {
        if (f20104a == null) {
            synchronized (C7178a.class) {
                if (f20104a == null) {
                    f20104a = new C7178a();
                }
            }
        }
        return f20104a;
    }

    /* renamed from: a */
    public final String mo18654a(String str) {
        String str2;
        String str3 = "";
        if (this.f20105b == null) {
            return str3;
        }
        try {
            Method method = this.f20105b.getClass().getMethod("get", new Class[]{String.class});
            method.setAccessible(true);
            str2 = (String) method.invoke(this.f20105b, new Object[]{str});
            if (str2 == null) {
                str3 = "";
                str2 = str3;
            }
        } catch (Exception unused) {
        }
        return str2;
    }
}
