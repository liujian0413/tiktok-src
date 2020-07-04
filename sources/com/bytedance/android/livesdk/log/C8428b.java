package com.bytedance.android.livesdk.log;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.log.b */
public final class C8428b {

    /* renamed from: a */
    public static C8428b f23046a;

    /* renamed from: b */
    private Map<String, String> f23047b = new HashMap();

    private C8428b() {
    }

    /* renamed from: a */
    public static synchronized C8428b m25637a() {
        C8428b bVar;
        synchronized (C8428b.class) {
            if (f23046a == null) {
                f23046a = new C8428b();
            }
            bVar = f23046a;
        }
        return bVar;
    }

    /* renamed from: a */
    public final void mo21580a(long j, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(str);
        this.f23047b.put(sb.toString(), str2);
    }
}
