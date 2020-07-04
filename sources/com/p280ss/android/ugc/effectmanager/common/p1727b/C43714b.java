package com.p280ss.android.ugc.effectmanager.common.p1727b;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.ss.android.ugc.effectmanager.common.b.b */
public final class C43714b {

    /* renamed from: a */
    private final File f113205a;

    /* renamed from: b */
    private final File f113206b;

    /* renamed from: c */
    private final File f113207c;

    /* renamed from: d */
    private Writer f113208d;

    /* renamed from: e */
    private int f113209e;

    /* renamed from: f */
    private final LinkedHashMap<String, String> f113210f = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: a */
    private void m138537a() throws IOException {
        if (this.f113208d == null) {
            throw new IllegalStateException("map file is closed");
        } else if (!this.f113205a.exists()) {
            m138542c();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|(1:15)(1:16)|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r7.f113209e = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0043, code lost:
        if (r0.mo105764b() != false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        m138542c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0049, code lost:
        r7.f113208d = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r7.f113205a, true), com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.f113217a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0063=Splitter:B:19:0x0063, B:12:0x003d=Splitter:B:12:0x003d} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m138540b() throws java.io.IOException {
        /*
            r7 = this;
            com.ss.android.ugc.effectmanager.common.b.c r0 = new com.ss.android.ugc.effectmanager.common.b.c
            java.io.FileInputStream r1 = new java.io.FileInputStream
            java.io.File r2 = r7.f113205a
            r1.<init>(r2)
            java.nio.charset.Charset r2 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.f113217a
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.mo105763a()     // Catch:{ all -> 0x008c }
            java.lang.String r2 = r0.mo105763a()     // Catch:{ all -> 0x008c }
            java.lang.String r3 = r0.mo105763a()     // Catch:{ all -> 0x008c }
            java.lang.String r4 = "id.to.effectid"
            boolean r4 = r4.equals(r1)     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = "1"
            boolean r4 = r4.equals(r2)     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0063
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r3)     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0063
            r1 = 0
        L_0x0033:
            java.lang.String r2 = r0.mo105763a()     // Catch:{ EOFException -> 0x003d }
            r7.m138541b(r2)     // Catch:{ EOFException -> 0x003d }
            int r1 = r1 + 1
            goto L_0x0033
        L_0x003d:
            r7.f113209e = r1     // Catch:{ all -> 0x008c }
            boolean r1 = r0.mo105764b()     // Catch:{ all -> 0x008c }
            if (r1 == 0) goto L_0x0049
            r7.m138542c()     // Catch:{ all -> 0x008c }
            goto L_0x005f
        L_0x0049:
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch:{ all -> 0x008c }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x008c }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x008c }
            java.io.File r4 = r7.f113205a     // Catch:{ all -> 0x008c }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x008c }
            java.nio.charset.Charset r4 = com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.f113217a     // Catch:{ all -> 0x008c }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x008c }
            r1.<init>(r2)     // Catch:{ all -> 0x008c }
            r7.f113208d = r1     // Catch:{ all -> 0x008c }
        L_0x005f:
            com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.m138548a(r0)
            return
        L_0x0063:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            java.lang.String r6 = "unexpected Map header: ["
            r5.<init>(r6)     // Catch:{ all -> 0x008c }
            r5.append(r1)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = ", "
            r5.append(r1)     // Catch:{ all -> 0x008c }
            r5.append(r2)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = ", "
            r5.append(r1)     // Catch:{ all -> 0x008c }
            r5.append(r3)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "]"
            r5.append(r1)     // Catch:{ all -> 0x008c }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x008c }
            r4.<init>(r1)     // Catch:{ all -> 0x008c }
            throw r4     // Catch:{ all -> 0x008c }
        L_0x008c:
            r1 = move-exception
            com.p280ss.android.ugc.effectmanager.common.p1727b.C43717d.m138548a(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.common.p1727b.C43714b.m138540b():void");
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private synchronized void m138542c() throws IOException {
        if (this.f113208d != null) {
            this.f113208d.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f113206b), C43717d.f113217a));
        try {
            bufferedWriter.write("id.to.effectid");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            this.f113209e = 0;
            for (Entry entry : this.f113210f.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append((String) entry.getKey());
                sb.append(' ');
                sb.append((String) entry.getValue());
                sb.append(10);
                bufferedWriter.write(sb.toString());
                this.f113209e++;
            }
            bufferedWriter.close();
            if (this.f113205a.exists()) {
                m138539a(this.f113205a, this.f113207c, true);
            }
            m138539a(this.f113206b, this.f113205a, false);
            this.f113207c.delete();
            this.f113208d = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f113205a, true), C43717d.f113217a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: a */
    public final String mo105761a(String str) {
        return (String) this.f113210f.get(str);
    }

    /* renamed from: a */
    private static void m138538a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: b */
    private void m138541b(String str) throws IOException {
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            this.f113210f.put(str.substring(0, indexOf), str.substring(indexOf + 1));
            return;
        }
        StringBuilder sb = new StringBuilder("unexpected Map line: ");
        sb.append(str);
        throw new IOException(sb.toString());
    }

    public C43714b(File file) {
        this.f113205a = new File(file, "effectidmap");
        this.f113206b = new File(file, "effectidmap.tmp");
        this.f113207c = new File(file, "effectidmap.bak");
        try {
            if (this.f113207c.exists()) {
                if (this.f113205a.exists()) {
                    this.f113207c.delete();
                } else {
                    m138539a(this.f113207c, this.f113205a, false);
                }
            }
            if (this.f113205a.exists()) {
                m138540b();
            } else {
                m138542c();
            }
        } catch (IOException e) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder("EffectIdMapFile ");
            sb.append(file);
            sb.append(" is corrupt: ");
            sb.append(e.getMessage());
            sb.append(", removing");
            printStream.println(sb.toString());
            this.f113205a.delete();
        }
    }

    /* renamed from: a */
    public final void mo105762a(String str, String str2) {
        if (!this.f113210f.containsKey(str)) {
            this.f113210f.put(str, str2);
            try {
                m138537a();
                Writer writer = this.f113208d;
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(' ');
                sb.append(str2);
                sb.append(10);
                writer.write(sb.toString());
                this.f113208d.flush();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m138539a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m138538a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }
}
