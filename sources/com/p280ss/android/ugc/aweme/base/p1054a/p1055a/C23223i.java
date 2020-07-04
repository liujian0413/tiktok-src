package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.shortvideo.model.IPublishPermissionCache;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.i */
public final class C23223i {

    /* renamed from: a */
    public static Map<Class, Object> f61212a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m76243a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface() || !IPublishPermissionCache.class.equals(cls)) {
            return null;
        }
        T t = f61212a.get(cls);
        if (t == null || !(t instanceof C23212ar)) {
            t = new C23212ar(applicationContext);
            f61212a.put(cls, t);
        }
        return t;
    }
}
