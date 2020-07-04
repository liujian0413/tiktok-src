package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;

/* renamed from: com.facebook.internal.a */
public final class C13861a {

    /* renamed from: d */
    private static C13861a f36730d;

    /* renamed from: a */
    public UUID f36731a;

    /* renamed from: b */
    public Intent f36732b;

    /* renamed from: c */
    public int f36733c;

    /* renamed from: b */
    private static C13861a m40940b() {
        return f36730d;
    }

    /* renamed from: a */
    public final boolean mo33498a() {
        return m40939a(this);
    }

    public C13861a(int i) {
        this(i, UUID.randomUUID());
    }

    /* renamed from: a */
    private static synchronized boolean m40939a(C13861a aVar) {
        boolean z;
        synchronized (C13861a.class) {
            C13861a b = m40940b();
            f36730d = aVar;
            if (b != null) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private C13861a(int i, UUID uuid) {
        this.f36731a = uuid;
        this.f36733c = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001d, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.internal.C13861a m40938a(java.util.UUID r4, int r5) {
        /*
            java.lang.Class<com.facebook.internal.a> r0 = com.facebook.internal.C13861a.class
            monitor-enter(r0)
            com.facebook.internal.a r1 = m40940b()     // Catch:{ all -> 0x001e }
            r2 = 0
            if (r1 == 0) goto L_0x001c
            java.util.UUID r3 = r1.f36731a     // Catch:{ all -> 0x001e }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x001e }
            if (r4 == 0) goto L_0x001c
            int r4 = r1.f36733c     // Catch:{ all -> 0x001e }
            if (r4 == r5) goto L_0x0017
            goto L_0x001c
        L_0x0017:
            m40939a(r2)     // Catch:{ all -> 0x001e }
            monitor-exit(r0)
            return r1
        L_0x001c:
            monitor-exit(r0)
            return r2
        L_0x001e:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C13861a.m40938a(java.util.UUID, int):com.facebook.internal.a");
    }
}
