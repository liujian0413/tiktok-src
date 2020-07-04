package com.p280ss.android.ugc.aweme.feed.helper;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.d */
public final class C28416d {

    /* renamed from: a */
    public final int f74926a;

    /* renamed from: b */
    public final long f74927b;

    /* renamed from: c */
    public final long f74928c;

    /* renamed from: d */
    public final String f74929d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28416d) {
                C28416d dVar = (C28416d) obj;
                if (this.f74926a == dVar.f74926a) {
                    if (this.f74927b == dVar.f74927b) {
                        if (!(this.f74928c == dVar.f74928c) || !C7573i.m23585a((Object) this.f74929d, (Object) dVar.f74929d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f74926a * 31;
        long j = this.f74927b;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f74928c;
        int i3 = (i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        String str = this.f74929d;
        return i3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeedCoverReportEvent(imageSize=");
        sb.append(this.f74926a);
        sb.append(", downLoadTime=");
        sb.append(this.f74927b);
        sb.append(", imageLoadDuration=");
        sb.append(this.f74928c);
        sb.append(", processorModel=");
        sb.append(this.f74929d);
        sb.append(")");
        return sb.toString();
    }

    public C28416d(int i, long j, long j2, String str) {
        this.f74926a = i;
        this.f74927b = j;
        this.f74928c = j2;
        this.f74929d = str;
    }
}
