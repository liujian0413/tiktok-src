package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.C15329l;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;

@C6505uv
public final class ajn implements bjp {

    /* renamed from: a */
    private InputStream f40417a;

    /* renamed from: b */
    private boolean f40418b;

    /* renamed from: c */
    private final Context f40419c;

    /* renamed from: d */
    private final bjp f40420d;

    /* renamed from: e */
    private final WeakReference<ajo> f40421e;

    public ajn(Context context, bjp bjp, ajo ajo) {
        this.f40419c = context;
        this.f40420d = bjp;
        this.f40421e = new WeakReference<>(ajo);
    }

    /* renamed from: a */
    public final void mo39544a() throws IOException {
        if (this.f40418b) {
            this.f40418b = false;
            if (this.f40417a != null) {
                C15329l.m44589a(this.f40417a);
                this.f40417a = null;
                return;
            }
            this.f40420d.mo39544a();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.cancel(true);
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r4.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d7, code lost:
        r4 = com.google.android.gms.ads.internal.C14793ay.m42901g().mo38685b() - r9;
        r2 = (com.google.android.gms.internal.ads.ajo) r1.f40421e.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e8, code lost:
        if (r2 != null) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ea, code lost:
        r2.mo39530a(false, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ed, code lost:
        r2 = new java.lang.StringBuilder(44);
        r2.append("Cache connection took ");
        r2.append(r4);
        r2.append("ms");
        com.google.android.gms.internal.ads.acd.m45438a(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0107, code lost:
        r2 = com.google.android.gms.ads.internal.C14793ay.m42901g().mo38685b() - r9;
        r4 = (com.google.android.gms.internal.ads.ajo) r1.f40421e.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0118, code lost:
        if (r4 != null) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x011a, code lost:
        r4.mo39530a(false, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x011d, code lost:
        r4 = new java.lang.StringBuilder(44);
        r4.append("Cache connection took ");
        r4.append(r2);
        r4.append("ms");
        com.google.android.gms.internal.ads.acd.m45438a(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0136, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x0099, B:24:0x00d4] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0099 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00d4 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:24:0x00d4=Splitter:B:24:0x00d4, B:18:0x0099=Splitter:B:18:0x0099} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo39543a(com.google.android.gms.internal.ads.bjq r18) throws java.io.IOException {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            boolean r2 = r1.f40418b
            if (r2 != 0) goto L_0x0177
            r2 = 1
            r1.f40418b = r2
            android.net.Uri r3 = r0.f42325a
            com.google.android.gms.internal.ads.zzwr r3 = com.google.android.gms.internal.ads.zzwr.m53213a(r3)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C15585bw.f43899cn
            com.google.android.gms.internal.ads.bt r5 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r4 = r5.mo41272a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = -1
            if (r4 == 0) goto L_0x0137
            if (r3 == 0) goto L_0x0155
            long r7 = r0.f42327c
            r3.f45769c = r7
            boolean r4 = r3.f45768b
            if (r4 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.bl<java.lang.Long> r4 = com.google.android.gms.internal.ads.C15585bw.f43901cp
            com.google.android.gms.internal.ads.bt r7 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r4 = r7.mo41272a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            goto L_0x0048
        L_0x003c:
            com.google.android.gms.internal.ads.bl<java.lang.Long> r4 = com.google.android.gms.internal.ads.C15585bw.f43900co
            com.google.android.gms.internal.ads.bt r7 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r4 = r7.mo41272a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
        L_0x0048:
            long r7 = r4.longValue()
            com.google.android.gms.common.util.e r4 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r9 = r4.mo38685b()
            android.content.Context r4 = r1.f40419c
            java.util.concurrent.Future r4 = com.google.android.gms.internal.ads.bwk.m50205a(r4, r3)
            r11 = 0
            r12 = 44
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00d4, InterruptedException -> 0x0099 }
            java.lang.Object r7 = r4.get(r7, r13)     // Catch:{ ExecutionException | TimeoutException -> 0x00d4, InterruptedException -> 0x0099 }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d4, InterruptedException -> 0x0099 }
            r1.f40417a = r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d4, InterruptedException -> 0x0099 }
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r3 = r0.mo38685b()
            long r3 = r3 - r9
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ajo> r0 = r1.f40421e
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.ajo r0 = (com.google.android.gms.internal.ads.ajo) r0
            if (r0 == 0) goto L_0x007d
            r0.mo39530a(r2, r3)
        L_0x007d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r12)
            java.lang.String r2 = "Cache connection took "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.google.android.gms.internal.ads.acd.m45438a(r0)
            return r5
        L_0x0097:
            r0 = move-exception
            goto L_0x0107
        L_0x0099:
            r4.cancel(r2)     // Catch:{ all -> 0x0097 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0097 }
            r2.interrupt()     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r4 = r2.mo38685b()
            long r4 = r4 - r9
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ajo> r2 = r1.f40421e
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.ajo r2 = (com.google.android.gms.internal.ads.ajo) r2
            if (r2 == 0) goto L_0x00b9
            r2.mo39530a(r11, r4)
        L_0x00b9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.acd.m45438a(r2)
            goto L_0x0155
        L_0x00d4:
            r4.cancel(r2)     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r4 = r2.mo38685b()
            long r4 = r4 - r9
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ajo> r2 = r1.f40421e
            java.lang.Object r2 = r2.get()
            com.google.android.gms.internal.ads.ajo r2 = (com.google.android.gms.internal.ads.ajo) r2
            if (r2 == 0) goto L_0x00ed
            r2.mo39530a(r11, r4)
        L_0x00ed:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.acd.m45438a(r2)
            goto L_0x0155
        L_0x0107:
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r2 = r2.mo38685b()
            long r2 = r2 - r9
            java.lang.ref.WeakReference<com.google.android.gms.internal.ads.ajo> r4 = r1.f40421e
            java.lang.Object r4 = r4.get()
            com.google.android.gms.internal.ads.ajo r4 = (com.google.android.gms.internal.ads.ajo) r4
            if (r4 == 0) goto L_0x011d
            r4.mo39530a(r11, r2)
        L_0x011d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r12)
            java.lang.String r5 = "Cache connection took "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "ms"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            com.google.android.gms.internal.ads.acd.m45438a(r2)
            throw r0
        L_0x0137:
            r2 = 0
            if (r3 == 0) goto L_0x0146
            long r7 = r0.f42327c
            r3.f45769c = r7
            com.google.android.gms.internal.ads.bvq r2 = com.google.android.gms.ads.internal.C14793ay.m42900f()
            com.google.android.gms.internal.ads.zzwo r2 = r2.mo41395a(r3)
        L_0x0146:
            if (r2 == 0) goto L_0x0155
            boolean r4 = r2.mo42392a()
            if (r4 == 0) goto L_0x0155
            java.io.InputStream r0 = r2.mo42393b()
            r1.f40417a = r0
            return r5
        L_0x0155:
            if (r3 == 0) goto L_0x0170
            com.google.android.gms.internal.ads.bjq r2 = new com.google.android.gms.internal.ads.bjq
            java.lang.String r3 = r3.f45767a
            android.net.Uri r8 = android.net.Uri.parse(r3)
            long r9 = r0.f42326b
            long r11 = r0.f42327c
            long r13 = r0.f42328d
            java.lang.String r15 = r0.f42329e
            int r0 = r0.f42330f
            r7 = r2
            r16 = r0
            r7.<init>(r8, r9, r11, r13, r15, r16)
            r0 = r2
        L_0x0170:
            com.google.android.gms.internal.ads.bjp r2 = r1.f40420d
            long r2 = r2.mo39543a(r0)
            return r2
        L_0x0177:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ajn.mo39543a(com.google.android.gms.internal.ads.bjq):long");
    }

    /* renamed from: a */
    public final int mo39542a(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f40418b) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        } else if (this.f40417a != null) {
            return this.f40417a.read(bArr, i, i2);
        } else {
            return this.f40420d.mo39542a(bArr, i, i2);
        }
    }
}
