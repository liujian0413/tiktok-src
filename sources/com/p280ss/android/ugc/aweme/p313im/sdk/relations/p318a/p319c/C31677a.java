package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p319c;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.c.a */
public final class C31677a {

    /* renamed from: a */
    public final long f82892a;

    /* renamed from: b */
    public final int f82893b;

    /* renamed from: c */
    public final String f82894c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31677a) {
                C31677a aVar = (C31677a) obj;
                if (this.f82892a == aVar.f82892a) {
                    if (!(this.f82893b == aVar.f82893b) || !C7573i.m23585a((Object) this.f82894c, (Object) aVar.f82894c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f82892a;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.f82893b) * 31;
        String str = this.f82894c;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadMoreMonitorInfo(maxTime=");
        sb.append(this.f82892a);
        sb.append(", size=");
        sb.append(this.f82893b);
        sb.append(", logId=");
        sb.append(this.f82894c);
        sb.append(")");
        return sb.toString();
    }

    public C31677a(long j, int i, String str) {
        this.f82892a = j;
        this.f82893b = i;
        this.f82894c = str;
    }
}
