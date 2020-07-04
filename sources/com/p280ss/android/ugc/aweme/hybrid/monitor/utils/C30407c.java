package com.p280ss.android.ugc.aweme.hybrid.monitor.utils;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.utils.c */
public final class C30407c {

    /* renamed from: a */
    public final String f79909a;

    /* renamed from: b */
    public final long f79910b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C30407c) {
                C30407c cVar = (C30407c) obj;
                if (C7573i.m23585a((Object) this.f79909a, (Object) cVar.f79909a)) {
                    if (this.f79910b == cVar.f79910b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f79909a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        long j = this.f79910b;
        return hashCode + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntervalMetric(intervalName=");
        sb.append(this.f79909a);
        sb.append(", interval=");
        sb.append(this.f79910b);
        sb.append(")");
        return sb.toString();
    }

    public C30407c(String str, long j) {
        C7573i.m23587b(str, "intervalName");
        this.f79909a = str;
        this.f79910b = j;
    }
}
