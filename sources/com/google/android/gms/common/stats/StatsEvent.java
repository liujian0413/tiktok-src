package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    /* renamed from: a */
    public abstract long mo38670a();

    /* renamed from: b */
    public abstract int mo38671b();

    /* renamed from: c */
    public abstract long mo38672c();

    /* renamed from: d */
    public abstract String mo38673d();

    public String toString() {
        long a = mo38670a();
        int b = mo38671b();
        long c = mo38672c();
        String d = mo38673d();
        StringBuilder sb = new StringBuilder(String.valueOf(d).length() + 53);
        sb.append(a);
        sb.append("\t");
        sb.append(b);
        sb.append("\t");
        sb.append(c);
        sb.append(d);
        return sb.toString();
    }
}
