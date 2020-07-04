package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.port.internal.C35622l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.a */
public final class C23194a {

    /* renamed from: a */
    public static Map<Class, Object> f61164a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m76157a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface() || !C35622l.class.equals(cls)) {
            return null;
        }
        T t = f61164a.get(cls);
        if (t == null || !(t instanceof C23200af)) {
            t = new C23200af(applicationContext);
            f61164a.put(cls, t);
        }
        return t;
    }
}
