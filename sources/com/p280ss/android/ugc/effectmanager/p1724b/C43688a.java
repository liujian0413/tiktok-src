package com.p280ss.android.ugc.effectmanager.p1724b;

import com.taobao.android.dexposed.ClassUtils;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.b.a */
public final class C43688a implements Closeable {

    /* renamed from: a */
    static final Pattern f113096a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: h */
    public static final OutputStream f113097h = new OutputStream() {
        public final void write(int i) throws IOException {
        }
    };

    /* renamed from: b */
    public final File f113098b;

    /* renamed from: c */
    public final int f113099c;

    /* renamed from: d */
    public int f113100d;

    /* renamed from: e */
    public boolean f113101e;

    /* renamed from: f */
    public boolean f113102f;

    /* renamed from: g */
    final ThreadPoolExecutor f113103g;

    /* renamed from: i */
    private final File f113104i;

    /* renamed from: j */
    private final File f113105j;

    /* renamed from: k */
    private final File f113106k;

    /* renamed from: l */
    private final int f113107l;

    /* renamed from: m */
    private long f113108m;

    /* renamed from: n */
    private long f113109n;

    /* renamed from: o */
    private Writer f113110o;

    /* renamed from: p */
    private final LinkedHashMap<String, C43693b> f113111p = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: q */
    private long f113112q = 0;

    /* renamed from: r */
    private final Callable<Void> f113113r;

    /* renamed from: com.ss.android.ugc.effectmanager.b.a$a */
    public final class C43691a {

        /* renamed from: a */
        public final C43693b f113115a;

        /* renamed from: b */
        public final boolean[] f113116b;

        /* renamed from: c */
        public boolean f113117c;

        /* renamed from: e */
        private boolean f113119e;

        /* renamed from: com.ss.android.ugc.effectmanager.b.a$a$a */
        class C43692a extends FilterOutputStream {
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C43691a.this.f113117c = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C43691a.this.f113117c = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C43691a.this.f113117c = true;
                }
            }

            private C43692a(OutputStream outputStream) {
                super(outputStream);
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C43691a.this.f113117c = true;
                }
            }
        }

        /* renamed from: b */
        public final void mo105702b() throws IOException {
            C43688a.this.mo105689a(this, false);
        }

        /* renamed from: c */
        public final void mo105703c() {
            if (!this.f113119e) {
                try {
                    mo105702b();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo105701a() throws IOException {
            if (this.f113117c) {
                C43688a.this.mo105689a(this, false);
                C43688a.this.mo105693c(this.f113115a.f113121a);
            } else {
                C43688a.this.mo105689a(this, true);
            }
            this.f113119e = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream mo105700a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                com.ss.android.ugc.effectmanager.b.a r4 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this
                int r4 = r4.f113099c
                r0 = 0
                if (r4 <= 0) goto L_0x0048
                com.ss.android.ugc.effectmanager.b.a r4 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this
                monitor-enter(r4)
                com.ss.android.ugc.effectmanager.b.a$b r1 = r3.f113115a     // Catch:{ all -> 0x0045 }
                com.ss.android.ugc.effectmanager.b.a$a r1 = r1.f113124d     // Catch:{ all -> 0x0045 }
                if (r1 != r3) goto L_0x003f
                com.ss.android.ugc.effectmanager.b.a$b r1 = r3.f113115a     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.f113123c     // Catch:{ all -> 0x0045 }
                if (r1 != 0) goto L_0x001b
                boolean[] r1 = r3.f113116b     // Catch:{ all -> 0x0045 }
                r2 = 1
                r1[r0] = r2     // Catch:{ all -> 0x0045 }
            L_0x001b:
                com.ss.android.ugc.effectmanager.b.a$b r1 = r3.f113115a     // Catch:{ all -> 0x0045 }
                java.io.File r0 = r1.mo105711b(r0)     // Catch:{ all -> 0x0045 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0027 }
                r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0027 }
                goto L_0x0033
            L_0x0027:
                com.ss.android.ugc.effectmanager.b.a r1 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this     // Catch:{ all -> 0x0045 }
                java.io.File r1 = r1.f113098b     // Catch:{ all -> 0x0045 }
                r1.mkdirs()     // Catch:{ all -> 0x0045 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003b }
                r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x003b }
            L_0x0033:
                com.ss.android.ugc.effectmanager.b.a$a$a r0 = new com.ss.android.ugc.effectmanager.b.a$a$a     // Catch:{ all -> 0x0045 }
                r2 = 0
                r0.<init>(r1)     // Catch:{ all -> 0x0045 }
                monitor-exit(r4)     // Catch:{ all -> 0x0045 }
                return r0
            L_0x003b:
                java.io.OutputStream r0 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.f113097h     // Catch:{ all -> 0x0045 }
                monitor-exit(r4)     // Catch:{ all -> 0x0045 }
                return r0
            L_0x003f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0045 }
                r0.<init>()     // Catch:{ all -> 0x0045 }
                throw r0     // Catch:{ all -> 0x0045 }
            L_0x0045:
                r0 = move-exception
                monitor-exit(r4)     // Catch:{ all -> 0x0045 }
                throw r0
            L_0x0048:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Expected index "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r0 = " to be greater than 0 and less than the maximum value count of "
                r1.append(r0)
                com.ss.android.ugc.effectmanager.b.a r0 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this
                int r0 = r0.f113099c
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.p1724b.C43688a.C43691a.mo105700a(int):java.io.OutputStream");
        }

        private C43691a(C43693b bVar) {
            boolean[] zArr;
            this.f113115a = bVar;
            if (bVar.f113123c) {
                zArr = null;
            } else {
                zArr = new boolean[C43688a.this.f113099c];
            }
            this.f113116b = zArr;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.b.a$b */
    final class C43693b {

        /* renamed from: a */
        public final String f113121a;

        /* renamed from: b */
        public final long[] f113122b;

        /* renamed from: c */
        public boolean f113123c;

        /* renamed from: d */
        public C43691a f113124d;

        /* renamed from: e */
        public long f113125e;

        /* renamed from: a */
        public final String mo105709a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f113122b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private static IOException m138452b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public final File mo105708a(int i) {
            File file = C43688a.this.f113098b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f113121a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            return new File(file, sb.toString());
        }

        /* renamed from: b */
        public final File mo105711b(int i) {
            File file = C43688a.this.f113098b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f113121a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            sb.append(".tmp");
            return new File(file, sb.toString());
        }

        /* renamed from: a */
        public final void mo105710a(String[] strArr) throws IOException {
            if (strArr.length == C43688a.this.f113099c) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f113122b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m138452b(strArr);
                    }
                }
                return;
            }
            throw m138452b(strArr);
        }

        private C43693b(String str) {
            this.f113121a = str;
            this.f113122b = new long[C43688a.this.f113099c];
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.b.a$c */
    public final class C43694c implements Closeable {

        /* renamed from: b */
        private final String f113128b;

        /* renamed from: c */
        private final long f113129c;

        /* renamed from: d */
        private final File[] f113130d;

        /* renamed from: e */
        private final InputStream[] f113131e;

        /* renamed from: f */
        private final long[] f113132f;

        public final void close() {
            for (InputStream a : this.f113131e) {
                C43697c.m138462a((Closeable) a);
            }
        }

        /* renamed from: a */
        public final InputStream mo105712a(int i) {
            return this.f113131e[0];
        }

        /* renamed from: b */
        public final File mo105713b(int i) {
            return this.f113130d[0];
        }

        private C43694c(String str, long j, File[] fileArr, InputStream[] inputStreamArr, long[] jArr) {
            this.f113128b = str;
            this.f113129c = j;
            this.f113130d = fileArr;
            this.f113131e = inputStreamArr;
            this.f113132f = jArr;
        }
    }

    /* renamed from: j */
    private synchronized boolean m138435j() {
        return this.f113102f;
    }

    /* renamed from: k */
    private void m138436k() {
        if (m138435j()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: e */
    public final void mo105696e() throws IOException {
        close();
        C43697c.m138463a(this.f113098b);
    }

    /* renamed from: b */
    public final boolean mo105691b() {
        if (this.f113100d < 2000 || this.f113100d < this.f113111p.size()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final synchronized void mo105692c() throws IOException {
        if (this.f113101e) {
            m138436k();
            mo105695d();
            this.f113110o.flush();
        }
    }

    /* renamed from: f */
    public final Set<String> mo105697f() throws IOException {
        Set<String> unmodifiableSet;
        synchronized (this) {
            m138432g();
            unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(this.f113111p.keySet()));
        }
        return unmodifiableSet;
    }

    /* renamed from: d */
    public final void mo105695d() throws IOException {
        while (this.f113109n > this.f113108m) {
            mo105693c((String) ((Entry) this.f113111p.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: i */
    private void m138434i() throws IOException {
        m138428a(this.f113105j);
        Iterator it = this.f113111p.values().iterator();
        while (it.hasNext()) {
            C43693b bVar = (C43693b) it.next();
            int i = 0;
            if (bVar.f113124d == null) {
                while (i < this.f113099c) {
                    this.f113109n += bVar.f113122b[i];
                    i++;
                }
            } else {
                bVar.f113124d = null;
                while (i < this.f113099c) {
                    m138428a(bVar.mo105708a(i));
                    m138428a(bVar.mo105711b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f113101e) {
            if (!this.f113102f) {
                Iterator it = new ArrayList(this.f113111p.values()).iterator();
                while (it.hasNext()) {
                    C43693b bVar = (C43693b) it.next();
                    if (bVar.f113124d != null) {
                        bVar.f113124d.mo105702b();
                    }
                }
                mo105695d();
                this.f113110o.close();
                this.f113110o = null;
                this.f113102f = true;
                return;
            }
        }
        this.f113102f = true;
    }

    /* renamed from: g */
    private synchronized void m138432g() throws IOException {
        if (!this.f113101e) {
            if (this.f113106k.exists()) {
                if (!this.f113104i.exists()) {
                    m138429a(this.f113106k, this.f113104i, false);
                } else if (this.f113106k.delete()) {
                    if (this.f113106k.exists()) {
                        StringBuilder sb = new StringBuilder("failed to delete ");
                        sb.append(this.f113106k);
                        throw new IOException(sb.toString());
                    }
                }
            }
            if (this.f113104i.exists()) {
                try {
                    m138433h();
                    m138434i();
                    this.f113101e = true;
                    return;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb2 = new StringBuilder("DiskLruCache ");
                    sb2.append(this.f113098b);
                    sb2.append(" is corrupt: ");
                    sb2.append(e.getMessage());
                    sb2.append(", removing");
                    printStream.println(sb2.toString());
                    mo105696e();
                    this.f113102f = false;
                } catch (Throwable th) {
                    this.f113102f = false;
                    throw th;
                }
            }
            mo105688a();
            this.f113101e = true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8.f113100d = r1 - r8.f113111p.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r0.mo105716b() != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        mo105688a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r8.f113110o = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r8.f113104i, true), com.p280ss.android.ugc.effectmanager.p1724b.C43697c.f113139a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008a=Splitter:B:23:0x008a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m138433h() throws java.io.IOException {
        /*
            r8 = this;
            com.ss.android.ugc.effectmanager.b.b r0 = new com.ss.android.ugc.effectmanager.b.b
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r8.f113104i
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.p280ss.android.ugc.effectmanager.p1724b.C43697c.f113139a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.mo105715a()     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = r0.mo105715a()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = r0.mo105715a()     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r0.mo105715a()     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = r0.mo105715a()     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x008a
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x008a
            int r6 = r8.f113107l     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x00bb }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x008a
            int r3 = r8.f113099c     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x00bb }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x008a
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x008a
            r1 = 0
        L_0x0053:
            java.lang.String r2 = r0.mo105715a()     // Catch:{ EOFException -> 0x005d }
            r8.m138430d(r2)     // Catch:{ EOFException -> 0x005d }
            int r1 = r1 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r2 = r8.f113111p     // Catch:{ all -> 0x00bb }
            int r2 = r2.size()     // Catch:{ all -> 0x00bb }
            int r1 = r1 - r2
            r8.f113100d = r1     // Catch:{ all -> 0x00bb }
            boolean r1 = r0.mo105716b()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0070
            r8.mo105688a()     // Catch:{ all -> 0x00bb }
            goto L_0x0086
        L_0x0070:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bb }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bb }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bb }
            java.io.File r4 = r8.f113104i     // Catch:{ all -> 0x00bb }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00bb }
            java.nio.charset.Charset r4 = com.p280ss.android.ugc.effectmanager.p1724b.C43697c.f113139a     // Catch:{ all -> 0x00bb }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00bb }
            r1.<init>(r2)     // Catch:{ all -> 0x00bb }
            r8.f113110o = r1     // Catch:{ all -> 0x00bb }
        L_0x0086:
            com.p280ss.android.ugc.effectmanager.p1724b.C43697c.m138462a(r0)
            return
        L_0x008a:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x00bb }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = "unexpected journal header: ["
            r6.<init>(r7)     // Catch:{ all -> 0x00bb }
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            r6.append(r2)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            r6.append(r4)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = ", "
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            r6.append(r5)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = "]"
            r6.append(r1)     // Catch:{ all -> 0x00bb }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x00bb }
            r3.<init>(r1)     // Catch:{ all -> 0x00bb }
            throw r3     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r1 = move-exception
            com.p280ss.android.ugc.effectmanager.p1724b.C43697c.m138462a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.p1724b.C43688a.m138433h():void");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:1|2|(1:4)|5|6|7|8|9|10|(8:11|12|(4:15|(2:17|34)(2:18|35)|33|13)|19|20|(1:22)|23|24)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0012 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo105688a() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.f113110o     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x000a
            java.io.Writer r0 = r6.f113110o     // Catch:{ all -> 0x00f0 }
            r0.close()     // Catch:{ all -> 0x00f0 }
        L_0x000a:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0012 }
            java.io.File r1 = r6.f113105j     // Catch:{ FileNotFoundException -> 0x0012 }
            r0.<init>(r1)     // Catch:{ FileNotFoundException -> 0x0012 }
            goto L_0x0022
        L_0x0012:
            java.io.File r0 = r6.f113105j     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r0.getParentFile()     // Catch:{ all -> 0x00f0 }
            r0.mkdirs()     // Catch:{ all -> 0x00f0 }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f0 }
            java.io.File r1 = r6.f113105j     // Catch:{ all -> 0x00f0 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f0 }
        L_0x0022:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00f0 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00f0 }
            java.nio.charset.Charset r3 = com.p280ss.android.ugc.effectmanager.p1724b.C43697c.f113139a     // Catch:{ all -> 0x00f0 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x00f0 }
            r1.<init>(r2)     // Catch:{ all -> 0x00f0 }
            java.lang.String r0 = "libcore.io.DiskLruCache"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "1"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            int r0 = r6.f113107l     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00eb }
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            int r0 = r6.f113099c     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x00eb }
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.lang.String r0 = "\n"
            r1.write(r0)     // Catch:{ all -> 0x00eb }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r6.f113111p     // Catch:{ all -> 0x00eb }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00eb }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00eb }
        L_0x006d:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x00eb }
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x00eb }
            com.ss.android.ugc.effectmanager.b.a$b r2 = (com.p280ss.android.ugc.effectmanager.p1724b.C43688a.C43693b) r2     // Catch:{ all -> 0x00eb }
            com.ss.android.ugc.effectmanager.b.a$a r3 = r2.f113124d     // Catch:{ all -> 0x00eb }
            r4 = 10
            if (r3 == 0) goto L_0x0096
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "DIRTY "
            r3.<init>(r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r2.f113121a     // Catch:{ all -> 0x00eb }
            r3.append(r2)     // Catch:{ all -> 0x00eb }
            r3.append(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00eb }
            r1.write(r2)     // Catch:{ all -> 0x00eb }
            goto L_0x006d
        L_0x0096:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = "CLEAN "
            r3.<init>(r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r5 = r2.f113121a     // Catch:{ all -> 0x00eb }
            r3.append(r5)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r2.mo105709a()     // Catch:{ all -> 0x00eb }
            r3.append(r2)     // Catch:{ all -> 0x00eb }
            r3.append(r4)     // Catch:{ all -> 0x00eb }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x00eb }
            r1.write(r2)     // Catch:{ all -> 0x00eb }
            goto L_0x006d
        L_0x00b4:
            r1.close()     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r6.f113104i     // Catch:{ all -> 0x00f0 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x00f0 }
            r1 = 1
            if (r0 == 0) goto L_0x00c7
            java.io.File r0 = r6.f113104i     // Catch:{ all -> 0x00f0 }
            java.io.File r2 = r6.f113106k     // Catch:{ all -> 0x00f0 }
            m138429a(r0, r2, r1)     // Catch:{ all -> 0x00f0 }
        L_0x00c7:
            java.io.File r0 = r6.f113105j     // Catch:{ all -> 0x00f0 }
            java.io.File r2 = r6.f113104i     // Catch:{ all -> 0x00f0 }
            r3 = 0
            m138429a(r0, r2, r3)     // Catch:{ all -> 0x00f0 }
            java.io.File r0 = r6.f113106k     // Catch:{ all -> 0x00f0 }
            r0.delete()     // Catch:{ all -> 0x00f0 }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00f0 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00f0 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00f0 }
            java.io.File r4 = r6.f113104i     // Catch:{ all -> 0x00f0 }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x00f0 }
            java.nio.charset.Charset r1 = com.p280ss.android.ugc.effectmanager.p1724b.C43697c.f113139a     // Catch:{ all -> 0x00f0 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x00f0 }
            r0.<init>(r2)     // Catch:{ all -> 0x00f0 }
            r6.f113110o = r0     // Catch:{ all -> 0x00f0 }
            monitor-exit(r6)
            return
        L_0x00eb:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.p1724b.C43688a.mo105688a():void");
    }

    /* renamed from: b */
    public final C43691a mo105690b(String str) throws IOException {
        return m138426a(str, -1);
    }

    /* renamed from: a */
    private static void m138428a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: e */
    private static void m138431e(String str) {
        if (!f113096a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    private void m138430d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f113111p.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C43693b bVar = (C43693b) this.f113111p.get(str2);
            if (bVar == null) {
                bVar = new C43693b(str2);
                this.f113111p.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f113123c = true;
                bVar.f113124d = null;
                bVar.mo105710a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f113124d = new C43691a(bVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                StringBuilder sb = new StringBuilder("unexpected journal line: ");
                sb.append(str);
                throw new IOException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0087, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0089, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo105693c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m138432g()     // Catch:{ all -> 0x008a }
            r7.m138436k()     // Catch:{ all -> 0x008a }
            m138431e(r8)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r7.f113111p     // Catch:{ all -> 0x008a }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008a }
            com.ss.android.ugc.effectmanager.b.a$b r0 = (com.p280ss.android.ugc.effectmanager.p1724b.C43688a.C43693b) r0     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x0088
            com.ss.android.ugc.effectmanager.b.a$a r2 = r0.f113124d     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x001a
            goto L_0x0088
        L_0x001a:
            int r2 = r7.f113099c     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x0056
            java.io.File r2 = r0.mo105708a(r1)     // Catch:{ all -> 0x008a }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008a }
            if (r3 == 0) goto L_0x002f
            goto L_0x0043
        L_0x002f:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008a }
            r8.<init>(r0)     // Catch:{ all -> 0x008a }
            throw r8     // Catch:{ all -> 0x008a }
        L_0x0043:
            long r2 = r7.f113109n     // Catch:{ all -> 0x008a }
            long[] r4 = r0.f113122b     // Catch:{ all -> 0x008a }
            r5 = r4[r1]     // Catch:{ all -> 0x008a }
            r4 = 0
            long r2 = r2 - r5
            r7.f113109n = r2     // Catch:{ all -> 0x008a }
            long[] r2 = r0.f113122b     // Catch:{ all -> 0x008a }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008a }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x0056:
            int r0 = r7.f113100d     // Catch:{ all -> 0x008a }
            r1 = 1
            int r0 = r0 + r1
            r7.f113100d = r0     // Catch:{ all -> 0x008a }
            java.io.Writer r0 = r7.f113110o     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch:{ all -> 0x008a }
            r2.append(r8)     // Catch:{ all -> 0x008a }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x008a }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x008a }
            r0.append(r2)     // Catch:{ all -> 0x008a }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r7.f113111p     // Catch:{ all -> 0x008a }
            r0.remove(r8)     // Catch:{ all -> 0x008a }
            boolean r8 = r7.mo105691b()     // Catch:{ all -> 0x008a }
            if (r8 == 0) goto L_0x0086
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f113103g     // Catch:{ all -> 0x008a }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f113113r     // Catch:{ all -> 0x008a }
            r8.submit(r0)     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r7)
            return r1
        L_0x0088:
            monitor-exit(r7)
            return r1
        L_0x008a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.p1724b.C43688a.mo105693c(java.lang.String):boolean");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r12.f113100d++;
        r1 = r12.f113110o;
        r2 = new java.lang.StringBuilder("READ ");
        r2.append(r13);
        r2.append(10);
        r1.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005f, code lost:
        if (mo105691b() == false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r12.f113103g.submit(r12.f113113r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r3 = new com.p280ss.android.ugc.effectmanager.p1724b.C43688a.C43694c(r12, r13, r0.f113125e, r8, r9, r0.f113122b, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0077 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p280ss.android.ugc.effectmanager.p1724b.C43688a.C43694c mo105687a(java.lang.String r13) throws java.io.IOException {
        /*
            r12 = this;
            monitor-enter(r12)
            r12.m138432g()     // Catch:{ all -> 0x0089 }
            r12.m138436k()     // Catch:{ all -> 0x0089 }
            m138431e(r13)     // Catch:{ all -> 0x0089 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r0 = r12.f113111p     // Catch:{ all -> 0x0089 }
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x0089 }
            com.ss.android.ugc.effectmanager.b.a$b r0 = (com.p280ss.android.ugc.effectmanager.p1724b.C43688a.C43693b) r0     // Catch:{ all -> 0x0089 }
            r1 = 0
            if (r0 != 0) goto L_0x0017
            monitor-exit(r12)
            return r1
        L_0x0017:
            boolean r2 = r0.f113123c     // Catch:{ all -> 0x0089 }
            if (r2 != 0) goto L_0x001d
            monitor-exit(r12)
            return r1
        L_0x001d:
            int r2 = r12.f113099c     // Catch:{ all -> 0x0089 }
            java.io.InputStream[] r9 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0089 }
            int r2 = r12.f113099c     // Catch:{ all -> 0x0089 }
            java.io.File[] r8 = new java.io.File[r2]     // Catch:{ all -> 0x0089 }
            r2 = 0
            r3 = 0
        L_0x0027:
            int r4 = r12.f113099c     // Catch:{ FileNotFoundException -> 0x0077 }
            if (r3 >= r4) goto L_0x003d
            java.io.File r4 = r0.mo105708a(r3)     // Catch:{ FileNotFoundException -> 0x0077 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0077 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0077 }
            r5 = r8[r3]     // Catch:{ FileNotFoundException -> 0x0077 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0077 }
            r9[r3] = r4     // Catch:{ FileNotFoundException -> 0x0077 }
            int r3 = r3 + 1
            goto L_0x0027
        L_0x003d:
            int r1 = r12.f113100d     // Catch:{ all -> 0x0089 }
            int r1 = r1 + 1
            r12.f113100d = r1     // Catch:{ all -> 0x0089 }
            java.io.Writer r1 = r12.f113110o     // Catch:{ all -> 0x0089 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            java.lang.String r3 = "READ "
            r2.<init>(r3)     // Catch:{ all -> 0x0089 }
            r2.append(r13)     // Catch:{ all -> 0x0089 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0089 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0089 }
            r1.append(r2)     // Catch:{ all -> 0x0089 }
            boolean r1 = r12.mo105691b()     // Catch:{ all -> 0x0089 }
            if (r1 == 0) goto L_0x0068
            java.util.concurrent.ThreadPoolExecutor r1 = r12.f113103g     // Catch:{ all -> 0x0089 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r12.f113113r     // Catch:{ all -> 0x0089 }
            r1.submit(r2)     // Catch:{ all -> 0x0089 }
        L_0x0068:
            com.ss.android.ugc.effectmanager.b.a$c r1 = new com.ss.android.ugc.effectmanager.b.a$c     // Catch:{ all -> 0x0089 }
            long r6 = r0.f113125e     // Catch:{ all -> 0x0089 }
            long[] r10 = r0.f113122b     // Catch:{ all -> 0x0089 }
            r11 = 0
            r3 = r1
            r4 = r12
            r5 = r13
            r3.<init>(r5, r6, r8, r9, r10)     // Catch:{ all -> 0x0089 }
            monitor-exit(r12)
            return r1
        L_0x0077:
            int r13 = r12.f113099c     // Catch:{ all -> 0x0089 }
            if (r2 >= r13) goto L_0x0087
            r13 = r9[r2]     // Catch:{ all -> 0x0089 }
            if (r13 == 0) goto L_0x0087
            r13 = r9[r2]     // Catch:{ all -> 0x0089 }
            com.p280ss.android.ugc.effectmanager.p1724b.C43697c.m138462a(r13)     // Catch:{ all -> 0x0089 }
            int r2 = r2 + 1
            goto L_0x0077
        L_0x0087:
            monitor-exit(r12)
            return r1
        L_0x0089:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.p1724b.C43688a.mo105687a(java.lang.String):com.ss.android.ugc.effectmanager.b.a$c");
    }

    /* renamed from: a */
    private synchronized C43691a m138426a(String str, long j) throws IOException {
        m138432g();
        m138436k();
        m138431e(str);
        C43693b bVar = (C43693b) this.f113111p.get(str);
        if (bVar == null) {
            bVar = new C43693b(str);
            this.f113111p.put(str, bVar);
        } else if (bVar.f113124d != null) {
            return null;
        }
        C43691a aVar = new C43691a(bVar);
        bVar.f113124d = aVar;
        Writer writer = this.f113110o;
        StringBuilder sb = new StringBuilder("DIRTY ");
        sb.append(str);
        sb.append(10);
        writer.write(sb.toString());
        this.f113110o.flush();
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo105689a(com.p280ss.android.ugc.effectmanager.p1724b.C43688a.C43691a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ss.android.ugc.effectmanager.b.a$b r0 = r10.f113115a     // Catch:{ all -> 0x00f1 }
            com.ss.android.ugc.effectmanager.b.a$a r1 = r0.f113124d     // Catch:{ all -> 0x00f1 }
            if (r1 != r10) goto L_0x00eb
            r1 = 0
            if (r11 == 0) goto L_0x0042
            boolean r2 = r0.f113123c     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x0042
            r2 = 0
        L_0x000f:
            int r3 = r9.f113099c     // Catch:{ all -> 0x00f1 }
            if (r2 >= r3) goto L_0x0042
            boolean[] r3 = r10.f113116b     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f1 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.mo105711b(r2)     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x0028
            r10.mo105702b()     // Catch:{ all -> 0x00f1 }
            monitor-exit(r9)
            return
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002b:
            r10.mo105702b()     // Catch:{ all -> 0x00f1 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f1 }
            throw r10     // Catch:{ all -> 0x00f1 }
        L_0x0042:
            int r10 = r9.f113099c     // Catch:{ all -> 0x00f1 }
            if (r1 >= r10) goto L_0x0073
            java.io.File r10 = r0.mo105711b(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x006d
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0070
            java.io.File r2 = r0.mo105708a(r1)     // Catch:{ all -> 0x00f1 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f113122b     // Catch:{ all -> 0x00f1 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f1 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f113122b     // Catch:{ all -> 0x00f1 }
            r10[r1] = r5     // Catch:{ all -> 0x00f1 }
            long r7 = r9.f113109n     // Catch:{ all -> 0x00f1 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f113109n = r7     // Catch:{ all -> 0x00f1 }
            goto L_0x0070
        L_0x006d:
            m138428a(r10)     // Catch:{ all -> 0x00f1 }
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0073:
            int r10 = r9.f113100d     // Catch:{ all -> 0x00f1 }
            r1 = 1
            int r10 = r10 + r1
            r9.f113100d = r10     // Catch:{ all -> 0x00f1 }
            r10 = 0
            r0.f113124d = r10     // Catch:{ all -> 0x00f1 }
            boolean r10 = r0.f113123c     // Catch:{ all -> 0x00f1 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b0
            r0.f113123c = r1     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f113110o     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.f113121a     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.mo105709a()     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            r1.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x00cf
            long r10 = r9.f113112q     // Catch:{ all -> 0x00f1 }
            r1 = 1
            long r1 = r1 + r10
            r9.f113112q = r1     // Catch:{ all -> 0x00f1 }
            r0.f113125e = r10     // Catch:{ all -> 0x00f1 }
            goto L_0x00cf
        L_0x00b0:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.b.a$b> r10 = r9.f113111p     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r0.f113121a     // Catch:{ all -> 0x00f1 }
            r10.remove(r11)     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f113110o     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "REMOVE "
            r11.<init>(r1)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.f113121a     // Catch:{ all -> 0x00f1 }
            r11.append(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00cf:
            java.io.Writer r10 = r9.f113110o     // Catch:{ all -> 0x00f1 }
            r10.flush()     // Catch:{ all -> 0x00f1 }
            long r10 = r9.f113109n     // Catch:{ all -> 0x00f1 }
            long r0 = r9.f113108m     // Catch:{ all -> 0x00f1 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            boolean r10 = r9.mo105691b()     // Catch:{ all -> 0x00f1 }
            if (r10 == 0) goto L_0x00e9
        L_0x00e2:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f113103g     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f113113r     // Catch:{ all -> 0x00f1 }
            r10.submit(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00e9:
            monitor-exit(r9)
            return
        L_0x00eb:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            r10.<init>()     // Catch:{ all -> 0x00f1 }
            throw r10     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.p1724b.C43688a.mo105689a(com.ss.android.ugc.effectmanager.b.a$a, boolean):void");
    }

    /* renamed from: a */
    private static void m138429a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m138428a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public static C43688a m138427a(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            C43688a aVar = new C43688a(file, i, 1, j);
            return aVar;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private C43688a(File file, int i, int i2, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f113103g = threadPoolExecutor;
        this.f113113r = new Callable<Void>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.ss.android.ugc.effectmanager.b.a r0 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this
                    monitor-enter(r0)
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this     // Catch:{ all -> 0x002c }
                    boolean r1 = r1.f113101e     // Catch:{ all -> 0x002c }
                    r1 = r1 ^ 1
                    com.ss.android.ugc.effectmanager.b.a r2 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this     // Catch:{ all -> 0x002c }
                    boolean r2 = r2.f113102f     // Catch:{ all -> 0x002c }
                    r1 = r1 | r2
                    r2 = 0
                    if (r1 == 0) goto L_0x0013
                    monitor-exit(r0)     // Catch:{ all -> 0x002c }
                    return r2
                L_0x0013:
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this     // Catch:{ all -> 0x002c }
                    r1.mo105695d()     // Catch:{ all -> 0x002c }
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this     // Catch:{ all -> 0x002c }
                    boolean r1 = r1.mo105691b()     // Catch:{ all -> 0x002c }
                    if (r1 == 0) goto L_0x002a
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this     // Catch:{ all -> 0x002c }
                    r1.mo105688a()     // Catch:{ all -> 0x002c }
                    com.ss.android.ugc.effectmanager.b.a r1 = com.p280ss.android.ugc.effectmanager.p1724b.C43688a.this     // Catch:{ all -> 0x002c }
                    r3 = 0
                    r1.f113100d = r3     // Catch:{ all -> 0x002c }
                L_0x002a:
                    monitor-exit(r0)     // Catch:{ all -> 0x002c }
                    return r2
                L_0x002c:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x002c }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.p1724b.C43688a.C436891.call():java.lang.Void");
            }
        };
        this.f113098b = file;
        this.f113107l = i;
        this.f113104i = new File(file, "journal");
        this.f113105j = new File(file, "journal.tmp");
        this.f113106k = new File(file, "journal.bkp");
        this.f113099c = i2;
        this.f113108m = j;
    }
}
