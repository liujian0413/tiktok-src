package com.google.common.util.concurrent;

import com.google.common.base.C17439m;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.util.concurrent.e */
public final class C18242e {

    /* renamed from: a */
    private static final Logger f49625a = Logger.getLogger(C18242e.class.getName());

    /* renamed from: b */
    private C18243a f49626b;

    /* renamed from: c */
    private boolean f49627c;

    /* renamed from: com.google.common.util.concurrent.e$a */
    static final class C18243a {

        /* renamed from: a */
        final Runnable f49628a;

        /* renamed from: b */
        final Executor f49629b;

        /* renamed from: c */
        C18243a f49630c;

        C18243a(Runnable runnable, Executor executor, C18243a aVar) {
            this.f49628a = runnable;
            this.f49629b = executor;
            this.f49630c = aVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r2 = r1.f49630c;
        r1.f49630c = r0;
        r0 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        m60204b(r0.f49628a, r0.f49629b);
        r0 = r0.f49630c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r1 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47109a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f49627c     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            return
        L_0x0007:
            r0 = 1
            r4.f49627c = r0     // Catch:{ all -> 0x0029 }
            com.google.common.util.concurrent.e$a r0 = r4.f49626b     // Catch:{ all -> 0x0029 }
            r1 = 0
            r4.f49626b = r1     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x0013:
            if (r1 == 0) goto L_0x001c
            com.google.common.util.concurrent.e$a r2 = r1.f49630c
            r1.f49630c = r0
            r0 = r1
            r1 = r2
            goto L_0x0013
        L_0x001c:
            if (r0 == 0) goto L_0x0028
            java.lang.Runnable r1 = r0.f49628a
            java.util.concurrent.Executor r2 = r0.f49629b
            m60204b(r1, r2)
            com.google.common.util.concurrent.e$a r0 = r0.f49630c
            goto L_0x001c
        L_0x0028:
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C18242e.mo47109a():void");
    }

    /* renamed from: b */
    private static void m60204b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = f49625a;
            Level level = Level.SEVERE;
            StringBuilder sb = new StringBuilder("RuntimeException while executing runnable ");
            sb.append(runnable);
            sb.append(" with executor ");
            sb.append(executor);
            logger.log(level, sb.toString(), e);
        }
    }

    /* renamed from: a */
    public final void mo47110a(Runnable runnable, Executor executor) {
        C17439m.m57963a(runnable, (Object) "Runnable was null.");
        C17439m.m57963a(executor, (Object) "Executor was null.");
        synchronized (this) {
            if (!this.f49627c) {
                this.f49626b = new C18243a(runnable, executor, this.f49626b);
            } else {
                m60204b(runnable, executor);
            }
        }
    }
}
