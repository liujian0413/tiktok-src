package com.bytedance.android.live.wallet;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.wallet.b */
public final class C3642b {

    /* renamed from: a */
    private static final ConcurrentHashMap<Class, C3643a> f10864a = new ConcurrentHashMap<>();

    /* renamed from: com.bytedance.android.live.wallet.b$a */
    public interface C3643a<T> {
        /* renamed from: a */
        T mo11059a();
    }

    static {
        new C3801g();
        C3801g.m13555a(f10864a);
    }

    /* renamed from: a */
    public static <T> T m13238a(Class<T> cls) {
        C3643a aVar = (C3643a) f10864a.get(cls);
        if (aVar != null) {
            return aVar.mo11059a();
        }
        return null;
    }
}
