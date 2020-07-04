package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ok */
public final class C15925ok implements C15913nz {

    /* renamed from: a */
    private final zzaxe f44792a;

    /* renamed from: b */
    private final C15931oq f44793b;

    /* renamed from: c */
    private final Context f44794c;

    /* renamed from: d */
    private final C15916ob f44795d;

    /* renamed from: e */
    private final boolean f44796e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final long f44797f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final long f44798g;

    /* renamed from: h */
    private final int f44799h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final Object f44800i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f44801j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final Map<agj<C15922oh>, C15919oe> f44802k = new HashMap();

    /* renamed from: l */
    private final boolean f44803l;

    /* renamed from: m */
    private final String f44804m;

    /* renamed from: n */
    private List<C15922oh> f44805n = new ArrayList();

    /* renamed from: o */
    private final boolean f44806o;

    public C15925ok(Context context, zzaxe zzaxe, C15931oq oqVar, C15916ob obVar, boolean z, boolean z2, String str, long j, long j2, int i, boolean z3) {
        this.f44794c = context;
        this.f44792a = zzaxe;
        this.f44793b = oqVar;
        this.f44795d = obVar;
        this.f44796e = z;
        this.f44803l = z2;
        this.f44804m = str;
        this.f44797f = j;
        this.f44798g = j2;
        this.f44799h = 2;
        this.f44806o = z3;
    }

    /* renamed from: a */
    public final C15922oh mo41775a(List<C15915oa> list) {
        acd.m45777b("Starting mediation.");
        ArrayList arrayList = new ArrayList();
        zzyz zzyz = this.f44792a.f45574d;
        int[] iArr = new int[2];
        if (zzyz.f45804g != null && C15924oj.m51490a(this.f44804m, iArr)) {
            int i = 0;
            int i2 = iArr[0];
            int i3 = iArr[1];
            zzyz[] zzyzArr = zzyz.f45804g;
            int length = zzyzArr.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                zzyz zzyz2 = zzyzArr[i];
                if (i2 == zzyz2.f45802e && i3 == zzyz2.f45799b) {
                    zzyz = zzyz2;
                    break;
                }
                i++;
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15915oa oaVar = (C15915oa) it.next();
            String str = "Trying mediation network: ";
            String valueOf = String.valueOf(oaVar.f44716b);
            acd.m45781d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            Iterator it2 = oaVar.f44717c.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                Context context = this.f44794c;
                C15931oq oqVar = this.f44793b;
                C15916ob obVar = this.f44795d;
                zzyv zzyv = this.f44792a.f45573c;
                zzbgz zzbgz = this.f44792a.f45581k;
                boolean z = this.f44796e;
                boolean z2 = this.f44803l;
                zzafl zzafl = this.f44792a.f45595y;
                Iterator it3 = it;
                List<String> list2 = this.f44792a.f45584n;
                Iterator it4 = it2;
                ArrayList arrayList2 = arrayList;
                boolean z3 = z;
                C15915oa oaVar2 = oaVar;
                zzyz zzyz3 = zzyz;
                zzbgz zzbgz2 = zzbgz;
                C15919oe oeVar = new C15919oe(context, str2, oqVar, obVar, oaVar2, zzyv, zzyz3, zzbgz2, z3, z2, zzafl, list2, this.f44792a.f45596z, this.f44792a.f45561X, this.f44806o);
                agj a = acj.m45509a((Callable<T>) new C15926ol<T>(this, oeVar));
                this.f44802k.put(a, oeVar);
                ArrayList arrayList3 = arrayList2;
                arrayList3.add(a);
                arrayList = arrayList3;
                it = it3;
                it2 = it4;
            }
        }
        ArrayList arrayList4 = arrayList;
        if (this.f44799h != 2) {
            return m51493b((List<agj<C15922oh>>) arrayList4);
        }
        return m51496c((List<agj<C15922oh>>) arrayList4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0018, code lost:
        if (r4.hasNext() == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        r0 = (com.google.android.gms.internal.ads.agj) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r1 = (com.google.android.gms.internal.ads.C15922oh) r0.get();
        r3.f44805n.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r1.f44785a != 0) goto L_0x0014;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        m51492a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        com.google.android.gms.internal.ads.acd.m45780c("Exception while processing an adapter; continuing with other adapters", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        m51492a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        return new com.google.android.gms.internal.ads.C15922oh(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0010, code lost:
        r4 = r4.iterator();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C15922oh m51493b(java.util.List<com.google.android.gms.internal.ads.agj<com.google.android.gms.internal.ads.C15922oh>> r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f44800i
            monitor-enter(r0)
            boolean r1 = r3.f44801j     // Catch:{ all -> 0x0047 }
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.oh r4 = new com.google.android.gms.internal.ads.oh     // Catch:{ all -> 0x0047 }
            r1 = -1
            r4.<init>(r1)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return r4
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            java.util.Iterator r4 = r4.iterator()
        L_0x0014:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.ads.agj r0 = (com.google.android.gms.internal.ads.agj) r0
            java.lang.Object r1 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            com.google.android.gms.internal.ads.oh r1 = (com.google.android.gms.internal.ads.C15922oh) r1     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            java.util.List<com.google.android.gms.internal.ads.oh> r2 = r3.f44805n     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            r2.add(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r1 == 0) goto L_0x0014
            int r2 = r1.f44785a     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            if (r2 != 0) goto L_0x0014
            r3.m51492a(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0035 }
            return r1
        L_0x0035:
            r0 = move-exception
            java.lang.String r1 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.acd.m45780c(r1, r0)
            goto L_0x0014
        L_0x003c:
            r4 = 0
            r3.m51492a(r4)
            com.google.android.gms.internal.ads.oh r4 = new com.google.android.gms.internal.ads.oh
            r0 = 1
            r4.<init>(r0)
            return r4
        L_0x0047:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15925ok.m51493b(java.util.List):com.google.android.gms.internal.ads.oh");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        if (r13.f44795d.f44751n == -1) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        r0 = r13.f44795d.f44751n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        r0 = 10000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r14 = r14.iterator();
        r3 = null;
        r1 = r0;
        r0 = null;
        r4 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r14.hasNext() == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        r5 = (com.google.android.gms.internal.ads.agj) r14.next();
        r6 = com.google.android.gms.ads.internal.C14793ay.m42901g().mo38684a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r1 != 0) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.isDone() == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        r10 = (com.google.android.gms.internal.ads.C15922oh) r5.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        r10 = (com.google.android.gms.internal.ads.C15922oh) r5.get(r1, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        r13.f44805n.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        if (r10 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        if (r10.f44785a != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0067, code lost:
        r11 = r10.f44790f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        if (r11 == null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r11.mo41807a() <= r4) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0075, code lost:
        r3 = r5;
        r0 = r10;
        r4 = r11.mo41807a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0078, code lost:
        r1 = java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.C14793ay.m42901g().mo38684a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        com.google.android.gms.internal.ads.acd.m45780c("Exception while processing an adapter; continuing with other adapters", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
        r1 = java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.C14793ay.m42901g().mo38684a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        java.lang.Math.max(r1 - (com.google.android.gms.ads.internal.C14793ay.m42901g().mo38684a() - r6), 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a9, code lost:
        m51492a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ac, code lost:
        if (r0 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b4, code lost:
        return new com.google.android.gms.internal.ads.C15922oh(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b5, code lost:
        return r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C15922oh m51496c(java.util.List<com.google.android.gms.internal.ads.agj<com.google.android.gms.internal.ads.C15922oh>> r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f44800i
            monitor-enter(r0)
            boolean r1 = r13.f44801j     // Catch:{ all -> 0x00b6 }
            r2 = -1
            if (r1 == 0) goto L_0x000f
            com.google.android.gms.internal.ads.oh r14 = new com.google.android.gms.internal.ads.oh     // Catch:{ all -> 0x00b6 }
            r14.<init>(r2)     // Catch:{ all -> 0x00b6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            return r14
        L_0x000f:
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            com.google.android.gms.internal.ads.ob r0 = r13.f44795d
            long r0 = r0.f44751n
            r3 = -1
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x001f
            com.google.android.gms.internal.ads.ob r0 = r13.f44795d
            long r0 = r0.f44751n
            goto L_0x0021
        L_0x001f:
            r0 = 10000(0x2710, double:4.9407E-320)
        L_0x0021:
            java.util.Iterator r14 = r14.iterator()
            r3 = 0
            r1 = r0
            r0 = r3
            r4 = -1
        L_0x0029:
            boolean r5 = r14.hasNext()
            if (r5 == 0) goto L_0x00a9
            java.lang.Object r5 = r14.next()
            com.google.android.gms.internal.ads.agj r5 = (com.google.android.gms.internal.ads.agj) r5
            com.google.android.gms.common.util.e r6 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r6 = r6.mo38684a()
            r8 = 0
            int r10 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0054
            boolean r10 = r5.isDone()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x0054
            java.lang.Object r10 = r5.get()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            com.google.android.gms.internal.ads.oh r10 = (com.google.android.gms.internal.ads.C15922oh) r10     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            goto L_0x005c
        L_0x0050:
            r14 = move-exception
            goto L_0x009b
        L_0x0052:
            r5 = move-exception
            goto L_0x0087
        L_0x0054:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            java.lang.Object r10 = r5.get(r1, r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            com.google.android.gms.internal.ads.oh r10 = (com.google.android.gms.internal.ads.C15922oh) r10     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
        L_0x005c:
            java.util.List<com.google.android.gms.internal.ads.oh> r11 = r13.f44805n     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r11.add(r10)     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r10 == 0) goto L_0x0078
            int r11 = r10.f44785a     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 != 0) goto L_0x0078
            com.google.android.gms.internal.ads.pa r11 = r10.f44790f     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r11 == 0) goto L_0x0078
            int r12 = r11.mo41807a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            if (r12 <= r4) goto L_0x0078
            int r11 = r11.mo41807a()     // Catch:{ RemoteException | InterruptedException | ExecutionException | TimeoutException -> 0x0052 }
            r3 = r5
            r0 = r10
            r4 = r11
        L_0x0078:
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r10 = r5.mo38684a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0029
        L_0x0087:
            java.lang.String r10 = "Exception while processing an adapter; continuing with other adapters"
            com.google.android.gms.internal.ads.acd.m45780c(r10, r5)     // Catch:{ all -> 0x0050 }
            com.google.android.gms.common.util.e r5 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r10 = r5.mo38684a()
            long r10 = r10 - r6
            long r1 = r1 - r10
            long r1 = java.lang.Math.max(r1, r8)
            goto L_0x0029
        L_0x009b:
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r3 = r0.mo38684a()
            long r3 = r3 - r6
            long r1 = r1 - r3
            java.lang.Math.max(r1, r8)
            throw r14
        L_0x00a9:
            r13.m51492a(r3)
            if (r0 != 0) goto L_0x00b5
            com.google.android.gms.internal.ads.oh r14 = new com.google.android.gms.internal.ads.oh
            r0 = 1
            r14.<init>(r0)
            return r14
        L_0x00b5:
            return r0
        L_0x00b6:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b6 }
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15925ok.m51496c(java.util.List):com.google.android.gms.internal.ads.oh");
    }

    /* renamed from: a */
    private final void m51492a(agj<C15922oh> agj) {
        acl.f40003a.post(new C15927om(this, agj));
    }

    /* renamed from: a */
    public final void mo41776a() {
        synchronized (this.f44800i) {
            this.f44801j = true;
            for (C15919oe a : this.f44802k.values()) {
                a.mo41803a();
            }
        }
    }

    /* renamed from: b */
    public final List<C15922oh> mo41777b() {
        return this.f44805n;
    }
}
