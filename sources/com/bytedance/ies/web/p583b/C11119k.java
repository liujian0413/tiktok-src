package com.bytedance.ies.web.p583b;

import com.bytedance.ies.web.jsbridge2.C11152c.C11154b;
import com.bytedance.ies.web.jsbridge2.C11174p;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.bytedance.ies.web.b.k */
public final class C11119k {

    /* renamed from: b */
    public static final C11121a f30196b = new C11121a(null);

    /* renamed from: a */
    public final C11130o f30197a;

    /* renamed from: c */
    private final C11105a f30198c;

    /* renamed from: d */
    private final Map<String, C7561a<Boolean>> f30199d;

    /* renamed from: com.bytedance.ies.web.b.k$a */
    static final class C11121a {
        private C11121a() {
        }

        public /* synthetic */ C11121a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.web.b.k$b */
    static final class C11122b implements C11154b {

        /* renamed from: a */
        final /* synthetic */ C11119k f30201a;

        C11122b(C11119k kVar) {
            this.f30201a = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C11125m mo11646a() {
            return new C11125m(this.f30201a);
        }
    }

    /* renamed from: a */
    public final C11126n mo27104a(C11136p pVar) {
        C7573i.m23587b(pVar, "request");
        return this.f30197a.mo27110a(pVar);
    }

    /* renamed from: a */
    public final C11174p mo27105a(C11174p pVar) {
        if (pVar != null) {
            return pVar.mo27203a("__prefetch", (C11154b) new C11122b(this));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0093, code lost:
        r1 = new java.lang.StringBuilder("Condition ");
        r1.append(r3);
        r1.append(" returned false, skipping this page.");
        com.bytedance.ies.web.p583b.C11115h.m32554a(r1.toString());
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo27106a(java.lang.String r7, com.bytedance.ies.web.jsbridge2.C11174p r8) {
        /*
            r6 = this;
            java.lang.String r0 = "pageUrl"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Start prefetch, page url: "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.ies.web.p583b.C11115h.m32554a(r0)
            android.net.Uri r0 = android.net.Uri.parse(r7)
            java.lang.String r1 = "uri"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.net.Uri r1 = com.bytedance.ies.web.p583b.C11145u.m32623a(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "uri.toBasicUri().toString()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            java.util.SortedMap r0 = com.bytedance.ies.web.p583b.C11145u.m32627b(r0)
            com.bytedance.ies.web.b.a r2 = r6.f30198c
            java.util.List r1 = r2.mo27076a(r1)
            if (r1 != 0) goto L_0x0053
            com.bytedance.ies.web.b.h r8 = com.bytedance.ies.web.p583b.C11115h.f30191a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No config found for page "
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r7 = ", skipping..."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r0 = 2
            r1 = 0
            com.bytedance.ies.web.p583b.C11115h.m32555a(r7, null)
            return
        L_0x0053:
            com.bytedance.ies.web.b.o r7 = r6.f30197a
            r7.mo27114b()
            java.util.Iterator r7 = r1.iterator()
        L_0x005c:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x00b0
            java.lang.Object r1 = r7.next()
            com.bytedance.ies.web.b.q r1 = (com.bytedance.ies.web.p583b.C11141q) r1
            java.util.List r2 = r1.mo27127c()
            java.util.Iterator r2 = r2.iterator()
        L_0x0070:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00aa
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.Map<java.lang.String, kotlin.jvm.a.a<java.lang.Boolean>> r4 = r6.f30199d
            java.lang.Object r4 = r4.get(r3)
            kotlin.jvm.a.a r4 = (kotlin.jvm.p357a.C7561a) r4
            if (r4 == 0) goto L_0x0093
            java.lang.Object r4 = r4.invoke()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 1
            if (r4 == r5) goto L_0x0070
        L_0x0093:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Condition "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = " returned false, skipping this page."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.ies.web.p583b.C11115h.m32554a(r1)
            goto L_0x005c
        L_0x00aa:
            com.bytedance.ies.web.b.o r2 = r6.f30197a
            r2.mo27113a(r0, r1)
            goto L_0x005c
        L_0x00b0:
            r6.mo27105a(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.web.p583b.C11119k.mo27106a(java.lang.String, com.bytedance.ies.web.jsbridge2.p):void");
    }

    public C11119k(C11130o oVar, C11105a aVar, Map<String, ? extends C7561a<Boolean>> map) {
        C7573i.m23587b(oVar, "processManager");
        C7573i.m23587b(aVar, "configManager");
        C7573i.m23587b(map, "conditionMap");
        this.f30197a = oVar;
        this.f30198c = aVar;
        this.f30199d = map;
        this.f30198c.mo27077a((C7561a<C7581n>) new C7561a<C7581n>(this) {

            /* renamed from: a */
            final /* synthetic */ C11119k f30200a;

            {
                this.f30200a = r1;
            }

            /* renamed from: a */
            private void m32567a() {
                this.f30200a.f30197a.mo27111a();
            }

            public final /* synthetic */ Object invoke() {
                m32567a();
                return C7581n.f20898a;
            }
        });
    }
}
