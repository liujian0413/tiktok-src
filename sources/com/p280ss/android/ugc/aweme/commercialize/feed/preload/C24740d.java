package com.p280ss.android.ugc.aweme.commercialize.feed.preload;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.preload.d */
public final class C24740d {

    /* renamed from: a */
    public long f65184a;

    /* renamed from: b */
    public int f65185b;

    /* renamed from: c */
    public final String f65186c;

    /* renamed from: d */
    public final long f65187d;

    /* renamed from: e */
    public final String f65188e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24740d) {
                C24740d dVar = (C24740d) obj;
                if (C7573i.m23585a((Object) this.f65186c, (Object) dVar.f65186c)) {
                    if (!(this.f65187d == dVar.f65187d) || !C7573i.m23585a((Object) this.f65188e, (Object) dVar.f65188e)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f65186c;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.f65187d)) * 31;
        String str2 = this.f65188e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadDownloadMsg(siteId=");
        sb.append(this.f65186c);
        sb.append(", creativeId=");
        sb.append(this.f65187d);
        sb.append(", logExtra=");
        sb.append(this.f65188e);
        sb.append(")");
        return sb.toString();
    }

    public C24740d(String str, long j, String str2) {
        C7573i.m23587b(str, "siteId");
        this.f65186c = str;
        this.f65187d = j;
        this.f65188e = str2;
        this.f65185b = -1;
    }

    public /* synthetic */ C24740d(String str, long j, String str2, int i, C7571f fVar) {
        this(str, 0, "");
    }
}
