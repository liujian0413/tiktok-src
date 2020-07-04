package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.hx */
final class C16602hx extends C16599hu {
    private C16602hx() {
        super();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <L> List<L> mo42969a(Object obj, long j) {
        C16590hl c = m54224c(obj, j);
        if (c.mo42732a()) {
            return c;
        }
        int size = c.size();
        C16590hl a = c.mo42747a(size == 0 ? 10 : size << 1);
        C16657jy.m54552a(obj, j, (Object) a);
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo42971b(Object obj, long j) {
        m54224c(obj, j).mo42737b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <E> void mo42970a(Object obj, Object obj2, long j) {
        C16590hl c = m54224c(obj, j);
        C16590hl c2 = m54224c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.mo42732a()) {
                c = c.mo42747a(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C16657jy.m54552a(obj, j, (Object) c2);
    }

    /* renamed from: c */
    private static <E> C16590hl<E> m54224c(Object obj, long j) {
        return (C16590hl) C16657jy.m54575f(obj, j);
    }
}
