package com.bytedance.android.live.network;

import com.bytedance.retrofit2.C12516p;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.network.e */
public class C3458e {

    /* renamed from: c */
    private static volatile C3458e f10265c;

    /* renamed from: a */
    private final ConcurrentHashMap<Class, Object> f10266a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final C12516p f10267b = C3469n.m12833a();

    private C3458e() {
    }

    /* renamed from: a */
    public static C3458e m12798a() {
        if (f10265c == null) {
            synchronized (C3458e.class) {
                if (f10265c == null) {
                    f10265c = new C3458e();
                }
            }
        }
        return f10265c;
    }

    /* renamed from: a */
    public final <T> T mo10440a(Class<T> cls) {
        if (!this.f10266a.contains(cls)) {
            this.f10266a.putIfAbsent(cls, this.f10267b.mo30492a(cls));
        }
        return this.f10266a.get(cls);
    }
}
