package com.google.android.play.core.splitcompat;

import com.google.android.play.core.internal.C6514ak;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.f */
public final class C6551f {

    /* renamed from: a */
    private static final Pattern f18856a = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: b */
    private final C6548c f18857b;

    C6551f(C6548c cVar) throws IOException {
        this.f18857b = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final Set<File> m20369a(Set<C6556k> set, C6562q qVar, ZipFile zipFile) throws IOException {
        HashSet hashSet = new HashSet();
        m20372a(qVar, set, (C6557l) new C6555j(hashSet, qVar, zipFile));
        return hashSet;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0 A[SYNTHETIC, Splitter:B:30:0x00a0] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m20371a(com.google.android.play.core.splitcompat.C6562q r8, com.google.android.play.core.splitcompat.C6554i r9) throws java.io.IOException {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x009c }
            java.io.File r8 = r8.f18872a     // Catch:{ IOException -> 0x009c }
            r1.<init>(r8)     // Catch:{ IOException -> 0x009c }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ IOException -> 0x009a }
            r8.<init>()     // Catch:{ IOException -> 0x009a }
            java.util.Enumeration r0 = r1.entries()     // Catch:{ IOException -> 0x009a }
        L_0x0011:
            boolean r2 = r0.hasMoreElements()     // Catch:{ IOException -> 0x009a }
            if (r2 == 0) goto L_0x0050
            java.lang.Object r2 = r0.nextElement()     // Catch:{ IOException -> 0x009a }
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch:{ IOException -> 0x009a }
            java.lang.String r3 = r2.getName()     // Catch:{ IOException -> 0x009a }
            java.util.regex.Pattern r4 = f18856a     // Catch:{ IOException -> 0x009a }
            java.util.regex.Matcher r3 = r4.matcher(r3)     // Catch:{ IOException -> 0x009a }
            boolean r4 = r3.matches()     // Catch:{ IOException -> 0x009a }
            if (r4 == 0) goto L_0x0011
            r4 = 1
            java.lang.String r4 = r3.group(r4)     // Catch:{ IOException -> 0x009a }
            r5 = 2
            java.lang.String r3 = r3.group(r5)     // Catch:{ IOException -> 0x009a }
            java.lang.Object r5 = r8.get(r4)     // Catch:{ IOException -> 0x009a }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ IOException -> 0x009a }
            if (r5 != 0) goto L_0x0047
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ IOException -> 0x009a }
            r5.<init>()     // Catch:{ IOException -> 0x009a }
            r8.put(r4, r5)     // Catch:{ IOException -> 0x009a }
        L_0x0047:
            com.google.android.play.core.splitcompat.k r4 = new com.google.android.play.core.splitcompat.k     // Catch:{ IOException -> 0x009a }
            r4.<init>(r2, r3)     // Catch:{ IOException -> 0x009a }
            r5.add(r4)     // Catch:{ IOException -> 0x009a }
            goto L_0x0011
        L_0x0050:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ IOException -> 0x009a }
            r0.<init>()     // Catch:{ IOException -> 0x009a }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x009a }
            int r3 = r2.length     // Catch:{ IOException -> 0x009a }
            r4 = 0
        L_0x0059:
            if (r4 >= r3) goto L_0x008a
            r5 = r2[r4]     // Catch:{ IOException -> 0x009a }
            boolean r6 = r8.containsKey(r5)     // Catch:{ IOException -> 0x009a }
            if (r6 == 0) goto L_0x0087
            java.lang.Object r5 = r8.get(r5)     // Catch:{ IOException -> 0x009a }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ IOException -> 0x009a }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x009a }
        L_0x006d:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x009a }
            if (r6 == 0) goto L_0x0087
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x009a }
            com.google.android.play.core.splitcompat.k r6 = (com.google.android.play.core.splitcompat.C6556k) r6     // Catch:{ IOException -> 0x009a }
            java.lang.String r7 = r6.f18865a     // Catch:{ IOException -> 0x009a }
            boolean r7 = r0.containsKey(r7)     // Catch:{ IOException -> 0x009a }
            if (r7 != 0) goto L_0x006d
            java.lang.String r7 = r6.f18865a     // Catch:{ IOException -> 0x009a }
            r0.put(r7, r6)     // Catch:{ IOException -> 0x009a }
            goto L_0x006d
        L_0x0087:
            int r4 = r4 + 1
            goto L_0x0059
        L_0x008a:
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ IOException -> 0x009a }
            java.util.Collection r0 = r0.values()     // Catch:{ IOException -> 0x009a }
            r8.<init>(r0)     // Catch:{ IOException -> 0x009a }
            r9.mo15917a(r1, r8)     // Catch:{ IOException -> 0x009a }
            r1.close()     // Catch:{ IOException -> 0x009a }
            return
        L_0x009a:
            r8 = move-exception
            goto L_0x009e
        L_0x009c:
            r8 = move-exception
            r1 = r0
        L_0x009e:
            if (r1 == 0) goto L_0x00a8
            r1.close()     // Catch:{ IOException -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r9 = move-exception
            com.google.android.play.core.internal.C6514ak.m20231a(r8, r9)
        L_0x00a8:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C6551f.m20371a(com.google.android.play.core.splitcompat.q, com.google.android.play.core.splitcompat.i):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m20372a(C6562q qVar, Set<C6556k> set, C6557l lVar) throws IOException {
        for (C6556k kVar : set) {
            File a = this.f18857b.mo15904a(qVar.f18873b, kVar.f18865a);
            lVar.mo15920a(kVar, a, a.exists() && a.length() == kVar.f18866b.getSize());
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m20373a(Throwable th, FileOutputStream fileOutputStream) {
        if (th != null) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                C6514ak.m20231a(th, th2);
            }
        } else {
            fileOutputStream.close();
        }
    }

    /* renamed from: a */
    private static /* synthetic */ void m20374a(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                C6514ak.m20231a(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        m20374a((java.lang.Throwable) null, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        if (r4 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        m20374a(r5, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0038, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        m20373a((java.lang.Throwable) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r4 == null) goto L_?;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m20376b(java.util.zip.ZipFile r4, java.util.zip.ZipEntry r5, java.io.File r6) throws java.io.IOException {
        /*
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            java.io.InputStream r4 = r4.getInputStream(r5)
            r5 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0031 }
            r1.<init>(r6)     // Catch:{ Throwable -> 0x0031 }
        L_0x000e:
            int r6 = r4.read(r0)     // Catch:{ Throwable -> 0x0025, all -> 0x0022 }
            if (r6 <= 0) goto L_0x0019
            r2 = 0
            r1.write(r0, r2, r6)     // Catch:{ Throwable -> 0x0025, all -> 0x0022 }
            goto L_0x000e
        L_0x0019:
            m20373a(r5, r1)     // Catch:{ Throwable -> 0x0031 }
            if (r4 == 0) goto L_0x0021
            m20374a(r5, r4)
        L_0x0021:
            return
        L_0x0022:
            r6 = move-exception
            r0 = r5
            goto L_0x002b
        L_0x0025:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            r3 = r0
            r0 = r6
            r6 = r3
        L_0x002b:
            m20373a(r0, r1)     // Catch:{ Throwable -> 0x0031 }
            throw r6     // Catch:{ Throwable -> 0x0031 }
        L_0x002f:
            r6 = move-exception
            goto L_0x0033
        L_0x0031:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x002f }
        L_0x0033:
            if (r4 == 0) goto L_0x0038
            m20374a(r5, r4)
        L_0x0038:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C6551f.m20376b(java.util.zip.ZipFile, java.util.zip.ZipEntry, java.io.File):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<File> mo15918a() throws IOException {
        Set<C6562q> d = this.f18857b.mo15911d();
        for (String str : this.f18857b.mo15913e()) {
            boolean z = false;
            Iterator it = d.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C6562q) it.next()).f18873b.equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                this.f18857b.mo15912d(str);
            }
        }
        HashSet hashSet = new HashSet();
        for (C6562q qVar : d) {
            HashSet hashSet2 = new HashSet();
            m20371a(qVar, (C6554i) new C6552g(this, hashSet2, qVar));
            for (File file : this.f18857b.mo15914e(qVar.f18873b)) {
                if (!hashSet2.contains(file)) {
                    this.f18857b.mo15908b(file);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<File> mo15919a(C6562q qVar) throws IOException {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        m20371a(qVar, (C6554i) new C6550e(this, qVar, hashSet, atomicBoolean));
        if (atomicBoolean.get()) {
            return hashSet;
        }
        return null;
    }
}
