package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.effect.C27393b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.j */
public final class C23224j {

    /* renamed from: a */
    public static Map<Class, Object> f61213a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m76244a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface() || !C27393b.class.equals(cls)) {
            return null;
        }
        T t = f61213a.get(cls);
        if (t == null || !(t instanceof C23232r)) {
            t = new C23232r(applicationContext);
            f61213a.put(cls, t);
        }
        return t;
    }
}
