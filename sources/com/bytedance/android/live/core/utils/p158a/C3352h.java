package com.bytedance.android.live.core.utils.p158a;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.android.live.core.utils.a.h */
public class C3352h {

    /* renamed from: a */
    private static C3352h f10167a;

    /* renamed from: b */
    private final ConcurrentHashMap<String, Integer> f10168b = new ConcurrentHashMap<>();

    /* renamed from: b */
    public final void mo10279b() {
        this.f10168b.clear();
    }

    private C3352h() {
    }

    /* renamed from: a */
    public static C3352h m12498a() {
        if (f10167a != null) {
            return f10167a;
        }
        synchronized (C3352h.class) {
            if (f10167a == null) {
                f10167a = new C3352h();
            }
        }
        return f10167a;
    }

    /* renamed from: a */
    public final void mo10278a(List<String> list, int i) {
        if (list != null) {
            for (String put : list) {
                this.f10168b.put(put, Integer.valueOf(i));
            }
        }
    }
}
