package com.google.android.play.core.splitcompat;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import com.C1642a;
import com.google.android.play.core.internal.C6509aa;
import com.google.android.play.core.internal.C6512ad;
import com.google.android.play.core.internal.C6521b;
import com.google.android.play.core.internal.C6523d;
import com.google.android.play.core.splitinstall.C6566n;
import com.google.android.play.core.splitinstall.C6569r;
import com.google.android.play.core.splitinstall.C6570s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.play.core.splitcompat.a */
public final class C6546a {

    /* renamed from: a */
    private static final AtomicReference<C6546a> f18846a = new AtomicReference<>(null);
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6548c f18847b;

    /* renamed from: c */
    private final Set<String> f18848c = new HashSet();

    private C6546a(Context context) {
        try {
            this.f18847b = new C6548c(context);
        } catch (NameNotFoundException | IOException e) {
            throw new C6509aa("Failed to initialize FileStorage", e);
        }
    }

    /* renamed from: a */
    public static boolean m20335a() {
        return f18846a.get() != null;
    }

    /* renamed from: a */
    public static boolean m20336a(Context context) {
        return m20337a(context, true);
    }

    /* renamed from: a */
    private static boolean m20337a(Context context, boolean z) {
        if (VERSION.SDK_INT < 21) {
            return false;
        }
        C6546a aVar = (C6546a) f18846a.get();
        if (f18846a.compareAndSet(null, new C6546a(context))) {
            C6521b bVar = new C6521b(context, C6547b.m20344a(), new C6523d(context, aVar.f18847b, new C6512ad()), aVar.f18847b, new C6570s());
            C6566n.m20394a(bVar);
            C6569r.m20400a(new C6558m(aVar));
            C6547b.m20344a().execute(new C6560o(context));
        }
        try {
            aVar.m20341b(context, z);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001d A[SYNTHETIC, Splitter:B:15:0x001d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m20338a(com.google.android.play.core.splitcompat.C6562q r2) throws java.io.IOException {
        /*
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x001a }
            java.io.File r2 = r2.f18872a     // Catch:{ IOException -> 0x001a }
            r1.<init>(r2)     // Catch:{ IOException -> 0x001a }
            java.lang.String r2 = "classes.dex"
            java.util.zip.ZipEntry r2 = r1.getEntry(r2)     // Catch:{ IOException -> 0x0017 }
            if (r2 == 0) goto L_0x0012
            r2 = 1
            goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r1.close()     // Catch:{ IOException -> 0x0017 }
            return r2
        L_0x0017:
            r2 = move-exception
            r0 = r1
            goto L_0x001b
        L_0x001a:
            r2 = move-exception
        L_0x001b:
            if (r0 == 0) goto L_0x0025
            r0.close()     // Catch:{ IOException -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r0 = move-exception
            com.google.android.play.core.internal.C6514ak.m20231a(r2, r0)
        L_0x0025:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C6546a.m20338a(com.google.android.play.core.splitcompat.q):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized Set<String> m20340b() {
        return new HashSet(this.f18848c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0134 A[Catch:{ all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x010c A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void m20341b(android.content.Context r9, boolean r10) throws java.io.IOException {
        /*
            r8 = this;
            monitor-enter(r8)
            if (r10 == 0) goto L_0x000c
            com.google.android.play.core.splitcompat.c r0 = r8.f18847b     // Catch:{ all -> 0x0009 }
            r0.mo15905a()     // Catch:{ all -> 0x0009 }
            goto L_0x0018
        L_0x0009:
            r9 = move-exception
            goto L_0x0184
        L_0x000c:
            java.util.concurrent.Executor r0 = com.google.android.play.core.splitcompat.C6547b.m20344a()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.n r1 = new com.google.android.play.core.splitcompat.n     // Catch:{ all -> 0x0009 }
            r1.<init>(r8)     // Catch:{ all -> 0x0009 }
            r0.execute(r1)     // Catch:{ all -> 0x0009 }
        L_0x0018:
            java.util.List r0 = m20343c(r9)     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.c r1 = r8.f18847b     // Catch:{ all -> 0x0009 }
            java.util.Set r1 = r1.mo15911d()     // Catch:{ all -> 0x0009 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0009 }
        L_0x002b:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0009 }
            if (r4 == 0) goto L_0x004e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.q r4 = (com.google.android.play.core.splitcompat.C6562q) r4     // Catch:{ all -> 0x0009 }
            java.lang.String r4 = r4.f18873b     // Catch:{ all -> 0x0009 }
            boolean r5 = r0.contains(r4)     // Catch:{ all -> 0x0009 }
            if (r5 == 0) goto L_0x002b
            if (r10 == 0) goto L_0x0047
            com.google.android.play.core.splitcompat.c r5 = r8.f18847b     // Catch:{ all -> 0x0009 }
            r5.mo15915f(r4)     // Catch:{ all -> 0x0009 }
            goto L_0x004a
        L_0x0047:
            r2.add(r4)     // Catch:{ all -> 0x0009 }
        L_0x004a:
            r3.remove()     // Catch:{ all -> 0x0009 }
            goto L_0x002b
        L_0x004e:
            boolean r3 = r2.isEmpty()     // Catch:{ all -> 0x0009 }
            if (r3 != 0) goto L_0x0060
            java.util.concurrent.Executor r3 = com.google.android.play.core.splitcompat.C6547b.m20344a()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.p r4 = new com.google.android.play.core.splitcompat.p     // Catch:{ all -> 0x0009 }
            r4.<init>(r8, r2)     // Catch:{ all -> 0x0009 }
            r3.execute(r4)     // Catch:{ all -> 0x0009 }
        L_0x0060:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0009 }
            r2.<init>()     // Catch:{ all -> 0x0009 }
            java.util.Iterator r3 = r1.iterator()     // Catch:{ all -> 0x0009 }
        L_0x0069:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0009 }
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.q r4 = (com.google.android.play.core.splitcompat.C6562q) r4     // Catch:{ all -> 0x0009 }
            java.lang.String r4 = r4.f18873b     // Catch:{ all -> 0x0009 }
            boolean r5 = com.google.android.play.core.splitinstall.C6572u.m20405b(r4)     // Catch:{ all -> 0x0009 }
            if (r5 != 0) goto L_0x0069
            r2.add(r4)     // Catch:{ all -> 0x0009 }
            goto L_0x0069
        L_0x0081:
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0009 }
        L_0x0085:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0009 }
            if (r3 == 0) goto L_0x009b
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0009 }
            boolean r4 = com.google.android.play.core.splitinstall.C6572u.m20405b(r3)     // Catch:{ all -> 0x0009 }
            if (r4 != 0) goto L_0x0085
            r2.add(r3)     // Catch:{ all -> 0x0009 }
            goto L_0x0085
        L_0x009b:
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x0009 }
            int r3 = r1.size()     // Catch:{ all -> 0x0009 }
            r0.<init>(r3)     // Catch:{ all -> 0x0009 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0009 }
        L_0x00a8:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0009 }
            if (r3 == 0) goto L_0x00cc
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.q r3 = (com.google.android.play.core.splitcompat.C6562q) r3     // Catch:{ all -> 0x0009 }
            java.lang.String r4 = r3.f18873b     // Catch:{ all -> 0x0009 }
            boolean r4 = com.google.android.play.core.splitinstall.C6572u.m20404a(r4)     // Catch:{ all -> 0x0009 }
            if (r4 != 0) goto L_0x00c8
            java.lang.String r4 = r3.f18873b     // Catch:{ all -> 0x0009 }
            java.lang.String r4 = com.google.android.play.core.splitinstall.C6572u.m20407c(r4)     // Catch:{ all -> 0x0009 }
            boolean r4 = r2.contains(r4)     // Catch:{ all -> 0x0009 }
            if (r4 == 0) goto L_0x00a8
        L_0x00c8:
            r0.add(r3)     // Catch:{ all -> 0x0009 }
            goto L_0x00a8
        L_0x00cc:
            com.google.android.play.core.splitcompat.f r1 = new com.google.android.play.core.splitcompat.f     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.c r2 = r8.f18847b     // Catch:{ all -> 0x0009 }
            r1.<init>(r2)     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.internal.g r2 = com.google.android.play.core.internal.C6525f.m20284a()     // Catch:{ all -> 0x0009 }
            java.lang.ClassLoader r3 = r9.getClassLoader()     // Catch:{ all -> 0x0009 }
            if (r10 == 0) goto L_0x00e5
            java.util.Set r1 = r1.mo15918a()     // Catch:{ all -> 0x0009 }
            r2.mo15894a(r3, r1)     // Catch:{ all -> 0x0009 }
            goto L_0x0103
        L_0x00e5:
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0009 }
        L_0x00e9:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0009 }
            if (r5 == 0) goto L_0x0103
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.C6562q) r5     // Catch:{ all -> 0x0009 }
            java.util.Set r5 = r1.mo15919a(r5)     // Catch:{ all -> 0x0009 }
            if (r5 != 0) goto L_0x00ff
            r4.remove()     // Catch:{ all -> 0x0009 }
            goto L_0x00e9
        L_0x00ff:
            r2.mo15894a(r3, r5)     // Catch:{ all -> 0x0009 }
            goto L_0x00e9
        L_0x0103:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0009 }
            r1.<init>()     // Catch:{ all -> 0x0009 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x0009 }
        L_0x010c:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x0009 }
            if (r5 == 0) goto L_0x013a
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.q r5 = (com.google.android.play.core.splitcompat.C6562q) r5     // Catch:{ all -> 0x0009 }
            boolean r6 = m20338a(r5)     // Catch:{ all -> 0x0009 }
            if (r6 == 0) goto L_0x0131
            com.google.android.play.core.splitcompat.c r6 = r8.f18847b     // Catch:{ all -> 0x0009 }
            java.lang.String r7 = r5.f18873b     // Catch:{ all -> 0x0009 }
            java.io.File r6 = r6.mo15910c(r7)     // Catch:{ all -> 0x0009 }
            java.io.File r7 = r5.f18872a     // Catch:{ all -> 0x0009 }
            boolean r6 = r2.mo15895a(r3, r6, r7, r10)     // Catch:{ all -> 0x0009 }
            if (r6 == 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            r6 = 0
            goto L_0x0132
        L_0x0131:
            r6 = 1
        L_0x0132:
            if (r6 == 0) goto L_0x010c
            java.io.File r5 = r5.f18872a     // Catch:{ all -> 0x0009 }
            r1.add(r5)     // Catch:{ all -> 0x0009 }
            goto L_0x010c
        L_0x013a:
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch:{ all -> 0x0009 }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x0009 }
        L_0x0142:
            boolean r2 = r10.hasNext()     // Catch:{ all -> 0x0009 }
            if (r2 == 0) goto L_0x0162
            java.lang.Object r2 = r10.next()     // Catch:{ all -> 0x0009 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = "addAssetPath"
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            java.lang.String r2 = r2.getPath()     // Catch:{ all -> 0x0009 }
            java.lang.Object r2 = com.google.android.play.core.internal.C6512ad.m20221a(r9, r3, r4, r5, r2)     // Catch:{ all -> 0x0009 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0009 }
            r2.intValue()     // Catch:{ all -> 0x0009 }
            goto L_0x0142
        L_0x0162:
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0009 }
        L_0x0166:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0009 }
            if (r10 == 0) goto L_0x0182
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0009 }
            com.google.android.play.core.splitcompat.q r10 = (com.google.android.play.core.splitcompat.C6562q) r10     // Catch:{ all -> 0x0009 }
            java.io.File r0 = r10.f18872a     // Catch:{ all -> 0x0009 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0009 }
            if (r0 == 0) goto L_0x0166
            java.util.Set<java.lang.String> r0 = r8.f18848c     // Catch:{ all -> 0x0009 }
            java.lang.String r10 = r10.f18873b     // Catch:{ all -> 0x0009 }
            r0.add(r10)     // Catch:{ all -> 0x0009 }
            goto L_0x0166
        L_0x0182:
            monitor-exit(r8)
            return
        L_0x0184:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitcompat.C6546a.m20341b(android.content.Context, boolean):void");
    }

    /* renamed from: b */
    public static boolean m20342b(Context context) {
        return m20337a(context, false);
    }

    /* renamed from: c */
    private static List<String> m20343c(Context context) throws IOException {
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            return packageInfo.splitNames == null ? new ArrayList() : Arrays.asList(packageInfo.splitNames);
        } catch (NameNotFoundException e) {
            throw new IOException(C1642a.m8034a("Cannot load data for application '%s'", new Object[]{packageName}), e);
        }
    }
}
