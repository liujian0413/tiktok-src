package com.p280ss.android.ugc.aweme.commercialize.feed.preload;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.preload.c */
public final class C24739c {

    /* renamed from: a */
    public final String f65181a;

    /* renamed from: b */
    public long f65182b;

    /* renamed from: c */
    public long f65183c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24739c) {
                C24739c cVar = (C24739c) obj;
                if (C7573i.m23585a((Object) this.f65181a, (Object) cVar.f65181a)) {
                    if (this.f65182b == cVar.f65182b) {
                        if (this.f65183c == cVar.f65183c) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f65181a;
        return ((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.f65182b)) * 31) + Long.hashCode(this.f65183c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreloadAdWebStateMsg(siteId=");
        sb.append(this.f65181a);
        sb.append(", clickTime=");
        sb.append(this.f65182b);
        sb.append(", startLoadTime=");
        sb.append(this.f65183c);
        sb.append(")");
        return sb.toString();
    }
}
