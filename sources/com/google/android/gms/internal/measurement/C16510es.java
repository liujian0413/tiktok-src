package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.es */
public final class C16510es {

    /* renamed from: a */
    public final List<C16509er> f46267a;

    /* renamed from: b */
    public final List<C16509er> f46268b;

    /* renamed from: c */
    public final List<C16509er> f46269c;

    /* renamed from: d */
    public final List<C16509er> f46270d;

    /* renamed from: e */
    public final List<C16509er> f46271e;

    /* renamed from: f */
    public final List<C16509er> f46272f;

    public final String toString() {
        String valueOf = String.valueOf(this.f46267a);
        String valueOf2 = String.valueOf(this.f46268b);
        String valueOf3 = String.valueOf(this.f46269c);
        String valueOf4 = String.valueOf(this.f46270d);
        String valueOf5 = String.valueOf(this.f46271e);
        String valueOf6 = String.valueOf(this.f46272f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 102 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length() + String.valueOf(valueOf5).length() + String.valueOf(valueOf6).length());
        sb.append("Positive predicates: ");
        sb.append(valueOf);
        sb.append("  Negative predicates: ");
        sb.append(valueOf2);
        sb.append("  Add tags: ");
        sb.append(valueOf3);
        sb.append("  Remove tags: ");
        sb.append(valueOf4);
        sb.append("  Add macros: ");
        sb.append(valueOf5);
        sb.append("  Remove macros: ");
        sb.append(valueOf6);
        return sb.toString();
    }
}
