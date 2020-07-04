package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.profile.C35816h;
import com.p280ss.android.ugc.aweme.profile.C36089t;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.h */
public final class C23222h {

    /* renamed from: a */
    public static Map<Class, Object> f61211a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m76242a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || !cls.isInterface()) {
            return null;
        }
        if (C35816h.class.equals(cls)) {
            T t = f61211a.get(cls);
            if (t == null || !(t instanceof C23201ag)) {
                t = new C23201ag(applicationContext);
                f61211a.put(cls, t);
            }
            return t;
        } else if (!C36089t.class.equals(cls)) {
            return null;
        } else {
            T t2 = f61211a.get(cls);
            if (t2 == null || !(t2 instanceof C23202ah)) {
                t2 = new C23202ah(applicationContext);
                f61211a.put(cls, t2);
            }
            return t2;
        }
    }
}
