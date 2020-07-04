package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.app.Activity;
import android.text.TextUtils;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.g */
public final class C41553g {
    /* renamed from: a */
    public static void m132328a(Activity activity) {
        Field a = m132327a(activity, "mCalled");
        if (a != null) {
            try {
                a.setAccessible(true);
                a.set(activity, Boolean.valueOf(true));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static Field m132327a(Object obj, String str) {
        if (obj == null || TextUtils.isEmpty(str)) {
            return null;
        }
        Class<Object> cls = obj.getClass();
        while (cls != Object.class) {
            try {
                return cls.getDeclaredField(str);
            } catch (Exception unused) {
                cls = cls.getSuperclass();
            }
        }
        return null;
    }
}
