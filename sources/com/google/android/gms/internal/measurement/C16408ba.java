package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p746a.C15010a;

/* renamed from: com.google.android.gms.internal.measurement.ba */
public final class C16408ba<V> {

    /* renamed from: a */
    public final V f45945a;

    /* renamed from: b */
    private final C15010a<V> f45946b;

    private C16408ba(C15010a<V> aVar, V v) {
        C15267r.m44384a(aVar);
        this.f45946b = aVar;
        this.f45945a = v;
    }

    /* renamed from: a */
    static C16408ba<Boolean> m53468a(String str, boolean z, boolean z2) {
        return new C16408ba<>(C15010a.m43544a(str, z2), Boolean.valueOf(z));
    }

    /* renamed from: a */
    static C16408ba<String> m53467a(String str, String str2, String str3) {
        return new C16408ba<>(C15010a.m43543a(str, str3), str2);
    }

    /* renamed from: a */
    static C16408ba<Long> m53466a(String str, long j, long j2) {
        return new C16408ba<>(C15010a.m43542a(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    /* renamed from: a */
    static C16408ba<Integer> m53465a(String str, int i, int i2) {
        return new C16408ba<>(C15010a.m43541a(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    /* renamed from: a */
    static C16408ba<Float> m53464a(String str, float f, float f2) {
        return new C16408ba<>(C15010a.m43540a(str, Float.valueOf(0.5f)), Float.valueOf(0.5f));
    }
}
