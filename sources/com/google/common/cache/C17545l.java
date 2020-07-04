package com.google.common.cache;

import java.util.Random;
import sun.misc.Unsafe;

/* renamed from: com.google.common.cache.l */
abstract class C17545l extends Number {

    /* renamed from: a */
    static final ThreadLocal<int[]> f48613a = new ThreadLocal<>();

    /* renamed from: b */
    static final Random f48614b = new Random();

    /* renamed from: c */
    static final int f48615c = Runtime.getRuntime().availableProcessors();

    /* renamed from: g */
    private static final Unsafe f48616g;

    /* renamed from: h */
    private static final long f48617h;

    /* renamed from: i */
    private static final long f48618i;

    /* renamed from: d */
    volatile transient C17547a[] f48619d;

    /* renamed from: e */
    volatile transient long f48620e;

    /* renamed from: f */
    volatile transient int f48621f;

    /* renamed from: com.google.common.cache.l$a */
    static final class C17547a {

        /* renamed from: b */
        private static final Unsafe f48622b;

        /* renamed from: c */
        private static final long f48623c;

        /* renamed from: a */
        volatile long f48624a;

        static {
            try {
                f48622b = C17545l.m58439b();
                f48623c = f48622b.objectFieldOffset(C17547a.class.getDeclaredField("value"));
            } catch (Exception e) {
                throw new Error(e);
            }
        }

        C17547a(long j) {
            this.f48624a = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo45149a(long j, long j2) {
            return f48622b.compareAndSwapLong(this, f48623c, j, j2);
        }
    }

    C17545l() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract long mo45140a(long j, long j2);

    /* renamed from: a */
    private boolean mo45138a() {
        return f48616g.compareAndSwapInt(this, f48618i, 0, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.cache.C17545l.C175461());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe m58439b() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.cache.l$1 r0 = new com.google.common.cache.l$1     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C17545l.m58439b():sun.misc.Unsafe");
    }

    static {
        try {
            f48616g = m58439b();
            Class<C17545l> cls = C17545l.class;
            f48617h = f48616g.objectFieldOffset(cls.getDeclaredField("base"));
            f48618i = f48616g.objectFieldOffset(cls.getDeclaredField("busy"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo45147b(long j, long j2) {
        return f48616g.compareAndSwapLong(this, f48617h, j, j2);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x008f, code lost:
        if (r1.f48619d != r9) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0091, code lost:
        r8 = new com.google.common.cache.C17545l.C17547a[(r10 << 1)];
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0096, code lost:
        if (r11 >= r10) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0098, code lost:
        r8[r11] = r9[r11];
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x009f, code lost:
        r1.f48619d = r8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x005f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0027 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45146a(long r18, int[] r20, boolean r21) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r4 = 1
            r5 = 0
            if (r20 != 0) goto L_0x0020
            java.lang.ThreadLocal<int[]> r0 = f48613a
            int[] r6 = new int[r4]
            r0.set(r6)
            java.util.Random r0 = f48614b
            int r0 = r0.nextInt()
            if (r0 != 0) goto L_0x0018
            r0 = 1
        L_0x0018:
            r6[r5] = r0
            r16 = r6
            r6 = r0
            r0 = r16
            goto L_0x0024
        L_0x0020:
            r6 = r20[r5]
            r0 = r20
        L_0x0024:
            r7 = r21
        L_0x0026:
            r8 = 0
        L_0x0027:
            com.google.common.cache.l$a[] r9 = r1.f48619d
            if (r9 == 0) goto L_0x00b5
            int r10 = r9.length
            if (r10 <= 0) goto L_0x00b5
            int r11 = r10 + -1
            r11 = r11 & r6
            r11 = r9[r11]
            if (r11 != 0) goto L_0x0066
            int r9 = r1.f48621f
            if (r9 != 0) goto L_0x0064
            com.google.common.cache.l$a r9 = new com.google.common.cache.l$a
            r9.<init>(r2)
            int r10 = r1.f48621f
            if (r10 != 0) goto L_0x0064
            boolean r10 = r17.mo45138a()
            if (r10 == 0) goto L_0x0064
            com.google.common.cache.l$a[] r10 = r1.f48619d     // Catch:{ all -> 0x0060 }
            if (r10 == 0) goto L_0x005a
            int r11 = r10.length     // Catch:{ all -> 0x0060 }
            if (r11 <= 0) goto L_0x005a
            int r11 = r11 + -1
            r11 = r11 & r6
            r12 = r10[r11]     // Catch:{ all -> 0x0060 }
            if (r12 != 0) goto L_0x005a
            r10[r11] = r9     // Catch:{ all -> 0x0060 }
            r9 = 1
            goto L_0x005b
        L_0x005a:
            r9 = 0
        L_0x005b:
            r1.f48621f = r5
            if (r9 == 0) goto L_0x0027
            return
        L_0x0060:
            r0 = move-exception
            r1.f48621f = r5
            throw r0
        L_0x0064:
            r8 = 0
            goto L_0x00a8
        L_0x0066:
            if (r7 != 0) goto L_0x006a
            r7 = 1
            goto L_0x00a8
        L_0x006a:
            long r12 = r11.f48624a
            long r14 = r1.mo45140a(r12, r2)
            boolean r11 = r11.mo45149a(r12, r14)
            if (r11 != 0) goto L_0x00f0
            int r11 = f48615c
            if (r10 >= r11) goto L_0x0064
            com.google.common.cache.l$a[] r11 = r1.f48619d
            if (r11 == r9) goto L_0x007f
            goto L_0x0064
        L_0x007f:
            if (r8 != 0) goto L_0x0083
            r8 = 1
            goto L_0x00a8
        L_0x0083:
            int r11 = r1.f48621f
            if (r11 != 0) goto L_0x00a8
            boolean r11 = r17.mo45138a()
            if (r11 == 0) goto L_0x00a8
            com.google.common.cache.l$a[] r8 = r1.f48619d     // Catch:{ all -> 0x00a4 }
            if (r8 != r9) goto L_0x00a1
            int r8 = r10 << 1
            com.google.common.cache.l$a[] r8 = new com.google.common.cache.C17545l.C17547a[r8]     // Catch:{ all -> 0x00a4 }
            r11 = 0
        L_0x0096:
            if (r11 >= r10) goto L_0x009f
            r12 = r9[r11]     // Catch:{ all -> 0x00a4 }
            r8[r11] = r12     // Catch:{ all -> 0x00a4 }
            int r11 = r11 + 1
            goto L_0x0096
        L_0x009f:
            r1.f48619d = r8     // Catch:{ all -> 0x00a4 }
        L_0x00a1:
            r1.f48621f = r5
            goto L_0x0026
        L_0x00a4:
            r0 = move-exception
            r1.f48621f = r5
            throw r0
        L_0x00a8:
            int r9 = r6 << 13
            r6 = r6 ^ r9
            int r9 = r6 >>> 17
            r6 = r6 ^ r9
            int r9 = r6 << 5
            r6 = r6 ^ r9
            r0[r5] = r6
            goto L_0x0027
        L_0x00b5:
            int r10 = r1.f48621f
            if (r10 != 0) goto L_0x00e2
            com.google.common.cache.l$a[] r10 = r1.f48619d
            if (r10 != r9) goto L_0x00e2
            boolean r10 = r17.mo45138a()
            if (r10 == 0) goto L_0x00e2
            com.google.common.cache.l$a[] r10 = r1.f48619d     // Catch:{ all -> 0x00de }
            if (r10 != r9) goto L_0x00d7
            r9 = 2
            com.google.common.cache.l$a[] r9 = new com.google.common.cache.C17545l.C17547a[r9]     // Catch:{ all -> 0x00de }
            r10 = r6 & 1
            com.google.common.cache.l$a r11 = new com.google.common.cache.l$a     // Catch:{ all -> 0x00de }
            r11.<init>(r2)     // Catch:{ all -> 0x00de }
            r9[r10] = r11     // Catch:{ all -> 0x00de }
            r1.f48619d = r9     // Catch:{ all -> 0x00de }
            r9 = 1
            goto L_0x00d8
        L_0x00d7:
            r9 = 0
        L_0x00d8:
            r1.f48621f = r5
            if (r9 != 0) goto L_0x00f0
            goto L_0x0027
        L_0x00de:
            r0 = move-exception
            r1.f48621f = r5
            throw r0
        L_0x00e2:
            long r9 = r1.f48620e
            long r11 = r1.mo45140a(r9, r2)
            boolean r9 = r1.mo45147b(r9, r11)
            if (r9 != 0) goto L_0x00f0
            goto L_0x0027
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.cache.C17545l.mo45146a(long, int[], boolean):void");
    }
}
