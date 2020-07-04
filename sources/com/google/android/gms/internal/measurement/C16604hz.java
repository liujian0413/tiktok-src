package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16579hf.C16584e;

/* renamed from: com.google.android.gms.internal.measurement.hz */
final class C16604hz implements C16634jb {

    /* renamed from: b */
    private static final C16614ii f46444b = new C16606ia();

    /* renamed from: a */
    private final C16614ii f46445a;

    public C16604hz() {
        this(new C16607ib(C16578he.m54144a(), m54234a()));
    }

    private C16604hz(C16614ii iiVar) {
        this.f46445a = (C16614ii) C16586hh.m54188a(iiVar, "messageInfoFactory");
    }

    /* renamed from: a */
    public final <T> C16633ja<T> mo42977a(Class<T> cls) {
        C16635jc.m54416a(cls);
        C16613ih b = this.f46445a.mo42927b(cls);
        if (b.mo42988b()) {
            if (C16579hf.class.isAssignableFrom(cls)) {
                return C16621ip.m54323a(C16635jc.m54428c(), C16569gw.m54106a(), b.mo42989c());
            }
            return C16621ip.m54323a(C16635jc.m54406a(), C16569gw.m54107b(), b.mo42989c());
        } else if (C16579hf.class.isAssignableFrom(cls)) {
            if (m54235a(b)) {
                return C16619in.m54283a(cls, b, C16625it.m54337b(), C16599hu.m54215b(), C16635jc.m54428c(), C16569gw.m54106a(), C16612ig.m54261b());
            }
            return C16619in.m54283a(cls, b, C16625it.m54337b(), C16599hu.m54215b(), C16635jc.m54428c(), null, C16612ig.m54261b());
        } else if (m54235a(b)) {
            return C16619in.m54283a(cls, b, C16625it.m54336a(), C16599hu.m54214a(), C16635jc.m54406a(), C16569gw.m54107b(), C16612ig.m54260a());
        } else {
            return C16619in.m54283a(cls, b, C16625it.m54336a(), C16599hu.m54214a(), C16635jc.m54422b(), null, C16612ig.m54260a());
        }
    }

    /* renamed from: a */
    private static boolean m54235a(C16613ih ihVar) {
        return ihVar.mo42987a() == C16584e.f46414h;
    }

    /* renamed from: a */
    private static C16614ii m54234a() {
        try {
            return (C16614ii) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return f46444b;
        }
    }
}
