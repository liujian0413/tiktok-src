package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.commerce.service.p1110d.C24440a;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.c */
public final class C23217c {

    /* renamed from: a */
    public static Map<Class, Object> f61208a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m76236a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || !cls.isInterface() || !C24440a.class.equals(cls)) {
            return null;
        }
        T t = f61208a.get(cls);
        if (t == null || !(t instanceof C23228n)) {
            t = new C23228n(applicationContext);
            f61208a.put(cls, t);
        }
        return t;
    }
}
