package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.ahs.C15480a;
import com.google.android.gms.internal.ads.zzbo.zza;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.util.concurrent.ExecutionException;

public final class bey extends bfw {

    /* renamed from: d */
    private static final bfx<bae> f41824d = new bfx<>();

    /* renamed from: e */
    private final Context f41825e;

    /* renamed from: f */
    private C15480a f41826f;

    public bey(beh beh, String str, String str2, C16247a aVar, int i, int i2, Context context, C15480a aVar2) {
        super(beh, str, str2, aVar, i, 27);
        this.f41825e = context;
        this.f41826f = aVar2;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40578a() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.bfx<com.google.android.gms.internal.ads.bae> r0 = f41824d
            android.content.Context r1 = r8.f41825e
            java.lang.String r1 = r1.getPackageName()
            java.util.concurrent.atomic.AtomicReference r0 = r0.mo40586a(r1)
            monitor-enter(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.bae r1 = (com.google.android.gms.internal.ads.bae) r1     // Catch:{ all -> 0x011b }
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.f41307a     // Catch:{ all -> 0x011b }
            boolean r4 = com.google.android.gms.internal.ads.beq.m48556b(r4)     // Catch:{ all -> 0x011b }
            if (r4 != 0) goto L_0x0036
            java.lang.String r4 = r1.f41307a     // Catch:{ all -> 0x011b }
            java.lang.String r5 = "E"
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x011b }
            if (r4 != 0) goto L_0x0036
            java.lang.String r1 = r1.f41307a     // Catch:{ all -> 0x011b }
            java.lang.String r4 = "0000000000000000000000000000000000000000000000000000000000000000"
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r1 = 0
            goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            if (r1 == 0) goto L_0x00e5
            com.google.android.gms.internal.ads.ahs$a r1 = r8.f41826f     // Catch:{ all -> 0x011b }
            java.lang.String r1 = m48570a(r1)     // Catch:{ all -> 0x011b }
            boolean r1 = com.google.android.gms.internal.ads.beq.m48556b(r1)     // Catch:{ all -> 0x011b }
            if (r1 != 0) goto L_0x0048
            com.google.android.gms.internal.ads.zzbl r1 = com.google.android.gms.internal.ads.zzbl.ENUM_SIGNAL_SOURCE_CALLER_PROVIDED     // Catch:{ all -> 0x011b }
            goto L_0x0080
        L_0x0048:
            com.google.android.gms.internal.ads.ahs$a r1 = r8.f41826f     // Catch:{ all -> 0x011b }
            java.lang.String r4 = m48570a(r1)     // Catch:{ all -> 0x011b }
            boolean r4 = com.google.android.gms.internal.ads.beq.m48556b(r4)     // Catch:{ all -> 0x011b }
            if (r4 == 0) goto L_0x006a
            if (r1 == 0) goto L_0x006a
            boolean r4 = r1.mo39397a()     // Catch:{ all -> 0x011b }
            if (r4 == 0) goto L_0x006a
            com.google.android.gms.internal.ads.ahs$b r1 = r1.mo39398b()     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzbl r1 = r1.mo39401a()     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzbl r4 = com.google.android.gms.internal.ads.zzbl.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x011b }
            if (r1 != r4) goto L_0x006a
            r1 = 1
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x011b }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x007e
            com.google.android.gms.internal.ads.beh r1 = r8.f41858a     // Catch:{ all -> 0x011b }
            boolean r1 = r1.f41769j     // Catch:{ all -> 0x011b }
            if (r1 == 0) goto L_0x007e
            com.google.android.gms.internal.ads.zzbl r1 = com.google.android.gms.internal.ads.zzbl.ENUM_SIGNAL_SOURCE_GASS     // Catch:{ all -> 0x011b }
            goto L_0x0080
        L_0x007e:
            com.google.android.gms.internal.ads.zzbl r1 = com.google.android.gms.internal.ads.zzbl.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x011b }
        L_0x0080:
            java.lang.reflect.Method r4 = r8.f41860c     // Catch:{ all -> 0x011b }
            r5 = 0
            r6 = 3
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x011b }
            android.content.Context r7 = r8.f41825e     // Catch:{ all -> 0x011b }
            r6[r2] = r7     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzbl r7 = com.google.android.gms.internal.ads.zzbl.ENUM_SIGNAL_SOURCE_ADSHIELD     // Catch:{ all -> 0x011b }
            if (r1 != r7) goto L_0x008f
            r2 = 1
        L_0x008f:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x011b }
            r6[r3] = r2     // Catch:{ all -> 0x011b }
            r2 = 2
            com.google.android.gms.internal.ads.bl<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C15585bw.f43857by     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.bt r7 = com.google.android.gms.internal.ads.bym.m50299d()     // Catch:{ all -> 0x011b }
            java.lang.Object r3 = r7.mo41272a(r3)     // Catch:{ all -> 0x011b }
            r6[r2] = r3     // Catch:{ all -> 0x011b }
            java.lang.Object r2 = r4.invoke(r5, r6)     // Catch:{ all -> 0x011b }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.bae r3 = new com.google.android.gms.internal.ads.bae     // Catch:{ all -> 0x011b }
            r3.<init>(r2)     // Catch:{ all -> 0x011b }
            java.lang.String r2 = r3.f41307a     // Catch:{ all -> 0x011b }
            boolean r2 = com.google.android.gms.internal.ads.beq.m48556b(r2)     // Catch:{ all -> 0x011b }
            if (r2 != 0) goto L_0x00bf
            java.lang.String r2 = r3.f41307a     // Catch:{ all -> 0x011b }
            java.lang.String r4 = "E"
            boolean r2 = r2.equals(r4)     // Catch:{ all -> 0x011b }
            if (r2 == 0) goto L_0x00e2
        L_0x00bf:
            int[] r2 = com.google.android.gms.internal.ads.bez.f41827a     // Catch:{ all -> 0x011b }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x011b }
            r1 = r2[r1]     // Catch:{ all -> 0x011b }
            switch(r1) {
                case 1: goto L_0x00d8;
                case 2: goto L_0x00cb;
                default: goto L_0x00ca;
            }     // Catch:{ all -> 0x011b }
        L_0x00ca:
            goto L_0x00e2
        L_0x00cb:
            java.lang.String r1 = r8.m48571c()     // Catch:{ all -> 0x011b }
            boolean r2 = com.google.android.gms.internal.ads.beq.m48556b(r1)     // Catch:{ all -> 0x011b }
            if (r2 != 0) goto L_0x00e2
            r3.f41307a = r1     // Catch:{ all -> 0x011b }
            goto L_0x00e2
        L_0x00d8:
            com.google.android.gms.internal.ads.ahs$a r1 = r8.f41826f     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.ahs$c r1 = r1.mo39400d()     // Catch:{ all -> 0x011b }
            java.lang.String r1 = r1.zzei     // Catch:{ all -> 0x011b }
            r3.f41307a = r1     // Catch:{ all -> 0x011b }
        L_0x00e2:
            r0.set(r3)     // Catch:{ all -> 0x011b }
        L_0x00e5:
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.bae r1 = (com.google.android.gms.internal.ads.bae) r1     // Catch:{ all -> 0x011b }
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            com.google.android.gms.internal.ads.zzbo$zza$a r2 = r8.f41859b
            monitor-enter(r2)
            if (r1 == 0) goto L_0x0117
            com.google.android.gms.internal.ads.zzbo$zza$a r0 = r8.f41859b     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r1.f41307a     // Catch:{ all -> 0x0115 }
            r0.mo42220c(r3)     // Catch:{ all -> 0x0115 }
            com.google.android.gms.internal.ads.zzbo$zza$a r0 = r8.f41859b     // Catch:{ all -> 0x0115 }
            long r3 = r1.f41308b     // Catch:{ all -> 0x0115 }
            r0.mo42240p(r3)     // Catch:{ all -> 0x0115 }
            com.google.android.gms.internal.ads.zzbo$zza$a r0 = r8.f41859b     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r1.f41309c     // Catch:{ all -> 0x0115 }
            r0.mo42225e(r3)     // Catch:{ all -> 0x0115 }
            com.google.android.gms.internal.ads.zzbo$zza$a r0 = r8.f41859b     // Catch:{ all -> 0x0115 }
            java.lang.String r3 = r1.f41310d     // Catch:{ all -> 0x0115 }
            r0.mo42227f(r3)     // Catch:{ all -> 0x0115 }
            com.google.android.gms.internal.ads.zzbo$zza$a r0 = r8.f41859b     // Catch:{ all -> 0x0115 }
            java.lang.String r1 = r1.f41311e     // Catch:{ all -> 0x0115 }
            r0.mo42229g(r1)     // Catch:{ all -> 0x0115 }
            goto L_0x0117
        L_0x0115:
            r0 = move-exception
            goto L_0x0119
        L_0x0117:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            return
        L_0x0119:
            monitor-exit(r2)     // Catch:{ all -> 0x0115 }
            throw r0
        L_0x011b:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x011b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.bey.mo40578a():void");
    }

    /* renamed from: a */
    private static String m48570a(C15480a aVar) {
        if (aVar == null || !aVar.mo39399c() || beq.m48556b(aVar.mo39400d().zzei)) {
            return null;
        }
        return aVar.mo39400d().zzei;
    }

    /* renamed from: c */
    private final String m48571c() {
        try {
            if (this.f41858a.f41766g != null) {
                this.f41858a.f41766g.get();
            }
            zza zza = this.f41858a.f41765f;
            if (zza != null && zza.mo42195a()) {
                return zza.zzei;
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        return null;
    }
}
