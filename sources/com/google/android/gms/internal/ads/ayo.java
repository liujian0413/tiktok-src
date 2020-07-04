package com.google.android.gms.internal.ads;

import java.util.List;

final class ayo extends ayl {
    private ayo() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo40323a(Object obj, long j) {
        ayc c = m47785c(obj, j);
        if (c.mo40090a()) {
            return c;
        }
        int size = c.size();
        ayc a = c.mo40105a(size == 0 ? 10 : size << 1);
        baq.m48141a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo40325b(Object obj, long j) {
        m47785c(obj, j).mo40095b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo40324a(Object obj, Object obj2, long j) {
        ayc c = m47785c(obj, j);
        ayc c2 = m47785c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo40090a()) {
                c = c.mo40105a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        baq.m48141a(obj, j, (Object) c2);
    }

    /* renamed from: c */
    private static <E> ayc<E> m47785c(Object obj, long j) {
        return (ayc) baq.m48164f(obj, j);
    }
}
