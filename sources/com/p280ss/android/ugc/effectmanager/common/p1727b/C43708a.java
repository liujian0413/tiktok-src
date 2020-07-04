package com.p280ss.android.ugc.effectmanager.common.p1727b;

import com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.a */
public final class C43708a implements Closeable {

    /* renamed from: a */
    static final Pattern f113176a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: g */
    public static final OutputStream f113177g = new OutputStream() {
        public final void write(int i) throws IOException {
        }
    };

    /* renamed from: b */
    public final File f113178b;

    /* renamed from: c */
    public final int f113179c;

    /* renamed from: d */
    public Writer f113180d;

    /* renamed from: e */
    public int f113181e;

    /* renamed from: f */
    final ThreadPoolExecutor f113182f;

    /* renamed from: h */
    private final File f113183h;

    /* renamed from: i */
    private final File f113184i;

    /* renamed from: j */
    private final File f113185j;

    /* renamed from: k */
    private final int f113186k;

    /* renamed from: l */
    private long f113187l;

    /* renamed from: m */
    private long f113188m;

    /* renamed from: n */
    private final LinkedHashMap<String, C43713b> f113189n = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: o */
    private long f113190o = 0;

    /* renamed from: p */
    private final Callable<Void> f113191p;

    /* renamed from: com.ss.android.ugc.effectmanager.common.b.a$a */
    public final class C43711a {

        /* renamed from: a */
        public final C43713b f113193a;

        /* renamed from: b */
        public final boolean[] f113194b;

        /* renamed from: c */
        public boolean f113195c;

        /* renamed from: e */
        private boolean f113197e;

        /* renamed from: com.ss.android.ugc.effectmanager.common.b.a$a$a */
        class C43712a extends FilterOutputStream {
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C43711a.this.f113195c = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C43711a.this.f113195c = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C43711a.this.f113195c = true;
                }
            }

            private C43712a(OutputStream outputStream) {
                super(outputStream);
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C43711a.this.f113195c = true;
                }
            }
        }

        /* renamed from: b */
        public final void mo105752b() throws IOException {
            C43708a.this.mo105741a(this, false);
        }

        /* renamed from: a */
        public final void mo105751a() throws IOException {
            if (this.f113195c) {
                C43708a.this.mo105741a(this, false);
                C43708a.this.mo105743b(this.f113193a.f113199a);
            } else {
                C43708a.this.mo105741a(this, true);
            }
            this.f113197e = true;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0027 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.io.OutputStream mo105750a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                com.ss.android.ugc.effectmanager.common.b.a r4 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this
                int r4 = r4.f113179c
                r0 = 0
                if (r4 <= 0) goto L_0x0048
                com.ss.android.ugc.effectmanager.common.b.a r4 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this
                monitor-enter(r4)
                com.ss.android.ugc.effectmanager.common.b.a$b r1 = r3.f113193a     // Catch:{ all -> 0x0045 }
                com.ss.android.ugc.effectmanager.common.b.a$a r1 = r1.f113202d     // Catch:{ all -> 0x0045 }
                if (r1 != r3) goto L_0x003f
                com.ss.android.ugc.effectmanager.common.b.a$b r1 = r3.f113193a     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.f113201c     // Catch:{ all -> 0x0045 }
                if (r1 != 0) goto L_0x001b
                boolean[] r1 = r3.f113194b     // Catch:{ all -> 0x0045 }
                r2 = 1
                r1[r0] = r2     // Catch:{ all -> 0x0045 }
            L_0x001b:
                com.ss.android.ugc.effectmanager.common.b.a$b r1 = r3.f113193a     // Catch:{ all -> 0x0045 }
                java.io.File r0 = r1.mo105760b(r0)     // Catch:{ all -> 0x0045 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0027 }
                r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0027 }
                goto L_0x0033
            L_0x0027:
                com.ss.android.ugc.effectmanager.common.b.a r1 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this     // Catch:{ all -> 0x0045 }
                java.io.File r1 = r1.f113178b     // Catch:{ all -> 0x0045 }
                r1.mkdirs()     // Catch:{ all -> 0x0045 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003b }
                r1.<init>(r0)     // Catch:{ FileNotFoundException -> 0x003b }
            L_0x0033:
                com.ss.android.ugc.effectmanager.common.b.a$a$a r0 = new com.ss.android.ugc.effectmanager.common.b.a$a$a     // Catch:{ all -> 0x0045 }
                r2 = 0
                r0.<init>(r1)     // Catch:{ all -> 0x0045 }
                monitor-exit(r4)     // Catch:{ all -> 0x0045 }
                return r0
            L_0x003b:
                java.io.OutputStream r0 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.f113177g     // Catch:{ all -> 0x0045 }
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
                com.ss.android.ugc.effectmanager.common.b.a r0 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this
                int r0 = r0.f113179c
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.C43711a.mo105750a(int):java.io.OutputStream");
        }

        private C43711a(C43713b bVar) {
            boolean[] zArr;
            this.f113193a = bVar;
            if (bVar.f113201c) {
                zArr = null;
            } else {
                zArr = new boolean[C43708a.this.f113179c];
            }
            this.f113194b = zArr;
        }
    }

    /* renamed from: com.ss.android.ugc.effectmanager.common.b.a$b */
    final class C43713b {

        /* renamed from: a */
        public final String f113199a;

        /* renamed from: b */
        public final long[] f113200b;

        /* renamed from: c */
        public boolean f113201c;

        /* renamed from: d */
        public C43711a f113202d;

        /* renamed from: e */
        public long f113203e;

        /* renamed from: a */
        public final String mo105758a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f113200b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private static IOException m138532b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public final File mo105757a(int i) {
            if (i == 0) {
                return new File(C43708a.this.f113178b, this.f113199a);
            }
            File file = C43708a.this.f113178b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f113199a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            return new File(file, sb.toString());
        }

        /* renamed from: a */
        public final void mo105759a(String[] strArr) throws IOException {
            if (strArr.length == C43708a.this.f113179c) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f113200b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m138532b(strArr);
                    }
                }
                return;
            }
            throw m138532b(strArr);
        }

        /* renamed from: b */
        public final File mo105760b(int i) {
            if (i == 0) {
                File file = C43708a.this.f113178b;
                StringBuilder sb = new StringBuilder();
                sb.append(this.f113199a);
                sb.append(".tmp");
                return new File(file, sb.toString());
            }
            File file2 = C43708a.this.f113178b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f113199a);
            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
            sb2.append(i);
            sb2.append(".tmp");
            return new File(file2, sb2.toString());
        }

        private C43713b(String str) {
            this.f113199a = str;
            this.f113200b = new long[C43708a.this.f113179c];
        }
    }

    /* renamed from: f */
    private synchronized long m138516f() {
        return this.f113187l;
    }

    /* renamed from: g */
    private void m138518g() {
        if (this.f113180d == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: h */
    private void m138519h() throws IOException {
        close();
        C43717d.m138549a(this.f113178b);
    }

    /* renamed from: b */
    public final boolean mo105742b() {
        if (this.f113181e < 2000 || this.f113181e < this.f113189n.size()) {
            return false;
        }
        return true;
    }

    public final synchronized void close() throws IOException {
        if (this.f113180d != null) {
            Iterator it = new ArrayList(this.f113189n.values()).iterator();
            while (it.hasNext()) {
                C43713b bVar = (C43713b) it.next();
                if (bVar.f113202d != null) {
                    bVar.f113202d.mo105752b();
                }
            }
            mo105744c();
            this.f113180d.close();
            this.f113180d = null;
        }
    }

    /* renamed from: e */
    private void m138514e() throws IOException {
        m138511a(this.f113184i);
        Iterator it = this.f113189n.values().iterator();
        while (it.hasNext()) {
            C43713b bVar = (C43713b) it.next();
            int i = 0;
            if (bVar.f113202d == null) {
                while (i < this.f113179c) {
                    this.f113188m += bVar.f113200b[i];
                    i++;
                }
            } else {
                bVar.f113202d = null;
                while (i < this.f113179c) {
                    m138511a(bVar.mo105757a(i));
                    m138511a(bVar.mo105760b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public final void mo105744c() throws IOException {
        while (this.f113188m > this.f113187l) {
            int size = this.f113189n.size();
            int i = 0;
            Iterator it = this.f113189n.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (C43704b.m138490f((String) entry.getKey())) {
                    i++;
                } else {
                    if (size - i < 10) {
                        m138510a(m138516f() * 2);
                    }
                    mo105743b((String) entry.getKey());
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8.f113181e = r1 - r8.f113189n.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r0.mo105764b() != false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        mo105740a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r8.f113180d = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r8.f113183h, true), com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.f113217a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008a=Splitter:B:23:0x008a, B:16:0x005d=Splitter:B:16:0x005d} */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m138513d() throws java.io.IOException {
        /*
            r8 = this;
            com.ss.android.ugc.effectmanager.common.b.c r0 = new com.ss.android.ugc.effectmanager.common.b.c
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r8.f113183h
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.f113217a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.mo105763a()     // Catch:{ all -> 0x00bb }
            java.lang.String r2 = r0.mo105763a()     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = r0.mo105763a()     // Catch:{ all -> 0x00bb }
            java.lang.String r4 = r0.mo105763a()     // Catch:{ all -> 0x00bb }
            java.lang.String r5 = r0.mo105763a()     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = "libcore.io.DiskLruCache"
            boolean r6 = r6.equals(r1)     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x008a
            java.lang.String r6 = "1"
            boolean r6 = r6.equals(r2)     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x008a
            int r6 = r8.f113186k     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x00bb }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x008a
            int r3 = r8.f113179c     // Catch:{ all -> 0x00bb }
            java.lang.String r3 = java.lang.Integer.toString(r3)     // Catch:{ all -> 0x00bb }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x008a
            java.lang.String r3 = ""
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x00bb }
            if (r3 == 0) goto L_0x008a
            r1 = 0
        L_0x0053:
            java.lang.String r2 = r0.mo105763a()     // Catch:{ EOFException -> 0x005d }
            r8.m138515e(r2)     // Catch:{ EOFException -> 0x005d }
            int r1 = r1 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r2 = r8.f113189n     // Catch:{ all -> 0x00bb }
            int r2 = r2.size()     // Catch:{ all -> 0x00bb }
            int r1 = r1 - r2
            r8.f113181e = r1     // Catch:{ all -> 0x00bb }
            boolean r1 = r0.mo105764b()     // Catch:{ all -> 0x00bb }
            if (r1 == 0) goto L_0x0070
            r8.mo105740a()     // Catch:{ all -> 0x00bb }
            goto L_0x0086
        L_0x0070:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x00bb }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00bb }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00bb }
            java.io.File r4 = r8.f113183h     // Catch:{ all -> 0x00bb }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00bb }
            java.nio.charset.Charset r4 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.f113217a     // Catch:{ all -> 0x00bb }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00bb }
            r1.<init>(r2)     // Catch:{ all -> 0x00bb }
            r8.f113180d = r1     // Catch:{ all -> 0x00bb }
        L_0x0086:
            com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.m138548a(r0)
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
            com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.m138548a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.m138513d():void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final synchronized void mo105740a() throws IOException {
        if (this.f113180d != null) {
            this.f113180d.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f113184i), C43717d.f113217a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f113186k));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f113179c));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C43713b bVar : this.f113189n.values()) {
                if (bVar.f113202d != null) {
                    StringBuilder sb = new StringBuilder("DIRTY ");
                    sb.append(bVar.f113199a);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder("CLEAN ");
                    sb2.append(bVar.f113199a);
                    sb2.append(bVar.mo105758a());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            bufferedWriter.close();
            if (this.f113183h.exists()) {
                m138512a(this.f113183h, this.f113185j, true);
            }
            m138512a(this.f113184i, this.f113183h, false);
            this.f113185j.delete();
            this.f113180d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f113183h, true), C43717d.f113217a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final C43711a mo105739a(String str) throws IOException {
        return m138508a(str, -1);
    }

    /* renamed from: a */
    private synchronized void m138510a(long j) {
        this.f113187l = j;
        this.f113182f.submit(this.f113191p);
    }

    /* renamed from: a */
    private static void m138511a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: f */
    private static void m138517f(String str) {
        if (!f113176a.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    public final synchronized boolean mo105747d(String str) {
        m138518g();
        m138517f(str);
        C43713b bVar = (C43713b) this.f113189n.get(str);
        if (bVar == null) {
            return false;
        }
        if (!bVar.f113201c) {
            return false;
        }
        try {
            this.f113181e++;
            Writer writer = this.f113180d;
            StringBuilder sb = new StringBuilder("READ ");
            sb.append(str);
            sb.append(10);
            writer.write(sb.toString());
            this.f113180d.flush();
            if (mo105742b()) {
                this.f113182f.submit(this.f113191p);
            }
        } catch (IOException unused) {
        }
        return true;
    }

    /* renamed from: e */
    private void m138515e(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f113189n.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C43713b bVar = (C43713b) this.f113189n.get(str2);
            if (bVar == null) {
                bVar = new C43713b(str2);
                this.f113189n.put(str2, bVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                bVar.f113201c = true;
                bVar.f113202d = null;
                bVar.mo105759a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                bVar.f113202d = new C43711a(bVar);
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

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ac, code lost:
        return true;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo105743b(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            r8.m138518g()     // Catch:{ all -> 0x00bd }
            m138517f(r9)     // Catch:{ all -> 0x00bd }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r0 = r8.f113189n     // Catch:{ all -> 0x00bd }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ all -> 0x00bd }
            com.ss.android.ugc.effectmanager.common.b.a$b r0 = (com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.C43713b) r0     // Catch:{ all -> 0x00bd }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00ad
            com.ss.android.ugc.effectmanager.common.b.a$a r3 = r0.f113202d     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x0019
            goto L_0x00ad
        L_0x0019:
            int r3 = r8.f113179c     // Catch:{ all -> 0x00bd }
            if (r1 >= r3) goto L_0x007c
            java.io.File r3 = r0.mo105757a(r1)     // Catch:{ all -> 0x00bd }
            boolean r4 = r3.exists()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0069
            boolean r4 = r3.isFile()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0048
            boolean r4 = r3.delete()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0034
            goto L_0x0048
        L_0x0034:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x00bd }
            r0.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bd }
            r9.<init>(r0)     // Catch:{ all -> 0x00bd }
            throw r9     // Catch:{ all -> 0x00bd }
        L_0x0048:
            boolean r4 = r3.isDirectory()     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0069
            boolean r4 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.m138550b(r3)     // Catch:{ all -> 0x00bd }
            if (r4 == 0) goto L_0x0055
            goto L_0x0069
        L_0x0055:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x00bd }
            r0.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00bd }
            r9.<init>(r0)     // Catch:{ all -> 0x00bd }
            throw r9     // Catch:{ all -> 0x00bd }
        L_0x0069:
            long r3 = r8.f113188m     // Catch:{ all -> 0x00bd }
            long[] r5 = r0.f113200b     // Catch:{ all -> 0x00bd }
            r6 = r5[r1]     // Catch:{ all -> 0x00bd }
            r5 = 0
            long r3 = r3 - r6
            r8.f113188m = r3     // Catch:{ all -> 0x00bd }
            long[] r3 = r0.f113200b     // Catch:{ all -> 0x00bd }
            r4 = 0
            r3[r1] = r4     // Catch:{ all -> 0x00bd }
            int r1 = r1 + 1
            goto L_0x0019
        L_0x007c:
            int r0 = r8.f113181e     // Catch:{ all -> 0x00bd }
            int r0 = r0 + r2
            r8.f113181e = r0     // Catch:{ all -> 0x00bd }
            java.io.Writer r0 = r8.f113180d     // Catch:{ all -> 0x00bd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "REMOVE "
            r1.<init>(r3)     // Catch:{ all -> 0x00bd }
            r1.append(r9)     // Catch:{ all -> 0x00bd }
            r3 = 10
            r1.append(r3)     // Catch:{ all -> 0x00bd }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00bd }
            r0.append(r1)     // Catch:{ all -> 0x00bd }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r0 = r8.f113189n     // Catch:{ all -> 0x00bd }
            r0.remove(r9)     // Catch:{ all -> 0x00bd }
            boolean r9 = r8.mo105742b()     // Catch:{ all -> 0x00bd }
            if (r9 == 0) goto L_0x00ab
            java.util.concurrent.ThreadPoolExecutor r9 = r8.f113182f     // Catch:{ all -> 0x00bd }
            java.util.concurrent.Callable<java.lang.Void> r0 = r8.f113191p     // Catch:{ all -> 0x00bd }
            r9.submit(r0)     // Catch:{ all -> 0x00bd }
        L_0x00ab:
            monitor-exit(r8)
            return r2
        L_0x00ad:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bd }
            java.lang.String r3 = "remove: can not:"
            r9.<init>(r3)     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r9.append(r2)     // Catch:{ all -> 0x00bd }
            monitor-exit(r8)
            return r1
        L_0x00bd:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.mo105743b(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        return true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo105745c(java.lang.String r10) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            r9.m138518g()     // Catch:{ all -> 0x00bc }
            m138517f(r10)     // Catch:{ all -> 0x00bc }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r0 = r9.f113189n     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r0.get(r10)     // Catch:{ all -> 0x00bc }
            com.ss.android.ugc.effectmanager.common.b.a$b r0 = (com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.C43713b) r0     // Catch:{ all -> 0x00bc }
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x001e
            com.ss.android.ugc.effectmanager.common.b.a$b r0 = new com.ss.android.ugc.effectmanager.common.b.a$b     // Catch:{ all -> 0x00bc }
            r0.<init>(r10)     // Catch:{ all -> 0x00bc }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r3 = r9.f113189n     // Catch:{ all -> 0x00bc }
            r3.put(r10, r0)     // Catch:{ all -> 0x00bc }
            goto L_0x0024
        L_0x001e:
            com.ss.android.ugc.effectmanager.common.b.a$a r10 = r0.f113202d     // Catch:{ all -> 0x00bc }
            if (r10 == 0) goto L_0x0024
            monitor-exit(r9)
            return r2
        L_0x0024:
            java.io.File r10 = r0.mo105757a(r2)     // Catch:{ all -> 0x00bc }
            boolean r3 = r10.exists()     // Catch:{ all -> 0x00bc }
            r4 = 10
            if (r3 == 0) goto L_0x009b
            long[] r3 = r0.f113200b     // Catch:{ all -> 0x00bc }
            r5 = r3[r2]     // Catch:{ all -> 0x00bc }
            long r7 = r10.length()     // Catch:{ all -> 0x00bc }
            boolean r3 = r10.isDirectory()     // Catch:{ all -> 0x00bc }
            if (r3 == 0) goto L_0x0042
            long r7 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.m138551c(r10)     // Catch:{ all -> 0x00bc }
        L_0x0042:
            long[] r10 = r0.f113200b     // Catch:{ all -> 0x00bc }
            r10[r2] = r7     // Catch:{ all -> 0x00bc }
            long r2 = r9.f113188m     // Catch:{ all -> 0x00bc }
            r10 = 0
            long r2 = r2 - r5
            long r2 = r2 + r7
            r9.f113188m = r2     // Catch:{ all -> 0x00bc }
            int r10 = r9.f113181e     // Catch:{ all -> 0x00bc }
            r2 = 1
            int r10 = r10 + r2
            r9.f113181e = r10     // Catch:{ all -> 0x00bc }
            r0.f113202d = r1     // Catch:{ all -> 0x00bc }
            r0.f113201c = r2     // Catch:{ all -> 0x00bc }
            java.io.Writer r10 = r9.f113180d     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = r0.f113199a     // Catch:{ all -> 0x00bc }
            r1.append(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = r0.mo105758a()     // Catch:{ all -> 0x00bc }
            r1.append(r3)     // Catch:{ all -> 0x00bc }
            r1.append(r4)     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00bc }
            r10.write(r1)     // Catch:{ all -> 0x00bc }
            long r3 = r9.f113190o     // Catch:{ all -> 0x00bc }
            r5 = 1
            long r5 = r5 + r3
            r9.f113190o = r5     // Catch:{ all -> 0x00bc }
            r0.f113203e = r3     // Catch:{ all -> 0x00bc }
            java.io.Writer r10 = r9.f113180d     // Catch:{ all -> 0x00bc }
            r10.flush()     // Catch:{ all -> 0x00bc }
            long r0 = r9.f113188m     // Catch:{ all -> 0x00bc }
            long r3 = r9.f113187l     // Catch:{ all -> 0x00bc }
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x0092
            boolean r10 = r9.mo105742b()     // Catch:{ all -> 0x00bc }
            if (r10 == 0) goto L_0x0099
        L_0x0092:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f113182f     // Catch:{ all -> 0x00bc }
            java.util.concurrent.Callable<java.lang.Void> r0 = r9.f113191p     // Catch:{ all -> 0x00bc }
            r10.submit(r0)     // Catch:{ all -> 0x00bc }
        L_0x0099:
            monitor-exit(r9)
            return r2
        L_0x009b:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r10 = r9.f113189n     // Catch:{ all -> 0x00bc }
            java.lang.String r1 = r0.f113199a     // Catch:{ all -> 0x00bc }
            r10.remove(r1)     // Catch:{ all -> 0x00bc }
            java.io.Writer r10 = r9.f113180d     // Catch:{ all -> 0x00bc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bc }
            java.lang.String r3 = "REMOVE "
            r1.<init>(r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r0.f113199a     // Catch:{ all -> 0x00bc }
            r1.append(r0)     // Catch:{ all -> 0x00bc }
            r1.append(r4)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00bc }
            r10.write(r0)     // Catch:{ all -> 0x00bc }
            monitor-exit(r9)
            return r2
        L_0x00bc:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.mo105745c(java.lang.String):boolean");
    }

    /* renamed from: a */
    private synchronized C43711a m138508a(String str, long j) throws IOException {
        m138518g();
        m138517f(str);
        C43713b bVar = (C43713b) this.f113189n.get(str);
        if (bVar == null) {
            bVar = new C43713b(str);
            this.f113189n.put(str, bVar);
        } else if (bVar.f113202d != null) {
            return null;
        }
        C43711a aVar = new C43711a(bVar);
        bVar.f113202d = aVar;
        Writer writer = this.f113180d;
        StringBuilder sb = new StringBuilder("DIRTY ");
        sb.append(str);
        sb.append(10);
        writer.write(sb.toString());
        this.f113180d.flush();
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ea, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo105741a(com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.C43711a r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ss.android.ugc.effectmanager.common.b.a$b r0 = r10.f113193a     // Catch:{ all -> 0x00f1 }
            com.ss.android.ugc.effectmanager.common.b.a$a r1 = r0.f113202d     // Catch:{ all -> 0x00f1 }
            if (r1 != r10) goto L_0x00eb
            r1 = 0
            if (r11 == 0) goto L_0x0042
            boolean r2 = r0.f113201c     // Catch:{ all -> 0x00f1 }
            if (r2 != 0) goto L_0x0042
            r2 = 0
        L_0x000f:
            int r3 = r9.f113179c     // Catch:{ all -> 0x00f1 }
            if (r2 >= r3) goto L_0x0042
            boolean[] r3 = r10.f113194b     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f1 }
            if (r3 == 0) goto L_0x002b
            java.io.File r3 = r0.mo105760b(r2)     // Catch:{ all -> 0x00f1 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f1 }
            if (r3 != 0) goto L_0x0028
            r10.mo105752b()     // Catch:{ all -> 0x00f1 }
            monitor-exit(r9)
            return
        L_0x0028:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002b:
            r10.mo105752b()     // Catch:{ all -> 0x00f1 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.<init>(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f1 }
            throw r10     // Catch:{ all -> 0x00f1 }
        L_0x0042:
            int r10 = r9.f113179c     // Catch:{ all -> 0x00f1 }
            if (r1 >= r10) goto L_0x0073
            java.io.File r10 = r0.mo105760b(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x006d
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f1 }
            if (r2 == 0) goto L_0x0070
            java.io.File r2 = r0.mo105757a(r1)     // Catch:{ all -> 0x00f1 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f113200b     // Catch:{ all -> 0x00f1 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f1 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f1 }
            long[] r10 = r0.f113200b     // Catch:{ all -> 0x00f1 }
            r10[r1] = r5     // Catch:{ all -> 0x00f1 }
            long r7 = r9.f113188m     // Catch:{ all -> 0x00f1 }
            r10 = 0
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f113188m = r7     // Catch:{ all -> 0x00f1 }
            goto L_0x0070
        L_0x006d:
            m138511a(r10)     // Catch:{ all -> 0x00f1 }
        L_0x0070:
            int r1 = r1 + 1
            goto L_0x0042
        L_0x0073:
            int r10 = r9.f113181e     // Catch:{ all -> 0x00f1 }
            r1 = 1
            int r10 = r10 + r1
            r9.f113181e = r10     // Catch:{ all -> 0x00f1 }
            r10 = 0
            r0.f113202d = r10     // Catch:{ all -> 0x00f1 }
            boolean r10 = r0.f113201c     // Catch:{ all -> 0x00f1 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00b0
            r0.f113201c = r1     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f113180d     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = "CLEAN "
            r1.<init>(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.f113199a     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            java.lang.String r3 = r0.mo105758a()     // Catch:{ all -> 0x00f1 }
            r1.append(r3)     // Catch:{ all -> 0x00f1 }
            r1.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r1)     // Catch:{ all -> 0x00f1 }
            if (r11 == 0) goto L_0x00cf
            long r10 = r9.f113190o     // Catch:{ all -> 0x00f1 }
            r1 = 1
            long r1 = r1 + r10
            r9.f113190o = r1     // Catch:{ all -> 0x00f1 }
            r0.f113203e = r10     // Catch:{ all -> 0x00f1 }
            goto L_0x00cf
        L_0x00b0:
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.effectmanager.common.b.a$b> r10 = r9.f113189n     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r0.f113199a     // Catch:{ all -> 0x00f1 }
            r10.remove(r11)     // Catch:{ all -> 0x00f1 }
            java.io.Writer r10 = r9.f113180d     // Catch:{ all -> 0x00f1 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f1 }
            java.lang.String r1 = "REMOVE "
            r11.<init>(r1)     // Catch:{ all -> 0x00f1 }
            java.lang.String r0 = r0.f113199a     // Catch:{ all -> 0x00f1 }
            r11.append(r0)     // Catch:{ all -> 0x00f1 }
            r11.append(r2)     // Catch:{ all -> 0x00f1 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f1 }
            r10.write(r11)     // Catch:{ all -> 0x00f1 }
        L_0x00cf:
            java.io.Writer r10 = r9.f113180d     // Catch:{ all -> 0x00f1 }
            r10.flush()     // Catch:{ all -> 0x00f1 }
            long r10 = r9.f113188m     // Catch:{ all -> 0x00f1 }
            long r0 = r9.f113187l     // Catch:{ all -> 0x00f1 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00e2
            boolean r10 = r9.mo105742b()     // Catch:{ all -> 0x00f1 }
            if (r10 == 0) goto L_0x00e9
        L_0x00e2:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f113182f     // Catch:{ all -> 0x00f1 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f113191p     // Catch:{ all -> 0x00f1 }
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.mo105741a(com.ss.android.ugc.effectmanager.common.b.a$a, boolean):void");
    }

    /* renamed from: a */
    private static void m138512a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m138511a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private C43708a(File file, int i, int i2, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f113182f = threadPoolExecutor;
        this.f113191p = new Callable<Void>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.ss.android.ugc.effectmanager.common.b.a r0 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this
                    monitor-enter(r0)
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this     // Catch:{ all -> 0x0025 }
                    java.io.Writer r1 = r1.f113180d     // Catch:{ all -> 0x0025 }
                    r2 = 0
                    if (r1 != 0) goto L_0x000c
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x000c:
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this     // Catch:{ all -> 0x0025 }
                    r1.mo105744c()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this     // Catch:{ all -> 0x0025 }
                    boolean r1 = r1.mo105742b()     // Catch:{ all -> 0x0025 }
                    if (r1 == 0) goto L_0x0023
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this     // Catch:{ all -> 0x0025 }
                    r1.mo105740a()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.effectmanager.common.b.a r1 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.this     // Catch:{ all -> 0x0025 }
                    r3 = 0
                    r1.f113181e = r3     // Catch:{ all -> 0x0025 }
                L_0x0023:
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x0025:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1727b.C43708a.C437091.call():java.lang.Void");
            }
        };
        this.f113178b = file;
        this.f113186k = i;
        this.f113183h = new File(file, "journal");
        this.f113184i = new File(file, "journal.tmp");
        this.f113185j = new File(file, "journal.bkp");
        this.f113179c = i2;
        this.f113187l = j;
    }

    /* renamed from: a */
    public static C43708a m138509a(File file, int i, int i2, long j) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m138512a(file2, file3, false);
            }
        }
        C43708a aVar = new C43708a(file, 0, 1, 115343360);
        if (aVar.f113183h.exists()) {
            try {
                aVar.m138513d();
                aVar.m138514e();
                return aVar;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("DiskLruCache ");
                sb.append(file);
                sb.append(" is corrupt: ");
                sb.append(e.getMessage());
                sb.append(", removing");
                printStream.println(sb.toString());
                aVar.m138519h();
            }
        }
        file.mkdirs();
        C43708a aVar2 = new C43708a(file, 0, 1, 115343360);
        aVar2.mo105740a();
        return aVar2;
    }
}
