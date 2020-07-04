package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34320a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34321b;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34322c;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34325e;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.g */
public final class C23221g {

    /* renamed from: a */
    public static Map<Class, Object> f61210a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m76241a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface()) {
            return null;
        }
        if (C34320a.class.equals(cls)) {
            T t = f61210a.get(cls);
            if (t == null || !(t instanceof C23196ab)) {
                t = new C23196ab(applicationContext);
                f61210a.put(cls, t);
            }
            return t;
        } else if (C34321b.class.equals(cls)) {
            T t2 = f61210a.get(cls);
            if (t2 == null || !(t2 instanceof C23197ac)) {
                t2 = new C23197ac(applicationContext);
                f61210a.put(cls, t2);
            }
            return t2;
        } else if (C34325e.class.equals(cls)) {
            T t3 = f61210a.get(cls);
            if (t3 == null || !(t3 instanceof C23199ae)) {
                t3 = new C23199ae(applicationContext);
                f61210a.put(cls, t3);
            }
            return t3;
        } else if (!C34322c.class.equals(cls)) {
            return null;
        } else {
            T t4 = f61210a.get(cls);
            if (t4 == null || !(t4 instanceof C23198ad)) {
                t4 = new C23198ad(applicationContext);
                f61210a.put(cls, t4);
            }
            return t4;
        }
    }
}
