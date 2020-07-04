package com.p280ss.android.ugc.effectmanager.effect.p1733c;

import android.os.Handler;
import android.os.Message;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43743j;
import com.p280ss.android.ugc.effectmanager.common.C43743j.C43744a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43724a;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43751a;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43762l;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43763m;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43785b;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43786c;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43790g;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43793j;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43795l;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43797n;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43800a;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43821p;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43825t;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;

/* renamed from: com.ss.android.ugc.effectmanager.effect.c.a */
public final class C43772a implements C43744a {

    /* renamed from: a */
    public C43773a f113250a;

    /* renamed from: b */
    private C43680a f113251b;

    /* renamed from: c */
    private C43834g f113252c = this.f113251b.f113068a;

    /* renamed from: d */
    private Handler f113253d = new C43743j(this);

    /* renamed from: com.ss.android.ugc.effectmanager.effect.c.a$a */
    public interface C43773a {
        /* renamed from: a */
        void mo105813a(String str, EffectChannelResponse effectChannelResponse, int i, C43726c cVar);
    }

    public C43772a(C43680a aVar) {
        this.f113251b = aVar;
    }

    /* renamed from: a */
    public final void mo105789a(Message message) {
        if (this.f113250a != null) {
            if (message.what == 14 && (message.obj instanceof C43785b)) {
                C43785b bVar = (C43785b) message.obj;
                C43726c cVar = bVar.f113287c;
                if (cVar == null) {
                    this.f113250a.mo105813a(bVar.f113219a, bVar.f113286b, 23, null);
                } else {
                    this.f113250a.mo105813a(bVar.f113219a, bVar.f113286b, 27, cVar);
                }
            }
            if (message.what == 22 && (message.obj instanceof C43793j)) {
                C43793j jVar = (C43793j) message.obj;
                C43762l a = this.f113252c.f113508B.mo106029a(jVar.f113219a);
                C43726c cVar2 = jVar.f113306c;
                if (cVar2 == null) {
                    a.mo70698a(jVar.f113305b);
                } else {
                    a.mo70697a(cVar2);
                }
            }
            if (message.what == 18 && (message.obj instanceof C43795l)) {
                C43795l lVar = (C43795l) message.obj;
                C43726c cVar3 = lVar.f113310c;
                C43763m p = this.f113252c.f113508B.mo106059p(lVar.f113219a);
                if (p != null) {
                    if (cVar3 == null) {
                        p.mo100796a(lVar.f113309b);
                    } else {
                        p.mo100795a(lVar.f113310c);
                    }
                }
            }
            if (message.what == 21 && (message.obj instanceof C43790g)) {
                C43790g gVar = (C43790g) message.obj;
                C43726c cVar4 = gVar.f113300c;
                C43756f b = this.f113252c.f113508B.mo106045b(gVar.f113219a);
                if (b != null) {
                    if (cVar4 == null) {
                        b.mo70687a(gVar.f113299b);
                    } else {
                        b.mo70686a(cVar4);
                    }
                }
            }
            if (message.what == 13 && (message.obj instanceof C43786c)) {
                C43786c cVar5 = (C43786c) message.obj;
                C43726c cVar6 = cVar5.f113289c;
                C43751a f = this.f113252c.f113508B.mo106049f(cVar5.f113219a);
                if (f != null) {
                    if (cVar6 == null) {
                        f.mo9277a(cVar5.f113288b);
                    } else {
                        f.mo9276a(cVar6);
                    }
                }
            }
            if (message.what == 25 && (message.obj instanceof C43797n)) {
                this.f113252c.f113508B.mo106050g(((C43797n) message.obj).f113219a);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [com.ss.android.ugc.effectmanager.common.d.a] */
    /* JADX WARNING: type inference failed for: r9v2, types: [com.ss.android.ugc.effectmanager.effect.e.b.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105811a(java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            if (r9 == 0) goto L_0x0010
            com.ss.android.ugc.effectmanager.effect.e.b.j r9 = new com.ss.android.ugc.effectmanager.effect.e.b.j
            com.ss.android.ugc.effectmanager.a.a r1 = r6.f113251b
            android.os.Handler r4 = r6.f113253d
            r5 = 0
            r0 = r9
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x0019
        L_0x0010:
            com.ss.android.ugc.effectmanager.effect.e.b.k r9 = new com.ss.android.ugc.effectmanager.effect.e.b.k
            com.ss.android.ugc.effectmanager.a.a r0 = r6.f113251b
            android.os.Handler r1 = r6.f113253d
            r9.<init>(r0, r7, r8, r1)
        L_0x0019:
            com.ss.android.ugc.effectmanager.g r7 = r6.f113252c
            com.ss.android.ugc.effectmanager.common.i r7 = r7.f113527r
            r7.mo105782a(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.effect.p1733c.C43772a.mo105811a(java.lang.String, java.lang.String, boolean):void");
    }

    /* renamed from: a */
    public final void mo105807a(String str, int i, int i2, String str2) {
        C43821p pVar = new C43821p(this.f113251b, str2, str, i, i2, this.f113253d);
        this.f113252c.f113527r.mo105782a((C43724a) pVar);
    }

    /* renamed from: a */
    public final void mo105809a(String str, String str2, int i, String str3) {
        C43800a aVar = new C43800a(this.f113251b, str3, this.f113253d, str, str2, i);
        this.f113252c.f113527r.mo105782a((C43724a) aVar);
    }

    /* renamed from: a */
    public final void mo105808a(String str, String str2, int i, int i2, String str3) {
        C43825t tVar = new C43825t(this.f113251b, str3, str, str2, i, i2, this.f113253d);
        this.f113252c.f113527r.mo105782a((C43724a) tVar);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.ss.android.ugc.effectmanager.common.d.a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105810a(java.lang.String r23, java.lang.String r24, java.lang.String r25, int r26, int r27, int r28, java.lang.String r29, boolean r30) {
        /*
            r22 = this;
            r0 = r22
            if (r30 == 0) goto L_0x001d
            com.ss.android.ugc.effectmanager.effect.e.b.h r11 = new com.ss.android.ugc.effectmanager.effect.e.b.h
            com.ss.android.ugc.effectmanager.a.a r2 = r0.f113251b
            android.os.Handler r10 = r0.f113253d
            r1 = r11
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r9 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0038
        L_0x001d:
            com.ss.android.ugc.effectmanager.effect.e.b.i r1 = new com.ss.android.ugc.effectmanager.effect.e.b.i
            com.ss.android.ugc.effectmanager.a.a r13 = r0.f113251b
            android.os.Handler r2 = r0.f113253d
            r12 = r1
            r14 = r23
            r15 = r24
            r16 = r25
            r17 = r26
            r18 = r27
            r19 = r28
            r20 = r29
            r21 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r11 = r1
        L_0x0038:
            com.ss.android.ugc.effectmanager.g r1 = r0.f113252c
            com.ss.android.ugc.effectmanager.common.i r1 = r1.f113527r
            r1.mo105782a(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.effect.p1733c.C43772a.mo105810a(java.lang.String, java.lang.String, java.lang.String, int, int, int, java.lang.String, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.ss.android.ugc.effectmanager.effect.e.b.n] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105812a(java.lang.String r14, java.lang.String r15, boolean r16, java.lang.String r17, int r18, int r19, boolean r20, com.p280ss.android.ugc.effectmanager.effect.p1732b.C43762l r21) {
        /*
            r13 = this;
            r0 = r13
            if (r20 == 0) goto L_0x000f
            com.ss.android.ugc.effectmanager.effect.e.b.n r1 = new com.ss.android.ugc.effectmanager.effect.e.b.n
            com.ss.android.ugc.effectmanager.a.a r2 = r0.f113251b
            android.os.Handler r3 = r0.f113253d
            r6 = r14
            r7 = r15
            r1.<init>(r2, r14, r15, r3)
            goto L_0x0023
        L_0x000f:
            r6 = r14
            r7 = r15
            com.ss.android.ugc.effectmanager.effect.e.b.o r1 = new com.ss.android.ugc.effectmanager.effect.e.b.o
            com.ss.android.ugc.effectmanager.a.a r5 = r0.f113251b
            android.os.Handler r12 = r0.f113253d
            r4 = r1
            r8 = r16
            r9 = r17
            r10 = r18
            r11 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0023:
            com.ss.android.ugc.effectmanager.g r2 = r0.f113252c
            com.ss.android.ugc.effectmanager.common.i r2 = r2.f113527r
            r2.mo105782a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.effect.p1733c.C43772a.mo105812a(java.lang.String, java.lang.String, boolean, java.lang.String, int, int, boolean, com.ss.android.ugc.effectmanager.effect.b.l):void");
    }
}
