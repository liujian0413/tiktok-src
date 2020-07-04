package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.hw */
final class C16601hw extends C16599hu {

    /* renamed from: a */
    private static final Class<?> f46440a = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C16601hw() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo42969a(Object obj, long j) {
        return m54219a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42971b(Object obj, long j) {
        Object obj2;
        List list = (List) C16657jy.m54575f(obj, j);
        if (list instanceof C16598ht) {
            obj2 = ((C16598ht) list).mo42966e();
        } else if (!f46440a.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C16627iv) || !(list instanceof C16590hl)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C16590hl hlVar = (C16590hl) list;
                if (hlVar.mo42732a()) {
                    hlVar.mo42737b();
                }
                return;
            }
        } else {
            return;
        }
        C16657jy.m54552a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.google.android.gms.internal.measurement.ft, java.lang.Object, com.google.android.gms.internal.measurement.hs] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m54219a(java.lang.Object r3, long r4, int r6) {
        /*
            java.util.List r0 = m54220c(r3, r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002d
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16598ht
            if (r1 == 0) goto L_0x0014
            com.google.android.gms.internal.measurement.hs r0 = new com.google.android.gms.internal.measurement.hs
            r0.<init>(r6)
            goto L_0x0029
        L_0x0014:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16627iv
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16590hl
            if (r1 == 0) goto L_0x0024
            com.google.android.gms.internal.measurement.hl r0 = (com.google.android.gms.internal.measurement.C16590hl) r0
            com.google.android.gms.internal.measurement.hl r6 = r0.mo42747a(r6)
            r0 = r6
            goto L_0x0029
        L_0x0024:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x0029:
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r3, r4, r0)
            goto L_0x007f
        L_0x002d:
            java.lang.Class<?> r1 = f46440a
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004b
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r3, r4, r1)
        L_0x0049:
            r0 = r1
            goto L_0x007f
        L_0x004b:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16654jv
            if (r1 == 0) goto L_0x0062
            com.google.android.gms.internal.measurement.hs r1 = new com.google.android.gms.internal.measurement.hs
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            com.google.android.gms.internal.measurement.jv r0 = (com.google.android.gms.internal.measurement.C16654jv) r0
            r1.addAll(r0)
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r3, r4, r1)
            goto L_0x0049
        L_0x0062:
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16627iv
            if (r1 == 0) goto L_0x007f
            boolean r1 = r0 instanceof com.google.android.gms.internal.measurement.C16590hl
            if (r1 == 0) goto L_0x007f
            r1 = r0
            com.google.android.gms.internal.measurement.hl r1 = (com.google.android.gms.internal.measurement.C16590hl) r1
            boolean r2 = r1.mo42732a()
            if (r2 != 0) goto L_0x007f
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.measurement.hl r0 = r1.mo42747a(r0)
            com.google.android.gms.internal.measurement.C16657jy.m54552a(r3, r4, r0)
        L_0x007f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C16601hw.m54219a(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo42970a(Object obj, Object obj2, long j) {
        List c = m54220c(obj2, j);
        List a = m54219a(obj, j, c.size());
        int size = a.size();
        int size2 = c.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c);
        }
        if (size > 0) {
            c = a;
        }
        C16657jy.m54552a(obj, j, (Object) c);
    }

    /* renamed from: c */
    private static <E> List<E> m54220c(Object obj, long j) {
        return (List) C16657jy.m54575f(obj, j);
    }
}
