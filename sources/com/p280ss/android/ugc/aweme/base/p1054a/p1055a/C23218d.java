package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.shortvideo.C39968go;
import com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.C39448d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.d */
public final class C23218d {

    /* renamed from: a */
    public static Map<Class, Object> f61209a = new ConcurrentHashMap();

    /* renamed from: a */
    public static <T> T m76237a(Context context, Class<T> cls) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null || cls == null || !cls.isInterface()) {
            return null;
        }
        if (C39968go.class.equals(cls)) {
            T t = f61209a.get(cls);
            if (t == null || !(t instanceof C23210ap)) {
                t = new C23210ap(applicationContext);
                f61209a.put(cls, t);
            }
            return t;
        } else if (!C39448d.class.equals(cls)) {
            return null;
        } else {
            T t2 = f61209a.get(cls);
            if (t2 == null || !(t2 instanceof C23211aq)) {
                t2 = new C23211aq(applicationContext);
                f61209a.put(cls, t2);
            }
            return t2;
        }
    }
}
