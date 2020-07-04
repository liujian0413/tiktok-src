package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

final class ayn extends ayl {

    /* renamed from: a */
    private static final Class<?> f41233a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private ayn() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo40323a(Object obj, long j) {
        return m47780a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo40325b(Object obj, long j) {
        Object obj2;
        List list = (List) baq.m48164f(obj, j);
        if (list instanceof ayk) {
            obj2 = ((ayk) list).mo40320e();
        } else if (!f41233a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof azn) || !(list instanceof ayc)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                ayc ayc = (ayc) list;
                if (ayc.mo40090a()) {
                    ayc.mo40095b();
                }
                return;
            }
        } else {
            return;
        }
        baq.m48141a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.gms.internal.ads.awf, com.google.android.gms.internal.ads.ayj, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m47780a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m47781c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ayk
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.ads.ayj r0 = new com.google.android.gms.internal.ads.ayj
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.azn
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ayc
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.ads.ayc r0 = (com.google.android.gms.internal.ads.ayc) r0
            com.google.android.gms.internal.ads.ayc r6 = r0.mo40105a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.ads.baq.m48141a(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f41233a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.ads.baq.m48141a(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ban
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.ads.ayj r1 = new com.google.android.gms.internal.ads.ayj
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.ads.ban r0 = (com.google.android.gms.internal.ads.ban) r0
            r1.addAll(r0)
            com.google.android.gms.internal.ads.baq.m48141a(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.azn
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ayc
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.ads.ayc r1 = (com.google.android.gms.internal.ads.ayc) r1
            boolean r2 = r1.mo40090a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.ayc r0 = r1.mo40105a(r0)
            com.google.android.gms.internal.ads.baq.m48141a(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ayn.m47780a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo40324a(Object obj, Object obj2, long j) {
        List c = m47781c(obj2, j);
        List a = m47780a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        baq.m48141a(obj, j, (Object) c);
    }

    /* renamed from: c */
    private static <E> List<E> m47781c(Object obj, long j) {
        return (List) baq.m48164f(obj, j);
    }
}
