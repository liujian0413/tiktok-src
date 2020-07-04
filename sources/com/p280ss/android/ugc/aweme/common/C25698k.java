package com.p280ss.android.ugc.aweme.common;

import com.bytedance.common.utility.reflect.C6322b;
import java.lang.reflect.Constructor;

/* renamed from: com.ss.android.ugc.aweme.common.k */
public final class C25698k {
    /* renamed from: a */
    public static <T> T m84445a(String str, Class cls) {
        T t;
        try {
            t = C6322b.m19611a(str).mo15156a().f18556a;
        } catch (Throwable unused) {
            t = null;
        }
        if (t == null) {
            Constructor[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Constructor constructor = declaredConstructors[i];
                try {
                    constructor.setAccessible(true);
                    t = constructor.newInstance(new Object[0]);
                    break;
                } catch (Throwable unused2) {
                    i++;
                }
            }
        }
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("cannot find service in ");
        sb.append(str);
        sb.append("  or cannot create service through ");
        sb.append(cls.getSimpleName());
        throw new RuntimeException(sb.toString());
    }
}
