package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.taobao.android.dexposed.ClassUtils;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.utils.ax */
public final class C42954ax implements Closeable {

    /* renamed from: a */
    public static final Charset f111495a = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final String f111496g = "ax";

    /* renamed from: b */
    public final File f111497b;

    /* renamed from: c */
    public final long f111498c;

    /* renamed from: d */
    public final int f111499d;

    /* renamed from: e */
    public Writer f111500e;

    /* renamed from: f */
    public int f111501f;

    /* renamed from: h */
    private final File f111502h;

    /* renamed from: i */
    private final File f111503i;

    /* renamed from: j */
    private final int f111504j;

    /* renamed from: k */
    private long f111505k;

    /* renamed from: l */
    private final LinkedHashMap<String, C42958b> f111506l = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    private long f111507m = 0;

    /* renamed from: n */
    private final ExecutorService f111508n;

    /* renamed from: o */
    private final Callable<Void> f111509o;

    /* renamed from: com.ss.android.ugc.aweme.utils.ax$a */
    public final class C42956a {

        /* renamed from: a */
        public final C42958b f111511a;

        /* renamed from: b */
        public boolean f111512b;

        /* renamed from: com.ss.android.ugc.aweme.utils.ax$a$a */
        class C42957a extends FilterOutputStream {
            public final void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C42956a.this.f111512b = true;
                }
            }

            public final void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C42956a.this.f111512b = true;
                }
            }

            public final void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C42956a.this.f111512b = true;
                }
            }

            private C42957a(OutputStream outputStream) {
                super(outputStream);
            }

            public final void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C42956a.this.f111512b = true;
                }
            }
        }

        /* renamed from: b */
        public final void mo104659b() throws IOException {
            C42954ax.this.mo104648a(this, false);
        }

        /* renamed from: a */
        public final void mo104658a() throws IOException {
            if (this.f111512b) {
                C42954ax.this.mo104648a(this, false);
                C42954ax.this.mo104652c(this.f111511a.f111515a);
                return;
            }
            C42954ax.this.mo104648a(this, true);
        }

        /* renamed from: a */
        public final OutputStream mo104657a(int i) throws IOException {
            C42957a aVar;
            synchronized (C42954ax.this) {
                if (this.f111511a.f111518d == this) {
                    aVar = new C42957a(new FileOutputStream(this.f111511a.mo104667b(0)));
                } else {
                    throw new IllegalStateException();
                }
            }
            return aVar;
        }

        private C42956a(C42958b bVar) {
            this.f111511a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ax$b */
    final class C42958b {

        /* renamed from: a */
        public final String f111515a;

        /* renamed from: b */
        public final long[] f111516b;

        /* renamed from: c */
        public boolean f111517c;

        /* renamed from: d */
        public C42956a f111518d;

        /* renamed from: e */
        public long f111519e;

        /* renamed from: a */
        public final String mo104665a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f111516b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        private static IOException m136373b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public final File mo104664a(int i) {
            File file = C42954ax.this.f111497b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f111515a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            return new File(file, sb.toString());
        }

        /* renamed from: b */
        public final File mo104667b(int i) {
            File file = C42954ax.this.f111497b;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f111515a);
            sb.append(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(i);
            sb.append(".tmp");
            return new File(file, sb.toString());
        }

        /* renamed from: a */
        public final void mo104666a(String[] strArr) throws IOException {
            if (strArr.length == C42954ax.this.f111499d) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f111516b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        throw m136373b(strArr);
                    }
                }
                return;
            }
            throw m136373b(strArr);
        }

        private C42958b(String str) {
            this.f111515a = str;
            this.f111516b = new long[C42954ax.this.f111499d];
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.ax$c */
    public final class C42959c implements Closeable {

        /* renamed from: b */
        private final String f111522b;

        /* renamed from: c */
        private final long f111523c;

        /* renamed from: d */
        private final InputStream[] f111524d;

        public final void close() {
            for (InputStream a : this.f111524d) {
                C42954ax.m136350a((Closeable) a);
            }
        }

        /* renamed from: a */
        public final InputStream mo104668a(int i) {
            return this.f111524d[0];
        }

        private C42959c(String str, long j, InputStream[] inputStreamArr) {
            this.f111522b = str;
            this.f111523c = j;
            this.f111524d = inputStreamArr;
        }
    }

    /* renamed from: a */
    public final synchronized void mo104647a() throws IOException {
        if (this.f111500e != null) {
            this.f111500e.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.f111503i), VideoCacheReadBuffersizeExperiment.DEFAULT);
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f111504j));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f111499d));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C42958b bVar : this.f111506l.values()) {
            if (bVar.f111518d != null) {
                StringBuilder sb = new StringBuilder("DIRTY ");
                sb.append(bVar.f111515a);
                sb.append(10);
                bufferedWriter.write(sb.toString());
            } else {
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(bVar.f111515a);
                sb2.append(bVar.mo104665a());
                sb2.append(10);
                bufferedWriter.write(sb2.toString());
            }
        }
        bufferedWriter.close();
        this.f111503i.renameTo(this.f111502h);
        this.f111500e = new BufferedWriter(new FileWriter(this.f111502h, true), VideoCacheReadBuffersizeExperiment.DEFAULT);
    }

    /* renamed from: a */
    public final synchronized void mo104648a(C42956a aVar, boolean z) throws IOException {
        C42958b bVar = aVar.f111511a;
        if (bVar.f111518d == aVar) {
            if (z && !bVar.f111517c) {
                int i = 0;
                while (i < this.f111499d) {
                    if (bVar.mo104667b(i).exists()) {
                        i++;
                    } else {
                        aVar.mo104659b();
                        StringBuilder sb = new StringBuilder("edit didn't create file ");
                        sb.append(i);
                        throw new IllegalStateException(sb.toString());
                    }
                }
            }
            for (int i2 = 0; i2 < this.f111499d; i2++) {
                File b = bVar.mo104667b(i2);
                if (!z) {
                    m136353b(b);
                } else if (b.exists()) {
                    File a = bVar.mo104664a(i2);
                    b.renameTo(a);
                    long j = bVar.f111516b[i2];
                    long length = a.length();
                    bVar.f111516b[i2] = length;
                    this.f111505k = (this.f111505k - j) + length;
                }
            }
            this.f111501f++;
            bVar.f111518d = null;
            if (bVar.f111517c || z) {
                bVar.f111517c = true;
                Writer writer = this.f111500e;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(bVar.f111515a);
                sb2.append(bVar.mo104665a());
                sb2.append(10);
                writer.write(sb2.toString());
                if (z) {
                    long j2 = this.f111507m;
                    this.f111507m = 1 + j2;
                    bVar.f111519e = j2;
                }
            } else {
                this.f111506l.remove(bVar.f111515a);
                Writer writer2 = this.f111500e;
                StringBuilder sb3 = new StringBuilder("REMOVE ");
                sb3.append(bVar.f111515a);
                sb3.append(10);
                writer2.write(sb3.toString());
            }
            if (this.f111505k > this.f111498c || mo104650b()) {
                this.f111508n.submit(this.f111509o);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: c */
    public final boolean mo104651c() {
        if (this.f111500e == null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    private void m136358h() {
        if (this.f111500e == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: i */
    private void m136359i() throws IOException {
        close();
        m136351a(this.f111497b);
    }

    /* renamed from: d */
    public final synchronized void mo104654d() throws IOException {
        m136358h();
        mo104655e();
        this.f111500e.flush();
    }

    /* renamed from: b */
    public final boolean mo104650b() {
        if (this.f111501f < 2000 || this.f111501f < this.f111506l.size()) {
            return false;
        }
        return true;
    }

    public final synchronized void close() throws IOException {
        if (this.f111500e != null) {
            Iterator it = new ArrayList(this.f111506l.values()).iterator();
            while (it.hasNext()) {
                C42958b bVar = (C42958b) it.next();
                if (bVar.f111518d != null) {
                    bVar.f111518d.mo104659b();
                }
            }
            mo104655e();
            this.f111500e.close();
            this.f111500e = null;
        }
    }

    /* renamed from: g */
    private void m136357g() throws IOException {
        m136353b(this.f111503i);
        Iterator it = this.f111506l.values().iterator();
        while (it.hasNext()) {
            C42958b bVar = (C42958b) it.next();
            int i = 0;
            if (bVar.f111518d == null) {
                while (i < this.f111499d) {
                    this.f111505k += bVar.f111516b[i];
                    i++;
                }
            } else {
                bVar.f111518d = null;
                while (i < this.f111499d) {
                    m136353b(bVar.mo104664a(i));
                    m136353b(bVar.mo104667b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public final void mo104655e() throws IOException {
        while (this.f111505k > this.f111498c) {
            mo104652c((String) ((Entry) this.f111506l.entrySet().iterator().next()).getKey());
        }
    }

    /* renamed from: f */
    private void m136356f() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.f111502h), VideoCacheReadBuffersizeExperiment.DEFAULT);
        try {
            String a = m136349a((InputStream) bufferedInputStream);
            String a2 = m136349a((InputStream) bufferedInputStream);
            String a3 = m136349a((InputStream) bufferedInputStream);
            String a4 = m136349a((InputStream) bufferedInputStream);
            String a5 = m136349a((InputStream) bufferedInputStream);
            if (!"libcore.io.DiskLruCache".equals(a) || !"1".equals(a2) || !Integer.toString(this.f111504j).equals(a3) || !Integer.toString(this.f111499d).equals(a4) || !"".equals(a5)) {
                StringBuilder sb = new StringBuilder("unexpected journal header: [");
                sb.append(a);
                sb.append(", ");
                sb.append(a2);
                sb.append(", ");
                sb.append(a4);
                sb.append(", ");
                sb.append(a5);
                sb.append("]");
                throw new IOException(sb.toString());
            }
            while (true) {
                try {
                    m136354d(m136349a((InputStream) bufferedInputStream));
                } catch (EOFException unused) {
                    m136350a((Closeable) bufferedInputStream);
                    return;
                }
            }
        } catch (Throwable th) {
            m136350a((Closeable) bufferedInputStream);
            throw th;
        }
    }

    /* renamed from: b */
    public final C42956a mo104649b(String str) throws IOException {
        return m136347a(str, -1);
    }

    /* renamed from: a */
    public static void m136350a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    private static void m136353b(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static String m136349a(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            } else if (read != 10) {
                sb.append((char) read);
            } else {
                int length = sb.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb.charAt(i) == 13) {
                        sb.setLength(i);
                    }
                }
                return sb.toString();
            }
        }
    }

    /* renamed from: e */
    private static void m136355e(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            StringBuilder sb = new StringBuilder("keys must not contain spaces or newlines: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: d */
    private void m136354d(String str) throws IOException {
        String[] split = str.split(" ");
        if (split.length >= 2) {
            String str2 = split[1];
            if (!split[0].equals("REMOVE") || split.length != 2) {
                C42958b bVar = (C42958b) this.f111506l.get(str2);
                if (bVar == null) {
                    bVar = new C42958b(str2);
                    this.f111506l.put(str2, bVar);
                }
                if (split[0].equals("CLEAN") && split.length == this.f111499d + 2) {
                    bVar.f111517c = true;
                    bVar.f111518d = null;
                    bVar.mo104666a((String[]) m136352a(split, 2, split.length));
                } else if (split[0].equals("DIRTY") && split.length == 2) {
                    bVar.f111518d = new C42956a(bVar);
                } else if (!split[0].equals("READ") || split.length != 2) {
                    StringBuilder sb = new StringBuilder("unexpected journal line: ");
                    sb.append(str);
                    throw new IOException(sb.toString());
                }
            } else {
                this.f111506l.remove(str2);
            }
        } else {
            StringBuilder sb2 = new StringBuilder("unexpected journal line: ");
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007f, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo104652c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m136358h()     // Catch:{ all -> 0x0080 }
            m136355e(r8)     // Catch:{ all -> 0x0080 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.ax$b> r0 = r7.f111506l     // Catch:{ all -> 0x0080 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0080 }
            com.ss.android.ugc.aweme.utils.ax$b r0 = (com.p280ss.android.ugc.aweme.utils.C42954ax.C42958b) r0     // Catch:{ all -> 0x0080 }
            r1 = 0
            if (r0 == 0) goto L_0x007e
            com.ss.android.ugc.aweme.utils.ax$a r2 = r0.f111518d     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x0017
            goto L_0x007e
        L_0x0017:
            int r2 = r7.f111499d     // Catch:{ all -> 0x0080 }
            if (r1 >= r2) goto L_0x004c
            java.io.File r2 = r0.mo104664a(r1)     // Catch:{ all -> 0x0080 }
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0038
            long r2 = r7.f111505k     // Catch:{ all -> 0x0080 }
            long[] r4 = r0.f111516b     // Catch:{ all -> 0x0080 }
            r5 = r4[r1]     // Catch:{ all -> 0x0080 }
            r4 = 0
            long r2 = r2 - r5
            r7.f111505k = r2     // Catch:{ all -> 0x0080 }
            long[] r2 = r0.f111516b     // Catch:{ all -> 0x0080 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0080 }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0038:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            java.lang.String r1 = "failed to delete "
            r0.<init>(r1)     // Catch:{ all -> 0x0080 }
            r0.append(r2)     // Catch:{ all -> 0x0080 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0080 }
            r8.<init>(r0)     // Catch:{ all -> 0x0080 }
            throw r8     // Catch:{ all -> 0x0080 }
        L_0x004c:
            int r0 = r7.f111501f     // Catch:{ all -> 0x0080 }
            r1 = 1
            int r0 = r0 + r1
            r7.f111501f = r0     // Catch:{ all -> 0x0080 }
            java.io.Writer r0 = r7.f111500e     // Catch:{ all -> 0x0080 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0080 }
            java.lang.String r3 = "REMOVE "
            r2.<init>(r3)     // Catch:{ all -> 0x0080 }
            r2.append(r8)     // Catch:{ all -> 0x0080 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0080 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0080 }
            r0.append(r2)     // Catch:{ all -> 0x0080 }
            java.util.LinkedHashMap<java.lang.String, com.ss.android.ugc.aweme.utils.ax$b> r0 = r7.f111506l     // Catch:{ all -> 0x0080 }
            r0.remove(r8)     // Catch:{ all -> 0x0080 }
            boolean r8 = r7.mo104650b()     // Catch:{ all -> 0x0080 }
            if (r8 == 0) goto L_0x007c
            java.util.concurrent.ExecutorService r8 = r7.f111508n     // Catch:{ all -> 0x0080 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f111509o     // Catch:{ all -> 0x0080 }
            r8.submit(r0)     // Catch:{ all -> 0x0080 }
        L_0x007c:
            monitor-exit(r7)
            return r1
        L_0x007e:
            monitor-exit(r7)
            return r1
        L_0x0080:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42954ax.mo104652c(java.lang.String):boolean");
    }

    /* renamed from: a */
    private static void m136351a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m136351a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("failed to delete file: ");
                    sb.append(file2);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("not a directory: ");
        sb2.append(file);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public final synchronized C42959c mo104646a(String str) throws IOException {
        m136358h();
        m136355e(str);
        C42958b bVar = (C42958b) this.f111506l.get(str);
        if (bVar == null) {
            return null;
        }
        if (!bVar.f111517c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f111499d];
        int i = 0;
        while (i < this.f111499d) {
            try {
                inputStreamArr[i] = new FileInputStream(bVar.mo104664a(i));
                i++;
            } catch (FileNotFoundException unused) {
                return null;
            }
        }
        this.f111501f++;
        Writer writer = this.f111500e;
        StringBuilder sb = new StringBuilder("READ ");
        sb.append(str);
        sb.append(10);
        writer.append(sb.toString());
        if (mo104650b()) {
            this.f111508n.submit(this.f111509o);
        }
        C42959c cVar = new C42959c(str, bVar.f111519e, inputStreamArr);
        return cVar;
    }

    /* renamed from: a */
    private synchronized C42956a m136347a(String str, long j) throws IOException {
        m136358h();
        m136355e(str);
        C42958b bVar = (C42958b) this.f111506l.get(str);
        if (bVar == null) {
            bVar = new C42958b(str);
            this.f111506l.put(str, bVar);
        } else if (bVar.f111518d != null) {
            return null;
        }
        C42956a aVar = new C42956a(bVar);
        bVar.f111518d = aVar;
        Writer writer = this.f111500e;
        StringBuilder sb = new StringBuilder("DIRTY ");
        sb.append(str);
        sb.append(10);
        writer.write(sb.toString());
        this.f111500e.flush();
        return aVar;
    }

    /* renamed from: a */
    private static <T> T[] m136352a(T[] tArr, int i, int i2) {
        int length = tArr.length;
        if (2 > i2) {
            throw new IllegalArgumentException();
        } else if (2 <= length) {
            int i3 = i2 - 2;
            int min = Math.min(i3, length - 2);
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3);
            System.arraycopy(tArr, 2, tArr2, 0, min);
            return tArr2;
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    private C42954ax(File file, int i, int i2, long j) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f111508n = threadPoolExecutor;
        this.f111509o = new Callable<Void>() {
            /* access modifiers changed from: private */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
                return null;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Void call() throws java.lang.Exception {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.utils.ax r0 = com.p280ss.android.ugc.aweme.utils.C42954ax.this
                    monitor-enter(r0)
                    com.ss.android.ugc.aweme.utils.ax r1 = com.p280ss.android.ugc.aweme.utils.C42954ax.this     // Catch:{ all -> 0x0025 }
                    java.io.Writer r1 = r1.f111500e     // Catch:{ all -> 0x0025 }
                    r2 = 0
                    if (r1 != 0) goto L_0x000c
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x000c:
                    com.ss.android.ugc.aweme.utils.ax r1 = com.p280ss.android.ugc.aweme.utils.C42954ax.this     // Catch:{ all -> 0x0025 }
                    r1.mo104655e()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.aweme.utils.ax r1 = com.p280ss.android.ugc.aweme.utils.C42954ax.this     // Catch:{ all -> 0x0025 }
                    boolean r1 = r1.mo104650b()     // Catch:{ all -> 0x0025 }
                    if (r1 == 0) goto L_0x0023
                    com.ss.android.ugc.aweme.utils.ax r1 = com.p280ss.android.ugc.aweme.utils.C42954ax.this     // Catch:{ all -> 0x0025 }
                    r1.mo104647a()     // Catch:{ all -> 0x0025 }
                    com.ss.android.ugc.aweme.utils.ax r1 = com.p280ss.android.ugc.aweme.utils.C42954ax.this     // Catch:{ all -> 0x0025 }
                    r3 = 0
                    r1.f111501f = r3     // Catch:{ all -> 0x0025 }
                L_0x0023:
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    return r2
                L_0x0025:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.C42954ax.C429551.call():java.lang.Void");
            }
        };
        this.f111497b = file;
        this.f111504j = i;
        this.f111502h = new File(file, "journal");
        this.f111503i = new File(file, "journal.tmp");
        this.f111499d = i2;
        this.f111498c = j;
    }

    /* renamed from: a */
    public static C42954ax m136348a(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            C42954ax axVar = new C42954ax(file, i, 1, j);
            if (axVar.f111502h.exists()) {
                try {
                    axVar.m136356f();
                    axVar.m136357g();
                    axVar.f111500e = new BufferedWriter(new FileWriter(axVar.f111502h, true), VideoCacheReadBuffersizeExperiment.DEFAULT);
                    return axVar;
                } catch (IOException unused) {
                    axVar.m136359i();
                }
            }
            file.mkdirs();
            C42954ax axVar2 = new C42954ax(file, i, 1, j);
            axVar2.mo104647a();
            return axVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }
}
