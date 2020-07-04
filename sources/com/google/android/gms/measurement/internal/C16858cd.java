package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.C15137e;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.util.C15322e;
import com.google.android.gms.measurement.AppMeasurement.ConditionalUserProperty;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.cd */
public final class C16858cd extends C16896do {

    /* renamed from: a */
    protected C16867cm f47118a;

    /* renamed from: b */
    protected boolean f47119b = true;

    /* renamed from: c */
    private C16855ca f47120c;

    /* renamed from: d */
    private final Set<Object> f47121d = new CopyOnWriteArraySet();

    /* renamed from: e */
    private boolean f47122e;

    /* renamed from: f */
    private final AtomicReference<String> f47123f = new AtomicReference<>();

    protected C16858cd(C16825ay ayVar) {
        super(ayVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo43740t() {
        return false;
    }

    /* renamed from: a */
    public final void mo43736a(boolean z) {
        mo43821B();
        mo43584p().mo43645a((Runnable) new C16866cl(this, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public final void m55594E() {
        if (!mo43587s().mo44064j(mo43574f().mo44135v()) || !this.f47095q.mo43672t() || !this.f47119b) {
            mo43585q().f47494h.mo44160a("Updating Scion state (FE)");
            mo43575g().mo43783w();
            return;
        }
        mo43585q().f47494h.mo44160a("Recording app launch after enabling measurement for the first time (FE)");
        mo43742w();
    }

    /* renamed from: a */
    public final void mo43732a(String str, String str2, Bundle bundle, boolean z) {
        m55600a(str, str2, bundle, false, true, mo43580l().mo38684a());
    }

    /* renamed from: a */
    public final void mo43731a(String str, String str2, Bundle bundle) {
        m55600a(str, str2, bundle, true, true, mo43580l().mo38684a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo43738b(String str, String str2, Bundle bundle) {
        mo43571c();
        mo43730a(str, str2, mo43580l().mo38684a(), bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43730a(String str, String str2, long j, Bundle bundle) {
        mo43571c();
        m55598a(str, str2, j, bundle, true, this.f47120c == null || C16922em.m55974e(str2), false, null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m55598a(java.lang.String r28, java.lang.String r29, long r30, android.os.Bundle r32, boolean r33, boolean r34, boolean r35, java.lang.String r36) {
        /*
            r27 = this;
            r1 = r27
            r8 = r28
            r6 = r29
            r2 = r32
            r7 = r36
            com.google.android.gms.common.internal.C15267r.m44386a(r28)
            com.google.android.gms.measurement.internal.eu r0 = r27.mo43587s()
            com.google.android.gms.measurement.internal.h$a<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C16942h.f47428au
            boolean r0 = r0.mo44054d(r7, r5)
            if (r0 != 0) goto L_0x001c
            com.google.android.gms.common.internal.C15267r.m44386a(r29)
        L_0x001c:
            com.google.android.gms.common.internal.C15267r.m44384a(r32)
            r27.mo43571c()
            r27.mo43821B()
            com.google.android.gms.measurement.internal.ay r0 = r1.f47095q
            boolean r0 = r0.mo43672t()
            if (r0 != 0) goto L_0x0039
            com.google.android.gms.measurement.internal.r r0 = r27.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47494h
            java.lang.String r2 = "Event not sent since app measurement is disabled"
            r0.mo44160a(r2)
            return
        L_0x0039:
            boolean r0 = r1.f47122e
            r5 = 0
            r16 = 0
            r15 = 1
            if (r0 != 0) goto L_0x0079
            r1.f47122e = r15
            java.lang.String r0 = "com.google.android.gms.tagmanager.TagManagerService"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.String r9 = "initialize"
            java.lang.Class[] r10 = new java.lang.Class[r15]     // Catch:{ Exception -> 0x0061 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r16] = r11     // Catch:{ Exception -> 0x0061 }
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch:{ Exception -> 0x0061 }
            java.lang.Object[] r9 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x0061 }
            android.content.Context r10 = r27.mo43581m()     // Catch:{ Exception -> 0x0061 }
            r9[r16] = r10     // Catch:{ Exception -> 0x0061 }
            r0.invoke(r5, r9)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0079
        L_0x0061:
            r0 = move-exception
            com.google.android.gms.measurement.internal.r r9 = r27.mo43585q()     // Catch:{ ClassNotFoundException -> 0x006e }
            com.google.android.gms.measurement.internal.t r9 = r9.f47490d     // Catch:{ ClassNotFoundException -> 0x006e }
            java.lang.String r10 = "Failed to invoke Tag Manager's initialize() method"
            r9.mo44161a(r10, r0)     // Catch:{ ClassNotFoundException -> 0x006e }
            goto L_0x0079
        L_0x006e:
            com.google.android.gms.measurement.internal.r r0 = r27.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47493g
            java.lang.String r9 = "Tag Manager is not found and thus will not be used"
            r0.mo44160a(r9)
        L_0x0079:
            r0 = 40
            r9 = 2
            if (r35 == 0) goto L_0x00e1
            java.lang.String r10 = "_iap"
            boolean r10 = r10.equals(r6)
            if (r10 != 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.ay r10 = r1.f47095q
            com.google.android.gms.measurement.internal.em r10 = r10.mo43662f()
            java.lang.String r11 = "event"
            boolean r11 = r10.mo43905a(r11, r6)
            if (r11 != 0) goto L_0x0096
        L_0x0094:
            r10 = 2
            goto L_0x00ad
        L_0x0096:
            java.lang.String r11 = "event"
            java.lang.String[] r12 = com.google.android.gms.measurement.internal.C16851bx.f47097a
            boolean r11 = r10.mo43906a(r11, r12, r6)
            if (r11 != 0) goto L_0x00a3
            r10 = 13
            goto L_0x00ad
        L_0x00a3:
            java.lang.String r11 = "event"
            boolean r10 = r10.mo43904a(r11, r0, r6)
            if (r10 != 0) goto L_0x00ac
            goto L_0x0094
        L_0x00ac:
            r10 = 0
        L_0x00ad:
            if (r10 == 0) goto L_0x00e1
            com.google.android.gms.measurement.internal.r r2 = r27.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47489c
            java.lang.String r3 = "Invalid public event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r4 = r27.mo43582n()
            java.lang.String r4 = r4.mo44153a(r6)
            r2.mo44161a(r3, r4)
            com.google.android.gms.measurement.internal.ay r2 = r1.f47095q
            r2.mo43662f()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C16922em.m55958a(r6, r0, r15)
            if (r6 == 0) goto L_0x00d4
            int r16 = r29.length()
            r2 = r16
            goto L_0x00d5
        L_0x00d4:
            r2 = 0
        L_0x00d5:
            com.google.android.gms.measurement.internal.ay r3 = r1.f47095q
            com.google.android.gms.measurement.internal.em r3 = r3.mo43662f()
            java.lang.String r4 = "_ev"
            r3.mo43900a(r10, r4, r0, r2)
            return
        L_0x00e1:
            com.google.android.gms.measurement.internal.cq r10 = r27.mo43576h()
            com.google.android.gms.measurement.internal.cp r14 = r10.mo43769v()
            if (r14 == 0) goto L_0x00f5
            java.lang.String r10 = "_sc"
            boolean r10 = r2.containsKey(r10)
            if (r10 != 0) goto L_0x00f5
            r14.f47161d = r15
        L_0x00f5:
            if (r33 == 0) goto L_0x00fb
            if (r35 == 0) goto L_0x00fb
            r10 = 1
            goto L_0x00fc
        L_0x00fb:
            r10 = 0
        L_0x00fc:
            com.google.android.gms.measurement.internal.C16871cq.m55658a(r14, r2, r10)
            java.lang.String r10 = "am"
            boolean r17 = r10.equals(r8)
            boolean r10 = com.google.android.gms.measurement.internal.C16922em.m55974e(r29)
            if (r33 == 0) goto L_0x012f
            com.google.android.gms.measurement.internal.ca r3 = r1.f47120c
            if (r3 == 0) goto L_0x012f
            if (r10 != 0) goto L_0x012f
            if (r17 != 0) goto L_0x012f
            com.google.android.gms.measurement.internal.r r0 = r27.mo43585q()
            com.google.android.gms.measurement.internal.t r0 = r0.f47494h
            java.lang.String r3 = "Passing event to registered event handler (FE)"
            com.google.android.gms.measurement.internal.p r4 = r27.mo43582n()
            java.lang.String r4 = r4.mo44153a(r6)
            com.google.android.gms.measurement.internal.p r5 = r27.mo43582n()
            java.lang.String r2 = r5.mo44150a(r2)
            r0.mo44162a(r3, r4, r2)
            return
        L_0x012f:
            com.google.android.gms.measurement.internal.ay r3 = r1.f47095q
            boolean r3 = r3.mo43676x()
            if (r3 != 0) goto L_0x0138
            return
        L_0x0138:
            com.google.android.gms.measurement.internal.em r3 = r27.mo43583o()
            int r3 = r3.mo43907b(r6)
            if (r3 == 0) goto L_0x017c
            com.google.android.gms.measurement.internal.r r2 = r27.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47489c
            java.lang.String r4 = "Invalid event name. Event will not be logged (FE)"
            com.google.android.gms.measurement.internal.p r5 = r27.mo43582n()
            java.lang.String r5 = r5.mo44153a(r6)
            r2.mo44161a(r4, r5)
            r27.mo43583o()
            java.lang.String r0 = com.google.android.gms.measurement.internal.C16922em.m55958a(r6, r0, r15)
            if (r6 == 0) goto L_0x0164
            int r2 = r29.length()
            r16 = r2
        L_0x0164:
            com.google.android.gms.measurement.internal.ay r2 = r1.f47095q
            com.google.android.gms.measurement.internal.em r2 = r2.mo43662f()
            java.lang.String r4 = "_ev"
            r28 = r2
            r29 = r36
            r30 = r3
            r31 = r4
            r32 = r0
            r33 = r16
            r28.mo43903a(r29, r30, r31, r32, r33)
            return
        L_0x017c:
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r3 = "_o"
            r0[r16] = r3
            java.lang.String r3 = "_sn"
            r0[r15] = r3
            java.lang.String r3 = "_sc"
            r0[r9] = r3
            r3 = 3
            java.lang.String r9 = "_si"
            r0[r3] = r9
            java.util.List r0 = com.google.android.gms.common.util.C15323f.m44566a((T[]) r0)
            com.google.android.gms.measurement.internal.em r9 = r27.mo43583o()
            r3 = 1
            r10 = r36
            r11 = r29
            r12 = r32
            r13 = r0
            r18 = r14
            r14 = r35
            r5 = 1
            r15 = r3
            android.os.Bundle r3 = r9.mo43898a(r10, r11, r12, r13, r14, r15)
            if (r3 == 0) goto L_0x01de
            java.lang.String r9 = "_sc"
            boolean r9 = r3.containsKey(r9)
            if (r9 == 0) goto L_0x01de
            java.lang.String r9 = "_si"
            boolean r9 = r3.containsKey(r9)
            if (r9 != 0) goto L_0x01bd
            goto L_0x01de
        L_0x01bd:
            java.lang.String r9 = "_sn"
            java.lang.String r9 = r3.getString(r9)
            java.lang.String r10 = "_sc"
            java.lang.String r10 = r3.getString(r10)
            java.lang.String r11 = "_si"
            long r11 = r3.getLong(r11)
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            com.google.android.gms.measurement.internal.cp r12 = new com.google.android.gms.measurement.internal.cp
            long r13 = r11.longValue()
            r12.<init>(r9, r10, r13)
            r14 = r12
            goto L_0x01df
        L_0x01de:
            r14 = 0
        L_0x01df:
            if (r14 != 0) goto L_0x01e4
            r15 = r18
            goto L_0x01e5
        L_0x01e4:
            r15 = r14
        L_0x01e5:
            com.google.android.gms.measurement.internal.eu r9 = r27.mo43587s()
            boolean r9 = r9.mo44074t(r7)
            r10 = 0
            if (r9 == 0) goto L_0x0216
            com.google.android.gms.measurement.internal.cq r9 = r27.mo43576h()
            com.google.android.gms.measurement.internal.cp r9 = r9.mo43769v()
            if (r9 == 0) goto L_0x0216
            java.lang.String r9 = "_ae"
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x0216
            com.google.android.gms.measurement.internal.ds r9 = r27.mo43578j()
            long r12 = r9.mo43831w()
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0216
            com.google.android.gms.measurement.internal.em r9 = r27.mo43583o()
            r9.mo43901a(r3, r12)
        L_0x0216:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r14.add(r3)
            com.google.android.gms.measurement.internal.em r9 = r27.mo43583o()
            java.security.SecureRandom r9 = r9.mo43914g()
            long r12 = r9.nextLong()
            com.google.android.gms.measurement.internal.eu r9 = r27.mo43587s()
            com.google.android.gms.measurement.internal.l r18 = r27.mo43574f()
            java.lang.String r5 = r18.mo44135v()
            boolean r5 = r9.mo44073s(r5)
            if (r5 == 0) goto L_0x0260
            java.lang.String r5 = "extend_session"
            long r9 = r3.getLong(r5, r10)
            r18 = 1
            int r5 = (r9 > r18 ? 1 : (r9 == r18 ? 0 : -1))
            if (r5 != 0) goto L_0x0260
            com.google.android.gms.measurement.internal.r r5 = r27.mo43585q()
            com.google.android.gms.measurement.internal.t r5 = r5.f47495i
            java.lang.String r9 = "EXTEND_SESSION param attached: initiate a new session or extend the current active session"
            r5.mo44160a(r9)
            com.google.android.gms.measurement.internal.ay r5 = r1.f47095q
            com.google.android.gms.measurement.internal.ds r5 = r5.mo43660d()
            r10 = r30
            r9 = 1
            r5.mo43828a(r10, r9)
            goto L_0x0262
        L_0x0260:
            r10 = r30
        L_0x0262:
            java.util.Set r5 = r3.keySet()
            int r2 = r32.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r5.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            java.util.Arrays.sort(r2)
            int r5 = r2.length
            r4 = 0
            r9 = 0
        L_0x0278:
            if (r9 >= r5) goto L_0x0313
            r21 = r5
            r5 = r2[r9]
            java.lang.Object r18 = r3.get(r5)
            r27.mo43583o()
            r22 = r2
            android.os.Bundle[] r2 = com.google.android.gms.measurement.internal.C16922em.m55967a(r18)
            if (r2 == 0) goto L_0x02f7
            int r7 = r2.length
            r3.putInt(r5, r7)
            r23 = r9
            r7 = 0
        L_0x0294:
            int r9 = r2.length
            if (r7 >= r9) goto L_0x02ed
            r9 = r2[r7]
            r1 = 1
            com.google.android.gms.measurement.internal.C16871cq.m55658a(r15, r9, r1)
            com.google.android.gms.measurement.internal.em r18 = r27.mo43583o()
            java.lang.String r19 = "_ep"
            r20 = 0
            r24 = r9
            r9 = r18
            r10 = r36
            r11 = r19
            r25 = r2
            r1 = r12
            r12 = r24
            r13 = r0
            r26 = r0
            r0 = r14
            r14 = r35
            r18 = r15
            r15 = r20
            android.os.Bundle r9 = r9.mo43898a(r10, r11, r12, r13, r14, r15)
            java.lang.String r10 = "_en"
            r9.putString(r10, r6)
            java.lang.String r10 = "_eid"
            r9.putLong(r10, r1)
            java.lang.String r10 = "_gn"
            r9.putString(r10, r5)
            java.lang.String r10 = "_ll"
            r11 = r25
            int r12 = r11.length
            r9.putInt(r10, r12)
            java.lang.String r10 = "_i"
            r9.putInt(r10, r7)
            r0.add(r9)
            int r7 = r7 + 1
            r14 = r0
            r12 = r1
            r2 = r11
            r15 = r18
            r0 = r26
            r1 = r27
            r10 = r30
            goto L_0x0294
        L_0x02ed:
            r26 = r0
            r11 = r2
            r1 = r12
            r0 = r14
            r18 = r15
            int r5 = r11.length
            int r4 = r4 + r5
            goto L_0x02ff
        L_0x02f7:
            r26 = r0
            r23 = r9
            r1 = r12
            r0 = r14
            r18 = r15
        L_0x02ff:
            int r9 = r23 + 1
            r10 = r30
            r14 = r0
            r12 = r1
            r15 = r18
            r5 = r21
            r2 = r22
            r0 = r26
            r1 = r27
            r7 = r36
            goto L_0x0278
        L_0x0313:
            r1 = r12
            r0 = r14
            if (r4 == 0) goto L_0x0321
            java.lang.String r5 = "_eid"
            r3.putLong(r5, r1)
            java.lang.String r1 = "_epc"
            r3.putInt(r1, r4)
        L_0x0321:
            r1 = 0
        L_0x0322:
            int r2 = r0.size()
            if (r1 >= r2) goto L_0x039d
            java.lang.Object r2 = r0.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            if (r1 == 0) goto L_0x0332
            r3 = 1
            goto L_0x0333
        L_0x0332:
            r3 = 0
        L_0x0333:
            if (r3 == 0) goto L_0x0338
            java.lang.String r3 = "_ep"
            goto L_0x0339
        L_0x0338:
            r3 = r6
        L_0x0339:
            java.lang.String r4 = "_o"
            r2.putString(r4, r8)
            if (r34 == 0) goto L_0x0348
            com.google.android.gms.measurement.internal.em r4 = r27.mo43583o()
            android.os.Bundle r2 = r4.mo43897a(r2)
        L_0x0348:
            r10 = r2
            com.google.android.gms.measurement.internal.r r2 = r27.mo43585q()
            com.google.android.gms.measurement.internal.t r2 = r2.f47494h
            java.lang.String r4 = "Logging event (FE)"
            com.google.android.gms.measurement.internal.p r5 = r27.mo43582n()
            java.lang.String r5 = r5.mo44153a(r6)
            com.google.android.gms.measurement.internal.p r7 = r27.mo43582n()
            java.lang.String r7 = r7.mo44150a(r10)
            r2.mo44162a(r4, r5, r7)
            com.google.android.gms.measurement.internal.zzag r11 = new com.google.android.gms.measurement.internal.zzag
            com.google.android.gms.measurement.internal.zzad r4 = new com.google.android.gms.measurement.internal.zzad
            r4.<init>(r10)
            r2 = r11
            r12 = 1
            r5 = r28
            r13 = r6
            r14 = r36
            r6 = r30
            r2.<init>(r3, r4, r5, r6)
            com.google.android.gms.measurement.internal.cu r2 = r27.mo43575g()
            r2.mo43776a(r11, r14)
            if (r17 != 0) goto L_0x0397
            r2 = r27
            java.util.Set<java.lang.Object> r3 = r2.f47121d
            java.util.Iterator r3 = r3.iterator()
        L_0x0388:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0399
            r3.next()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r10)
            goto L_0x0388
        L_0x0397:
            r2 = r27
        L_0x0399:
            int r1 = r1 + 1
            r6 = r13
            goto L_0x0322
        L_0x039d:
            r13 = r6
            r2 = r27
            r12 = 1
            com.google.android.gms.measurement.internal.cq r0 = r27.mo43576h()
            com.google.android.gms.measurement.internal.cp r0 = r0.mo43769v()
            if (r0 == 0) goto L_0x03ba
            java.lang.String r0 = "_ae"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x03ba
            com.google.android.gms.measurement.internal.ds r0 = r27.mo43578j()
            r0.mo43829a(r12, r12)
        L_0x03ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C16858cd.m55598a(java.lang.String, java.lang.String, long, android.os.Bundle, boolean, boolean, boolean, java.lang.String):void");
    }

    /* renamed from: a */
    private void m55600a(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        C16858cd cdVar;
        Bundle bundle2;
        String str3 = str == null ? "app" : str;
        if (bundle == null) {
            cdVar = this;
            bundle2 = new Bundle();
        } else {
            cdVar = this;
            bundle2 = bundle;
        }
        m55605b(str3, str2, j, bundle2, true, cdVar.f47120c == null || C16922em.m55974e(str2), !z, null);
    }

    /* renamed from: b */
    private final void m55605b(String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        Bundle b = C16922em.m55968b(bundle);
        C16820at p = mo43584p();
        C16860cf cfVar = new C16860cf(this, str, str2, j, b, z, z2, z3, null);
        p.mo43645a((Runnable) cfVar);
    }

    /* renamed from: a */
    public final void mo43734a(String str, String str2, Object obj, boolean z) {
        m55601a(str, str2, obj, true, mo43580l().mo38684a());
    }

    /* renamed from: a */
    private void m55601a(String str, String str2, Object obj, boolean z, long j) {
        if (str == null) {
            str = "app";
        }
        String str3 = str;
        int i = 6;
        int i2 = 0;
        if (z) {
            i = mo43583o().mo43910c(str2);
        } else {
            C16922em o = mo43583o();
            if (o.mo43905a("user property", str2)) {
                if (!o.mo43906a("user property", C16853bz.f47101a, str2)) {
                    i = 15;
                } else if (o.mo43904a("user property", 24, str2)) {
                    i = 0;
                }
            }
        }
        if (i != 0) {
            mo43583o();
            String a = C16922em.m55958a(str2, 24, true);
            if (str2 != null) {
                i2 = str2.length();
            }
            this.f47095q.mo43662f().mo43900a(i, "_ev", a, i2);
        } else if (obj != null) {
            int b = mo43583o().mo43908b(str2, obj);
            if (b != 0) {
                mo43583o();
                String a2 = C16922em.m55958a(str2, 24, true);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    i2 = String.valueOf(obj).length();
                }
                this.f47095q.mo43662f().mo43900a(b, "_ev", a2, i2);
                return;
            }
            mo43583o();
            Object c = C16922em.m55970c(str2, obj);
            if (c != null) {
                m55599a(str3, str2, j, c);
            }
        } else {
            m55599a(str3, str2, j, (Object) null);
        }
    }

    /* renamed from: a */
    private final void m55599a(String str, String str2, long j, Object obj) {
        C16820at p = mo43584p();
        C16861cg cgVar = new C16861cg(this, str, str2, obj, j);
        p.mo43645a((Runnable) cgVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43733a(String str, String str2, Object obj, long j) {
        C15267r.m44386a(str);
        C15267r.m44386a(str2);
        mo43571c();
        mo43821B();
        if (!this.f47095q.mo43672t()) {
            mo43585q().f47494h.mo44160a("User property not set since app measurement is disabled");
        } else if (this.f47095q.mo43676x()) {
            mo43585q().f47494h.mo44162a("Setting user property (FE)", mo43582n().mo44153a(str2), obj);
            zzfv zzfv = new zzfv(str2, j, obj, str);
            mo43575g().mo43777a(zzfv);
        }
    }

    /* renamed from: v */
    public final String mo43741v() {
        return (String) this.f47123f.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo43729a(String str) {
        this.f47123f.set(str);
    }

    /* renamed from: w */
    public final void mo43742w() {
        mo43571c();
        mo43821B();
        if (this.f47095q.mo43676x()) {
            mo43575g().mo43784x();
            this.f47119b = false;
            String t = mo43586r().mo43609t();
            if (!TextUtils.isEmpty(t)) {
                mo43579k().mo43718x();
                if (!t.equals(VERSION.RELEASE)) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_po", t);
                    mo43731a("auto", "_ou", bundle);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo43728a(ConditionalUserProperty conditionalUserProperty) {
        C15267r.m44384a(conditionalUserProperty);
        ConditionalUserProperty conditionalUserProperty2 = new ConditionalUserProperty(conditionalUserProperty);
        if (!TextUtils.isEmpty(conditionalUserProperty2.mAppId)) {
            mo43585q().f47490d.mo44160a("Package name should be null when calling setConditionalUserProperty");
        }
        conditionalUserProperty2.mAppId = null;
        m55607c(conditionalUserProperty2);
    }

    /* renamed from: b */
    public final void mo43737b(ConditionalUserProperty conditionalUserProperty) {
        C15267r.m44384a(conditionalUserProperty);
        C15267r.m44386a(conditionalUserProperty.mAppId);
        mo43566a();
        m55607c(new ConditionalUserProperty(conditionalUserProperty));
    }

    /* renamed from: c */
    private final void m55607c(ConditionalUserProperty conditionalUserProperty) {
        long a = mo43580l().mo38684a();
        C15267r.m44384a(conditionalUserProperty);
        C15267r.m44386a(conditionalUserProperty.mName);
        C15267r.m44386a(conditionalUserProperty.mOrigin);
        C15267r.m44384a(conditionalUserProperty.mValue);
        conditionalUserProperty.mCreationTimestamp = a;
        String str = conditionalUserProperty.mName;
        Object obj = conditionalUserProperty.mValue;
        if (mo43583o().mo43910c(str) != 0) {
            mo43585q().f47487a.mo44161a("Invalid conditional user property name", mo43582n().mo44155c(str));
        } else if (mo43583o().mo43908b(str, obj) != 0) {
            mo43585q().f47487a.mo44162a("Invalid conditional user property value", mo43582n().mo44155c(str), obj);
        } else {
            mo43583o();
            Object c = C16922em.m55970c(str, obj);
            if (c == null) {
                mo43585q().f47487a.mo44162a("Unable to normalize conditional user property value", mo43582n().mo44155c(str), obj);
                return;
            }
            conditionalUserProperty.mValue = c;
            long j = conditionalUserProperty.mTriggerTimeout;
            if (TextUtils.isEmpty(conditionalUserProperty.mTriggerEventName) || (j <= 15552000000L && j >= 1)) {
                long j2 = conditionalUserProperty.mTimeToLive;
                if (j2 > 15552000000L || j2 < 1) {
                    mo43585q().f47487a.mo44162a("Invalid conditional user property time to live", mo43582n().mo44155c(str), Long.valueOf(j2));
                } else {
                    mo43584p().mo43645a((Runnable) new C16862ch(this, conditionalUserProperty));
                }
            } else {
                mo43585q().f47487a.mo44162a("Invalid conditional user property timeout", mo43582n().mo44155c(str), Long.valueOf(j));
            }
        }
    }

    /* renamed from: c */
    public final void mo43739c(String str, String str2, Bundle bundle) {
        m55606b((String) null, str, str2, bundle);
    }

    /* renamed from: a */
    public final void mo43735a(String str, String str2, String str3, Bundle bundle) {
        C15267r.m44386a(str);
        mo43566a();
        m55606b(str, str2, str3, bundle);
    }

    /* renamed from: b */
    private final void m55606b(String str, String str2, String str3, Bundle bundle) {
        long a = mo43580l().mo38684a();
        C15267r.m44386a(str2);
        ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
        conditionalUserProperty.mAppId = str;
        conditionalUserProperty.mName = str2;
        conditionalUserProperty.mCreationTimestamp = a;
        if (str3 != null) {
            conditionalUserProperty.mExpiredEventName = str3;
            conditionalUserProperty.mExpiredEventParams = bundle;
        }
        mo43584p().mo43645a((Runnable) new C16863ci(this, conditionalUserProperty));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m55608d(ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo43571c();
        mo43821B();
        C15267r.m44384a(conditionalUserProperty);
        C15267r.m44386a(conditionalUserProperty2.mName);
        C15267r.m44386a(conditionalUserProperty2.mOrigin);
        C15267r.m44384a(conditionalUserProperty2.mValue);
        if (!this.f47095q.mo43672t()) {
            mo43585q().f47494h.mo44160a("Conditional property not sent since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, conditionalUserProperty2.mTriggeredTimestamp, conditionalUserProperty2.mValue, conditionalUserProperty2.mOrigin);
        try {
            zzag a = mo43583o().mo43899a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTriggeredEventName, conditionalUserProperty2.mTriggeredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a2 = mo43583o().mo43899a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mTimedOutEventName, conditionalUserProperty2.mTimedOutEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            zzag a3 = mo43583o().mo43899a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, 0, true, false);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            zzo zzo = r3;
            zzo zzo2 = new zzo(str, str2, zzfv, j, false, str3, a2, j2, a, conditionalUserProperty2.mTimeToLive, a3);
            mo43575g().mo43778a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m55609e(ConditionalUserProperty conditionalUserProperty) {
        ConditionalUserProperty conditionalUserProperty2 = conditionalUserProperty;
        mo43571c();
        mo43821B();
        C15267r.m44384a(conditionalUserProperty);
        C15267r.m44386a(conditionalUserProperty2.mName);
        if (!this.f47095q.mo43672t()) {
            mo43585q().f47494h.mo44160a("Conditional property not cleared since collection is disabled");
            return;
        }
        zzfv zzfv = new zzfv(conditionalUserProperty2.mName, 0, null, null);
        try {
            zzag a = mo43583o().mo43899a(conditionalUserProperty2.mAppId, conditionalUserProperty2.mExpiredEventName, conditionalUserProperty2.mExpiredEventParams, conditionalUserProperty2.mOrigin, conditionalUserProperty2.mCreationTimestamp, true, false);
            String str = conditionalUserProperty2.mAppId;
            String str2 = conditionalUserProperty2.mOrigin;
            long j = conditionalUserProperty2.mCreationTimestamp;
            boolean z = conditionalUserProperty2.mActive;
            String str3 = conditionalUserProperty2.mTriggerEventName;
            long j2 = conditionalUserProperty2.mTriggerTimeout;
            zzo zzo = r3;
            zzo zzo2 = new zzo(str, str2, zzfv, j, z, str3, null, j2, null, conditionalUserProperty2.mTimeToLive, a);
            mo43575g().mo43778a(zzo);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final List<ConditionalUserProperty> mo43724a(String str, String str2) {
        return m55602b((String) null, str, str2);
    }

    /* renamed from: a */
    public final List<ConditionalUserProperty> mo43725a(String str, String str2, String str3) {
        C15267r.m44386a(str);
        mo43566a();
        return m55602b(str, str2, str3);
    }

    /* renamed from: b */
    private final List<ConditionalUserProperty> m55602b(String str, String str2, String str3) {
        if (mo43584p().mo43648f()) {
            mo43585q().f47487a.mo44160a("Cannot get conditional user properties from analytics worker thread");
            return Collections.emptyList();
        } else if (C16928es.m56086a()) {
            mo43585q().f47487a.mo44160a("Cannot get conditional user properties from main thread");
            return Collections.emptyList();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C16820at p = this.f47095q.mo43584p();
                C16864cj cjVar = new C16864cj(this, atomicReference, str, str2, str3);
                p.mo43645a((Runnable) cjVar);
                try {
                    atomicReference.wait(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                } catch (InterruptedException e) {
                    mo43585q().f47490d.mo44162a("Interrupted waiting for get conditional user properties", str, e);
                }
            }
            List<zzo> list = (List) atomicReference.get();
            if (list == null) {
                mo43585q().f47490d.mo44161a("Timed out waiting for get conditional user properties", str);
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (zzo zzo : list) {
                ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
                conditionalUserProperty.mAppId = zzo.f47548a;
                conditionalUserProperty.mOrigin = zzo.f47549b;
                conditionalUserProperty.mCreationTimestamp = zzo.f47551d;
                conditionalUserProperty.mName = zzo.f47550c.f47522a;
                conditionalUserProperty.mValue = zzo.f47550c.mo44178a();
                conditionalUserProperty.mActive = zzo.f47552e;
                conditionalUserProperty.mTriggerEventName = zzo.f47553f;
                if (zzo.f47554g != null) {
                    conditionalUserProperty.mTimedOutEventName = zzo.f47554g.f47518a;
                    if (zzo.f47554g.f47519b != null) {
                        conditionalUserProperty.mTimedOutEventParams = zzo.f47554g.f47519b.mo44169b();
                    }
                }
                conditionalUserProperty.mTriggerTimeout = zzo.f47555h;
                if (zzo.f47556i != null) {
                    conditionalUserProperty.mTriggeredEventName = zzo.f47556i.f47518a;
                    if (zzo.f47556i.f47519b != null) {
                        conditionalUserProperty.mTriggeredEventParams = zzo.f47556i.f47519b.mo44169b();
                    }
                }
                conditionalUserProperty.mTriggeredTimestamp = zzo.f47550c.f47523b;
                conditionalUserProperty.mTimeToLive = zzo.f47557j;
                if (zzo.f47558k != null) {
                    conditionalUserProperty.mExpiredEventName = zzo.f47558k.f47518a;
                    if (zzo.f47558k.f47519b != null) {
                        conditionalUserProperty.mExpiredEventParams = zzo.f47558k.f47519b.mo44169b();
                    }
                }
                arrayList.add(conditionalUserProperty);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo43727a(String str, String str2, boolean z) {
        return m55603b((String) null, str, str2, z);
    }

    /* renamed from: a */
    public final Map<String, Object> mo43726a(String str, String str2, String str3, boolean z) {
        C15267r.m44386a(str);
        mo43566a();
        return m55603b(str, str2, str3, z);
    }

    /* renamed from: b */
    private final Map<String, Object> m55603b(String str, String str2, String str3, boolean z) {
        if (mo43584p().mo43648f()) {
            mo43585q().f47487a.mo44160a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        } else if (C16928es.m56086a()) {
            mo43585q().f47487a.mo44160a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        } else {
            AtomicReference atomicReference = new AtomicReference();
            synchronized (atomicReference) {
                C16820at p = this.f47095q.mo43584p();
                C16865ck ckVar = new C16865ck(this, atomicReference, str, str2, str3, z);
                p.mo43645a((Runnable) ckVar);
                try {
                    atomicReference.wait(DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                } catch (InterruptedException e) {
                    mo43585q().f47490d.mo44161a("Interrupted waiting for get user properties", e);
                }
            }
            List<zzfv> list = (List) atomicReference.get();
            if (list == null) {
                mo43585q().f47490d.mo44160a("Timed out waiting for get user properties");
                return Collections.emptyMap();
            }
            ArrayMap arrayMap = new ArrayMap(list.size());
            for (zzfv zzfv : list) {
                arrayMap.put(zzfv.f47522a, zzfv.mo44178a());
            }
            return arrayMap;
        }
    }

    /* renamed from: x */
    public final String mo43743x() {
        C16870cp w = this.f47095q.mo43666j().mo43770w();
        if (w != null) {
            return w.f47158a;
        }
        return null;
    }

    /* renamed from: y */
    public final String mo43744y() {
        C16870cp w = this.f47095q.mo43666j().mo43770w();
        if (w != null) {
            return w.f47159b;
        }
        return null;
    }

    /* renamed from: z */
    public final String mo43745z() {
        if (this.f47095q.f47005a != null) {
            return this.f47095q.f47005a;
        }
        try {
            return C15137e.m44037a();
        } catch (IllegalStateException e) {
            this.f47095q.mo43585q().f47487a.mo44161a("getGoogleAppId failed with exception", e);
            return null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo43566a() {
        super.mo43566a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo43569b() {
        super.mo43569b();
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43571c() {
        super.mo43571c();
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C16800a mo43572d() {
        return super.mo43572d();
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C16858cd mo43573e() {
        return super.mo43573e();
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C16947l mo43574f() {
        return super.mo43574f();
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C16875cu mo43575g() {
        return super.mo43575g();
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C16871cq mo43576h() {
        return super.mo43576h();
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ C16949n mo43577i() {
        return super.mo43577i();
    }

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ C16900ds mo43578j() {
        return super.mo43578j();
    }

    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C16827b mo43579k() {
        return super.mo43579k();
    }

    /* renamed from: l */
    public final /* bridge */ /* synthetic */ C15322e mo43580l() {
        return super.mo43580l();
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43581m() {
        return super.mo43581m();
    }

    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C16951p mo43582n() {
        return super.mo43582n();
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C16922em mo43583o() {
        return super.mo43583o();
    }

    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C16820at mo43584p() {
        return super.mo43584p();
    }

    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C16953r mo43585q() {
        return super.mo43585q();
    }

    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C16806af mo43586r() {
        return super.mo43586r();
    }

    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C16930eu mo43587s() {
        return super.mo43587s();
    }
}
