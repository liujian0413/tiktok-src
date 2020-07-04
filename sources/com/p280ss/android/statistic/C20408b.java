package com.p280ss.android.statistic;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.statistic.b */
public final class C20408b {

    /* renamed from: a */
    public String f55137a;

    /* renamed from: b */
    public int f55138b;

    /* renamed from: c */
    public Map<String, Object> f55139c;

    /* renamed from: a */
    public final boolean mo54947a() {
        if (C20403a.f55117e == (this.f55138b & C20403a.f55117e)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo54948b() {
        if (C20403a.f55120h == (this.f55138b & C20403a.f55120h)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo54949c() {
        if (C20403a.f55121i == (this.f55138b & C20403a.f55121i)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo54950d() {
        if (C20403a.f55119g == (this.f55138b & C20403a.f55119g)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo54951e() {
        if (C20403a.f55118f == (this.f55138b & C20403a.f55118f)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = "";
        if (this.f55139c != null) {
            for (Entry entry : this.f55139c.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("[key:");
                sb.append(entry.getKey());
                sb.append(" value: ");
                sb.append(entry.getValue());
                sb.append("]");
                str = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder("event: ");
        sb2.append(this.f55137a);
        sb2.append(" send channels: ");
        sb2.append(this.f55138b);
        sb2.append(" info: ");
        sb2.append(str);
        return sb2.toString();
    }

    public C20408b(String str, Map<String, Object> map, int i) {
        this.f55137a = str;
        this.f55139c = map;
        this.f55138b = i;
    }
}
