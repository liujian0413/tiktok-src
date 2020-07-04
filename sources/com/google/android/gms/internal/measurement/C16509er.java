package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.er */
public final class C16509er {

    /* renamed from: a */
    public final C16505en f46265a;

    /* renamed from: b */
    private final Map<String, C16505en> f46266b;

    /* renamed from: a */
    public final void mo42703a(String str, C16505en enVar) {
        this.f46266b.put(str, enVar);
    }

    /* renamed from: a */
    public final Map<String, C16505en> mo42702a() {
        return Collections.unmodifiableMap(this.f46266b);
    }

    public final String toString() {
        String valueOf = String.valueOf(Collections.unmodifiableMap(this.f46266b));
        String valueOf2 = String.valueOf(this.f46265a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("Properties: ");
        sb.append(valueOf);
        sb.append(" pushAfterEvaluate: ");
        sb.append(valueOf2);
        return sb.toString();
    }
}
