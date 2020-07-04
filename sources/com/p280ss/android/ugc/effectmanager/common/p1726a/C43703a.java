package com.p280ss.android.ugc.effectmanager.common.p1726a;

import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.effectmanager.common.a.a */
public final class C43703a {

    /* renamed from: b */
    private static C43703a f113155b;

    /* renamed from: a */
    HashMap<String, C43719a> f113156a = new HashMap<>();

    /* renamed from: a */
    public static C43703a m138485a() {
        if (f113155b == null) {
            synchronized (C43703a.class) {
                if (f113155b == null) {
                    f113155b = new C43703a();
                }
            }
        }
        return f113155b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return r3;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a mo105727a(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0028 }
            r1 = 0
            if (r0 == 0) goto L_0x000a
            monitor-exit(r2)
            return r1
        L_0x000a:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.c.a> r0 = r2.f113156a     // Catch:{ all -> 0x0028 }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x0028 }
            if (r0 != 0) goto L_0x0014
            monitor-exit(r2)
            return r1
        L_0x0014:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.c.a> r0 = r2.f113156a     // Catch:{ all -> 0x0028 }
            java.lang.Object r3 = r0.get(r3)     // Catch:{ all -> 0x0028 }
            com.ss.android.ugc.effectmanager.common.c.a r3 = (com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a) r3     // Catch:{ all -> 0x0028 }
            boolean r0 = r3 instanceof com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0026
            r0 = r3
            com.ss.android.ugc.effectmanager.common.a.b r0 = (com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b) r0     // Catch:{ all -> 0x0028 }
            r0.mo105730a()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r2)
            return r3
        L_0x0028:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a.mo105727a(java.lang.String):com.ss.android.ugc.effectmanager.common.c.a");
    }

    /* renamed from: a */
    public final synchronized void mo105728a(String str, C43719a aVar) {
        this.f113156a.put(str, aVar);
    }
}
