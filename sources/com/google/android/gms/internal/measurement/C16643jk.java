package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

/* renamed from: com.google.android.gms.internal.measurement.jk */
final class C16643jk implements Comparable<C16643jk>, Entry<K, V> {

    /* renamed from: a */
    private final K f46511a;

    /* renamed from: b */
    private V f46512b;

    /* renamed from: c */
    private final /* synthetic */ C16636jd f46513c;

    C16643jk(C16636jd jdVar, Entry<K, V> entry) {
        this(jdVar, (Comparable) entry.getKey(), entry.getValue());
    }

    C16643jk(C16636jd jdVar, K k, V v) {
        this.f46513c = jdVar;
        this.f46511a = k;
        this.f46512b = v;
    }

    public final V getValue() {
        return this.f46512b;
    }

    public final V setValue(V v) {
        this.f46513c.m54465e();
        V v2 = this.f46512b;
        this.f46512b = v;
        return v2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Entry)) {
            return false;
        }
        Entry entry = (Entry) obj;
        return m54477a(this.f46511a, entry.getKey()) && m54477a(this.f46512b, entry.getValue());
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f46511a == null ? 0 : this.f46511a.hashCode();
        if (this.f46512b != null) {
            i = this.f46512b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f46511a);
        String valueOf2 = String.valueOf(this.f46512b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m54477a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.f46511a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((C16643jk) obj).getKey());
    }
}
