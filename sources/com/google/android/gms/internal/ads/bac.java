package com.google.android.gms.internal.ads;

import java.util.Map.Entry;

final class bac implements Comparable<bac>, Entry<K, V> {

    /* renamed from: a */
    private final K f41300a;

    /* renamed from: b */
    private V f41301b;

    /* renamed from: c */
    private final /* synthetic */ azv f41302c;

    bac(azv azv, Entry<K, V> entry) {
        this(azv, (Comparable) entry.getKey(), entry.getValue());
    }

    bac(azv azv, K k, V v) {
        this.f41302c = azv;
        this.f41300a = k;
        this.f41301b = v;
    }

    public final V getValue() {
        return this.f41301b;
    }

    public final V setValue(V v) {
        this.f41302c.m48042e();
        V v2 = this.f41301b;
        this.f41301b = v;
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
        return m48066a(this.f41300a, entry.getKey()) && m48066a(this.f41301b, entry.getValue());
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = this.f41300a == null ? 0 : this.f41300a.hashCode();
        if (this.f41301b != null) {
            i = this.f41301b.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f41300a);
        String valueOf2 = String.valueOf(this.f41301b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }

    /* renamed from: a */
    private static boolean m48066a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public final /* synthetic */ Object getKey() {
        return this.f41300a;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return ((Comparable) getKey()).compareTo((Comparable) ((bac) obj).getKey());
    }
}
