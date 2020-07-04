package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.util.C15329l;
import java.io.IOException;
import java.io.InputStream;

@C6505uv
public final class ake implements bre {

    /* renamed from: a */
    private InputStream f40482a;

    /* renamed from: b */
    private boolean f40483b;

    /* renamed from: c */
    private final Context f40484c;

    /* renamed from: d */
    private final bre f40485d;

    /* renamed from: e */
    private final brq<bre> f40486e;

    /* renamed from: f */
    private final akf f40487f;

    /* renamed from: g */
    private Uri f40488g;

    public ake(Context context, bre bre, brq<bre> brq, akf akf) {
        this.f40484c = context;
        this.f40485d = bre;
        this.f40486e = brq;
        this.f40487f = akf;
    }

    /* renamed from: b */
    public final void mo39592b() throws IOException {
        if (this.f40483b) {
            this.f40483b = false;
            this.f40488g = null;
            if (this.f40482a != null) {
                C15329l.m44589a(this.f40482a);
                this.f40482a = null;
                return;
            }
            this.f40485d.mo39592b();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x009c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.cancel(true);
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.cancel(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d3, code lost:
        r4 = com.google.android.gms.ads.internal.C14793ay.m42901g().mo38685b() - r9;
        r1.f40487f.mo39600a(false, r4);
        r2 = new java.lang.StringBuilder(44);
        r2.append("Cache connection took ");
        r2.append(r4);
        r2.append("ms");
        com.google.android.gms.internal.ads.acd.m45438a(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fb, code lost:
        r2 = com.google.android.gms.ads.internal.C14793ay.m42901g().mo38685b() - r9;
        r1.f40487f.mo39600a(false, r2);
        r4 = new java.lang.StringBuilder(44);
        r4.append("Cache connection took ");
        r4.append(r2);
        r4.append("ms");
        com.google.android.gms.internal.ads.acd.m45438a(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0122, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:18:0x009e, B:21:0x00d0] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x009e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00d0 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x00d0=Splitter:B:21:0x00d0, B:18:0x009e=Splitter:B:18:0x009e} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo39589a(com.google.android.gms.internal.ads.brg r19) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            boolean r2 = r1.f40483b
            if (r2 != 0) goto L_0x0167
            r2 = 1
            r1.f40483b = r2
            android.net.Uri r3 = r0.f43314a
            r1.f40488g = r3
            com.google.android.gms.internal.ads.brq<com.google.android.gms.internal.ads.bre> r3 = r1.f40486e
            if (r3 == 0) goto L_0x0018
            com.google.android.gms.internal.ads.brq<com.google.android.gms.internal.ads.bre> r3 = r1.f40486e
            r3.mo39621a(r1, r0)
        L_0x0018:
            android.net.Uri r3 = r0.f43314a
            com.google.android.gms.internal.ads.zzwr r3 = com.google.android.gms.internal.ads.zzwr.m53213a(r3)
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r4 = com.google.android.gms.internal.ads.C15585bw.f43899cn
            com.google.android.gms.internal.ads.bt r5 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r4 = r5.mo41272a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = -1
            if (r4 == 0) goto L_0x0123
            if (r3 == 0) goto L_0x0141
            long r7 = r0.f43317d
            r3.f45769c = r7
            boolean r4 = r3.f45768b
            if (r4 == 0) goto L_0x0049
            com.google.android.gms.internal.ads.bl<java.lang.Long> r4 = com.google.android.gms.internal.ads.C15585bw.f43901cp
            com.google.android.gms.internal.ads.bt r7 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r4 = r7.mo41272a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            goto L_0x0055
        L_0x0049:
            com.google.android.gms.internal.ads.bl<java.lang.Long> r4 = com.google.android.gms.internal.ads.C15585bw.f43900co
            com.google.android.gms.internal.ads.bt r7 = com.google.android.gms.internal.ads.bym.m50299d()
            java.lang.Object r4 = r7.mo41272a(r4)
            java.lang.Long r4 = (java.lang.Long) r4
        L_0x0055:
            long r7 = r4.longValue()
            com.google.android.gms.common.util.e r4 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r9 = r4.mo38685b()
            android.content.Context r4 = r1.f40484c
            java.util.concurrent.Future r4 = com.google.android.gms.internal.ads.bwk.m50205a(r4, r3)
            r11 = 0
            r12 = 44
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x00d0, InterruptedException -> 0x009e }
            java.lang.Object r7 = r4.get(r7, r13)     // Catch:{ ExecutionException | TimeoutException -> 0x00d0, InterruptedException -> 0x009e }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d0, InterruptedException -> 0x009e }
            r1.f40482a = r7     // Catch:{ ExecutionException | TimeoutException -> 0x00d0, InterruptedException -> 0x009e }
            com.google.android.gms.common.util.e r0 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r3 = r0.mo38685b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.akf r0 = r1.f40487f
            r0.mo39600a(r2, r3)
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
        L_0x009c:
            r0 = move-exception
            goto L_0x00fb
        L_0x009e:
            r4.cancel(r2)     // Catch:{ all -> 0x009c }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x009c }
            r2.interrupt()     // Catch:{ all -> 0x009c }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r4 = r2.mo38685b()
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.akf r2 = r1.f40487f
            r2.mo39600a(r11, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.acd.m45438a(r2)
            goto L_0x0141
        L_0x00d0:
            r4.cancel(r2)     // Catch:{ all -> 0x009c }
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r4 = r2.mo38685b()
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.akf r2 = r1.f40487f
            r2.mo39600a(r11, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r12)
            java.lang.String r6 = "Cache connection took "
            r2.append(r6)
            r2.append(r4)
            java.lang.String r4 = "ms"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.google.android.gms.internal.ads.acd.m45438a(r2)
            goto L_0x0141
        L_0x00fb:
            com.google.android.gms.common.util.e r2 = com.google.android.gms.ads.internal.C14793ay.m42901g()
            long r2 = r2.mo38685b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.akf r4 = r1.f40487f
            r4.mo39600a(r11, r2)
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
        L_0x0123:
            r2 = 0
            if (r3 == 0) goto L_0x0132
            long r7 = r0.f43317d
            r3.f45769c = r7
            com.google.android.gms.internal.ads.bvq r2 = com.google.android.gms.ads.internal.C14793ay.m42900f()
            com.google.android.gms.internal.ads.zzwo r2 = r2.mo41395a(r3)
        L_0x0132:
            if (r2 == 0) goto L_0x0141
            boolean r4 = r2.mo42392a()
            if (r4 == 0) goto L_0x0141
            java.io.InputStream r0 = r2.mo42393b()
            r1.f40482a = r0
            return r5
        L_0x0141:
            if (r3 == 0) goto L_0x0160
            com.google.android.gms.internal.ads.brg r2 = new com.google.android.gms.internal.ads.brg
            java.lang.String r3 = r3.f45767a
            android.net.Uri r8 = android.net.Uri.parse(r3)
            byte[] r9 = r0.f43315b
            long r10 = r0.f43316c
            long r12 = r0.f43317d
            long r14 = r0.f43318e
            java.lang.String r3 = r0.f43319f
            int r0 = r0.f43320g
            r7 = r2
            r16 = r3
            r17 = r0
            r7.<init>(r8, r9, r10, r12, r14, r16, r17)
            r0 = r2
        L_0x0160:
            com.google.android.gms.internal.ads.bre r2 = r1.f40485d
            long r2 = r2.mo39589a(r0)
            return r2
        L_0x0167:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ake.mo39589a(com.google.android.gms.internal.ads.brg):long");
    }

    /* renamed from: a */
    public final int mo39588a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f40483b) {
            if (this.f40482a != null) {
                i3 = this.f40482a.read(bArr, i, i2);
            } else {
                i3 = this.f40485d.mo39588a(bArr, i, i2);
            }
            if (this.f40486e != null) {
                this.f40486e.mo39620a(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* renamed from: a */
    public final Uri mo39590a() {
        return this.f40488g;
    }
}
