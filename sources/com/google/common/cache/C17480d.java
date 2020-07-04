package com.google.common.cache;

import com.google.common.base.C17430i;
import com.google.common.base.C17434j;
import com.google.common.base.C17439m;

/* renamed from: com.google.common.cache.d */
public final class C17480d {

    /* renamed from: a */
    public final long f48459a = 0;

    /* renamed from: b */
    public final long f48460b = 0;

    /* renamed from: c */
    public final long f48461c = 0;

    /* renamed from: d */
    public final long f48462d = 0;

    /* renamed from: e */
    public final long f48463e = 0;

    /* renamed from: f */
    public final long f48464f = 0;

    public final int hashCode() {
        return C17434j.m57954a(Long.valueOf(this.f48459a), Long.valueOf(this.f48460b), Long.valueOf(this.f48461c), Long.valueOf(this.f48462d), Long.valueOf(this.f48463e), Long.valueOf(this.f48464f));
    }

    public final String toString() {
        return C17430i.m57944a(this).mo44922a("hitCount", this.f48459a).mo44922a("missCount", this.f48460b).mo44922a("loadSuccessCount", this.f48461c).mo44922a("loadExceptionCount", this.f48462d).mo44922a("totalLoadTime", this.f48463e).mo44922a("evictionCount", this.f48464f).toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C17480d)) {
            return false;
        }
        C17480d dVar = (C17480d) obj;
        if (this.f48459a == dVar.f48459a && this.f48460b == dVar.f48460b && this.f48461c == dVar.f48461c && this.f48462d == dVar.f48462d && this.f48463e == dVar.f48463e && this.f48464f == dVar.f48464f) {
            return true;
        }
        return false;
    }

    public C17480d(long j, long j2, long j3, long j4, long j5, long j6) {
        C17439m.m57968a(true);
        C17439m.m57968a(true);
        C17439m.m57968a(true);
        C17439m.m57968a(true);
        C17439m.m57968a(true);
        C17439m.m57968a(true);
    }
}
