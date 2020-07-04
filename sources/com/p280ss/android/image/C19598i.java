package com.p280ss.android.image;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.C6308d;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.ss.android.image.i */
public final class C19598i implements C6310a {

    /* renamed from: a */
    public static C19598i f53020a = new C19598i();

    /* renamed from: c */
    public static final AtomicLong f53021c = new AtomicLong();

    /* renamed from: b */
    public long f53022b;

    /* renamed from: d */
    public final AtomicLong f53023d = new AtomicLong(0);

    /* renamed from: e */
    public boolean f53024e = false;

    /* renamed from: f */
    public C6309f f53025f = new C6309f(Looper.getMainLooper(), this);

    /* renamed from: g */
    public final Runnable f53026g = new Runnable() {
        public final void run() {
            C19598i.this.mo51785a();
        }
    };

    /* renamed from: h */
    private final Object f53027h = new Object();

    /* renamed from: i */
    private int f53028i = 0;

    /* renamed from: j */
    private int f53029j = 0;

    /* renamed from: k */
    private WeakReference<C6813b> f53030k;

    /* renamed from: l */
    private final C6308d<Object> f53031l = new C6308d<>();

    /* renamed from: com.ss.android.image.i$a */
    class C19600a extends Thread {

        /* renamed from: a */
        final C6813b f53033a;

        public final void run() {
            System.currentTimeMillis();
            long c = C6813b.m21189c();
            System.currentTimeMillis();
            C19598i.this.f53024e = true;
            C19598i.this.f53023d.set(c);
            C19598i.f53021c.set(0);
            C19598i.this.f53025f.post(C19598i.this.f53026g);
        }

        public C19600a(C6813b bVar) {
            super("CacheSizeThread");
            this.f53033a = bVar;
        }
    }

    public final void handleMsg(Message message) {
    }

    /* renamed from: b */
    private long m64551b() {
        return this.f53023d.get() + f53021c.get();
    }

    private C19598i() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo51785a() {
        /*
            r3 = this;
            r3.m64551b()
            com.bytedance.common.utility.collection.d<java.lang.Object> r0 = r3.f53031l
            java.util.Iterator r0 = r0.iterator()
        L_0x0009:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0013
            r0.next()
            goto L_0x0009
        L_0x0013:
            java.lang.Object r0 = r3.f53027h
            monitor-enter(r0)
            int r1 = r3.f53028i     // Catch:{ all -> 0x003b }
            int r2 = r3.f53029j     // Catch:{ all -> 0x003b }
            if (r1 == r2) goto L_0x0039
            int r1 = r3.f53028i     // Catch:{ all -> 0x003b }
            r3.f53029j = r1     // Catch:{ all -> 0x003b }
            r1 = 0
            java.lang.ref.WeakReference<com.ss.android.image.b> r2 = r3.f53030k     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x002d
            java.lang.ref.WeakReference<com.ss.android.image.b> r1 = r3.f53030k     // Catch:{ all -> 0x003b }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x003b }
            com.ss.android.image.b r1 = (com.p280ss.android.image.C6813b) r1     // Catch:{ all -> 0x003b }
        L_0x002d:
            if (r1 != 0) goto L_0x0031
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x0031:
            com.ss.android.image.i$a r2 = new com.ss.android.image.i$a     // Catch:{ all -> 0x003b }
            r2.<init>(r1)     // Catch:{ all -> 0x003b }
            r2.start()     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            return
        L_0x003b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.image.C19598i.mo51785a():void");
    }

    /* renamed from: a */
    public final int mo51784a(C6813b bVar) {
        int i;
        boolean z = false;
        if (bVar == null) {
            return 0;
        }
        synchronized (this.f53027h) {
            if (this.f53028i > this.f53029j) {
                z = true;
            }
            this.f53028i++;
            this.f53030k = new WeakReference<>(bVar);
            if (!z) {
                this.f53029j = this.f53028i;
                new C19600a(bVar).start();
            }
            i = this.f53028i;
        }
        return i;
    }
}
