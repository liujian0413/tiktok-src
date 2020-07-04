package org.greenrobot.eventbus.util;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: org.greenrobot.eventbus.util.c */
public final class C48348c {

    /* renamed from: a */
    public final Map<Class<? extends Throwable>, Integer> f123461a;

    /* renamed from: a */
    public final Integer mo121795a(Throwable th) {
        Throwable th2 = th;
        int i = 20;
        do {
            Integer b = m149948b(th2);
            if (b != null) {
                return b;
            }
            th2 = th2.getCause();
            i--;
            if (i <= 0 || th2 == th) {
            }
        } while (th2 != null);
        return null;
    }

    /* renamed from: b */
    private Integer m149948b(Throwable th) {
        Class cls = th.getClass();
        Integer num = (Integer) this.f123461a.get(cls);
        if (num == null) {
            Class cls2 = null;
            for (Entry entry : this.f123461a.entrySet()) {
                Class cls3 = (Class) entry.getKey();
                if (cls3.isAssignableFrom(cls) && (cls2 == null || cls2.isAssignableFrom(cls3))) {
                    num = (Integer) entry.getValue();
                    cls2 = cls3;
                }
            }
        }
        return num;
    }
}
