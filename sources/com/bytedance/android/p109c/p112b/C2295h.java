package com.bytedance.android.p109c.p112b;

import com.bytedance.android.p109c.p112b.C2292f.C2293a;
import com.bytedance.android.p109c.p112b.p113a.C2275a;
import com.bytedance.android.p109c.p112b.p113a.C2283b;
import com.bytedance.android.p109c.p112b.p113a.C2283b.C2284a;
import com.bytedance.android.p109c.p112b.p113a.C2285c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.channels.FileLock;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.bytedance.android.c.b.h */
final class C2295h implements C2292f {

    /* renamed from: a */
    static int f7585a = 32768;

    /* renamed from: b */
    static int f7586b = 8192;

    /* renamed from: c */
    public final Map<String, C2299a> f7587c = new LinkedHashMap();

    /* renamed from: d */
    public final C2293a f7588d;

    /* renamed from: e */
    private volatile int f7589e = 16;

    /* renamed from: f */
    private volatile int f7590f = -1;

    /* renamed from: g */
    private volatile MappedByteBuffer f7591g;

    /* renamed from: h */
    private final FileChannel f7592h;

    /* renamed from: i */
    private final RandomAccessFile f7593i;

    /* renamed from: j */
    private final boolean f7594j;

    /* renamed from: k */
    private final C2301c f7595k;

    /* renamed from: l */
    private final C2301c f7596l;

    /* renamed from: m */
    private final C2285c f7597m = new C2285c();

    /* renamed from: n */
    private final C2275a f7598n = new C2275a();

    /* renamed from: o */
    private final C2283b f7599o = new C2283b();

    /* renamed from: p */
    private final C2288c f7600p = new C2288c();

    /* renamed from: q */
    private final ThreadLocal<byte[]> f7601q = new ThreadLocal<byte[]>() {
        /* renamed from: a */
        private static byte[] m9896a() {
            return new byte[C2295h.f7586b];
        }

        /* access modifiers changed from: protected */
        public final /* synthetic */ Object initialValue() {
            return m9896a();
        }
    };

    /* renamed from: r */
    private C2300b f7602r = new C2300b() {
        /* renamed from: a */
        public final void mo8112a(String str, C2299a aVar) {
            C2295h.this.f7587c.put(str, aVar);
            C2295h.this.f7588d.mo8104d(str);
        }

        /* renamed from: b */
        public final void mo8113b(String str, C2299a aVar) {
            C2295h.this.f7587c.remove(str);
            C2295h.this.f7588d.mo8104d(str);
        }
    };

    /* renamed from: com.bytedance.android.c.b.h$a */
    static final class C2299a {

        /* renamed from: a */
        volatile int f7607a;

        /* renamed from: b */
        volatile int f7608b;

        C2299a() {
        }

        C2299a(int i, int i2) {
            this.f7607a = i;
            this.f7608b = i2;
        }
    }

    /* renamed from: com.bytedance.android.c.b.h$b */
    interface C2300b {
        /* renamed from: a */
        void mo8112a(String str, C2299a aVar);

        /* renamed from: b */
        void mo8113b(String str, C2299a aVar);
    }

    /* renamed from: com.bytedance.android.c.b.h$c */
    interface C2301c {
        /* renamed from: a */
        void mo8114a();

        /* renamed from: b */
        void mo8115b();
    }

    /* renamed from: com.bytedance.android.c.b.h$d */
    static abstract class C2302d implements C2301c {

        /* renamed from: a */
        final ReentrantLock f7609a = new ReentrantLock();

        /* renamed from: b */
        final FileChannel f7610b;

        /* renamed from: c */
        FileLock f7611c;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public abstract void mo8116c();

        /* renamed from: a */
        public final void mo8114a() {
            this.f7609a.lock();
            mo8116c();
        }

        /* renamed from: b */
        public final void mo8115b() {
            try {
                this.f7611c.release();
            } catch (Exception e) {
                C2286b.m9843b("Failed to release FileLock", e);
            }
            this.f7609a.unlock();
        }

        C2302d(FileChannel fileChannel) {
            this.f7610b = fileChannel;
        }
    }

    /* renamed from: com.bytedance.android.c.b.h$e */
    static final class C2303e extends C2302d {
        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo8116c() {
            try {
                this.f7611c = this.f7610b.lock(0, Long.MAX_VALUE, true);
            } catch (Exception e) {
                C2286b.m9843b("Failed to lock FileLock", e);
            }
        }

        C2303e(FileChannel fileChannel) {
            super(fileChannel);
        }
    }

    /* renamed from: com.bytedance.android.c.b.h$f */
    static final class C2304f extends C2302d {
        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo8116c() {
            try {
                this.f7611c = this.f7610b.lock();
            } catch (Exception e) {
                C2286b.m9843b("Failed to lock FileLock", e);
            }
        }

        C2304f(FileChannel fileChannel) {
            super(fileChannel);
        }
    }

    /* renamed from: com.bytedance.android.c.b.h$g */
    static final class C2305g implements C2301c {

        /* renamed from: a */
        private ReentrantReadWriteLock f7612a;

        /* renamed from: a */
        public final void mo8114a() {
            this.f7612a.readLock().lock();
        }

        /* renamed from: b */
        public final void mo8115b() {
            this.f7612a.readLock().unlock();
        }

        private C2305g(ReentrantReadWriteLock reentrantReadWriteLock) {
            this.f7612a = reentrantReadWriteLock;
        }
    }

    /* renamed from: com.bytedance.android.c.b.h$h */
    static final class C2306h implements C2301c {

        /* renamed from: a */
        private ReentrantReadWriteLock f7613a;

        /* renamed from: a */
        public final void mo8114a() {
            this.f7613a.writeLock().lock();
        }

        /* renamed from: b */
        public final void mo8115b() {
            this.f7613a.writeLock().unlock();
        }

        private C2306h(ReentrantReadWriteLock reentrantReadWriteLock) {
            this.f7613a = reentrantReadWriteLock;
        }
    }

    /* renamed from: a */
    public final int mo8105a(String str, String str2) {
        this.f7596l.mo8114a();
        this.f7599o.mo8074a();
        this.f7599o.f7557a = str;
        this.f7599o.f7558b = 8;
        this.f7599o.f7564h = str2;
        int a = m9883a(str, 1);
        this.f7596l.mo8115b();
        return a;
    }

    /* renamed from: a */
    public final int mo8106a(String str, List<String> list) {
        this.f7596l.mo8114a();
        this.f7599o.mo8074a();
        this.f7599o.f7557a = str;
        this.f7599o.f7558b = 10;
        this.f7599o.f7566j = list;
        int a = m9883a(str, 1);
        this.f7596l.mo8115b();
        return a;
    }

    /* renamed from: a */
    public final C2283b mo8107a(String str) {
        this.f7595k.mo8114a();
        if (this.f7594j) {
            m9886a(false);
        }
        C2299a aVar = (C2299a) this.f7587c.get(str);
        if (aVar == null) {
            this.f7595k.mo8115b();
            StringBuilder sb = new StringBuilder("Item does not exist, key: ");
            sb.append(str);
            C2286b.m9839a(sb.toString());
            return null;
        }
        try {
            C2283b a = C2284a.m9823a(this.f7597m.mo8079a(this.f7600p.mo8089a(this.f7591g, aVar.f7607a, aVar.f7608b)), this.f7599o);
            return a;
        } catch (Exception e) {
            C2286b.m9843b("Failed to read local data!", e);
            return null;
        } finally {
            this.f7595k.mo8115b();
        }
    }

    /* renamed from: b */
    public final void mo8109b() {
        m9886a(false);
    }

    /* renamed from: c */
    private byte[] m9889c() {
        return (byte[]) this.f7601q.get();
    }

    /* renamed from: a */
    public final void mo8108a() {
        C2313j.m9927a(this.f7591g);
        try {
            this.f7592h.close();
        } catch (Exception e) {
            C2286b.m9840a("Failed to close dataFileChannel", e);
        }
        try {
            this.f7593i.close();
        } catch (Exception unused) {
            C2286b.m9842b("Failed to close dataRandomAccessFile");
        }
    }

    /* renamed from: a */
    private void m9884a(int i) {
        int capacity = this.f7591g.capacity();
        while (capacity < i) {
            capacity = (int) (((float) capacity) * 1.5f);
        }
        try {
            C2313j.m9927a(this.f7591g);
            this.f7591g = this.f7592h.map(MapMode.READ_WRITE, 0, (long) capacity);
        } catch (Exception e) {
            C2286b.m9840a("Failed to resize mapped buffer", e);
        }
    }

    /* renamed from: b */
    public final void mo8110b(String str) {
        this.f7596l.mo8114a();
        if (this.f7594j) {
            m9886a(false);
        }
        if (((C2299a) this.f7587c.remove(str)) == null) {
            StringBuilder sb = new StringBuilder("Tried to remove item doesn't exist, key: ");
            sb.append(str);
            C2286b.m9839a(sb.toString());
            this.f7595k.mo8115b();
            return;
        }
        this.f7599o.mo8074a();
        this.f7599o.f7557a = str;
        this.f7599o.f7558b = 0;
        m9883a(str, 0);
        this.f7596l.mo8115b();
    }

    /* renamed from: a */
    private void m9886a(boolean z) {
        byte[] c = m9889c();
        this.f7591g.position(0);
        this.f7591g.get(c, 0, 16);
        int i = 1;
        byte b = ((c[0] & 255) << 24) | ((c[1] & 255) << 16) | ((c[2] & 255) << 8) | (c[3] & 255);
        byte b2 = (c[7] & 255) | ((c[4] & 255) << 24) | ((c[5] & 255) << 16) | ((c[6] & 255) << 8);
        if (b <= 0 || b2 <= 0) {
            m9885a(1, 16);
        } else {
            if (this.f7590f < b) {
                if (m9888a(z, (int) b2)) {
                    i = b + 1;
                    m9885a(i, this.f7589e);
                }
            } else if (this.f7589e < b2) {
                m9887a(this.f7589e, b2, this.f7602r);
            }
            i = b;
        }
        this.f7590f = i;
    }

    /* renamed from: a */
    private void m9885a(int i, int i2) {
        byte[] c = m9889c();
        c[0] = (byte) (i >>> 24);
        c[1] = (byte) (i >>> 16);
        c[2] = (byte) (i >>> 8);
        c[3] = (byte) i;
        c[4] = (byte) (i2 >>> 24);
        c[5] = (byte) (i2 >>> 16);
        c[6] = (byte) (i2 >>> 8);
        c[7] = (byte) i2;
        this.f7591g.position(0);
        this.f7591g.put(c, 0, 16);
    }

    /* renamed from: a */
    private int m9883a(String str, byte b) {
        byte[] c = m9889c();
        if (this.f7594j) {
            m9886a(false);
        }
        C2299a aVar = new C2299a();
        int i = this.f7589e;
        int a = C2284a.m9822a(this.f7599o);
        aVar.f7608b = a;
        aVar.f7607a = i + 16;
        int i2 = a + 16;
        if (i2 > c.length) {
            c = new byte[i2];
        }
        C2284a.m9825a(this.f7598n.mo8066a(c, 16), this.f7599o);
        long a2 = C2274a.m9790a(c, 16, a);
        c[0] = (byte) (a >>> 24);
        c[1] = (byte) (a >>> 16);
        c[2] = (byte) (a >>> 8);
        c[3] = (byte) a;
        c[4] = b;
        c[7] = -1;
        c[6] = -1;
        c[5] = -1;
        c[8] = (byte) ((int) (a2 >>> 56));
        c[9] = (byte) ((int) (a2 >>> 48));
        c[10] = (byte) ((int) (a2 >>> 40));
        c[11] = (byte) ((int) (a2 >>> 32));
        c[12] = (byte) ((int) (a2 >>> 24));
        c[13] = (byte) ((int) (a2 >>> 16));
        c[14] = (byte) ((int) (a2 >>> 8));
        c[15] = (byte) ((int) a2);
        if (this.f7591g.capacity() < aVar.f7607a + a) {
            m9884a(aVar.f7607a + a);
        }
        this.f7591g.position(i);
        this.f7591g.put(c, 0, i2);
        this.f7589e = i + i2;
        m9885a(this.f7590f, this.f7589e);
        this.f7587c.put(str, aVar);
        return aVar.f7608b;
    }

    /* renamed from: a */
    private boolean m9888a(boolean z, int i) {
        this.f7587c.clear();
        final int[] iArr = new int[1];
        if (m9887a(16, i, new C2300b() {
            /* renamed from: a */
            public final void mo8112a(String str, C2299a aVar) {
                C2295h.this.f7587c.put(str, aVar);
                int[] iArr = iArr;
                iArr[0] = iArr[0] + 1;
            }

            /* renamed from: b */
            public final void mo8113b(String str, C2299a aVar) {
                C2295h.this.f7587c.remove(str);
                int[] iArr = iArr;
                iArr[0] = iArr[0] + 1;
            }
        })) {
            iArr[0] = -1;
        }
        if ((iArr[0] == this.f7587c.size() || !z) && iArr[0] != -1) {
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(this.f7591g.capacity() - 16);
        this.f7591g.position(16);
        byte[] array = allocate.array();
        int i2 = 0;
        for (C2299a aVar : this.f7587c.values()) {
            this.f7591g.position(aVar.f7607a - 16);
            this.f7591g.get(array, i2, aVar.f7608b + 16);
            aVar.f7607a = i2 + 16 + 16;
            i2 += aVar.f7608b + 16;
        }
        this.f7591g.position(16);
        this.f7591g.put(array, 0, allocate.capacity());
        this.f7589e = i2 + 16;
        this.f7588d.mo8098a();
        return true;
    }

    C2295h(String str, boolean z, C2293a aVar) throws IOException {
        int i;
        this.f7594j = z;
        this.f7588d = aVar;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".mapped.data");
        File file = new File(sb.toString());
        if (!file.exists()) {
            file.createNewFile();
        }
        this.f7593i = new RandomAccessFile(file, "rw");
        this.f7592h = this.f7593i.getChannel();
        if (this.f7592h.size() > 0) {
            i = (int) this.f7592h.size();
        } else {
            i = f7585a;
        }
        this.f7591g = this.f7592h.map(MapMode.READ_WRITE, 0, (long) i);
        if (z) {
            this.f7595k = new C2303e(this.f7592h);
            this.f7596l = new C2304f(this.f7592h);
        } else {
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
            this.f7595k = new C2305g(reentrantReadWriteLock);
            this.f7596l = new C2306h(reentrantReadWriteLock);
        }
        this.f7595k.mo8114a();
        m9886a(true);
        this.f7595k.mo8115b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0145, code lost:
        r1 = new java.lang.StringBuilder("Broken entry info at ");
        r1.append(r2);
        r1.append("! Skipping all the rest...");
        com.bytedance.android.p109c.p112b.C2286b.m9842b(r1.toString());
        r18 = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m9887a(int r20, int r21, com.bytedance.android.p109c.p112b.C2295h.C2300b r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r3 = r22
            int r4 = r1 - r20
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocateDirect(r4)
            byte[] r4 = r4.array()
            r5 = 0
            r2 = r20
            r7 = 0
        L_0x0014:
            if (r2 >= r1) goto L_0x015f
            java.nio.MappedByteBuffer r8 = r0.f7591g
            r8.position(r2)
            java.nio.MappedByteBuffer r8 = r0.f7591g
            r9 = 16
            r8.get(r4, r5, r9)
            int r8 = r5 + 1
            byte r5 = r4[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r10 = 24
            int r5 = r5 << r10
            int r11 = r8 + 1
            byte r8 = r4[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            int r8 = r8 << r9
            r5 = r5 | r8
            int r8 = r11 + 1
            byte r11 = r4[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r12 = 8
            int r11 = r11 << r12
            r5 = r5 | r11
            int r11 = r8 + 1
            byte r8 = r4[r8]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            int r8 = r11 + 1
            byte r11 = r4[r11]
            int r13 = r8 + 1
            byte r8 = r4[r8]
            r14 = -1
            if (r8 != r14) goto L_0x0145
            int r8 = r13 + 1
            byte r13 = r4[r13]
            if (r13 != r14) goto L_0x0145
            int r13 = r8 + 1
            byte r8 = r4[r8]
            if (r8 == r14) goto L_0x005d
            goto L_0x0145
        L_0x005d:
            int r8 = r13 + 1
            byte r13 = r4[r13]
            long r13 = (long) r13
            r15 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r15
            r17 = 56
            long r13 = r13 << r17
            int r17 = r8 + 1
            byte r8 = r4[r8]
            r18 = r7
            long r6 = (long) r8
            long r6 = r6 & r15
            r8 = 48
            long r6 = r6 << r8
            long r6 = r6 | r13
            int r8 = r17 + 1
            byte r13 = r4[r17]
            long r13 = (long) r13
            long r13 = r13 & r15
            r17 = 40
            long r13 = r13 << r17
            long r6 = r6 | r13
            int r13 = r8 + 1
            byte r8 = r4[r8]
            long r9 = (long) r8
            long r9 = r9 & r15
            r8 = 32
            long r8 = r9 << r8
            long r6 = r6 | r8
            int r8 = r13 + 1
            byte r9 = r4[r13]
            long r9 = (long) r9
            long r9 = r9 & r15
            r13 = 24
            long r9 = r9 << r13
            long r6 = r6 | r9
            int r9 = r8 + 1
            byte r8 = r4[r8]
            long r13 = (long) r8
            long r13 = r13 & r15
            r8 = 16
            long r13 = r13 << r8
            long r6 = r6 | r13
            int r8 = r9 + 1
            byte r9 = r4[r9]
            long r9 = (long) r9
            long r9 = r9 & r15
            long r9 = r9 << r12
            long r6 = r6 | r9
            int r9 = r8 + 1
            byte r8 = r4[r8]
            long r12 = (long) r8
            long r12 = r12 & r15
            long r6 = r6 | r12
            if (r5 > 0) goto L_0x00c8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected EOF at "
            r1.<init>(r3)
            r1.append(r9)
            java.lang.String r3 = "!"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.bytedance.android.p109c.p112b.C2286b.m9842b(r1)
            goto L_0x0161
        L_0x00c8:
            java.nio.MappedByteBuffer r8 = r0.f7591g
            r8.get(r4, r9, r5)
            long r12 = com.bytedance.android.p109c.p112b.C2274a.m9790a(r4, r9, r5)
            int r8 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0106
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Checksum failed at position: "
            r8.<init>(r10)
            r8.append(r2)
            java.lang.String r10 = ", expected: "
            r8.append(r10)
            r8.append(r6)
            java.lang.String r6 = ", found: "
            r8.append(r6)
            long r6 = com.bytedance.android.p109c.p112b.C2274a.m9790a(r4, r9, r5)
            r8.append(r6)
            java.lang.String r6 = ", skipping..."
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.bytedance.android.p109c.p112b.C2286b.m9842b(r6)
            int r5 = r5 + 16
            int r2 = r2 + r5
            r5 = r9
            r7 = 1
            goto L_0x0014
        L_0x0106:
            com.bytedance.android.c.b.c r6 = r0.f7600p     // Catch:{ Exception -> 0x012d }
            java.nio.MappedByteBuffer r7 = r0.f7591g     // Catch:{ Exception -> 0x012d }
            int r8 = r2 + 16
            com.bytedance.android.c.b.c r6 = r6.mo8089a(r7, r8, r5)     // Catch:{ Exception -> 0x012d }
            java.lang.String r6 = com.bytedance.android.p109c.p112b.p113a.C2283b.C2284a.m9824a(r6)     // Catch:{ Exception -> 0x012d }
            r7 = 1
            r2 = r11 & 1
            if (r2 == 0) goto L_0x0122
            com.bytedance.android.c.b.h$a r2 = new com.bytedance.android.c.b.h$a
            r2.<init>(r8, r5)
            r3.mo8112a(r6, r2)
            goto L_0x0126
        L_0x0122:
            r2 = 0
            r3.mo8113b(r6, r2)
        L_0x0126:
            int r2 = r8 + r5
            int r5 = r5 + r9
            r7 = r18
            goto L_0x0014
        L_0x012d:
            r7 = 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to decode data at: "
            r6.<init>(r8)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            com.bytedance.android.p109c.p112b.C2286b.m9842b(r6)
            int r5 = r5 + 16
            int r2 = r2 + r5
            r5 = r9
            goto L_0x0014
        L_0x0145:
            r7 = 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Broken entry info at "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r3 = "! Skipping all the rest..."
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.bytedance.android.p109c.p112b.C2286b.m9842b(r1)
            r18 = 1
            goto L_0x0161
        L_0x015f:
            r18 = r7
        L_0x0161:
            r0.f7589e = r2
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p109c.p112b.C2295h.m9887a(int, int, com.bytedance.android.c.b.h$b):boolean");
    }
}
