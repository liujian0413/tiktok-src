package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ib */
final class C16607ib implements C16614ii {

    /* renamed from: a */
    private C16614ii[] f46449a;

    C16607ib(C16614ii... iiVarArr) {
        this.f46449a = iiVarArr;
    }

    /* renamed from: a */
    public final boolean mo42926a(Class<?> cls) {
        for (C16614ii a : this.f46449a) {
            if (a.mo42926a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final C16613ih mo42927b(Class<?> cls) {
        C16614ii[] iiVarArr;
        for (C16614ii iiVar : this.f46449a) {
            if (iiVar.mo42926a(cls)) {
                return iiVar.mo42927b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
