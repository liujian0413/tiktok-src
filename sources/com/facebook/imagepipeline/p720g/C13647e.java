package com.facebook.imagepipeline.p720g;

import android.graphics.ColorSpace;
import android.util.Pair;
import com.C1642a;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13310j;
import com.facebook.common.memory.C13323h;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.references.C13326a;
import com.facebook.imageformat.C13508b;
import com.facebook.imageformat.C13509c;
import com.facebook.imageformat.C13511d;
import com.facebook.imagepipeline.common.C13593a;
import com.facebook.imageutils.C13848e;
import com.facebook.imageutils.C13853h;
import com.facebook.imageutils.HeifExifUtil;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.g.e */
public class C13647e implements Closeable {

    /* renamed from: a */
    public C13509c f36258a;

    /* renamed from: b */
    public int f36259b;

    /* renamed from: c */
    public int f36260c;

    /* renamed from: d */
    public int f36261d;

    /* renamed from: e */
    public int f36262e;

    /* renamed from: f */
    public int f36263f;

    /* renamed from: g */
    public int f36264g;

    /* renamed from: h */
    public C13593a f36265h;

    /* renamed from: i */
    private final C13326a<PooledByteBuffer> f36266i;

    /* renamed from: j */
    private final C13310j<FileInputStream> f36267j;

    /* renamed from: k */
    private ColorSpace f36268k;

    /* renamed from: l */
    private ColorSpace m40240l() {
        m40241m();
        return this.f36268k;
    }

    /* renamed from: b */
    public final C13326a<PooledByteBuffer> mo33271b() {
        return C13326a.m39000b(this.f36266i);
    }

    public void close() {
        C13326a.m39001c(this.f36266i);
    }

    /* renamed from: e */
    public final int mo33277e() {
        m40241m();
        return this.f36259b;
    }

    /* renamed from: f */
    public final int mo33278f() {
        m40241m();
        return this.f36260c;
    }

    /* renamed from: g */
    public final int mo33279g() {
        m40241m();
        return this.f36261d;
    }

    /* renamed from: h */
    public final int mo33280h() {
        m40241m();
        return this.f36262e;
    }

    /* renamed from: m */
    private void m40241m() {
        if (this.f36261d < 0 || this.f36262e < 0) {
            mo33282j();
        }
    }

    /* renamed from: d */
    public final C13509c mo33276d() {
        m40241m();
        return this.f36258a;
    }

    /* renamed from: n */
    private Pair<Integer, Integer> m40242n() {
        Pair<Integer, Integer> a = C13853h.m40901a(mo33274c());
        if (a != null) {
            this.f36261d = ((Integer) a.first).intValue();
            this.f36262e = ((Integer) a.second).intValue();
        }
        return a;
    }

    /* renamed from: a */
    public final synchronized boolean mo33269a() {
        boolean z;
        if (C13326a.m38999a(this.f36266i) || this.f36267j != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: i */
    public final int mo33281i() {
        if (this.f36266i == null || this.f36266i.mo32609a() == null) {
            return this.f36264g;
        }
        return ((PooledByteBuffer) this.f36266i.mo32609a()).mo32575a();
    }

    /* renamed from: k */
    private C13647e m40239k() {
        C13647e eVar;
        C13647e eVar2;
        if (this.f36267j != null) {
            eVar = new C13647e(this.f36267j, this.f36264g);
        } else {
            C13326a b = C13326a.m39000b(this.f36266i);
            if (b == null) {
                eVar2 = null;
            } else {
                try {
                    eVar2 = new C13647e(b);
                } catch (Throwable th) {
                    C13326a.m39001c(b);
                    throw th;
                }
            }
            C13326a.m39001c(b);
            eVar = eVar2;
        }
        if (eVar != null) {
            eVar.mo33273b(this);
        }
        return eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030 A[SYNTHETIC, Splitter:B:15:0x0030] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.facebook.imageutils.C13847d m40244p() {
        /*
            r4 = this;
            java.io.InputStream r0 = r4.mo33274c()     // Catch:{ all -> 0x002c }
            com.facebook.imageutils.d r1 = com.facebook.imageutils.C13844a.m40888b(r0)     // Catch:{ all -> 0x002a }
            android.graphics.ColorSpace r2 = r1.f36713b     // Catch:{ all -> 0x002a }
            r4.f36268k = r2     // Catch:{ all -> 0x002a }
            android.util.Pair<java.lang.Integer, java.lang.Integer> r2 = r1.f36712a     // Catch:{ all -> 0x002a }
            if (r2 == 0) goto L_0x0024
            java.lang.Object r3 = r2.first     // Catch:{ all -> 0x002a }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x002a }
            int r3 = r3.intValue()     // Catch:{ all -> 0x002a }
            r4.f36261d = r3     // Catch:{ all -> 0x002a }
            java.lang.Object r2 = r2.second     // Catch:{ all -> 0x002a }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x002a }
            int r2 = r2.intValue()     // Catch:{ all -> 0x002a }
            r4.f36262e = r2     // Catch:{ all -> 0x002a }
        L_0x0024:
            if (r0 == 0) goto L_0x0029
            r0.close()     // Catch:{ IOException -> 0x0029 }
        L_0x0029:
            return r1
        L_0x002a:
            r1 = move-exception
            goto L_0x002e
        L_0x002c:
            r1 = move-exception
            r0 = 0
        L_0x002e:
            if (r0 == 0) goto L_0x0033
            r0.close()     // Catch:{ IOException -> 0x0033 }
        L_0x0033:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p720g.C13647e.m40244p():com.facebook.imageutils.d");
    }

    /* renamed from: c */
    public final InputStream mo33274c() {
        if (this.f36267j != null) {
            return (InputStream) this.f36267j.mo29879b();
        }
        C13326a b = C13326a.m39000b(this.f36266i);
        if (b == null) {
            return null;
        }
        try {
            return new C13323h((PooledByteBuffer) b.mo32609a());
        } finally {
            C13326a.m39001c(b);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0047 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Pair<java.lang.Integer, java.lang.Integer> m40243o() {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.mo33274c()
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 8192(0x2000, float:1.14794E-41)
            r3 = 1
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
        L_0x000e:
            int r4 = r0.read(r2)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L_0x001a
            r1.write(r2, r6, r4)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            goto L_0x000e
        L_0x001a:
            byte[] r0 = r1.toByteArray()     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            int r2 = r0.length     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            int[] r0 = com.facebook.imageutils.C13846c.m40890a(r0, r2)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            if (r0 == 0) goto L_0x0047
            r2 = r0[r6]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r7.f36261d = r2     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r2 = r0[r3]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r7.f36262e = r2     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r2 = 2
            r2 = r0[r2]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r7.f36259b = r2     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r4 = r0[r6]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r0 = r0[r3]     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            r2.<init>(r4, r0)     // Catch:{ IOException -> 0x0047, all -> 0x004b }
            com.facebook.common.internal.C13300b.m38926a(r1, r3)     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            return r2
        L_0x0047:
            com.facebook.common.internal.C13300b.m38926a(r1, r3)     // Catch:{ IOException -> 0x0050 }
            goto L_0x0050
        L_0x004b:
            r0 = move-exception
            com.facebook.common.internal.C13300b.m38926a(r1, r3)     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            throw r0
        L_0x0050:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.p720g.C13647e.m40243o():android.util.Pair");
    }

    /* renamed from: j */
    public final void mo33282j() {
        Pair<Integer, Integer> pair;
        C13509c a = C13511d.m39757a(mo33274c());
        this.f36258a = a;
        if (C13508b.m39751a(a)) {
            pair = m40242n();
        } else if (C13508b.m39753c(a)) {
            pair = m40243o();
        } else {
            pair = m40244p().f36712a;
        }
        if (a == C13508b.f35825a && this.f36259b == -1) {
            if (pair != null) {
                this.f36260c = C13848e.m40892a(mo33274c());
                this.f36259b = C13848e.m40891a(this.f36260c);
            }
        } else if (a == C13508b.f35835k && this.f36259b == -1) {
            this.f36260c = HeifExifUtil.m40883a(mo33274c());
            this.f36259b = C13848e.m40891a(this.f36260c);
        } else {
            this.f36259b = 0;
        }
    }

    /* renamed from: d */
    public static void m40237d(C13647e eVar) {
        if (eVar != null) {
            eVar.close();
        }
    }

    /* renamed from: a */
    public static C13647e m40235a(C13647e eVar) {
        if (eVar != null) {
            return eVar.m40239k();
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m40236c(C13647e eVar) {
        if (eVar.f36259b < 0 || eVar.f36261d < 0 || eVar.f36262e < 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m40238e(C13647e eVar) {
        if (eVar == null || !eVar.mo33269a()) {
            return false;
        }
        return true;
    }

    private C13647e(C13310j<FileInputStream> jVar) {
        this.f36258a = C13509c.f35837a;
        this.f36259b = -1;
        this.f36261d = -1;
        this.f36262e = -1;
        this.f36263f = 1;
        this.f36264g = -1;
        C13307g.m38940a(jVar);
        this.f36266i = null;
        this.f36267j = jVar;
    }

    public C13647e(C13326a<PooledByteBuffer> aVar) {
        this.f36258a = C13509c.f35837a;
        this.f36259b = -1;
        this.f36261d = -1;
        this.f36262e = -1;
        this.f36263f = 1;
        this.f36264g = -1;
        C13307g.m38943a(C13326a.m38999a(aVar));
        this.f36266i = aVar.clone();
        this.f36267j = null;
    }

    /* renamed from: a */
    public final boolean mo33270a(int i) {
        if (this.f36258a != C13508b.f35825a || this.f36267j != null) {
            return true;
        }
        C13307g.m38940a(this.f36266i);
        PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) this.f36266i.mo32609a();
        if (pooledByteBuffer.mo32574a(i - 2) == -1 && pooledByteBuffer.mo32574a(i - 1) == -39) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo33273b(C13647e eVar) {
        this.f36258a = eVar.mo33276d();
        this.f36261d = eVar.mo33279g();
        this.f36262e = eVar.mo33280h();
        this.f36259b = eVar.mo33277e();
        this.f36260c = eVar.mo33278f();
        this.f36263f = eVar.f36263f;
        this.f36264g = eVar.mo33281i();
        this.f36265h = eVar.f36265h;
        this.f36268k = eVar.m40240l();
    }

    /* renamed from: b */
    public final String mo33272b(int i) {
        C13326a b = mo33271b();
        if (b == null) {
            return "";
        }
        int min = Math.min(mo33281i(), 10);
        byte[] bArr = new byte[min];
        try {
            PooledByteBuffer pooledByteBuffer = (PooledByteBuffer) b.mo32609a();
            if (pooledByteBuffer == null) {
                return "";
            }
            pooledByteBuffer.mo32576a(0, bArr, 0, min);
            b.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i2 = 0; i2 < min; i2++) {
                sb.append(C1642a.m8034a("%02X", new Object[]{Byte.valueOf(bArr[i2])}));
            }
            return sb.toString();
        } finally {
            b.close();
        }
    }

    private C13647e(C13310j<FileInputStream> jVar, int i) {
        this(jVar);
        this.f36264g = i;
    }
}
